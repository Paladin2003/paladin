package com.paladin.feng.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseDao extends SqlSessionDaoSupport{

	/*@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;*/
	
	protected Object selectOne(String sql, Map<String,Object> param){
		return getSqlSession().selectOne(sql, param);
	}
	
	protected void update(String sql, Map<String,Object> param) {
		getSqlSession().update(sql, param);
	}
	
	@Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
	    super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	
}
