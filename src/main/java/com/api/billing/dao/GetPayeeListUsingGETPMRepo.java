package com.api.billing.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.billing.model.GetPayeeListUsingGETP;
public interface GetPayeeListUsingGETPMRepo extends MongoRepository<GetPayeeListUsingGETP,String>{

}
