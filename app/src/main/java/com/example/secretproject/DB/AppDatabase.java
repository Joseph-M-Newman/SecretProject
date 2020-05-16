package com.example.secretproject.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities =  {}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AccountDao accountDao();
    public abstract ItemDao itemDao();
    public abstract GEDao geDao();

    public static final String ITEM_TABLE =  "Item_Table";
    public static final String ACCOUNT_TABLE =  "ACCOUNT_TABLE";
    public static final String GE_TABLE = "GE_TABLE";


}
