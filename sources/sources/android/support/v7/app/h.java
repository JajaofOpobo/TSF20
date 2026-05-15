package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.g;
import android.view.ActionMode;
import android.view.Window;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class h extends g {
    private final UiModeManager r;

    h(Context context, Window window, c cVar) {
        super(context, window, cVar);
        this.r = (UiModeManager) context.getSystemService("uimode");
    }

    @Override // android.support.v7.app.g, android.support.v7.app.e
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.g
    int d(int i) {
        if (i == 0 && this.r.getNightMode() == 0) {
            return -1;
        }
        return super.d(i);
    }

    class a extends g.a {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (h.this.n()) {
                switch (i) {
                    case 0:
                        return a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        @Override // android.support.v7.app.g.a, android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }
}
