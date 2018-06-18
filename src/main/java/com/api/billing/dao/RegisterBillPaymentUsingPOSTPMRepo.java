package com.api.billing.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.billing.model.RegisterBillPaymentUsingPOSTP;
public interface RegisterBillPaymentUsingPOSTPMRepo extends MongoRepository<RegisterBillPaymentUsingPOSTP,String>{

}
