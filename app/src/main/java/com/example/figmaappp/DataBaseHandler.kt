package com.example.figmaappp

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper


class DataBaseHandler(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){

    companion object {

        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Users"
        private const val TABLE = "Users1"

        private const val ID = "user_id"
        private const val EMAIL = "user_email"
        private const val PASSWORD = "user_password"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = ("CREATE TABLE " + TABLE + "(" +
                ID + " INTEGER PRIMARY KEY,"  + EMAIL + " TEXT," + PASSWORD + " TEXT" + ")")
        db?.execSQL(CREATE_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXIST" + TABLE)
        onCreate(db)
    }


    fun checkUser(email: String, password: String): Boolean {

        // array of columns to fetch
        val columns = arrayOf(ID)

        val db = this.readableDatabase

        // selection criteria
        val selection = "$EMAIL = ? AND $PASSWORD = ?"

        // selection arguments
        val selectionArgs = arrayOf(email, password)

        // query user table with conditions
        /**
         * Here query function is used to fetch records from user table this function works like we use sql query.
         * SQL query equivalent to this query function is
         * SELECT user_id FROM user WHERE user_email = 'viral@exmaple.com' AND user_password = 'qwerty';
         */
        val cursor = db.query(TABLE, //Table to query
                columns,// columns, //columns to return
            selection, //columns for the WHERE clause
            selectionArgs, //The values for the WHERE clause
            null,  //group the rows
            null, //filter by row groups
            null) //The sort order

        val cursorCount = cursor.count
        cursor.close()
        db.close()

        if (cursorCount > 0)
            return true

        return false

    }

    fun AddUser(user:DataBaseModel) : Long {

        val db = this.writableDatabase

        val contentValues = ContentValues()

        contentValues.put(EMAIL, user.email)
        contentValues.put(PASSWORD, user.password)

        val success = db.insert(TABLE, null, contentValues)
        db.close()
        return success

    }

}