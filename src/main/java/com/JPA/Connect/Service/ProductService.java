package com.JPA.Connect.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Connect.Model.Product;
import com.JPA.Connect.Repository.ProdectRepo;

@Service
public class ProductService {

	@Autowired
	ProdectRepo repo;
	
	public List<Product> getProducts() {
        return repo.findAll();
    }
	
	public void addProduct(Product prod) {
		repo.save(prod);
	}
	
	
	
	
	
}
