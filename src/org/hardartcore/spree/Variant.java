package org.hardartcore.spree;

import java.util.ArrayList;

public class Variant {
	
	private int		id;
	private Boolean	isMaster;
	
	private String	name;
	private int		countOnHand;
	private String	visualCode;
	private String	sku;
	private double	price;
	private double	weight;
	private double	height;
	private double	width;
	private double	depth;
	private double	costPrice;
	private String	permalink;
	private ArrayList<ProductImage> images;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getIsMaster() {
		return isMaster;
	}
	public void setIsMaster(Boolean isMaster) {
		this.isMaster = isMaster;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountOnHand() {
		return countOnHand;
	}
	public void setCountOnHand(int countOnHand) {
		this.countOnHand = countOnHand;
	}
	public String getVisualCode() {
		return visualCode;
	}
	public void setVisualCode(String visualCode) {
		this.visualCode = visualCode;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	public ArrayList<ProductImage> getImages() {
		return images;
	}
	public void setImages(ArrayList<ProductImage> images) {
		this.images = images;
	}

}
