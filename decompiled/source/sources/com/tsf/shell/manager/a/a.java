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
    private ArrayList<f> i = new ArrayList<>(42);
    public ArrayList<f> a = new ArrayList<>(42);
    public ArrayList<f> b = new ArrayList<>(42);
    public ArrayList<f> c = new ArrayList<>();
    public ArrayList<f> d = new ArrayList<>();
    public ArrayList<f> e = new ArrayList<>(42);
    public ArrayList<f> f = new ArrayList<>(42);
    public ArrayList<f> g = new ArrayList<>();
    public ArrayList<f> h = new ArrayList<>();

    public f a(ComponentName componentName) {
        return a(this.i, componentName);
    }

    public f b(ComponentName componentName) {
        return a(this.a, componentName);
    }

    public f c(ComponentName componentName) {
        return a(this.e, componentName);
    }

    public void a(f fVar) {
        fVar.g = true;
        this.i.add(fVar);
    }

    public void b(f fVar) {
        fVar.g = false;
        this.i.remove(fVar);
    }

    public void c(f fVar) {
        if (a(this.a, fVar.b) == null) {
            this.a.add(fVar);
            this.b.add(fVar);
        }
    }

    public void d(f fVar) {
        this.a.add(fVar);
    }

    public void e(f fVar) {
        this.b.add(fVar);
    }

    public void f(f fVar) {
        if (a(this.e, fVar.b) == null) {
            this.e.add(fVar);
            this.f.add(fVar);
        }
    }

    public void g(f fVar) {
        this.e.add(fVar);
    }

    public void a(Context context, String str) {
        List<ResolveInfo> d = d(context, str);
        if (d.size() > 0) {
            for (ResolveInfo resolveInfo : d) {
                f a = a(new ComponentName(str, resolveInfo.activityInfo.name));
                if (a != null) {
                    b(a);
                    a.a(resolveInfo);
                } else {
                    a = new f(resolveInfo);
                }
                c(a);
            }
        }
        List<ResolveInfo> e = e(context, str);
        if (e.size() > 0) {
            for (ResolveInfo resolveInfo2 : e) {
                f(new f(resolveInfo2));
            }
        }
        if (f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().addTheme(str);
        }
    }

    public void b(Context context, String str) {
        ArrayList<f> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = arrayList.get(size);
            if (str.equals(fVar.a.getComponent().getPackageName())) {
                this.c.add(fVar);
                arrayList.remove(size);
            }
        }
        ArrayList<f> arrayList2 = this.e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f fVar2 = arrayList2.get(size2);
            if (str.equals(fVar2.a.getComponent().getPackageName())) {
                this.g.add(fVar2);
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
        List<ResolveInfo> d = d(context, str);
        if (d.size() > 0) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                f fVar = this.a.get(size);
                ComponentName component = fVar.a.getComponent();
                if (str.equals(component.getPackageName()) && !a(d, component)) {
                    this.c.add(fVar);
                    this.a.remove(size);
                }
            }
            int size2 = d.size();
            for (int i = 0; i < size2; i++) {
                ResolveInfo resolveInfo = d.get(i);
                f a = a(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
                if (a == null) {
                    c(new f(resolveInfo));
                } else {
                    a.a(resolveInfo);
                    this.d.add(a);
                }
            }
            z = true;
        } else {
            z = false;
        }
        List<ResolveInfo> e = e(context, str);
        if (e.size() > 0) {
            for (ResolveInfo resolveInfo2 : e) {
                this.h.add(new f(resolveInfo2));
            }
        } else {
            z2 = z;
        }
        if (f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().updateTheme(str);
        }
        if (!z2) {
            for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
                f fVar2 = this.a.get(size3);
                if (str.equals(fVar2.a.getComponent().getPackageName())) {
                    this.c.add(fVar2);
                    this.a.remove(size3);
                }
            }
        }
    }

    private static List<ResolveInfo> d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private static List<ResolveInfo> e(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private List<ResolveInfo> f(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.themes", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    private static boolean a(List<ResolveInfo> list, ComponentName componentName) {
        String className = componentName.getClassName();
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo.activityInfo.name.equals(className)) {
                return true;
            }
        }
        return false;
    }

    private static f a(ArrayList<f> arrayList, ComponentName componentName) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f fVar = arrayList.get(i);
            if (fVar.b.equals(componentName)) {
                return fVar;
            }
        }
        return null;
    }

    private f a(String str, String str2) {
        Iterator<f> it = this.a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            ComponentName component = next.a.getComponent();
            if (str.equals(component.getPackageName()) && str2.equals(component.getClassName())) {
                return next;
            }
        }
        return null;
    }
}
