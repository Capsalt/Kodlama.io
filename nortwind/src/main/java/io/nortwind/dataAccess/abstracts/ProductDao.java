package io.nortwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nortwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	

}
