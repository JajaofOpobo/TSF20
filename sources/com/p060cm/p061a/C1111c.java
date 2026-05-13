package com.p060cm.p061a;

import android.content.Context;
import android.text.TextUtils;
import com.ksmobile.launcher.cmbase.utils.C1300b;
import com.p060cm.kinfoc.C1163o;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import com.p060cm.kinfoc.p062a.AbstractC1132d;
import com.p060cm.kinfoc.p062a.C1126a;
import com.tsf.shell.ShellApplication;
/* renamed from: com.cm.a.c */
/* loaded from: classes.dex */
public class C1111c extends AbstractC1132d {

    /* renamed from: d */
    private static C1111c f3558d = null;

    /* renamed from: b */
    private final String f3559b = "http://cml.ksmobile.com/api/controller.php";

    /* renamed from: c */
    private final String f3560c = "dpr_con";

    public C1111c() {
        this.f3598a = new C1126a.C1128a().m9789a(17000).m9787a(new C1126a.InterfaceC1129b<AbstractC1132d.C1134b>() { // from class: com.cm.a.c.1
            @Override // com.p060cm.kinfoc.p062a.C1126a.InterfaceC1129b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo9653a(AbstractC1132d.C1134b c1134b) {
                if (c1134b != null && c1134b.f3604a != null) {
                    switch (c1134b.f3605b) {
                        case 2:
                            C1111c.this.m9849b(c1134b.f3604a);
                            return;
                        default:
                            return;
                    }
                }
            }
        }).m9790a();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1132d
    /* renamed from: a */
    public void mo9743a(AbstractC1132d.InterfaceC1135c interfaceC1135c) {
        if (interfaceC1135c != null) {
            this.f3598a.m9793a((C1126a<AbstractC1132d.C1134b>) new AbstractC1132d.C1134b(2, interfaceC1135c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m9849b(AbstractC1132d.InterfaceC1135c interfaceC1135c) {
        byte[] bArr;
        String str;
        boolean z;
        if (interfaceC1135c != null) {
            Context m6152a = ShellApplication.m6152a();
            String[] split = C1121k.m9821a(m6152a).m9824a().split("-");
            boolean z2 = split.length < 2;
            long parseLong = Long.parseLong(split[0], 10);
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - parseLong > 14400000 || z2) && C1120j.m9825a(m6152a)) {
                try {
                    bArr = C1109a.m9855a(m9850a(AbstractC1132d.EnumC1133a.REP_PRIVATE_DATA));
                } catch (Exception e) {
                    e.printStackTrace();
                    bArr = null;
                }
                if (bArr == null || bArr.length <= 0) {
                    str = null;
                    z = false;
                } else {
                    str = new String(bArr);
                    z = true;
                }
                if (z && str.equals("dpr_con")) {
                    C1121k.m9821a(m6152a).m9822a(currentTimeMillis, "0");
                    interfaceC1135c.mo9612a(AbstractC1132d.EnumC1133a.REP_PRIVATE_DATA, false, null);
                    return;
                }
                C1121k.m9821a(m6152a).m9822a(currentTimeMillis, "1");
                interfaceC1135c.mo9612a(AbstractC1132d.EnumC1133a.REP_PRIVATE_DATA, true, null);
            } else if (z2) {
                interfaceC1135c.mo9612a(AbstractC1132d.EnumC1133a.REP_PRIVATE_DATA, true, null);
                C1121k.m9821a(m6152a).m9822a(currentTimeMillis, "1");
            } else {
                interfaceC1135c.mo9612a(AbstractC1132d.EnumC1133a.REP_PRIVATE_DATA, split[1].equalsIgnoreCase("1"), null);
            }
        }
    }

    /* renamed from: a */
    private String m9850a(AbstractC1132d.EnumC1133a enumC1133a) {
        String str = "http://cml.ksmobile.com/api/controller.php";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        switch (enumC1133a) {
            case REP_PRIVATE_DATA:
                return str + ("?language=" + C1163o.m9647c() + "&channel=" + AbstractC1130b.m9785A().mo9757p() + "&version=" + C1300b.m9053b() + "&mcc=" + C1163o.m9650a(ShellApplication.m6152a()));
            default:
                return str;
        }
    }
}
