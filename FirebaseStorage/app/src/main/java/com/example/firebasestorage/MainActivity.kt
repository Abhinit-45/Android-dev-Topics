package com.example.firebasestorage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import java.util.UUID

class MainActivity : AppCompatActivity() {
    private lateinit var SelectImage: Button
    private lateinit var Image: ImageView
    private lateinit var UploadImage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SelectImage = findViewById(R.id.select_img)
        Image = findViewById(R.id.image)
        UploadImage = findViewById(R.id.upload_img)

        SelectImage.setOnClickListener {

            val galleryIntent =
                Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galleryIntent, 1117)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1117 && resultCode == RESULT_OK) {
            Image.setImageURI(data?.data)
        }

        UploadImage.setOnClickListener {
            //uplod image with uri to firebase
            uploadImage(data?.data)

        }
    }

    private fun uploadImage(imageUri: Uri?) {
        val fileName = UUID.randomUUID().toString() + ".jpg"
        val storageReference = FirebaseStorage.getInstance().reference.child("Images/")
        storageReference.putFile(imageUri!!).addOnSuccessListener {
            Toast.makeText(this, "Image Uploaded Succefully", Toast.LENGTH_SHORT).show()
        }
    }
}