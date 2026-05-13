package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.tsf.shell.plugin.themepicker.C3851e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.icondesigner.b */
/* loaded from: classes.dex */
public class C3874b {

    /* renamed from: a */
    public ArrayList<String> f12695a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<String> f12696b = new ArrayList<>();

    /* renamed from: c */
    public float f12697c = 1.0f;

    /* renamed from: d */
    public boolean f12698d = false;

    /* renamed from: e */
    public ArrayList<Integer> f12699e;

    /* renamed from: f */
    public ArrayList<Integer> f12700f;

    /* renamed from: b */
    private void m1298b(Context context, Context context2) {
        List list;
        String packageName = context2.getPackageName();
        try {
            list = Arrays.asList(context2.getAssets().list("theme/icon"));
        } catch (IOException e) {
            e.printStackTrace();
            list = null;
        }
        C3851e.m1317b("----------------------files length:" + list.size());
        Iterator<String> it = this.f12695a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (list.contains(next + ".png")) {
                m1300a(context, packageName, "iconback", 0, this.f12697c, true, next);
            } else {
                C3851e.m1317b("backResource not in assets floder");
            }
        }
        Iterator<String> it2 = this.f12696b.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (list.contains(next2 + ".png")) {
                m1300a(context, packageName, "iconback", 0, this.f12697c, true, next2);
            } else {
                C3851e.m1317b("uponResource not in assets floder");
            }
        }
    }

    /* renamed from: a */
    public void m1301a(Context context, Context context2) {
        if (this.f12698d) {
            m1298b(context, context2);
        } else {
            m1297c(context, context2);
        }
    }

    /* renamed from: c */
    private void m1297c(Context context, Context context2) {
        C3851e.m1317b("parseDrawableId:" + context2.getPackageName());
        this.f12699e = m1299a(context2, this.f12695a);
        this.f12700f = m1299a(context2, this.f12696b);
        String packageName = context2.getPackageName();
        Iterator<Integer> it = this.f12699e.iterator();
        while (it.hasNext()) {
            m1300a(context, packageName, "iconback", it.next(), this.f12697c, false, "");
        }
        Iterator<Integer> it2 = this.f12700f.iterator();
        while (it2.hasNext()) {
            m1300a(context, packageName, "iconupon", it2.next(), this.f12697c, false, "");
        }
    }

    /* renamed from: a */
    private void m1300a(Context context, String str, String str2, Integer num, float f, boolean z, String str3) {
        Uri uri = C3881g.f12715g;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C3881g.f12710b, str2);
            contentValues.put(C3881g.f12709a, str);
            contentValues.put(C3881g.f12712d, num);
            contentValues.put(C3881g.f12711c, Float.valueOf(f));
            contentValues.put(C3881g.f12714f, Integer.valueOf(z ? 1 : 0));
            contentValues.put(C3881g.f12713e, str3);
            context.getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static ArrayList<Integer> m1299a(Context context, List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = list.size();
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            try {
                int identifier = resources.getIdentifier(packageName + ":drawable/" + str, null, null);
                C3851e.m1317b("Parse Resource ID:" + str + "   " + identifier);
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(identifier));
                }
            } catch (Exception e) {
                C3851e.m1319a(e.getMessage());
            }
        }
        return arrayList;
    }
}
