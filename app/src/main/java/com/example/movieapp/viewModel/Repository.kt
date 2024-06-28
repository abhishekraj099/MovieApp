package com.example.movieapp.viewModel

import com.example.movieapp.models.MovieList
import com.example.movieapp.utils.RetrofitInstance
import retrofit2.Response

class Repository {
   suspend fun getMovieList(page:Int): Response<MovieList> {
        return RetrofitInstance.api.getMovies(page)
    }
}