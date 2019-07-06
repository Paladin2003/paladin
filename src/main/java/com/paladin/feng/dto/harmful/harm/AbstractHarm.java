package com.paladin.feng.dto.harmful.harm;

import com.paladin.feng.dto.aggressive.Aggressive;
import com.paladin.feng.dto.damageable.Damageable;

public abstract class AbstractHarm {

	protected String harmType;
	
	protected String harmSource;
	
	public abstract void calcHarm(Damageable dmgObj);
	
	public abstract AbstractHarm harmAddition(AbstractHarm harm);
	
	public abstract void setHarmSource(Aggressive aggObj);
}
