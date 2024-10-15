package com.shopping.jetpackshoppingcart.network

import com.shopping.jetpackshoppingcart.models.Category
import com.shopping.jetpackshoppingcart.models.CategoryListResponse
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST

interface ICategoryApiService {

    @GET("getAllCategory")
    suspend fun getCategoryList():CategoryListResponse

    @GET("getCategory/id")
    suspend fun getCategoryById(id:Int):Category

    @POST("addNewCategory")
    suspend fun addNewCategory()

    @POST("updateCategory")
    suspend fun updateCategory()

    @DELETE("deleteCategory/id")
    suspend fun deleteCategory(id:Int)

}