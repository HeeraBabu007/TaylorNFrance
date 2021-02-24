package com.heera.dev.model;

import java.util.List;
public class ProductActualResponse {

	private String base="EUR";
	private List<Product> product;
	
	
	public ProductActualResponse() {
	}

	public String getBase() {
		return base;
	}


	public void setBase(String base) {
		this.base = base;
	}

	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
}
