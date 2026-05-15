package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.support.v4.app.r;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        for (String str2 : this.a.get(i).loadLabel(this.b).toString().split(" ")) {
            if (str.length() < 10) {
                str = str + str2 + " ";
            }
        }
        if (str.length() > 11) {
            str.subSequence(0, 10);
        }
        return str;
    }
}
