package com.example.proyectofinaldanp.Data.Historial

import androidx.room.*

@Dao
interface HistorialDao {
    @Query("SELECT * FROM historial")
    fun getAll(): List<HistorialEntity>

    @Query("SELECT * FROM historial WHERE id=:historialId")
    fun getHistorial(historialId: Int): HistorialEntity

    @Insert
    fun insert(HistorialEntity: HistorialEntity)

    @Delete
    fun delete(HistorialEntity: HistorialEntity)

    @Update
    fun update (HistorialEntity: HistorialEntity)
}