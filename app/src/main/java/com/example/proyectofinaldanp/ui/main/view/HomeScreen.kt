package com.example.proyectofinaldanp.ui.main.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectofinaldanp.ui.main.MainDestinations
import com.example.proyectofinaldanp.ui.theme.ProyectoFinalDANPTheme

@Composable
fun HomeScreen(onNavigate: (MainDestinations)->Unit){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        backgroundColor = MaterialTheme.colors.background,
        floatingActionButton = {
            ExtendedFloatingActionButton(text = { Text("Add")},
                onClick = {
                    onNavigate(MainDestinations.AddPlantaScreen)
                },
                icon = {
                    Icon(Icons.Filled.Add,
                        contentDescription = "Add"
                )
            })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            
        }
    }
}

@Composable
fun FakeHomeScreen(){
    ProyectoFinalDANPTheme{
        HomeScreen(onNavigate = { })
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    FakeHomeScreen()
}