package com.tsf.shell.manager.action;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tsf.C1306b;
import com.tsf.shell.activity.actionselector.ActionSelector;
import com.tsf.shell.activity.actionselector.C2219a;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.action.toggle.C3403a;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.shell.manager.action.d */
/* loaded from: classes.dex */
public class C3392d {

    /* renamed from: a */
    public ArrayList<HashMap<String, Object>> f11209a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<HashMap<String, Object>> f11210b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<HashMap<String, Object>> f11211c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<HashMap<String, Object>> f11212d = new ArrayList<>();

    /* renamed from: e */
    public C2219a f11213e;

    /* renamed from: f */
    public C2219a f11214f;

    /* renamed from: g */
    public C2219a f11215g;

    /* renamed from: h */
    public C2219a f11216h;

    /* renamed from: i */
    public ActionSelector f11217i;

    /* renamed from: j */
    public Handler f11218j;

    /* renamed from: k */
    private Handler f11219k;

    /* renamed from: l */
    private HandlerThread f11220l;

    public C3392d(ActionSelector actionSelector) {
        this.f11217i = actionSelector;
        m2653e(actionSelector);
    }

    /* renamed from: a */
    public ArrayList<HashMap<String, Object>> m2658a(final Context context) {
        if (this.f11209a.size() == 0) {
            this.f11219k.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.1
                @Override // java.lang.Runnable
                public void run() {
                    PackageManager packageManager = context.getPackageManager();
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                    if (queryIntentActivities != null) {
                        final ArrayList arrayList = new ArrayList();
                        if (queryIntentActivities != null) {
                            for (ResolveInfo resolveInfo : queryIntentActivities) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("icon", resolveInfo.activityInfo.loadIcon(packageManager));
                                hashMap.put("appName", resolveInfo.activityInfo.loadLabel(packageManager));
                                hashMap.put("packageName", resolveInfo.activityInfo.applicationInfo.packageName);
                                hashMap.put("className", resolveInfo.activityInfo.name);
                                arrayList.add(hashMap);
                            }
                        }
                        if (C3392d.this.f11214f != null) {
                            C3392d.this.f11218j.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C3392d.this.f11209a.addAll(arrayList);
                                    C3392d.this.f11214f.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            });
        }
        return this.f11209a;
    }

    /* renamed from: b */
    public ArrayList<HashMap<String, Object>> m2656b(Context context) {
        if (this.f11211c.size() == 0) {
            Iterator<C3386b.C3389a> it = C3386b.m2665a(true).iterator();
            while (it.hasNext()) {
                C3386b.C3389a next = it.next();
                if (next.f11194a != 100 && next.f11194a != 1400) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    Drawable drawable = null;
                    try {
                        drawable = context.getResources().getDrawable(next.f11196c);
                    } catch (Exception e) {
                    }
                    if (drawable == null) {
                        drawable = context.getResources().getDrawable(C1306b.C1310d.sym_def_app_icon);
                    }
                    hashMap.put("icon", drawable);
                    hashMap.put("appName", next.f11195b);
                    hashMap.put("action", Integer.valueOf(next.f11194a));
                    this.f11211c.add(hashMap);
                }
            }
            if (this.f11215g != null) {
                this.f11215g.notifyDataSetChanged();
            }
        }
        return this.f11211c;
    }

    /* renamed from: c */
    public ArrayList<HashMap<String, Object>> m2655c(Context context) {
        if (this.f11212d.size() == 0) {
            Iterator<C3386b.C3389a> it = C3403a.m2624d().iterator();
            while (it.hasNext()) {
                C3386b.C3389a next = it.next();
                HashMap<String, Object> hashMap = new HashMap<>();
                Drawable drawable = null;
                try {
                    drawable = context.getResources().getDrawable(next.f11196c);
                } catch (Exception e) {
                }
                if (drawable == null) {
                    drawable = context.getResources().getDrawable(C1306b.C1310d.sym_def_app_icon);
                }
                hashMap.put("icon", drawable);
                hashMap.put("appName", next.f11195b);
                hashMap.put("action", Integer.valueOf(next.f11194a));
                this.f11212d.add(hashMap);
            }
            if (this.f11216h != null) {
                this.f11216h.notifyDataSetChanged();
            }
        }
        return this.f11212d;
    }

    /* renamed from: d */
    public ArrayList<HashMap<String, Object>> m2654d(final Context context) {
        if (this.f11210b.size() == 0) {
            this.f11219k.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.2
                @Override // java.lang.Runnable
                public void run() {
                    PackageManager packageManager = context.getPackageManager();
                    List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
                    if (queryIntentActivities != null) {
                        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
                        final ArrayList arrayList = new ArrayList();
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            HashMap hashMap = new HashMap();
                            if (resolveInfo.loadLabel(packageManager) == null && resolveInfo.activityInfo != null) {
                                String str = resolveInfo.activityInfo.name;
                            }
                            CharSequence loadLabel = resolveInfo.activityInfo.loadLabel(packageManager);
                            String charSequence = loadLabel == null ? "" : loadLabel.toString();
                            hashMap.put("icon", resolveInfo.activityInfo.loadIcon(packageManager));
                            hashMap.put("appName", charSequence);
                            hashMap.put("packageName", resolveInfo.activityInfo.applicationInfo.packageName);
                            hashMap.put("className", resolveInfo.activityInfo.name);
                            arrayList.add(hashMap);
                        }
                        if (C3392d.this.f11213e != null) {
                            C3392d.this.f11218j.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C3392d.this.f11210b.addAll(arrayList);
                                    C3392d.this.f11213e.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            });
        }
        return this.f11210b;
    }

    /* renamed from: a */
    public Intent m2657a(Intent intent, String str, String str2, String str3) {
        Intent intent2 = new Intent(intent);
        if (str2 != null && str3 != null) {
            intent2.setClassName(str2, str3);
        } else {
            intent2.setAction("android.intent.action.CREATE_SHORTCUT");
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        }
        return intent2;
    }

    /* renamed from: a */
    public void m2659a(int i, int i2) {
        HashMap<String, Object> hashMap;
        Intent intent;
        switch (i) {
            case 0:
                hashMap = this.f11209a.get(i2);
                break;
            case 1:
                hashMap = this.f11211c.get(i2);
                break;
            case 2:
                hashMap = this.f11212d.get(i2);
                break;
            case 3:
                hashMap = this.f11210b.get(i2);
                break;
            default:
                hashMap = null;
                break;
        }
        if (hashMap != null) {
            if (i == 1 || i == 2) {
                intent = new Intent(this.f11217i.m6074g());
                intent.putExtra("action", (Integer) hashMap.get("action"));
            } else {
                intent = m2657a(this.f11217i.m6074g(), (String) hashMap.get("appName"), (String) hashMap.get("packageName"), (String) hashMap.get("className"));
            }
            if (this.f11217i.m6073h()) {
                intent.putExtra("action_icon", C4189x.m602a((Drawable) hashMap.get("icon"), 60, 60));
            }
            intent.putExtra("action_type", i);
            intent.putExtra("action_name", (String) hashMap.get("appName"));
            this.f11217i.setResult(-1, intent);
            this.f11217i.finish();
        }
    }

    /* renamed from: e */
    private void m2653e(Context context) {
        if (this.f11218j == null) {
            this.f11218j = new Handler(Looper.getMainLooper());
            this.f11220l = new HandlerThread("Action Database Operating");
            this.f11220l.start();
            this.f11219k = new Handler(this.f11220l.getLooper());
            m2656b(context);
            m2658a(context);
            m2654d(context);
            m2655c(context);
            this.f11213e = new C2219a(context, this.f11210b, C1306b.C1313g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{C1306b.C1311e.icon, C1306b.C1311e.appName});
            this.f11214f = new C2219a(context, this.f11209a, C1306b.C1313g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{C1306b.C1311e.icon, C1306b.C1311e.appName});
            this.f11215g = new C2219a(context, this.f11211c, C1306b.C1313g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{C1306b.C1311e.icon, C1306b.C1311e.appName});
            this.f11216h = new C2219a(context, this.f11212d, C1306b.C1313g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{C1306b.C1311e.icon, C1306b.C1311e.appName});
        }
    }

    /* renamed from: a */
    public C2219a m2660a(int i) {
        switch (i) {
            case 0:
                return this.f11214f;
            case 1:
                return this.f11215g;
            case 2:
                return this.f11216h;
            case 3:
                return this.f11213e;
            default:
                return null;
        }
    }
}
