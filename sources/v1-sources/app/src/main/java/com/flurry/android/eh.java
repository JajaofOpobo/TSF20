package com.flurry.android;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class eh {
    private static String a = "FlurryAgent";
    private s b;

    eh(s sVar) {
        this.b = sVar;
    }

    private static boolean a(String str, String str2) {
        return str2.equals("%{" + str + "}");
    }

    final String a(dl dlVar, j jVar, String str, String str2) {
        String str3;
        if (a("fids", str2)) {
            String str4 = "0:" + this.b.h();
            Cdo.a(a, "Replacing param fids with: " + str4);
            return str.replace(str2, bp.b(str4));
        }
        if (a("sid", str2)) {
            String valueOf = String.valueOf(this.b.e());
            Cdo.a(a, "Replacing param sid with: " + valueOf);
            return str.replace(str2, bp.b(valueOf));
        }
        if (a("lid", str2)) {
            String valueOf2 = String.valueOf(dlVar.a());
            Cdo.a(a, "Replacing param lid with: " + valueOf2);
            return str.replace(str2, bp.b(valueOf2));
        }
        if (a("guid", str2)) {
            String b = dlVar.b();
            Cdo.a(a, "Replacing param guid with: " + b);
            return str.replace(str2, bp.b(b));
        }
        if (a("ats", str2)) {
            String valueOf3 = String.valueOf(System.currentTimeMillis());
            Cdo.a(a, "Replacing param ats with: " + valueOf3);
            return str.replace(str2, bp.b(valueOf3));
        }
        if (a("apik", str2)) {
            String f = s.f();
            Cdo.a(a, "Replacing param apik with: " + f);
            return str.replace(str2, bp.b(f));
        }
        if (a("hid", str2)) {
            String obj = jVar.b().toString();
            Cdo.a(a, "Replacing param hid with: " + obj);
            return str.replace(str2, bp.b(obj));
        }
        if (a("eso", str2)) {
            String l = Long.toString(System.currentTimeMillis() - this.b.e());
            Cdo.a(a, "Replacing param eso with: " + l);
            return str.replace(str2, bp.b(l));
        }
        if (a("uc", str2)) {
            String str5 = "";
            Iterator it = this.b.i().entrySet().iterator();
            while (true) {
                str3 = str5;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                str5 = str3 + "c_" + bp.b((String) entry.getKey()) + "=" + bp.b((String) entry.getValue()) + "&";
            }
            Cdo.a(a, "Replacing param uc with: " + str3);
            String replace = str.replace(str2, str3);
            if (str3.equals("") && replace.length() > 0) {
                return replace.substring(0, replace.length() - 1);
            }
            return replace;
        }
        Cdo.a(a, "Unknown param: " + str2);
        return str.replace(str2, "");
    }
}
