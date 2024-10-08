package com.JPA.Connect.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.Connect.Model.Product;
import com.JPA.Connect.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/home")
    public String greet() {
        return "Hello World";
    }
	
	@GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) {
		
		service.addProduct(prod);
		
	}
	
	
	
	
	
	

}
