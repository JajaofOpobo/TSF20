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
import com.tsf.extend.base.e.a;
import com.tsf.extend.base.j.p;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PagerIndicator extends LinearLayout implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, a.InterfaceC0049a {
    public static final int[] b = {f.e.tab_new_layout, f.e.tab_hot_layout, f.e.tab_category_layout, f.e.tab_pg_template_layout};
    public final int a;
    private int c;
    private int d;
    private a e;
    private int[] f;
    private int[] g;
    private int h;
    private int[] i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;

    public interface a {
        void c(int i);
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.c = Color.parseColor("#06c08f");
        this.d = Color.parseColor("#99333333");
        this.f = new int[]{f.e.tab_new, f.e.tab_hot, f.e.tab_category, f.e.tab_pg_template};
        this.g = new int[]{f.e.tab_new_layout, f.e.tab_hot_layout, f.e.tab_category_layout, f.e.tab_pg_template_layout};
        this.h = 3;
        this.i = new int[this.h];
        this.l = p.b() / this.h;
        this.n = 0;
        this.m = (int) getContext().getResources().getDimension(f.c.wallpaper_mark_padding_h);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private int a(int i, int i2) {
        return (this.l - i) / 2;
    }

    private void a(int i, float f) {
        int i2 = this.i[i];
        if (i < this.f.length - 1) {
            i2 = (int) (((this.i[i + 1] - i2) * f) + i2);
        }
        b(i2);
        this.k.scrollTo(-(a(i2, i) + ((int) ((i + f) * this.l))), 0);
        for (int i3 : this.g) {
            findViewById(i3).setSoundEffectsEnabled(true);
        }
    }

    public void a(int i, String[] strArr) {
        a(i);
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            ((TextView) findViewById(this.f[i2])).setText(strArr[i2]);
            iArr[i2] = this.f[i2];
        }
        if (strArr.length < this.g.length) {
            for (int i3 = 0; i3 < this.g.length - strArr.length; i3++) {
                findViewById(this.g[(this.g.length - 1) - i3]).setVisibility(8);
            }
        }
        this.f = iArr;
        this.h = strArr.length;
        this.i = new int[this.h];
        this.l = p.b() / this.h;
    }

    public void setTextData(String[] strArr) {
        a(0, strArr);
    }

    private void b(int i) {
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        layoutParams.width = i;
        this.j.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.k = findViewById(f.e.mark_layout);
        this.j = findViewById(f.e.mark);
        for (int i : this.g) {
            findViewById(i).setOnClickListener(this);
        }
        com.tsf.extend.base.e.a.a().a(this);
        a();
    }

    private void a() {
        Typeface typefaceB = com.tsf.extend.base.e.a.a().b();
        for (int i : this.f) {
            ((TextView) findViewById(i)).setTypeface(typefaceB);
        }
    }

    public void a(int i) {
        if (i >= 0 && i < this.f.length) {
            this.n = i;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.f.length) {
                    ((TextView) findViewById(this.f[i3])).setTextColor(i3 == i ? this.c : this.d);
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void a(int i, float f, int i2) {
        a(i, f);
    }

    public void setOnPageClickedListener(a aVar) {
        this.e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        for (int i = 0; i < this.g.length; i++) {
            if (id == this.g[i]) {
                if (this.e != null) {
                    this.e.c(i);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int width = findViewById(this.f[0]).getWidth() + this.m;
        if (width > this.m) {
            this.i[0] = width;
            for (int i = 1; i < this.f.length; i++) {
                this.i[i] = findViewById(this.f[i]).getWidth() + this.m;
            }
            a(this.n, 0.0f);
            com.tsf.extend.base.j.b.a(this, this);
        }
    }
}
