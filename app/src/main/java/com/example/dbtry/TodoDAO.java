package com.example.dbtry;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface TodoDAO {
    @Query("SELECT * FROM todo")
    List<Todo> getAllUsers();

    @Insert
    void insertAll(Todo... todos);


}
