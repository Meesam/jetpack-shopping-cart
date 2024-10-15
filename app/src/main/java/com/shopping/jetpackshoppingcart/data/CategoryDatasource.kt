package com.shopping.jetpackshoppingcart.data

import com.shopping.jetpackshoppingcart.network.ICategoryApiService

class CategoryDatasource(private val categoryApiService:ICategoryApiService) {

  suspend fun getCategoryList() = categoryApiService.getCategoryList()
}