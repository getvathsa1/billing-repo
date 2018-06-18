package com.api.billing.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.billing.model.GetBillPayTokenUsingGETP;
public interface GetBillPayTokenUsingGETPMRepo extends MongoRepository<GetBillPayTokenUsingGETP,String>{

}
