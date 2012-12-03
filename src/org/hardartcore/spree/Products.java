package org.hardartcore.spree;

import java.util.ArrayList;

public class Products {
	private ArrayList<Product> products;

	public void addProducts(Product object){
		
		if(products == null)
			products = new ArrayList<Product>();
		
		products.add(object);
		
	}
	
	public ArrayList<Product> getProducts(){
		
		return products;
		
	}
	
}
