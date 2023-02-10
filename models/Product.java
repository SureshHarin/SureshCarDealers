package com.car.stock.models;

public class Product {
	private long modelNo;
	private String carName,carCategory,carCompany;
	private double carCost;
	
	public void setmodelNo(long modelNo) {
		this.modelNo = modelNo;
	}
	
	public long getmodelNo() {
		return modelNo;
	}

	public String getcarName() {
		return carName;
	}

	public void setcarName(String carName) {
		this.carName = carName;
	}
	public String getcarCompany() {
		return carCompany;
	}

	public void setcarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getcarCategory() {
		return carCategory;
	}

	public void setcarCategory(String carCategory) {
		this.carCategory = carCategory;
	}

	public double getcarCost() {
		return carCost;
	}

	public void setcarCost(double carCost) {
		this.carCost = carCost;
	}
	
	

	@Override
	public String toString() {
		return "Product [modelNo=" + modelNo + ", carName=" + carName + ", carCategory="
				+ carCategory + ",carCompany="+ carCompany +", carCost=" + carCost + ", ]";
	}

}
