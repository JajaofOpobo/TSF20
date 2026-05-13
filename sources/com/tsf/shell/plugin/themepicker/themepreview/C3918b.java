package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.utils.C3951e;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.plugin.themepicker.themepreview.b */
/* loaded from: classes.dex */
public class C3918b extends C3951e {

    /* renamed from: e */
    private Context f12831e;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3918b(Context context, int i, int i2) {
        super(context, i, i2);
        this.f12831e = context;
    }

    /* renamed from: a */
    protected Bitmap m1186a(ResolveInfo resolveInfo) {
        try {
            Thread.sleep(16L);
            Context m1236a = C3897k.m1236a(this.f12831e, resolveInfo.activityInfo.packageName);
            Resources resources = m1236a.getResources();
            ArrayList<Integer> m1238a = C3897k.m1238a(m1236a);
            if (m1238a != null && m1238a.size() > 0) {
                return m1185a(resources, m1238a.get(0).intValue());
            }
            ArrayList<Integer> m1230b = C3897k.m1230b(m1236a);
            if (m1230b != null && m1230b.size() > 0) {
                return m1049a(resources, m1230b.get(0).intValue(), this.f12949a, this.f12950b, m1027f());
            }
            Bitmap bitmap = ((BitmapDrawable) m1236a.getApplicationInfo().loadIcon(this.f12831e.getPackageManager())).getBitmap();
            Bitmap createBitmap = Bitmap.createBitmap(this.f12949a, this.f12950b, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, (this.f12949a - bitmap.getWidth()) / 2, (this.f12950b - bitmap.getHeight()) / 2, (Paint) null);
            return createBitmap;
        } catch (InterruptedException e) {
            C3851e.m1317b("InterruptedException Error:" + resolveInfo);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.C3951e, com.tsf.shell.plugin.themepicker.utils.AbstractC3952f
    /* renamed from: a */
    protected Bitmap mo998a(Object obj) {
        if (obj instanceof ResolveInfo) {
            return m1186a((ResolveInfo) obj);
        }
        if (obj instanceof C3919a) {
            return m1184a((C3919a) obj);
        }
        return null;
    }

    /* renamed from: a */
    private Bitmap m1184a(C3919a c3919a) {
        Resources resources = C3897k.m1236a(this.f12831e, c3919a.f12832a).getResources();
        try {
            Thread.sleep(16L);
            return m1185a(resources, c3919a.f12833b);
        } catch (InterruptedException e) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap m1185a(android.content.res.Resources r4, int r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.themepicker.themepreview.C3918b.m1185a(android.content.res.Resources, int):android.graphics.Bitmap");
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.themepreview.b$a */
    /* loaded from: classes.dex */
    public static class C3919a {

        /* renamed from: a */
        public String f12832a;

        /* renamed from: b */
        public int f12833b;

        public C3919a(String str, int i) {
            this.f12833b = 0;
            this.f12832a = str;
            this.f12833b = i;
        }
    }
}
