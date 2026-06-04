package com.tsf.shell.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public ArrayList a = new ArrayList(42);
    public ArrayList b = new ArrayList(42);
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList(42);
    public ArrayList f = new ArrayList();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList(42);
    public ArrayList j = new ArrayList();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();

    public final void a(b bVar) {
        if (!a(this.a, bVar.c)) {
            this.a.add(bVar);
            this.b.add(bVar);
        }
    }

    public final void b(b bVar) {
        if (!a(this.e, bVar.c)) {
            this.e.add(bVar);
            this.f.add(bVar);
        }
    }

    public final void c(b bVar) {
        if (!a(this.i, bVar.c)) {
            this.i.add(bVar);
            this.j.add(bVar);
        }
    }

    public final void a(Context context, String str) {
        List c = c(context, str);
        if (c.size() > 0) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                a(new b((ResolveInfo) it.next()));
            }
        }
        List d = d(context, str);
        if (d.size() > 0) {
            Iterator it2 = d.iterator();
            while (it2.hasNext()) {
                b(new b((ResolveInfo) it2.next()));
            }
        }
        List e = e(context, str);
        if (e.size() > 0) {
            Iterator it3 = e.iterator();
            while (it3.hasNext()) {
                c(new b((ResolveInfo) it3.next()));
            }
        }
    }

    public final void b(Context context, String str) {
        boolean z;
        b bVar;
        boolean z2;
        boolean z3 = true;
        List c = c(context, str);
        if (c.size() > 0) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                b bVar2 = (b) this.a.get(size);
                ComponentName component = bVar2.b.getComponent();
                if (str.equals(component.getPackageName())) {
                    String className = component.getClassName();
                    Iterator it = c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ResolveInfo) it.next()).activityInfo.name.equals(className)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        this.c.add(bVar2);
                        this.a.remove(size);
                    }
                }
            }
            int size2 = c.size();
            for (int i = 0; i < size2; i++) {
                ResolveInfo resolveInfo = (ResolveInfo) c.get(i);
                String str2 = resolveInfo.activityInfo.applicationInfo.packageName;
                String str3 = resolveInfo.activityInfo.name;
                Iterator it2 = this.a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        bVar = null;
                        break;
                    }
                    bVar = (b) it2.next();
                    ComponentName component2 = bVar.b.getComponent();
                    if (str2.equals(component2.getPackageName()) && str3.equals(component2.getClassName())) {
                        break;
                    }
                }
                if (bVar == null) {
                    a(new b(resolveInfo));
                } else {
                    bVar.a(resolveInfo);
                    this.d.add(bVar);
                }
            }
            z = true;
        } else {
            z = false;
        }
        List d = d(context, str);
        if (d.size() > 0) {
            Iterator it3 = d.iterator();
            while (it3.hasNext()) {
                this.h.add(new b((ResolveInfo) it3.next()));
            }
            z = true;
        }
        List e = e(context, str);
        if (e.size() > 0) {
            Iterator it4 = e.iterator();
            while (it4.hasNext()) {
                this.l.add(new b((ResolveInfo) it4.next()));
            }
        } else {
            z3 = z;
        }
        if (!z3) {
            for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
                b bVar3 = (b) this.a.get(size3);
                if (str.equals(bVar3.b.getComponent().getPackageName())) {
                    this.c.add(bVar3);
                    this.a.remove(size3);
                }
            }
        }
    }

    private static List c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private static List d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private static List e(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.themes", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private static boolean a(ArrayList arrayList, ComponentName componentName) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((b) arrayList.get(i)).c.equals(componentName)) {
                return true;
            }
        }
        return false;
    }
}
