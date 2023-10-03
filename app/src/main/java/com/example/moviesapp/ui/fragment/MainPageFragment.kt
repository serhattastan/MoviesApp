package com.example.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.moviesapp.R
import com.example.moviesapp.data.entity.Movie
import com.example.moviesapp.databinding.FragmentDetailBinding
import com.example.moviesapp.databinding.FragmentMainPageBinding
import com.example.moviesapp.ui.adapter.MoviesAdapter

class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

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

        binding.toolbarMainPage.title = "Movies"

        binding.recyclerViewMainPage.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val moviesAdapter = MoviesAdapter(requireContext(),movieList)
        binding.recyclerViewMainPage.adapter = moviesAdapter



        return binding.root
    }

}