package com.example.santhosh.retrofitmovies.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Santhosh Pendem on 12/6/2017.
 */

public class MovieClient {
	
	private static final String BASE_URL = "http://www.myapifilms.com/imdb/";
	private static Retrofit retrofit = null;
	
	public static Retrofit getClient() {
		Gson gson = new GsonBuilder().setLenient().create();
		if (retrofit == null) {
			retrofit = new Retrofit.Builder()
					.baseUrl(BASE_URL)
					.addConverterFactory(GsonConverterFactory.create(gson))
					.build();
		}
		return retrofit;
	}
}
