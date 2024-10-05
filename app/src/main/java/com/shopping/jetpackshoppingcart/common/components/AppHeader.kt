package com.shopping.jetpackshoppingcart.common.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalPostOffice
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shopping.jetpackshoppingcart.ui.theme.Typography


@Composable
fun AppHeader(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
        ) {
            AppIcon(Icons.Default.Person, "user", bgColor = 0XFFFFFFFF )
            SpacerWidth(10.dp)
            Text(text = "Your Style", style = Typography.titleLarge, color = Color(0XFF28231D))
        }

        Row {
            AppIcon(Icons.Default.ShoppingCart, "cart",bgColor = 0XFFFFFFFF)
            SpacerWidth(10.dp)
            AppIcon(Icons.Default.LocalPostOffice, "message",bgColor = 0XFFFFFFFF)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppHeaderPreview() {
    AppHeader()
}