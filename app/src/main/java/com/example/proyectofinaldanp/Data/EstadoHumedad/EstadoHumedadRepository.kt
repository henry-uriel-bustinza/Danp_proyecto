package com.example.proyectofinaldanp.Data.EstadoHumedad

import com.example.proyectofinaldanp.AppDatabase
import kotlinx.coroutines.flow.Flow

class EstadoHumedadRepository(private val appDatabase: AppDatabase) {

    suspend fun getAllEstadoHumedad(): List<EstadoHumedadEntity> {
        return appDatabase.estadoHumedadDao().getAll()
    }

    suspend fun getEstadoHumedad(estadoHumedadId: Int): EstadoHumedadEntity{
        return appDatabase.estadoHumedadDao().getEstadoHumedad(estadoHumedadId)
    }

    suspend fun insertEstadoHumedad(EstadoHumedadEntity: EstadoHumedadEntity){
        appDatabase.estadoHumedadDao().insert(EstadoHumedadEntity)
    }

    suspend fun deleteEstadoHumedad(EstadoHumedadEntity: EstadoHumedadEntity){
        appDatabase.estadoHumedadDao().delete(EstadoHumedadEntity)
    }

    suspend fun updateEstadoHumedad(EstadoHumedadEntity: EstadoHumedadEntity){
        appDatabase.estadoHumedadDao().update(EstadoHumedadEntity)
    }
}