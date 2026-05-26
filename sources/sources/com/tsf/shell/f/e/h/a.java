package com.tsf.shell.f.e.h;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.b.c.a;
import com.tsf.shell.Home;
import com.tsf.shell.activity.PhotoSelectorActivity;
import com.tsf.shell.utils.q;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a implements a.InterfaceC0025a {
    private static a a;
    private InterfaceC0098a b;
    private int c;

    /* JADX INFO: renamed from: com.tsf.shell.f.e.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0098a {
        void a(Bitmap bitmap);
    }

    public static void a(InterfaceC0098a interfaceC0098a, int i, int i2) {
        if (a == null) {
            a = new a();
        }
        a.b(interfaceC0098a, i, i2);
    }

    public void b(InterfaceC0098a interfaceC0098a, int i, int i2) {
        this.b = interfaceC0098a;
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.d(), PhotoSelectorActivity.class);
        intent.putExtra("image_width", i);
        intent.putExtra("image_height", i2);
        this.c = Home.b().a(intent, (a.InterfaceC0025a) this);
    }

    @Override // com.censivn.C3DEngine.b.c.a.InterfaceC0025a
    public void onActivityResult(int i, int i2, final Intent intent) {
        if (i2 == -1) {
            if (i == this.c) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.e.h.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap bitmapD;
                        if (intent.getIntExtra("data_mode", 0) == 0) {
                            bitmapD = (Bitmap) intent.getParcelableExtra("data");
                        } else {
                            bitmapD = q.d(BitmapFactory.decodeFile(intent.getData().getPath()), intent.getIntExtra("image_width", 100), intent.getIntExtra("image_height", 100));
                        }
                        if (a.this.b != null) {
                            try {
                                a.this.b.a(bitmapD);
                                a.this.b = null;
                                return;
                            } catch (Exception e) {
                                a.this.b = null;
                                bitmapD.recycle();
                                return;
                            }
                        }
                        bitmapD.recycle();
                    }
                });
                return;
            }
            return;
        }
        this.b = null;
    }
}
