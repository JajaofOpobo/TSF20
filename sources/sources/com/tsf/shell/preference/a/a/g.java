package com.tsf.shell.preference.a.a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.censivn.C3DEngine.b.e.i;
import com.censivn.C3DEngine.b.e.j;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.preference.AboutActivity;
import com.tsf.shell.preference.video.VideoViwerActivity;
import com.tsf.shell.utils.k;
import com.tsf.shell.utils.n;
import com.tsf.shell.utils.x;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends i {
    public g() {
        a(b.i.mn_about);
        j jVar = new j();
        jVar.h(b.i.mn_version_detail);
        jVar.b(x.c(b.i.mn_version_detail_summary) + " 2017/03/23");
        jVar.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.1
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.tsf.shell.manager.a.d.a(1800);
                g.this.e();
            }
        });
        b(jVar);
        j jVar2 = new j();
        jVar2.a(i());
        jVar2.i(b.i.mn_version_summary);
        jVar2.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.2
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        k.a(Home.b(), com.censivn.C3DEngine.a.b());
                    }
                });
            }
        });
        b(jVar2);
        j jVar3 = new j();
        jVar3.h(b.i.mn_introduction_video);
        jVar3.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.3
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoViwerActivity.a(Home.b());
                    }
                });
            }
        });
        b(jVar3);
        j jVar4 = new j();
        jVar4.h(b.i.mn_rate);
        jVar4.i(b.i.mn_rate_summary);
        jVar4.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.4
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                g.this.e();
                com.tsf.shell.manager.a.d.a(ACRAConstants.DEFAULT_SOCKET_TIMEOUT);
            }
        });
        b(jVar4);
        j jVar5 = new j();
        jVar5.h(b.i.mn_feedback);
        jVar5.b("service@tsfui.com");
        jVar5.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.5
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        n.a(Home.b());
                    }
                });
            }
        });
        b(jVar5);
        b(new com.tsf.shell.preference.a.a.a.c(x.c(b.i.text_follow_us)));
        j jVar6 = new j();
        jVar6.h(b.i.text_translations);
        jVar6.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.6
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AboutActivity.a(Home.b());
                    }
                });
            }
        });
        b(jVar6);
        j jVar7 = new j();
        jVar7.h(b.i.terms_of_service);
        jVar7.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.7
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Intent intent = new Intent();
                        intent.putExtra("is_full_screen", true);
                        intent.putExtra("title", x.c(b.i.terms_of_service));
                        intent.putExtra("url", "http://www.cmcm.com/protocol/site/tos.html");
                        intent.setComponent(new ComponentName(Home.b().getApplication().getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
                        Home.b().startActivity(intent);
                    }
                });
            }
        });
        b(jVar7);
        j jVar8 = new j();
        jVar8.h(b.i.privacy_policy);
        jVar8.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.8
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Intent intent = new Intent();
                        intent.putExtra("is_full_screen", true);
                        intent.putExtra("title", x.c(b.i.privacy_policy));
                        intent.putExtra("url", "http://www.cmcm.com/protocol/site/privacy.html");
                        intent.setComponent(new ComponentName(Home.b().getApplication().getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
                        Home.b().startActivity(intent);
                    }
                });
            }
        });
        b(jVar8);
        j jVar9 = new j();
        jVar9.h(b.i.adchoices);
        jVar9.a(new j.a() { // from class: com.tsf.shell.preference.a.a.g.9
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Intent intent = new Intent();
                        intent.putExtra("is_full_screen", true);
                        intent.putExtra("title", x.c(b.i.adchoices));
                        intent.putExtra("url", "http://www.cmcm.com/protocol/site/ad-choice.html");
                        intent.setComponent(new ComponentName(Home.b().getApplication().getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
                        Home.b().startActivity(intent);
                    }
                });
            }
        });
        b(jVar9);
    }

    private String i() {
        String string = Home.b().getString(b.i.mn_version);
        try {
            return string + " " + Home.b().getPackageManager().getPackageInfo(Home.b().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return string;
        }
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
    }
}
