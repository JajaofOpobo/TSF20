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
import com.tsf.shell.R;
import com.tsf.shell.activity.actionselector.ActionSelector;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f {
    public ArrayList a = new ArrayList();
    public ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public com.tsf.shell.activity.actionselector.c e;
    public com.tsf.shell.activity.actionselector.c f;
    public com.tsf.shell.activity.actionselector.c g;
    public com.tsf.shell.activity.actionselector.c h;
    public ActionSelector i;
    public Handler j;
    private Handler k;
    private HandlerThread l;

    public f(ActionSelector actionSelector) {
        this.i = actionSelector;
        e(actionSelector);
    }

    public ArrayList a(final Context context) {
        if (this.a.size() == 0) {
            this.k.post(new Runnable() { // from class: com.tsf.shell.manager.action.f.1
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
                        if (f.this.f != null) {
                            f.this.j.post(new Runnable() { // from class: com.tsf.shell.manager.action.f.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    f.this.a.addAll(arrayList);
                                    f.this.f.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            });
        }
        return this.a;
    }

    public ArrayList b(Context context) {
        if (this.c.size() == 0) {
            Iterator it = b.a(true).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.a != 100 && cVar.a != 1400) {
                    HashMap hashMap = new HashMap();
                    Drawable drawable = null;
                    try {
                        drawable = context.getResources().getDrawable(cVar.c);
                    } catch (Exception e) {
                    }
                    if (drawable == null) {
                        drawable = context.getResources().getDrawable(R.drawable.sym_def_app_icon);
                    }
                    hashMap.put("icon", drawable);
                    hashMap.put("appName", cVar.b);
                    hashMap.put("action", Integer.valueOf(cVar.a));
                    this.c.add(hashMap);
                }
            }
            if (this.g != null) {
                this.g.notifyDataSetChanged();
            }
        }
        return this.c;
    }

    public ArrayList c(Context context) {
        if (this.d.size() == 0) {
            Iterator it = com.tsf.shell.manager.action.toggle.a.d().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                HashMap hashMap = new HashMap();
                Drawable drawable = null;
                try {
                    drawable = context.getResources().getDrawable(cVar.c);
                } catch (Exception e) {
                }
                if (drawable == null) {
                    drawable = context.getResources().getDrawable(R.drawable.sym_def_app_icon);
                }
                hashMap.put("icon", drawable);
                hashMap.put("appName", cVar.b);
                hashMap.put("action", Integer.valueOf(cVar.a));
                this.d.add(hashMap);
            }
            if (this.h != null) {
                this.h.notifyDataSetChanged();
            }
        }
        return this.d;
    }

    public ArrayList d(final Context context) {
        if (this.b.size() == 0) {
            this.k.post(new Runnable() { // from class: com.tsf.shell.manager.action.f.2
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
                        if (f.this.e != null) {
                            f.this.j.post(new Runnable() { // from class: com.tsf.shell.manager.action.f.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    f.this.b.addAll(arrayList);
                                    f.this.e.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            });
        }
        return this.b;
    }

    public Intent a(Intent intent, String str, String str2, String str3) {
        Intent intent2 = new Intent(intent);
        if (str2 != null && str3 != null) {
            intent2.setClassName(str2, str3);
        } else {
            intent2.setAction("android.intent.action.CREATE_SHORTCUT");
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        }
        return intent2;
    }

    public void a(int i, int i2) {
        HashMap hashMap;
        Intent intent;
        switch (i) {
            case 0:
                hashMap = (HashMap) this.a.get(i2);
                break;
            case 1:
                hashMap = (HashMap) this.c.get(i2);
                break;
            case 2:
                hashMap = (HashMap) this.d.get(i2);
                break;
            case 3:
                hashMap = (HashMap) this.b.get(i2);
                break;
            default:
                hashMap = null;
                break;
        }
        if (hashMap != null) {
            if (i == 1 || i == 2) {
                intent = new Intent(this.i.g());
                intent.putExtra("action", (Integer) hashMap.get("action"));
            } else {
                intent = a(this.i.g(), (String) hashMap.get("appName"), (String) hashMap.get("packageName"), (String) hashMap.get("className"));
            }
            if (this.i.h()) {
                intent.putExtra("action_icon", x.a((Drawable) hashMap.get("icon"), 60, 60));
            }
            intent.putExtra("action_type", i);
            intent.putExtra("action_name", (String) hashMap.get("appName"));
            this.i.setResult(-1, intent);
            this.i.finish();
        }
    }

    private void e(Context context) {
        if (this.j == null) {
            this.j = new Handler(Looper.getMainLooper());
            this.l = new HandlerThread("Action Database Operating");
            this.l.start();
            this.k = new Handler(this.l.getLooper());
            b(context);
            a(context);
            d(context);
            c(context);
            this.e = new com.tsf.shell.activity.actionselector.c(context, this.b, R.layout.action_selector_lists, new String[]{"icon", "appName"}, new int[]{R.id.icon, R.id.appName});
            this.f = new com.tsf.shell.activity.actionselector.c(context, this.a, R.layout.action_selector_lists, new String[]{"icon", "appName"}, new int[]{R.id.icon, R.id.appName});
            this.g = new com.tsf.shell.activity.actionselector.c(context, this.c, R.layout.action_selector_lists, new String[]{"icon", "appName"}, new int[]{R.id.icon, R.id.appName});
            this.h = new com.tsf.shell.activity.actionselector.c(context, this.d, R.layout.action_selector_lists, new String[]{"icon", "appName"}, new int[]{R.id.icon, R.id.appName});
        }
    }

    public com.tsf.shell.activity.actionselector.c a(int i) {
        switch (i) {
            case 0:
                return this.f;
            case 1:
                return this.g;
            case 2:
                return this.h;
            case 3:
                return this.e;
            default:
                return null;
        }
    }
}
