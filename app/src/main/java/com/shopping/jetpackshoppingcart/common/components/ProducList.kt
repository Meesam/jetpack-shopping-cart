package com.shopping.jetpackshoppingcart.common.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProductList(modifier: Modifier = Modifier) {
    val itemsList = (0..50).toList()
    val itemsIndexedList = listOf("A", "B", "C")

    val itemModifier = Modifier
        .border(1.dp, Color.Blue)
        .height(80.dp)
        .wrapContentSize()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
    ) {
        items(itemsList) {
           Box(modifier.padding(5.dp)) {
               ProductItem()
           }
        }
    }
}

@Composable
@Preview
fun ProductionListPreview(modifier: Modifier = Modifier) {
    ProductList()
}