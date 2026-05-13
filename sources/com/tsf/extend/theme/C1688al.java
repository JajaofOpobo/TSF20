package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1420ab;
import java.util.List;
/* renamed from: com.tsf.extend.theme.al */
/* loaded from: classes.dex */
public class C1688al extends BaseAdapter {

    /* renamed from: a */
    public static int[] f5441a = {C1536f.C1543g.setting_facebook, C1536f.C1543g.cm_club_google_plus};

    /* renamed from: d */
    private static Typeface f5442d;

    /* renamed from: b */
    Context f5443b;

    /* renamed from: c */
    List<C1695an> f5444c;

    public C1688al(Context context, List<C1695an> list, boolean z) {
        this.f5443b = context;
        this.f5444c = list;
        if (z) {
            C1695an c1695an = new C1695an(context, context.getResources().getDrawable(C1536f.C1540d.share_facebook), f5441a[0]);
            this.f5444c.add(0, new C1695an(context, context.getResources().getDrawable(C1536f.C1540d.shere_googleplus), f5441a[1]));
            this.f5444c.add(0, c1695an);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5444c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f5444c.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return this.f5444c.indexOf(getItem(i));
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1690a c1690a;
        LayoutInflater layoutInflater = (LayoutInflater) this.f5443b.getSystemService("layout_inflater");
        if (view == null) {
            view = layoutInflater.inflate(C1536f.C1542f.theme_diy_share_item, (ViewGroup) null);
            c1690a = new C1690a();
            c1690a.f5445a = (ImageView) view.findViewById(C1536f.C1541e.icon);
            c1690a.f5446b = (TextView) view.findViewById(C1536f.C1541e.app_name);
            if (f5442d == null) {
                f5442d = C1420ab.m8700a(this.f5443b.getAssets(), "fonts/OpenSans-Light-bold.ttf");
            }
            c1690a.f5446b.setTypeface(f5442d);
            view.setTag(c1690a);
        } else {
            c1690a = (C1690a) view.getTag();
        }
        C1695an c1695an = (C1695an) getItem(i);
        c1690a.f5445a.setImageDrawable(c1695an.m7785b());
        c1690a.f5446b.setText(c1695an.m7783c());
        return view;
    }

    /* renamed from: com.tsf.extend.theme.al$a */
    /* loaded from: classes.dex */
    private class C1690a {

        /* renamed from: a */
        ImageView f5445a;

        /* renamed from: b */
        TextView f5446b;

        private C1690a() {
        }
    }
}
