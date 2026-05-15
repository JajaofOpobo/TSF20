package com.tsf.shell.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.tsf.shell.data.local.entity.FavoriteItem;
import java.util.List;

@Dao
public interface FavoriteDao {

    @Query("SELECT * FROM favorites WHERE container = :container ORDER BY screen, cellY, cellX")
    LiveData<List<FavoriteItem>> getByContainer(int container);

    @Query("SELECT * FROM favorites WHERE container = :container ORDER BY screen, cellY, cellX")
    List<FavoriteItem> getByContainerSync(int container);

    @Query("SELECT * FROM favorites WHERE screen = :screen AND container = :container ORDER BY cellY, cellX")
    LiveData<List<FavoriteItem>> getByScreen(int screen, int container);

    @Query("SELECT * FROM favorites WHERE packageName = :pkg LIMIT 1")
    FavoriteItem findByPackage(String pkg);

    @Query("SELECT MAX(screen) FROM favorites WHERE container = :container")
    int getMaxScreen(int container);

    @Query("SELECT COUNT(*) FROM favorites WHERE container = :container")
    int countByContainer(int container);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(FavoriteItem item);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<FavoriteItem> items);

    @Update
    void update(FavoriteItem item);

    @Delete
    void delete(FavoriteItem item);

    @Query("DELETE FROM favorites WHERE _id = :id")
    void deleteById(long id);

    @Query("DELETE FROM favorites")
    void deleteAll();
}