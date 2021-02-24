/**
 * 
 */
package com.heera.dev.model;

import java.util.Map;

/**
 * @author Heera
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Product {
	//mark id as primary key
	@Id
	//defining id as column name
	@Column
    private int id;
	//defining name as column name
	@Column
    private String name;
	//defining name as column name
	@Column
    private String description;
	//defining name as column name
	@Column
    private Long price;
   @Transient
	private Map<String, Double> rate;
	
	
	public Map<String, Double> getRate() {
		return rate;
	}
	public void setRate(Map<String, Double> rate) {
		this.rate = rate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String description, Long price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
}
