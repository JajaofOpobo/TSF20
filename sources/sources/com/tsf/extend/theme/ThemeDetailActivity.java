package com.tsf.extend.theme;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.f;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeDetailActivity extends PageActivity {
    private com.tsf.extend.base.c.b g;
    private DIYThemeDetail e = null;
    private String f = "CURRENT_THEME_NONE";
    private List<a> h = Lists.newArrayList();
    private ServiceConnection i = new ServiceConnection() { // from class: com.tsf.extend.theme.ThemeDetailActivity.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ThemeDetailActivity.this.g = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThemeDetailActivity.this.g = (com.tsf.extend.base.c.b) iBinder;
            try {
                ThemeDetailActivity.this.f = ThemeDetailActivity.this.g.a();
                Iterator it = ThemeDetailActivity.this.h.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(ThemeDetailActivity.this.f);
                }
                ThemeDetailActivity.this.h.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private a.InterfaceC0048a<k> j = new a.InterfaceC0048a<k>() { // from class: com.tsf.extend.theme.ThemeDetailActivity.2
        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, k kVar) {
            ThemeDetailActivity.this.a(kVar);
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, k kVar) {
        }
    };

    public interface a {
        void a(String str);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    public com.tsf.extend.base.c.b c() {
        return this.g;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        getWindow().addFlags(ItemInfo.APP_VERSION_CODE);
        getWindow().addFlags(ItemInfo.APP_VERSION_NAME);
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                getWindow().addFlags(134217728);
                getWindow().addFlags(67108864);
            } catch (Exception e) {
            }
        }
        super.onCreate(bundle);
        com.tsf.extend.base.j.p.a((Activity) this);
        getApplicationContext().bindService(new Intent("android.service.theme.ManagerService"), this.i, 1);
        this.e = (DIYThemeDetail) LayoutInflater.from(this).inflate(f.C0052f.diy_theme_detail, (ViewGroup) null);
        this.e.setIsDIYCMT(true);
        a(this.e);
        this.e.setIsAutoApply(true);
        this.e.setFromInlet("9");
        k kVar = (k) getIntent().getSerializableExtra("theme");
        if (kVar != null) {
            this.e.setIsAutoDownload(true);
            a(kVar);
            return;
        }
        String stringExtra = getIntent().getStringExtra("diyid");
        if (stringExtra != null) {
            com.tsf.extend.theme.diy.e.a(stringExtra, this.j, this);
        } else {
            finish();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.g != null) {
            try {
                getApplicationContext().unbindService(this.i);
            } catch (Exception e) {
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    protected void a(Bundle bundle) {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, android.app.Activity
    public void onBackPressed() {
        if (this.e != null && b() == this.e) {
            if (!this.e.e()) {
                finish();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    public boolean a(String str, boolean z, com.tsf.extend.base.c.a aVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PACKAGE_NAME", str);
            if (str.startsWith("DIY://")) {
                Object objB = com.tsf.extend.theme.diy.e.b(str.substring("DIY://".length()) + File.separator + "diy.config", "isLocalDiy");
                if (objB instanceof Boolean) {
                    jSONObject.put("NO_ICON_GROUP", objB);
                }
                jSONObject.put("IS_USING_ONLINE_WALLPAPER", z);
                if (str.contains("_LP")) {
                    jSONObject.put("IS_3DTHEME", str.contains("_3D"));
                }
            }
        } catch (JSONException e) {
            Log.v("ThemeDetailActivity", "applyTheme err = " + e);
        }
        String string = jSONObject.toString();
        if (this.g != null) {
            this.g.a(string, aVar);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        if (kVar != null) {
            kVar.d(getResources().getString(f.g.shared_theme));
            this.e.setTheme(kVar);
            this.e.h();
        }
    }
}
