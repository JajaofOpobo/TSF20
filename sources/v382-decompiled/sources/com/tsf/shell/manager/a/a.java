package com.tsf.shell.manager.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tsf.shell.theme.inside.ThemeManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private ArrayList i = new ArrayList(42);
    public ArrayList a = new ArrayList(42);
    public ArrayList b = new ArrayList(42);
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList(42);
    public ArrayList f = new ArrayList(42);
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();

    public i a(ComponentName componentName) {
        return a(this.i, componentName);
    }

    public i b(ComponentName componentName) {
        return a(this.a, componentName);
    }

    public i c(ComponentName componentName) {
        return a(this.e, componentName);
    }

    public void a(i iVar) {
        iVar.g = true;
        this.i.add(iVar);
    }

    public void b(i iVar) {
        iVar.g = false;
        this.i.remove(iVar);
    }

    public void c(i iVar) {
        if (a(this.a, iVar.b) == null) {
            this.a.add(iVar);
            this.b.add(iVar);
        }
    }

    public void d(i iVar) {
        this.a.add(iVar);
    }

    public void e(i iVar) {
        this.b.add(iVar);
    }

    public void f(i iVar) {
        if (a(this.e, iVar.b) == null) {
            this.e.add(iVar);
            this.f.add(iVar);
        }
    }

    public void g(i iVar) {
        this.e.add(iVar);
    }

    public void a(Context context, String str) {
        List<ResolveInfo> d = d(context, str);
        if (d.size() > 0) {
            for (ResolveInfo resolveInfo : d) {
                i a = a(new ComponentName(str, resolveInfo.activityInfo.name));
                if (a != null) {
                    b(a);
                    a.a(resolveInfo);
                } else {
                    a = new i(resolveInfo);
                }
                c(a);
            }
        }
        List e = e(context, str);
        if (e.size() > 0) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                f(new i((ResolveInfo) it.next()));
            }
        }
        if (f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().addTheme(str);
        }
    }

    public void b(Context context, String str) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (str.equals(iVar.a.getComponent().getPackageName())) {
                this.c.add(iVar);
                arrayList.remove(size);
            }
        }
        ArrayList arrayList2 = this.e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            i iVar2 = (i) arrayList2.get(size2);
            if (str.equals(iVar2.a.getComponent().getPackageName())) {
                this.g.add(iVar2);
                arrayList2.remove(size2);
            }
        }
        if (ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().removeTheme(str);
        }
    }

    public void c(Context context, String str) {
        boolean z;
        boolean z2 = true;
        List d = d(context, str);
        if (d.size() > 0) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                i iVar = (i) this.a.get(size);
                ComponentName component = iVar.a.getComponent();
                if (str.equals(component.getPackageName()) && !a(d, component)) {
                    this.c.add(iVar);
                    this.a.remove(size);
                }
            }
            int size2 = d.size();
            for (int i = 0; i < size2; i++) {
                ResolveInfo resolveInfo = (ResolveInfo) d.get(i);
                i a = a(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
                if (a == null) {
                    c(new i(resolveInfo));
                } else {
                    a.a(resolveInfo);
                    this.d.add(a);
                }
            }
            z = true;
        } else {
            z = false;
        }
        List e = e(context, str);
        if (e.size() > 0) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                this.h.add(new i((ResolveInfo) it.next()));
            }
        } else {
            z2 = z;
        }
        if (f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().updateTheme(str);
        }
        if (!z2) {
            for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
                i iVar2 = (i) this.a.get(size3);
                if (str.equals(iVar2.a.getComponent().getPackageName())) {
                    this.c.add(iVar2);
                    this.a.remove(size3);
                }
            }
        }
    }

    private static List d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private static List e(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private List f(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.themes", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private static boolean a(List list, ComponentName componentName) {
        String className = componentName.getClassName();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ResolveInfo) it.next()).activityInfo.name.equals(className)) {
                return true;
            }
        }
        return false;
    }

    private static i a(ArrayList arrayList, ComponentName componentName) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i iVar = (i) arrayList.get(i);
            if (iVar.b.equals(componentName)) {
                return iVar;
            }
        }
        return null;
    }

    private i a(String str, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            ComponentName component = iVar.a.getComponent();
            if (str.equals(component.getPackageName()) && str2.equals(component.getClassName())) {
                return iVar;
            }
        }
        return null;
    }
}
