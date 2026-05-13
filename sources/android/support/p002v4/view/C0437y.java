package android.support.p002v4.view;

import android.view.View;
import android.view.ViewParent;
/* renamed from: android.support.v4.view.y */
/* loaded from: classes.dex */
public class C0437y {

    /* renamed from: a */
    private final View f798a;

    /* renamed from: b */
    private ViewParent f799b;

    /* renamed from: c */
    private boolean f800c;

    /* renamed from: d */
    private int[] f801d;

    public C0437y(View view) {
        this.f798a = view;
    }

    /* renamed from: a */
    public void m12570a(boolean z) {
        if (this.f800c) {
            C0309ai.m12884w(this.f798a);
        }
        this.f800c = z;
    }

    /* renamed from: a */
    public boolean m12576a() {
        return this.f800c;
    }

    /* renamed from: b */
    public boolean m12569b() {
        return this.f799b != null;
    }

    /* renamed from: a */
    public boolean m12573a(int i) {
        if (m12569b()) {
            return true;
        }
        if (m12576a()) {
            View view = this.f798a;
            for (ViewParent parent = this.f798a.getParent(); parent != null; parent = parent.getParent()) {
                if (C0351az.m12743a(parent, view, this.f798a, i)) {
                    this.f799b = parent;
                    C0351az.m12742b(parent, view, this.f798a, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m12568c() {
        if (this.f799b != null) {
            C0351az.m12748a(this.f799b, this.f798a);
            this.f799b = null;
        }
    }

    /* renamed from: a */
    public boolean m12572a(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        if (!m12576a() || this.f799b == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            if (iArr != null) {
                this.f798a.getLocationInWindow(iArr);
                int i7 = iArr[0];
                i5 = iArr[1];
                i6 = i7;
            } else {
                i5 = 0;
                i6 = 0;
            }
            C0351az.m12745a(this.f799b, this.f798a, i, i2, i3, i4);
            if (iArr != null) {
                this.f798a.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i6;
                iArr[1] = iArr[1] - i5;
            }
            return true;
        } else if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m12571a(int i, int i2, int[] iArr, int[] iArr2) {
        int i3;
        int i4;
        if (!m12576a() || this.f799b == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f798a.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i3 = iArr2[1];
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.f801d == null) {
                    this.f801d = new int[2];
                }
                iArr = this.f801d;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0351az.m12744a(this.f799b, this.f798a, i, i2, iArr);
            if (iArr2 != null) {
                this.f798a.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i3;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m12574a(float f, float f2, boolean z) {
        if (!m12576a() || this.f799b == null) {
            return false;
        }
        return C0351az.m12746a(this.f799b, this.f798a, f, f2, z);
    }

    /* renamed from: a */
    public boolean m12575a(float f, float f2) {
        if (!m12576a() || this.f799b == null) {
            return false;
        }
        return C0351az.m12747a(this.f799b, this.f798a, f, f2);
    }
}
