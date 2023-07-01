package com.example.proyectofinaldanp.Data.Medicion

import androidx.room.*

@Dao
interface MedicionDao {
    @Query("SELECT * FROM medicion")
    fun getAll(): List<MedicionEntity>

    @Query("SELECT * FROM medicion WHERE id=:medicionId")
    fun getMedicion(medicionId: Int): MedicionEntity

    @Insert
    fun insert(MedicionEntity: MedicionEntity)

    @Delete
    fun delete(MedicionEntity: MedicionEntity)

    @Update
    fun update (MedicionEntity: MedicionEntity)
}