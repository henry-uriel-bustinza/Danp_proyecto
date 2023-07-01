package com.example.proyectofinaldanp.ui.main

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectofinaldanp.AppDatabase
import com.example.proyectofinaldanp.ui.main.view.AddPlanta
import com.example.proyectofinaldanp.ui.main.view.HomeScreen
import com.example.proyectofinaldanp.ui.theme.ProyectoFinalDANPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoFinalDANPTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = MainDestinations.HomeScreen.route) {
                    composable(MainDestinations.HomeScreen.route) {
                        HomeScreen(onNavigate = { screen->
                            navigate(navHostController = navController, destinations = screen)
                        })
                    }
                    composable(MainDestinations.AddPlantaScreen.route) {
                        AddPlanta()
                    }
                    /*...*/
                }

                //val context = LocalContext.current
                //val repository = Repository(AppDatabase.getInstance(context.applicationContext))
                //RoomSample(repository)
            }
        }
    }

    private fun navigate(navHostController: NavHostController, destinations: MainDestinations){
        navHostController.navigate(destinations.route){
            popUpTo(navHostController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true
        }
    }
}
