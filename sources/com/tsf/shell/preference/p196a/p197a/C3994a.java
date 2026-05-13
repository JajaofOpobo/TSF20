package com.tsf.shell.preference.p196a.p197a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.censivn.C3DEngine.p031b.p037e.C0957j;
import com.tsf.C1306b;
import com.tsf.shell.manager.p168b.C3425d;
/* renamed from: com.tsf.shell.preference.a.a.a */
/* loaded from: classes.dex */
public class C3994a extends C0956i {
    public C3994a() {
        m10516a(C1306b.C1315i.text_preferences);
        C0957j c0957j = new C0957j();
        c0957j.m10488h(C1306b.C1315i.mn_title_db_export);
        c0957j.m10490b("/sdcard/TSFShell_data/");
        c0957j.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3425d.m2580b(C0853a.m10856d());
                    }
                });
            }
        });
        mo838b(c0957j);
        C0957j c0957j2 = new C0957j();
        c0957j2.m10488h(C1306b.C1315i.mn_title_db_import);
        c0957j2.m10490b("/sdcard/TSFShell_data/");
        c0957j2.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3425d.m2588a(C0853a.m10856d());
                    }
                });
            }
        });
        mo838b(c0957j2);
        C0957j c0957j3 = new C0957j();
        c0957j3.m10488h(C1306b.C1315i.pref_title_shell_reset);
        c0957j3.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.a.3
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3425d.m2576c(C0853a.m10856d());
                    }
                });
            }
        });
        mo838b(c0957j3);
    }
}
