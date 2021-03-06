package com.example.santhosh.retrofitmovies.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Santhosh Pendem on 12/1/2017.
 */

public class Director {
	
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("id")
	@Expose
	private String id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
}