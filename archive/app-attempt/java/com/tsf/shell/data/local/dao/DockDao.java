package com.tsf.shell.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.tsf.shell.data.local.entity.DockItem;
import java.util.List;

@Dao
public interface DockDao {

    @Query("SELECT * FROM dock ORDER BY cellX")
    LiveData<List<DockItem>> getAll();

    @Query("SELECT * FROM dock ORDER BY cellX")
    List<DockItem> getAllSync();

    @Query("SELECT MAX(cellX) FROM dock")
    int getMaxCellX();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(DockItem item);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<DockItem> items);

    @Query("DELETE FROM dock")
    void deleteAll();
}