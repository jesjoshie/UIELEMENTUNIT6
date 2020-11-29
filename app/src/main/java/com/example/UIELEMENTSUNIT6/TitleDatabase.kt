package com.example.UIELEMENTSUNIT6

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.UIELEMENTSUNIT6.models.Title

class TitleDatabase(var context: Context):SQLiteOpenHelper(context,DATABASE_NAME,null, DATABASE_VERSION) {

    companion object{
        private  val DATABASE_VERSION = 1
        private val DATABASE_NAME = "title_database"
        private val TABLE_NAME = "title"
        private val COL_ID="id"
        private  val COL_TITLE ="Title"
        private  val COL_ARTIST= "Artist"
        private  val  COL_ALBUM="Album"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
        val query ="CREATE TABLE"+ TABLE_NAME +"("+ COL_ID+" INTEGER PRIMARY KEY,"+ COL_TITLE+" TEXT,"+ COL_ARTIST+" TEXT,"+ COL_ALBUM+" TEXT)"
        db?.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")

        db!!.execSQL("DROP TABLE IF EXIST"+ TABLE_NAME)
        onCreate(db)
    }

    fun create(title1:Title):Boolean {
         val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_TITLE,title1.title)
        contentValues.put(COL_ARTIST,title1.artist)
        contentValues.put(COL_ALBUM,title1.album)
        val result = database.insert(TABLE_NAME,null,contentValues)
        if(result == (0).toLong()){
                return true
        }
        return false
    }
}