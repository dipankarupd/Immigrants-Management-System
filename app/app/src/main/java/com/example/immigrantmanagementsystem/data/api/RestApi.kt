//package com.example.immigrantmanagementsystem.data.api
//
//import com.example.immigrantmanagementsystem.data.model.ImmigrantInfoRequest
//import com.example.immigrantmanagementsystem.data.model.ImmigrantInfoResponse
//import retrofit2.Call
//import retrofit2.Response
//import retrofit2.http.Body
//import retrofit2.http.Headers
//import retrofit2.http.POST
//
//interface RestApi {
//
//    // declare all the REST request methods with individual paths for the endpoint
//    @Headers("Content-Type: application/json")
//    @POST("immigrants")
//    suspend fun addImmigrants(
//        @Body immigrantInfo: ImmigrantInfoRequest
//    ): Response<ImmigrantInfoResponse>
//}