package com.example.proyectofinaldanp.Data.RegadoDetalle

import androidx.room.*
import com.example.proyectofinaldanp.Data.Regado.RegadoEntity

@Dao
interface RegadoDetalleDao {
    @Query("SELECT * FROM regadoDetalle")
    fun getAll(): List<RegadoDetalleEntity>

    @Query("SELECT * FROM regadoDetalle WHERE id=:regadoDetalleId")
    fun getRegadoDetalle(regadoDetalleId:Int):RegadoDetalleEntity

    @Insert
    fun insert(RegadoDetalleEntity: RegadoDetalleEntity)

    @Delete
    fun delete(RegadoDetalleEntity: RegadoDetalleEntity)

    @Update
    fun update (RegadoDetalleEntity: RegadoDetalleEntity)
}