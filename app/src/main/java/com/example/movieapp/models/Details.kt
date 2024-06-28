package com.example.movieapp.models

data class Details (
    val actors: String="",
    val awards: String="",
    val country: String="",
    val director: String="",
    val genres: List<String> = emptyList(),
    val id: Int=0,
    val images: List<String> = emptyList(),
    val imbd_rating: String="",
    val imbd_id: String="",
    val imbd_votes: String="",
    val metascrore: String="",
    val plot: String="",
    val poster: String="",
    val rated: String="",
    val released: String="",
    val runtime: String="",
    val title: String="",
    val type: String="",
    val writer: String="",
    val year: String=""
)