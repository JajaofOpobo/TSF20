package com.tsf.shell.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.tsf.shell.data.local.entity.MenuItem;
import java.util.List;

@Dao
public interface MenuDao {

    @Query("SELECT * FROM menu ORDER BY cellX")
    LiveData<List<MenuItem>> getAll();

    @Query("SELECT * FROM menu ORDER BY cellX")
    List<MenuItem> getAllSync();

    @Query("SELECT MAX(cellX) FROM menu")
    int getMaxCellX();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(MenuItem item);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<MenuItem> items);

    @Query("DELETE FROM menu")
    void deleteAll();
}
