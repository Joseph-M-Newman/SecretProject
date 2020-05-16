package com.example.secretproject;

import com.example.secretproject.DB.AppDatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = AppDatabase.ITEM_TABLE)
public class Item {

    public Item(String name, int price, int total){
        this.itemname = name;
        this.price = price;
        this.total = total;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "itemname")
    private String itemname;

    @ColumnInfo(name = "total")
    private int total;

    @ColumnInfo(name = "price")
    private int price;
}
