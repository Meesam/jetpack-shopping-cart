package com.shopping.jetpackshoppingcart.common.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun gradiantBakGround(isVertical:Boolean = true,listOfColors:List<Color> = listOf(
    Color(0XFF28231D),
    Color(0XFF000000)
)) :Brush{
    val endOffset = if(isVertical){
        Offset(0f, Float.POSITIVE_INFINITY )
    }else {
        Offset(Float.POSITIVE_INFINITY, 0f )
    }
    return Brush.linearGradient(
        colors = listOfColors,
        start = Offset.Zero,
        end = endOffset
    )
}

@Preview
@Composable
private fun BoxView() {
    Box(modifier = Modifier
        .height(240.dp)
        .width(240.dp)
        .background(brush = gradiantBakGround())
    )
}