package com.tsf.extend.theme;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.theme.C1705c;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.extend.theme.z */
/* loaded from: classes.dex */
public class C1928z extends View$OnClickListenerC1850m {
    public C1928z(Context context, PageActivity pageActivity, String str, PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
        super(context, pageActivity, str, interfaceC1949i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.theme.View$OnClickListenerC1850m
    /* renamed from: a */
    public boolean mo7026a(List<C1848k> list, boolean z) {
        if (!z) {
            this.f5957k = 0;
            this.f5954g.clear();
            if (list == null || list.size() == 0) {
                this.f5955h.notifyDataSetChanged();
                this.f5950c.setVisibility(0);
                this.f5949b.setEmptyView(this.f5950c);
                return false;
            }
        }
        String m6976f = ((PersonalizationActivity) this.f5948a).m6976f();
        if (m6976f != null && m6976f.startsWith("DIY://")) {
            for (C1848k c1848k : list) {
                if (c1848k instanceof AbstractC1700aq) {
                    if (!TextUtils.isEmpty(m6976f) && m6976f.contains(((AbstractC1700aq) c1848k).m7764I())) {
                        c1848k.m7314b(true);
                    } else {
                        c1848k.m7314b(false);
                    }
                }
            }
        } else {
            for (C1848k c1848k2 : list) {
                if (!TextUtils.isEmpty(m6976f) && m6976f.equals(c1848k2.m7300g())) {
                    c1848k2.m7314b(true);
                } else {
                    c1848k2.m7314b(false);
                }
            }
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            C1848k c1848k3 = list.get(i);
            if (c1848k3 instanceof C1858n) {
                if (m7029a((C1858n) c1848k3)) {
                    m7028a((List<C1848k>) arrayList);
                    arrayList.clear();
                    c1848k3.m7302f(((this.f5957k + 1) * 10) + 1);
                    this.f5954g.add(new C1887t.C1890b(c1848k3));
                    this.f5957k++;
                }
            } else {
                arrayList.add(c1848k3);
            }
            if (i == size - 1 && !arrayList.isEmpty()) {
                m7028a((List<C1848k>) arrayList);
            }
        }
        this.f5955h.notifyDataSetChanged();
        return true;
    }

    /* renamed from: a */
    private boolean m7029a(C1858n c1858n) {
        List<C1705c.C1706a> m7235b = c1858n.m7235b();
        if (m7235b == null || m7235b.size() < 2) {
            return false;
        }
        Iterator<C1705c.C1706a> it = m7235b.iterator();
        while (it.hasNext()) {
            C1705c.C1706a next = it.next();
            if (TextUtils.isEmpty(next.f5480c)) {
                it.remove();
            } else if (TextUtils.isEmpty(next.f5478a)) {
                it.remove();
            } else if (TextUtils.isEmpty(next.f5479b)) {
                it.remove();
            }
        }
        return m7235b.size() > 1;
    }

    /* renamed from: a */
    private void m7028a(List<C1848k> list) {
        C1887t.C1890b c1890b;
        C1887t.C1890b c1890b2;
        int size = this.f5954g.size() - 1;
        C1887t.C1890b c1890b3 = null;
        while (true) {
            if (size < 0) {
                c1890b = c1890b3;
                break;
            }
            c1890b3 = this.f5954g.get(size);
            if (c1890b3.m7118e() == null && c1890b3 != null) {
                c1890b = c1890b3;
                break;
            }
            size--;
        }
        if (c1890b != null && c1890b.m7122b() == null && list.size() > 0) {
            C1848k remove = list.remove(0);
            remove.m7302f(c1890b.m7124a().m7268z() + 1);
            c1890b.m7123a(remove);
        }
        if (c1890b != null && c1890b.m7120c() == null && list.size() > 0) {
            C1848k remove2 = list.remove(0);
            remove2.m7302f(c1890b.m7124a().m7268z() + 2);
            c1890b.m7121b(remove2);
        }
        int i = 0;
        while (i < list.size() / 3) {
            C1848k c1848k = list.get(i * 3);
            int i2 = (this.f5957k + i + 1) * 10;
            c1848k.m7302f(i2 + 1);
            C1848k c1848k2 = list.get((i * 3) + 1);
            c1848k2.m7302f(i2 + 2);
            C1848k c1848k3 = list.get((i * 3) + 2);
            c1848k3.m7302f(i2 + 3);
            this.f5954g.add(new C1887t.C1890b(c1848k, c1848k2, c1848k3));
            i++;
        }
        int size2 = list.size() % 3;
        if (size2 != 0) {
            if (size2 == 1) {
                C1848k c1848k4 = list.get(list.size() - 1);
                c1848k4.m7302f(((this.f5957k + ((list.size() + 1) / 3)) * 10) + 1);
                c1890b2 = new C1887t.C1890b(c1848k4, null, null);
            } else if (size2 == 2) {
                C1848k c1848k5 = list.get(list.size() - 2);
                int size3 = (this.f5957k + ((list.size() + 1) / 3)) * 10;
                c1848k5.m7302f(size3 + 1);
                C1848k c1848k6 = list.get(list.size() - 1);
                c1848k6.m7302f(size3 + 2);
                c1890b2 = new C1887t.C1890b(c1848k5, c1848k6, null);
            } else {
                c1890b2 = null;
            }
            this.f5954g.add(c1890b2);
            this.f5957k = this.f5957k + i + 1;
            return;
        }
        this.f5957k += i;
    }

    @Override // com.tsf.extend.theme.View$OnClickListenerC1850m
    /* renamed from: a */
    protected C1887t mo7027a(List<C1887t.C1890b> list, View.OnClickListener onClickListener) {
        return new C1921y(this.f5948a, list, this);
    }

    @Override // com.tsf.extend.theme.View$OnClickListenerC1850m, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }
}
