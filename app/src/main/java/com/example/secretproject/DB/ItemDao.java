package com.example.secretproject.DB;

import com.example.secretproject.Item;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ItemDao {

    @Query("SELECT * FROM "+ AppDatabase.ITEM_TABLE)
    List<Item> getAllItems();

    @Insert
    void insertItem(Item...item);

    @Query("SELECT * FROM "+ AppDatabase.ITEM_TABLE + " WHERE itemname = :item")
    Item getitem(String item);
}
