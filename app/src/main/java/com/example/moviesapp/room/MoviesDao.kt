package com.example.moviesapp.room

import androidx.room.Dao
import androidx.room.Query
import com.example.moviesapp.data.entity.Movie

@Dao
interface MoviesDao {
    @Query("SELECT * FROM movie")
    suspend fun getMovies() : List<Movie>
}