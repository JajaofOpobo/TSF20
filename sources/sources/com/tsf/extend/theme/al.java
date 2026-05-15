package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.extend.f;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class al extends BaseAdapter {
    public static int[] a = {f.g.setting_facebook, f.g.cm_club_google_plus};
    private static Typeface d;
    Context b;
    List<an> c;

    public al(Context context, List<an> list, boolean z) {
        this.b = context;
        this.c = list;
        if (z) {
            an anVar = new an(context, context.getResources().getDrawable(f.d.share_facebook), a[0]);
            this.c.add(0, new an(context, context.getResources().getDrawable(f.d.shere_googleplus), a[1]));
            this.c.add(0, anVar);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return this.c.indexOf(getItem(i));
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        LayoutInflater layoutInflater = (LayoutInflater) this.b.getSystemService("layout_inflater");
        if (view == null) {
            view = layoutInflater.inflate(f.C0052f.theme_diy_share_item, (ViewGroup) null);
            aVar = new a();
            aVar.a = (ImageView) view.findViewById(f.e.icon);
            aVar.b = (TextView) view.findViewById(f.e.app_name);
            if (d == null) {
                d = com.tsf.extend.base.j.ab.a(this.b.getAssets(), "fonts/OpenSans-Light-bold.ttf");
            }
            aVar.b.setTypeface(d);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        an anVar = (an) getItem(i);
        aVar.a.setImageDrawable(anVar.b());
        aVar.b.setText(anVar.c());
        return view;
    }

    private class a {
        ImageView a;
        TextView b;

        private a() {
        }
    }
}
