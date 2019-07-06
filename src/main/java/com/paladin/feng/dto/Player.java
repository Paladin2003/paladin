package com.paladin.feng.dto;

import java.util.List;

import com.paladin.feng.dto.aggressive.Aggressive;
import com.paladin.feng.dto.damageable.Damageable;
import com.paladin.feng.dto.harmful.Harmful;
import com.paladin.feng.dto.harmful.harm.AbstractHarm;

public class Player implements Aggressive,Damageable{

	private String name;
	
	private Harmful harmfulSelf;
	
	private List<Harmful> harmfulOther;
	
	public Player() {
		super();
	}
	public Player(String name) {
		this();
		this.name = name;
	}

	@Override
	public void attack(Damageable damageObj) {
		AbstractHarm harm = this.harmfulSelf.getHarm();
		
//		System.out.println(this.name +"使用【"+this.harmful+"】攻击了"+damageObj);
	}
	@Override
	public void getDefense() {
		// TODO Auto-generated method stub
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Harmful getHarmfulSelf() {
		return harmfulSelf;
	}
	public void setHarmfulSelf(Harmful harmfulSelf) {
		this.harmfulSelf = harmfulSelf;
	}
	public List<Harmful> getHarmfulOther() {
		return harmfulOther;
	}
	public void setHarmfulOther(List<Harmful> harmfulOther) {
		this.harmfulOther = harmfulOther;
	}
}
