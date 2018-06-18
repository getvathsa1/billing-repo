package com.api.billing.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetBillPayEligibleAccountsUsingGETResponseWrapper {

	 private BillPayAccountList response;

	 public MultiValueMap<String, String> getHeaders(){
	 final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
 	return map;
	}
	 public void setHeaders(){
		 
	} 
	public BillPayAccountList getResponse(){
		 return response;
	} 
	 public void setResponse(BillPayAccountList response){
		 this.response=response;
	} 
}