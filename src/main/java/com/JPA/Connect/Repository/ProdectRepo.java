package com.JPA.Connect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPA.Connect.Model.Product;

@Repository
public interface ProdectRepo extends JpaRepository<Product,Integer> {

}
