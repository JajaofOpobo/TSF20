package com.tsf.extend.base.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p075e.C1399a;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1437p;
/* loaded from: classes.dex */
public class PagerIndicator extends LinearLayout implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, C1399a.InterfaceC1400a {

    /* renamed from: b */
    public static final int[] f4556b = {C1536f.C1541e.tab_new_layout, C1536f.C1541e.tab_hot_layout, C1536f.C1541e.tab_category_layout, C1536f.C1541e.tab_pg_template_layout};

    /* renamed from: a */
    public final int f4557a;

    /* renamed from: c */
    private int f4558c;

    /* renamed from: d */
    private int f4559d;

    /* renamed from: e */
    private InterfaceC1473a f4560e;

    /* renamed from: f */
    private int[] f4561f;

    /* renamed from: g */
    private int[] f4562g;

    /* renamed from: h */
    private int f4563h;

    /* renamed from: i */
    private int[] f4564i;

    /* renamed from: j */
    private View f4565j;

    /* renamed from: k */
    private View f4566k;

    /* renamed from: l */
    private int f4567l;

    /* renamed from: m */
    private int f4568m;

    /* renamed from: n */
    private int f4569n;

    /* renamed from: com.tsf.extend.base.view.PagerIndicator$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1473a {
        /* renamed from: c */
        void mo6720c(int i);
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4557a = 0;
        this.f4558c = Color.parseColor("#06c08f");
        this.f4559d = Color.parseColor("#99333333");
        this.f4561f = new int[]{C1536f.C1541e.tab_new, C1536f.C1541e.tab_hot, C1536f.C1541e.tab_category, C1536f.C1541e.tab_pg_template};
        this.f4562g = new int[]{C1536f.C1541e.tab_new_layout, C1536f.C1541e.tab_hot_layout, C1536f.C1541e.tab_category_layout, C1536f.C1541e.tab_pg_template_layout};
        this.f4563h = 3;
        this.f4564i = new int[this.f4563h];
        this.f4567l = C1437p.m8619b() / this.f4563h;
        this.f4569n = 0;
        this.f4568m = (int) getContext().getResources().getDimension(C1536f.C1539c.wallpaper_mark_padding_h);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: a */
    private int m8481a(int i, int i2) {
        return (this.f4567l - i) / 2;
    }

    /* renamed from: a */
    private void m8483a(int i, float f) {
        int i2 = this.f4564i[i];
        if (i < this.f4561f.length - 1) {
            i2 = (int) (((this.f4564i[i + 1] - i2) * f) + i2);
        }
        m8479b(i2);
        this.f4566k.scrollTo(-(m8481a(i2, i) + ((int) ((i + f) * this.f4567l))), 0);
        PageActivity pageActivity = (PageActivity) getContext();
        for (int i3 : this.f4562g) {
            findViewById(i3).setSoundEffectsEnabled(true);
        }
    }

    /* renamed from: a */
    public void m8480a(int i, String[] strArr) {
        m8484a(i);
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            ((TextView) findViewById(this.f4561f[i2])).setText(strArr[i2]);
            iArr[i2] = this.f4561f[i2];
        }
        if (strArr.length < this.f4562g.length) {
            for (int i3 = 0; i3 < this.f4562g.length - strArr.length; i3++) {
                findViewById(this.f4562g[(this.f4562g.length - 1) - i3]).setVisibility(8);
            }
        }
        this.f4561f = iArr;
        this.f4563h = strArr.length;
        this.f4564i = new int[this.f4563h];
        this.f4567l = C1437p.m8619b() / this.f4563h;
    }

    public void setTextData(String[] strArr) {
        m8480a(0, strArr);
    }

    /* renamed from: b */
    private void m8479b(int i) {
        ViewGroup.LayoutParams layoutParams = this.f4565j.getLayoutParams();
        layoutParams.width = i;
        this.f4565j.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f4566k = findViewById(C1536f.C1541e.mark_layout);
        this.f4565j = findViewById(C1536f.C1541e.mark);
        for (int i : this.f4562g) {
            findViewById(i).setOnClickListener(this);
        }
        C1399a.m8772a().m8771a(this);
        m8485a();
    }

    /* renamed from: a */
    private void m8485a() {
        Typeface m8770b = C1399a.m8772a().m8770b();
        for (int i : this.f4561f) {
            ((TextView) findViewById(i)).setTypeface(m8770b);
        }
    }

    /* renamed from: a */
    public void m8484a(int i) {
        if (i >= 0 && i < this.f4561f.length) {
            this.f4569n = i;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.f4561f.length) {
                    ((TextView) findViewById(this.f4561f[i3])).setTextColor(i3 == i ? this.f4558c : this.f4559d);
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void m8482a(int i, float f, int i2) {
        m8483a(i, f);
    }

    public void setOnPageClickedListener(InterfaceC1473a interfaceC1473a) {
        this.f4560e = interfaceC1473a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        for (int i = 0; i < this.f4562g.length; i++) {
            if (id == this.f4562g[i]) {
                if (this.f4560e != null) {
                    this.f4560e.mo6720c(i);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int width = findViewById(this.f4561f[0]).getWidth() + this.f4568m;
        if (width > this.f4568m) {
            this.f4564i[0] = width;
            for (int i = 1; i < this.f4561f.length; i++) {
                this.f4564i[i] = findViewById(this.f4561f[i]).getWidth() + this.f4568m;
            }
            m8483a(this.f4569n, 0.0f);
            C1421b.m8698a(this, this);
        }
    }
}
