package com.shopping.jetpackshoppingcart.common.utils

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class CarouselItem(
    val title:String = "",
    val image : Int,
    val colorList : List<Color>
)
