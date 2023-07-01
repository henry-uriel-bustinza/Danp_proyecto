package com.example.proyectofinaldanp.Data.Historial

import com.example.proyectofinaldanp.AppDatabase

class HistorialRepository(private val appDatabase: AppDatabase) {

    suspend fun getAllHistorial(): List<HistorialEntity> {
        return appDatabase.historialDao().getAll()
    }

    suspend fun getHistorial(historialId: Int): HistorialEntity {
        return appDatabase.historialDao().getHistorial(historialId)
    }

    suspend fun insertHistorial(HistorialEntity: HistorialEntity) {
        appDatabase.historialDao().insert(HistorialEntity)
    }

    suspend fun deleteHistorial(HistorialEntity: HistorialEntity) {
        appDatabase.historialDao().delete(HistorialEntity)
    }

    suspend fun updateHistorial(HistorialEntity: HistorialEntity) {
        appDatabase.historialDao().update(HistorialEntity)
    }
}