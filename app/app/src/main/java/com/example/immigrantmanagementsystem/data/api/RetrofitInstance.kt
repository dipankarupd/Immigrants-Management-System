//package com.example.immigrantmanagementsystem.data.api
//
//import com.example.immigrantmanagementsystem.utils.retrofit.Constants.Companion.BASE_URL
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//object RetrofitInstance {
//
//    private val retrofit by lazy {
//        Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    val api: RestApi by lazy {
//        retrofit.create(RestApi::class.java)
//    }
//}