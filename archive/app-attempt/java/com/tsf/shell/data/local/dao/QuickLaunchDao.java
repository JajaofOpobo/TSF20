package com.tsf.shell.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.tsf.shell.data.local.entity.QuickLaunchItem;
import java.util.List;

@Dao
public interface QuickLaunchDao {

    @Query("SELECT * FROM quicklaunch ORDER BY cellX")
    LiveData<List<QuickLaunchItem>> getAll();

    @Query("SELECT * FROM quicklaunch ORDER BY cellX")
    List<QuickLaunchItem> getAllSync();

    @Query("SELECT MAX(cellX) FROM quicklaunch")
    int getMaxCellX();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(QuickLaunchItem item);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<QuickLaunchItem> items);

    @Query("DELETE FROM quicklaunch")
    void deleteAll();
}
