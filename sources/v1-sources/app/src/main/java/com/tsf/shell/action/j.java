package com.tsf.shell.action;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {
    public static ArrayList a = new ArrayList();
    public static ArrayList b = new ArrayList();
    public static ArrayList c = new ArrayList();
    public static o d;
    public static o e;
    public static o f;
    public static ActionSelector g;
    public static Handler h;
    private static Handler i;
    private static HandlerThread j;

    public static void a() {
        a.clear();
        b.clear();
        c.clear();
        d.a();
        d = null;
        e.a();
        e = null;
        f.a();
        f = null;
    }

    public static void a(ActionSelector actionSelector) {
        g = actionSelector;
    }

    private static ArrayList b(Context context) {
        if (c.size() == 0) {
            if (r.a == null) {
                ArrayList arrayList = new ArrayList();
                r.a = arrayList;
                arrayList.add(new q(context, 0));
                r.a.add(new q(context, 11));
                r.a.add(new q(context, 1));
                r.a.add(new q(context, 2));
                r.a.add(new q(context, 3));
                r.a.add(new q(context, 4));
                r.a.add(new q(context, 5));
                r.a.add(new q(context, 10));
                r.a.add(new q(context, 6));
                r.a.add(new q(context, 7));
                r.a.add(new q(context, 8));
                r.a.add(new q(context, 9));
            }
            Iterator it = r.a.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                HashMap hashMap = new HashMap();
                hashMap.put("icon", context.getResources().getDrawable(qVar.b));
                hashMap.put("appName", qVar.c);
                hashMap.put("action", Integer.valueOf(qVar.a));
                c.add(hashMap);
            }
            if (f != null) {
                f.notifyDataSetChanged();
            }
        }
        return c;
    }

    public static void a(int i2, int i3) {
        HashMap hashMap;
        Intent intent;
        switch (i2) {
            case 0:
                hashMap = (HashMap) a.get(i3);
                break;
            case 1:
                hashMap = (HashMap) c.get(i3);
                break;
            case 2:
                hashMap = (HashMap) b.get(i3);
                break;
            default:
                hashMap = null;
                break;
        }
        if (hashMap != null) {
            if (i2 == 1) {
                intent = new Intent(g.e());
                intent.putExtra("action", (Integer) hashMap.get("action"));
            } else {
                Intent e2 = g.e();
                String str = (String) hashMap.get("appName");
                String str2 = (String) hashMap.get("packageName");
                String str3 = (String) hashMap.get("className");
                Intent intent2 = new Intent(e2);
                if (str2 == null || str3 == null) {
                    intent2.setAction("android.intent.action.CREATE_SHORTCUT");
                    intent2.putExtra("android.intent.extra.shortcut.NAME", str);
                } else {
                    intent2.setClassName(str2, str3);
                }
                intent = intent2;
            }
            if (g.f()) {
                Drawable drawable = (Drawable) hashMap.get("icon");
                Bitmap createBitmap = Bitmap.createBitmap(60, 60, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, 60, 60);
                drawable.draw(canvas);
                intent.putExtra("action_icon", createBitmap);
            }
            intent.putExtra("action_type", i2);
            intent.putExtra("action_name", (String) hashMap.get("appName"));
            g.setResult(-1, intent);
            g.finish();
        }
    }

    public static void a(Context context) {
        if (h == null) {
            h = new Handler(Looper.getMainLooper());
            HandlerThread handlerThread = new HandlerThread("Action Database Operating");
            j = handlerThread;
            handlerThread.start();
            i = new Handler(j.getLooper());
            b(context);
            if (a.size() == 0) {
                i.post(new k(context));
            }
            ArrayList arrayList = a;
            if (b.size() == 0) {
                i.post(new m(context));
            }
            ArrayList arrayList2 = b;
            d = new o(context, b, new String[]{"icon", "appName"}, new int[]{R.id.icon, R.id.appName});
            e = new o(context, a, new String[]{"icon", "appName"}, new int[]{R.id.icon, R.id.appName});
            f = new o(context, c, new String[]{"icon", "appName"}, new int[]{R.id.icon, R.id.appName});
        }
    }

    public static o a(int i2) {
        switch (i2) {
            case 0:
                return e;
            case 1:
                return f;
            case 2:
                return d;
            default:
                return null;
        }
    }
}
