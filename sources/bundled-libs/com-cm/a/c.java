package com.cm.a;

import android.content.Context;
import android.text.TextUtils;
import com.cm.kinfoc.a.a;
import com.cm.kinfoc.a.d;
import com.cm.kinfoc.o;
import com.tsf.shell.ShellApplication;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.cm.kinfoc.a.d {
    private static c d = null;
    private final String b = "http://cml.ksmobile.com/api/controller.php";
    private final String c = "dpr_con";

    public c() {
        this.a = new a.C0041a().a(17000).a(new a.b<d.b>() { // from class: com.cm.a.c.1
            @Override // com.cm.kinfoc.a.a.b
            public void a(d.b bVar) {
                if (bVar != null && bVar.a != null) {
                    switch (bVar.b) {
                        case 2:
                            c.this.b(bVar.a);
                            break;
                    }
                }
            }
        }).a();
    }

    @Override // com.cm.kinfoc.a.d
    public void a(d.c cVar) {
        if (cVar != null) {
            this.a.a(new d.b(2, cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d.c cVar) {
        byte[] bArrA;
        String str;
        boolean z;
        if (cVar != null) {
            Context contextA = ShellApplication.a();
            String[] strArrSplit = k.a(contextA).a().split("-");
            boolean z2 = strArrSplit.length < 2;
            long j = Long.parseLong(strArrSplit[0], 10);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ((jCurrentTimeMillis - j > 14400000 || z2) && j.a(contextA)) {
                try {
                    bArrA = a.a(a(d.a.REP_PRIVATE_DATA));
                } catch (Exception e) {
                    e.printStackTrace();
                    bArrA = null;
                }
                if (bArrA == null || bArrA.length <= 0) {
                    str = null;
                    z = false;
                } else {
                    str = new String(bArrA);
                    z = true;
                }
                if (z && str.equals("dpr_con")) {
                    k.a(contextA).a(jCurrentTimeMillis, "0");
                    cVar.a(d.a.REP_PRIVATE_DATA, false, null);
                    return;
                } else {
                    k.a(contextA).a(jCurrentTimeMillis, "1");
                    cVar.a(d.a.REP_PRIVATE_DATA, true, null);
                    return;
                }
            }
            if (z2) {
                cVar.a(d.a.REP_PRIVATE_DATA, true, null);
                k.a(contextA).a(jCurrentTimeMillis, "1");
            } else {
                cVar.a(d.a.REP_PRIVATE_DATA, strArrSplit[1].equalsIgnoreCase("1"), null);
            }
        }
    }

    private String a(d.a aVar) {
        String str = "http://cml.ksmobile.com/api/controller.php";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        switch (aVar) {
            case REP_PRIVATE_DATA:
                return str + ("?language=" + o.c() + "&channel=" + com.cm.kinfoc.a.b.A().p() + "&version=" + com.ksmobile.launcher.cmbase.utils.b.b() + "&mcc=" + o.a(ShellApplication.a()));
            default:
                return str;
        }
    }
}
