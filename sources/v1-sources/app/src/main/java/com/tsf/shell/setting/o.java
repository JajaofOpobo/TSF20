package com.tsf.shell.setting;

import android.bluetooth.BluetoothAdapter;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class o extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(l lVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = lVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        c a = c.a();
        BluetoothAdapter b = a.b();
        if (b != null) {
            switch (b.getState()) {
                case 10:
                    a.c();
                    break;
                case 12:
                    a.d();
                    break;
            }
        }
    }
}
