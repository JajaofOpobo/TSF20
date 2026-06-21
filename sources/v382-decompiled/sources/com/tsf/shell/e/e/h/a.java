package com.tsf.shell.e.e.h;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tsf.shell.Home;
import com.tsf.shell.activity.PhotoSelectorActivity;
import com.tsf.shell.utils.r;

/* loaded from: classes.dex */
public class a implements com.censivn.C3DEngine.b.c.b {
    private static a a;
    private b b;
    private int c;

    public static void a(b bVar, int i, int i2) {
        if (a == null) {
            a = new a();
        }
        a.b(bVar, i, i2);
    }

    public void b(b bVar, int i, int i2) {
        this.b = bVar;
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.d(), PhotoSelectorActivity.class);
        intent.putExtra("image_width", i);
        intent.putExtra("image_height", i2);
        this.c = Home.b().a(intent, (com.censivn.C3DEngine.b.c.b) this);
    }

    @Override // com.censivn.C3DEngine.b.c.b
    public void onActivityResult(int i, int i2, final Intent intent) {
        if (i2 == -1) {
            if (i == this.c) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.e.h.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap d;
                        if (intent.getIntExtra("data_mode", 0) == 0) {
                            d = (Bitmap) intent.getParcelableExtra("data");
                        } else {
                            d = r.d(BitmapFactory.decodeFile(intent.getData().getPath()), intent.getIntExtra("image_width", 100), intent.getIntExtra("image_height", 100));
                        }
                        if (a.this.b != null) {
                            try {
                                a.this.b.a(d);
                                a.this.b = null;
                                return;
                            } catch (Exception e) {
                                a.this.b = null;
                                d.recycle();
                                return;
                            }
                        }
                        d.recycle();
                    }
                });
                return;
            }
            return;
        }
        this.b = null;
    }
}
