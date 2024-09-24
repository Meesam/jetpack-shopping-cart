package com.shopping.jetpackshoppingcart.common.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shopping.jetpackshoppingcart.R
import com.shopping.jetpackshoppingcart.common.utils.CarouselItem


@Composable
fun HomeCarousel(){
   val listOfItems = listOf(
       R.drawable.ic_image_1,
       R.drawable.ic_launcher_background
   )

  val pagerState = rememberPagerState{
      listOfItems.size
  }
    Surface(
        shadowElevation = 20.dp,
        color = Color(0XFF028231D),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(20.dp))
        )
        {
            HorizontalPager(
                state = pagerState,
                key ={ listOfItems[it]},
                pageSpacing = 10.dp
            ) {index ->
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(brush = gradiantBakGround(false))
                        .padding(20.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.weight(0.5f)
                    ) {
                        Text("2$index% flat discount", color = Color(0XFFC5C6D0), fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Image(
                        painter = painterResource(id = listOfItems[index] ),
                        contentDescription = null,
                        modifier = Modifier.weight(0.5f).fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
private fun HomeCarouselPreview() {
    HomeCarousel()
}