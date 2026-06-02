package com.tsf.shell.data.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.tsf.shell.data.LegacyLauncherContract;

@Entity(tableName = LegacyLauncherContract.TABLE_SLIDING_DOCK)
public class SlidingDockItem {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public long id;

    @ColumnInfo(name = "title")
    public String title;

    @ColumnInfo(name = "intent")
    public String intent;

    @ColumnInfo(name = "container")
    public int container;

    @ColumnInfo(name = "screen")
    public int screen;

    @ColumnInfo(name = "cellX")
    public int cellX;

    @ColumnInfo(name = "cellY")
    public int cellY;

    @ColumnInfo(name = "itemType")
    public int itemType;

    @ColumnInfo(name = "iconType")
    public int iconType;

    @ColumnInfo(name = "iconPackage")
    public String iconPackage;

    @ColumnInfo(name = "iconResource")
    public String iconResource;

    @ColumnInfo(name = "icon")
    public byte[] icon;

    @ColumnInfo(name = "titleType")
    public int titleType;

    @ColumnInfo(name = "config")
    public String config;

    @ColumnInfo(name = "packagename")
    public String packageName;

    @ColumnInfo(name = "classname")
    public String className;
}
