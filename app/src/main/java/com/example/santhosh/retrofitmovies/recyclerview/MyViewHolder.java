package com.example.santhosh.retrofitmovies.recyclerview;

import com.example.santhosh.retrofitmovies.R;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Santhosh Pendem on 12/6/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
	
	TextView movieName,movieDescription;
	ImageView movieImage;
	MyItemClickListener myItemClickListener;
	
	public MyViewHolder(View itemView) {
		super(itemView);
		movieName = itemView.findViewById(R.id.movieName);
		movieDescription = itemView.findViewById(R.id.movieDescription);
		movieImage = itemView.findViewById(R.id.movieImage);
	}
	
	@Override
	public void onClick(View v) {
		this.myItemClickListener.onItemClick(v,getLayoutPosition());
	}
	
	public void setItemClickListener(MyItemClickListener ic){
		this.myItemClickListener = ic;
	}
	
}
