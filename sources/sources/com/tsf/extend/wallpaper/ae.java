package com.tsf.extend.wallpaper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ae extends ad {
    private static int[] o = {f.g.time_january, f.g.time_february, f.g.time_march, f.g.time_april, f.g.time_may, f.g.time_june, f.g.time_july, f.g.time_august, f.g.time_september, f.g.time_october, f.g.time_november, f.g.time_december};
    private View j;
    private TextView k;
    private int l;
    private Rect m;
    private int n;
    private int p;

    public ae(Context context, PageActivity pageActivity, boolean z, PersonalizationActivity.i iVar) {
        super(context, ai.NewType, pageActivity, iVar);
        this.m = new Rect();
        this.p = -1;
        this.n = (int) getContext().getResources().getDimension(f.c.personal_indicator_height);
        this.j = LayoutInflater.from(context).inflate(f.C0052f.wallpaper_new_list_hint, (ViewGroup) null);
        this.k = (TextView) this.j.findViewById(f.e.time);
        this.k.setMaxWidth(this.f - ((int) (10.0f * getContext().getResources().getDisplayMetrics().density)));
        addView(this.j);
        this.l = (int) context.getResources().getDimension(f.c.wallpaper_time_hint_height);
        d();
        if (z) {
            a();
        }
        this.j.setVisibility(8);
        this.j.setVisibility(8);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // com.tsf.extend.wallpaper.ad, com.tsf.extend.wallpaper.t.a
    public void a(t.c cVar, View view) {
        super.a(cVar, view);
        cVar.i = (TextView) view.findViewById(f.e.time);
        cVar.i.setMaxWidth(this.f - ((int) (10.0f * getContext().getResources().getDisplayMetrics().density)));
        cVar.i.setVisibility(8);
    }

    @Override // com.tsf.extend.wallpaper.ad, com.tsf.extend.wallpaper.t.a
    public void a(t.c cVar, t.d dVar, int i) {
        super.a(cVar, dVar, i);
        if (dVar.c == null || !dVar.d) {
            cVar.i.setVisibility(8);
        } else {
            cVar.i.setVisibility(0);
            cVar.i.setText(dVar.c);
        }
        cVar.i.setTag("time_" + i);
        cVar.i.setVisibility(8);
    }

    @Override // com.tsf.extend.wallpaper.ad
    @SuppressLint({"SimpleDateFormat"})
    protected void a(List<m> list, boolean z) {
        if (!z) {
            this.d.clear();
            if (list == null || list.size() == 0) {
                this.c.setVisibility(0);
                if (this.a != null) {
                    this.a.setEmptyView(this.c);
                    return;
                }
                return;
            }
        }
        this.d.addAll(list);
        this.e.clear();
        a(this.e, this.d, z);
        this.b.b(this.e);
        this.b.notifyDataSetChanged();
    }

    public void a(List<t.d> list, List<m> list2, boolean z) {
        List<t.d> listC = c(t.c(list2));
        if (!z) {
            list.addAll(listC);
            return;
        }
        CharSequence charSequenceA = a(list);
        CharSequence charSequenceB = b(listC);
        if (charSequenceA != null && charSequenceB != null && charSequenceA.equals(charSequenceB)) {
            listC.get(0).c = null;
        }
        list.addAll(listC);
    }

    private CharSequence a(List<t.d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).c != null) {
                return list.get(size).c;
            }
        }
        return null;
    }

    private CharSequence b(List<t.d> list) {
        return list.get(0).c;
    }

    private List<t.d> c(List<t.d> list) {
        ArrayList arrayList = new ArrayList();
        int[] iArrA = a(System.currentTimeMillis());
        CharSequence charSequence = null;
        for (t.d dVar : list) {
            long jA = dVar.a.a();
            CharSequence charSequenceA = jA == 0 ? null : a(a(jA), iArrA);
            if (charSequence == null || (charSequenceA != null && !charSequenceA.toString().equals(charSequence.toString()))) {
                dVar.d = true;
                charSequence = charSequenceA;
            }
            dVar.c = charSequence;
            arrayList.add(dVar);
        }
        return arrayList;
    }

    private CharSequence a(int[] iArr, int[] iArr2) {
        if (iArr2[0] == iArr[0] && iArr2[3] == iArr[3]) {
            return getContext().getString(f.g.time_today);
        }
        SpannableString spannableString = new SpannableString(iArr[0] + " · " + getContext().getString(o[iArr[1]]));
        spannableString.setSpan(new StyleSpan(1), 0, (iArr[0] + " · ").length(), 17);
        return spannableString;
    }

    private static int[] a(long j) {
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return new int[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(6)};
    }

    private void c() {
        this.j.setVisibility(0);
        c(0);
        this.j.setVisibility(8);
    }

    private void d() {
        this.j.setVisibility(8);
    }

    private void a(int i) {
        View viewFindViewWithTag;
        if (i != this.p) {
            if (this.p != -1) {
                b(this.p);
            }
            int i2 = i - 1;
            this.p = i2;
            if (this.a != null && (viewFindViewWithTag = this.a.findViewWithTag("time_" + i2)) != null) {
                viewFindViewWithTag.setVisibility(4);
            }
        }
    }

    private void b(int i) {
        View viewFindViewWithTag;
        if (i != -1) {
            this.p = -1;
            if (this.a != null && (viewFindViewWithTag = this.a.findViewWithTag("time_" + i)) != null) {
                viewFindViewWithTag.setVisibility(0);
                viewFindViewWithTag.setVisibility(8);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.ad, android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View viewFindViewWithTag;
        View view;
        View view2;
        super.onScroll(absListView, i, i2, i3);
        if (this.n > 0 && i <= 1) {
            if (this.b.getCount() > 1) {
                t.d dVarA = this.b.getItem(0);
                if ((dVarA instanceof t.d) && dVarA.d) {
                    a(dVarA.c);
                }
                if (i == 0 && absListView.getChildCount() > 1) {
                    View childAt = absListView.getChildAt(1);
                    if ((childAt != null ? childAt.getTop() : 0) > this.n) {
                        d();
                        b(0);
                        return;
                    }
                }
                c();
                a(1);
                return;
            }
            return;
        }
        if (i == 0) {
            d();
            t.d dVarA2 = this.b.getCount() > 0 ? this.b.getItem(0) : null;
            if ((dVarA2 instanceof t.d) && dVarA2.d) {
                b(0);
                return;
            }
            return;
        }
        if (i > 0 && this.a != null && (viewFindViewWithTag = this.a.findViewWithTag("time_" + (i - 1))) != null && (view = (View) viewFindViewWithTag.getParent()) != null) {
            view.getLocalVisibleRect(this.m);
            int iHeight = this.m.height() - this.n;
            View viewFindViewWithTag2 = this.a.findViewWithTag("time_" + i);
            if (viewFindViewWithTag2 != null && (view2 = (View) viewFindViewWithTag2.getParent()) != null) {
                view2.getLocalVisibleRect(this.m);
                int iHeight2 = this.m.height();
                if (iHeight < this.l) {
                    if (iHeight < 0) {
                        t.d dVarA3 = this.b.getItem(i);
                        if (dVarA3.d) {
                            a(dVarA3.c);
                            a(i + 1);
                        }
                        c();
                        return;
                    }
                    t.d dVarA4 = this.b.getItem(i - 1);
                    if (dVarA4 instanceof t.d) {
                        a(dVarA4.c);
                    }
                    t.d dVarA5 = this.b.getItem(i);
                    if ((dVarA5 instanceof t.d) && dVarA5.d) {
                        c(this.l - iHeight);
                        b(this.p);
                        return;
                    }
                    return;
                }
                if (iHeight > iHeight2 - this.l) {
                    t.d dVarA6 = this.b.getItem(i - 1);
                    if ((dVarA6 instanceof t.d) && dVarA6.d) {
                        a(dVarA6.c);
                        c();
                        a(i);
                        return;
                    }
                    return;
                }
                c();
                b(this.p);
            }
        }
    }

    private void c(int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.j.setTranslationY(-i);
        }
    }

    private void a(CharSequence charSequence) {
        if (charSequence != null && !charSequence.toString().equals(this.k.getText().toString())) {
            this.k.setText(charSequence);
        }
    }
}
