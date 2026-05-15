package com.tsf.shell.data.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.tsf.shell.data.LegacyLauncherContract;

@Entity(tableName = LegacyLauncherContract.TABLE_APPLICATION)
public class ApplicationItem {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = LegacyLauncherContract.Application.ID)
    public long id;

    @ColumnInfo(name = LegacyLauncherContract.Application.INDEX)
    public int index;

    @ColumnInfo(name = LegacyLauncherContract.Application.TITLE)
    public String title;

    @ColumnInfo(name = LegacyLauncherContract.Application.CLICK_COUNT)
    public int clickCount;

    @ColumnInfo(name = LegacyLauncherContract.Application.IS_HIDDEN)
    public boolean isHidden;

    @ColumnInfo(name = LegacyLauncherContract.Application.INTENT)
    public String intent;

    @ColumnInfo(name = LegacyLauncherContract.Application.CONTAINER)
    public int container;

    @ColumnInfo(name = LegacyLauncherContract.Application.ITEM_TYPE)
    public int itemType;

    @ColumnInfo(name = LegacyLauncherContract.Application.ICON_TYPE)
    public int iconType;

    @ColumnInfo(name = LegacyLauncherContract.Application.ICON_PACKAGE)
    public String iconPackage;

    @ColumnInfo(name = LegacyLauncherContract.Application.ICON_RESOURCE)
    public String iconResource;

    @ColumnInfo(name = LegacyLauncherContract.Application.ICON)
    public byte[] icon;

    @ColumnInfo(name = LegacyLauncherContract.Application.TITLE_TYPE)
    public int titleType;

    @ColumnInfo(name = LegacyLauncherContract.Application.CONFIG)
    public String config;

    @ColumnInfo(name = "packagename")
    public String packageName;

    @ColumnInfo(name = "classname")
    public String className;

    @ColumnInfo(name = LegacyLauncherContract.Application.VERSION_CODE)
    public int versionCode;

    @ColumnInfo(name = LegacyLauncherContract.Application.VERSION_NAME)
    public String versionName;
}