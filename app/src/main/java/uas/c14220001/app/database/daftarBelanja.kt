package uas.c14220001.app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class daftarBelanja(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    var id: Int = 0,

    @ColumnInfo(name = "tanggal")
    var tanggal: String? = null,

    @ColumnInfo(name = "item") // berat badan
    var item: String? = null,

    @ColumnInfo(name = "jumlah") // tekanan darah
    var jumlah: String? = null,

    @ColumnInfo(name = "catatan")
    var catatan: String? = null,

    @ColumnInfo(name = "status")
    var status: Int = 0,
)
