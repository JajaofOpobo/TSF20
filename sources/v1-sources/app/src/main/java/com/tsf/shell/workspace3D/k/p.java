package com.tsf.shell.workspace3D.k;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
public class p extends ab {
    public int[] aH() {
        return null;
    }

    public final void a(Bitmap bitmap) {
        bs();
        ((LauncherShortcut3DInfo) be()).onUpdatePhoto(bitmap);
        if (bitmap != null) {
            bitmap.recycle();
        }
        q qVar = new q(this);
        qVar.autoInvalidate = true;
        com.censivn.C3DEngine.a.a().a((RenderRunnable) qVar);
    }

    public final void c(String str) {
        if (str != null && !str.equals("")) {
            bs();
            ((LauncherShortcut3DInfo) be()).onUpdateName(str);
            r rVar = new r(this);
            rVar.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a((RenderRunnable) rVar);
        }
    }

    public void aJ() {
    }
}
