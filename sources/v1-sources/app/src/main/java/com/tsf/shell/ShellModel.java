package com.tsf.shell;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ShellModel extends BroadcastReceiver {
    private static Handler n;
    private final ShellApplication e;
    private bq g;
    private bl h;
    private com.tsf.shell.h.a i;
    private int j;
    private static final HandlerThread m = new HandlerThread("launcher-loader");
    private static boolean o = false;
    private final Object f = new Object();
    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    private String k = "";
    private String l = "";

    public static void a() {
        if (!o) {
            o = true;
            m.start();
            n = new Handler(m.getLooper());
        }
    }

    ShellModel(ShellApplication shellApplication) {
        i.a().a("ShellModel");
        this.e = shellApplication;
        this.i = new com.tsf.shell.h.a();
        this.j = shellApplication.getResources().getInteger(R.integer.config_allAppsBatchLoadDelay);
    }

    public final ArrayList a(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("com.tsf.shell.themes", (Uri) null), 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(context.getPackageManager()));
        int size = queryIntentActivities.size();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tsf.shell");
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            this.i.c(new com.tsf.shell.h.b(it.next()));
        }
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            if (!resolveInfo.activityInfo.packageName.equals("com.tsf.shell.themes.box")) {
                this.i.c(new com.tsf.shell.h.b(resolveInfo));
            }
        }
        ArrayList arrayList = this.i.j;
        this.i.j = new ArrayList();
        return arrayList;
    }

    public final void a(bl blVar) {
        synchronized (this.f) {
            this.h = blVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        int i;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_ADDED".equals(action)) {
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (schemeSpecificPart != null && schemeSpecificPart.length() != 0) {
                if (!"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        if (!booleanExtra) {
                            i = 3;
                        }
                        i = 0;
                    } else {
                        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                            if (!booleanExtra) {
                                i = 1;
                            }
                        }
                        i = 0;
                    }
                    if (i == 0) {
                        i.a().b(new bt(this, i, new String[]{schemeSpecificPart}));
                        return;
                    }
                    return;
                }
                i = 2;
                if (i == 0) {
                }
            }
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action)) {
            i.a().b(new bt(this, 5, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
            i.a().b(new bt(this, 4, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        }
    }

    public final void b(Context context) {
        synchronized (this.f) {
            if (this.h != null) {
                this.g = new bq(this, context);
                n.post(this.g);
            }
        }
    }
}
