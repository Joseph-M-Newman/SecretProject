package com.example.secretproject.DB;

import com.example.secretproject.Account;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface AccountDao {

    @Query("SELECT * FROM " + AppDatabase.ACCOUNT_TABLE)
    List<Account> getallAccounts();

    @Insert
    void insertAccount(Account...Account);

    @Query("SELECT * FROM " + AppDatabase.ACCOUNT_TABLE + " WHERE username =:username ")
    Account getAccount(String username);
}
