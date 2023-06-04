package com.example.porject3_mobile1

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations{
    val Route : String
    val icon : ImageVector
    val Title : String
}
object Login : Destinations{
    override val Route: String = "Login"
    override val icon : ImageVector = Icons.Filled.Home
    override val Title: String = "Login"
}
object Welcome : Destinations{
    override val Route: String = "Welcome"
    override val icon : ImageVector = Icons.Filled.Settings
    override val Title: String = "Welcome"
}