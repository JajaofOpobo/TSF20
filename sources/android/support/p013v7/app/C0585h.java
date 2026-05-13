package android.support.p013v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.p013v7.app.C0583g;
import android.view.ActionMode;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.h */
/* loaded from: classes.dex */
public class C0585h extends C0583g {

    /* renamed from: r */
    private final UiModeManager f1307r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0585h(Context context, Window window, InterfaceC0578c interfaceC0578c) {
        super(context, window, interfaceC0578c);
        this.f1307r = (UiModeManager) context.getSystemService("uimode");
    }

    @Override // android.support.p013v7.app.C0583g, android.support.p013v7.app.AbstractC0580e
    /* renamed from: a */
    Window.Callback mo11953a(Window.Callback callback) {
        return new C0586a(callback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p013v7.app.C0583g
    /* renamed from: d */
    public int mo11952d(int i) {
        if (i == 0 && this.f1307r.getNightMode() == 0) {
            return -1;
        }
        return super.mo11952d(i);
    }

    /* renamed from: android.support.v7.app.h$a */
    /* loaded from: classes.dex */
    class C0586a extends C0583g.C0584a {
        C0586a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (C0585h.this.mo11956n()) {
                switch (i) {
                    case 0:
                        return m11954a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        @Override // android.support.p013v7.app.C0583g.C0584a, android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }
}
