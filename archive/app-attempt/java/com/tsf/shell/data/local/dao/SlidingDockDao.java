package com.tsf.shell.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.tsf.shell.data.local.entity.SlidingDockItem;
import java.util.List;

@Dao
public interface SlidingDockDao {

    @Query("SELECT * FROM slidingdock ORDER BY cellX")
    LiveData<List<SlidingDockItem>> getAll();

    @Query("SELECT * FROM slidingdock ORDER BY cellX")
    List<SlidingDockItem> getAllSync();

    @Query("SELECT MAX(cellX) FROM slidingdock")
    int getMaxCellX();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(SlidingDockItem item);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<SlidingDockItem> items);

    @Query("DELETE FROM slidingdock")
    void deleteAll();
}
