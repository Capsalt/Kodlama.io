package io.nortwind.business.abstracts;

import java.util.List;

import io.nortwind.entities.concretes.Product;

public interface ProductService {
	
	List<Product> getAll();

}
