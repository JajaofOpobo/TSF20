package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* renamed from: android.support.v7.widget.ViewStubCompat */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f2056a;

    /* renamed from: b */
    private int f2057b;

    /* renamed from: c */
    private WeakReference<View> f2058c;

    /* renamed from: d */
    private LayoutInflater f2059d;

    /* renamed from: e */
    private InterfaceC0722a f2060e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0722a {
        /* renamed from: a */
        void m11310a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2056a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.ViewStubCompat, i, 0);
        this.f2057b = obtainStyledAttributes.getResourceId(C0535a.C0546k.ViewStubCompat_android_inflatedId, -1);
        this.f2056a = obtainStyledAttributes.getResourceId(C0535a.C0546k.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0535a.C0546k.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f2057b;
    }

    public void setInflatedId(int i) {
        this.f2057b = i;
    }

    public int getLayoutResource() {
        return this.f2056a;
    }

    public void setLayoutResource(int i) {
        this.f2056a = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2059d = layoutInflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2059d;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.f2058c != null) {
            View view = this.f2058c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m11311a();
        }
    }

    /* renamed from: a */
    public View m11311a() {
        LayoutInflater from;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            if (this.f2056a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (this.f2059d != null) {
                    from = this.f2059d;
                } else {
                    from = LayoutInflater.from(getContext());
                }
                View inflate = from.inflate(this.f2056a, viewGroup, false);
                if (this.f2057b != -1) {
                    inflate.setId(this.f2057b);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f2058c = new WeakReference<>(inflate);
                if (this.f2060e != null) {
                    this.f2060e.m11310a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public void setOnInflateListener(InterfaceC0722a interfaceC0722a) {
        this.f2060e = interfaceC0722a;
    }
}
