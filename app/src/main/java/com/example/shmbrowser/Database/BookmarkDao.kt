package com.example.shmbrowser.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookmarkDao{
    @Insert
    fun insertBookmark(bookmark: BookmarkEntity)

    @Delete
    fun deleteBookmark(bookmark: BookmarkEntity)

    @Query("SELECT * FROM bookmarks" )
    fun getAllBookmarks(): List<BookmarkEntity>

    @Query("SELECT * FROM bookmarks WHERE siteUrl like :url")
    fun getByName(url: String): BookmarkEntity

    @Query("DELETE FROM bookmarks")
    fun deleteAll()
}