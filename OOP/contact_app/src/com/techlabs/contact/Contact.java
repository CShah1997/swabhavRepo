package com.techlabs.contact;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Contact implements Serializable{
	
	private String name;
	private String email;
	private long phone;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email)  {
		if(isValid(email)==true)
		{
			this.email = email;
		}
		else
		{
			throw new NullPointerException();
		}
	}
	
	static boolean isValid(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
			this.phone = phone;
	}
	
		
	 @Override
	public String toString() {
		return name+"\t"+email+"\t"+phone;
	}


}
