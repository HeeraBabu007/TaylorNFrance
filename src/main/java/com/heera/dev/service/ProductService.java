/**
 * 
 */
package com.heera.dev.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heera.dev.model.Product;

/**
 * @author Heera
 *
 */

@Service
public class ProductService {

	@Autowired
	private com.heera.dev.repository.ProductRepository productRepository;

	// getting all records
	public List<Product> getAllProduct() {
		List<Product> products = new ArrayList<Product>();
		productRepository.findAll().forEach(p -> products.add(p));
		return products;
	}

}
