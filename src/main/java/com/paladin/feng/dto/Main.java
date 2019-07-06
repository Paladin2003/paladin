package com.paladin.feng.dto;

import com.paladin.feng.dto.aggressive.Aggressive;
import com.paladin.feng.dto.damageable.Damageable;
import com.paladin.feng.dto.harmful.Harmful;

public class Main {

	public static void main(String[] args) {
		Aggressive p1 = new Player("张三");
//		Harmful h1 
		Damageable p2 = new Player("李四");
		p1.attack(p2);
	}
}
