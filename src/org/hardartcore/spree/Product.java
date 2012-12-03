package org.hardartcore.spree;

import java.util.ArrayList;

public class Product {
	private ArrayList<Variant> variants;

	public void addVariant(Variant object){
		
		if(variants == null)
			variants = new ArrayList<Variant>();
		
		variants.add(object);

	}
	
	public ArrayList<Variant> getListOfVariants(){
		
		return variants;
	}
}
