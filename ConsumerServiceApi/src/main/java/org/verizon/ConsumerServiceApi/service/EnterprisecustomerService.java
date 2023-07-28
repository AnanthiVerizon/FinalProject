package org.verizon.ConsumerServiceApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerServiceApi.model.EnterprisecustomerModel;
import org.verizon.ConsumerServiceApi.repo.EnterprisecustomerRepo;

@Service
public class EnterprisecustomerService {
	
	private final EnterprisecustomerRepo enterprisecustomerrepo;
	@Autowired

	public EnterprisecustomerService(EnterprisecustomerRepo enterprisecustomerrepo) {
		
		this.enterprisecustomerrepo = enterprisecustomerrepo;
	}
	public List<EnterprisecustomerModel> getAllEnterprisecustomerModel()
	{
		return enterprisecustomerrepo.findAll();
	}
	public EnterprisecustomerModel createEnterprisecustomerModel(EnterprisecustomerModel enterprise) {
		return enterprisecustomerrepo.save(enterprise);
	}

}
