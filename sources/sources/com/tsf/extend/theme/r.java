package com.tsf.extend.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.f;
import com.tsf.extend.theme.t;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class r extends m {
    boolean l;
    protected List<t.b> m;

    public r(Context context, PageActivity pageActivity, String str, PersonalizationActivity.i iVar) {
        super(context, pageActivity, str, iVar);
        this.l = true;
        this.m = new ArrayList();
    }

    @Override // com.tsf.extend.theme.m
    protected boolean a(List<k> list, boolean z) {
        if (j[3].equals(getCurrentType())) {
            if (!z) {
                this.g.clear();
                if (list == null || list.size() == 0) {
                    this.h.notifyDataSetChanged();
                    this.c.setVisibility(0);
                    this.b.setEmptyView(this.c);
                    return false;
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).A() == 2) {
                    arrayList2.add(list.get(i));
                } else {
                    arrayList.add(list.get(i));
                }
            }
            a((List<k>) arrayList2);
            b(arrayList);
            this.h.notifyDataSetChanged();
            return false;
        }
        return super.a(list, z);
    }

    private void a(List<k> list) {
        this.g.add(new t.b(list));
    }

    private void b(List<k> list) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size() / 2) {
                break;
            }
            this.g.add(new t.b(list.get(i2 * 2), null, list.get((i2 * 2) + 1)));
            i = i2 + 1;
        }
        int size = list.size() % 2;
        if (size != 0) {
            this.g.add(size == 1 ? new t.b(list.get(list.size() - 1), null, null) : null);
        }
    }

    @Override // com.tsf.extend.theme.m, com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, List<k> list) {
        if (!j[3].equals(getCurrentType())) {
            super.a(jSONObject, list);
        }
    }

    @Override // com.tsf.extend.theme.m, android.view.View.OnClickListener
    public void onClick(View view) {
        if (j[3].equals(getCurrentType())) {
            if (this.l) {
                this.l = false;
                postDelayed(new Runnable() { // from class: com.tsf.extend.theme.r.1
                    @Override // java.lang.Runnable
                    public void run() {
                        r.this.l = true;
                    }
                }, 1000L);
                Object tag = view.getTag();
                if (tag != null && (tag instanceof k) && this.a != null) {
                    k kVar = (k) tag;
                    ThemeAlbumsPager themeAlbumsPager = (ThemeAlbumsPager) LayoutInflater.from(getContext()).inflate(f.C0052f.theme_albums_list, (ViewGroup) null);
                    themeAlbumsPager.a(String.valueOf(kVar.h()), kVar.i(), "110");
                    themeAlbumsPager.setShowShareTitle(false);
                    themeAlbumsPager.setOpenCategoryList(true);
                    this.a.a(themeAlbumsPager);
                }
                if (view.getId() != f.e.retry) {
                    return;
                }
            } else {
                return;
            }
        }
        super.onClick(view);
    }

    @Override // com.tsf.extend.theme.m
    protected t a(List<t.b> list, View.OnClickListener onClickListener) {
        return new q(getContext(), list, this);
    }
}
