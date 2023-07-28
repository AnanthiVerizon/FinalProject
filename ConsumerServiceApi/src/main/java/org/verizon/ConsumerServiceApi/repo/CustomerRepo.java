package org.verizon.ConsumerServiceApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.verizon.ConsumerServiceApi.model.CustomerModel;

public interface CustomerRepo extends JpaRepository<CustomerModel,Integer> {

}



