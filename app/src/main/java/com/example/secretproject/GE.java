package com.example.secretproject;

import com.example.secretproject.DB.AppDatabase;

        import androidx.room.ColumnInfo;
        import androidx.room.Entity;
        import androidx.room.PrimaryKey;

@Entity(tableName = AppDatabase.GE_TABLE)
public class GE {

    public GE(String itemName, double BoughtPrice, double SoldPrice, int quantity){

    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "itemname")
    private String itemname;
    @ColumnInfo(name = "boughtprice")
    private String boughtprice;
    @ColumnInfo(name = "soldprice")
    private String soldprice;
    @ColumnInfo(name = "quantity")
    private int quantity;

}
