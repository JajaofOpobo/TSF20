package com.tsf.shell;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tsf.shell.ShellProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {

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

    /* JADX INFO: renamed from: com.tsf.shell.c$c, reason: collision with other inner class name */
    static class C0076c {
        public int a;
        public String b;
        public String c;

        C0076c() {
        }
    }

    static class a {
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
            Cursor cursorQuery = sQLiteDatabase.query("folders", null, null, null, null, null, null);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("title");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("child");
            while (cursorQuery.moveToNext()) {
                C0076c c0076c = new C0076c();
                c0076c.a = cursorQuery.getInt(columnIndexOrThrow);
                c0076c.b = cursorQuery.getString(columnIndexOrThrow2);
                c0076c.c = cursorQuery.getString(columnIndexOrThrow3);
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
            Cursor cursorQuery = sQLiteDatabase.query("dock", null, null, null, null, null, null);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("child");
            if (cursorQuery.moveToNext()) {
                aVar.a = cursorQuery.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return aVar;
    }

    private static a d(SQLiteDatabase sQLiteDatabase) {
        a aVar = new a();
        aVar.a = "";
        try {
            Cursor cursorQuery = sQLiteDatabase.query("quicklaunch", null, null, null, null, null, null);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("child");
            if (cursorQuery.moveToNext()) {
                aVar.a = cursorQuery.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return aVar;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, ArrayList<C0076c> arrayList, a aVar, a aVar2) {
        boolean z;
        Cursor cursorQuery = sQLiteDatabase.query("favorites", null, null, null, null, null, null);
        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("appWidgetId");
        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("config");
        cursorQuery.getColumnIndexOrThrow("appWidgetId");
        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("intent");
        int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("title");
        int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("container");
        int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("itemType");
        int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("screen");
        int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("cellX");
        int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("cellY");
        int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("rotation");
        int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow("spanX");
        int columnIndexOrThrow12 = cursorQuery.getColumnIndexOrThrow("spanY");
        int columnIndexOrThrow13 = cursorQuery.getColumnIndexOrThrow("packagename");
        int columnIndexOrThrow14 = cursorQuery.getColumnIndexOrThrow("classname");
        int columnIndexOrThrow15 = cursorQuery.getColumnIndexOrThrow("internal");
        int columnIndexOrThrow16 = cursorQuery.getColumnIndexOrThrow("scale");
        int columnIndexOrThrow17 = cursorQuery.getColumnIndexOrThrow("data");
        ArrayList<b> arrayList2 = new ArrayList();
        ArrayList<b> arrayList3 = new ArrayList();
        while (cursorQuery.moveToNext()) {
            b bVar = new b();
            bVar.b = cursorQuery.getString(columnIndexOrThrow4);
            bVar.l = cursorQuery.getInt(columnIndexOrThrow6);
            bVar.r = cursorQuery.getInt(columnIndexOrThrow);
            bVar.n = cursorQuery.getString(columnIndexOrThrow2);
            if (bVar.l == 1) {
                Iterator<C0076c> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C0076c next = it.next();
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
            bVar.c = cursorQuery.getString(columnIndexOrThrow3);
            bVar.d = cursorQuery.getInt(columnIndexOrThrow5);
            bVar.e = cursorQuery.getInt(columnIndexOrThrow7);
            bVar.f = cursorQuery.getString(columnIndexOrThrow8);
            bVar.g = cursorQuery.getString(columnIndexOrThrow9);
            bVar.h = cursorQuery.getString(columnIndexOrThrow10);
            bVar.i = cursorQuery.getString(columnIndexOrThrow11);
            bVar.j = cursorQuery.getString(columnIndexOrThrow12);
            bVar.k = cursorQuery.getString(columnIndexOrThrow16);
            bVar.m = cursorQuery.getBlob(columnIndexOrThrow17);
            bVar.o = cursorQuery.getString(columnIndexOrThrow13);
            bVar.p = cursorQuery.getString(columnIndexOrThrow14);
            bVar.q = cursorQuery.getInt(columnIndexOrThrow15);
            if (bVar.l == 1) {
                arrayList3.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (b bVar2 : arrayList3) {
            arrayList4.clear();
            for (b bVar3 : arrayList2) {
                if (bVar3.e == bVar2.r) {
                    if (bVar3.l == 2 || bVar3.l == 7) {
                        bVar2.s.add(bVar3);
                    }
                    arrayList4.add(bVar3);
                }
                bVar3.r = -1;
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList2.remove((b) it2.next());
            }
            bVar2.s = a(bVar2.s, bVar2.n, ",", true);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (b bVar4 : arrayList3) {
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
        for (b bVar5 : arrayList2) {
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
        ArrayList<b> arrayListA = a((ArrayList<b>) arrayList5, aVar.a, ",", true);
        ArrayList<b> arrayListA2 = a((ArrayList<b>) arrayList6, aVar2.a, ",", true);
        ArrayList arrayList7 = new ArrayList();
        int i = 1;
        for (b bVar6 : arrayList3) {
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
        for (b bVar8 : arrayList2) {
            arrayList7.add(bVar8);
            bVar8.a = i;
            i++;
        }
        ContentValues[] contentValuesArr = new ContentValues[arrayList7.size()];
        int i4 = 0;
        Iterator it3 = arrayList7.iterator();
        while (true) {
            int i5 = i4;
            if (it3.hasNext()) {
                b bVar9 = (b) it3.next();
                ContentValues contentValues = new ContentValues(cursorQuery.getColumnCount());
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
                            break;
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
                        String[] strArrSplit = bVar9.n.split(",");
                        int i7 = Integer.parseInt(strArrSplit[0]);
                        if (strArrSplit.length > 2) {
                            z2 = strArrSplit[2].equals("1");
                        }
                        if (z2) {
                            contentValues.put("titleType", (Integer) 1);
                        }
                        switch (i7) {
                            case 0:
                                if (strArrSplit.length > 1) {
                                    String str2 = strArrSplit[1];
                                    if (!str2.equals("")) {
                                        contentValues.put("iconType", (Integer) 1);
                                        contentValues.put("iconPackage", bVar9.o);
                                        contentValues.put("iconResource", str2);
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
                Iterator<b> it4 = arrayListA.iterator();
                while (true) {
                    String str4 = str3;
                    if (it4.hasNext()) {
                        str3 = str4 + it4.next().a + ",";
                    } else {
                        ShellProvider.a.a(sQLiteDatabase, str4);
                        String str5 = "";
                        Iterator<b> it5 = arrayListA2.iterator();
                        while (true) {
                            String str6 = str5;
                            if (it5.hasNext()) {
                                str5 = str6 + it5.next().a + ",";
                            } else {
                                ShellProvider.a.d(sQLiteDatabase, str6);
                                ShellProvider.a.a(sQLiteDatabase);
                                try {
                                    for (ContentValues contentValues2 : contentValuesArr) {
                                        sQLiteDatabase.insert("favorites", null, contentValues2);
                                    }
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    cursorQuery.close();
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
        ArrayList<Integer> arrayListA = com.tsf.shell.utils.h.a(str, ",", false);
        int size = arrayListA.size();
        for (int i = 0; i < size; i++) {
            b bVarA = a(arrayList, arrayListA.get(i).intValue());
            if (bVarA != null) {
                arrayList2.add(bVarA);
                arrayList.remove(bVarA);
            }
        }
        if (z) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return arrayList2;
    }

    private static b a(ArrayList<b> arrayList, int i) {
        for (b bVar : arrayList) {
            if (bVar.r == i) {
                return bVar;
            }
        }
        return null;
    }
}
