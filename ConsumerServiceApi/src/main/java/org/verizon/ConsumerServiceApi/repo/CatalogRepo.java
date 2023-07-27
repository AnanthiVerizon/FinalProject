package org.verizon.ConsumerServiceApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.verizon.ConsumerServiceApi.model.Catalogmodel;
@Repository
public interface CatalogRepo extends JpaRepository<Catalogmodel, Integer> {
	
	

}



