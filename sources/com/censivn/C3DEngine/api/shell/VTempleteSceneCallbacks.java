package com.censivn.C3DEngine.api.shell;

import android.view.KeyEvent;
import com.tsf.shell.p096f.p100b.C2284a;
/* loaded from: classes.dex */
public class VTempleteSceneCallbacks {
    private VTempleteSceneCallbacks mThis = this;
    public Object vTarget = new C2284a() { // from class: com.censivn.C3DEngine.api.shell.VTempleteSceneCallbacks.1
        @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: a */
        public void mo727a(int i, KeyEvent keyEvent) {
            VTempleteSceneCallbacks.this.mThis.onKeyDown(i, keyEvent);
        }

        @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
        /* renamed from: b */
        public void mo726b(int i, KeyEvent keyEvent) {
            VTempleteSceneCallbacks.this.mThis.onKeyUp(i, keyEvent);
        }
    };

    public void onKeyDown(int i, KeyEvent keyEvent) {
    }

    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}
