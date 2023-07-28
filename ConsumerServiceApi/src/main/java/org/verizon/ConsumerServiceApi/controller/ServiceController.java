package org.verizon.ConsumerServiceApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerServiceApi.model.ServiceModel;
import org.verizon.ConsumerServiceApi.service.ServiceService;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
	
	private ServiceService serviceservice;
	 
	@Autowired
	public ServiceController(ServiceService serviceservice) {
		
		this.serviceservice = serviceservice;
	}
	@GetMapping("/allservice")
	public List<ServiceModel> getAllServiceModel(){
		return serviceservice.getAllServiceModel();
		
	}
	@PostMapping("/insert")
	public ServiceModel createServiceModel(@RequestBody ServiceModel serve)
	{
		return serviceservice.createServiceModel(serve);
}


}
