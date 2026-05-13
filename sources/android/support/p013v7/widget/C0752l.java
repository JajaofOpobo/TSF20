package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.l */
/* loaded from: classes.dex */
public class C0752l extends C0751k {

    /* renamed from: b */
    private static final int[] f2165b = {16843666, 16843667};

    /* renamed from: c */
    private C0773y f2166c;

    /* renamed from: d */
    private C0773y f2167d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0752l(TextView textView) {
        super(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p013v7.widget.C0751k
    /* renamed from: a */
    public void mo11165a(AttributeSet attributeSet, int i) {
        super.mo11165a(attributeSet, i);
        Context context = this.f2160a.getContext();
        C0742g m11215a = C0742g.m11215a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2165b, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2166c = m11170a(context, m11215a, obtainStyledAttributes.getResourceId(0, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2167d = m11170a(context, m11215a, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p013v7.widget.C0751k
    /* renamed from: a */
    public void mo11166a() {
        super.mo11166a();
        if (this.f2166c != null || this.f2167d != null) {
            Drawable[] compoundDrawablesRelative = this.f2160a.getCompoundDrawablesRelative();
            m11169a(compoundDrawablesRelative[0], this.f2166c);
            m11169a(compoundDrawablesRelative[2], this.f2167d);
        }
    }
}
