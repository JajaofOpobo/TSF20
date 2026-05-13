package com.tsf.shell.preference.p196a.p197a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.censivn.C3DEngine.p031b.p037e.C0957j;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.preference.AboutActivity;
import com.tsf.shell.preference.p196a.p197a.p198a.C4007c;
import com.tsf.shell.preference.video.VideoViwerActivity;
import com.tsf.shell.utils.C4175k;
import com.tsf.shell.utils.C4178n;
import com.tsf.shell.utils.C4189x;
import org.acra.ACRAConstants;
/* renamed from: com.tsf.shell.preference.a.a.g */
/* loaded from: classes.dex */
public class C4054g extends C0956i {
    public C4054g() {
        m10516a(C1306b.C1315i.mn_about);
        C0957j c0957j = new C0957j();
        c0957j.m10488h(C1306b.C1315i.mn_version_detail);
        c0957j.m10490b(C4189x.m588c(C1306b.C1315i.mn_version_detail_summary) + " 2017/03/23");
        c0957j.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C3359a.f11090d.m2670a(1800);
                C4054g.this.m10505e();
            }
        });
        mo838b(c0957j);
        C0957j c0957j2 = new C0957j();
        c0957j2.m10491a(m843i());
        c0957j2.m10487i(C1306b.C1315i.mn_version_summary);
        c0957j2.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C4175k.m671a(Home.m6177b(), C0853a.m10858b());
                    }
                });
            }
        });
        mo838b(c0957j2);
        C0957j c0957j3 = new C0957j();
        c0957j3.m10488h(C1306b.C1315i.mn_introduction_video);
        c0957j3.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.3
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        VideoViwerActivity.m791a(Home.m6177b());
                    }
                });
            }
        });
        mo838b(c0957j3);
        C0957j c0957j4 = new C0957j();
        c0957j4.m10488h(C1306b.C1315i.mn_rate);
        c0957j4.m10487i(C1306b.C1315i.mn_rate_summary);
        c0957j4.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.4
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C4054g.this.m10505e();
                C3359a.f11090d.m2670a(ACRAConstants.DEFAULT_SOCKET_TIMEOUT);
            }
        });
        mo838b(c0957j4);
        C0957j c0957j5 = new C0957j();
        c0957j5.m10488h(C1306b.C1315i.mn_feedback);
        c0957j5.m10490b("service@tsfui.com");
        c0957j5.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.5
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C4178n.m666a(Home.m6177b());
                    }
                });
            }
        });
        mo838b(c0957j5);
        mo838b(new C4007c(C4189x.m588c(C1306b.C1315i.text_follow_us)));
        C0957j c0957j6 = new C0957j();
        c0957j6.m10488h(C1306b.C1315i.text_translations);
        c0957j6.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.6
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AboutActivity.m942a(Home.m6177b());
                    }
                });
            }
        });
        mo838b(c0957j6);
        C0957j c0957j7 = new C0957j();
        c0957j7.m10488h(C1306b.C1315i.terms_of_service);
        c0957j7.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.7
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Intent intent = new Intent();
                        intent.putExtra("is_full_screen", true);
                        intent.putExtra("title", C4189x.m588c(C1306b.C1315i.terms_of_service));
                        intent.putExtra("url", "http://www.cmcm.com/protocol/site/tos.html");
                        intent.setComponent(new ComponentName(Home.m6177b().getApplication().getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
                        Home.m6177b().startActivity(intent);
                    }
                });
            }
        });
        mo838b(c0957j7);
        C0957j c0957j8 = new C0957j();
        c0957j8.m10488h(C1306b.C1315i.privacy_policy);
        c0957j8.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.8
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Intent intent = new Intent();
                        intent.putExtra("is_full_screen", true);
                        intent.putExtra("title", C4189x.m588c(C1306b.C1315i.privacy_policy));
                        intent.putExtra("url", "http://www.cmcm.com/protocol/site/privacy.html");
                        intent.setComponent(new ComponentName(Home.m6177b().getApplication().getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
                        Home.m6177b().startActivity(intent);
                    }
                });
            }
        });
        mo838b(c0957j8);
        C0957j c0957j9 = new C0957j();
        c0957j9.m10488h(C1306b.C1315i.adchoices);
        c0957j9.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.g.9
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.g.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Intent intent = new Intent();
                        intent.putExtra("is_full_screen", true);
                        intent.putExtra("title", C4189x.m588c(C1306b.C1315i.adchoices));
                        intent.putExtra("url", "http://www.cmcm.com/protocol/site/ad-choice.html");
                        intent.setComponent(new ComponentName(Home.m6177b().getApplication().getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
                        Home.m6177b().startActivity(intent);
                    }
                });
            }
        });
        mo838b(c0957j9);
    }

    /* renamed from: i */
    private String m843i() {
        String string = Home.m6177b().getString(C1306b.C1315i.mn_version);
        try {
            return string + " " + Home.m6177b().getPackageManager().getPackageInfo(Home.m6177b().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return string;
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
    }
}
