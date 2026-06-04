package com.tsf.shell.theme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tsf.shell.theme.inside.ThemeManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public static c a;
    private GridView b;
    private Activity c;
    private ArrayList d;
    private g e;
    private String f;
    private n g;
    private ThemeDetailedActivity h;

    public c(Activity activity, GridView gridView, String str) {
        a = this;
        this.c = activity;
        this.b = gridView;
        this.d = new ArrayList();
        this.e = new g(this, activity);
        this.f = str;
        b();
        this.b.setAdapter((ListAdapter) this.e);
        this.b.setOnItemClickListener(this);
    }

    public static c a() {
        return a;
    }

    public final n a(String str) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar.g.equals(str)) {
                return nVar;
            }
        }
        return null;
    }

    public final n a(ThemeDetailedActivity themeDetailedActivity) {
        this.h = themeDetailedActivity;
        return this.g;
    }

    private void b() {
        n a2;
        List<ResolveInfo> queryIntentActivities = this.c.getPackageManager().queryIntentActivities(new Intent("com.tsf.shell.themes", (Uri) null), 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(this.c.getPackageManager()));
        try {
            n a3 = a(this.c.createPackageContext("com.tsf.shell", 3));
            if (a3.g.equals(this.f)) {
                a3.h = true;
            }
            this.d.add(a3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (!resolveInfo.activityInfo.packageName.equals("com.tsf.shell.themes.box") && (a2 = a(this.c, resolveInfo.activityInfo.packageName)) != null) {
                if (a2.g.equals(this.f)) {
                    a2.h = true;
                }
                this.d.add(a2);
            }
        }
    }

    public static n a(Context context, String str) {
        try {
            return a(context.createPackageContext(str, 3));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static n a(Context context) {
        o oVar;
        try {
            oVar = new o(context);
        } catch (Exception e) {
            e = e;
            oVar = null;
        }
        try {
            return oVar.b();
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            if (oVar == null) {
                return null;
            }
            oVar.a();
            return null;
        }
    }

    public final void a(String[] strArr) {
        this.b.post(new d(this, strArr));
    }

    public final void b(String[] strArr) {
        this.b.post(new e(this, strArr));
    }

    public final void c(String[] strArr) {
        this.b.post(new f(this, strArr));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent();
        intent.setClass(this.c, ThemeDetailedActivity.class);
        intent.setFlags(536870912);
        this.g = (n) this.d.get(i);
        this.c.startActivity(intent);
    }

    public final void b(String str) {
        com.tsf.shell.g.d.a(this.c, str);
    }

    public final void c(String str) {
        Intent intent = new Intent(ThemeManager.ACTION_APPLY_THEME);
        intent.putExtra("applyTheme", str);
        this.c.sendBroadcast(intent);
        this.c.finish();
    }
}
