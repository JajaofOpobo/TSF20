package com.tsf.shell;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tsf.shell.ShellProvider;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static class b {
        int a;
        String b;
        String c;
        int d;
        int e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;
        int l;
        byte[] m;
        String n;
        public String o;
        String p;
        int q;
        int r;
        ArrayList<b> s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0076c {
        public int a;
        public String b;
        public String c;

        C0076c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        public String a;

        a() {
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        a(sQLiteDatabase, b(sQLiteDatabase), c(sQLiteDatabase), d(sQLiteDatabase));
    }

    private static ArrayList<C0076c> b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<C0076c> arrayList = new ArrayList<>();
        try {
            Cursor query = sQLiteDatabase.query("folders", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("title");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("child");
            while (query.moveToNext()) {
                C0076c c0076c = new C0076c();
                c0076c.a = query.getInt(columnIndexOrThrow);
                c0076c.b = query.getString(columnIndexOrThrow2);
                c0076c.c = query.getString(columnIndexOrThrow3);
                arrayList.add(c0076c);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    private static a c(SQLiteDatabase sQLiteDatabase) {
        a aVar = new a();
        aVar.a = "";
        try {
            Cursor query = sQLiteDatabase.query("dock", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("child");
            if (query.moveToNext()) {
                aVar.a = query.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return aVar;
    }

    private static a d(SQLiteDatabase sQLiteDatabase) {
        a aVar = new a();
        aVar.a = "";
        try {
            Cursor query = sQLiteDatabase.query("quicklaunch", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("child");
            if (query.moveToNext()) {
                aVar.a = query.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return aVar;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, ArrayList<C0076c> arrayList, a aVar, a aVar2) {
        Iterator<b> it;
        Iterator<b> it2;
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
            b bVar = new b();
            bVar.b = query.getString(columnIndexOrThrow4);
            bVar.l = query.getInt(columnIndexOrThrow6);
            bVar.r = query.getInt(columnIndexOrThrow);
            bVar.n = query.getString(columnIndexOrThrow2);
            if (bVar.l == 1) {
                Iterator<C0076c> it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    C0076c next = it3.next();
                    if (next.a == bVar.r) {
                        bVar.b = next.b;
                        bVar.n = next.c;
                        bVar.s = new ArrayList<>();
                        z = true;
                        break;
                    }
                }
                if (z) {
                }
            }
            bVar.c = query.getString(columnIndexOrThrow3);
            bVar.d = query.getInt(columnIndexOrThrow5);
            bVar.e = query.getInt(columnIndexOrThrow7);
            bVar.f = query.getString(columnIndexOrThrow8);
            bVar.g = query.getString(columnIndexOrThrow9);
            bVar.h = query.getString(columnIndexOrThrow10);
            bVar.i = query.getString(columnIndexOrThrow11);
            bVar.j = query.getString(columnIndexOrThrow12);
            bVar.k = query.getString(columnIndexOrThrow16);
            bVar.m = query.getBlob(columnIndexOrThrow17);
            bVar.o = query.getString(columnIndexOrThrow13);
            bVar.p = query.getString(columnIndexOrThrow14);
            bVar.q = query.getInt(columnIndexOrThrow15);
            if (bVar.l == 1) {
                arrayList3.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            b bVar2 = (b) it4.next();
            arrayList4.clear();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                b bVar3 = (b) it5.next();
                if (bVar3.e == bVar2.r) {
                    if (bVar3.l == 2 || bVar3.l == 7) {
                        bVar2.s.add(bVar3);
                    }
                    arrayList4.add(bVar3);
                }
                bVar3.r = -1;
            }
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                arrayList2.remove((b) it6.next());
            }
            bVar2.s = a(bVar2.s, bVar2.n, ",", true);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            b bVar4 = (b) it7.next();
            switch (bVar4.d) {
                case -4:
                    bVar4.d = -3;
                    bVar4.e = 0;
                    arrayList5.add(bVar4);
                    break;
                case -2:
                    bVar4.e = 0;
                    arrayList6.add(bVar4);
                    break;
            }
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            b bVar5 = (b) it8.next();
            switch (bVar5.d) {
                case -4:
                    bVar5.d = -3;
                    bVar5.e = 0;
                    arrayList5.add(bVar5);
                    break;
                case -2:
                    bVar5.e = 0;
                    arrayList6.add(bVar5);
                    break;
            }
        }
        ArrayList<b> a2 = a((ArrayList<b>) arrayList5, aVar.a, ",", true);
        ArrayList<b> a3 = a((ArrayList<b>) arrayList6, aVar2.a, ",", true);
        ArrayList arrayList7 = new ArrayList();
        Iterator it9 = arrayList3.iterator();
        int i = 1;
        while (it9.hasNext()) {
            b bVar6 = (b) it9.next();
            arrayList7.add(bVar6);
            bVar6.a = i;
            int size = bVar6.s.size();
            String str = "";
            int i2 = i + 1;
            for (int i3 = 0; i3 < size; i3++) {
                b bVar7 = bVar6.s.get((size - i3) - 1);
                bVar7.e = 0;
                bVar7.d = i;
                arrayList7.add(bVar7);
                bVar7.a = i2;
                str = str + i2 + ",";
                i2++;
            }
            bVar6.n = str;
            bVar6.s.clear();
            i = i2;
        }
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            b bVar8 = (b) it10.next();
            arrayList7.add(bVar8);
            bVar8.a = i;
            i++;
        }
        ContentValues[] contentValuesArr = new ContentValues[arrayList7.size()];
        int i4 = 0;
        Iterator it11 = arrayList7.iterator();
        while (true) {
            int i5 = i4;
            if (it11.hasNext()) {
                b bVar9 = (b) it11.next();
                ContentValues contentValues = new ContentValues(query.getColumnCount());
                contentValues.put("title", bVar9.b);
                contentValues.put("itemType", Integer.valueOf(bVar9.l));
                switch (bVar9.l) {
                    case 2:
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.setComponent(new ComponentName(bVar9.o, bVar9.p));
                        intent.setFlags(270532608);
                        contentValues.put("intent", intent.toUri(0));
                        break;
                    case 3:
                        contentValues.put("appWidgetId", Integer.valueOf(bVar9.r));
                        contentValues.put("appWidgetProvider", bVar9.o + "/" + bVar9.p);
                        break;
                    case 5:
                        bVar9.o = com.tsf.shell.manager.r.c.e.a(bVar9);
                        contentValues.put("packagename", bVar9.o);
                        contentValues.put("classname", bVar9.p);
                        break;
                    case 7:
                        contentValues.put("intent", bVar9.c);
                        break;
                    case 8:
                        bVar9.l = 7;
                        Intent intent2 = new Intent();
                        int i6 = 0;
                        try {
                            i6 = Integer.parseInt(bVar9.p);
                        } catch (Exception e) {
                        }
                        intent2.putExtra("action", i6);
                        bVar9.c = intent2.toUri(0);
                        bVar9.p = "";
                        contentValues.put("intent", bVar9.c);
                        contentValues.put("itemType", Integer.valueOf(bVar9.l));
                        break;
                }
                if (bVar9.l == 7 || bVar9.l == 2) {
                    boolean z2 = false;
                    try {
                        String[] split = bVar9.n.split(",");
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
                                        contentValues.put("iconPackage", bVar9.o);
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
                    bVar9.n = "";
                }
                contentValues.put("container", Integer.valueOf(bVar9.d));
                contentValues.put("screen", Integer.valueOf(bVar9.e));
                contentValues.put("cellX", bVar9.f);
                contentValues.put("cellY", bVar9.g);
                contentValues.put("rotation", bVar9.h);
                contentValues.put("spanX", bVar9.i);
                contentValues.put("spanY", bVar9.j);
                contentValues.put("scale", bVar9.k);
                contentValues.put("internal", Integer.valueOf(bVar9.q));
                contentValues.put("icon", bVar9.m);
                contentValues.put("config", bVar9.n);
                i4 = i5 + 1;
                contentValuesArr[i5] = contentValues;
            } else {
                String str3 = "";
                while (true) {
                    String str4 = str3;
                    if (a2.iterator().hasNext()) {
                        str3 = str4 + it.next().a + ",";
                    } else {
                        ShellProvider.a.a(sQLiteDatabase, str4);
                        String str5 = "";
                        while (true) {
                            String str6 = str5;
                            if (a3.iterator().hasNext()) {
                                str5 = str6 + it2.next().a + ",";
                            } else {
                                ShellProvider.a.d(sQLiteDatabase, str6);
                                ShellProvider.a.a(sQLiteDatabase);
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

    public static ArrayList<b> a(ArrayList<b> arrayList, String str, String str2, boolean z) {
        ArrayList<b> arrayList2 = new ArrayList<>();
        ArrayList<Integer> a2 = com.tsf.shell.utils.h.a(str, ",", false);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            b a3 = a(arrayList, a2.get(i).intValue());
            if (a3 != null) {
                arrayList2.add(a3);
                arrayList.remove(a3);
            }
        }
        if (z) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return arrayList2;
    }

    private static b a(ArrayList<b> arrayList, int i) {
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.r == i) {
                return next;
            }
        }
        return null;
    }
}
