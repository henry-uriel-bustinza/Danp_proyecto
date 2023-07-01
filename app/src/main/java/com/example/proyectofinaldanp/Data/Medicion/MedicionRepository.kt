package com.example.proyectofinaldanp.Data.Medicion

import com.example.proyectofinaldanp.AppDatabase

class MedicionRepository(private val appDatabase: AppDatabase) {

    suspend fun getAllMedicion(): List<MedicionEntity> {
        return appDatabase.medicionDao().getAll()
    }

    suspend fun getMedicion(medicionId: Int): MedicionEntity{
        return appDatabase.medicionDao().getMedicion(medicionId)
    }

    suspend fun insertMedicion(MedicionEntity: MedicionEntity){
        appDatabase.medicionDao().insert(MedicionEntity)
    }

    suspend fun deleteMedicion(MedicionEntity: MedicionEntity){
        appDatabase.medicionDao().delete(MedicionEntity)
    }

    suspend fun updateMedicion(MedicionEntity: MedicionEntity){
        appDatabase.medicionDao().update(MedicionEntity)
    }

}