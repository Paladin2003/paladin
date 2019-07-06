package com.paladin.feng.dto;

public class User {
	
	private String account;
	private String name;
	private String mail;
	private String phone;
	
	public User() {
		super();
	}
	
	public User(String account, String name) {
		this();
		this.account = account;
		this.name = name;
	}

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [account=" + account + ", name=" + name + ", mail=" + mail + ", phone=" + phone + "]";
	}
}
