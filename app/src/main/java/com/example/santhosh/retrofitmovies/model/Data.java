package com.example.santhosh.retrofitmovies.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Santhosh Pendem on 12/1/2017.
 */

public class Data {
	
	@SerializedName("inTheaters")
	@Expose
	private List<InTheater> inTheaters = null;
	
	public List<InTheater> getInTheaters() {
		return inTheaters;
	}
	
	public void setInTheaters(List<InTheater> inTheaters) {
		this.inTheaters = inTheaters;
	}
	
}