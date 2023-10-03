package com.example.moviesapp.data.entity

import java.io.Serializable

data class Movie(
    var id : Int,
    var name : String,
    var image : String,
    var price : Int) : Serializable
