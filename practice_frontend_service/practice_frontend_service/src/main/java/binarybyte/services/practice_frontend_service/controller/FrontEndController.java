package binarybyte.services.practice_frontend_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import binarybyte.services.practice_frontend_service.config.Configuration;
import binarybyte.services.practice_frontend_service.models.Product;

@RestController
public class FrontEndController {
	
	private RestTemplate request;
	
	@Autowired
	private Configuration configuation;
	
	FrontEndController(){
		request = new RestTemplate();
	}
	
	@GetMapping("/products")
	public Product[] retrieveProducts(){
		
		String URL = configuation.getBackendServiceUrl() + "/products";
		ResponseEntity<Product[]> response = request.getForEntity(URL, Product[].class);
		Product[] products = response.getBody();
		
		return products;
	}

}
