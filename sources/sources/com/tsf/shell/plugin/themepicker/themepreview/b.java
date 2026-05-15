package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.tsf.shell.plugin.themepicker.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.tsf.shell.plugin.themepicker.utils.e {
    private Context e;

    protected b(Context context, int i, int i2) {
        super(context, i, i2);
        this.e = context;
    }

    protected Bitmap a(ResolveInfo resolveInfo) {
        try {
            Thread.sleep(16L);
            Context contextA = k.a(this.e, resolveInfo.activityInfo.packageName);
            Resources resources = contextA.getResources();
            ArrayList<Integer> arrayListA = k.a(contextA);
            if (arrayListA != null && arrayListA.size() > 0) {
                return a(resources, arrayListA.get(0).intValue());
            }
            ArrayList<Integer> arrayListB = k.b(contextA);
            if (arrayListB != null && arrayListB.size() > 0) {
                return a(resources, arrayListB.get(0).intValue(), this.a, this.b, f());
            }
            Bitmap bitmap = ((BitmapDrawable) contextA.getApplicationInfo().loadIcon(this.e.getPackageManager())).getBitmap();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (this.a - bitmap.getWidth()) / 2, (this.b - bitmap.getHeight()) / 2, (Paint) null);
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            com.tsf.shell.plugin.themepicker.e.b("InterruptedException Error:" + resolveInfo);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.e, com.tsf.shell.plugin.themepicker.utils.f
    protected Bitmap a(Object obj) {
        if (obj instanceof ResolveInfo) {
            return a((ResolveInfo) obj);
        }
        if (obj instanceof a) {
            return a((a) obj);
        }
        return null;
    }

    private Bitmap a(a aVar) {
        Resources resources = k.a(this.e, aVar.a).getResources();
        try {
            Thread.sleep(16L);
            return a(resources, aVar.b);
        } catch (InterruptedException e) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap a(android.content.res.Resources r4, int r5) throws java.lang.Throwable {
        /*
            r3 = this;
            r0 = 0
            java.io.InputStream r2 = r4.openRawResource(r5)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L24
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r2 == 0) goto Le
            r2.close()     // Catch: java.io.IOException -> Lf
        Le:
            return r0
        Lf:
            r1 = move-exception
            r1.printStackTrace()
            goto Le
        L14:
            r1 = move-exception
            r2 = r0
        L16:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto Le
            r2.close()     // Catch: java.io.IOException -> L1f
            goto Le
        L1f:
            r1 = move-exception
            r1.printStackTrace()
            goto Le
        L24:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L27:
            if (r2 == 0) goto L2c
            r2.close()     // Catch: java.io.IOException -> L2d
        L2c:
            throw r0
        L2d:
            r1 = move-exception
            r1.printStackTrace()
            goto L2c
        L32:
            r0 = move-exception
            goto L27
        L34:
            r1 = move-exception
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.themepreview.b.a(android.content.res.Resources, int):android.graphics.Bitmap");
    }

    public static class a {
        public String a;
        public int b;

        public a(String str, int i) {
            this.b = 0;
            this.a = str;
            this.b = i;
        }
    }
}
