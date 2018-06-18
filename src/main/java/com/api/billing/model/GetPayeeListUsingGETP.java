package com.api.billing.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GetPayeeListUsingGETP {

	private String authorization;

	private String acceptLanguage;

	private String userAgent;

	private String host;

	private String tdClient;

	private String traceID;

	public GetPayeeListUsingGETP(){}

	public GetPayeeListUsingGETP(String authorization,String acceptLanguage,String userAgent,String host,String tdClient,String traceID){
		 this.authorization=authorization;
		 this.acceptLanguage=acceptLanguage;
		 this.userAgent=userAgent;
		 this.host=host;
		 this.tdClient=tdClient;
		 this.traceID=traceID;
	}


	public String getAuthorization() {
		 return authorization;
	}

	public void setAuthorization(String authorization) {
		 this.authorization=authorization;
	}
	public String getAcceptLanguage() {
		 return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		 this.acceptLanguage=acceptLanguage;
	}
	public String getUserAgent() {
		 return userAgent;
	}

	public void setUserAgent(String userAgent) {
		 this.userAgent=userAgent;
	}
	public String getHost() {
		 return host;
	}

	public void setHost(String host) {
		 this.host=host;
	}
	public String getTdClient() {
		 return tdClient;
	}

	public void setTdClient(String tdClient) {
		 this.tdClient=tdClient;
	}
	public String getTraceID() {
		 return traceID;
	}

	public void setTraceID(String traceID) {
		 this.traceID=traceID;
	}
}