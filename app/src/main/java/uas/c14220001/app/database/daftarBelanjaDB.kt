package uas.c14220001.app

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [daftarBelanja::class, historyBarang::class], version = 3)
abstract class daftarBelanjaDB : RoomDatabase() {
    abstract fun fundaftarBelanjaDAO(): daftarBelanjaDAO
    abstract fun funHistoryBarangDAO(): historyBarangDAO

    companion object {
        @Volatile
        private var INSTANCE: daftarBelanjaDB? = null

        @JvmStatic
        fun getDatabase(context: Context): daftarBelanjaDB {
            if (INSTANCE == null) {
                synchronized(daftarBelanjaDB::class.java) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        daftarBelanjaDB::class.java, "daftarBelanja_db"
                    )
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE as daftarBelanjaDB
        }
    }
}
