package com.tsf.shell;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.manager.p187r.p193c.C3720e;
import com.tsf.shell.utils.C4171h;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.c */
/* loaded from: classes.dex */
public class C2225c {

    /* renamed from: com.tsf.shell.c$b */
    /* loaded from: classes.dex */
    public static class C2227b {

        /* renamed from: a */
        int f7302a;

        /* renamed from: b */
        String f7303b;

        /* renamed from: c */
        String f7304c;

        /* renamed from: d */
        int f7305d;

        /* renamed from: e */
        int f7306e;

        /* renamed from: f */
        String f7307f;

        /* renamed from: g */
        String f7308g;

        /* renamed from: h */
        String f7309h;

        /* renamed from: i */
        String f7310i;

        /* renamed from: j */
        String f7311j;

        /* renamed from: k */
        String f7312k;

        /* renamed from: l */
        int f7313l;

        /* renamed from: m */
        byte[] f7314m;

        /* renamed from: n */
        String f7315n;

        /* renamed from: o */
        public String f7316o;

        /* renamed from: p */
        String f7317p;

        /* renamed from: q */
        int f7318q;

        /* renamed from: r */
        int f7319r;

        /* renamed from: s */
        ArrayList<C2227b> f7320s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.c$c */
    /* loaded from: classes.dex */
    public static class C2228c {

        /* renamed from: a */
        public int f7321a;

        /* renamed from: b */
        public String f7322b;

        /* renamed from: c */
        public String f7323c;

        C2228c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.c$a */
    /* loaded from: classes.dex */
    public static class C2226a {

        /* renamed from: a */
        public String f7301a;

        C2226a() {
        }
    }

    /* renamed from: a */
    public static void m6052a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        m6051a(sQLiteDatabase, m6048b(sQLiteDatabase), m6047c(sQLiteDatabase), m6046d(sQLiteDatabase));
    }

    /* renamed from: b */
    private static ArrayList<C2228c> m6048b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<C2228c> arrayList = new ArrayList<>();
        try {
            Cursor query = sQLiteDatabase.query("folders", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("title");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("child");
            while (query.moveToNext()) {
                C2228c c2228c = new C2228c();
                c2228c.f7321a = query.getInt(columnIndexOrThrow);
                c2228c.f7322b = query.getString(columnIndexOrThrow2);
                c2228c.f7323c = query.getString(columnIndexOrThrow3);
                arrayList.add(c2228c);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    /* renamed from: c */
    private static C2226a m6047c(SQLiteDatabase sQLiteDatabase) {
        C2226a c2226a = new C2226a();
        c2226a.f7301a = "";
        try {
            Cursor query = sQLiteDatabase.query("dock", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("child");
            if (query.moveToNext()) {
                c2226a.f7301a = query.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return c2226a;
    }

    /* renamed from: d */
    private static C2226a m6046d(SQLiteDatabase sQLiteDatabase) {
        C2226a c2226a = new C2226a();
        c2226a.f7301a = "";
        try {
            Cursor query = sQLiteDatabase.query("quicklaunch", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("child");
            if (query.moveToNext()) {
                c2226a.f7301a = query.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return c2226a;
    }

    /* renamed from: a */
    private static void m6051a(SQLiteDatabase sQLiteDatabase, ArrayList<C2228c> arrayList, C2226a c2226a, C2226a c2226a2) {
        Iterator<C2227b> it;
        Iterator<C2227b> it2;
        boolean z;
        Cursor query = sQLiteDatabase.query("favorites", null, null, null, null, null, null);
        int columnIndexOrThrow = query.getColumnIndexOrThrow("appWidgetId");
        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("config");
        query.getColumnIndexOrThrow("appWidgetId");
        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("intent");
        int columnIndexOrThrow4 = query.getColumnIndexOrThrow("title");
        int columnIndexOrThrow5 = query.getColumnIndexOrThrow("container");
        int columnIndexOrThrow6 = query.getColumnIndexOrThrow("itemType");
        int columnIndexOrThrow7 = query.getColumnIndexOrThrow("screen");
        int columnIndexOrThrow8 = query.getColumnIndexOrThrow("cellX");
        int columnIndexOrThrow9 = query.getColumnIndexOrThrow("cellY");
        int columnIndexOrThrow10 = query.getColumnIndexOrThrow("rotation");
        int columnIndexOrThrow11 = query.getColumnIndexOrThrow("spanX");
        int columnIndexOrThrow12 = query.getColumnIndexOrThrow("spanY");
        int columnIndexOrThrow13 = query.getColumnIndexOrThrow("packagename");
        int columnIndexOrThrow14 = query.getColumnIndexOrThrow("classname");
        int columnIndexOrThrow15 = query.getColumnIndexOrThrow("internal");
        int columnIndexOrThrow16 = query.getColumnIndexOrThrow("scale");
        int columnIndexOrThrow17 = query.getColumnIndexOrThrow("data");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (query.moveToNext()) {
            C2227b c2227b = new C2227b();
            c2227b.f7303b = query.getString(columnIndexOrThrow4);
            c2227b.f7313l = query.getInt(columnIndexOrThrow6);
            c2227b.f7319r = query.getInt(columnIndexOrThrow);
            c2227b.f7315n = query.getString(columnIndexOrThrow2);
            if (c2227b.f7313l == 1) {
                Iterator<C2228c> it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    C2228c next = it3.next();
                    if (next.f7321a == c2227b.f7319r) {
                        c2227b.f7303b = next.f7322b;
                        c2227b.f7315n = next.f7323c;
                        c2227b.f7320s = new ArrayList<>();
                        z = true;
                        break;
                    }
                }
                if (z) {
                }
            }
            c2227b.f7304c = query.getString(columnIndexOrThrow3);
            c2227b.f7305d = query.getInt(columnIndexOrThrow5);
            c2227b.f7306e = query.getInt(columnIndexOrThrow7);
            c2227b.f7307f = query.getString(columnIndexOrThrow8);
            c2227b.f7308g = query.getString(columnIndexOrThrow9);
            c2227b.f7309h = query.getString(columnIndexOrThrow10);
            c2227b.f7310i = query.getString(columnIndexOrThrow11);
            c2227b.f7311j = query.getString(columnIndexOrThrow12);
            c2227b.f7312k = query.getString(columnIndexOrThrow16);
            c2227b.f7314m = query.getBlob(columnIndexOrThrow17);
            c2227b.f7316o = query.getString(columnIndexOrThrow13);
            c2227b.f7317p = query.getString(columnIndexOrThrow14);
            c2227b.f7318q = query.getInt(columnIndexOrThrow15);
            if (c2227b.f7313l == 1) {
                arrayList3.add(c2227b);
            } else {
                arrayList2.add(c2227b);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C2227b c2227b2 = (C2227b) it4.next();
            arrayList4.clear();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                C2227b c2227b3 = (C2227b) it5.next();
                if (c2227b3.f7306e == c2227b2.f7319r) {
                    if (c2227b3.f7313l == 2 || c2227b3.f7313l == 7) {
                        c2227b2.f7320s.add(c2227b3);
                    }
                    arrayList4.add(c2227b3);
                }
                c2227b3.f7319r = -1;
            }
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                arrayList2.remove((C2227b) it6.next());
            }
            c2227b2.f7320s = m6049a(c2227b2.f7320s, c2227b2.f7315n, ",", true);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            C2227b c2227b4 = (C2227b) it7.next();
            switch (c2227b4.f7305d) {
                case -4:
                    c2227b4.f7305d = -3;
                    c2227b4.f7306e = 0;
                    arrayList5.add(c2227b4);
                    break;
                case -2:
                    c2227b4.f7306e = 0;
                    arrayList6.add(c2227b4);
                    break;
            }
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            C2227b c2227b5 = (C2227b) it8.next();
            switch (c2227b5.f7305d) {
                case -4:
                    c2227b5.f7305d = -3;
                    c2227b5.f7306e = 0;
                    arrayList5.add(c2227b5);
                    break;
                case -2:
                    c2227b5.f7306e = 0;
                    arrayList6.add(c2227b5);
                    break;
            }
        }
        ArrayList<C2227b> m6049a = m6049a((ArrayList<C2227b>) arrayList5, c2226a.f7301a, ",", true);
        ArrayList<C2227b> m6049a2 = m6049a((ArrayList<C2227b>) arrayList6, c2226a2.f7301a, ",", true);
        ArrayList arrayList7 = new ArrayList();
        Iterator it9 = arrayList3.iterator();
        int i = 1;
        while (it9.hasNext()) {
            C2227b c2227b6 = (C2227b) it9.next();
            arrayList7.add(c2227b6);
            c2227b6.f7302a = i;
            int size = c2227b6.f7320s.size();
            String str = "";
            int i2 = i + 1;
            for (int i3 = 0; i3 < size; i3++) {
                C2227b c2227b7 = c2227b6.f7320s.get((size - i3) - 1);
                c2227b7.f7306e = 0;
                c2227b7.f7305d = i;
                arrayList7.add(c2227b7);
                c2227b7.f7302a = i2;
                str = str + i2 + ",";
                i2++;
            }
            c2227b6.f7315n = str;
            c2227b6.f7320s.clear();
            i = i2;
        }
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            C2227b c2227b8 = (C2227b) it10.next();
            arrayList7.add(c2227b8);
            c2227b8.f7302a = i;
            i++;
        }
        ContentValues[] contentValuesArr = new ContentValues[arrayList7.size()];
        int i4 = 0;
        Iterator it11 = arrayList7.iterator();
        while (true) {
            int i5 = i4;
            if (it11.hasNext()) {
                C2227b c2227b9 = (C2227b) it11.next();
                ContentValues contentValues = new ContentValues(query.getColumnCount());
                contentValues.put("title", c2227b9.f7303b);
                contentValues.put("itemType", Integer.valueOf(c2227b9.f7313l));
                switch (c2227b9.f7313l) {
                    case 2:
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.setComponent(new ComponentName(c2227b9.f7316o, c2227b9.f7317p));
                        intent.setFlags(270532608);
                        contentValues.put("intent", intent.toUri(0));
                        break;
                    case 3:
                        contentValues.put("appWidgetId", Integer.valueOf(c2227b9.f7319r));
                        contentValues.put("appWidgetProvider", c2227b9.f7316o + "/" + c2227b9.f7317p);
                        break;
                    case 5:
                        c2227b9.f7316o = C3720e.m1648a(c2227b9);
                        contentValues.put("packagename", c2227b9.f7316o);
                        contentValues.put("classname", c2227b9.f7317p);
                        break;
                    case 7:
                        contentValues.put("intent", c2227b9.f7304c);
                        break;
                    case 8:
                        c2227b9.f7313l = 7;
                        Intent intent2 = new Intent();
                        int i6 = 0;
                        try {
                            i6 = Integer.parseInt(c2227b9.f7317p);
                        } catch (Exception e) {
                        }
                        intent2.putExtra("action", i6);
                        c2227b9.f7304c = intent2.toUri(0);
                        c2227b9.f7317p = "";
                        contentValues.put("intent", c2227b9.f7304c);
                        contentValues.put("itemType", Integer.valueOf(c2227b9.f7313l));
                        break;
                }
                if (c2227b9.f7313l == 7 || c2227b9.f7313l == 2) {
                    boolean z2 = false;
                    try {
                        String[] split = c2227b9.f7315n.split(",");
                        int parseInt = Integer.parseInt(split[0]);
                        if (split.length > 2) {
                            z2 = split[2].equals("1");
                        }
                        if (z2) {
                            contentValues.put("titleType", (Integer) 1);
                        }
                        switch (parseInt) {
                            case 0:
                                if (split.length > 1) {
                                    String str2 = split[1];
                                    if (!str2.equals("")) {
                                        contentValues.put("iconType", (Integer) 1);
                                        contentValues.put("iconPackage", c2227b9.f7316o);
                                        contentValues.put("iconResource", str2);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                contentValues.put("iconType", (Integer) 2);
                                break;
                        }
                    } catch (Exception e2) {
                    }
                    c2227b9.f7315n = "";
                }
                contentValues.put("container", Integer.valueOf(c2227b9.f7305d));
                contentValues.put("screen", Integer.valueOf(c2227b9.f7306e));
                contentValues.put("cellX", c2227b9.f7307f);
                contentValues.put("cellY", c2227b9.f7308g);
                contentValues.put("rotation", c2227b9.f7309h);
                contentValues.put("spanX", c2227b9.f7310i);
                contentValues.put("spanY", c2227b9.f7311j);
                contentValues.put("scale", c2227b9.f7312k);
                contentValues.put("internal", Integer.valueOf(c2227b9.f7318q));
                contentValues.put("icon", c2227b9.f7314m);
                contentValues.put("config", c2227b9.f7315n);
                i4 = i5 + 1;
                contentValuesArr[i5] = contentValues;
            } else {
                String str3 = "";
                while (true) {
                    String str4 = str3;
                    if (m6049a.iterator().hasNext()) {
                        str3 = str4 + it.next().f7302a + ",";
                    } else {
                        ShellProvider.C2183a.m6140a(sQLiteDatabase, str4);
                        String str5 = "";
                        while (true) {
                            String str6 = str5;
                            if (m6049a2.iterator().hasNext()) {
                                str5 = str6 + it2.next().f7302a + ",";
                            } else {
                                ShellProvider.C2183a.m6132d(sQLiteDatabase, str6);
                                ShellProvider.C2183a.m6141a(sQLiteDatabase);
                                try {
                                    for (ContentValues contentValues2 : contentValuesArr) {
                                        sQLiteDatabase.insert("favorites", null, contentValues2);
                                    }
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    query.close();
                                    return;
                                } catch (Throwable th) {
                                    sQLiteDatabase.endTransaction();
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static ArrayList<C2227b> m6049a(ArrayList<C2227b> arrayList, String str, String str2, boolean z) {
        ArrayList<C2227b> arrayList2 = new ArrayList<>();
        ArrayList<Integer> m680a = C4171h.m680a(str, ",", false);
        int size = m680a.size();
        for (int i = 0; i < size; i++) {
            C2227b m6050a = m6050a(arrayList, m680a.get(i).intValue());
            if (m6050a != null) {
                arrayList2.add(m6050a);
                arrayList.remove(m6050a);
            }
        }
        if (z) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static C2227b m6050a(ArrayList<C2227b> arrayList, int i) {
        Iterator<C2227b> it = arrayList.iterator();
        while (it.hasNext()) {
            C2227b next = it.next();
            if (next.f7319r == i) {
                return next;
            }
        }
        return null;
    }
}
