package com.tsf.shell;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        a(sQLiteDatabase, b(sQLiteDatabase), c(sQLiteDatabase), d(sQLiteDatabase));
    }

    private static ArrayList b(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = sQLiteDatabase.query("folders", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("appWidgetId");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("title");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("child");
            while (query.moveToNext()) {
                f fVar = new f();
                fVar.a = query.getInt(columnIndexOrThrow);
                fVar.b = query.getString(columnIndexOrThrow2);
                fVar.c = query.getString(columnIndexOrThrow3);
                arrayList.add(fVar);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    private static d c(SQLiteDatabase sQLiteDatabase) {
        d dVar = new d();
        dVar.a = "";
        try {
            Cursor query = sQLiteDatabase.query("dock", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("child");
            if (query.moveToNext()) {
                dVar.a = query.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return dVar;
    }

    private static d d(SQLiteDatabase sQLiteDatabase) {
        d dVar = new d();
        dVar.a = "";
        try {
            Cursor query = sQLiteDatabase.query("quicklaunch", null, null, null, null, null, null);
            int columnIndexOrThrow = query.getColumnIndexOrThrow("child");
            if (query.moveToNext()) {
                dVar.a = query.getString(columnIndexOrThrow);
            }
        } catch (Exception e) {
        }
        return dVar;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, ArrayList arrayList, d dVar, d dVar2) {
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
            e eVar = new e();
            eVar.b = query.getString(columnIndexOrThrow4);
            eVar.l = query.getInt(columnIndexOrThrow6);
            eVar.r = query.getInt(columnIndexOrThrow);
            eVar.n = query.getString(columnIndexOrThrow2);
            if (eVar.l == 1) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    f fVar = (f) it.next();
                    if (fVar.a == eVar.r) {
                        eVar.b = fVar.b;
                        eVar.n = fVar.c;
                        eVar.s = new ArrayList();
                        z = true;
                        break;
                    }
                }
                if (z) {
                }
            }
            eVar.c = query.getString(columnIndexOrThrow3);
            eVar.d = query.getInt(columnIndexOrThrow5);
            eVar.e = query.getInt(columnIndexOrThrow7);
            eVar.f = query.getString(columnIndexOrThrow8);
            eVar.g = query.getString(columnIndexOrThrow9);
            eVar.h = query.getString(columnIndexOrThrow10);
            eVar.i = query.getString(columnIndexOrThrow11);
            eVar.j = query.getString(columnIndexOrThrow12);
            eVar.k = query.getString(columnIndexOrThrow16);
            eVar.m = query.getBlob(columnIndexOrThrow17);
            eVar.o = query.getString(columnIndexOrThrow13);
            eVar.p = query.getString(columnIndexOrThrow14);
            eVar.q = query.getInt(columnIndexOrThrow15);
            if (eVar.l == 1) {
                arrayList3.add(eVar);
            } else {
                arrayList2.add(eVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            arrayList4.clear();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                e eVar3 = (e) it3.next();
                if (eVar3.e == eVar2.r) {
                    if (eVar3.l == 2 || eVar3.l == 7) {
                        eVar2.s.add(eVar3);
                    }
                    arrayList4.add(eVar3);
                }
                eVar3.r = -1;
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList2.remove((e) it4.next());
            }
            eVar2.s = a(eVar2.s, eVar2.n, ",", true);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            e eVar4 = (e) it5.next();
            switch (eVar4.d) {
                case -4:
                    eVar4.d = -3;
                    eVar4.e = 0;
                    arrayList5.add(eVar4);
                    break;
                case -2:
                    eVar4.e = 0;
                    arrayList6.add(eVar4);
                    break;
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            e eVar5 = (e) it6.next();
            switch (eVar5.d) {
                case -4:
                    eVar5.d = -3;
                    eVar5.e = 0;
                    arrayList5.add(eVar5);
                    break;
                case -2:
                    eVar5.e = 0;
                    arrayList6.add(eVar5);
                    break;
            }
        }
        ArrayList a = a(arrayList5, dVar.a, ",", true);
        ArrayList a2 = a(arrayList6, dVar2.a, ",", true);
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        int i = 1;
        while (it7.hasNext()) {
            e eVar6 = (e) it7.next();
            arrayList7.add(eVar6);
            eVar6.a = i;
            int size = eVar6.s.size();
            String str = "";
            int i2 = i + 1;
            for (int i3 = 0; i3 < size; i3++) {
                e eVar7 = (e) eVar6.s.get((size - i3) - 1);
                eVar7.e = 0;
                eVar7.d = i;
                arrayList7.add(eVar7);
                eVar7.a = i2;
                str = String.valueOf(str) + i2 + ",";
                i2++;
            }
            eVar6.n = str;
            eVar6.s.clear();
            i = i2;
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            e eVar8 = (e) it8.next();
            arrayList7.add(eVar8);
            eVar8.a = i;
            i++;
        }
        ContentValues[] contentValuesArr = new ContentValues[arrayList7.size()];
        int i4 = 0;
        Iterator it9 = arrayList7.iterator();
        while (true) {
            int i5 = i4;
            if (it9.hasNext()) {
                e eVar9 = (e) it9.next();
                ContentValues contentValues = new ContentValues(query.getColumnCount());
                contentValues.put("title", eVar9.b);
                contentValues.put("itemType", Integer.valueOf(eVar9.l));
                switch (eVar9.l) {
                    case 2:
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.setComponent(new ComponentName(eVar9.o, eVar9.p));
                        intent.setFlags(270532608);
                        contentValues.put("intent", intent.toUri(0));
                        break;
                    case 3:
                        contentValues.put("appWidgetId", Integer.valueOf(eVar9.r));
                        contentValues.put("appWidgetProvider", String.valueOf(eVar9.o) + "/" + eVar9.p);
                        break;
                    case 5:
                        eVar9.o = com.tsf.shell.manager.r.c.g.a(eVar9);
                        contentValues.put("packagename", eVar9.o);
                        contentValues.put("classname", eVar9.p);
                        break;
                    case 7:
                        contentValues.put("intent", eVar9.c);
                        break;
                    case 8:
                        eVar9.l = 7;
                        Intent intent2 = new Intent();
                        int i6 = 0;
                        try {
                            i6 = Integer.parseInt(eVar9.p);
                        } catch (Exception e) {
                        }
                        intent2.putExtra("action", i6);
                        eVar9.c = intent2.toUri(0);
                        eVar9.p = "";
                        contentValues.put("intent", eVar9.c);
                        contentValues.put("itemType", Integer.valueOf(eVar9.l));
                        break;
                }
                if (eVar9.l == 7 || eVar9.l == 2) {
                    boolean z2 = false;
                    try {
                        String[] split = eVar9.n.split(",");
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
                                        contentValues.put("iconPackage", eVar9.o);
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
                    eVar9.n = "";
                }
                contentValues.put("container", Integer.valueOf(eVar9.d));
                contentValues.put("screen", Integer.valueOf(eVar9.e));
                contentValues.put("cellX", eVar9.f);
                contentValues.put("cellY", eVar9.g);
                contentValues.put("rotation", eVar9.h);
                contentValues.put("spanX", eVar9.i);
                contentValues.put("spanY", eVar9.j);
                contentValues.put("scale", eVar9.k);
                contentValues.put("internal", Integer.valueOf(eVar9.q));
                contentValues.put("icon", eVar9.m);
                contentValues.put("config", eVar9.n);
                i4 = i5 + 1;
                contentValuesArr[i5] = contentValues;
            } else {
                String str3 = "";
                Iterator it10 = a.iterator();
                while (true) {
                    String str4 = str3;
                    if (it10.hasNext()) {
                        str3 = String.valueOf(str4) + ((e) it10.next()).a + ",";
                    } else {
                        m.a(sQLiteDatabase, str4);
                        String str5 = "";
                        Iterator it11 = a2.iterator();
                        while (true) {
                            String str6 = str5;
                            if (it11.hasNext()) {
                                str5 = String.valueOf(str6) + ((e) it11.next()).a + ",";
                            } else {
                                m.d(sQLiteDatabase, str6);
                                m.a(sQLiteDatabase);
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

    public static ArrayList a(ArrayList arrayList, String str, String str2, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList a = com.tsf.shell.utils.h.a(str, ",", false);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            e a2 = a(arrayList, ((Integer) a.get(i)).intValue());
            if (a2 != null) {
                arrayList2.add(a2);
                arrayList.remove(a2);
            }
        }
        if (z) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return arrayList2;
    }

    private static e a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.r == i) {
                return eVar;
            }
        }
        return null;
    }
}
