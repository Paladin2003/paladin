package com.paladin.feng.interceptor;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("commonLogAspect")
public class CommonLogAspect {

	private Logger tracer = Logger.getLogger(CommonLogAspect.class);

	@Around(value="execution(public * com.paladin.feng.controller.*.*(..))"
			+ "|| execution(public * com.paladin.feng.service.*.*(..))"
			+ "|| execution(public * com.paladin.feng.dao.*.*(..))")
	public Object aroundLogForMethodWithoutReturning(ProceedingJoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getDeclaringTypeName();
		tracer = Logger.getLogger(joinPoint.getTarget().getClass());
		tracer.info("["+methodName + "]:====开始进入=====参数信息："+Arrays.deepToString(joinPoint.getArgs()));
		Object result = null;
		try {
			result = joinPoint.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
			tracer.error("["+methodName + "]:====执行异常=====异常信息："+e.getMessage());
		}
		tracer.info("["+methodName + "]:====完成退出=====返回信息:"+result);
		return result;
	}
	
	/*
	 * @AfterReturning(
	 * value="execution(public java.lang.Object com.paladin.feng.controller.*.*(..))"
	 * + "|| execution(public java.lang.Object com.paladin.feng.service.*.*(..))" +
	 * "|| execution(public java.lang.Object com.paladin.feng.dao.*.*(..))"
	 * ,returning = "result") public void AfterLogForMethodWithReturning(JoinPoint
	 * joinPoint,Object result) { String methodName =
	 * joinPoint.getSignature().getName(); tracer =
	 * Logger.getLogger(joinPoint.getTarget().getClass());
	 * tracer.info("["+methodName + "]:====完成退出=====,返回信息："+result); }
	 * 
	 * @Before(value="execution(public Object com.paladin.feng.controller.*.*(..))"
	 * + "|| execution(public Object com.paladin.feng.service.*.*(..))" +
	 * "|| execution(public Object com.paladin.feng.dao.*.*(..))") public void
	 * BeforeLogForMethodWithReturning(JoinPoint joinPoint) { String methodName =
	 * joinPoint.getSignature().getName(); tracer =
	 * Logger.getLogger(joinPoint.getTarget().getClass());
	 * tracer.info("["+methodName + "]:====开始进入====="); }
	 */
}
