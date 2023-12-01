package com.example.moviesapp.data.datasource

import com.example.moviesapp.data.entity.Movie
import com.example.moviesapp.room.MoviesDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesDataSource(var mdao : MoviesDao) {
    suspend fun loadMovies() : List<Movie> =
        withContext(Dispatchers.IO){
            return@withContext mdao.getMovies()
        }



}