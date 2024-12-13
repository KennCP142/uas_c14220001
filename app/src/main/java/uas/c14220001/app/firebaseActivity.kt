package uas.c14220001.app

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.FirebaseFirestore
import uas.c14220001.app.R

class firebaseActivity : AppCompatActivity() {


//    fun uploadDataToFirebase() {
//        val db = FirebaseFirestore.getInstance()
//        val daftarBelanjaDAO = daftarBelanjaDB.getDatabase(context).fundaftarBelanjaDAO()
//
//        // Fetch all data from Room
//        val daftarBelanjaList = daftarBelanjaDAO.selectAll()
//
//        // Loop through the list and upload each item to Firebase
//        for (item in daftarBelanjaList) {
//            val docRef = db.collection("daftarBelanja").document(item.id.toString())
//
//            // Set the data, using item.id as the document ID to avoid duplicates
//            docRef.set(item)
//                .addOnSuccessListener {
//                    Log.d("Firebase", "Data successfully uploaded for ID: ${item.id}")
//                }
//                .addOnFailureListener { e ->
//                    Log.e("Firebase", "Error uploading data: $e")
//                }
//        }
//    }
//
//
//    fun downloadDataFromFirebase() {
//        val db = FirebaseFirestore.getInstance()
//        val daftarBelanjaDAO = daftarBelanjaDB.getDatabase(context).fundaftarBelanjaDAO()
//
//        // Fetch all data from Firebase
//        db.collection("daftarBelanja").get()
//            .addOnSuccessListener { result ->
//                for (document in result) {
//                    // Convert each document to a daftarBelanja object
//                    val item = document.toObject(daftarBelanja::class.java)
//
//                    // Insert into Room DB only if it doesn't already exist
//                    if (daftarBelanjaDAO.findById(item.id) == null) {
//                        daftarBelanjaDAO.insert(item)
//                    }
//                }
//                Log.d("Firebase", "Data successfully downloaded and saved to Room")
//            }
//            .addOnFailureListener { e ->
//                Log.e("Firebase", "Error downloading data: $e")
//            }
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_firebase)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnDownload = findViewById<Button>(R.id.btnDownload)


        val btnUpload = findViewById<Button>(R.id.btnUpload)

    }
}