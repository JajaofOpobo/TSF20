package com.tsf.extend;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1423d;
/* renamed from: com.tsf.extend.g */
/* loaded from: classes.dex */
public class DialogC1546g extends Dialog {

    /* renamed from: d */
    protected static float f4876d = 0.9f;

    /* renamed from: e */
    protected static float f4877e = 1.0f;

    /* renamed from: a */
    private View f4878a;

    /* renamed from: b */
    private int f4879b;

    /* renamed from: c */
    private int f4880c;

    public DialogC1546g(Context context) {
        this(context, C1536f.C1544h.SmartDialogStyle);
    }

    public DialogC1546g(Context context, int i) {
        super(context, i);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        mo6561a(attributes);
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        if (C1423d.m8689a(context)) {
            f4876d = 0.6f;
            f4877e = 0.7f;
        }
    }

    /* renamed from: a */
    public void mo6561a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.6f;
    }

    /* renamed from: d */
    public FrameLayout m8294d(View view) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view, mo6413a());
        return frameLayout;
    }

    /* renamed from: a */
    public FrameLayout.LayoutParams mo6413a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        this.f4878a = view;
        FrameLayout m8294d = m8294d(view);
        view.measure(-1, -2);
        this.f4879b = view.getMeasuredWidth();
        this.f4880c = view.getMeasuredHeight();
        super.setContentView(m8294d);
    }

    /* renamed from: d */
    public View m8295d() {
        return this.f4878a;
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e) {
        }
    }
}
