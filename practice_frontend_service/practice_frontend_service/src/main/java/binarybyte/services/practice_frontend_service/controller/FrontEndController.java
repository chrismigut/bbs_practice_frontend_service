package binarybyte.services.practice_frontend_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import binarybyte.services.practice_frontend_service.models.Product;

@RestController
public class FrontEndController {
	
	@GetMapping("/products")
	public Product[] retrieveProducts(){
		
		RestTemplate request = new RestTemplate();
		String URL = "http://localhost:8090/products";
		ResponseEntity<Product[]> response = request.getForEntity(URL, Product[].class);
		Product[] products = response.getBody();
		
		return products;
	}

}
