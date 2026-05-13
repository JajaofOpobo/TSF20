package com.tsf.extend.base.widget.pulltorefresh.p081a;

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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.a.d */
/* loaded from: classes.dex */
public abstract class AbstractC1511d extends FrameLayout implements InterfaceC1505a {

    /* renamed from: a */
    static final Interpolator f4752a = new LinearInterpolator();

    /* renamed from: b */
    protected final ImageView f4753b;

    /* renamed from: c */
    protected final ProgressBar f4754c;

    /* renamed from: d */
    protected final PullToRefreshBase.EnumC1491b f4755d;

    /* renamed from: e */
    protected final PullToRefreshBase.EnumC1497h f4756e;

    /* renamed from: f */
    private ViewGroup f4757f;

    /* renamed from: g */
    private boolean f4758g;

    /* renamed from: h */
    private final TextView f4759h;

    /* renamed from: i */
    private final TextView f4760i;

    /* renamed from: j */
    private CharSequence f4761j;

    /* renamed from: k */
    private CharSequence f4762k;

    /* renamed from: l */
    private CharSequence f4763l;

    /* renamed from: a */
    protected abstract void mo8354a();

    /* renamed from: a */
    protected abstract void mo8353a(float f);

    /* renamed from: a */
    protected abstract void mo8352a(Drawable drawable);

    /* renamed from: b */
    protected abstract void mo8351b();

    /* renamed from: c */
    protected abstract void mo8350c();

    /* renamed from: d */
    protected abstract void mo8349d();

    protected abstract int getDefaultDrawableResId();

    public AbstractC1511d(Context context, PullToRefreshBase.EnumC1491b enumC1491b, PullToRefreshBase.EnumC1497h enumC1497h, TypedArray typedArray) {
        super(context);
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable;
        this.f4755d = enumC1491b;
        this.f4756e = enumC1497h;
        switch (enumC1497h) {
            case HORIZONTAL:
                LayoutInflater.from(context).inflate(C1536f.C1542f.kui_ptr_header_horizontal, this);
                break;
            default:
                LayoutInflater.from(context).inflate(C1536f.C1542f.kui_ptr_header_vertical, this);
                break;
        }
        this.f4757f = (ViewGroup) findViewById(C1536f.C1541e.fl_inner);
        this.f4759h = (TextView) this.f4757f.findViewById(C1536f.C1541e.pull_to_refresh_text);
        this.f4754c = (ProgressBar) this.f4757f.findViewById(C1536f.C1541e.pull_to_refresh_progress);
        this.f4754c.setIndeterminateDrawable(new C1518d(getContext(), 2, 1));
        this.f4760i = (TextView) this.f4757f.findViewById(C1536f.C1541e.pull_to_refresh_sub_text);
        this.f4753b = (ImageView) this.f4757f.findViewById(C1536f.C1541e.pull_to_refresh_image);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4757f.getLayoutParams();
        switch (enumC1491b) {
            case PULL_FROM_END:
                layoutParams.gravity = enumC1497h == PullToRefreshBase.EnumC1497h.VERTICAL ? 48 : 3;
                this.f4761j = context.getString(C1536f.C1543g.ptr_from_bottom_pull_label);
                this.f4762k = context.getString(C1536f.C1543g.ptr_from_bottom_refreshing_label);
                this.f4763l = context.getString(C1536f.C1543g.ptr_from_bottom_release_label);
                break;
            default:
                layoutParams.gravity = enumC1497h == PullToRefreshBase.EnumC1497h.VERTICAL ? 80 : 5;
                this.f4761j = context.getString(C1536f.C1543g.ptr_pull_label);
                this.f4762k = context.getString(C1536f.C1543g.ptr_refreshing_label);
                this.f4763l = context.getString(C1536f.C1543g.ptr_release_label);
                break;
        }
        if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrHeaderBackground) && (drawable = typedArray.getDrawable(C1536f.C1545i.PullToRefresh_ptrHeaderBackground)) != null) {
            setBackgroundDrawable(drawable);
        }
        if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrHeaderTextAppearance)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(C1536f.C1545i.PullToRefresh_ptrHeaderTextAppearance, typedValue);
            setTextAppearance(typedValue.data);
        }
        if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrSubHeaderTextAppearance)) {
            TypedValue typedValue2 = new TypedValue();
            typedArray.getValue(C1536f.C1545i.PullToRefresh_ptrSubHeaderTextAppearance, typedValue2);
            setSubTextAppearance(typedValue2.data);
        }
        if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrHeaderTextColor) && (colorStateList2 = typedArray.getColorStateList(C1536f.C1545i.PullToRefresh_ptrHeaderTextColor)) != null) {
            setTextColor(colorStateList2);
        }
        if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrHeaderSubTextColor) && (colorStateList = typedArray.getColorStateList(C1536f.C1545i.PullToRefresh_ptrHeaderSubTextColor)) != null) {
            setSubTextColor(colorStateList);
        }
        Drawable drawable2 = typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrDrawable) ? typedArray.getDrawable(C1536f.C1545i.PullToRefresh_ptrDrawable) : null;
        switch (enumC1491b) {
            case PULL_FROM_END:
                if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrDrawableEnd)) {
                    drawable2 = typedArray.getDrawable(C1536f.C1545i.PullToRefresh_ptrDrawableEnd);
                    break;
                } else if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrDrawableBottom)) {
                    C1514f.m8347a("ptrDrawableBottom", "ptrDrawableEnd");
                    drawable2 = typedArray.getDrawable(C1536f.C1545i.PullToRefresh_ptrDrawableBottom);
                    break;
                }
                break;
            default:
                if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrDrawableStart)) {
                    drawable2 = typedArray.getDrawable(C1536f.C1545i.PullToRefresh_ptrDrawableStart);
                    break;
                } else if (typedArray.hasValue(C1536f.C1545i.PullToRefresh_ptrDrawableTop)) {
                    C1514f.m8347a("ptrDrawableTop", "ptrDrawableStart");
                    drawable2 = typedArray.getDrawable(C1536f.C1545i.PullToRefresh_ptrDrawableTop);
                    break;
                }
                break;
        }
        setLoadingDrawable(drawable2 == null ? context.getResources().getDrawable(getDefaultDrawableResId()) : drawable2);
        m8356i();
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
        switch (this.f4756e) {
            case HORIZONTAL:
                return this.f4757f.getWidth();
            default:
                return this.f4757f.getHeight();
        }
    }

    /* renamed from: e */
    public final void m8360e() {
        if (this.f4759h.getVisibility() == 0) {
            this.f4759h.setVisibility(4);
        }
        if (this.f4754c.getVisibility() == 0) {
            this.f4754c.setVisibility(4);
        }
        if (this.f4753b.getVisibility() == 0) {
            this.f4753b.setVisibility(4);
        }
        if (this.f4760i.getVisibility() == 0) {
            this.f4760i.setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void m8361b(float f) {
        if (!this.f4758g) {
            mo8353a(f);
        }
    }

    /* renamed from: f */
    public final void m8359f() {
        if (this.f4759h != null) {
            this.f4759h.setText(this.f4761j);
        }
        mo8354a();
    }

    /* renamed from: g */
    public final void m8358g() {
        if (this.f4759h != null) {
            this.f4759h.setText(this.f4762k);
        }
        if (this.f4758g) {
            ((AnimationDrawable) this.f4753b.getDrawable()).start();
        } else {
            mo8351b();
        }
        if (this.f4760i != null) {
            this.f4760i.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final void m8357h() {
        if (this.f4759h != null) {
            this.f4759h.setText(this.f4763l);
        }
        mo8350c();
    }

    /* renamed from: i */
    public final void m8356i() {
        if (this.f4759h != null) {
            this.f4759h.setText(this.f4761j);
        }
        this.f4753b.setVisibility(0);
        if (this.f4758g) {
            ((AnimationDrawable) this.f4753b.getDrawable()).stop();
        } else {
            mo8349d();
        }
        if (this.f4760i != null) {
            if (TextUtils.isEmpty(this.f4760i.getText())) {
                this.f4760i.setVisibility(8);
            } else {
                this.f4760i.setVisibility(0);
            }
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setLastUpdatedLabel(CharSequence charSequence) {
        setSubHeaderText(charSequence);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public final void setLoadingDrawable(Drawable drawable) {
        this.f4753b.setImageDrawable(drawable);
        this.f4758g = drawable instanceof AnimationDrawable;
        mo8352a(drawable);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setPullLabel(CharSequence charSequence) {
        this.f4761j = charSequence;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setRefreshingLabel(CharSequence charSequence) {
        this.f4762k = charSequence;
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setReleaseLabel(CharSequence charSequence) {
        this.f4763l = charSequence;
    }

    public void setTextTypeface(Typeface typeface) {
        this.f4759h.setTypeface(typeface);
    }

    /* renamed from: j */
    public final void m8355j() {
        if (4 == this.f4759h.getVisibility()) {
            this.f4759h.setVisibility(0);
        }
        if (4 == this.f4754c.getVisibility()) {
            this.f4754c.setVisibility(0);
        }
        if (4 == this.f4753b.getVisibility()) {
            this.f4753b.setVisibility(0);
        }
        if (4 == this.f4760i.getVisibility()) {
            this.f4760i.setVisibility(0);
        }
    }

    private void setSubHeaderText(CharSequence charSequence) {
        if (this.f4760i != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f4760i.setVisibility(8);
                return;
            }
            this.f4760i.setText(charSequence);
            if (8 == this.f4760i.getVisibility()) {
                this.f4760i.setVisibility(0);
            }
        }
    }

    private void setSubTextAppearance(int i) {
        if (this.f4760i != null) {
            this.f4760i.setTextAppearance(getContext(), i);
        }
    }

    private void setSubTextColor(ColorStateList colorStateList) {
        if (this.f4760i != null) {
            this.f4760i.setTextColor(colorStateList);
        }
    }

    private void setTextAppearance(int i) {
        if (this.f4759h != null) {
            this.f4759h.setTextAppearance(getContext(), i);
        }
        if (this.f4760i != null) {
            this.f4760i.setTextAppearance(getContext(), i);
        }
    }

    private void setTextColor(ColorStateList colorStateList) {
        if (this.f4759h != null) {
            this.f4759h.setTextColor(colorStateList);
        }
        if (this.f4760i != null) {
            this.f4760i.setTextColor(colorStateList);
        }
    }
}
