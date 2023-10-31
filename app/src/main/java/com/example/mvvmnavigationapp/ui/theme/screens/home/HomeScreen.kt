package com.example.mvvmnavigationapp.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigationapp.ui.theme.MVVMNavigationAppTheme


@Composable
fun HomeScreen(naveController:NavHostController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ }) {
           Text(text = "Products")
        }
        Button(onClick = { /*TODO*/ }) {
           Text(text = "About")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "signup")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    MVVMNavigationAppTheme {


    HomeScreen(naveController = rememberNavController())
    }
}