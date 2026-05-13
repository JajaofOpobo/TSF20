package com.tsf.extend.base.widget.pulltorefresh.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public abstract class d extends FrameLayout implements com.tsf.extend.base.widget.pulltorefresh.a {
    static final Interpolator a = new LinearInterpolator();
    protected final ImageView b;
    protected final ProgressBar c;
    protected final PullToRefreshBase.b d;
    protected final PullToRefreshBase.h e;
    private ViewGroup f;
    private boolean g;
    private final TextView h;
    private final TextView i;
    private CharSequence j;
    private CharSequence k;
    private CharSequence l;

    protected abstract void a();

    protected abstract void a(float f);

    protected abstract void a(Drawable drawable);

    protected abstract void b();

    protected abstract void c();

    protected abstract void d();

    protected abstract int getDefaultDrawableResId();

    public d(Context context, PullToRefreshBase.b bVar, PullToRefreshBase.h hVar, TypedArray typedArray) {
        super(context);
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable;
        this.d = bVar;
        this.e = hVar;
        switch (hVar) {
            case HORIZONTAL:
                LayoutInflater.from(context).inflate(f.C0052f.kui_ptr_header_horizontal, this);
                break;
            default:
                LayoutInflater.from(context).inflate(f.C0052f.kui_ptr_header_vertical, this);
                break;
        }
        this.f = (ViewGroup) findViewById(f.e.fl_inner);
        this.h = (TextView) this.f.findViewById(f.e.pull_to_refresh_text);
        this.c = (ProgressBar) this.f.findViewById(f.e.pull_to_refresh_progress);
        this.c.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 2, 1));
        this.i = (TextView) this.f.findViewById(f.e.pull_to_refresh_sub_text);
        this.b = (ImageView) this.f.findViewById(f.e.pull_to_refresh_image);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        switch (bVar) {
            case PULL_FROM_END:
                layoutParams.gravity = hVar == PullToRefreshBase.h.VERTICAL ? 48 : 3;
                this.j = context.getString(f.g.ptr_from_bottom_pull_label);
                this.k = context.getString(f.g.ptr_from_bottom_refreshing_label);
                this.l = context.getString(f.g.ptr_from_bottom_release_label);
                break;
            default:
                layoutParams.gravity = hVar == PullToRefreshBase.h.VERTICAL ? 80 : 5;
                this.j = context.getString(f.g.ptr_pull_label);
                this.k = context.getString(f.g.ptr_refreshing_label);
                this.l = context.getString(f.g.ptr_release_label);
                break;
        }
        if (typedArray.hasValue(f.i.PullToRefresh_ptrHeaderBackground) && (drawable = typedArray.getDrawable(f.i.PullToRefresh_ptrHeaderBackground)) != null) {
            setBackgroundDrawable(drawable);
        }
        if (typedArray.hasValue(f.i.PullToRefresh_ptrHeaderTextAppearance)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(f.i.PullToRefresh_ptrHeaderTextAppearance, typedValue);
            setTextAppearance(typedValue.data);
        }
        if (typedArray.hasValue(f.i.PullToRefresh_ptrSubHeaderTextAppearance)) {
            TypedValue typedValue2 = new TypedValue();
            typedArray.getValue(f.i.PullToRefresh_ptrSubHeaderTextAppearance, typedValue2);
            setSubTextAppearance(typedValue2.data);
        }
        if (typedArray.hasValue(f.i.PullToRefresh_ptrHeaderTextColor) && (colorStateList2 = typedArray.getColorStateList(f.i.PullToRefresh_ptrHeaderTextColor)) != null) {
            setTextColor(colorStateList2);
        }
        if (typedArray.hasValue(f.i.PullToRefresh_ptrHeaderSubTextColor) && (colorStateList = typedArray.getColorStateList(f.i.PullToRefresh_ptrHeaderSubTextColor)) != null) {
            setSubTextColor(colorStateList);
        }
        Drawable drawable2 = typedArray.hasValue(f.i.PullToRefresh_ptrDrawable) ? typedArray.getDrawable(f.i.PullToRefresh_ptrDrawable) : null;
        switch (bVar) {
            case PULL_FROM_END:
                if (typedArray.hasValue(f.i.PullToRefresh_ptrDrawableEnd)) {
                    drawable2 = typedArray.getDrawable(f.i.PullToRefresh_ptrDrawableEnd);
                    break;
                } else if (typedArray.hasValue(f.i.PullToRefresh_ptrDrawableBottom)) {
                    f.a("ptrDrawableBottom", "ptrDrawableEnd");
                    drawable2 = typedArray.getDrawable(f.i.PullToRefresh_ptrDrawableBottom);
                    break;
                }
                break;
            default:
                if (typedArray.hasValue(f.i.PullToRefresh_ptrDrawableStart)) {
                    drawable2 = typedArray.getDrawable(f.i.PullToRefresh_ptrDrawableStart);
                    break;
                } else if (typedArray.hasValue(f.i.PullToRefresh_ptrDrawableTop)) {
                    f.a("ptrDrawableTop", "ptrDrawableStart");
                    drawable2 = typedArray.getDrawable(f.i.PullToRefresh_ptrDrawableTop);
                    break;
                }
                break;
        }
        setLoadingDrawable(drawable2 == null ? context.getResources().getDrawable(getDefaultDrawableResId()) : drawable2);
        i();
    }

    public final void setHeight(int i) {
        getLayoutParams().height = i;
        requestLayout();
    }

    public final void setWidth(int i) {
        getLayoutParams().width = i;
        requestLayout();
    }

    public final int getContentSize() {
        switch (this.e) {
            case HORIZONTAL:
                return this.f.getWidth();
            default:
                return this.f.getHeight();
        }
    }

    public final void e() {
        if (this.h.getVisibility() == 0) {
            this.h.setVisibility(4);
        }
        if (this.c.getVisibility() == 0) {
            this.c.setVisibility(4);
        }
        if (this.b.getVisibility() == 0) {
            this.b.setVisibility(4);
        }
        if (this.i.getVisibility() == 0) {
            this.i.setVisibility(4);
        }
    }

    public final void b(float f) {
        if (!this.g) {
            a(f);
        }
    }

    public final void f() {
        if (this.h != null) {
            this.h.setText(this.j);
        }
        a();
    }

    public final void g() {
        if (this.h != null) {
            this.h.setText(this.k);
        }
        if (this.g) {
            ((AnimationDrawable) this.b.getDrawable()).start();
        } else {
            b();
        }
        if (this.i != null) {
            this.i.setVisibility(8);
        }
    }

    public final void h() {
        if (this.h != null) {
            this.h.setText(this.l);
        }
        c();
    }

    public final void i() {
        if (this.h != null) {
            this.h.setText(this.j);
        }
        this.b.setVisibility(0);
        if (this.g) {
            ((AnimationDrawable) this.b.getDrawable()).stop();
        } else {
            d();
        }
        if (this.i != null) {
            if (TextUtils.isEmpty(this.i.getText())) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
            }
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a
    public void setLastUpdatedLabel(CharSequence charSequence) {
        setSubHeaderText(charSequence);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a
    public final void setLoadingDrawable(Drawable drawable) {
        this.b.setImageDrawable(drawable);
        this.g = drawable instanceof AnimationDrawable;
        a(drawable);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a
    public void setPullLabel(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a
    public void setRefreshingLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a
    public void setReleaseLabel(CharSequence charSequence) {
        this.l = charSequence;
    }

    public void setTextTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public final void j() {
        if (4 == this.h.getVisibility()) {
            this.h.setVisibility(0);
        }
        if (4 == this.c.getVisibility()) {
            this.c.setVisibility(0);
        }
        if (4 == this.b.getVisibility()) {
            this.b.setVisibility(0);
        }
        if (4 == this.i.getVisibility()) {
            this.i.setVisibility(0);
        }
    }

    private void setSubHeaderText(CharSequence charSequence) {
        if (this.i != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.i.setVisibility(8);
                return;
            }
            this.i.setText(charSequence);
            if (8 == this.i.getVisibility()) {
                this.i.setVisibility(0);
            }
        }
    }

    private void setSubTextAppearance(int i) {
        if (this.i != null) {
            this.i.setTextAppearance(getContext(), i);
        }
    }

    private void setSubTextColor(ColorStateList colorStateList) {
        if (this.i != null) {
            this.i.setTextColor(colorStateList);
        }
    }

    private void setTextAppearance(int i) {
        if (this.h != null) {
            this.h.setTextAppearance(getContext(), i);
        }
        if (this.i != null) {
            this.i.setTextAppearance(getContext(), i);
        }
    }

    private void setTextColor(ColorStateList colorStateList) {
        if (this.h != null) {
            this.h.setTextColor(colorStateList);
        }
        if (this.i != null) {
            this.i.setTextColor(colorStateList);
        }
    }
}
