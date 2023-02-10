package com.car.stock.app;

import com.car.stock.services.ProductServices;
import com.car.stock.services.ProductServicesImpl;

public class EnquiryApp {
	public static void main(String[] args) {
		ProductServices service = new ProductServicesImpl();
		service.menu();
	}
	
}
