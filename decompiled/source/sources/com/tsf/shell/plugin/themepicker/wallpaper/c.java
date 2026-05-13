package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.support.v4.app.r;
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
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putInt("PageIndex", i);
        bundle.putParcelable("resolveInfo", this.a.get(i));
        dVar.g(bundle);
        return dVar;
    }

    @Override // android.support.v4.view.ac
    public int b() {
        return this.a.size();
    }

    @Override // android.support.v4.view.ac
    public CharSequence c(int i) {
        String str = "";
        String[] split = this.a.get(i).loadLabel(this.b).toString().split(" ");
        for (int i2 = 0; i2 < split.length; i2++) {
            if (str.length() < 10) {
                str = str + split[i2] + " ";
            }
        }
        if (str.length() > 11) {
            str.subSequence(0, 10);
        }
        return str;
    }
}
