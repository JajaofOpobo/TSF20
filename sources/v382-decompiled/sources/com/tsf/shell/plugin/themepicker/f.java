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
public class f extends com.tsf.shell.plugin.themepicker.utils.q {
    private Context a;
    private Context b;
    private Resources e;

    public f(ResolveInfo resolveInfo, Context context, int i) {
        super(context);
        a(resolveInfo, context);
    }

    private void a(ResolveInfo resolveInfo, Context context) {
        this.a = context;
        if (resolveInfo == null) {
            g.b("resolveInfo is null Error");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    protected Bitmap a(Integer num) {
        InputStream inputStream;
        Bitmap bitmap = null;
        g.b("Start processBitmap:" + num);
        ?? r2 = 16;
        try {
            try {
                Thread.sleep(16L);
            } catch (Throwable th) {
                th = th;
            }
            try {
                inputStream = this.e.openRawResource(num.intValue());
                try {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    r2 = inputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            r2 = inputStream;
                        } catch (IOException e) {
                            e.printStackTrace();
                            r2 = inputStream;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    r2 = inputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            r2 = inputStream;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            r2 = inputStream;
                        }
                    }
                    return bitmap;
                }
            } catch (Exception e4) {
                e = e4;
                inputStream = null;
            } catch (Throwable th2) {
                r2 = 0;
                th = th2;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (InterruptedException e6) {
            g.b("InterruptedException Error:" + num);
        }
        return bitmap;
    }

    protected Bitmap a(String str) {
        Bitmap bitmap = null;
        g.b("Start processBitmap:" + str);
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
            g.b("InterruptedException Error:" + str);
            return null;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.q
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
