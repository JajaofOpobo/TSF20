package com.censivn.C3DEngine.api.shell;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class a extends com.tsf.shell.workspace3D.d.a {
    final /* synthetic */ VTempleteSceneCallbacks a;

    a(VTempleteSceneCallbacks vTempleteSceneCallbacks) {
        this.a = vTempleteSceneCallbacks;
    }

    @Override // com.tsf.shell.workspace3D.d.a, com.tsf.shell.at
    public final void a(int i) {
        VTempleteSceneCallbacks vTempleteSceneCallbacks;
        vTempleteSceneCallbacks = this.a.mThis;
        vTempleteSceneCallbacks.onKeyDown(i, null);
    }

    @Override // com.tsf.shell.workspace3D.d.a, com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
        VTempleteSceneCallbacks vTempleteSceneCallbacks;
        vTempleteSceneCallbacks = this.a.mThis;
        vTempleteSceneCallbacks.onKeyUp(i, keyEvent);
    }
}
