package android.support.p013v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p002v4.view.C0309ai;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* renamed from: android.support.v7.widget.ContentFrameLayout */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f1807a;

    /* renamed from: b */
    private TypedValue f1808b;

    /* renamed from: c */
    private TypedValue f1809c;

    /* renamed from: d */
    private TypedValue f1810d;

    /* renamed from: e */
    private TypedValue f1811e;

    /* renamed from: f */
    private TypedValue f1812f;

    /* renamed from: g */
    private final Rect f1813g;

    /* renamed from: h */
    private InterfaceC0683a f1814h;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0683a {
        /* renamed from: a */
        void mo11535a();

        /* renamed from: b */
        void mo11534b();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1813g = new Rect();
    }

    /* renamed from: a */
    public void m11536a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(InterfaceC0683a interfaceC0683a) {
        this.f1814h = interfaceC0683a;
    }

    /* renamed from: a */
    public void m11537a(int i, int i2, int i3, int i4) {
        this.f1813g.set(i, i2, i3, i4);
        if (C0309ai.m12883x(this)) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p013v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1807a == null) {
            this.f1807a = new TypedValue();
        }
        return this.f1807a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1808b == null) {
            this.f1808b = new TypedValue();
        }
        return this.f1808b;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1809c == null) {
            this.f1809c = new TypedValue();
        }
        return this.f1809c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1810d == null) {
            this.f1810d = new TypedValue();
        }
        return this.f1810d;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1811e == null) {
            this.f1811e = new TypedValue();
        }
        return this.f1811e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1812f == null) {
            this.f1812f = new TypedValue();
        }
        return this.f1812f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1814h != null) {
            this.f1814h.mo11535a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1814h != null) {
            this.f1814h.mo11534b();
        }
    }
}
