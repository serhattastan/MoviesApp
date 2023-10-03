package com.example.moviesapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.data.entity.Movie
import com.example.moviesapp.databinding.CardDesignBinding
import com.example.moviesapp.databinding.FragmentMainPageBinding

class MoviesAdapter(var mContext : Context, var movieList : List<Movie>) : RecyclerView.Adapter<MoviesAdapter.CardDesignHolder>() {
    inner class CardDesignHolder(var design : CardDesignBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val movie = movieList.get(position)
        val d = holder.design

        d.imageViewCard.setImageResource(mContext.resources.getIdentifier(movie.image, "drawable", mContext.packageName))
        d.textViewPriceCard.text = "${movie.price} ₺"
    }


}