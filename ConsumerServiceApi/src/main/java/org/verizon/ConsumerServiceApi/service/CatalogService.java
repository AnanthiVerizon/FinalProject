package org.verizon.ConsumerServiceApi.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.ConsumerServiceApi.model.Catalogmodel;
import org.verizon.ConsumerServiceApi.repo.CatalogRepo;

@Service
public class CatalogService {
	
	private final CatalogRepo catalogrepo;
	@Autowired
	public CatalogService(CatalogRepo catalogrepo) {
		this.catalogrepo = catalogrepo;
		
	}
	  
	public List<Catalogmodel> getAllCatalogmodel()
	{
		return catalogrepo.findAll();
	}

	public Catalogmodel createcatalogmodel(Catalogmodel catmod) {
		return catalogrepo.save(catmod);
	}

}
