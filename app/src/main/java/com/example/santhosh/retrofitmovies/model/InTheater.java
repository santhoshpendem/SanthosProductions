package com.example.santhosh.retrofitmovies.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Santhosh Pendem on 12/1/2017.
 */

public class InTheater {
	
	@SerializedName("openingThisWeek")
	@Expose
	private String openingThisWeek;
	@SerializedName("movies")
	@Expose
	private List<Movie> movies = null;
	@SerializedName("inTheatersNow")
	@Expose
	private String inTheatersNow;
	
	public String getOpeningThisWeek() {
		return openingThisWeek;
	}
	
	public void setOpeningThisWeek(String openingThisWeek) {
		this.openingThisWeek = openingThisWeek;
	}
	
	public List<Movie> getMovies() {
		return movies;
	}
	
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	public String getInTheatersNow() {
		return inTheatersNow;
	}
	
	public void setInTheatersNow(String inTheatersNow) {
		this.inTheatersNow = inTheatersNow;
	}
	
}
