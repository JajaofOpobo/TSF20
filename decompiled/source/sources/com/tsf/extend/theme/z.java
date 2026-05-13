package com.tsf.extend.theme;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.theme.c;
import com.tsf.extend.theme.t;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class z extends m {
    public z(Context context, PageActivity pageActivity, String str, PersonalizationActivity.i iVar) {
        super(context, pageActivity, str, iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.theme.m
    public boolean a(List<k> list, boolean z) {
        if (!z) {
            this.k = 0;
            this.g.clear();
            if (list == null || list.size() == 0) {
                this.h.notifyDataSetChanged();
                this.c.setVisibility(0);
                this.b.setEmptyView(this.c);
                return false;
            }
        }
        String f = ((PersonalizationActivity) this.a).f();
        if (f != null && f.startsWith("DIY://")) {
            for (k kVar : list) {
                if (kVar instanceof aq) {
                    if (!TextUtils.isEmpty(f) && f.contains(((aq) kVar).I())) {
                        kVar.b(true);
                    } else {
                        kVar.b(false);
                    }
                }
            }
        } else {
            for (k kVar2 : list) {
                if (!TextUtils.isEmpty(f) && f.equals(kVar2.g())) {
                    kVar2.b(true);
                } else {
                    kVar2.b(false);
                }
            }
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            k kVar3 = list.get(i);
            if (kVar3 instanceof n) {
                if (a((n) kVar3)) {
                    a((List<k>) arrayList);
                    arrayList.clear();
                    kVar3.f(((this.k + 1) * 10) + 1);
                    this.g.add(new t.b(kVar3));
                    this.k++;
                }
            } else {
                arrayList.add(kVar3);
            }
            if (i == size - 1 && !arrayList.isEmpty()) {
                a((List<k>) arrayList);
            }
        }
        this.h.notifyDataSetChanged();
        return true;
    }

    private boolean a(n nVar) {
        List<c.a> b = nVar.b();
        if (b == null || b.size() < 2) {
            return false;
        }
        Iterator<c.a> it = b.iterator();
        while (it.hasNext()) {
            c.a next = it.next();
            if (TextUtils.isEmpty(next.c)) {
                it.remove();
            } else if (TextUtils.isEmpty(next.a)) {
                it.remove();
            } else if (TextUtils.isEmpty(next.b)) {
                it.remove();
            }
        }
        return b.size() > 1;
    }

    private void a(List<k> list) {
        t.b bVar;
        t.b bVar2;
        int size = this.g.size() - 1;
        t.b bVar3 = null;
        while (true) {
            if (size < 0) {
                bVar = bVar3;
                break;
            }
            bVar3 = this.g.get(size);
            if (bVar3.e() == null && bVar3 != null) {
                bVar = bVar3;
                break;
            }
            size--;
        }
        if (bVar != null && bVar.b() == null && list.size() > 0) {
            k remove = list.remove(0);
            remove.f(bVar.a().z() + 1);
            bVar.a(remove);
        }
        if (bVar != null && bVar.c() == null && list.size() > 0) {
            k remove2 = list.remove(0);
            remove2.f(bVar.a().z() + 2);
            bVar.b(remove2);
        }
        int i = 0;
        while (i < list.size() / 3) {
            k kVar = list.get(i * 3);
            int i2 = (this.k + i + 1) * 10;
            kVar.f(i2 + 1);
            k kVar2 = list.get((i * 3) + 1);
            kVar2.f(i2 + 2);
            k kVar3 = list.get((i * 3) + 2);
            kVar3.f(i2 + 3);
            this.g.add(new t.b(kVar, kVar2, kVar3));
            i++;
        }
        int size2 = list.size() % 3;
        if (size2 != 0) {
            if (size2 == 1) {
                k kVar4 = list.get(list.size() - 1);
                kVar4.f(((this.k + ((list.size() + 1) / 3)) * 10) + 1);
                bVar2 = new t.b(kVar4, null, null);
            } else if (size2 == 2) {
                k kVar5 = list.get(list.size() - 2);
                int size3 = (this.k + ((list.size() + 1) / 3)) * 10;
                kVar5.f(size3 + 1);
                k kVar6 = list.get(list.size() - 1);
                kVar6.f(size3 + 2);
                bVar2 = new t.b(kVar5, kVar6, null);
            } else {
                bVar2 = null;
            }
            this.g.add(bVar2);
            this.k = this.k + i + 1;
            return;
        }
        this.k += i;
    }

    @Override // com.tsf.extend.theme.m
    protected t a(List<t.b> list, View.OnClickListener onClickListener) {
        return new y(this.a, list, this);
    }

    @Override // com.tsf.extend.theme.m, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }
}
