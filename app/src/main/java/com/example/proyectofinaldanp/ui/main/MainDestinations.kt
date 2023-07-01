package com.example.proyectofinaldanp.ui.main

sealed class MainDestinations (val route:String){
    object HomeScreen:MainDestinations(route="home")
    object AddPlantaScreen:MainDestinations(route="addPlanta")
}
