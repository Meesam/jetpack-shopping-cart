package com.shopping.jetpackshoppingcart.common.utils

import androidx.compose.ui.graphics.vector.ImageVector

data class CategoryItem(
    val title:String = "",
    val description:String = "",
    val icon : ImageVector,
    var isSelected:Boolean = false
)
