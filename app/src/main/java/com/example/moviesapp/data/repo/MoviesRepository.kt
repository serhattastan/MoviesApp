package com.example.moviesapp.data.repo

import com.example.moviesapp.data.datasource.MoviesDataSource
import com.example.moviesapp.data.entity.Movie

class MoviesRepository {
    var mds = MoviesDataSource()
    suspend fun loadMovies() : List<Movie> = mds.loadMovies()

}