package com.shopping.jetpackshoppingcart.common.components

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bed
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Chair
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Girl
import androidx.compose.material.icons.filled.Kitchen
import androidx.compose.material.icons.filled.Man
import androidx.compose.material.icons.filled.PersonalInjury
import androidx.compose.material.icons.filled.SportsBaseball
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shopping.jetpackshoppingcart.common.utils.CategoryItem

@Composable
fun CategoryList(){

    val categoryItems = remember {
        mutableStateListOf(CategoryItem(
            title = "Sports",
            description = "",
            icon = Icons.Filled.SportsBaseball
        ),
            CategoryItem(
                title = "Hiking",
                description = "",
                icon = Icons.Filled.DownhillSkiing
            ),
            CategoryItem(
                title = "Kids",
                description = "",
                icon = Icons.Filled.PersonalInjury
            ),
            CategoryItem(
                title = "Men",
                description = "",
                icon = Icons.Filled.Man
            ),
            CategoryItem(
                title = "Woman",
                description = "",
                icon = Icons.Filled.Girl
            ),
            CategoryItem(
                title = "Kitchen",
                description = "",
                icon = Icons.Filled.Kitchen
            ),
            CategoryItem(
                title = "Books",
                description = "",
                icon = Icons.Filled.Book
            ),
            CategoryItem(
                title = "Beds",
                description = "",
                icon = Icons.Filled.Bed
            ),
            CategoryItem(
                title = "Furniture",
                description = "",
                icon = Icons.Filled.Chair
            ))
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        LazyRow(contentPadding = PaddingValues(horizontal = 5.dp), state = rememberLazyListState()){
            items(categoryItems){item->
                CategoryItem(item = item, onSelect = {value->
                    categoryItems.forEach { category ->
                        category.isSelected = category.title == value
                    }
                })
                SpacerWidth()
            }
        }
    }
}

@Preview
@Composable
fun CategoryListPreview(){
    CategoryList()
}