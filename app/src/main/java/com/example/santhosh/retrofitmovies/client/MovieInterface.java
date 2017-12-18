package com.example.santhosh.retrofitmovies.client;

import com.example.santhosh.retrofitmovies.model.Data;
import com.example.santhosh.retrofitmovies.model.Example;
import com.example.santhosh.retrofitmovies.model.Movie;

import java.util.List;
import java.util.concurrent.Callable;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by Santhosh Pendem on 12/6/2017.
 */

public interface MovieInterface {
	@GET("inTheaters?token=5d4b55e6-5244-417a-b1a1-1a5be613251d&format=json&language=en-us")
	Call<Example> fetchMovies();
	//@Query("token") String token, @Query("format") String format, @Query("language") String language
	//@Url String url
}
