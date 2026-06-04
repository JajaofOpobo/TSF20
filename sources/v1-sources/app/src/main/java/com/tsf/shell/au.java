package com.tsf.shell;

import android.app.AlertDialog;
import android.content.Context;

/* loaded from: classes.dex */
public final class au {
    public static void a(String str) {
        av avVar = new av(str);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(avVar);
    }

    public static void a(int i) {
        aw awVar = new aw(i);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(awVar);
    }

    public static void a(Context context, Runnable runnable) {
        a(context, context.getString(R.string.mn_unread_download_notic), context.getString(R.string.public_action_ok), context.getString(R.string.public_action_cancel), runnable, null);
    }

    public static void a(int i, int i2, Runnable runnable, Runnable runnable2) {
        a(com.censivn.C3DEngine.a.c(), com.censivn.C3DEngine.a.c().getString(i), com.censivn.C3DEngine.a.c().getString(i2), com.censivn.C3DEngine.a.c().getString(R.string.public_action_cancel), runnable, runnable2);
    }

    private static void a(Context context, String str, String str2, String str3, Runnable runnable, Runnable runnable2) {
        ax axVar = new ax(context, str, str2, str3, runnable, runnable2);
        if (com.censivn.C3DEngine.a.a() == null) {
            axVar.run();
        } else {
            com.censivn.C3DEngine.a.a();
            com.censivn.C3DEngine.b.w.a(axVar);
        }
    }

    public static void a(Context context, int i, int i2, Runnable runnable, Runnable runnable2) {
        String string = context.getString(i);
        String string2 = context.getString(i2);
        String string3 = context.getString(R.string.public_action_ok);
        String string4 = context.getString(R.string.public_action_cancel);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(string2).setCancelable(false).setPositiveButton(string3, new ba(runnable));
        builder.setNegativeButton(string4, new bb(runnable2));
        builder.setTitle(string);
        builder.create().show();
    }
}
