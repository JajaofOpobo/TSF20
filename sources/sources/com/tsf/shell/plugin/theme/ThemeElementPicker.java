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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    private ArrayList<c> a(int i) {
        ArrayList<c> arrayList = new ArrayList<>();
        for (ThemeListsManager.ThemeInfo themeInfo : this.b.refreshThemeList()) {
            try {
                Context contextCreatePackageContext = com.censivn.C3DEngine.a.d().createPackageContext(themeInfo.packagename, 3);
                if (ThemeElementChecker.isElementAbailable(contextCreatePackageContext, i)) {
                    c cVar = new c(i, themeInfo.name, themeInfo.packagename);
                    cVar.b = contextCreatePackageContext;
                    arrayList.add(cVar);
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return arrayList;
    }

    public void a(c cVar) {
        this.a.putExtra("packagename", cVar.d);
        setResult(-1, this.a);
        finish();
    }
}
