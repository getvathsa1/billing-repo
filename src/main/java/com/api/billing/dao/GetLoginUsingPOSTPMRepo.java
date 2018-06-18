package com.api.billing.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.billing.model.GetLoginUsingPOSTP;
public interface GetLoginUsingPOSTPMRepo extends MongoRepository<GetLoginUsingPOSTP,String>{

}
