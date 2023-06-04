package com.example.porject3_mobile1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun HomeScreen (){
    val navController = rememberNavController()
    Scaffold(bottomBar = { MyBottomNavigation(navController = navController)}) {
        Box(modifier = Modifier.padding(it)){
            NavHost(navController = navController, startDestination = Login.Route ){
                composable (Login.Route){ login (navController)
                }
                composable (Welcome.Route){ welcome (navController)
                }
            }
        }
    }
}



@Composable
fun login(navController: NavHostController) {
    Column() {
        Text(text = "login")
        Button(onClick = { navController.navigate(Welcome.Route) }) {
            Text(text = "Login")
        }
    }
}


@Composable
fun welcome(navController: NavHostController) {
    Column() {
        Text(text = "Welcome")
        Button(onClick = { navController.navigate(Login.Route) }) {
            Text(text = "Go to Login")
        }
    }
}
