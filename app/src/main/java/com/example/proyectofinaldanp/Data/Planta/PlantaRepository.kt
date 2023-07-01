package com.example.proyectofinaldanp.Data.Planta

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.proyectofinaldanp.AppDatabase

class PlantaRepository(private val appDatabase: AppDatabase) {

    suspend fun getAllPlanta(): List<PlantaEntity>{
        return appDatabase.plantaDao().getAll()
    }

    suspend fun getPlanta(plantaId: Int): PlantaEntity{
        return appDatabase.plantaDao().getPlanta(plantaId)
    }

    suspend fun insertPlanta(PlantaEntity: PlantaEntity){
        appDatabase.plantaDao().insert(PlantaEntity)
    }

    suspend fun deletePlanta(PlantaEntity: PlantaEntity){
        appDatabase.plantaDao().delete(PlantaEntity)
    }

    suspend fun updatePlanta(PlantaEntity: PlantaEntity){
        appDatabase.plantaDao().update(PlantaEntity)
    }
}