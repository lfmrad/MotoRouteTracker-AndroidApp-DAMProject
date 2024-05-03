package com.jmblfma.wheely.data

import androidx.room.Room
import com.jmblfma.wheely.MyApp

object RoomDatabaseBuilder {
     val sharedInstance: AppDatabase by lazy {
        // Initialize and build the Room database
        Room.databaseBuilder(
            MyApp.applicationContext(),
            AppDatabase::class.java,
            "wheely_rooms_db2"
        ).build()
    }
}
