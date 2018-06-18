package com.api.billing.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.billing.model.PostBillPaymentUsingPOSTP;
public interface PostBillPaymentUsingPOSTPMRepo extends MongoRepository<PostBillPaymentUsingPOSTP,String>{

}
