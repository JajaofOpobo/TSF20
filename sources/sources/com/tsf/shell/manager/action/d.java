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
import com.tsf.b;
import com.tsf.shell.activity.actionselector.ActionSelector;
import com.tsf.shell.manager.action.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    public ArrayList<HashMap<String, Object>> a = new ArrayList<>();
    public ArrayList<HashMap<String, Object>> b = new ArrayList<>();
    public ArrayList<HashMap<String, Object>> c = new ArrayList<>();
    public ArrayList<HashMap<String, Object>> d = new ArrayList<>();
    public com.tsf.shell.activity.actionselector.a e;
    public com.tsf.shell.activity.actionselector.a f;
    public com.tsf.shell.activity.actionselector.a g;
    public com.tsf.shell.activity.actionselector.a h;
    public ActionSelector i;
    public Handler j;
    private Handler k;
    private HandlerThread l;

    public d(ActionSelector actionSelector) {
        this.i = actionSelector;
        e(actionSelector);
    }

    public ArrayList<HashMap<String, Object>> a(final Context context) {
        if (this.a.size() == 0) {
            this.k.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.1
                @Override // java.lang.Runnable
                public void run() {
                    PackageManager packageManager = context.getPackageManager();
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                    if (listQueryIntentActivities != null) {
                        final ArrayList arrayList = new ArrayList();
                        if (listQueryIntentActivities != null) {
                            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                                HashMap map = new HashMap();
                                map.put("icon", resolveInfo.activityInfo.loadIcon(packageManager));
                                map.put("appName", resolveInfo.activityInfo.loadLabel(packageManager));
                                map.put("packageName", resolveInfo.activityInfo.applicationInfo.packageName);
                                map.put("className", resolveInfo.activityInfo.name);
                                arrayList.add(map);
                            }
                        }
                        if (d.this.f != null) {
                            d.this.j.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    d.this.a.addAll(arrayList);
                                    d.this.f.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            });
        }
        return this.a;
    }

    public ArrayList<HashMap<String, Object>> b(Context context) {
        if (this.c.size() == 0) {
            for (b.a aVar : b.a(true)) {
                if (aVar.a != 100 && aVar.a != 1400) {
                    HashMap<String, Object> map = new HashMap<>();
                    Drawable drawable = null;
                    try {
                        drawable = context.getResources().getDrawable(aVar.c);
                    } catch (Exception e) {
                    }
                    if (drawable == null) {
                        drawable = context.getResources().getDrawable(b.d.sym_def_app_icon);
                    }
                    map.put("icon", drawable);
                    map.put("appName", aVar.b);
                    map.put("action", Integer.valueOf(aVar.a));
                    this.c.add(map);
                }
            }
            if (this.g != null) {
                this.g.notifyDataSetChanged();
            }
        }
        return this.c;
    }

    public ArrayList<HashMap<String, Object>> c(Context context) {
        if (this.d.size() == 0) {
            for (b.a aVar : com.tsf.shell.manager.action.toggle.a.d()) {
                HashMap<String, Object> map = new HashMap<>();
                Drawable drawable = null;
                try {
                    drawable = context.getResources().getDrawable(aVar.c);
                } catch (Exception e) {
                }
                if (drawable == null) {
                    drawable = context.getResources().getDrawable(b.d.sym_def_app_icon);
                }
                map.put("icon", drawable);
                map.put("appName", aVar.b);
                map.put("action", Integer.valueOf(aVar.a));
                this.d.add(map);
            }
            if (this.h != null) {
                this.h.notifyDataSetChanged();
            }
        }
        return this.d;
    }

    public ArrayList<HashMap<String, Object>> d(final Context context) {
        if (this.b.size() == 0) {
            this.k.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.2
                @Override // java.lang.Runnable
                public void run() {
                    PackageManager packageManager = context.getPackageManager();
                    List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
                    if (listQueryIntentActivities != null) {
                        Collections.sort(listQueryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
                        final ArrayList arrayList = new ArrayList();
                        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                            HashMap map = new HashMap();
                            if (resolveInfo.loadLabel(packageManager) == null && resolveInfo.activityInfo != null) {
                                String str = resolveInfo.activityInfo.name;
                            }
                            CharSequence charSequenceLoadLabel = resolveInfo.activityInfo.loadLabel(packageManager);
                            String string = charSequenceLoadLabel == null ? "" : charSequenceLoadLabel.toString();
                            map.put("icon", resolveInfo.activityInfo.loadIcon(packageManager));
                            map.put("appName", string);
                            map.put("packageName", resolveInfo.activityInfo.applicationInfo.packageName);
                            map.put("className", resolveInfo.activityInfo.name);
                            arrayList.add(map);
                        }
                        if (d.this.e != null) {
                            d.this.j.post(new Runnable() { // from class: com.tsf.shell.manager.action.d.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    d.this.b.addAll(arrayList);
                                    d.this.e.notifyDataSetChanged();
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
        HashMap<String, Object> map;
        Intent intent;
        switch (i) {
            case 0:
                map = this.a.get(i2);
                break;
            case 1:
                map = this.c.get(i2);
                break;
            case 2:
                map = this.d.get(i2);
                break;
            case 3:
                map = this.b.get(i2);
                break;
            default:
                map = null;
                break;
        }
        if (map != null) {
            if (i == 1 || i == 2) {
                intent = new Intent(this.i.g());
                intent.putExtra("action", (Integer) map.get("action"));
            } else {
                intent = a(this.i.g(), (String) map.get("appName"), (String) map.get("packageName"), (String) map.get("className"));
            }
            if (this.i.h()) {
                intent.putExtra("action_icon", x.a((Drawable) map.get("icon"), 60, 60));
            }
            intent.putExtra("action_type", i);
            intent.putExtra("action_name", (String) map.get("appName"));
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
            this.e = new com.tsf.shell.activity.actionselector.a(context, this.b, b.g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{b.e.icon, b.e.appName});
            this.f = new com.tsf.shell.activity.actionselector.a(context, this.a, b.g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{b.e.icon, b.e.appName});
            this.g = new com.tsf.shell.activity.actionselector.a(context, this.c, b.g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{b.e.icon, b.e.appName});
            this.h = new com.tsf.shell.activity.actionselector.a(context, this.d, b.g.action_selector_lists, new String[]{"icon", "appName"}, new int[]{b.e.icon, b.e.appName});
        }
    }

    public com.tsf.shell.activity.actionselector.a a(int i) {
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
