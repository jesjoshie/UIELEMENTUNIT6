package com.example.UIELEMENTSUNIT6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.UIELEMENTSUNIT6.models.Title

class newAlbum : AppCompatActivity() {
    lateinit var  titleET:EditText
    lateinit var artistET:EditText
    lateinit var albumET:EditText
     lateinit var  addTitleButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_album)
        val databaseHandler = TitleDatabase(this)
        addTitleButton.findViewById<Button>(R.id.addTitleButton)
        addTitleButton.setOnClickListener {

            val title = titleET.text.toString()
            val artist = artistET.text.toString()
            val album = albumET.text.toString()

            val Title1 = Title(title,artist,album)
            databaseHandler.create(Title1)

        }


    }
}