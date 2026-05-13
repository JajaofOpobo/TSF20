package com.tsf.shell.theme.inside.description;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemeIconDescription {
    public float[] effectPolyParam;
    private Context mContext;
    public String packagename;
    public String themeName;
    public float scale = 0.8f;
    public boolean isColorize = false;
    public int colorize = 0;
    public HashMap<String, String> iconFilter = new HashMap<>();
    public ArrayList<DefaultIconItem> iconBackItems = new ArrayList<>();
    public ArrayList<DefaultIconItem> iconUponItems = new ArrayList<>();
    public ArrayList<DefaultIconItem> iconMaskItems = new ArrayList<>();

    public ThemeIconDescription(Context context) {
        this.mContext = context;
        this.packagename = context.getPackageName();
    }

    public void parsePolyParam(String str) {
        try {
            String[] split = str.split(",");
            if (split.length == 8) {
                float[] fArr = new float[8];
                for (int i = 0; i < split.length; i++) {
                    fArr[i] = Float.parseFloat(split[i]);
                }
                this.effectPolyParam = fArr;
            }
        } catch (Exception e) {
        }
    }

    public void parseColorizeParam(String str) {
        try {
            this.colorize = Color.parseColor(str);
            this.isColorize = true;
        } catch (Exception e) {
        }
    }

    public void destroy() {
        Iterator<DefaultIconItem> it = this.iconBackItems.iterator();
        while (it.hasNext()) {
            it.next().recycle();
        }
        Iterator<DefaultIconItem> it2 = this.iconUponItems.iterator();
        while (it2.hasNext()) {
            it2.next().recycle();
        }
        Iterator<DefaultIconItem> it3 = this.iconMaskItems.iterator();
        while (it3.hasNext()) {
            it3.next().recycle();
        }
        this.iconBackItems.clear();
        this.iconUponItems.clear();
        this.iconMaskItems.clear();
        this.iconFilter.clear();
        this.iconBackItems = null;
        this.iconFilter = null;
        this.mContext = null;
    }

    public Bitmap getBackBitmap(C3560a c3560a) {
        if (this.iconBackItems.size() <= 0) {
            return null;
        }
        int random = (int) (Math.random() * this.iconBackItems.size());
        int size = random == this.iconBackItems.size() ? this.iconBackItems.size() - 1 : random;
        Bitmap bitmap = this.iconBackItems.get(size).getBitmap(c3560a);
        if (bitmap == null) {
            this.iconBackItems.remove(size);
            return getBackBitmap(c3560a);
        }
        return bitmap;
    }

    public Bitmap getUponBitmap(C3560a c3560a) {
        if (this.iconUponItems.size() <= 0) {
            return null;
        }
        Bitmap bitmap = this.iconUponItems.get(0).getBitmap(c3560a);
        if (bitmap == null) {
            this.iconUponItems.remove(0);
            return getUponBitmap(c3560a);
        }
        return bitmap;
    }

    public Bitmap getMaskBitmap(C3560a c3560a) {
        if (this.iconMaskItems.size() <= 0) {
            return null;
        }
        Bitmap bitmap = this.iconMaskItems.get(0).getBitmap(c3560a);
        if (bitmap == null) {
            this.iconMaskItems.remove(0);
            return getMaskBitmap(c3560a);
        }
        return bitmap;
    }

    public Bitmap getPackageIcon() {
        Bitmap m605a = C4189x.m605a(this.mContext, this.mContext.getApplicationInfo().icon);
        if (m605a == null) {
            return C4189x.m609a(C1306b.C1310d.default_icon);
        }
        return m605a;
    }

    public void addIconUpon(String str) {
        this.iconUponItems.add(new DefaultIconItem(this, str));
    }

    public void addIconBack(String str) {
        this.iconBackItems.add(new DefaultIconItem(this, str));
    }

    public void addIconMask(String str) {
        this.iconMaskItems.add(new DefaultIconItem(this, str));
    }

    public void resetIconItemScale(float f) {
        Iterator<DefaultIconItem> it = this.iconBackItems.iterator();
        while (it.hasNext()) {
            it.next().scale = f;
        }
    }

    public void addIconFilterItem(String str, String str2) {
        this.iconFilter.put(str, str2);
    }

    public Bitmap getIconFilterBitmap(String str, C3560a c3560a) {
        String str2 = this.iconFilter.get(str);
        if (str2 == null) {
            return null;
        }
        return getBitmap(c3560a, this.mContext, str2);
    }

    public int isIconExistId(String str) {
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName());
    }

    public boolean isIconExist(String str) {
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bitmap getBitmap(DefaultIconItem defaultIconItem, C3560a c3560a) {
        return getBitmap(c3560a, this.mContext, defaultIconItem.drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap getBitmap(com.tsf.shell.manager.p183o.C3560a r6, android.content.Context r7, java.lang.String r8) {
        /*
            r0 = 0
            r1 = 0
            android.content.res.Resources r2 = r7.getResources()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L52
            java.lang.String r3 = "drawable"
            java.lang.String r4 = r7.getPackageName()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L52
            int r2 = r2.getIdentifier(r8, r3, r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L52
            if (r2 != 0) goto L16
            r1.close()     // Catch: java.lang.Exception -> L64
        L15:
            return r0
        L16:
            android.content.res.Resources r1 = r7.getResources()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L52
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L52
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r1.close()     // Catch: java.lang.Exception -> L45
            r1 = r2
        L26:
            if (r1 == 0) goto L15
            int r0 = r1.getWidth()
            int r2 = r6.f11750H
            if (r0 != r2) goto L5a
            int r0 = r1.getHeight()
            int r2 = r6.f11751I
            if (r0 != r2) goto L5a
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = 0
            android.graphics.Bitmap r0 = r1.copy(r0, r2)
        L3f:
            if (r1 == r0) goto L15
            r1.recycle()
            goto L15
        L45:
            r1 = move-exception
            r1 = r2
            goto L26
        L48:
            r1 = move-exception
            r1 = r0
        L4a:
            r1.close()     // Catch: java.lang.Exception -> L4f
            r1 = r0
            goto L26
        L4f:
            r1 = move-exception
            r1 = r0
            goto L26
        L52:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L56:
            r1.close()     // Catch: java.lang.Exception -> L66
        L59:
            throw r0
        L5a:
            int r0 = r6.f11750H
            int r2 = r6.f11751I
            r3 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r1, r0, r2, r3)
            goto L3f
        L64:
            r1 = move-exception
            goto L15
        L66:
            r1 = move-exception
            goto L59
        L68:
            r0 = move-exception
            goto L56
        L6a:
            r2 = move-exception
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.theme.inside.description.ThemeIconDescription.getBitmap(com.tsf.shell.manager.o.a, android.content.Context, java.lang.String):android.graphics.Bitmap");
    }
}
