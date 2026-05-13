package com.tsf.shell.manager.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.action.f */
/* loaded from: classes.dex */
public class C3398f {

    /* renamed from: c */
    private static float f11234c;

    /* renamed from: d */
    private static float f11235d;

    /* renamed from: e */
    private static float f11236e;

    /* renamed from: f */
    private static float f11237f;

    /* renamed from: g */
    private static float f11238g;

    /* renamed from: h */
    private static float f11239h;

    /* renamed from: i */
    private static float f11240i;

    /* renamed from: j */
    private static float f11241j;

    /* renamed from: l */
    private static ArrayList<C3397e> f11243l;

    /* renamed from: m */
    private static BroadcastReceiver f11244m;

    /* renamed from: n */
    private static float f11245n;

    /* renamed from: q */
    private static float f11248q;

    /* renamed from: r */
    private static float f11249r;

    /* renamed from: t */
    private static long f11251t;

    /* renamed from: a */
    private static boolean f11232a = false;

    /* renamed from: b */
    private static boolean f11233b = false;

    /* renamed from: k */
    private static float f11242k = 150.0f;

    /* renamed from: o */
    private static boolean f11246o = false;

    /* renamed from: p */
    private static boolean f11247p = false;

    /* renamed from: s */
    private static boolean f11250s = false;

    /* renamed from: u */
    private static boolean f11252u = false;

    /* renamed from: a */
    public static void m2646a(Context context) {
        f11245n = C0892a.f2569e * 100.0f;
        C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.action.f.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList unused = C3398f.f11243l = new ArrayList();
                C3398f.f11243l.add(C3385a.m2673a(8));
                C3398f.f11243l.add(C3385a.m2673a(7));
                C3398f.f11243l.add(C3385a.m2673a(6));
                C3398f.f11243l.add(C3385a.m2673a(0));
                C3398f.f11243l.add(C3385a.m2673a(1));
                C3398f.f11243l.add(C3385a.m2673a(2));
                C3398f.f11243l.add(C3385a.m2673a(3));
                C3398f.f11243l.add(C3385a.m2673a(4));
                C3398f.f11243l.add(C3385a.m2673a(5));
                C3398f.f11243l.add(C3385a.m2673a(100));
                C3398f.f11243l.add(C3385a.m2673a(101));
            }
        });
        f11244m = new BroadcastReceiver() { // from class: com.tsf.shell.manager.action.f.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if ("com.tsf.shell.SET_ACTION".equals(intent.getAction())) {
                    C3398f.m2640b(intent.getIntExtra("gesture_action", 0), intent.getStringExtra("gesture_name"), intent.getStringExtra("gesture_url"));
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.SET_ACTION");
        context.registerReceiver(f11244m, intentFilter);
    }

    /* renamed from: b */
    public static void m2639b(Context context) {
        if (f11244m != null) {
            try {
                context.unregisterReceiver(f11244m);
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    public static void m2645a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE action (_id INTEGER PRIMARY KEY,action INTEGER,name TEXT,intent TEXT);");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + m2648a(101, 2) + ")");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + m2648a(100, 3) + ")");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + m2648a(8, 11) + ")");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + m2648a(6, 500) + ")");
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static String m2648a(int i, int i2) {
        return i + ",'" + C3386b.m2664b(i2).f11195b + "','tsf://" + i2 + "'";
    }

    /* renamed from: a */
    public static C3397e m2649a(int i) {
        if (f11243l == null) {
            return new C3397e(0, "", "");
        }
        Iterator<C3397e> it = f11243l.iterator();
        while (it.hasNext()) {
            C3397e next = it.next();
            if (next.f11229a == i) {
                return next;
            }
        }
        return new C3397e(0, "", "");
    }

    /* renamed from: b */
    public static boolean m2641b(int i) {
        if (f11247p || f11243l == null) {
            return true;
        }
        Iterator<C3397e> it = f11243l.iterator();
        while (it.hasNext()) {
            C3397e next = it.next();
            if (next.f11229a == i) {
                return next.m2652a();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m2640b(int i, String str, String str2) {
        C3385a.m2672a(i, str, str2);
        C3397e m2649a = m2649a(i);
        m2649a.f11230b = str;
        m2649a.f11231c = str2;
    }

    /* renamed from: a */
    public static void m2651a() {
        f11246o = true;
    }

    /* renamed from: b */
    public static void m2642b() {
        f11247p = true;
    }

    /* renamed from: c */
    public static void m2637c() {
        f11247p = false;
    }

    /* renamed from: a */
    public static void m2644a(MotionEvent motionEvent) {
        f11248q = motionEvent.getX();
        f11249r = motionEvent.getY();
        f11246o = false;
        f11250s = false;
        f11251t = System.currentTimeMillis();
        f11252u = true;
    }

    /* renamed from: b */
    public static void m2638b(MotionEvent motionEvent) {
        m2641b(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public static void m2636c(MotionEvent motionEvent) {
        if (!f11247p) {
            switch (motionEvent.getAction()) {
                case 0:
                    f11246o = false;
                    return;
                case 1:
                    f11252u = false;
                    break;
                case 2:
                    if (!f11246o) {
                        if (motionEvent.getPointerCount() < 2) {
                            if (!f11250s) {
                                if (System.currentTimeMillis() - f11251t > 175) {
                                    f11250s = true;
                                    return;
                                } else if (Math.abs(f11248q - motionEvent.getX()) > 100.0f) {
                                    f11250s = true;
                                    return;
                                } else if (Math.abs(f11249r - motionEvent.getY()) > 100.0f) {
                                    f11250s = true;
                                    if (f11252u) {
                                        if (motionEvent.getY() > f11249r) {
                                            m2641b(6);
                                            return;
                                        } else {
                                            m2641b(7);
                                            return;
                                        }
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (!f11232a) {
                            f11232a = true;
                            f11233b = false;
                            f11234c = motionEvent.getX(0);
                            f11235d = motionEvent.getY(0);
                            f11236e = motionEvent.getX(1);
                            f11237f = motionEvent.getY(1);
                            f11241j = C4189x.m594b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                        }
                        if (f11232a && !f11233b) {
                            f11238g = C4189x.m594b(f11234c, f11235d, motionEvent.getX(0), motionEvent.getY(0));
                            f11239h = C4189x.m594b(f11236e, f11237f, motionEvent.getX(1), motionEvent.getY(1));
                            f11240i = C4189x.m594b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                            if (Math.abs(f11238g) > f11242k && Math.abs(f11239h) > f11242k) {
                                float m589c = C4189x.m589c(motionEvent.getX(0), motionEvent.getY(0), f11234c, f11235d);
                                float m589c2 = C4189x.m589c(motionEvent.getX(1), motionEvent.getY(1), f11236e, f11237f);
                                int m2650a = m2650a(m589c);
                                if (m2650a == m2650a(m589c2)) {
                                    switch (m2650a) {
                                        case 0:
                                            m2641b(2);
                                            break;
                                        case 1:
                                            m2641b(3);
                                            break;
                                        case 2:
                                            m2641b(4);
                                            break;
                                        case 3:
                                            m2641b(5);
                                            break;
                                    }
                                    f11233b = true;
                                    return;
                                }
                                return;
                            } else if (Math.abs(f11240i - f11241j) > f11242k) {
                                if (f11240i > f11241j) {
                                    if (m2641b(1)) {
                                        C0864d.m10805d().m10788k();
                                    }
                                } else if (m2641b(0)) {
                                    C0864d.m10805d().m10788k();
                                }
                                f11233b = true;
                                return;
                            } else {
                                return;
                            }
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
            f11232a = false;
        }
    }

    /* renamed from: a */
    private static int m2650a(float f) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        if (f >= 315.0f || f < 45.0f) {
            return 0;
        }
        if (f >= 45.0f && f < 135.0f) {
            return 2;
        }
        if (f >= 135.0f && f < 225.0f) {
            return 1;
        }
        return 3;
    }
}
