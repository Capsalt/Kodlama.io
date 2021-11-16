package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao(),
				new JLoggerManagerAdapter());
		
		Product product1 = new Product(1,2,"Elma",12,32);
		Product product2 = new Product(2,4,"Armut",15,34);
		productService.add(product1);
		productService.add(product2);

	}

}
