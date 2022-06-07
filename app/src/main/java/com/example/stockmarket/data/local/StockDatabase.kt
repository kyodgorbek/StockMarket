package com.example.stockmarket.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.stockmarket.data.local.CompanyListingEntity
import com.example.stockmarket.data.local.StockDao

@Database(
    entities = [CompanyListingEntity::class],
    version = 1,
    exportSchema = false

)
abstract class StockDatabase : RoomDatabase() {
    abstract val dao: StockDao
}