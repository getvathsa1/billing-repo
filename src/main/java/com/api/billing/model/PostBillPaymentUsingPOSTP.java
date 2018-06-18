package com.api.billing.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PostBillPaymentUsingPOSTP {

	private String authorization;

	private String amountCurrency;

	private String fromAccountId;

	private String toPayeeId;

	private String paymentDate;

	private String paymentMemo;

	private String acceptLanguage;

	private String userAgent;

	private String host;

	private String tdClient;

	private String traceID;

	public PostBillPaymentUsingPOSTP(){}

	public PostBillPaymentUsingPOSTP(String authorization,String amountCurrency,String fromAccountId,String toPayeeId,String paymentDate,String paymentMemo,String acceptLanguage,String userAgent,String host,String tdClient,String traceID){
		 this.authorization=authorization;
		 this.amountCurrency=amountCurrency;
		 this.fromAccountId=fromAccountId;
		 this.toPayeeId=toPayeeId;
		 this.paymentDate=paymentDate;
		 this.paymentMemo=paymentMemo;
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
	public String getAmountCurrency() {
		 return amountCurrency;
	}

	public void setAmountCurrency(String amountCurrency) {
		 this.amountCurrency=amountCurrency;
	}
	public String getFromAccountId() {
		 return fromAccountId;
	}

	public void setFromAccountId(String fromAccountId) {
		 this.fromAccountId=fromAccountId;
	}
	public String getToPayeeId() {
		 return toPayeeId;
	}

	public void setToPayeeId(String toPayeeId) {
		 this.toPayeeId=toPayeeId;
	}
	public String getPaymentDate() {
		 return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		 this.paymentDate=paymentDate;
	}
	public String getPaymentMemo() {
		 return paymentMemo;
	}

	public void setPaymentMemo(String paymentMemo) {
		 this.paymentMemo=paymentMemo;
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