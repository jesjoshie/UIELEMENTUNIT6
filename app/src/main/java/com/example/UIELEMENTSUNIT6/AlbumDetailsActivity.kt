package com.example.UIELEMENTSUNIT6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class AlbumDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_details)
        var modalItems: Modal = intent.getSerializableExtra("data") as Modal;

        Log.e("name",modalItems.name.toString());
        val viewName = findViewById<TextView>(R.id.viewName)
        val viewImage = findViewById<ImageView>(R.id.viewImage)

        viewName.text=modalItems.name;
        var songsArray: Array<String> = arrayOf()

        if(modalItems.name.equals("image1")) {
                viewName.text = "Shawn Mendes"
                songsArray = arrayOf( "Living in a Ghost Town",
                    "You Should Be Sad",
                    "Imported",
                    "In In In",
                    "Slide",
                    "Blueberry Faygo",
                    "Toosie Slide",
                    "My Truch",
                    "You're Too Precious",
                    "Tusa",
                    "Let Me Know",
                    "Dealer",
                    "Intentions",
                    "Charlie",)
        }
        else if(modalItems.name.equals("image2")) {
            viewName.text = "Justin Bieber"
            songsArray = arrayOf(  "Blueberry Faygo",
                "Toosie Slide",
                "My Truch",
                "You're Too Precious",
                "Tusa",
                "Let Me Know",
                "Dealer",
                "Intentions",
                "Charlie",
                "Aries",
                "RockStar",
                "Good Bad Times"                    )
        }
        else if(modalItems.name.equals("image3")) {
            viewName.text = "BTS"
            songsArray = arrayOf( "Living in a Ghost Town",
                "You Should Be Sad",
                "Imported",
                "In In In",
                "Slide",
                "Blueberry Faygo",
                "Toosie Slide",
                "My Truch",
                "You're Too Precious",
                "Tusa",
                "Let Me Know",
                "Dealer",
                "Intentions",
                "Charlie",
                "Aries",
                "RockStar",
                "Good Bad Times"
            )
        }
        viewImage.setImageResource(modalItems.image!!);



        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray)
        val songs_list: ListView = findViewById<ListView>(R.id.songs_list)
        songs_list.adapter = adapter


    }
}