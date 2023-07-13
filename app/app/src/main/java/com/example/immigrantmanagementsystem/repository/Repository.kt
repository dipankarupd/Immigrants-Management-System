//package com.example.immigrantmanagementsystem.repository
//
//import com.example.immigrantmanagementsystem.data.api.RetrofitInstance
//import com.example.immigrantmanagementsystem.data.model.ImmigrantInfoRequest
//import com.example.immigrantmanagementsystem.data.model.ImmigrantInfoResponse
//import retrofit2.Response
//
//class Repository {
//
//    suspend fun pushImmigrant(immigrantInfoRequest: ImmigrantInfoRequest): Response<ImmigrantInfoResponse> {
//        return RetrofitInstance.api.addImmigrants(immigrantInfoRequest)
//    }
//}