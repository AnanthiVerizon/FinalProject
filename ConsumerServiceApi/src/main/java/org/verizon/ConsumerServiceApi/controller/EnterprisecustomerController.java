package org.verizon.ConsumerServiceApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerServiceApi.model.EnterprisecustomerModel;
import org.verizon.ConsumerServiceApi.service.EnterprisecustomerService;

@RestController
@RequestMapping("/api/enterprise")
public class EnterprisecustomerController {
	
	private EnterprisecustomerService enterprisecustomerservice;
	 
	@Autowired
	public EnterprisecustomerController(EnterprisecustomerService enterprisecustomerservice) {
		
		this.enterprisecustomerservice = enterprisecustomerservice;
	}
	@GetMapping("/allenterprise")
	public List<EnterprisecustomerModel> getAllEnterprisecustomerModel(){
		return enterprisecustomerservice.getAllEnterprisecustomerModel();
		
	}
	@PostMapping("/insert")
	public EnterprisecustomerModel createEnterprisecustomrModel(@RequestBody EnterprisecustomerModel enterprise)
	{
		return enterprisecustomerservice.createEnterprisecustomerModel(enterprise);
}


}
