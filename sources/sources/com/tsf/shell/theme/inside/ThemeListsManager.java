package com.tsf.shell.theme.inside;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.net.Uri;
import com.censivn.C3DEngine.a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.o.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeListsManager {
    private Context mContext;
    private PackageManager mPm;
    private ArrayList<ThemeInfo> mThemePool = new ArrayList<>();
    private ArrayList<ThemeInfo> mThemeTempPool = new ArrayList<>();
    private ArrayList<ThemeInfo> mThemeList = new ArrayList<>();

    public ThemeListsManager(Context context) {
        this.mContext = context;
        this.mPm = this.mContext.getPackageManager();
    }

    private ThemeInfo applyThemeInfo() {
        return this.mThemePool.isEmpty() ? new ThemeInfo() : this.mThemePool.remove(0);
    }

    private void recycleThemeInfo(ThemeInfo themeInfo) {
        if (!this.mThemePool.contains(themeInfo)) {
            themeInfo.recycle();
            this.mThemePool.add(themeInfo);
        }
    }

    public ArrayList<ThemeInfo> refreshThemeList() {
        int i;
        List<ResolveInfo> listQueryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(new Intent("com.tsf.shell.themes", (Uri) null), 0);
        Collections.sort(listQueryIntentActivities, new ResolveInfo.DisplayNameComparator(this.mContext.getPackageManager()));
        while (!this.mThemeList.isEmpty()) {
            this.mThemeTempPool.add(this.mThemeList.remove(0));
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (resolveInfo != null) {
                String str = resolveInfo.activityInfo.applicationInfo.packageName;
                try {
                    i = this.mPm.getPackageInfo(str, 0).versionCode;
                } catch (Exception e) {
                    e.printStackTrace();
                    i = 0;
                }
                ThemeInfo themeInfo = getThemeInfo(str, i, this.mThemeTempPool);
                if (themeInfo == null) {
                    themeInfo = applyThemeInfo();
                }
                themeInfo.init(resolveInfo, str, i);
                this.mThemeList.add(themeInfo);
            }
        }
        Iterator<ThemeInfo> it = this.mThemeTempPool.iterator();
        while (it.hasNext()) {
            recycleThemeInfo(it.next());
        }
        this.mThemeTempPool.clear();
        return this.mThemeList;
    }

    private ThemeInfo getThemeInfo(String str, int i, ArrayList<ThemeInfo> arrayList) {
        for (ThemeInfo themeInfo : arrayList) {
            if (themeInfo.packagename.equals(str) && themeInfo.version == i) {
                arrayList.remove(themeInfo);
                return themeInfo;
            }
        }
        return null;
    }

    public class ThemeInfo {
        public Context context;
        private TextureElement iconTexture;
        private ResolveInfo info;
        public String name;
        public String packagename;
        public int version;
        public boolean isSupport30 = false;
        public boolean isCheckCompatible = false;

        public ThemeInfo() {
        }

        public void init(ResolveInfo resolveInfo, String str, int i) {
            this.info = resolveInfo;
            this.packagename = str;
            this.version = i;
            this.name = resolveInfo.loadLabel(ThemeListsManager.this.mPm).toString();
            if (this.name == null) {
                this.name = resolveInfo.activityInfo.name;
            }
            try {
                this.context = a.d().createPackageContext(str, 3);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void recycle() {
            this.name = null;
            this.packagename = null;
            this.info = null;
            this.context = null;
            this.isCheckCompatible = false;
            relecyIconTexture();
        }

        public TextureElement getIconTexture() {
            if (this.iconTexture == null) {
                Bitmap bitmapA = b.c.a();
                Bitmap bitmapA2 = b.c.a(this.name);
                Canvas canvas = new Canvas(bitmapA);
                canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                b.c.a(canvas, getIcon(), bitmapA2, true);
                this.iconTexture = a.g().a(bitmapA, true);
            }
            return this.iconTexture;
        }

        public void relecyIconTexture() {
            if (this.iconTexture != null) {
                a.g().a(this.iconTexture);
                this.iconTexture = null;
            }
        }

        private Bitmap getIcon() {
            return com.tsf.shell.manager.r.c.a.a(this.info, b.c);
        }
    }
}
