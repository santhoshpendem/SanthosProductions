package com.example.santhosh.retrofitmovies.model;

/**
 * Created by Santhosh Pendem on 12/1/2017.
 */

public class Movies {
	private String title, genre, year;
	
	public Movies() {
	}
	
	public Movies(String title, String genre, String year) {
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String name) {
		this.title = name;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
}

