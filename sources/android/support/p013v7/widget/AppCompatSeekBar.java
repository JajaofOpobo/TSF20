package android.support.p013v7.widget;

import android.content.Context;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* renamed from: android.support.v7.widget.AppCompatSeekBar */
/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    private C0750j f1775a;

    /* renamed from: b */
    private C0742g f1776b;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1776b = C0742g.m11215a();
        this.f1775a = new C0750j(this, this.f1776b);
        this.f1775a.mo11172a(attributeSet, i);
    }
}
