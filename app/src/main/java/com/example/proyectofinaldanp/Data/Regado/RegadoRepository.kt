package com.example.proyectofinaldanp.Data.Regado

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.proyectofinaldanp.AppDatabase

class RegadoRepository(private val appDatabase: AppDatabase) {

    suspend fun getAllRegado(): List<RegadoEntity>{
        return appDatabase.regadoDao().getAll()
    }

    suspend fun getRegado(regadoId: Int): RegadoEntity{
        return appDatabase.regadoDao().getRegado(regadoId)
    }

    suspend fun insertRegado(RegadoEntity: RegadoEntity){
        appDatabase.regadoDao().insert(RegadoEntity)
    }

    suspend fun deleteRegado(RegadoEntity: RegadoEntity){
        appDatabase.regadoDao().delete(RegadoEntity)
    }

    suspend fun updateRegado(RegadoEntity: RegadoEntity){
        appDatabase.regadoDao().update(RegadoEntity)
    }
}