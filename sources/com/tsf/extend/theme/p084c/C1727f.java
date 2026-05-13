package com.tsf.extend.theme.p084c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.extend.base.p080j.C1430i;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.theme.c.f */
/* loaded from: classes.dex */
public class C1727f extends ViewGroup {

    /* renamed from: a */
    boolean f5543a;

    /* renamed from: b */
    public final List<C1728a> f5544b;

    /* renamed from: c */
    public C1728a f5545c;

    /* renamed from: d */
    public boolean f5546d;

    /* renamed from: e */
    private final int f5547e;

    /* renamed from: f */
    private final int f5548f;

    /* renamed from: g */
    private final int f5549g;

    /* renamed from: h */
    private int f5550h;

    /* renamed from: i */
    private int f5551i;

    /* renamed from: j */
    private int f5552j;

    /* renamed from: k */
    private int f5553k;

    /* renamed from: l */
    private int f5554l;

    public C1727f(Context context) {
        super(context);
        this.f5547e = 12;
        this.f5548f = 16;
        this.f5549g = 16;
        this.f5550h = 0;
        this.f5551i = 0;
        this.f5552j = 0;
        this.f5543a = true;
        this.f5553k = 0;
        this.f5544b = new ArrayList();
        this.f5545c = null;
        this.f5554l = 5;
        this.f5546d = true;
        this.f5545c = new C1728a();
        this.f5550h = C1430i.m8659a(12.0f);
        this.f5551i = C1430i.m8659a(16.0f);
        this.f5552j = C1430i.m8659a(16.0f);
        setPadding(this.f5552j, 0, this.f5552j, 0);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        int size = (View.MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        m7655a();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, mode == 1073741824 ? Integer.MIN_VALUE : mode), View.MeasureSpec.makeMeasureSpec(size2, mode2 == 1073741824 ? Integer.MIN_VALUE : mode2));
                int measuredWidth = childAt.getMeasuredWidth();
                this.f5553k += measuredWidth;
                if (this.f5553k <= size) {
                    this.f5545c.m7650a(childAt);
                    this.f5553k += this.f5550h;
                    if (this.f5553k >= size && !m7653b()) {
                        break;
                    }
                } else if (this.f5545c.m7652a() == 0) {
                    this.f5545c.m7650a(childAt);
                    if (!m7653b()) {
                        break;
                    }
                } else if (!m7653b()) {
                    break;
                } else {
                    this.f5545c.m7650a(childAt);
                    this.f5553k = measuredWidth + this.f5550h + this.f5553k;
                }
            }
        }
        if (this.f5545c != null && this.f5545c.m7652a() > 0 && !this.f5544b.contains(this.f5545c)) {
            this.f5544b.add(this.f5545c);
        }
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = this.f5544b.size();
        for (int i5 = 0; i5 < size4; i5++) {
            i3 += this.f5544b.get(i5).f5556b;
        }
        setMeasuredDimension(size3, resolveSize((this.f5551i * (size4 - 1)) + i3 + getPaddingTop() + getPaddingBottom(), i2));
    }

    /* renamed from: a */
    private void m7655a() {
        this.f5544b.clear();
        this.f5545c = new C1728a();
        this.f5553k = 0;
    }

    /* renamed from: b */
    private boolean m7653b() {
        this.f5544b.add(this.f5545c);
        if (this.f5544b.size() < this.f5554l) {
            this.f5545c = new C1728a();
            this.f5553k = 0;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5546d) {
            this.f5546d = false;
        }
        if (!this.f5543a || z) {
            this.f5543a = false;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int size = this.f5544b.size();
            int i5 = paddingTop;
            for (int i6 = 0; i6 < size; i6++) {
                C1728a c1728a = this.f5544b.get(i6);
                c1728a.m7651a(paddingLeft, i5);
                i5 += c1728a.f5556b + this.f5551i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.c.f$a */
    /* loaded from: classes.dex */
    public class C1728a {

        /* renamed from: a */
        int f5555a = 0;

        /* renamed from: b */
        int f5556b = 0;

        /* renamed from: c */
        List<View> f5557c = new ArrayList();

        C1728a() {
        }

        /* renamed from: a */
        public void m7650a(View view) {
            this.f5557c.add(view);
            this.f5555a += view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (this.f5556b >= measuredHeight) {
                measuredHeight = this.f5556b;
            }
            this.f5556b = measuredHeight;
        }

        /* renamed from: a */
        public int m7652a() {
            return this.f5557c.size();
        }

        /* renamed from: a */
        public void m7651a(int i, int i2) {
            int m7652a = m7652a();
            if ((((C1727f.this.getMeasuredWidth() - C1727f.this.getPaddingLeft()) - C1727f.this.getPaddingRight()) - this.f5555a) - (C1727f.this.f5550h * (m7652a - 1)) >= 0) {
                for (int i3 = 0; i3 < m7652a; i3++) {
                    View view = this.f5557c.get(i3);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int i4 = (int) (((this.f5556b - measuredHeight) / 2.0d) + 0.5d);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    int i5 = measuredWidth + 0;
                    view.getLayoutParams().width = i5;
                    view.layout(i, i2 + i4, i + i5, i4 + i2 + measuredHeight);
                    i += C1727f.this.f5550h + i5;
                }
            } else if (m7652a == 1) {
                View view2 = this.f5557c.get(0);
                view2.layout(i, i2, view2.getMeasuredWidth() + i, view2.getMeasuredHeight() + i2);
            }
        }
    }
}
