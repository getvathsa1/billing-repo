package com.api.billing.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GetLoginUsingPOSTP {

	private String username;

	private String password;

	public GetLoginUsingPOSTP(){}

	public GetLoginUsingPOSTP(String username,String password){
		 this.username=username;
		 this.password=password;
	}


	public String getUsername() {
		 return username;
	}

	public void setUsername(String username) {
		 this.username=username;
	}
	public String getPassword() {
		 return password;
	}

	public void setPassword(String password) {
		 this.password=password;
	}
}