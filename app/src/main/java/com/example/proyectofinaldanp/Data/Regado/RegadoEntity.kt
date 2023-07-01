package com.example.proyectofinaldanp.Data.Regado

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "regado")
data class RegadoEntity(
    @PrimaryKey val id:Int,
    @ColumnInfo val descripcion: String?,
    @ColumnInfo val horaInicio:String?,
    @ColumnInfo val horaFin:String?,
    @ColumnInfo val tiempoRegado:String?,
    @ColumnInfo val estado:String?,
    @ColumnInfo val fechaCreacion:String?,
    @ColumnInfo val fechaModificacion: String?
)
