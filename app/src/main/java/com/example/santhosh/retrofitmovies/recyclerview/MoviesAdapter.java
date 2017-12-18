package com.example.santhosh.retrofitmovies.recyclerview;


import com.bumptech.glide.Glide;
import com.example.santhosh.retrofitmovies.R;
import com.example.santhosh.retrofitmovies.model.Movie;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Santhosh Pendem on 12/1/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MyViewHolder>{
	
	
	private List<Movie> moviesList;
	private Context context;
	
	public MoviesAdapter(List<Movie> moviesList,Context context) {
		this.moviesList = moviesList;
		this.context = context;
	}
	
	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card,parent,false);
		MyViewHolder myViewHolder = new MyViewHolder(v);
		return myViewHolder;
	}
	
	@Override
	public void onBindViewHolder(MyViewHolder holder, int position) {
	Movie movie = moviesList.get(position);
	holder.movieName.setText(movie.getTitle());
	holder.movieDescription.setText(movie.getPlot());
		Glide.with(context)
				.load(movie.getUrlPoster())
				.into(holder.movieImage);
	
	}
	
	@Override
	public int getItemCount() {
		return moviesList.size();
	}
}
