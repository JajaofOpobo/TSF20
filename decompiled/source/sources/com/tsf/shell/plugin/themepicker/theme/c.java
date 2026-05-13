package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.support.v4.app.r;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.i;
import java.util.List;
/* loaded from: classes.dex */
public class c extends r {
    private List<ResolveInfo> a;
    private PackageManager b;
    private Context c;

    public c(o oVar, List<ResolveInfo> list, Context context) {
        super(oVar);
        this.c = context;
        this.b = context.getPackageManager();
        this.a = list;
    }

    @Override // android.support.v4.app.r
    public Fragment a(int i) {
        if (i == 0) {
            return new b();
        }
        int i2 = i - 1;
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("PageIndex", i2);
        bundle.putParcelable("resolveInfo", this.a.get(i2));
        iVar.g(bundle);
        return iVar;
    }

    @Override // android.support.v4.view.ac
    public int b() {
        if (this.a != null) {
            return 1 + this.a.size();
        }
        return 1;
    }

    @Override // android.support.v4.view.ac
    public CharSequence c(int i) {
        if (i == 0) {
            return this.c.getString(f.j.theme_picker_system);
        }
        String str = "";
        String[] split = this.a.get(i - 1).loadLabel(this.b).toString().split(" ");
        for (int i2 = 0; i2 < split.length; i2++) {
            if (str.length() < 10) {
                str = str + split[i2] + " ";
            }
        }
        if (str.length() > 11) {
            str.subSequence(0, 10);
            return str;
        }
        return str;
    }
}
