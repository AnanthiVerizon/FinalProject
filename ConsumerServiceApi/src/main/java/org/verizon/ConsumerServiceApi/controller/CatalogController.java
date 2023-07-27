package org.verizon.ConsumerServiceApi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.ConsumerServiceApi.model.Catalogmodel;
import org.verizon.ConsumerServiceApi.service.CatalogService;

@RestController
@RequestMapping("/api/catalogmodel")
public class CatalogController {
	
	private CatalogService catalogservice;
	 
	@Autowired
	public CatalogController(CatalogService catalogservice) {
		
		this.catalogservice = catalogservice;
	}
	
	@GetMapping("/allcust")
	public List<Catalogmodel> getAllcatalogmodel(){
		return catalogservice.getAllCatalogmodel();
		
	}
	@PostMapping("/insert")
	public Catalogmodel createcatalogmodel(@RequestBody Catalogmodel catmod)
	{
		return catalogservice.createcatalogmodel(catmod);
}

}
