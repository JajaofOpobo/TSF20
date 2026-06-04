package com.tsf.shell.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.bx;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {
    private static float c;
    private static float d;
    private static float e;
    private static float f;
    private static float g;
    private static float h;
    private static float i;
    private static float j;
    private static ArrayList l;
    private static float n;
    private static float o;
    private static long q;
    private static boolean a = false;
    private static boolean b = false;
    private static float k = 150.0f;
    private static boolean m = false;
    private static boolean p = false;
    private static boolean r = false;

    public static void a(Context context) {
        ArrayList arrayList = new ArrayList();
        l = arrayList;
        arrayList.add(a.a(8));
        l.add(a.a(7));
        l.add(a.a(6));
        l.add(a.a(0));
        l.add(a.a(1));
        l.add(a.a(2));
        l.add(a.a(3));
        l.add(a.a(4));
        l.add(a.a(5));
        l.add(a.a(100));
        l.add(a.a(VEasing.Circ.easeOut));
        d dVar = new d();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.SET_ACTION");
        context.registerReceiver(dVar, intentFilter);
    }

    public static void a(Context context, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE action (_id INTEGER PRIMARY KEY,action INTEGER,name TEXT,intent TEXT);");
        sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + r.a(context, 100, 3) + ")");
        sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + r.a(context, VEasing.Circ.easeOut, 2) + ")");
        sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + r.a(context, 4, 6) + ")");
        sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + r.a(context, 5, 6) + ")");
        sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + r.a(context, 0, 9) + ")");
        sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + r.a(context, 8, 11) + ")");
    }

    public static b a(int i2) {
        if (l == null) {
            return new b(0, "", "");
        }
        Iterator it = l.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == i2) {
                return bVar;
            }
        }
        return new b(0, "", "");
    }

    public static boolean b(int i2) {
        Iterator it = l.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == i2) {
                return bVar.a();
            }
        }
        return false;
    }

    static /* synthetic */ void a(int i2, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        contentValues.put("action", Integer.valueOf(i2));
        contentValues.put("name", str);
        contentValues.put("intent", str2);
        Cursor query = contentResolver.query(bx.b, new String[]{"action", "_id"}, "action=" + i2, null, "_id desc");
        if (query.moveToFirst()) {
            contentResolver.update(bx.a(query.getInt(query.getColumnIndex("_id"))), contentValues, null, null);
        } else {
            contentResolver.insert(bx.b, contentValues);
        }
        query.close();
        b a2 = a(i2);
        a2.b = str;
        a2.c = str2;
    }

    public static void a() {
        m = true;
    }

    public static void a(MotionEvent motionEvent) {
        n = motionEvent.getX();
        o = motionEvent.getY();
        m = false;
        p = false;
        q = System.currentTimeMillis();
        r = true;
    }

    public static void b(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                m = false;
                return;
            case 1:
                r = false;
                break;
            case 2:
                if (!m) {
                    if (motionEvent.getPointerCount() < 2) {
                        if (p) {
                            return;
                        }
                        if (System.currentTimeMillis() - q > 175) {
                            p = true;
                            return;
                        }
                        if (Math.abs(n - motionEvent.getX()) > 100.0f) {
                            p = true;
                            return;
                        }
                        if (Math.abs(o - motionEvent.getY()) > 100.0f) {
                            p = true;
                            if (r) {
                                if (motionEvent.getY() > o) {
                                    b(6);
                                    return;
                                } else {
                                    b(7);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (!a) {
                        a = true;
                        b = false;
                        c = motionEvent.getX(0);
                        d = motionEvent.getY(0);
                        e = motionEvent.getX(1);
                        f = motionEvent.getY(1);
                        j = com.censivn.C3DEngine.h.a.b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                    }
                    if (a && !b) {
                        g = com.censivn.C3DEngine.h.a.b(c, d, motionEvent.getX(0), motionEvent.getY(0));
                        h = com.censivn.C3DEngine.h.a.b(e, f, motionEvent.getX(1), motionEvent.getY(1));
                        i = com.censivn.C3DEngine.h.a.b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                        if (Math.abs(g) <= k || Math.abs(h) <= k) {
                            if (Math.abs(i - j) > k) {
                                if (i > j) {
                                    if (b(1)) {
                                        com.censivn.C3DEngine.b.m.d().i();
                                    }
                                } else if (b(0)) {
                                    com.censivn.C3DEngine.b.m.d().i();
                                }
                                b = true;
                                return;
                            }
                            return;
                        }
                        float c2 = com.censivn.C3DEngine.h.a.c(motionEvent.getX(0), motionEvent.getY(0), c, d);
                        float c3 = com.censivn.C3DEngine.h.a.c(motionEvent.getX(1), motionEvent.getY(1), e, f);
                        int a2 = a(c2);
                        if (a2 == a(c3)) {
                            switch (a2) {
                                case 0:
                                    b(2);
                                    break;
                                case 1:
                                    b(3);
                                    break;
                                case 2:
                                    b(4);
                                    break;
                                case 3:
                                    b(5);
                                    break;
                            }
                            b = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
            case 6:
                break;
        }
        a = false;
    }

    private static int a(float f2) {
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        if (f2 >= 315.0f || f2 < 45.0f) {
            return 0;
        }
        if (f2 >= 45.0f && f2 < 135.0f) {
            return 2;
        }
        if (f2 >= 135.0f && f2 < 225.0f) {
            return 1;
        }
        return 3;
    }
}
