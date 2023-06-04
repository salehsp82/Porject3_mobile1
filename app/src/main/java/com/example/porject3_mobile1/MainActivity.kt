package com.example.porject3_mobile1

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavController

@Composable
fun MyBottomNavigation(navController: NavController){
    val destinationList = listOf<Destinations>(Login, Welcome)
    val selectedIndex = rememberSaveable {
        mutableStateOf(0)
    }
    BottomNavigation() {
        destinationList.forEachIndexed { index, destination ->
            BottomNavigationItem(
                label = {Text(text = destination.Title)},
                icon = {Icon(imageVector = destination.icon, contentDescription = destination.Title)},
                selected = index == selectedIndex.value,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destinationList[index].Route){
                        popUpTo(Login.Route)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}



