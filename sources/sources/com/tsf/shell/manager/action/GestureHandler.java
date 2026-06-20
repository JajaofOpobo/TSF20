package com.tsf.shell.manager.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.view.MotionEvent;
import com.tsf.shell.manager.action.ActionDatabaseHelper;
import com.tsf.shell.manager.action.ActionModel;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GestureHandler {
    private static float c;
    private static float d;
    private static float e;
    private static float f_;
    private static float g;
    private static float h;
    private static float i;
    private static float j;
    private static ArrayList<ActionModel> l;
    private static BroadcastReceiver m;
    private static float n;
    private static float q;
    private static float r;
    private static long t;
    private static boolean a_ = false;
    private static boolean b_ = false;
    private static float k = 150.0f;
    private static boolean o = false;
    private static boolean p = false;
    private static boolean s = false;
    private static boolean u = false;

    public static void a(Context context) {
        n = com.censivn.C3DEngine.b.b.A.e * 100.0f;
        com.censivn.C3DEngine.C3DEngine.a().d(new Runnable() { // from class: com.tsf.shell.manager.action.GestureHandler.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList unused = f.l = new ArrayList();
                f.l.add(a.a(8));
                f.l.add(a.a(7));
                f.l.add(a.a(6));
                f.l.add(a.a(0));
                f.l.add(a.a(1));
                f.l.add(a.a(2));
                f.l.add(a.a(3));
                f.l.add(a.a(4));
                f.l.add(a.a(5));
                f.l.add(a.a(100));
                f.l.add(a.a(101));
            }
        });
        m = new BroadcastReceiver() { // from class: com.tsf.shell.manager.action.GestureHandler.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if ("com.tsf.shell.SET_ACTION".equals(intent.getAction())) {
                    f.b(intent.getIntExtra("gesture_action", 0), intent.getStringExtra("gesture_name"), intent.getStringExtra("gesture_url"));
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.SET_ACTION");
        context.registerReceiver(m, intentFilter);
    }

    public static void b(Context context) {
        if (m != null) {
            try {
                context.unregisterReceiver(m);
            } catch (Exception e2) {
            }
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE action (_id INTEGER PRIMARY KEY,action INTEGER,name TEXT,intent TEXT);");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + a(101, 2) + ")");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + a(100, 3) + ")");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + a(8, 11) + ")");
            sQLiteDatabase.execSQL("insert into action(action,name,intent) values(" + a(6, 500) + ")");
        } catch (Exception e2) {
        }
    }

    public static String a(int i2, int i3) {
        return i2 + ",'" + b.b(i3).b + "','tsf://" + i3 + "'";
    }

    public static ActionModel a(int i2) {
        if (l == null) {
            return new ActionModel(0, "", "");
        }
        for (ActionModel actionModel : l) {
            if (actionModel.a == i2) {
                return actionModel;
            }
        }
        return new ActionModel(0, "", "");
    }

    public static boolean b(int i2) {
        if (p || l == null) {
            return true;
        }
        for (ActionModel actionModel : l) {
            if (actionModel.a == i2) {
                return actionModel.a();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i2, String str, String str2) {
        ActionDatabaseHelper.a(i2, str, str2);
        ActionModel actionModel = a(i2);
        actionModel.b = str;
        actionModel.c = str2;
    }

    public static void a() {
        o = true;
    }

    public static void b() {
        p = true;
    }

    public static void c() {
        p = false;
    }

    public static void a(MotionEvent motionEvent) {
        q = motionEvent.getX();
        r = motionEvent.getY();
        o = false;
        s = false;
        t = System.currentTimeMillis();
        u = true;
    }

    public static void b(MotionEvent motionEvent) {
        b(8);
    }

    public static void c(MotionEvent motionEvent) {
        if (!p) {
            switch (motionEvent.getAction()) {
                case 0:
                    o = false;
                    return;
                case 1:
                    u = false;
                    break;
                case 2:
                    if (!o) {
                        if (motionEvent.getPointerCount() < 2) {
                            if (s) {
                                return;
                            }
                            if (System.currentTimeMillis() - t > 175) {
                                s = true;
                                return;
                            }
                            if (Math.abs(q - motionEvent.getX()) > 100.0f) {
                                s = true;
                                return;
                            }
                            if (Math.abs(r - motionEvent.getY()) > 100.0f) {
                                s = true;
                                if (u) {
                                    if (motionEvent.getY() > r) {
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
                        if (!a_) {
                            a_ = true;
                            b_ = false;
                            c = motionEvent.getX(0);
                            d = motionEvent.getY(0);
                            e = motionEvent.getX(1);
                            f_ = motionEvent.getY(1);
                            j = x.b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                        }
                        if (a_ && !b_) {
                            g = x.b(c, d, motionEvent.getX(0), motionEvent.getY(0));
                            h = x.b(e, f_, motionEvent.getX(1), motionEvent.getY(1));
                            i = x.b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                            if (Math.abs(g) <= k || Math.abs(h) <= k) {
                                if (Math.abs(i - j) > k) {
                                    if (i > j) {
                                        if (b(1)) {
                                            com.censivn.C3DEngine.a.d.d().k();
                                        }
                                    } else if (b(0)) {
                                        com.censivn.C3DEngine.a.d.d().k();
                                    }
                                    b_ = true;
                                    return;
                                }
                                return;
                            }
                            float fC = x.c(motionEvent.getX(0), motionEvent.getY(0), c, d);
                            float fC2 = x.c(motionEvent.getX(1), motionEvent.getY(1), e, f_);
                            int iA = a(fC);
                            if (iA == a(fC2)) {
                                switch (iA) {
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
                                b_ = true;
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
            a_ = false;
        }
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
