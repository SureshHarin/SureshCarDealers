package com.car.stock.dao;

import java.util.List;

import com.car.stock.models.*;

public interface ProductDAO {
	public void addProduct(Product product);
	public void displayProduct(Product product);
	public List<Product> displayProduct();
	public List<Product> displayProduct(String carName);
	public List<Product> displayProduct1(String carCategory);
	public List<Product> displayProduct2(String carCompany);
	public Product displayProduct(long modelNo);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
	
}
