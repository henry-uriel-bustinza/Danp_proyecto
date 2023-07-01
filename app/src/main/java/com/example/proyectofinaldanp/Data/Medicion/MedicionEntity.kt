package com.example.proyectofinaldanp.Data.Medicion

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medicion")
data class MedicionEntity(
    @PrimaryKey val id:Int,
    @ColumnInfo val id_planta:Int,
    @ColumnInfo val descripcion:String?,
    @ColumnInfo val nivelHumedad:Int,
    @ColumnInfo val id_estadoHumedad:Int,
    @ColumnInfo val pronosticoTiempoHumedo:String?,
    @ColumnInfo val fechaPronosticoProximoRegado:String?,
    @ColumnInfo val estado:String?,
    @ColumnInfo val fechaCreacion:String?,
    @ColumnInfo val fechaModificacion: String?
)
