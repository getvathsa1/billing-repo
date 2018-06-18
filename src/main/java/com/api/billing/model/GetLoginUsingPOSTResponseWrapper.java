package com.api.billing.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetLoginUsingPOSTResponseWrapper {

	 private SessionResponse response;

	 public MultiValueMap<String, String> getHeaders(){
	 final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
 	return map;
	}
	 public void setHeaders(){
		 
	} 
	public SessionResponse getResponse(){
		 return response;
	} 
	 public void setResponse(SessionResponse response){
		 this.response=response;
	} 
}