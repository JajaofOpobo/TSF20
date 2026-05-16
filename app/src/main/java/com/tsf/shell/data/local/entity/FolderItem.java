package com.tsf.shell.data.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "folders")
public class FolderItem {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "title")
    public String title;

    @ColumnInfo(name = "screen")
    public int screen;

    @ColumnInfo(name = "cell_x")
    public int cellX;

    @ColumnInfo(name = "cell_y")
    public int cellY;

    @ColumnInfo(name = "container")
    public int container;

    @ColumnInfo(name = "color")
    public int color = 0x664A90D9;
}
