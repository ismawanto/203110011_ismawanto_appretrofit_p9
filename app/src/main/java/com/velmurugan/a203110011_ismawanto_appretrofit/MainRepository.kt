package com.velmurugan.a203110011_ismawanto_appretrofit

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}