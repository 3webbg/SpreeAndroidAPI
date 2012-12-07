package org.hardartcore.spree;

import org.hardartcore.spreeandroidapi.R;

import android.graphics.drawable.Drawable;

public class ProductImage {

	private String path;
	private Drawable image;
	private Drawable thumbnail;
	private final int _defaultLogo = R.drawable.ic_default_product; // default Logo
	
	public ProductImage(String path) {
		this.path = path;
	}
	
	public Drawable getImage() {
		if (image == null) {
			//get the image
		}
		
		//if the image could not be obtained use the Spree logo as a dummy
		
		return image;
	}
	
	public Drawable getThumbnail() {
		if (thumbnail == null) {
			//get the thumbnail
		}
		
		//if the thumbnail could not be obtained use the Spree logo as a dummy
		
		return thumbnail;
	}

}
