package com.example.proyectofinaldanp.ui.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectofinaldanp.Data.Planta.PlantaEntity
import com.example.proyectofinaldanp.ui.theme.ProyectoFinalDANPTheme
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun PlantaCard(modifier: Modifier = Modifier, planta: PlantaEntity, onSelectedPlanta: (planta: PlantaEntity)->Unit){

    Card(modifier = Modifier.clickable{onSelectedPlanta(planta)}, backgroundColor = MaterialTheme.colors.surface ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(text = "planta.nombre", fontWeight = FontWeight.Bold, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(text = "planta.descripcion", maxLines = 3, overflow = TextOverflow.Ellipsis)
        }
    }
}

fun formatDate(date:Date):String=SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(date)

@Composable
fun FakePlantaCard(){
    ProyectoFinalDANPTheme() {
        PlantaCard(planta = PlantaEntity(
            0,"ds","re",
            5,20,0,
            "sd", "ZonedDateTime.now().toString()",
            2,"e",5,
            "sd","sd","sd"), onSelectedPlanta = { })
        
    }
}

@Preview
@Composable
fun PlantaCardPreview(){
    FakePlantaCard()
}