package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.a.a;
import android.support.v7.app.b;
import android.support.v7.view.menu.l;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class g implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, l.a {
    e a;
    private f b;
    private android.support.v7.app.b c;
    private l.a d;

    public g(f fVar) {
        this.b = fVar;
    }

    public void a(IBinder iBinder) {
        f fVar = this.b;
        b.a aVar = new b.a(fVar.e());
        this.a = new e(aVar.a(), a.h.abc_list_menu_item_layout);
        this.a.a(this);
        this.b.a(this.a);
        aVar.a(this.a.a(), this);
        View viewO = fVar.o();
        if (viewO != null) {
            aVar.a(viewO);
        } else {
            aVar.a(fVar.n()).a(fVar.m());
        }
        aVar.a(this);
        this.c = aVar.b();
        this.c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.c.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.b.performShortcut(i, keyEvent, 0);
    }

    public void a() {
        if (this.c != null) {
            this.c.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.a.a(this.b, true);
    }

    @Override // android.support.v7.view.menu.l.a
    public void a(f fVar, boolean z) {
        if (z || fVar == this.b) {
            a();
        }
        if (this.d != null) {
            this.d.a(fVar, z);
        }
    }

    @Override // android.support.v7.view.menu.l.a
    public boolean a_(f fVar) {
        if (this.d != null) {
            return this.d.a_(fVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a((h) this.a.a().getItem(i), 0);
    }
}
