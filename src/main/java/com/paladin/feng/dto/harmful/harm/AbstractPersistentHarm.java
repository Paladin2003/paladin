package com.paladin.feng.dto.harmful.harm;

/**
 * 持续性伤害
 * @author palad
 *
 */
public abstract class AbstractPersistentHarm extends AbstractHarm{

	/**持续时间**/
	protected Long presistentTime = 3L;
	
	/**
	 * 频率
	 */
	protected Double frequency = 0.5;
	
	/**
	 * 周期性伤害值
	 */
	protected Double harmPreFrequency = 0.0;
}
