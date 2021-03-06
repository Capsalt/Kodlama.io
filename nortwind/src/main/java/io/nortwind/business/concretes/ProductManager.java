package io.nortwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nortwind.business.abstracts.ProductService;
import io.nortwind.core.utilities.results.DataResult;
import io.nortwind.core.utilities.results.Result;
import io.nortwind.core.utilities.results.SuccessDataResult;
import io.nortwind.core.utilities.results.SuccessResult;
import io.nortwind.dataAccess.abstracts.ProductDao;
import io.nortwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
		 (this.productDao.findAll(), true, "Ürün eklendi");
				
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}
