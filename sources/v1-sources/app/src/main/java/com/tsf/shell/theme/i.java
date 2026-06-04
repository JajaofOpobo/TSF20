package com.tsf.shell.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class i extends BroadcastReceiver {
    final /* synthetic */ ThemeManagerActivity a;

    i(ThemeManagerActivity themeManagerActivity) {
        this.a = themeManagerActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        char c;
        char c2 = 0;
        String action = intent.getAction();
        String[] strArr = null;
        if ("android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_ADDED".equals(action)) {
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (schemeSpecificPart != null && schemeSpecificPart.length() != 0) {
                if (!"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        if (!booleanExtra) {
                            c = 3;
                            if (c != 0) {
                                strArr = new String[]{schemeSpecificPart};
                                c2 = c;
                            } else {
                                c2 = c;
                            }
                        }
                        c = 0;
                        if (c != 0) {
                        }
                    } else {
                        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                            if (!booleanExtra) {
                                c = 1;
                                if (c != 0) {
                                }
                            }
                        }
                        c = 0;
                        if (c != 0) {
                        }
                    }
                }
                c = 2;
                if (c != 0) {
                }
            } else {
                return;
            }
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action)) {
            c2 = 5;
            strArr = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
            c2 = 4;
            strArr = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
        }
        switch (c2) {
            case 1:
            case 5:
                this.a.a(strArr);
                break;
            case 2:
                this.a.c(strArr);
                break;
            case 3:
            case 4:
                this.a.b(strArr);
                break;
        }
    }
}
