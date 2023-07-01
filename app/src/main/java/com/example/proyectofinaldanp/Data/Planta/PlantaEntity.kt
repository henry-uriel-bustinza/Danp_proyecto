package com.example.proyectofinaldanp.Data.Planta

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "planta")
data class PlantaEntity(
    @PrimaryKey val id:Int,
    @ColumnInfo val nombre:String?,
    @ColumnInfo val descripcion:String?,
    @ColumnInfo val imagen:Int,
    @ColumnInfo val nivelHumedad:Int,
    @ColumnInfo val id_estadoHumedad:Int,
    @ColumnInfo val pronosticoTiempoHumedo:String?,
    @ColumnInfo val fechaPronosticoProximoRegado:String?,
    @ColumnInfo val nivelHumedadRecomendado:Int,
    @ColumnInfo val tiempoHumedadEstandar:String?,
    @ColumnInfo val tiempoRegadoRecomendado:Int,
    @ColumnInfo val estado:String?,
    @ColumnInfo val fechaCreacion:String?,
    @ColumnInfo val fechaModificacion: String?
    )
