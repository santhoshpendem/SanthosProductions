/*
package com.example.santhosh.retrofitmovies.cache;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;


import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.ResponseBody;
import retrofit2.Converter;

*/
/**
 * Created by Santhosh Pendem on 12/12/2017.
 *//*


public class GsonResponseBodyConverter <T> implements Converter<ResponseBody, T> {
	
	private final Gson gson;
	private final TypeAdapter<T> adapter;
	private final GsonResponseListener listener;
	private final Class clsType;
	private final boolean isCacheable;
	
	GsonResponseBodyConverter(Gson gson, TypeAdapter<T> adapter, Type type, Annotation[] annotations, GsonResponseListener listener) {
		this.gson = gson;
		this.adapter = adapter;
		this.listener = listener;
		
		clsType = typeToClass(type);
		isCacheable = isCacheable(annotations);
	}
	
	@Override
	public T convert(ResponseBody value) throws IOException {
		JsonReader jsonReader = gson.newJsonReader(value.charStream());
		
		return null;
	}
}
*/
