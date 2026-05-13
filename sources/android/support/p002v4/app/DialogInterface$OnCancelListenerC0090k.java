package android.support.p002v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
/* renamed from: android.support.v4.app.k */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC0090k extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    int f273a = 0;

    /* renamed from: b */
    int f274b = 0;

    /* renamed from: c */
    boolean f275c = true;

    /* renamed from: d */
    boolean f276d = true;

    /* renamed from: e */
    int f277e = -1;

    /* renamed from: f */
    Dialog f278f;

    /* renamed from: g */
    boolean f279g;

    /* renamed from: h */
    boolean f280h;

    /* renamed from: i */
    boolean f281i;

    /* renamed from: a */
    public void m13637a(int i, int i2) {
        this.f273a = i;
        if (this.f273a == 2 || this.f273a == 3) {
            this.f274b = 16973913;
        }
        if (i2 != 0) {
            this.f274b = i2;
        }
    }

    /* renamed from: a */
    public int m13634a(AbstractC0106s abstractC0106s, String str) {
        this.f280h = false;
        this.f281i = true;
        abstractC0106s.mo13494a(this, str);
        this.f279g = false;
        this.f277e = abstractC0106s.mo13498a();
        return this.f277e;
    }

    /* renamed from: a */
    public void m13638a() {
        m13633a(false);
    }

    /* renamed from: a */
    void m13633a(boolean z) {
        if (!this.f280h) {
            this.f280h = true;
            this.f281i = false;
            if (this.f278f != null) {
                this.f278f.dismiss();
                this.f278f = null;
            }
            this.f279g = true;
            if (this.f277e >= 0) {
                m13741k().mo13567a(this.f277e, 1);
                this.f277e = -1;
                return;
            }
            AbstractC0106s mo13569a = m13741k().mo13569a();
            mo13569a.mo13495a(this);
            if (z) {
                mo13569a.mo13493b();
            } else {
                mo13569a.mo13498a();
            }
        }
    }

    /* renamed from: b */
    public int m13632b() {
        return this.f274b;
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo13636a(Activity activity) {
        super.mo13636a(activity);
        if (!this.f281i) {
            this.f280h = false;
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: c */
    public void mo983c() {
        super.mo983c();
        if (!this.f281i && !this.f280h) {
            this.f280h = true;
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        super.mo782a(bundle);
        this.f276d = this.f125G == 0;
        if (bundle != null) {
            this.f273a = bundle.getInt("android:style", 0);
            this.f274b = bundle.getInt("android:theme", 0);
            this.f275c = bundle.getBoolean("android:cancelable", true);
            this.f276d = bundle.getBoolean("android:showsDialog", this.f276d);
            this.f277e = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: b */
    public LayoutInflater mo13631b(Bundle bundle) {
        if (!this.f276d) {
            return super.mo13631b(bundle);
        }
        this.f278f = m13630c(bundle);
        if (this.f278f != null) {
            m13635a(this.f278f, this.f273a);
            return (LayoutInflater) this.f278f.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.f121C.m13578g().getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public void m13635a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            default:
                return;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: c */
    public Dialog m13630c(Bundle bundle) {
        return new Dialog(m13745i(), m13632b());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f279g) {
            m13633a(true);
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: d */
    public void mo6071d(Bundle bundle) {
        Bundle bundle2;
        super.mo6071d(bundle);
        if (this.f276d) {
            View p = m13735p();
            if (p != null) {
                if (p.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f278f.setContentView(p);
            }
            this.f278f.setOwnerActivity(m13745i());
            this.f278f.setCancelable(this.f275c);
            this.f278f.setOnCancelListener(this);
            this.f278f.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f278f.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: d */
    public void mo13629d() {
        super.mo13629d();
        if (this.f278f != null) {
            this.f279g = false;
            this.f278f.show();
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: e */
    public void mo13627e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo13627e(bundle);
        if (this.f278f != null && (onSaveInstanceState = this.f278f.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        if (this.f273a != 0) {
            bundle.putInt("android:style", this.f273a);
        }
        if (this.f274b != 0) {
            bundle.putInt("android:theme", this.f274b);
        }
        if (!this.f275c) {
            bundle.putBoolean("android:cancelable", this.f275c);
        }
        if (!this.f276d) {
            bundle.putBoolean("android:showsDialog", this.f276d);
        }
        if (this.f277e != -1) {
            bundle.putInt("android:backStackId", this.f277e);
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: e */
    public void mo13628e() {
        super.mo13628e();
        if (this.f278f != null) {
            this.f278f.hide();
        }
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: f */
    public void mo13462f() {
        super.mo13462f();
        if (this.f278f != null) {
            this.f279g = true;
            this.f278f.dismiss();
            this.f278f = null;
        }
    }
}
