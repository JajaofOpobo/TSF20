package com.censivn.C3DEngine.api.shell;

import android.view.KeyEvent;
import com.tsf.shell.f.b.a;
/* loaded from: classes.dex */
public class VTempleteSceneCallbacks {
    private VTempleteSceneCallbacks mThis = this;
    public Object vTarget = new a() { // from class: com.censivn.C3DEngine.api.shell.VTempleteSceneCallbacks.1
        @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
        public void a(int i, KeyEvent keyEvent) {
            VTempleteSceneCallbacks.this.mThis.onKeyDown(i, keyEvent);
        }

        @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
        public void b(int i, KeyEvent keyEvent) {
            VTempleteSceneCallbacks.this.mThis.onKeyUp(i, keyEvent);
        }
    };

    public void onKeyDown(int i, KeyEvent keyEvent) {
    }

    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}
