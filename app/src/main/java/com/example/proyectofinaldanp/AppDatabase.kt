package com.example.proyectofinaldanp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.proyectofinaldanp.Data.EstadoHumedad.EstadoHumedadDao
import com.example.proyectofinaldanp.Data.EstadoHumedad.EstadoHumedadEntity
import com.example.proyectofinaldanp.Data.Historial.HistorialDao
import com.example.proyectofinaldanp.Data.Historial.HistorialEntity
import com.example.proyectofinaldanp.Data.Medicion.MedicionDao
import com.example.proyectofinaldanp.Data.Medicion.MedicionEntity
import com.example.proyectofinaldanp.Data.Planta.PlantaDao
import com.example.proyectofinaldanp.Data.Planta.PlantaEntity
import com.example.proyectofinaldanp.Data.Regado.RegadoDao
import com.example.proyectofinaldanp.Data.Regado.RegadoEntity
import com.example.proyectofinaldanp.Data.RegadoDetalle.RegadoDetalleDao
import com.example.proyectofinaldanp.Data.RegadoDetalle.RegadoDetalleEntity

@Database(entities = [EstadoHumedadEntity::class,
                     PlantaEntity::class,
                     MedicionEntity::class,
                     RegadoEntity::class,
                     RegadoDetalleEntity::class,
                     HistorialEntity::class], version = 1, exportSchema = false)

abstract class AppDatabase : RoomDatabase() {
    abstract fun estadoHumedadDao(): EstadoHumedadDao
    abstract fun plantaDao(): PlantaDao
    abstract fun medicionDao(): MedicionDao
    abstract fun regadoDao(): RegadoDao
    abstract fun regadoDetalleDao(): RegadoDetalleDao
    abstract fun historialDao(): HistorialDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "NivelHumedad"
                    ).fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance

                }

                return instance
            }
        }
    }
}