package io.nortwind.business.abstracts;

import java.util.List;

import io.nortwind.core.utilities.results.DataResult;
import io.nortwind.core.utilities.results.Result;
import io.nortwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	Result add(Product product);

}
