package com.example.proyectofinaldanp.Data.EstadoHumedad

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "estadoHumedad")
data class EstadoHumedadEntity (
    @PrimaryKey val id:Int,
    @ColumnInfo val nombre:Int,
    @ColumnInfo val nivelHumedadMinima:Int,
    @ColumnInfo val nivelHumedadMaxima:Int,
    @ColumnInfo val estado:String?,
    @ColumnInfo val fechaCreacion:String?,
    @ColumnInfo val fechaModificacion: String?
        )