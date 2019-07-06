package com.paladin.feng.dto.harmful;

import com.paladin.feng.dto.harmful.harm.AbstractHarm;
import com.paladin.feng.dto.harmful.harm.Puncture;

public class Sword implements Harmful{

	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public AbstractHarm getHarm() {
		AbstractHarm  harm = new Puncture();
		return null;
	}

	@Override
	public AbstractHarm calcHarm(AbstractHarm harm) {
		return null;
	}
}
