package com.tsf.extend;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends Dialog {
    protected static float d = 0.9f;
    protected static float e = 1.0f;
    private View a;
    private int b;
    private int c;

    public g(Context context) {
        this(context, f.h.SmartDialogStyle);
    }

    public g(Context context, int i) {
        super(context, i);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        a(attributes);
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        if (com.tsf.extend.base.j.d.a(context)) {
            d = 0.6f;
            e = 0.7f;
        }
    }

    public void a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.6f;
    }

    public FrameLayout d(View view) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view, a());
        return frameLayout;
    }

    public FrameLayout.LayoutParams a() {
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
        this.a = view;
        FrameLayout frameLayoutD = d(view);
        view.measure(-1, -2);
        this.b = view.getMeasuredWidth();
        this.c = view.getMeasuredHeight();
        super.setContentView(frameLayoutD);
    }

    public View d() {
        return this.a;
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e2) {
        }
    }
}
