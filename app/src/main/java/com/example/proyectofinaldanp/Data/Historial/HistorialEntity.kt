package com.example.proyectofinaldanp.Data.Historial

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "historial")
data class HistorialEntity(
    @PrimaryKey val id:Int,
    @ColumnInfo val descripcion:String?,
    @ColumnInfo val accion:Int,
    @ColumnInfo val id_accion:Int,
    @ColumnInfo val estado:String?,
    @ColumnInfo val fechaCreacion:String?,
    @ColumnInfo val fechaModificacion: String?
)
