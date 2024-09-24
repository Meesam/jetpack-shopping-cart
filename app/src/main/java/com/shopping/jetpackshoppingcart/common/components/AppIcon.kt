package com.shopping.jetpackshoppingcart.common.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun AppIcon(icon: ImageVector, description:String, modifier: Modifier? = Modifier){
    Surface(
        shape = CircleShape,
        color = Color(0XFF000000),
        shadowElevation = 5.dp,
        contentColor = Color(0XFFC5C6D0)
    ) {
        modifier?.padding(5.dp)?.let {
            Box(
                contentAlignment = Alignment.Center, modifier = it
            ) {
                Icon(imageVector = icon, contentDescription = description)
            }
        }

    }
}