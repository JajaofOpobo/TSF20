package android.support.p013v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p013v7.app.DialogInterfaceC0576b;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
/* renamed from: android.support.v7.view.menu.g */
/* loaded from: classes.dex */
class DialogInterface$OnClickListenerC0631g implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, InterfaceC0643l.InterfaceC0644a {

    /* renamed from: a */
    C0626e f1544a;

    /* renamed from: b */
    private C0628f f1545b;

    /* renamed from: c */
    private DialogInterfaceC0576b f1546c;

    /* renamed from: d */
    private InterfaceC0643l.InterfaceC0644a f1547d;

    public DialogInterface$OnClickListenerC0631g(C0628f c0628f) {
        this.f1545b = c0628f;
    }

    /* renamed from: a */
    public void m11740a(IBinder iBinder) {
        C0628f c0628f = this.f1545b;
        DialogInterfaceC0576b.C0577a c0577a = new DialogInterfaceC0576b.C0577a(c0628f.m11755e());
        this.f1544a = new C0626e(c0577a.m12001a(), C0535a.C0543h.abc_list_menu_item_layout);
        this.f1544a.m11790a(this);
        this.f1545b.m11776a(this.f1544a);
        c0577a.m11997a(this.f1544a.m11792a(), this);
        View m11744o = c0628f.m11744o();
        if (m11744o != null) {
            c0577a.m11998a(m11744o);
        } else {
            c0577a.m11999a(c0628f.m11745n()).m11996a(c0628f.m11746m());
        }
        c0577a.m12000a(this);
        this.f1546c = c0577a.m11995b();
        this.f1546c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1546c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1546c.show();
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
                Window window2 = this.f1546c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1546c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1545b.m11766a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1545b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void m11741a() {
        if (this.f1546c != null) {
            this.f1546c.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1544a.mo11317a(this.f1545b, true);
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
    /* renamed from: a */
    public void mo11116a(C0628f c0628f, boolean z) {
        if (z || c0628f == this.f1545b) {
            m11741a();
        }
        if (this.f1547d != null) {
            this.f1547d.mo11116a(c0628f, z);
        }
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
    /* renamed from: a_ */
    public boolean mo11114a_(C0628f c0628f) {
        if (this.f1547d != null) {
            return this.f1547d.mo11114a_(c0628f);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1545b.m11772a((C0632h) this.f1544a.m11792a().getItem(i), 0);
    }
}
