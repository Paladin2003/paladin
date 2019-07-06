package com.paladin.feng.dto.harmful;

import com.paladin.feng.dto.harmful.harm.AbstractHarm;

/**
 * 有伤害性的
 * @author palad
 *
 */
public interface Harmful {

	AbstractHarm getHarm();
	
	AbstractHarm calcHarm(AbstractHarm harm);
}
