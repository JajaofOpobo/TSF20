package com.tsf.shell.manager.app;

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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppListManager {
    public static Object B;
    private ArrayList<LauncherAppInfo> i = new ArrayList<>(42);
    public ArrayList<LauncherAppInfo> a = new ArrayList<>(42);
    public ArrayList<LauncherAppInfo> b = new ArrayList<>(42);
    public ArrayList<LauncherAppInfo> c = new ArrayList<>();
    public ArrayList<LauncherAppInfo> d = new ArrayList<>();
    public ArrayList<LauncherAppInfo> e = new ArrayList<>(42);
    public ArrayList<LauncherAppInfo> f = new ArrayList<>(42);
    public ArrayList<LauncherAppInfo> g = new ArrayList<>();
    public ArrayList<LauncherAppInfo> h = new ArrayList<>();

    public LauncherAppInfo a(ComponentName componentName) {
        return a(this.i, componentName);
    }

    public LauncherAppInfo b(ComponentName componentName) {
        return a(this.a, componentName);
    }

    public LauncherAppInfo c(ComponentName componentName) {
        return a(this.e, componentName);
    }

    public void a(LauncherAppInfo fVar) {
        fVar.g = true;
        this.i.add(fVar);
    }

    public void b(LauncherAppInfo fVar) {
        fVar.g = false;
        this.i.remove(fVar);
    }

    public void c(LauncherAppInfo fVar) {
        if (a(this.a, fVar.b) == null) {
            this.a.add(fVar);
            this.b.add(fVar);
        }
    }

    public void d(LauncherAppInfo fVar) {
        this.a.add(fVar);
    }

    public void e(LauncherAppInfo fVar) {
        this.b.add(fVar);
    }

    public void f(LauncherAppInfo fVar) {
        if (a(this.e, fVar.b) == null) {
            this.e.add(fVar);
            this.f.add(fVar);
        }
    }

    public void g(LauncherAppInfo fVar) {
        this.e.add(fVar);
    }

    public void a(Context context, String str) {
        List<ResolveInfo> listD = d(context, str);
        if (listD.size() > 0) {
            for (ResolveInfo resolveInfo : listD) {
                LauncherAppInfo fVarA = a(new ComponentName(str, resolveInfo.activityInfo.name));
                if (fVarA != null) {
                    b(fVarA);
                    fVarA.a(resolveInfo);
                } else {
                    fVarA = new LauncherAppInfo(resolveInfo);
                }
                c(fVarA);
            }
        }
        List<ResolveInfo> listE = e(context, str);
        if (listE.size() > 0) {
            Iterator<ResolveInfo> it = listE.iterator();
            while (it.hasNext()) {
                f(new LauncherAppInfo(it.next()));
            }
        }
        if (f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().addTheme(str);
        }
    }

    public void b(Context context, String str) {
        ArrayList<LauncherAppInfo> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            LauncherAppInfo fVar = arrayList.get(size);
            if (str.equals(fVar.a.getComponent().getPackageName())) {
                this.c.add(fVar);
                arrayList.remove(size);
            }
        }
        ArrayList<LauncherAppInfo> arrayList2 = this.e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            LauncherAppInfo fVar2 = arrayList2.get(size2);
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
        List<ResolveInfo> listD = d(context, str);
        if (listD.size() > 0) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                LauncherAppInfo fVar = this.a.get(size);
                ComponentName component = fVar.a.getComponent();
                if (str.equals(component.getPackageName()) && !a(listD, component)) {
                    this.c.add(fVar);
                    this.a.remove(size);
                }
            }
            int size2 = listD.size();
            for (int i = 0; i < size2; i++) {
                ResolveInfo resolveInfo = listD.get(i);
                LauncherAppInfo fVarA = a(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
                if (fVarA == null) {
                    c(new LauncherAppInfo(resolveInfo));
                } else {
                    fVarA.a(resolveInfo);
                    this.d.add(fVarA);
                }
            }
            z = true;
        } else {
            z = false;
        }
        List<ResolveInfo> listE = e(context, str);
        if (listE.size() > 0) {
            Iterator<ResolveInfo> it = listE.iterator();
            while (it.hasNext()) {
                this.h.add(new LauncherAppInfo(it.next()));
            }
        } else {
            z2 = z;
        }
        if (f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().updateTheme(str);
        }
        if (!z2) {
            for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
                LauncherAppInfo fVar2 = this.a.get(size3);
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
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return listQueryIntentActivities != null ? listQueryIntentActivities : new ArrayList();
    }

    private static List<ResolveInfo> e(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return listQueryIntentActivities != null ? listQueryIntentActivities : new ArrayList();
    }

    private List<ResolveInfo> f(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.themes", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return listQueryIntentActivities != null ? listQueryIntentActivities : new ArrayList();
    }

    private static boolean a(List<ResolveInfo> list, ComponentName componentName) {
        String className = componentName.getClassName();
        Iterator<ResolveInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.name.equals(className)) {
                return true;
            }
        }
        return false;
    }

    private static f a(ArrayList<LauncherAppInfo> arrayList, ComponentName componentName) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            LauncherAppInfo fVar = arrayList.get(i);
            if (fVar.b.equals(componentName)) {
                return fVar;
            }
        }
        return null;
    }

    private LauncherAppInfo a(String str, String str2) {
        for (LauncherAppInfo fVar : this.a) {
            ComponentName component = fVar.a.getComponent();
            if (str.equals(component.getPackageName()) && str2.equals(component.getClassName())) {
                return fVar;
            }
        }
        return null;
    }
}
