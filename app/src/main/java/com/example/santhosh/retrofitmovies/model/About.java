package com.example.santhosh.retrofitmovies.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Santhosh Pendem on 12/1/2017.
 */

public class About {
	
	@SerializedName("version")
	@Expose
	private String version;
	@SerializedName("serverTime")
	@Expose
	private String serverTime;
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getServerTime() {
		return serverTime;
	}
	
	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}
	
}