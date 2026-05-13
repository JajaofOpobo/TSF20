package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class d extends com.tsf.shell.plugin.themepicker.utils.f {
    private Context a;
    private Context b;
    private Resources e;

    public d(ResolveInfo resolveInfo, Context context, int i) {
        super(context);
        a(resolveInfo, context);
    }

    private void a(ResolveInfo resolveInfo, Context context) {
        this.a = context;
        if (resolveInfo == null) {
            e.b("resolveInfo is null Error");
        }
        b(resolveInfo.activityInfo.packageName);
    }

    private void b(String str) {
        try {
            this.b = this.a.createPackageContext(str, 2);
            this.e = this.b.getResources();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.graphics.Bitmap a(java.lang.Integer r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Start processBitmap:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tsf.shell.plugin.themepicker.e.b(r1)
            r2 = 16
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L30
            android.content.res.Resources r1 = r4.e     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L5d
            int r2 = r5.intValue()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L5d
            java.io.InputStream r2 = r1.openRawResource(r2)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L5d
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r2 == 0) goto L2f
            r2.close()     // Catch: java.io.IOException -> L48
        L2f:
            return r0
        L30:
            r1 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "InterruptedException Error:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tsf.shell.plugin.themepicker.e.b(r1)
            goto L2f
        L48:
            r1 = move-exception
            r1.printStackTrace()
            goto L2f
        L4d:
            r1 = move-exception
            r2 = r0
        L4f:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L2f
            r2.close()     // Catch: java.io.IOException -> L58
            goto L2f
        L58:
            r1 = move-exception
            r1.printStackTrace()
            goto L2f
        L5d:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L60:
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.io.IOException -> L66
        L65:
            throw r0
        L66:
            r1 = move-exception
            r1.printStackTrace()
            goto L65
        L6b:
            r0 = move-exception
            goto L60
        L6d:
            r1 = move-exception
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.d.a(java.lang.Integer):android.graphics.Bitmap");
    }

    protected Bitmap a(String str) {
        Bitmap bitmap = null;
        e.b("Start processBitmap:" + str);
        try {
            Thread.sleep(16L);
            try {
                InputStream open = this.b.getAssets().open("theme/icon/" + str + ".png");
                bitmap = BitmapFactory.decodeStream(new BufferedInputStream(open));
                open.close();
                return bitmap;
            } catch (IOException e) {
                e.printStackTrace();
                return bitmap;
            }
        } catch (InterruptedException e2) {
            e.b("InterruptedException Error:" + str);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.f
    protected Bitmap a(Object obj) {
        if (obj instanceof Integer) {
            return a((Integer) obj);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        return null;
    }
}
