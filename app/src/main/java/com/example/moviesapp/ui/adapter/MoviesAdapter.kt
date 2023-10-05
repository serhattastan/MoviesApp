package com.example.moviesapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R
import com.example.moviesapp.data.entity.Movie
import com.example.moviesapp.databinding.CardDesignBinding
import com.example.moviesapp.databinding.FragmentMainPageBinding
import com.example.moviesapp.ui.fragment.MainPageFragment
import com.example.moviesapp.ui.fragment.MainPageFragmentDirections
import com.google.android.material.snackbar.Snackbar

class MoviesAdapter(var mContext : Context, var movieList : List<Movie>) : RecyclerView.Adapter<MoviesAdapter.CardDesignHolder>() {
    inner class CardDesignHolder(var design : CardDesignBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding : CardDesignBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_design, parent, false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val movie = movieList.get(position)
        val d = holder.design

        d.imageViewCard.setImageResource(mContext.resources.getIdentifier(movie.image, "drawable", mContext.packageName))
        //DataBinding
        d.movieObject = movie

        d.cardViewMovie.setOnClickListener{
            val transfer = MainPageFragmentDirections.actionMainPageFragmentToDetailFragment(movie = movie)
            Navigation.findNavController(it).navigate(transfer)
        }
        d.buttonCard.setOnClickListener {
            Snackbar.make(it,"${movie.name} added to cart!", Snackbar.LENGTH_SHORT).show()
        }
    }


}