package com.tsf.shell.e.e.h;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.i;
import com.tsf.shell.plugin.themepicker.AppIconEditorActivity;

/* loaded from: classes.dex */
public class c implements com.censivn.C3DEngine.b.c.b {
    private static c a;
    private d b;
    private int c;
    private int d;
    private int e;

    public c() {
        String[] strArr = {com.censivn.C3DEngine.a.d().getString(R.string.icon_picker_main_item_0), com.censivn.C3DEngine.a.d().getString(R.string.icon_picker_main_item_1), com.censivn.C3DEngine.a.d().getString(R.string.icon_picker_main_item_2), com.censivn.C3DEngine.a.d().getString(R.string.icon_picker_main_item_3)};
    }

    public static void a(final d dVar, final com.tsf.shell.e.i.b.e.b bVar, final int i, final int i2) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.h.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.a == null) {
                    c.a = new c();
                }
                c.a.b(d.this, bVar, i, i2);
            }
        });
    }

    public void b(d dVar, com.tsf.shell.e.i.b.e.b bVar, int i, int i2) {
        this.b = dVar;
        this.d = i;
        this.e = i2;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) bVar.K();
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.d(), AppIconEditorActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("icon", launcherShortcut3DInfo.getIconBitmap());
        bundle.putString("name", launcherShortcut3DInfo.title);
        if (launcherShortcut3DInfo instanceof LauncherShortcutAppInfo) {
            bundle.putString("package", ((i) bVar).bd().b.getPackageName());
        }
        bundle.putInt("width", this.d);
        bundle.putInt("height", this.e);
        bundle.putInt("iconStartX", bVar.aE().D);
        bundle.putInt("iconStartY", bVar.aE().E);
        bundle.putInt("iconWidth", bVar.aE().H);
        bundle.putInt("iconHeight", bVar.aE().I);
        intent.putExtra("appInfo", bundle);
        this.c = Home.b().b(intent, a);
    }

    @Override // com.censivn.C3DEngine.b.c.b
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == this.c) {
                Bundle extras = intent.getExtras();
                Bitmap bitmap = (Bitmap) extras.getParcelable("icon");
                String string = extras.getString("name");
                boolean z = extras.getBoolean("reset");
                if (this.b == null) {
                    bitmap.recycle();
                    return;
                }
                try {
                    if (z) {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.b.b();
                        return;
                    } else {
                        this.b.a(bitmap, string);
                        this.b = null;
                        return;
                    }
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
