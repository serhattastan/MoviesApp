package com.example.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.moviesapp.R
import com.example.moviesapp.data.entity.Movie
import com.example.moviesapp.databinding.FragmentDetailBinding
import com.example.moviesapp.databinding.FragmentMainPageBinding
import com.example.moviesapp.ui.adapter.MoviesAdapter
import com.example.moviesapp.ui.viewmodel.MainPageViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding
    private lateinit var viewModel: MainPageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main_page, container, false)

        viewModel.movieList.observe(viewLifecycleOwner){
            val moviesAdapter = MoviesAdapter(requireContext(),it)
            binding.moviesAdapter = moviesAdapter
        }

        binding.toolbarMainPageTitle = "Movies"


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : MainPageViewModel by viewModels()
        viewModel = tempViewModel
    }

}