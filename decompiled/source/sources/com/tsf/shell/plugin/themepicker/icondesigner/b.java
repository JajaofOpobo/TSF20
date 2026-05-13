package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public ArrayList<String> a = new ArrayList<>();
    public ArrayList<String> b = new ArrayList<>();
    public float c = 1.0f;
    public boolean d = false;
    public ArrayList<Integer> e;
    public ArrayList<Integer> f;

    private void b(Context context, Context context2) {
        List list;
        String packageName = context2.getPackageName();
        try {
            list = Arrays.asList(context2.getAssets().list("theme/icon"));
        } catch (IOException e) {
            e.printStackTrace();
            list = null;
        }
        com.tsf.shell.plugin.themepicker.e.b("----------------------files length:" + list.size());
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (list.contains(next + ".png")) {
                a(context, packageName, "iconback", 0, this.c, true, next);
            } else {
                com.tsf.shell.plugin.themepicker.e.b("backResource not in assets floder");
            }
        }
        Iterator<String> it2 = this.b.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (list.contains(next2 + ".png")) {
                a(context, packageName, "iconback", 0, this.c, true, next2);
            } else {
                com.tsf.shell.plugin.themepicker.e.b("uponResource not in assets floder");
            }
        }
    }

    public void a(Context context, Context context2) {
        if (this.d) {
            b(context, context2);
        } else {
            c(context, context2);
        }
    }

    private void c(Context context, Context context2) {
        com.tsf.shell.plugin.themepicker.e.b("parseDrawableId:" + context2.getPackageName());
        this.e = a(context2, this.a);
        this.f = a(context2, this.b);
        String packageName = context2.getPackageName();
        Iterator<Integer> it = this.e.iterator();
        while (it.hasNext()) {
            a(context, packageName, "iconback", it.next(), this.c, false, "");
        }
        Iterator<Integer> it2 = this.f.iterator();
        while (it2.hasNext()) {
            a(context, packageName, "iconupon", it2.next(), this.c, false, "");
        }
    }

    private void a(Context context, String str, String str2, Integer num, float f, boolean z, String str3) {
        Uri uri = g.g;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(g.b, str2);
            contentValues.put(g.a, str);
            contentValues.put(g.d, num);
            contentValues.put(g.c, Float.valueOf(f));
            contentValues.put(g.f, Integer.valueOf(z ? 1 : 0));
            contentValues.put(g.e, str3);
            context.getContentResolver().insert(uri, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> a(Context context, List<String> list) {
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
                com.tsf.shell.plugin.themepicker.e.b("Parse Resource ID:" + str + "   " + identifier);
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(identifier));
                }
            } catch (Exception e) {
                com.tsf.shell.plugin.themepicker.e.a(e.getMessage());
            }
        }
        return arrayList;
    }
}
