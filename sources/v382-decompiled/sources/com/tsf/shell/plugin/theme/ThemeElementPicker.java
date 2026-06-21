package com.tsf.shell.plugin.theme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemesMixManager;
import com.tsf.shell.theme.inside.element.ThemeElementChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemeElementPicker extends Activity {
    private Intent a = null;
    private ThemeListsManager b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        com.censivn.C3DEngine.a.a(this, "ThemeElementPicker");
        requestWindowFeature(1);
        this.a = getIntent();
        int intExtra = this.a.getIntExtra("type", -1);
        this.b = new ThemeListsManager(this);
        new b(this).a(a(intExtra), ThemesMixManager.getTypeTitle(this, intExtra));
    }

    private ArrayList a(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.refreshThemeList().iterator();
        while (it.hasNext()) {
            ThemeListsManager.ThemeInfo themeInfo = (ThemeListsManager.ThemeInfo) it.next();
            try {
                Context createPackageContext = com.censivn.C3DEngine.a.d().createPackageContext(themeInfo.packagename, 3);
                if (ThemeElementChecker.isElementAbailable(createPackageContext, i)) {
                    e eVar = new e(i, themeInfo.name, themeInfo.packagename);
                    eVar.b = createPackageContext;
                    arrayList.add(eVar);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return arrayList;
    }

    public void a(e eVar) {
        this.a.putExtra("packagename", eVar.d);
        setResult(-1, this.a);
        finish();
    }
}
