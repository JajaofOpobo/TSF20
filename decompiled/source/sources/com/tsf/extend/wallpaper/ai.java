package com.tsf.extend.wallpaper;
/* loaded from: classes.dex */
public enum ai {
    NewType(1, "New"),
    HotType(2, "Hot"),
    FavoriteType(3, "Favorite"),
    CategoryType(4, "Category"),
    LiveWallpaperTabType(5, "LiveWallpaper"),
    BalloonType(117, "Balloon");
    
    private long g;
    private String h;

    ai(long j, String str) {
        this.g = j;
        this.h = str;
    }

    public long a() {
        return this.g;
    }
}
