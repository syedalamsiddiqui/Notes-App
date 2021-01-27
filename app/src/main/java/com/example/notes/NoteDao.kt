package com.example.notes

import androidx.lifecycle.LiveData
import androidx.room.*
import com.google.android.material.circularreveal.CircularRevealHelper


@Dao
interface NoteDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)


    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>
}