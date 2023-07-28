package org.verizon.ConsumerServiceApi.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerServiceApi.model.CustomerModel;
import org.verizon.ConsumerServiceApi.repo.CustomerRepo;
@Service
public class CustomerService {
	
	private final CustomerRepo customerrepo;
	@Autowired

	public CustomerService(CustomerRepo customerrepo) {
		
		this.customerrepo = customerrepo;
	}
	public List<CustomerModel> getAllCustomerModel()
	{
		return CustomerModel.findAll();
	}
	public CustomerModel createCustomerModel(CustomerModel cust) {
		return customerrepo.save(cust);
	}
	


}



