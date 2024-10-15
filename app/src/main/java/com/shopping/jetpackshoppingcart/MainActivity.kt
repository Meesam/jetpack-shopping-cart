package com.shopping.jetpackshoppingcart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Person2
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shopping.jetpackshoppingcart.common.components.gradiantBakGround
import com.shopping.jetpackshoppingcart.models.NavItems
import com.shopping.jetpackshoppingcart.screens.cart.CartScreen
import com.shopping.jetpackshoppingcart.screens.home.HomeScreen
import com.shopping.jetpackshoppingcart.screens.profile.ProfileScreen
import com.shopping.jetpackshoppingcart.ui.theme.JetpackShoppingCartTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackShoppingCartTheme {
                AppScaffold()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold(){
    val navItems = listOf(
        NavItems(title = "Home", Icons.Default.Home),
        NavItems(title = "Profile", Icons.Default.Person),
        NavItems(title = "Setting", Icons.Default.Settings)
    )
    var selectedItem by remember {
        mutableIntStateOf(0)
    }
    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color.LightGray,
                contentColor =  Color.DarkGray,
                tonalElevation = 10.dp,
            ) {
                navItems.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                        },
                        icon = {
                            Icon(imageVector = navItem.icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(text = navItem.title)
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.White,
                            selectedTextColor = Color.DarkGray,
                            unselectedIconColor = Color.DarkGray,
                            unselectedTextColor = Color.DarkGray
                        ),
                        alwaysShowLabel = false,
                    )
                }
            }
        },
        topBar ={
            TopAppBar(
                title = {
                    Text(text = "Shopping", color = Color.DarkGray)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray,
                    titleContentColor = Color.DarkGray
                ),
                navigationIcon = {
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.DarkGray
                        )
                    ) {
                        Icon(imageVector = Icons.Filled.Menu , contentDescription = "")
                    }
                },
                actions = {
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.DarkGray
                        )
                    ) {
                        Icon(imageVector = Icons.Filled.ShoppingCart , contentDescription = "")
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.DarkGray
                        )
                    ) {
                        Icon(imageVector = Icons.Filled.Settings , contentDescription = "")
                    }
                    FilledIconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.DarkGray
                        )
                    ) {
                        Icon(imageVector = Icons.Filled.Person2 , contentDescription = "")
                    }
                }
            )
        },

    ) { innerPadding ->
        Column(modifier = Modifier
           .padding(innerPadding)
        ){
            ContentScreen(selectedItem)
        }
    }
}

@Composable
fun ContentScreen(selectedIndex:Int){
    when(selectedIndex){
        0 -> HomeScreen()
        1 -> CartScreen()
        2 -> ProfileScreen()
    }
}

@Preview
@Composable
private fun AppScaffoldPreview() {
    AppScaffold()
}

