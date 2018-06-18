package com.api.billing.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.billing.services.*;
import com.api.billing.model.*;


import com.api.billing.model.BillPayAccountList;
import com.api.billing.model.BillPaymentAccessTokenResponse;
import com.api.billing.model.BillPaymentConfirmation;
import com.api.billing.model.PayeeList;
import com.api.billing.model.SessionResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T10:06:25.149+08:00")

@Controller
public class ApiApiController implements ApiApi {
	@Autowired
	 private GetBillPayEligibleAccountsUsingGETI getBillPayEligibleAccountsUsingGETI;
	@Autowired
	 private GetBillPayTokenUsingGETI getBillPayTokenUsingGETI;
	@Autowired
	 private GetLoginUsingPOSTI getLoginUsingPOSTI;
	@Autowired
	 private GetPayeeListUsingGETI getPayeeListUsingGETI;
	@Autowired
	 private PostBillPaymentUsingPOSTI postBillPaymentUsingPOSTI;
	@Autowired
	 private RegisterBillPaymentUsingPOSTI registerBillPaymentUsingPOSTI;




    public ResponseEntity<BillPayAccountList> getBillPayEligibleAccountsUsingGET(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,
        @ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,
        @ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,
        @ApiParam(value = "Application Name, Platform and Version. ex: appname=bank_mobile, platform=ios, version=v1.3.2b23" ) @RequestHeader(value="td-client", required=false) String tdClient,
        @ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID) {

	GetBillPayEligibleAccountsUsingGETResponseWrapper res = getBillPayEligibleAccountsUsingGETI.execute(new GetBillPayEligibleAccountsUsingGETP(authorization,acceptLanguage,userAgent,host,tdClient,traceID));
        return new ResponseEntity<BillPayAccountList>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<BillPaymentAccessTokenResponse> getBillPayTokenUsingGET(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,
        @ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,
        @ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,
        @ApiParam(value = "Application Name, Platform and Version. ex: appname=ngp_web,version=5.0.3" ) @RequestHeader(value="td-client", required=false) String tdClient,
        @ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID) {

	GetBillPayTokenUsingGETResponseWrapper res = getBillPayTokenUsingGETI.execute(new GetBillPayTokenUsingGETP(authorization,acceptLanguage,userAgent,host,tdClient,traceID));
        return new ResponseEntity<BillPaymentAccessTokenResponse>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<SessionResponse> getLoginUsingPOST( @NotNull@ApiParam(value = "username", required = true) @RequestParam(value = "username", required = true) String username,
         @NotNull@ApiParam(value = "password", required = true) @RequestParam(value = "password", required = true) String password) {

	GetLoginUsingPOSTResponseWrapper res = getLoginUsingPOSTI.execute(new GetLoginUsingPOSTP(username,password));
        return new ResponseEntity<SessionResponse>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<PayeeList> getPayeeListUsingGET(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,
        @ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,
        @ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,
        @ApiParam(value = "Application Name, Platform and Version. ex: appname=bank_mobile, platform=ios, version=v1.3.2b23" ) @RequestHeader(value="td-client", required=false) String tdClient,
        @ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID) {

	GetPayeeListUsingGETResponseWrapper res = getPayeeListUsingGETI.execute(new GetPayeeListUsingGETP(authorization,acceptLanguage,userAgent,host,tdClient,traceID));
        return new ResponseEntity<PayeeList>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<BillPaymentConfirmation> postBillPaymentUsingPOST(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "", allowableValues = "USD, CAD") @RequestParam(value = "amount.currency", required = false) String amountCurrency,
        @ApiParam(value = "") @RequestParam(value = "fromAccountId", required = false) String fromAccountId,
        @ApiParam(value = "") @RequestParam(value = "toPayeeId", required = false) String toPayeeId,
        @ApiParam(value = "") @RequestParam(value = "paymentDate", required = false) String paymentDate,
        @ApiParam(value = "") @RequestParam(value = "paymentMemo", required = false) String paymentMemo,
        @ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,
        @ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,
        @ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,
        @ApiParam(value = "Application Name, Platform and Version. ex: appname=bank_mobile, platform=ios, version=v1.3.2b23" ) @RequestHeader(value="td-client", required=false) String tdClient,
        @ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID) {

	PostBillPaymentUsingPOSTResponseWrapper res = postBillPaymentUsingPOSTI.execute(new PostBillPaymentUsingPOSTP(authorization,amountCurrency,fromAccountId,toPayeeId,paymentDate,paymentMemo,acceptLanguage,userAgent,host,tdClient,traceID));
        return new ResponseEntity<BillPaymentConfirmation>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

    public ResponseEntity<String> registerBillPaymentUsingPOST(@ApiParam(value = "OAuth2 token" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "Language for the HTTP Request" ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,
        @ApiParam(value = "User Agent who is sending the HTTP Request" ) @RequestHeader(value="User-Agent", required=false) String userAgent,
        @ApiParam(value = "IP Address of the Server sending the HTTP Request" ) @RequestHeader(value="Host", required=false) String host,
        @ApiParam(value = "Application Name, Platform and Version. ex: appname=appname=ngp_web,version=5.0.3" ) @RequestHeader(value="td-client", required=false) String tdClient,
        @ApiParam(value = "Unique Trace ID to provisioning cross tier traceability" ) @RequestHeader(value="TraceID", required=false) String traceID) {

	RegisterBillPaymentUsingPOSTResponseWrapper res = registerBillPaymentUsingPOSTI.execute(new RegisterBillPaymentUsingPOSTP(authorization,acceptLanguage,userAgent,host,tdClient,traceID));
        return new ResponseEntity<String>(res.getResponse(),res.getHeaders(),HttpStatus.OK);
    }

}
