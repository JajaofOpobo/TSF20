package com.tsf.shell.plugin.theme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemesMixManager;
import com.tsf.shell.theme.inside.element.ThemeElementChecker;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemeElementPicker extends Activity {

    /* renamed from: a */
    private Intent f12569a = null;

    /* renamed from: b */
    private ThemeListsManager f12570b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        C0853a.m10863a(this, "ThemeElementPicker");
        requestWindowFeature(1);
        this.f12569a = getIntent();
        int intExtra = this.f12569a.getIntExtra("type", -1);
        this.f12570b = new ThemeListsManager(this);
        new C3832b(this).m1346a(m1349a(intExtra), ThemesMixManager.getTypeTitle(this, intExtra));
    }

    /* renamed from: a */
    private ArrayList<C3835c> m1349a(int i) {
        ArrayList<C3835c> arrayList = new ArrayList<>();
        Iterator<ThemeListsManager.ThemeInfo> it = this.f12570b.refreshThemeList().iterator();
        while (it.hasNext()) {
            ThemeListsManager.ThemeInfo next = it.next();
            try {
                Context createPackageContext = C0853a.m10856d().createPackageContext(next.packagename, 3);
                if (ThemeElementChecker.isElementAbailable(createPackageContext, i)) {
                    C3835c c3835c = new C3835c(i, next.name, next.packagename);
                    c3835c.f12579b = createPackageContext;
                    arrayList.add(c3835c);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m1348a(C3835c c3835c) {
        this.f12569a.putExtra("packagename", c3835c.f12581d);
        setResult(-1, this.f12569a);
        finish();
    }
}
