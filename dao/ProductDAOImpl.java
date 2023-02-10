package com.car.stock.dao;

import java.util.ArrayList;
import java.util.List;

import com.car.stock.models.*;

public class ProductDAOImpl implements ProductDAO {
	List<Product> products = new ArrayList<Product>();
	public void addProduct(Product product) {
		
		products.add(product);
		System.out.println("Car details has been added successfully");
	}

	public void displayProduct(Product product) {
		
		int flag = 0;
		Product p=null;
		for(Product pro : products) {
			if(pro.getmodelNo() == product.getmodelNo()) {
				flag++;
				p = pro;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Product has not found");
		}
		else {
			System.out.println(p);
		}
	}

	public List<Product> displayProduct() {
		
		return products;
	}

	public List<Product> displayProduct(String carName) {
		
		List<Product> pros = new ArrayList<Product>();
		for(Product pro : products) {
			if(pro.getcarName().equals(carName)) {
				pros.add(pro);
			}
		}
		return pros;
	}
	public List<Product> displayProduct1(String carCompany) {
		
		List<Product> pros = new ArrayList<Product>();
		for(Product pro : products) {
			if(pro.getcarCompany().equals(carCompany)) {
				pros.add(pro);
			}
		}
		return pros;
	}
	public List<Product> displayProduct2(String carCategory) {
	
	List<Product> pros = new ArrayList<Product>();
	for(Product pro : products) {
		if(pro.getcarCategory().equals(carCategory)) {
			pros.add(pro);
		}
	}
	return pros;
}

	public Product displayProduct(long modelNo) {
		
		int flag = 0;
		Product p=new Product();
		p.setmodelNo(0);
		//System.out.println(modelNo);
		for(Product pro : products) {
			if(pro.getmodelNo() == modelNo) {
				flag++;
				p = pro;
				break;
			}
		}
		
		return p;
	}
	@Override
	public void deleteProduct(Product product) {
		
		
	}

	public void updateProduct(Product product) {
		
	}

}
