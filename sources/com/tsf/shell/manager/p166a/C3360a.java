package com.tsf.shell.manager.p166a;

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
/* renamed from: com.tsf.shell.manager.a.a */
/* loaded from: classes.dex */
public class C3360a {

    /* renamed from: i */
    private ArrayList<C3377f> f11121i = new ArrayList<>(42);

    /* renamed from: a */
    public ArrayList<C3377f> f11113a = new ArrayList<>(42);

    /* renamed from: b */
    public ArrayList<C3377f> f11114b = new ArrayList<>(42);

    /* renamed from: c */
    public ArrayList<C3377f> f11115c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<C3377f> f11116d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C3377f> f11117e = new ArrayList<>(42);

    /* renamed from: f */
    public ArrayList<C3377f> f11118f = new ArrayList<>(42);

    /* renamed from: g */
    public ArrayList<C3377f> f11119g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<C3377f> f11120h = new ArrayList<>();

    /* renamed from: a */
    public C3377f m2775a(ComponentName componentName) {
        return m2771a(this.f11121i, componentName);
    }

    /* renamed from: b */
    public C3377f m2769b(ComponentName componentName) {
        return m2771a(this.f11113a, componentName);
    }

    /* renamed from: c */
    public C3377f m2766c(ComponentName componentName) {
        return m2771a(this.f11117e, componentName);
    }

    /* renamed from: a */
    public void m2773a(C3377f c3377f) {
        c3377f.f11174g = true;
        this.f11121i.add(c3377f);
    }

    /* renamed from: b */
    public void m2767b(C3377f c3377f) {
        c3377f.f11174g = false;
        this.f11121i.remove(c3377f);
    }

    /* renamed from: c */
    public void m2764c(C3377f c3377f) {
        if (m2771a(this.f11113a, c3377f.f11169b) == null) {
            this.f11113a.add(c3377f);
            this.f11114b.add(c3377f);
        }
    }

    /* renamed from: d */
    public void m2762d(C3377f c3377f) {
        this.f11113a.add(c3377f);
    }

    /* renamed from: e */
    public void m2760e(C3377f c3377f) {
        this.f11114b.add(c3377f);
    }

    /* renamed from: f */
    public void m2758f(C3377f c3377f) {
        if (m2771a(this.f11117e, c3377f.f11169b) == null) {
            this.f11117e.add(c3377f);
            this.f11118f.add(c3377f);
        }
    }

    /* renamed from: g */
    public void m2757g(C3377f c3377f) {
        this.f11117e.add(c3377f);
    }

    /* renamed from: a */
    public void m2774a(Context context, String str) {
        List<ResolveInfo> m2763d = m2763d(context, str);
        if (m2763d.size() > 0) {
            for (ResolveInfo resolveInfo : m2763d) {
                C3377f m2775a = m2775a(new ComponentName(str, resolveInfo.activityInfo.name));
                if (m2775a != null) {
                    m2767b(m2775a);
                    m2775a.m2702a(resolveInfo);
                } else {
                    m2775a = new C3377f(resolveInfo);
                }
                m2764c(m2775a);
            }
        }
        List<ResolveInfo> m2761e = m2761e(context, str);
        if (m2761e.size() > 0) {
            for (ResolveInfo resolveInfo2 : m2761e) {
                m2758f(new C3377f(resolveInfo2));
            }
        }
        if (m2759f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().addTheme(str);
        }
    }

    /* renamed from: b */
    public void m2768b(Context context, String str) {
        ArrayList<C3377f> arrayList = this.f11113a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3377f c3377f = arrayList.get(size);
            if (str.equals(c3377f.f11168a.getComponent().getPackageName())) {
                this.f11115c.add(c3377f);
                arrayList.remove(size);
            }
        }
        ArrayList<C3377f> arrayList2 = this.f11117e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            C3377f c3377f2 = arrayList2.get(size2);
            if (str.equals(c3377f2.f11168a.getComponent().getPackageName())) {
                this.f11119g.add(c3377f2);
                arrayList2.remove(size2);
            }
        }
        if (ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().removeTheme(str);
        }
    }

    /* renamed from: c */
    public void m2765c(Context context, String str) {
        boolean z;
        boolean z2 = true;
        List<ResolveInfo> m2763d = m2763d(context, str);
        if (m2763d.size() > 0) {
            for (int size = this.f11113a.size() - 1; size >= 0; size--) {
                C3377f c3377f = this.f11113a.get(size);
                ComponentName component = c3377f.f11168a.getComponent();
                if (str.equals(component.getPackageName()) && !m2770a(m2763d, component)) {
                    this.f11115c.add(c3377f);
                    this.f11113a.remove(size);
                }
            }
            int size2 = m2763d.size();
            for (int i = 0; i < size2; i++) {
                ResolveInfo resolveInfo = m2763d.get(i);
                C3377f m2772a = m2772a(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
                if (m2772a == null) {
                    m2764c(new C3377f(resolveInfo));
                } else {
                    m2772a.m2702a(resolveInfo);
                    this.f11116d.add(m2772a);
                }
            }
            z = true;
        } else {
            z = false;
        }
        List<ResolveInfo> m2761e = m2761e(context, str);
        if (m2761e.size() > 0) {
            for (ResolveInfo resolveInfo2 : m2761e) {
                this.f11120h.add(new C3377f(resolveInfo2));
            }
        } else {
            z2 = z;
        }
        if (m2759f(context, str).size() > 0 && ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().updateTheme(str);
        }
        if (!z2) {
            for (int size3 = this.f11113a.size() - 1; size3 >= 0; size3--) {
                C3377f c3377f2 = this.f11113a.get(size3);
                if (str.equals(c3377f2.f11168a.getComponent().getPackageName())) {
                    this.f11115c.add(c3377f2);
                    this.f11113a.remove(size3);
                }
            }
        }
    }

    /* renamed from: d */
    private static List<ResolveInfo> m2763d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    /* renamed from: e */
    private static List<ResolveInfo> m2761e(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.3dwidget", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    /* renamed from: f */
    private List<ResolveInfo> m2759f(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.tsf.shell.themes", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return queryIntentActivities != null ? queryIntentActivities : new ArrayList();
    }

    /* renamed from: a */
    private static boolean m2770a(List<ResolveInfo> list, ComponentName componentName) {
        String className = componentName.getClassName();
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo.activityInfo.name.equals(className)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C3377f m2771a(ArrayList<C3377f> arrayList, ComponentName componentName) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3377f c3377f = arrayList.get(i);
            if (c3377f.f11169b.equals(componentName)) {
                return c3377f;
            }
        }
        return null;
    }

    /* renamed from: a */
    private C3377f m2772a(String str, String str2) {
        Iterator<C3377f> it = this.f11113a.iterator();
        while (it.hasNext()) {
            C3377f next = it.next();
            ComponentName component = next.f11168a.getComponent();
            if (str.equals(component.getPackageName()) && str2.equals(component.getClassName())) {
                return next;
            }
        }
        return null;
    }
}
