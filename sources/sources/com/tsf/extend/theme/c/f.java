package com.tsf.extend.theme.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends ViewGroup {
    boolean a;
    public final List<a> b;
    public a c;
    public boolean d;
    private final int e;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public f(Context context) {
        super(context);
        this.e = 12;
        this.f = 16;
        this.g = 16;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.a = true;
        this.k = 0;
        this.b = new ArrayList();
        this.c = null;
        this.l = 5;
        this.d = true;
        this.c = new a();
        this.h = com.tsf.extend.base.j.i.a(12.0f);
        this.i = com.tsf.extend.base.j.i.a(16.0f);
        this.j = com.tsf.extend.base.j.i.a(16.0f);
        setPadding(this.j, 0, this.j, 0);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        int size = (View.MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        a();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, mode == 1073741824 ? Integer.MIN_VALUE : mode), View.MeasureSpec.makeMeasureSpec(size2, mode2 == 1073741824 ? Integer.MIN_VALUE : mode2));
                int measuredWidth = childAt.getMeasuredWidth();
                this.k += measuredWidth;
                if (this.k <= size) {
                    this.c.a(childAt);
                    this.k += this.h;
                    if (this.k >= size && !b()) {
                        break;
                    }
                } else if (this.c.a() == 0) {
                    this.c.a(childAt);
                    if (!b()) {
                        break;
                    }
                } else {
                    if (!b()) {
                        break;
                    }
                    this.c.a(childAt);
                    this.k = measuredWidth + this.h + this.k;
                }
            }
        }
        if (this.c != null && this.c.a() > 0 && !this.b.contains(this.c)) {
            this.b.add(this.c);
        }
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = this.b.size();
        for (int i5 = 0; i5 < size4; i5++) {
            i3 += this.b.get(i5).b;
        }
        setMeasuredDimension(size3, resolveSize((this.i * (size4 - 1)) + i3 + getPaddingTop() + getPaddingBottom(), i2));
    }

    private void a() {
        this.b.clear();
        this.c = new a();
        this.k = 0;
    }

    private boolean b() {
        this.b.add(this.c);
        if (this.b.size() >= this.l) {
            return false;
        }
        this.c = new a();
        this.k = 0;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d) {
            this.d = false;
        }
        if (!this.a || z) {
            this.a = false;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int size = this.b.size();
            int i5 = paddingTop;
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = this.b.get(i6);
                aVar.a(paddingLeft, i5);
                i5 += aVar.b + this.i;
            }
        }
    }

    class a {
        int a = 0;
        int b = 0;
        List<View> c = new ArrayList();

        a() {
        }

        public void a(View view) {
            this.c.add(view);
            this.a += view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (this.b >= measuredHeight) {
                measuredHeight = this.b;
            }
            this.b = measuredHeight;
        }

        public int a() {
            return this.c.size();
        }

        public void a(int i, int i2) {
            int iA = a();
            if ((((f.this.getMeasuredWidth() - f.this.getPaddingLeft()) - f.this.getPaddingRight()) - this.a) - (f.this.h * (iA - 1)) >= 0) {
                for (int i3 = 0; i3 < iA; i3++) {
                    View view = this.c.get(i3);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int i4 = (int) ((((double) (this.b - measuredHeight)) / 2.0d) + 0.5d);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    int i5 = measuredWidth + 0;
                    view.getLayoutParams().width = i5;
                    view.layout(i, i2 + i4, i + i5, i4 + i2 + measuredHeight);
                    i += f.this.h + i5;
                }
                return;
            }
            if (iA == 1) {
                View view2 = this.c.get(0);
                view2.layout(i, i2, view2.getMeasuredWidth() + i, view2.getMeasuredHeight() + i2);
            }
        }
    }
}
