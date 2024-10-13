package com.shopping.jetpackshoppingcart.screens.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.shopping.jetpackshoppingcart.common.components.gradiantBakGround

@Composable
fun CartScreen() {
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
        }
    }
}