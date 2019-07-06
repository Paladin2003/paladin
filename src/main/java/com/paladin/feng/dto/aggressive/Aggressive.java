package com.paladin.feng.dto.aggressive;

import com.paladin.feng.dto.damageable.Damageable;

/**
 * 有攻击性的
 * */
public interface Aggressive {
	
	/**
	 * 攻击
	 * @param damageObj
	 */
	void attack(Damageable damageObj);

}
