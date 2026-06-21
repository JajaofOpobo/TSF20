package com.tsf.shell.manager.r.c;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.k;
import com.tsf.shell.utils.l;
import com.tsf.shell.utils.x;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c {
    public static HashMap a;

    public static void a() {
        a = new HashMap();
        a.put("com.tsf.shell.widget.message", new d(5, 17, ""));
        a.put("com.tsf.shell.widget.alarm", new d(4, -1, ""));
        a.put("com.tsf.shell.widget.memo", new d(6, 8, ""));
        a.put("com.tsf.shell.widget.music", new d(4, 17, ""));
        a.put("com.tsf.shell.widget.gallery", new d(5, 14, ""));
        a.put("com.tsf.shell.widget.adornment", new d(4, 6, ""));
        a.put("com.tsf.shell.widget.calendar", new d(5, 11, ""));
        a.put("com.tsf.shell.widget.cubeclock", new d(5, 3, ""));
        a.put("com.tsf.shell.widget.weather", new d(4, 16, ""));
    }

    public static void a(final String str) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.c.1
            @Override // java.lang.Runnable
            public void run() {
                l.a(Home.c, str);
            }
        };
        a(com.censivn.C3DEngine.a.d(), x.c(R.string.public_action_update), x.c(R.string.notic_load_widget_error_update_widget), l.c(Home.c, str), x.c(R.string.public_action_update), x.c(R.string.public_action_cancel), runnable, null);
    }

    public static boolean a(com.tsf.shell.e.i.c.i iVar, boolean z) {
        boolean n = iVar.n();
        if (iVar.e) {
            if (!n) {
                k.a(R.string.notic_widget_exists);
            }
            return n;
        }
        boolean z2 = iVar.h <= 6;
        d dVar = (d) a.get(iVar.a);
        boolean a2 = a(dVar, iVar);
        boolean b = b(dVar, iVar);
        if (n && z2 && a2 && b) {
            return true;
        }
        if (z) {
            if (!n) {
                k.a(R.string.notic_widget_exists);
            }
            if (!z2) {
                a(com.censivn.C3DEngine.a.d(), x.c(R.string.public_action_update), x.c(R.string.notic_load_widget_error_update_shell), l.c(Home.c, com.censivn.C3DEngine.a.d().getPackageName()), x.c(R.string.public_action_update), x.c(R.string.public_action_cancel), new Runnable() { // from class: com.tsf.shell.manager.r.c.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        l.a(Home.c, com.censivn.C3DEngine.a.d().getPackageName());
                    }
                }, null);
            }
            if (!a2 || !b) {
                a(iVar.a);
            }
        }
        return false;
    }

    public static void a(Context context, final String str, final String str2, final String str3, final String str4, final String str5, final Runnable runnable, final Runnable runnable2) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.r.c.c.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
                builder.setTitle(str);
                String str6 = str4;
                final Runnable runnable3 = runnable;
                builder.setPositiveButton(str6, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.r.c.c.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
                String str7 = str5;
                final Runnable runnable4 = runnable2;
                builder.setNegativeButton(str7, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.r.c.c.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable4 != null) {
                            runnable4.run();
                        }
                    }
                });
                builder.create();
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(R.layout.dialog_unknow_error, (ViewGroup) null);
                TextView textView = (TextView) linearLayout.findViewById(R.id.content);
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.summary);
                textView.setText(str2);
                textView2.setText(str3);
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new URLSpan(str3), 0, str3.length(), 33);
                textView2.setText(spannableString);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(linearLayout);
                AlertDialog create = builder.create();
                create.setCancelable(false);
                create.show();
            }
        });
    }

    private static boolean a(d dVar, com.tsf.shell.e.i.c.i iVar) {
        return dVar == null || iVar.h >= dVar.a;
    }

    private static boolean b(d dVar, com.tsf.shell.e.i.c.i iVar) {
        return dVar == null || iVar.i >= dVar.b;
    }
}
