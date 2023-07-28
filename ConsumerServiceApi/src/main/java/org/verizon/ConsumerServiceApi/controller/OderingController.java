package org.verizon.ConsumerServiceApi.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerServiceApi.model.Ordering;
import org.verizon.ConsumerServiceApi.service.OrderingService;

@RestController
@RequestMapping("/api/ordering")
public class OderingController {
	
	private OrderingService orderingservice;
	 
	@Autowired
	public OderingController(OrderingService orderingservice) {
		
		this.orderingservice = orderingservice;
	}
	@GetMapping("/allorder")
	public List<Ordering> getAllordering(){
		return orderingservice.getAllOrdering();
		
	}
	@PostMapping("/insert")
	public Ordering createordering(@RequestBody Ordering order)
	{
		return orderingservice.createOrdering(order);
}
	
}