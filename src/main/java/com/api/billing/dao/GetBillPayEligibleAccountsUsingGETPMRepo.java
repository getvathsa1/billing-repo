package com.api.billing.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.billing.model.GetBillPayEligibleAccountsUsingGETP;
public interface GetBillPayEligibleAccountsUsingGETPMRepo extends MongoRepository<GetBillPayEligibleAccountsUsingGETP,String>{

}
