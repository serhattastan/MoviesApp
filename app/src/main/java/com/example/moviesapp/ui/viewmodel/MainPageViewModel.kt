package com.example.moviesapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesapp.data.entity.Movie
import com.example.moviesapp.data.repo.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainPageViewModel @Inject constructor(var mrepo : MoviesRepository) : ViewModel() {
    var movieList = MutableLiveData<List<Movie>>()

    init {
        loadMovies()
    }

    fun loadMovies(){
        CoroutineScope(Dispatchers.Main).launch {
            movieList.value = mrepo.loadMovies()
        }
    }
}