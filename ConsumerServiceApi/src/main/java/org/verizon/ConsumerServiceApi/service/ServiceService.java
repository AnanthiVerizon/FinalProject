package org.verizon.ConsumerServiceApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerServiceApi.model.ServiceModel;
import org.verizon.ConsumerServiceApi.repo.ServiceRepo;
@Service
public class ServiceService {
	private final ServiceRepo servicerepo;
	@Autowired

	public ServiceService(ServiceRepo servicerepo) {
		
		this.servicerepo = servicerepo;
	}
	public List<ServiceModel> getAllServiceModel()
	{
		return servicerepo.findAll();
	}

	public ServiceModel createServiceModel(ServiceModel serve) {
		return servicerepo.save(serve);
	}
}
