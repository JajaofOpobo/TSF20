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
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.utils.MarketLinkHandler;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetCompatibilityChecker {
    public static HashMap<String, a> a;

    public static void a() {
        a = new HashMap<>();
        IconRenderer.put("com.tsf.shell.widget.message", new IconRenderer(5, 17, ""));
        IconRenderer.put("com.tsf.shell.widget.alarm", new IconRenderer(4, -1, ""));
        IconRenderer.put("com.tsf.shell.widget.memo", new IconRenderer(6, 8, ""));
        IconRenderer.put("com.tsf.shell.widget.music", new IconRenderer(4, 17, ""));
        IconRenderer.put("com.tsf.shell.widget.gallery", new IconRenderer(5, 14, ""));
        IconRenderer.put("com.tsf.shell.widget.adornment", new IconRenderer(4, 6, ""));
        IconRenderer.put("com.tsf.shell.widget.calendar", new IconRenderer(5, 11, ""));
        IconRenderer.put("com.tsf.shell.widget.cubeclock", new IconRenderer(5, 3, ""));
        IconRenderer.put("com.tsf.shell.widget.weather", new IconRenderer(4, 16, ""));
    }

    static class a {
        public int a;
        public int b;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
        }
    }

    static class b {
        public String o;
    }

    public static void a(final String str) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetCompatibilityChecker.1
            @Override // java.lang.Runnable
            public void run() {
                k.a(Home.c, str);
            }
        };
        a(com.censivn.C3DEngine.C3DEngine.d(), x.c(b.i.public_action_update), x.c(b.i.notic_load_widget_error_update_widget), k.c(Home.c, str), x.c(b.i.public_action_update), x.c(b.i.public_action_cancel), runnable, null);
    }

    public static boolean a(com.tsf.shell.f.i.c.ItemGroupBase gVar, boolean z) {
        boolean zN = gVar.n();
        if (gVar.e) {
            if (!zN) {
                com.tsf.shell.e.a(b.i.notic_widget_exists);
            }
            return zN;
        }
        boolean z2 = gVar.h <= 6;
        A aVar = IconRenderer.get(gVar.a);
        boolean zA = a(aVar, gVar);
        boolean zB = b(aVar, gVar);
        if (zN && z2 && zA && zB) {
            return true;
        }
        if (z) {
            if (!zN) {
                com.tsf.shell.e.a(b.i.notic_widget_exists);
            }
            if (!z2) {
                a(com.censivn.C3DEngine.C3DEngine.d(), x.c(b.i.public_action_update), x.c(b.i.notic_load_widget_error_update_shell), k.c(Home.c, com.censivn.C3DEngine.C3DEngine.d().getPackageName()), x.c(b.i.public_action_update), x.c(b.i.public_action_cancel), new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetCompatibilityChecker.2
                    @Override // java.lang.Runnable
                    public void run() {
                        k.a(Home.c, com.censivn.C3DEngine.C3DEngine.d().getPackageName());
                    }
                }, null);
            }
            if (!zA || !zB) {
                a(gVar.a);
            }
        }
        return false;
    }

    public static void a(Context context, final String str, final String str2, final String str3, final String str4, final String str5, final Runnable runnable, final Runnable runnable2) {
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetCompatibilityChecker.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.C3DEngine.d());
                builder.setTitle(str);
                builder.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.r.c.WidgetCompatibilityChecker.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setNegativeButton(str5, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.r.c.WidgetCompatibilityChecker.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.create();
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.C3DEngine.d()).inflate(b.g.dialog_unknow_error, (ViewGroup) null);
                TextView textView = (TextView) linearLayout.findViewById(b.e.content);
                TextView textView2 = (TextView) linearLayout.findViewById(b.e.summary);
                textView.setText(str2);
                textView2.setText(str3);
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new URLSpan(str3), 0, str3.length(), 33);
                textView2.setText(spannableString);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(linearLayout);
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.show();
            }
        });
    }

    private static boolean a(A aVar, com.tsf.shell.f.i.c.ItemGroupBase gVar) {
        return aVar == null || gVar.h >= aVar.a;
    }

    private static boolean b(A aVar, com.tsf.shell.f.i.c.ItemGroupBase gVar) {
        return aVar == null || gVar.i >= aVar.b;
    }
}
