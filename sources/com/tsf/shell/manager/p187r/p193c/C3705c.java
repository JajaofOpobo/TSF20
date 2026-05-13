package com.tsf.shell.manager.p187r.p193c;

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
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import com.tsf.shell.utils.C4175k;
import com.tsf.shell.utils.C4189x;
import java.util.HashMap;
/* renamed from: com.tsf.shell.manager.r.c.c */
/* loaded from: classes.dex */
public class C3705c {

    /* renamed from: a */
    public static HashMap<String, C3711a> f12218a;

    /* renamed from: a */
    public static void m1672a() {
        f12218a = new HashMap<>();
        f12218a.put("com.tsf.shell.widget.message", new C3711a(5, 17, ""));
        f12218a.put("com.tsf.shell.widget.alarm", new C3711a(4, -1, ""));
        f12218a.put("com.tsf.shell.widget.memo", new C3711a(6, 8, ""));
        f12218a.put("com.tsf.shell.widget.music", new C3711a(4, 17, ""));
        f12218a.put("com.tsf.shell.widget.gallery", new C3711a(5, 14, ""));
        f12218a.put("com.tsf.shell.widget.adornment", new C3711a(4, 6, ""));
        f12218a.put("com.tsf.shell.widget.calendar", new C3711a(5, 11, ""));
        f12218a.put("com.tsf.shell.widget.cubeclock", new C3711a(5, 3, ""));
        f12218a.put("com.tsf.shell.widget.weather", new C3711a(4, 16, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.r.c.c$a */
    /* loaded from: classes.dex */
    public static class C3711a {

        /* renamed from: a */
        public int f12229a;

        /* renamed from: b */
        public int f12230b;

        public C3711a(int i, int i2, String str) {
            this.f12229a = i;
            this.f12230b = i2;
        }
    }

    /* renamed from: a */
    public static void m1668a(final String str) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.c.1
            @Override // java.lang.Runnable
            public void run() {
                C4175k.m671a(Home.f7122c, str);
            }
        };
        m1671a(C0853a.m10856d(), C4189x.m588c(C1306b.C1315i.public_action_update), C4189x.m588c(C1306b.C1315i.notic_load_widget_error_update_widget), C4175k.m669c(Home.f7122c, str), C4189x.m588c(C1306b.C1315i.public_action_update), C4189x.m588c(C1306b.C1315i.public_action_cancel), runnable, null);
    }

    /* renamed from: a */
    public static boolean m1670a(C3343g c3343g, boolean z) {
        boolean m2785n = c3343g.m2785n();
        if (c3343g.f11056e) {
            if (!m2785n) {
                C2244e.m6020a(C1306b.C1315i.notic_widget_exists);
            }
            return m2785n;
        }
        boolean z2 = c3343g.f11059h <= 6;
        C3711a c3711a = f12218a.get(c3343g.f11052a);
        boolean m1669a = m1669a(c3711a, c3343g);
        boolean m1667b = m1667b(c3711a, c3343g);
        if (m2785n && z2 && m1669a && m1667b) {
            return true;
        }
        if (z) {
            if (!m2785n) {
                C2244e.m6020a(C1306b.C1315i.notic_widget_exists);
            }
            if (!z2) {
                m1671a(C0853a.m10856d(), C4189x.m588c(C1306b.C1315i.public_action_update), C4189x.m588c(C1306b.C1315i.notic_load_widget_error_update_shell), C4175k.m669c(Home.f7122c, C0853a.m10856d().getPackageName()), C4189x.m588c(C1306b.C1315i.public_action_update), C4189x.m588c(C1306b.C1315i.public_action_cancel), new Runnable() { // from class: com.tsf.shell.manager.r.c.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C4175k.m671a(Home.f7122c, C0853a.m10856d().getPackageName());
                    }
                }, null);
            }
            if (!m1669a || !m1667b) {
                m1668a(c3343g.f11052a);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m1671a(Context context, final String str, final String str2, final String str3, final String str4, final String str5, final Runnable runnable, final Runnable runnable2) {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.r.c.c.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
                builder.setTitle(str);
                builder.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.r.c.c.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setNegativeButton(str5, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.r.c.c.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.create();
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(C0853a.m10856d()).inflate(C1306b.C1313g.dialog_unknow_error, (ViewGroup) null);
                TextView textView = (TextView) linearLayout.findViewById(C1306b.C1311e.summary);
                ((TextView) linearLayout.findViewById(C1306b.C1311e.content)).setText(str2);
                textView.setText(str3);
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new URLSpan(str3), 0, str3.length(), 33);
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(linearLayout);
                AlertDialog create = builder.create();
                create.setCancelable(false);
                create.show();
            }
        });
    }

    /* renamed from: a */
    private static boolean m1669a(C3711a c3711a, C3343g c3343g) {
        return c3711a == null || c3343g.f11059h >= c3711a.f12229a;
    }

    /* renamed from: b */
    private static boolean m1667b(C3711a c3711a, C3343g c3343g) {
        return c3711a == null || c3343g.f11060i >= c3711a.f12230b;
    }
}
