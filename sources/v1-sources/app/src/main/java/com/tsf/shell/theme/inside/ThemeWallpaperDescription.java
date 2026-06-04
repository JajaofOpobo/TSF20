package com.tsf.shell.theme.inside;

import android.app.WallpaperManager;
import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThemeWallpaperDescription {
    private int defaultIndex;
    private Context mContext;
    public String themeName;
    public boolean isSystem = false;
    private ArrayList mWallpapers = new ArrayList();

    public ThemeWallpaperDescription(Context context) {
        this.mContext = context;
    }

    public void destroy() {
        if (!this.isSystem) {
            this.mWallpapers.clear();
            this.mWallpapers = null;
            this.mContext = null;
        }
    }

    public void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public void addItem(String[] strArr) {
        this.mWallpapers.add(strArr);
    }

    public Context getContext() {
        return this.mContext;
    }

    public ArrayList getWallpapers() {
        return this.mWallpapers;
    }

    public void setDefaultWallpaper() {
        int geID;
        if (this.defaultIndex < this.mWallpapers.size() && (geID = geID(((String[]) this.mWallpapers.get(this.defaultIndex))[0])) != 0) {
            try {
                WallpaperManager.getInstance(this.mContext).setResource(geID);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private int geID(String str) {
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName());
    }
}
