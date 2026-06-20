package com.tsf.extend.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.ResourceIds;
import com.tsf.extend.theme.ThemeBaseAdapter;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeSearchPage extends ThemeListView {
    boolean l;
    protected List<t.b> m;

    public r(Context context, PageActivity pageActivity, String str, PersonalizationActivity.i iVar) {
        super(context, pageActivity, str, iVar);
        this.l = true;
        this.m = new ArrayList();
    }

    @Override // com.tsf.extend.theme.ThemeListView
    protected boolean a(List<ThemeModel> list, boolean z) {
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
            a((List<ThemeModel>) arrayList2);
            b(arrayList);
            this.h.notifyDataSetChanged();
            return false;
        }
        return super.a(list, z);
    }

    private void a(List<ThemeModel> list) {
        this.g.add(new t.b(list));
    }

    private void b(List<ThemeModel> list) {
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

    @Override // com.tsf.extend.theme.ThemeListView, com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
    public void a(JSONObject jSONObject, List<ThemeModel> list) {
        if (!j[3].equals(getCurrentType())) {
            super.a(jSONObject, list);
        }
    }

    @Override // com.tsf.extend.theme.ThemeListView, android.view.View.OnClickListener
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
                if (tag != null && (tag instanceof ThemeModel) && this.a != null) {
                    ThemeModel kVar = (ThemeModel) tag;
                    ThemeAlbumsPager themeAlbumsPager = (ThemeAlbumsPager) LayoutInflater.from(getContext()).inflate(ResourceIds.C0052f.theme_albums_list, (ViewGroup) null);
                    themeAlbumsPager.a(String.valueOf(kVar.h()), kVar.i(), "110");
                    themeAlbumsPager.setShowShareTitle(false);
                    themeAlbumsPager.setOpenCategoryList(true);
                    this.a.a(themeAlbumsPager);
                }
                if (view.getId() != ResourceIds.e.retry) {
                    return;
                }
            } else {
                return;
            }
        }
        super.onClick(view);
    }

    @Override // com.tsf.extend.theme.ThemeListView
    protected t a(List<t.b> list, View.OnClickListener onClickListener) {
        return new q(getContext(), list, this);
    }
}
