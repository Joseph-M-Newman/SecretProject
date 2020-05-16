package com.example.secretproject;

import com.example.secretproject.DB.AppDatabase;
import com.example.secretproject.Item;

import java.util.List;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = AppDatabase.ACCOUNT_TABLE)
public class Account {

    public Account(String name,String password){
        this.password = password;
        this.name = name;

    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "username")
    private String name;

    @ColumnInfo(name = "password")
    private String password;

    @ColumnInfo(name = "itemlist")
    private List<Item> item;
}
