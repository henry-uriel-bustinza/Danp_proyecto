package com.example.proyectofinaldanp.Data.Planta

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PlantaDao {
    @Query("SELECT * FROM planta")
    fun getAll(): List<PlantaEntity>

    @Query("SELECT * FROM planta WHERE id=:plantaId")
    fun getPlanta(plantaId: Int): PlantaEntity

    @Insert
    fun insert(PlantaEntity: PlantaEntity)

    @Delete
    fun delete(PlantaEntity: PlantaEntity)

    @Update
    fun update (PlantaEntity: PlantaEntity)
}