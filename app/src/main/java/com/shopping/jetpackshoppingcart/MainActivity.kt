package com.shopping.jetpackshoppingcart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shopping.jetpackshoppingcart.common.components.AppHeader
import com.shopping.jetpackshoppingcart.common.components.gradiantBakGround
import com.shopping.jetpackshoppingcart.screens.home.HomeScreen
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

@Composable
fun AppScaffold(){
    Scaffold() { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(brush = gradiantBakGround())
            .padding(innerPadding)
        ){
            HomeScreen()
        }
    }
}

@Preview
@Composable
private fun AppScaffoldPreview() {
    AppScaffold()
}

