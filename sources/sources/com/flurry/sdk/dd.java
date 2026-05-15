package com.flurry.sdk;

import android.widget.Toast;
import com.flurry.sdk.de;
import com.flurry.sdk.dq;
import com.flurry.sdk.el;
import com.flurry.sdk.en;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class dd extends de implements dq.a {
    static String a;
    private boolean i;
    private static final String h = dd.class.getSimpleName();
    static String b = "http://data.flurry.com/aap.do";
    static String c = "https://data.flurry.com/aap.do";

    public dd() {
        this(null);
    }

    dd(de.a aVar) {
        super("Analytics", dd.class.getSimpleName());
        this.g = "AnalyticsData_";
        g();
        a(aVar);
    }

    private void g() {
        dq dqVarA = dp.a();
        this.i = ((Boolean) dqVarA.a("UseHttps")).booleanValue();
        dqVarA.a("UseHttps", (dq.a) this);
        eo.a(4, h, "initSettings, UseHttps = " + this.i);
        String str = (String) dqVarA.a("ReportUrl");
        dqVarA.a("ReportUrl", (dq.a) this);
        b(str);
        eo.a(4, h, "initSettings, ReportUrl = " + str);
    }

    @Override // com.flurry.sdk.dq.a
    public void a(String str, Object obj) {
        if (str.equals("UseHttps")) {
            this.i = ((Boolean) obj).booleanValue();
            eo.a(4, h, "onSettingUpdate, UseHttps = " + this.i);
        } else {
            if (str.equals("ReportUrl")) {
                String str2 = (String) obj;
                b(str2);
                eo.a(4, h, "onSettingUpdate, ReportUrl = " + str2);
                return;
            }
            eo.a(6, h, "onSettingUpdate internal error!");
        }
    }

    private void b(String str) {
        if (str != null && !str.endsWith(".do")) {
            eo.a(5, h, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        a = str;
    }

    String a() {
        if (a != null) {
            return a;
        }
        if (this.i) {
            return c;
        }
        return b;
    }

    @Override // com.flurry.sdk.de
    protected void a(byte[] bArr, final String str, final String str2) {
        String strA = a();
        eo.a(4, h, "FlurryDataSender: start upload data " + bArr + " with id = " + str + " to " + strA);
        el elVar = new el();
        elVar.a(strA);
        elVar.a(en.a.kPost);
        elVar.a("Content-Type", "application/octet-stream");
        elVar.a((ex) new ew());
        elVar.a(bArr);
        elVar.a((el.a) new el.a<byte[], Void>() { // from class: com.flurry.sdk.dd.1
            @Override // com.flurry.sdk.el.a
            public void a(el<byte[], Void> elVar2, Void r6) {
                final int iE = elVar2.e();
                if (iE > 0) {
                    eo.d(dd.h, "FlurryDataSender: report " + str + " sent. HTTP response: " + iE);
                    if (eo.c() <= 3 && eo.d()) {
                        Cdo.a().a(new Runnable() { // from class: com.flurry.sdk.dd.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Toast.makeText(Cdo.a().b(), "SD HTTP Response Code: " + iE, 0).show();
                            }
                        });
                    }
                    dd.this.a(str, str2, iE);
                    dd.this.d();
                    return;
                }
                dd.this.b(str, str2);
            }
        });
        em.a().a(this, elVar);
    }

    @Override // com.flurry.sdk.de
    protected void a(String str, String str2, final int i) {
        a(new ff() { // from class: com.flurry.sdk.dd.2
            @Override // com.flurry.sdk.ff
            public void a() {
                dj djVarC;
                if (i == 200 && (djVarC = dl.a().c()) != null) {
                    djVarC.b();
                }
            }
        });
        super.a(str, str2, i);
    }
}
