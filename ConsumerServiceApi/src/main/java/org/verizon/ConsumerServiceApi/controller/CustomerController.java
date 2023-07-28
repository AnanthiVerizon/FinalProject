package org.verizon.ConsumerServiceApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerServiceApi.model.CustomerModel;
import org.verizon.ConsumerServiceApi.service.CustomerService;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	private CustomerService customerservice;
	 
	@Autowired
	public CustomerController(CustomerService customerservice) {
		
		this.customerservice = customerservice;
	}
	@GetMapping("/allcust")
	public List<CustomerModel> getAllCustomerModel(){
		return customerservice.getAllCustomerModel();
		
	}
	@PostMapping("/insert")
	public CustomerModel createCustomerModel(@RequestBody CustomerModel cust)
	{
		return customerservice.createCustomerModel(cust);
}

}
