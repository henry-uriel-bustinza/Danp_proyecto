package com.example.proyectofinaldanp.Data.RegadoDetalle

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "regadoDetalle")
data class RegadoDetalleEntity(
    @PrimaryKey val id:Int,
    @ColumnInfo val id_planta:Int,
    @ColumnInfo val id_regado:Int,
    @ColumnInfo val descripcion:String?,
    @ColumnInfo val horaInicio:String?,
    @ColumnInfo val horaFin:String?,
    @ColumnInfo val tiempoRegado:String?,
    @ColumnInfo val nivelHumedad:Int,
    @ColumnInfo val id_estadoHumedad:Int,
    @ColumnInfo val ponosticoTiempoHumedo:String?,
    @ColumnInfo val fechaPronosticoProximoRegado:String?,
    @ColumnInfo val estado:String?,
    @ColumnInfo val fechaCreacion:String?,
    @ColumnInfo val fechaModificacion: String?
)
