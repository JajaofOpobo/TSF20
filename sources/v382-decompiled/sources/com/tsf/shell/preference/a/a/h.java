package com.tsf.shell.preference.a.a;

import android.content.pm.PackageManager;
import com.censivn.C3DEngine.b.e.m;
import com.censivn.C3DEngine.b.e.n;
import com.censivn.C3DEngine.b.e.o;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.preference.AboutActivity;
import com.tsf.shell.preference.video.VideoViwerActivity;
import com.tsf.shell.utils.l;
import com.tsf.shell.utils.x;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public class h extends m {
    public h() {
        a(R.string.mn_about);
        n nVar = new n();
        nVar.h(R.string.mn_version_detail);
        nVar.b(String.valueOf(x.c(R.string.mn_version_detail_summary)) + " 2015/8/26");
        nVar.a(new o() { // from class: com.tsf.shell.preference.a.a.h.1
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.tsf.shell.manager.a.d.a(1800);
                h.this.e();
            }
        });
        b(nVar);
        n nVar2 = new n();
        nVar2.a(i());
        nVar2.i(R.string.mn_version_summary);
        nVar2.a(new o() { // from class: com.tsf.shell.preference.a.a.h.2
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.h.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        l.a(Home.b(), com.censivn.C3DEngine.a.b());
                    }
                });
            }
        });
        b(nVar2);
        n nVar3 = new n();
        nVar3.h(R.string.mn_introduction_video);
        nVar3.a(new o() { // from class: com.tsf.shell.preference.a.a.h.3
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.h.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoViwerActivity.a(Home.b());
                    }
                });
            }
        });
        b(nVar3);
        n nVar4 = new n();
        nVar4.h(R.string.mn_rate);
        nVar4.i(R.string.mn_rate_summary);
        nVar4.a(new o() { // from class: com.tsf.shell.preference.a.a.h.4
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                h.this.e();
                com.tsf.shell.manager.a.d.a(ACRAConstants.DEFAULT_SOCKET_TIMEOUT);
            }
        });
        b(nVar4);
        n nVar5 = new n();
        nVar5.h(R.string.mn_feedback);
        nVar5.b("service@tsfui.com");
        nVar5.a(new o() { // from class: com.tsf.shell.preference.a.a.h.5
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.h.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.utils.o.a(Home.b());
                    }
                });
            }
        });
        b(nVar5);
        b(new com.tsf.shell.preference.a.a.a.d(x.c(R.string.text_follow_us)));
        n nVar6 = new n();
        nVar6.h(R.string.text_translations);
        nVar6.a(new o() { // from class: com.tsf.shell.preference.a.a.h.6
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.h.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AboutActivity.a(Home.b());
                    }
                });
            }
        });
        b(nVar6);
    }

    private String i() {
        String string = Home.b().getString(R.string.mn_version);
        try {
            return String.valueOf(string) + " " + Home.b().getPackageManager().getPackageInfo(Home.b().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return string;
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
    }
}
