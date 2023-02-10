package com.car.stock.services;

import java.util.List;
import java.util.Scanner;

import com.car.stock.dao.ProductDAO;
import com.car.stock.dao.ProductDAOImpl;
import com.car.stock.models.Product;



public class ProductServicesImpl implements ProductServices {

	
	Scanner scan = new Scanner(System.in);
	ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void addProduct() {
		// Accept data from the user
		System.out.println("Enter the Car Model No ");
		long cmno = scan.nextLong();
		scan.nextLine();
	
		
		System.out.println("Enter the Car Name ");
		String pname = scan.nextLine().toUpperCase();
	
		System.out.println("Enter Car Category");
		String cat = scan.nextLine().toUpperCase();
		
		System.out.println("Enter Car Company");
		String pcom = scan.nextLine().toUpperCase();
		
		
		System.out.println("Enter Car Cost");
		double pcost = scan.nextDouble();
		
		//Add details to the product object.
		Product p = new Product();
		
		p.setcarCategory(cat);
		p.setcarCost(pcost);
		p.setmodelNo(cmno);
		p.setcarName(pname);
		p.setcarCompany(pcom);

		//Add product to the Products list in DAO class
		dao.addProduct(p);
		
		//Increase Product Id
		
	}

	@Override
	public void displayProductById() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Car model No");
		long cmno= scan.nextLong();
		//scan.nextLine();
		Product p = dao.displayProduct(cmno);
		if(p.getmodelNo() == 0) {
			System.out.println("Sorry Product has not found");
		}
		else {
			dao.displayProduct(p);
		}
	}

	@Override
	public void displayAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = dao.displayProduct();
		for(Product pro : products) {
			dao.displayProduct(pro);
		}
	}

	@Override
	public void displayProductByName() {
		// TODO Auto-generated method stub
		System.out.println("Enter the car name ");
		String pname = scan.nextLine().toUpperCase();
		scan.nextLine();
		List<Product> products = dao.displayProduct(pname);
		for(Product pro : products) {
			dao.displayProduct(pro);
		}
	}
	@Override
	public void displayProductByCompany() {
		// TODO Auto-generated method stub
		System.out.println("Enter the car company ");
		String pcom = scan.nextLine().toUpperCase();
		
		List<Product> products = dao.displayProduct1(pcom);
		for(Product pro : products) {
			dao.displayProduct(pro);
		}
	}
	@Override
	public void displayProductByCategory() {
		// TODO Auto-generated method stub
		System.out.println("Enter the car category ");
		String cat = scan.nextLine().toUpperCase();
		
		List<Product> products = dao.displayProduct2(cat);
		for(Product pro : products) {
			dao.displayProduct(pro);
		}
	}

	@Override
	public void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menu() {
		while(true) {
			System.out.println("=================================SURESH CAR DEALERS===============================");
			System.out.println("Press 1 for Add New Car Details");
			System.out.println("Press 2 for Display All Available Cars");
			System.out.println("Press 3 for Display Car By ModelNo");
			System.out.println("Press 4 for Display Car By Car Name");
			System.out.println("Press 5 for Display Car By Car Company");
			System.out.println("Press 6 for Display Car By Car Category");
			System.out.println("Press 0 for Exit");
			System.out.println("Please Enter your choice ");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 0 : System.exit(choice);
			case 1 : addProduct();break;
			case 2 : displayAllProducts();break;
			case 3 : displayProductById();break;
			case 4 : displayProductByName();break;
			case 5 : displayProductByCompany();break;
			case 6 : displayProductByCategory();break;
			default : System.out.println("Sorry!!!! You have entered a wrong choice...");
			}
		}
	}
}
