package com.example.moviesapp.data.datasource

import com.example.moviesapp.data.entity.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesDataSource {
    suspend fun loadMovies() : List<Movie> =
        withContext(Dispatchers.IO){
            val movieList = ArrayList<Movie>()
            val m1 = Movie(1,"Django","django",36)
            val m2 = Movie(2,"Interstellar","interstellar",24)
            val m3 = Movie(3,"Inception","inception",48)
            val m4 = Movie(4,"The Hateful Eight","thehatefuleight",44)
            val m5 = Movie(5,"The Pianist","thepianist",98)
            val m6 = Movie(6,"Anadoluda","anadoluda",45)
            movieList.add(m1)
            movieList.add(m2)
            movieList.add(m3)
            movieList.add(m4)
            movieList.add(m5)
            movieList.add(m6)
            return@withContext movieList
        }



}