package com.tsf.shell.data.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.tsf.shell.data.LegacyLauncherContract;

@Entity(tableName = LegacyLauncherContract.TABLE_FAVORITES)
public class FavoriteItem {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = LegacyLauncherContract.Favorites.ID)
    public long id;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.TITLE)
    public String title;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.INTENT)
    public String intent;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.CONTAINER)
    public int container;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.SCREEN)
    public int screen;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.CELL_X)
    public int cellX;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.CELL_Y)
    public int cellY;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.ROTATION)
    public float rotation;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.SPAN_X)
    public int spanX;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.SPAN_Y)
    public int spanY;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.SCALE)
    public float scale;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.ITEM_TYPE)
    public int itemType;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.APP_WIDGET_ID)
    public int appWidgetId;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.ICON_TYPE)
    public int iconType;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.ICON_PACKAGE)
    public String iconPackage;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.ICON_RESOURCE)
    public String iconResource;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.ICON)
    public byte[] icon;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.TITLE_TYPE)
    public int titleType;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.CONFIG)
    public String config;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.PACKAGE_NAME)
    public String packageName;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.CLASS_NAME)
    public String className;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.INTERNAL)
    public int internal;

    @ColumnInfo(name = LegacyLauncherContract.Favorites.APP_WIDGET_PROVIDER)
    public String appWidgetProvider;

    public static final int TYPE_APPLICATION = 0;
    public static final int TYPE_FOLDER = 1;
    public static final int TYPE_WIDGET = 2;
    public static final int TYPE_SHORTCUT = 4;
}