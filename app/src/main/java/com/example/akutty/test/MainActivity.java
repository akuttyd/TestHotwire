package com.example.akutty.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.akutty.test.view.IMovieListingView;
import com.example.akutty.test.view.MovieListingView;

public class MainActivity extends AppCompatActivity implements IMovieListingView, IRouter{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //Presenter will reside here . (this,this)
    }
}
