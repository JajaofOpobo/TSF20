package com.tsf.shell.workspace3D.g.e;

import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.plugin.iconpicker.IconPicker;

/* loaded from: classes.dex */
public final class a implements com.tsf.shell.a {
    private static a a;
    private c b;
    private int c;
    private int d;
    private int e;

    public a() {
        String[] strArr = {com.censivn.C3DEngine.a.c().getString(R.string.icon_picker_main_item_0), com.censivn.C3DEngine.a.c().getString(R.string.icon_picker_main_item_1), com.censivn.C3DEngine.a.c().getString(R.string.icon_picker_main_item_2), com.censivn.C3DEngine.a.c().getString(R.string.icon_picker_main_item_3)};
    }

    public static void a(c cVar, int i, int i2) {
        b bVar = new b(cVar, i, i2);
        com.censivn.C3DEngine.a.a();
        w.a(bVar);
    }

    public final void b(c cVar, int i, int i2) {
        this.b = cVar;
        this.d = i;
        this.e = i2;
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.c(), IconPicker.class);
        intent.putExtra("width", this.d);
        intent.putExtra("height", this.e);
        this.c = Home.d().a(intent, a);
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
                    e.printStackTrace();
                    this.b = null;
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.b = null;
    }
}
