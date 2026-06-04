package com.tsf.shell.workspace3D.g.e;

import android.content.Intent;
import android.graphics.Bitmap;
import com.tsf.shell.Home;
import com.tsf.shell.activity.PhotoSelectorActivity;

/* loaded from: classes.dex */
public final class d implements com.tsf.shell.a {
    private static d a;
    private e b;
    private int c;

    public static void a(e eVar) {
        if (a == null) {
            a = new d();
        }
        d dVar = a;
        dVar.b = eVar;
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), PhotoSelectorActivity.class);
        intent.putExtra("image_width", 256);
        intent.putExtra("image_height", 256);
        dVar.c = Home.d().a(intent, dVar);
    }

    @Override // com.tsf.shell.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == this.c) {
                Bitmap bitmap = (Bitmap) intent.getParcelableExtra("data");
                if (this.b == null) {
                    bitmap.recycle();
                    return;
                }
                try {
                    this.b.a(bitmap);
                    this.b = null;
                    return;
                } catch (Exception e) {
                    this.b = null;
                    bitmap.recycle();
                    return;
                }
            }
            return;
        }
        this.b = null;
    }
}
