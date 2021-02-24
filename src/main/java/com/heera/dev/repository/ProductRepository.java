/**
 * 
 */
package com.heera.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heera.dev.model.Product;

/**
 * @author Heera
 *
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
