package com.tsf.shell.f.e._a;

import android.view.KeyEvent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class DropTargetKeyHandler implements com.censivn.C3DEngine.b.c.b.a {
    DropTargetKeyHandler() {
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            DropTargetItem.b();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }
}
