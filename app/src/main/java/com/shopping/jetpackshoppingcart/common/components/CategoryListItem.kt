package com.shopping.jetpackshoppingcart.common.components


import android.util.Log
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SportsBasketball
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shopping.jetpackshoppingcart.common.utils.CategoryItem

@Composable
fun CategoryItem(item:CategoryItem, onSelect:(title:String)->Unit){

    FilterChip(
        selected = item.isSelected,
        onClick = {
            onSelect(item.title)
        },
        label = {
          Text(text = item.title)
        },
        shape = RoundedCornerShape(20.dp),
        leadingIcon = {
            Icon(imageVector = item.icon, contentDescription = null)
        },
        colors = FilterChipDefaults.filterChipColors(
            containerColor = Color(0XFFFFFFFF),
            labelColor = Color(0XFF868f96),
            iconColor = Color(0XFF868f96),
            selectedContainerColor = Color(0XFF28231D),
            selectedLabelColor = Color(0XFFC5C6D0),
            selectedLeadingIconColor = Color(0XFFC5C6D0)
        )
    )
}


@Preview
@Composable
private fun CategoryItemPreview() {
    val item =  CategoryItem(
        title = "Sports",
        icon = Icons.Filled.SportsBasketball,
        description = "",
        isSelected = false
    )
    //CategoryItem(item)
}