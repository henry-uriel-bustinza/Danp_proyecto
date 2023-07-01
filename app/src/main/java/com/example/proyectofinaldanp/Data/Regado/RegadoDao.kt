package com.example.proyectofinaldanp.Data.Regado

import androidx.room.*

@Dao
interface RegadoDao {
    @Query("SELECT * FROM regado")
    fun getAll(): List<RegadoEntity>

    @Query("SELECT * FROM regado WHERE id=:regadoId")
    fun getRegado(regadoId: Int): RegadoEntity

    @Insert
    fun insert(RegadoEntity: RegadoEntity)

    @Delete
    fun delete(RegadoEntity: RegadoEntity)

    @Update
    fun update (RegadoEntity: RegadoEntity)
}