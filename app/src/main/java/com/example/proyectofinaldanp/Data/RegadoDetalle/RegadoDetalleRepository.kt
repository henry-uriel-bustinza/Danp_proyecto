package com.example.proyectofinaldanp.Data.RegadoDetalle

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.proyectofinaldanp.AppDatabase

class RegadoDetalleRepository(private val appDatabase: AppDatabase) {

    suspend fun getAllRegadoDetalle(): List<RegadoDetalleEntity>{
        return appDatabase.regadoDetalleDao().getAll()
    }

    suspend fun getRegadoDetalle(regadoDetalleId:Int):RegadoDetalleEntity{
        return appDatabase.regadoDetalleDao().getRegadoDetalle(regadoDetalleId)
    }

    suspend fun insertRegadoDetalle(RegadoDetalleEntity: RegadoDetalleEntity){
        appDatabase.regadoDetalleDao().insert(RegadoDetalleEntity)
    }

    suspend fun deleteRegadoDetalle(RegadoDetalleEntity: RegadoDetalleEntity){
        appDatabase.regadoDetalleDao().delete(RegadoDetalleEntity)
    }

    suspend fun updateRegadoDetalle(RegadoDetalleEntity: RegadoDetalleEntity){
        appDatabase.regadoDetalleDao().update(RegadoDetalleEntity)
    }
}