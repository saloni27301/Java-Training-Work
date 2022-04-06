package com.harman.model;

import java.io.Serializable;

public class person implements Serializable {
	
	private String Name;
	private String Email;
	private transient String AtmPassword;
	public person(String name, String email) {
		super();
		Name = name;
		Email = email;
	}
	public person(String name, String email, String aTMPassword) {
		super();
		Name = name;
		Email = email;
		AtmPassword = aTMPassword;
	}
	@Override
	public String toString() {
		return String.format("person [Name=%s, Email=%s]", Name, Email);
	}
	
	
}
