package com.example.santhosh.retrofitmovies.cache;

/**
 * Created by Santhosh Pendem on 12/12/2017.
 */

public interface GsonResponseListener {
	
	/**
	 * @param type response object class type
	 * @param responseBody parsed response
	 */
	void onCacheableResponse(Class type, Object responseBody);
	
}
