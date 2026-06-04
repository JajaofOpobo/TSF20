package com.tsf.shell.theme.inside.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class SystemContactTheme {
    public String backPlane;
    private String[] filesList;
    public String frontPlane;
    public String icon;
    private Context mContext;
    public String packagename;
    public String themeName;
    public boolean isSystem = false;
    public int backPlaneX = 0;
    public int backPlaneY = 0;
    public int frontPlaneX = 0;
    public int frontPlaneY = 0;
    public int photoPlaneX = 28;
    public int photoPlaneY = 12;
    public int photoPlaneWidth = 72;
    public int photoPlaneHeight = 72;
    public boolean isSecondParserMode = false;

    public SystemContactTheme(Context context) {
        this.mContext = context;
        this.packagename = context.getPackageName();
    }

    public Bitmap getIconBitmap() {
        return getBitmp(this.icon);
    }

    public Bitmap getFrontPlaneBitmap() {
        return getBitmp(this.frontPlane);
    }

    public Bitmap getBackPlaneBitmap() {
        return getBitmp(this.backPlane);
    }

    private Bitmap getBitmp(String str) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Bitmap bitmap = null;
        try {
            if (!this.isSecondParserMode) {
                inputStream = this.mContext.getAssets().open("theme/widget/com.tsf.shell.widget.contact/" + str + ".png");
            } else {
                inputStream = this.mContext.getResources().openRawResource(this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()));
            }
            try {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    try {
                        bitmap = decodeStream.copy(Bitmap.Config.ARGB_8888, false);
                        decodeStream.recycle();
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                        }
                    } catch (Exception e2) {
                        bitmap = decodeStream;
                        inputStream2 = inputStream;
                        try {
                            inputStream2.close();
                        } catch (Exception e3) {
                        }
                        return bitmap;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                    }
                    throw th;
                }
            } catch (Exception e5) {
                inputStream2 = inputStream;
            }
        } catch (Exception e6) {
            inputStream2 = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
        }
        return bitmap;
    }

    public void destroy() {
        this.mContext = null;
    }

    public boolean check() {
        try {
            this.filesList = this.mContext.getAssets().list("theme/widget/com.tsf.shell.widget.contact");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (checkAllResource()) {
            return true;
        }
        return false;
    }

    private boolean checkAllResource() {
        if (this.backPlane == null || this.backPlane.length() <= 0 || checkResource(this.backPlane)) {
            return this.backPlane == null || this.backPlane.length() <= 0 || checkResource(this.frontPlane);
        }
        return false;
    }

    private boolean checkResource(String str) {
        if (this.isSecondParserMode || this.filesList == null) {
            return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()) != 0;
        }
        for (String str2 : this.filesList) {
            if (str2.equals(String.valueOf(str) + ".png")) {
                return true;
            }
        }
        return false;
    }
}
