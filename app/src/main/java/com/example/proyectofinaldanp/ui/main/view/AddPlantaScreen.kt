package com.example.proyectofinaldanp.ui.main.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectofinaldanp.ui.theme.ProyectoFinalDANPTheme

@Composable
fun AddPlanta(){
    var title by remember { mutableStateOf("") }
    var body by remember { mutableStateOf("") }
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.surface) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)) {
            TextField(modifier = Modifier.fillMaxWidth(), value = title, onValueChange = {newText->title = newText}, label = { Text("title")})
            Spacer(modifier = Modifier.height(15.dp))
            TextField(modifier = Modifier.fillMaxWidth(), value = body, onValueChange = {newText->body = newText}, label = { Text("Body")})
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Button(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Done, contentDescription = "Done", modifier = Modifier.size(ButtonDefaults.IconSize) )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text(text = "Save!")
                }
            }
        }
    }
}

@Composable
fun FakeAddPlanta(){
    ProyectoFinalDANPTheme {
        AddPlanta()
    }
}

@Preview
@Composable
fun AddPlantaPreview(){
    FakeAddPlanta()
}