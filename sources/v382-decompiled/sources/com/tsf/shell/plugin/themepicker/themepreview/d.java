package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.utils.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends p {
    private Context e;

    protected d(Context context, int i, int i2) {
        super(context, i, i2);
        this.e = context;
    }

    protected Bitmap a(ResolveInfo resolveInfo) {
        try {
            Thread.sleep(16L);
            Context a = ac.a(this.e, resolveInfo.activityInfo.packageName);
            Resources resources = a.getResources();
            ArrayList a2 = ac.a(a);
            if (a2 != null && a2.size() > 0) {
                return a(resources, ((Integer) a2.get(0)).intValue());
            }
            ArrayList b = ac.b(a);
            if (b != null && b.size() > 0) {
                return a(resources, ((Integer) b.get(0)).intValue(), this.a, this.b, f());
            }
            Bitmap bitmap = ((BitmapDrawable) a.getApplicationInfo().loadIcon(this.e.getPackageManager())).getBitmap();
            Bitmap createBitmap = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, (this.a - bitmap.getWidth()) / 2, (this.b - bitmap.getHeight()) / 2, (Paint) null);
            return createBitmap;
        } catch (InterruptedException e) {
            com.tsf.shell.plugin.themepicker.g.b("InterruptedException Error:" + resolveInfo);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.p, com.tsf.shell.plugin.themepicker.utils.q
    protected Bitmap a(Object obj) {
        if (obj instanceof ResolveInfo) {
            return a((ResolveInfo) obj);
        }
        if (obj instanceof e) {
            return a((e) obj);
        }
        return null;
    }

    private Bitmap a(e eVar) {
        Resources resources = ac.a(this.e, eVar.a).getResources();
        try {
            Thread.sleep(16L);
            return a(resources, eVar.b);
        } catch (InterruptedException e) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap a(Resources resources, int i) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        try {
            try {
                inputStream = resources.openRawResource(i);
                try {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return bitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
            if (inputStream != null) {
            }
            throw th;
        }
        return bitmap;
    }
}
