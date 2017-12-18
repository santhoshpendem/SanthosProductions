package com.example.santhosh.retrofitmovies.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Santhosh Pendem on 12/1/2017.
 */

public class Example {
	
	@SerializedName("data")
	@Expose
	private Data data;
	@SerializedName("about")
	@Expose
	private About about;
	
	public Data getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	public About getAbout() {
		return about;
	}
	
	public void setAbout(About about) {
		this.about = about;
	}
	
}