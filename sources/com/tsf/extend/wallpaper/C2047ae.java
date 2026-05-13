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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.View$OnClickListenerC2107t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/* renamed from: com.tsf.extend.wallpaper.ae */
/* loaded from: classes.dex */
public class C2047ae extends View$OnClickListenerC2040ad {

    /* renamed from: o */
    private static int[] f6658o = {C1536f.C1543g.time_january, C1536f.C1543g.time_february, C1536f.C1543g.time_march, C1536f.C1543g.time_april, C1536f.C1543g.time_may, C1536f.C1543g.time_june, C1536f.C1543g.time_july, C1536f.C1543g.time_august, C1536f.C1543g.time_september, C1536f.C1543g.time_october, C1536f.C1543g.time_november, C1536f.C1543g.time_december};

    /* renamed from: j */
    private View f6659j;

    /* renamed from: k */
    private TextView f6660k;

    /* renamed from: l */
    private int f6661l;

    /* renamed from: m */
    private Rect f6662m;

    /* renamed from: n */
    private int f6663n;

    /* renamed from: p */
    private int f6664p;

    public C2047ae(Context context, PageActivity pageActivity, boolean z, PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
        super(context, EnumC2057ai.NewType, pageActivity, interfaceC1949i);
        this.f6662m = new Rect();
        this.f6664p = -1;
        this.f6663n = (int) getContext().getResources().getDimension(C1536f.C1539c.personal_indicator_height);
        this.f6659j = LayoutInflater.from(context).inflate(C1536f.C1542f.wallpaper_new_list_hint, (ViewGroup) null);
        this.f6660k = (TextView) this.f6659j.findViewById(C1536f.C1541e.time);
        this.f6660k.setMaxWidth(this.f6629f - ((int) (10.0f * getContext().getResources().getDisplayMetrics().density)));
        addView(this.f6659j);
        this.f6661l = (int) context.getResources().getDimension(C1536f.C1539c.wallpaper_time_hint_height);
        m6601d();
        if (z) {
            m6641a();
        }
        this.f6659j.setVisibility(8);
        this.f6659j.setVisibility(8);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // com.tsf.extend.wallpaper.View$OnClickListenerC2040ad, com.tsf.extend.wallpaper.View$OnClickListenerC2107t.InterfaceC2109a
    /* renamed from: a */
    public void mo6388a(View$OnClickListenerC2107t.C2111c c2111c, View view) {
        super.mo6388a(c2111c, view);
        c2111c.f6908i = (TextView) view.findViewById(C1536f.C1541e.time);
        c2111c.f6908i.setMaxWidth(this.f6629f - ((int) (10.0f * getContext().getResources().getDisplayMetrics().density)));
        c2111c.f6908i.setVisibility(8);
    }

    @Override // com.tsf.extend.wallpaper.View$OnClickListenerC2040ad, com.tsf.extend.wallpaper.View$OnClickListenerC2107t.InterfaceC2109a
    /* renamed from: a */
    public void mo6387a(View$OnClickListenerC2107t.C2111c c2111c, View$OnClickListenerC2107t.C2112d c2112d, int i) {
        super.mo6387a(c2111c, c2112d, i);
        if (c2112d.f6913c != null) {
            if (!c2112d.f6914d) {
                c2111c.f6908i.setVisibility(8);
            } else {
                c2111c.f6908i.setVisibility(0);
                c2111c.f6908i.setText(c2112d.f6913c);
            }
        } else {
            c2111c.f6908i.setVisibility(8);
        }
        c2111c.f6908i.setTag("time_" + i);
        c2111c.f6908i.setVisibility(8);
    }

    @Override // com.tsf.extend.wallpaper.View$OnClickListenerC2040ad
    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: a */
    protected void mo6608a(List<C2094m> list, boolean z) {
        if (!z) {
            this.f6627d.clear();
            if (list == null || list.size() == 0) {
                this.f6626c.setVisibility(0);
                if (this.f6624a != null) {
                    this.f6624a.setEmptyView(this.f6626c);
                    return;
                }
                return;
            }
        }
        this.f6627d.addAll(list);
        this.f6628e.clear();
        m6609a(this.f6628e, this.f6627d, z);
        this.f6625b.m6392b(this.f6628e);
        this.f6625b.notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m6609a(List<View$OnClickListenerC2107t.C2112d> list, List<C2094m> list2, boolean z) {
        List<View$OnClickListenerC2107t.C2112d> m6602c = m6602c(View$OnClickListenerC2107t.m6390c(list2));
        if (!z) {
            list.addAll(m6602c);
            return;
        }
        CharSequence m6610a = m6610a(list);
        CharSequence m6605b = m6605b(m6602c);
        if (m6610a != null && m6605b != null && m6610a.equals(m6605b)) {
            m6602c.get(0).f6913c = null;
        }
        list.addAll(m6602c);
    }

    /* renamed from: a */
    private CharSequence m6610a(List<View$OnClickListenerC2107t.C2112d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f6913c != null) {
                return list.get(size).f6913c;
            }
        }
        return null;
    }

    /* renamed from: b */
    private CharSequence m6605b(List<View$OnClickListenerC2107t.C2112d> list) {
        return list.get(0).f6913c;
    }

    /* renamed from: c */
    private List<View$OnClickListenerC2107t.C2112d> m6602c(List<View$OnClickListenerC2107t.C2112d> list) {
        ArrayList arrayList = new ArrayList();
        int[] m6612a = m6612a(System.currentTimeMillis());
        CharSequence charSequence = null;
        for (View$OnClickListenerC2107t.C2112d c2112d : list) {
            long mo6451a = c2112d.f6911a.mo6451a();
            CharSequence m6607a = mo6451a == 0 ? null : m6607a(m6612a(mo6451a), m6612a);
            if (charSequence == null || (m6607a != null && !m6607a.toString().equals(charSequence.toString()))) {
                c2112d.f6914d = true;
                charSequence = m6607a;
            }
            c2112d.f6913c = charSequence;
            arrayList.add(c2112d);
        }
        return arrayList;
    }

    /* renamed from: a */
    private CharSequence m6607a(int[] iArr, int[] iArr2) {
        if (iArr2[0] == iArr[0] && iArr2[3] == iArr[3]) {
            return getContext().getString(C1536f.C1543g.time_today);
        }
        SpannableString spannableString = new SpannableString(iArr[0] + " · " + getContext().getString(f6658o[iArr[1]]));
        spannableString.setSpan(new StyleSpan(1), 0, (iArr[0] + " · ").length(), 17);
        return spannableString;
    }

    /* renamed from: a */
    private static int[] m6612a(long j) {
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return new int[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(6)};
    }

    /* renamed from: c */
    private void m6604c() {
        this.f6659j.setVisibility(0);
        m6603c(0);
        this.f6659j.setVisibility(8);
    }

    /* renamed from: d */
    private void m6601d() {
        this.f6659j.setVisibility(8);
    }

    /* renamed from: a */
    private void m6613a(int i) {
        View findViewWithTag;
        if (i != this.f6664p) {
            if (this.f6664p != -1) {
                m6606b(this.f6664p);
            }
            int i2 = i - 1;
            this.f6664p = i2;
            if (this.f6624a != null && (findViewWithTag = this.f6624a.findViewWithTag("time_" + i2)) != null) {
                findViewWithTag.setVisibility(4);
            }
        }
    }

    /* renamed from: b */
    private void m6606b(int i) {
        View findViewWithTag;
        if (i != -1) {
            this.f6664p = -1;
            if (this.f6624a != null && (findViewWithTag = this.f6624a.findViewWithTag("time_" + i)) != null) {
                findViewWithTag.setVisibility(0);
                findViewWithTag.setVisibility(8);
            }
        }
    }

    @Override // com.tsf.extend.wallpaper.View$OnClickListenerC2040ad, android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View findViewWithTag;
        View view;
        View view2;
        super.onScroll(absListView, i, i2, i3);
        if (this.f6663n > 0 && i <= 1) {
            if (this.f6625b.getCount() > 1) {
                View$OnClickListenerC2107t.C2112d item = this.f6625b.getItem(0);
                if ((item instanceof View$OnClickListenerC2107t.C2112d) && item.f6914d) {
                    m6611a(item.f6913c);
                }
                if (i == 0 && absListView.getChildCount() > 1) {
                    View childAt = absListView.getChildAt(1);
                    if ((childAt != null ? childAt.getTop() : 0) > this.f6663n) {
                        m6601d();
                        m6606b(0);
                        return;
                    }
                }
                m6604c();
                m6613a(1);
            }
        } else if (i == 0) {
            m6601d();
            View$OnClickListenerC2107t.C2112d item2 = this.f6625b.getCount() > 0 ? this.f6625b.getItem(0) : null;
            if ((item2 instanceof View$OnClickListenerC2107t.C2112d) && item2.f6914d) {
                m6606b(0);
            }
        } else if (i > 0 && this.f6624a != null && (findViewWithTag = this.f6624a.findViewWithTag("time_" + (i - 1))) != null && (view = (View) findViewWithTag.getParent()) != null) {
            view.getLocalVisibleRect(this.f6662m);
            int height = this.f6662m.height() - this.f6663n;
            View findViewWithTag2 = this.f6624a.findViewWithTag("time_" + i);
            if (findViewWithTag2 != null && (view2 = (View) findViewWithTag2.getParent()) != null) {
                view2.getLocalVisibleRect(this.f6662m);
                int height2 = this.f6662m.height();
                if (height < this.f6661l) {
                    if (height < 0) {
                        View$OnClickListenerC2107t.C2112d item3 = this.f6625b.getItem(i);
                        if (item3.f6914d) {
                            m6611a(item3.f6913c);
                            m6613a(i + 1);
                        }
                        m6604c();
                        return;
                    }
                    View$OnClickListenerC2107t.C2112d item4 = this.f6625b.getItem(i - 1);
                    if (item4 instanceof View$OnClickListenerC2107t.C2112d) {
                        m6611a(item4.f6913c);
                    }
                    View$OnClickListenerC2107t.C2112d item5 = this.f6625b.getItem(i);
                    if ((item5 instanceof View$OnClickListenerC2107t.C2112d) && item5.f6914d) {
                        m6603c(this.f6661l - height);
                        m6606b(this.f6664p);
                    }
                } else if (height > height2 - this.f6661l) {
                    View$OnClickListenerC2107t.C2112d item6 = this.f6625b.getItem(i - 1);
                    if ((item6 instanceof View$OnClickListenerC2107t.C2112d) && item6.f6914d) {
                        m6611a(item6.f6913c);
                        m6604c();
                        m6613a(i);
                    }
                } else {
                    m6604c();
                    m6606b(this.f6664p);
                }
            }
        }
    }

    /* renamed from: c */
    private void m6603c(int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.f6659j.setTranslationY(-i);
        }
    }

    /* renamed from: a */
    private void m6611a(CharSequence charSequence) {
        if (charSequence != null && !charSequence.toString().equals(this.f6660k.getText().toString())) {
            this.f6660k.setText(charSequence);
        }
    }
}
