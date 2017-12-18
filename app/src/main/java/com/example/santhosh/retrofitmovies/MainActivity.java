package com.example.santhosh.retrofitmovies;

import com.example.santhosh.retrofitmovies.client.MovieClient;
import com.example.santhosh.retrofitmovies.client.MovieInterface;
import com.example.santhosh.retrofitmovies.model.Example;
import com.example.santhosh.retrofitmovies.model.InTheater;
import com.example.santhosh.retrofitmovies.model.Movie;
import com.example.santhosh.retrofitmovies.recyclerview.MoviesAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Dialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
	
	private static final String TAG = com.example.santhosh.retrofitmovies.MainActivity.class.getSimpleName();
	private String urlJsonArry = "http://www.myapifilms.com/imdb/inTheaters?token=5d4b55e6-5244-417a-b1a1-1a5be613251d&format=json&language=en-us/";
	private RecyclerView rv;
	JSONArray jsonArray;
	JSONObject jsonObject;
	private MoviesAdapter moviesAdapter;
	MovieInterface movieInterface;
	private static final  String token = "5d4b55e6-5244-417a-b1a1-1a5be613251d";
	private static final String format = "json";
	private static final String language = "language=en-us/";
	
	List<InTheater> theaterList;
	
	/**
	 * Simple Dialog used to show the splash screen
	 */
	//protected Dialog mSplashDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rv= findViewById(R.id.recycler_view);
		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((MainActivity.this));
		rv.setLayoutManager(layoutManager);
		rv.setItemAnimator(new DefaultItemAnimator());
		rv.setAdapter(moviesAdapter);
		
		
		/*MyStateSaver data = (MyStateSaver) getLastNonConfigurationInstance();
		if (data != null) {
			// Show splash screen if still loading
			if (data.showSplashScreen) {
				showSplashScreen();
			}
			setContentView(R.layout.activity_main);
			
			// Rebuild your UI with your saved state here
		} else {
			showSplashScreen();
			setContentView(R.layout.activity_main);
			// Do your heavy loading here on a background thread
		}
		*/
		
		//call to Interface
		movieInterface = MovieClient.getClient().create(MovieInterface.class);
		
		movieInterface.fetchMovies().enqueue(new Callback<Example>() {
			@Override
			public void onResponse(Call<Example> call, Response<Example> response) {
				System.out.println(response);
				theaterList = response.body().getData().getInTheaters();
				/*for (int i = 0; i<theaterList.size();i++){
					moviesAdapter = new MoviesAdapter(theaterList.get(i).getMovies(),MainActivity.this);
				}*/
				moviesAdapter = new MoviesAdapter(theaterList.get(0).getMovies(),MainActivity.this);
				moviesAdapter.notifyDataSetChanged();
			}
			
			@Override
			public void onFailure(Call<Example> call, Throwable t) {
			
			}
		});
	}
	
	/**
	 * Removes the Dialog that displays the splash screen
	 */
	/*protected void removeSplashScreen() {
		if (mSplashDialog != null) {
			mSplashDialog.dismiss();
			mSplashDialog = null;
		}
	}
	
	protected void showSplashScreen() {
		mSplashDialog = new Dialog(this, R.style.SplashScreen);
		mSplashDialog.setContentView(R.layout.splash);
		mSplashDialog.setCancelable(false);
		mSplashDialog.show();
		
		// Set Runnable to remove splash screen just in case
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				removeSplashScreen();
			}
		}, 3000);
	}*/
}
