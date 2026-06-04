package com.tsf.shell;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class aj implements Runnable {
    final /* synthetic */ ai a;
    private final /* synthetic */ Intent b;

    aj(ai aiVar, Intent intent) {
        this.a = aiVar;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        int[] iArr2;
        int z = com.tsf.shell.workspace3D.bf.j().z();
        if (z == -1) {
            z = com.tsf.shell.workspace3D.bf.j().m();
        }
        iArr = this.a.a.k;
        float f = iArr[0];
        iArr2 = this.a.a.k;
        float[] b = com.censivn.C3DEngine.h.a.b(f, iArr2[1]);
        Intent intent = (Intent) this.b.getParcelableExtra("android.intent.extra.shortcut.INTENT");
        String stringExtra = this.b.getStringExtra("android.intent.extra.shortcut.NAME");
        Bitmap bitmap = (Bitmap) this.b.getParcelableExtra("android.intent.extra.shortcut.ICON");
        if (intent != null && "android.intent.action.CALL_PRIVILEGED".equals(intent.getAction())) {
            intent.setAction("android.intent.action.CALL");
        }
        if (bitmap != null) {
            com.tsf.shell.e.a.a(stringExtra, bitmap, intent, z, b[0], b[1]);
            return;
        }
        Parcelable parcelableExtra = this.b.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
        if (parcelableExtra != null && (parcelableExtra instanceof Intent.ShortcutIconResource)) {
            com.tsf.shell.e.a.a(stringExtra, (Intent.ShortcutIconResource) parcelableExtra, intent, z, b[0], b[1]);
        }
    }
}
