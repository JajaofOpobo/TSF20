package com.tsf.shell.plugin.iconpicker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class IconPackagePicker extends FragmentActivity {
    public static List n;
    private static int p;
    private static int q;
    private h o;
    private PackageManager r;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r = getPackageManager();
        n = new ArrayList();
        n.addAll(a((List) this.r.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0), false));
        p = n.size();
        n.addAll(a((List) this.r.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0), false));
        q = n.size();
        n.addAll(a((List) this.r.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0), true));
        setContentView(R.layout.iconpackage_picker_viewer_tabs_pager);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(R.id.scrollview);
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();
        this.o = new h(this, tabHost, (ViewPager) findViewById(R.id.pager), horizontalScrollView);
        h.b = 0;
        int size = n.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = (ResolveInfo) n.get(i);
            View inflate = LayoutInflater.from(this).inflate(R.layout.icon_picker_tab_item, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            imageView.setImageDrawable(resolveInfo.activityInfo.loadIcon(this.r));
            imageView.setVisibility(0);
            ((TextView) inflate.findViewById(R.id.title)).setText(resolveInfo.loadLabel(this.r));
            Bundle bundle2 = new Bundle();
            bundle2.putInt("num", i);
            bundle2.putInt("PkgType", a(i));
            bundle2.putString("PkgName", b(i));
            this.o.a(tabHost.newTabSpec("simple").setIndicator(inflate), f.class, bundle2);
        }
        e eVar = new e(this);
        findViewById(R.id.imageView1).setOnClickListener(eVar);
        findViewById(R.id.imageView2).setOnClickListener(eVar);
        findViewById(R.id.imageView3).setOnClickListener(eVar);
    }

    public final void a(String str, int i) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", str);
        bundle.putInt("type", i);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    private List a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (!z && !a(resolveInfo)) {
                arrayList.add(resolveInfo);
            } else {
                Iterator it2 = n.iterator();
                while (it2.hasNext()) {
                    if (resolveInfo.activityInfo.packageName.equals(((ResolveInfo) it2.next()).activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
        }
        list.removeAll(arrayList);
        return list;
    }

    private boolean a(ResolveInfo resolveInfo) {
        String str = resolveInfo.activityInfo.packageName;
        Context context = null;
        try {
            com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            context = createPackageContext(str, 3);
        } catch (Exception e) {
        }
        if (context != null) {
            if (context.getResources().getIdentifier("appfilter", "xml", context.getPackageName()) != 0) {
                return true;
            }
            try {
                String[] list = context.getAssets().list("");
                for (String str2 : list) {
                    if (str2.equals("appfilter.xml")) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static int a(int i) {
        if (i < p) {
            return 0;
        }
        if (i < q) {
            return 1;
        }
        return 2;
    }

    public static String b(int i) {
        return ((ResolveInfo) n.get(i)).activityInfo.packageName;
    }
}
