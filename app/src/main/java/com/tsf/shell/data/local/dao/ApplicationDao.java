package com.tsf.shell.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.tsf.shell.data.local.entity.ApplicationItem;
import java.util.List;

@Dao
public interface ApplicationDao {

    @Query("SELECT * FROM application ORDER BY mindex")
    LiveData<List<ApplicationItem>> getAll();

    @Query("SELECT * FROM application ORDER BY mindex")
    List<ApplicationItem> getAllSync();

    @Query("SELECT * FROM application WHERE ishide = 0 ORDER BY mindex")
    LiveData<List<ApplicationItem>> getVisible();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(ApplicationItem item);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<ApplicationItem> items);

    @Update
    void update(ApplicationItem item);

    @Delete
    void delete(ApplicationItem item);

    @Query("DELETE FROM application")
    void deleteAll();
}