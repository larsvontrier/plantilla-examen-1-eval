package com.pepinho.dailycafe

import androidx.room.Database
import androidx.room.RoomDatabase
import local.sanclemente.dailycafe.model.Cafe
import local.sanclemente.dailycafe.model.Categoria

@Database(entities = [Cafe::class, Categoria::class], version = 1)
abstract class CafeDatabase : RoomDatabase() {
    abstract fun cafeDao(): CafeDao
    abstract fun categoriaDao(): CategoriaDao
}