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
   val color1 = listOf(
       Color(0XFF93a5cf),
       Color(0XFFe4efe9),
   )
    val color2 = listOf(
        Color(0XFFaccbee),
        Color(0XFFe7f0fd),
    )
    val listOfItems = listOf(
       CarouselItem(
           title = "20% flat discount",
           R.drawable.ic_image_1,
           color1
       ),
       CarouselItem(
           title = "12% flat discount",
           R.drawable.ic_image_2,
           color2
       ),
        CarouselItem(
            title = "10% flat discount",
            R.drawable.ic_image_3,
            color1
        ),
        CarouselItem(
            title = "5% flat discount",
            R.drawable.ic_image_4,
            color2
        ),
    )

  val pagerState = rememberPagerState{
      listOfItems.size
  }
    Surface(
        shadowElevation = 20.dp,
        color = Color(0XFF28231D),
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
            ) {page ->
                PageItem(listOfItems[page])
            }
        }
    }
}

@Composable
fun PageItem(item : CarouselItem){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(brush = gradiantBakGround(false, listOfColors = item.colorList))
            .padding(20.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(0.5f)
        ) {
            Text(item.title, color = Color(0XFF868f96), fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Image(
            painter = painterResource(id = item.image),
            contentDescription = null,
            modifier = Modifier.weight(0.5f).fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun HomeCarouselPreview() {
    HomeCarousel()
}