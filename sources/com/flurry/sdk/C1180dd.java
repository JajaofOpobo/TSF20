package com.flurry.sdk;

import android.widget.Toast;
import com.flurry.sdk.AbstractC1184de;
import com.flurry.sdk.C1213dq;
import com.flurry.sdk.C1247el;
import com.flurry.sdk.C1251en;
/* renamed from: com.flurry.sdk.dd */
/* loaded from: classes.dex */
public class C1180dd extends AbstractC1184de implements C1213dq.InterfaceC1214a {

    /* renamed from: a */
    static String f3756a;

    /* renamed from: i */
    private boolean f3760i;

    /* renamed from: h */
    private static final String f3759h = C1180dd.class.getSimpleName();

    /* renamed from: b */
    static String f3757b = "http://data.flurry.com/aap.do";

    /* renamed from: c */
    static String f3758c = "https://data.flurry.com/aap.do";

    public C1180dd() {
        this(null);
    }

    C1180dd(AbstractC1184de.InterfaceC1190a interfaceC1190a) {
        super("Analytics", C1180dd.class.getSimpleName());
        this.f3771g = "AnalyticsData_";
        m9548g();
        m9546a(interfaceC1190a);
    }

    /* renamed from: g */
    private void m9548g() {
        C1213dq m9380a = C1212dp.m9380a();
        this.f3760i = ((Boolean) m9380a.m9377a("UseHttps")).booleanValue();
        m9380a.m9376a("UseHttps", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3759h, "initSettings, UseHttps = " + this.f3760i);
        String str = (String) m9380a.m9377a("ReportUrl");
        m9380a.m9376a("ReportUrl", (C1213dq.InterfaceC1214a) this);
        m9549b(str);
        C1258eo.m9234a(4, f3759h, "initSettings, ReportUrl = " + str);
    }

    @Override // com.flurry.sdk.C1213dq.InterfaceC1214a
    /* renamed from: a */
    public void mo9338a(String str, Object obj) {
        if (str.equals("UseHttps")) {
            this.f3760i = ((Boolean) obj).booleanValue();
            C1258eo.m9234a(4, f3759h, "onSettingUpdate, UseHttps = " + this.f3760i);
        } else if (str.equals("ReportUrl")) {
            String str2 = (String) obj;
            m9549b(str2);
            C1258eo.m9234a(4, f3759h, "onSettingUpdate, ReportUrl = " + str2);
        } else {
            C1258eo.m9234a(6, f3759h, "onSettingUpdate internal error!");
        }
    }

    /* renamed from: b */
    private void m9549b(String str) {
        if (str != null && !str.endsWith(".do")) {
            C1258eo.m9234a(5, f3759h, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        f3756a = str;
    }

    /* renamed from: a */
    String m9551a() {
        if (f3756a != null) {
            return f3756a;
        }
        if (this.f3760i) {
            return f3758c;
        }
        return f3757b;
    }

    @Override // com.flurry.sdk.AbstractC1184de
    /* renamed from: a */
    protected void mo9541a(byte[] bArr, final String str, final String str2) {
        String m9551a = m9551a();
        C1258eo.m9234a(4, f3759h, "FlurryDataSender: start upload data " + bArr + " with id = " + str + " to " + m9551a);
        C1247el c1247el = new C1247el();
        c1247el.m9258a(m9551a);
        c1247el.m9264a(C1251en.EnumC1255a.kPost);
        c1247el.m9257a("Content-Type", "application/octet-stream");
        c1247el.m9274a((InterfaceC1268ex) new C1267ew());
        c1247el.m9273a((C1247el) bArr);
        c1247el.m9277a((C1247el.InterfaceC1249a) new C1247el.InterfaceC1249a<byte[], Void>() { // from class: com.flurry.sdk.dd.1
            @Override // com.flurry.sdk.C1247el.InterfaceC1249a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo9266a(C1247el<byte[], Void> c1247el2, Void r6) {
                final int e = c1247el2.m9250e();
                if (e > 0) {
                    C1258eo.m9218d(C1180dd.f3759h, "FlurryDataSender: report " + str + " sent. HTTP response: " + e);
                    if (C1258eo.m9224c() <= 3 && C1258eo.m9220d()) {
                        C1211do.m9390a().m9388a(new Runnable() { // from class: com.flurry.sdk.dd.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Toast.makeText(C1211do.m9390a().m9386b(), "SD HTTP Response Code: " + e, 0).show();
                            }
                        });
                    }
                    C1180dd.this.mo9542a(str, str2, e);
                    C1180dd.this.m9534d();
                    return;
                }
                C1180dd.this.m9539b(str, str2);
            }
        });
        C1250em.m9265a().m9287a((Object) this, (C1180dd) c1247el);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.flurry.sdk.AbstractC1184de
    /* renamed from: a */
    public void mo9542a(String str, String str2, final int i) {
        m9545a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dd.2
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1195dj m9408c;
                if (i == 200 && (m9408c = C1206dl.m9414a().m9408c()) != null) {
                    m9408c.m9455b();
                }
            }
        });
        super.mo9542a(str, str2, i);
    }
}
