package org.verizon.ConsumerServiceApi.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerServiceApi.model.Ordering;
import org.verizon.ConsumerServiceApi.repo.OrderingRepo;

@Service
public class OrderingService {
	
	private final OrderingRepo orderingrepo;
	@Autowired

	public OrderingService(OrderingRepo orderingrepo) {
		
		this.orderingrepo = orderingrepo;
	}
	public List<Ordering> getAllOrdering()
	{
		return orderingrepo.findAll();
	}

	public Ordering createOrdering(Ordering order) {
		return orderingrepo.save(order);
	}
	

	
}
