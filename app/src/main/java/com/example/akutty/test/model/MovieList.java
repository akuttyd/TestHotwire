package com.example.akutty.test.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MovieList {

@SerializedName("movie")
private Movie movie;

/**
* 
* @return
* The movie
*/
public Movie getMovie() {
return movie;
}

/**
* 
* @param movie
* The movie
*/
public void setMovie(Movie movie) {
this.movie = movie;
}



}