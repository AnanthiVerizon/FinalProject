package org.verizon.ConsumerServiceApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.verizon.ConsumerServiceApi.model.Ordering;

public interface OrderingRepo extends JpaRepository<Ordering,Integer> {

}
