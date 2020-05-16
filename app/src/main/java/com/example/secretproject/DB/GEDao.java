package com.example.secretproject.DB;

import com.example.secretproject.GE;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface GEDao {
    @Query("SELECT * FROM " + AppDatabase.GE_TABLE)
    List<GE> getallGE();

    @Insert
    void insertGE(GE...ge);

    @Query("SELECT * FROM "+ AppDatabase.GE_TABLE + " WHERE itemname = :item")
    GE getitem(String item);
}
