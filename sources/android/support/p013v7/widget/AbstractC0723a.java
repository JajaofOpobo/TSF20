package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0363bb;
import android.support.p002v4.view.C0427t;
import android.support.p002v4.view.InterfaceC0380bf;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0723a extends ViewGroup {

    /* renamed from: a */
    protected final C0724a f2061a;

    /* renamed from: b */
    protected final Context f2062b;

    /* renamed from: c */
    protected ActionMenuView f2063c;

    /* renamed from: d */
    protected ActionMenuPresenter f2064d;

    /* renamed from: e */
    protected int f2065e;

    /* renamed from: f */
    protected C0363bb f2066f;

    /* renamed from: g */
    private boolean f2067g;

    /* renamed from: h */
    private boolean f2068h;

    AbstractC0723a(Context context) {
        this(context, null);
    }

    AbstractC0723a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0723a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2061a = new C0724a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0535a.C0536a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f2062b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f2062b = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0535a.C0546k.ActionBar, C0535a.C0536a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0535a.C0546k.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f2064d != null) {
            this.f2064d.m11634a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int m12599a = C0427t.m12599a(motionEvent);
        if (m12599a == 0) {
            this.f2067g = false;
        }
        if (!this.f2067g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (m12599a == 0 && !onTouchEvent) {
                this.f2067g = true;
            }
        }
        if (m12599a == 1 || m12599a == 3) {
            this.f2067g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int m12599a = C0427t.m12599a(motionEvent);
        if (m12599a == 9) {
            this.f2068h = false;
        }
        if (!this.f2068h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (m12599a == 9 && !onHoverEvent) {
                this.f2068h = true;
            }
        }
        if (m12599a == 10 || m12599a == 3) {
            this.f2068h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f2065e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.f2065e;
    }

    public int getAnimatedVisibility() {
        return this.f2066f != null ? this.f2061a.f2069a : getVisibility();
    }

    /* renamed from: a */
    public C0363bb mo11307a(int i, long j) {
        if (this.f2066f != null) {
            this.f2066f.m12702b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                C0309ai.m12914b((View) this, 0.0f);
            }
            C0363bb m12710a = C0309ai.m12895l(this).m12710a(1.0f);
            m12710a.m12709a(j);
            m12710a.m12705a(this.f2061a.m11302a(m12710a, i));
            return m12710a;
        }
        C0363bb m12710a2 = C0309ai.m12895l(this).m12710a(0.0f);
        m12710a2.m12709a(j);
        m12710a2.m12705a(this.f2061a.m11302a(m12710a2, i));
        return m12710a2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f2066f != null) {
                this.f2066f.m12702b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo11309a() {
        if (this.f2064d != null) {
            return this.f2064d.m11617d();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m11305a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m11308a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m11304a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: android.support.v7.widget.a$a */
    /* loaded from: classes.dex */
    protected class C0724a implements InterfaceC0380bf {

        /* renamed from: a */
        int f2069a;

        /* renamed from: c */
        private boolean f2071c = false;

        protected C0724a() {
        }

        /* renamed from: a */
        public C0724a m11302a(C0363bb c0363bb, int i) {
            AbstractC0723a.this.f2066f = c0363bb;
            this.f2069a = i;
            return this;
        }

        @Override // android.support.p002v4.view.InterfaceC0380bf
        /* renamed from: a */
        public void mo11265a(View view) {
            AbstractC0723a.super.setVisibility(0);
            this.f2071c = false;
        }

        @Override // android.support.p002v4.view.InterfaceC0380bf
        /* renamed from: b */
        public void mo11264b(View view) {
            if (!this.f2071c) {
                AbstractC0723a.this.f2066f = null;
                AbstractC0723a.super.setVisibility(this.f2069a);
            }
        }

        @Override // android.support.p002v4.view.InterfaceC0380bf
        /* renamed from: c */
        public void mo11263c(View view) {
            this.f2071c = true;
        }
    }
}
