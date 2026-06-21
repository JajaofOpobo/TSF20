package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.k;
import android.support.v4.app.p;
import com.tsf.shell.plugin.themepicker.r;
import com.tsf.shell.plugin.themepicker.z;
import java.util.List;

/* loaded from: classes.dex */
public class d extends p {
    private List a;
    private PackageManager b;
    private Context c;

    public d(k kVar, List list, Context context) {
        super(kVar);
        this.c = context;
        this.b = context.getPackageManager();
        this.a = list;
    }

    @Override // android.support.v4.app.p
    public Fragment a(int i) {
        if (i == 0) {
            return new b();
        }
        int i2 = i - 1;
        z zVar = new z();
        Bundle bundle = new Bundle();
        bundle.putInt("PageIndex", i2);
        bundle.putParcelable("resolveInfo", (Parcelable) this.a.get(i2));
        zVar.g(bundle);
        return zVar;
    }

    @Override // android.support.v4.view.ad, com.tsf.shell.activity.actionselector.d
    public int b() {
        if (this.a != null) {
            return 1 + this.a.size();
        }
        return 1;
    }

    @Override // android.support.v4.view.ad
    public CharSequence c(int i) {
        if (i == 0) {
            return this.c.getString(r.theme_picker_system);
        }
        String str = "";
        for (String str2 : ((ResolveInfo) this.a.get(i - 1)).loadLabel(this.b).toString().split(" ")) {
            if (str.length() < 10) {
                str = String.valueOf(str) + str2 + " ";
            }
        }
        if (str.length() > 11) {
            str.subSequence(0, 10);
            return str;
        }
        return str;
    }
}
