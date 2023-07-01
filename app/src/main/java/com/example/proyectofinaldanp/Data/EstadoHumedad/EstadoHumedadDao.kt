package com.example.proyectofinaldanp.Data.EstadoHumedad

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface EstadoHumedadDao {
    @Query("SELECT * FROM estadoHumedad")
    fun getAll(): List<EstadoHumedadEntity>

    @Query("SELECT * FROM estadoHumedad WHERE id=:estadoHumedadId")
    fun getEstadoHumedad(estadoHumedadId: Int): EstadoHumedadEntity

    @Insert
    fun insert(EstadoHumedadEntity: EstadoHumedadEntity)

    @Delete
    fun delete(EstadoHumedadEntity: EstadoHumedadEntity)

    @Update
    fun update (EstadoHumedadEntity: EstadoHumedadEntity)
}