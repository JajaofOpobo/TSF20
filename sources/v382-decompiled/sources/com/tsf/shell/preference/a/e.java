package com.tsf.shell.preference.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class e extends TextureElement {
    public int a;
    final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, int i) {
        super(0, false);
        this.b = cVar;
        this.a = i;
    }

    public void a() {
        if (this.id == 0) {
            Bitmap createTextureBitmap = LauncherShortcutStandardInfo.createTextureBitmap(null, "TSF Launcher", x.a(this.a, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I), com.tsf.shell.manager.o.b.c, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I, false);
            com.censivn.C3DEngine.a.g().a(this, createTextureBitmap);
            createTextureBitmap.recycle();
        }
    }

    public void b() {
        if (this.id != 0) {
            com.censivn.C3DEngine.a.g().a(this);
        }
    }
}
