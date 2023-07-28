package org.verizon.ConsumerServiceApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.verizon.ConsumerServiceApi.model.ServiceModel;

public interface ServiceRepo extends JpaRepository<ServiceModel,Integer> {

}
