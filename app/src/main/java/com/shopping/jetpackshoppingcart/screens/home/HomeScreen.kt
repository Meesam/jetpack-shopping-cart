package com.shopping.jetpackshoppingcart.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shopping.jetpackshoppingcart.common.components.AppHeader
import com.shopping.jetpackshoppingcart.common.components.CategoryList
import com.shopping.jetpackshoppingcart.common.components.HomeCarousel
import com.shopping.jetpackshoppingcart.common.components.ProductList
import com.shopping.jetpackshoppingcart.common.components.SpacerHeight
import com.shopping.jetpackshoppingcart.common.components.gradiantBakGround

@Composable
fun HomeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = gradiantBakGround(
                listOfColors = listOf(
                    Color(0XFFFDFBFB),
                    Color(0XFFEBEDEE)
                )
            )
        )
        .padding(top = 10.dp, start = 10.dp, end = 10.dp)
    ){
        Column(modifier = Modifier
            .fillMaxSize()) {
            AppHeader()
            SpacerHeight(20.dp)
            HomeCarousel()
            SpacerHeight(20.dp)
            CategoryList()
            SpacerHeight(20.dp)
            ProductList()
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}