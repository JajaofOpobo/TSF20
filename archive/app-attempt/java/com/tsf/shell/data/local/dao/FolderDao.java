package com.tsf.shell.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.tsf.shell.data.local.entity.FolderItem;
import java.util.List;

@Dao
public interface FolderDao {

    @Query("SELECT * FROM folders WHERE container = :container ORDER BY screen, cell_y, cell_x")
    LiveData<List<FolderItem>> getByContainer(int container);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(FolderItem item);

    @Delete
    void delete(FolderItem item);

    @Query("DELETE FROM folders WHERE id = :id")
    void deleteById(long id);
}
