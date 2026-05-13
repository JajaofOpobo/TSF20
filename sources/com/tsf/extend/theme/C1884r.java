package com.tsf.extend.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.theme.C1887t;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.r */
/* loaded from: classes.dex */
public class C1884r extends View$OnClickListenerC1850m {

    /* renamed from: l */
    boolean f6056l;

    /* renamed from: m */
    protected List<C1887t.C1890b> f6057m;

    public C1884r(Context context, PageActivity pageActivity, String str, PersonalizationActivity.InterfaceC1949i interfaceC1949i) {
        super(context, pageActivity, str, interfaceC1949i);
        this.f6056l = true;
        this.f6057m = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.theme.View$OnClickListenerC1850m
    /* renamed from: a */
    public boolean mo7026a(List<C1848k> list, boolean z) {
        if (f5946j[3].equals(getCurrentType())) {
            if (!z) {
                this.f5954g.clear();
                if (list == null || list.size() == 0) {
                    this.f5955h.notifyDataSetChanged();
                    this.f5950c.setVisibility(0);
                    this.f5949b.setEmptyView(this.f5950c);
                    return false;
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).m7331A() == 2) {
                    arrayList2.add(list.get(i));
                } else {
                    arrayList.add(list.get(i));
                }
            }
            m7146a((List<C1848k>) arrayList2);
            m7144b(arrayList);
            this.f5955h.notifyDataSetChanged();
            return false;
        }
        return super.mo7026a(list, z);
    }

    /* renamed from: a */
    private void m7146a(List<C1848k> list) {
        this.f5954g.add(new C1887t.C1890b(list));
    }

    /* renamed from: b */
    private void m7144b(List<C1848k> list) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size() / 2) {
                break;
            }
            this.f5954g.add(new C1887t.C1890b(list.get(i2 * 2), null, list.get((i2 * 2) + 1)));
            i = i2 + 1;
        }
        int size = list.size() % 2;
        if (size != 0) {
            this.f5954g.add(size == 1 ? new C1887t.C1890b(list.get(list.size() - 1), null, null) : null);
        }
    }

    @Override // com.tsf.extend.theme.View$OnClickListenerC1850m, com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6245a(JSONObject jSONObject, List<C1848k> list) {
        if (!f5946j[3].equals(getCurrentType())) {
            super.mo6245a(jSONObject, list);
        }
    }

    @Override // com.tsf.extend.theme.View$OnClickListenerC1850m, android.view.View.OnClickListener
    public void onClick(View view) {
        if (f5946j[3].equals(getCurrentType())) {
            if (this.f6056l) {
                this.f6056l = false;
                postDelayed(new Runnable() { // from class: com.tsf.extend.theme.r.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C1884r.this.f6056l = true;
                    }
                }, 1000L);
                Object tag = view.getTag();
                if (tag != null && (tag instanceof C1848k) && this.f5948a != null) {
                    C1848k c1848k = (C1848k) tag;
                    ThemeAlbumsPager themeAlbumsPager = (ThemeAlbumsPager) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_albums_list, (ViewGroup) null);
                    themeAlbumsPager.m8164a(String.valueOf(c1848k.m7297h()), c1848k.m7294i(), "110");
                    themeAlbumsPager.setShowShareTitle(false);
                    themeAlbumsPager.setOpenCategoryList(true);
                    this.f5948a.m8922a(themeAlbumsPager);
                }
                if (view.getId() != C1536f.C1541e.retry) {
                    return;
                }
            } else {
                return;
            }
        }
        super.onClick(view);
    }

    @Override // com.tsf.extend.theme.View$OnClickListenerC1850m
    /* renamed from: a */
    protected C1887t mo7027a(List<C1887t.C1890b> list, View.OnClickListener onClickListener) {
        return new C1881q(getContext(), list, this);
    }
}
