package com.kingfishapps.cooltext

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.*

// Developer Andrew Cason, London, UK
// Simple Kotlin app to to write to a text file.

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = "Fish and chips"
        var fos: FileOutputStream? = null
        fos = openFileOutput(FILE_NAME, Context.MODE_PRIVATE)
        fos.write(text.toByteArray())
        Toast.makeText(this, "Saved to $filesDir/$FILE_NAME",
                Toast.LENGTH_LONG).show()
    }
    companion object {
        private const val FILE_NAME = "andrewtext.txt"
    }
}