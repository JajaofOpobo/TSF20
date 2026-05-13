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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p073c.AbstractBinderC1381b;
import com.tsf.extend.base.p073c.InterfaceC1380a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.theme.diy.C1821e;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeDetailActivity extends PageActivity {

    /* renamed from: g */
    private AbstractBinderC1381b f5177g;

    /* renamed from: e */
    private DIYThemeDetail f5175e = null;

    /* renamed from: f */
    private String f5176f = "CURRENT_THEME_NONE";

    /* renamed from: h */
    private List<InterfaceC1622a> f5178h = Lists.newArrayList();

    /* renamed from: i */
    private ServiceConnection f5179i = new ServiceConnection() { // from class: com.tsf.extend.theme.ThemeDetailActivity.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ThemeDetailActivity.this.f5177g = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThemeDetailActivity.this.f5177g = (AbstractBinderC1381b) iBinder;
            try {
                ThemeDetailActivity.this.f5176f = ThemeDetailActivity.this.f5177g.mo7565a();
                for (InterfaceC1622a interfaceC1622a : ThemeDetailActivity.this.f5178h) {
                    interfaceC1622a.m8011a(ThemeDetailActivity.this.f5176f);
                }
                ThemeDetailActivity.this.f5178h.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    /* renamed from: j */
    private AbstractC1386a.InterfaceC1396a<C1848k> f5180j = new AbstractC1386a.InterfaceC1396a<C1848k>() { // from class: com.tsf.extend.theme.ThemeDetailActivity.2
        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1848k c1848k) {
            ThemeDetailActivity.this.m8017a(c1848k);
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1848k c1848k) {
        }
    };

    /* renamed from: com.tsf.extend.theme.ThemeDetailActivity$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1622a {
        /* renamed from: a */
        void m8011a(String str);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    /* renamed from: c */
    public AbstractBinderC1381b mo6732c() {
        return this.f5177g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
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
        C1437p.m8622a((Activity) this);
        getApplicationContext().bindService(new Intent("android.service.theme.ManagerService"), this.f5179i, 1);
        this.f5175e = (DIYThemeDetail) LayoutInflater.from(this).inflate(C1536f.C1542f.diy_theme_detail, (ViewGroup) null);
        this.f5175e.setIsDIYCMT(true);
        m8922a(this.f5175e);
        this.f5175e.setIsAutoApply(true);
        this.f5175e.setFromInlet("9");
        C1848k c1848k = (C1848k) getIntent().getSerializableExtra("theme");
        if (c1848k != null) {
            this.f5175e.setIsAutoDownload(true);
            m8017a(c1848k);
            return;
        }
        String stringExtra = getIntent().getStringExtra("diyid");
        if (stringExtra != null) {
            C1821e.m7392a(stringExtra, this.f5180j, this);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f5177g != null) {
            try {
                getApplicationContext().unbindService(this.f5179i);
            } catch (Exception e) {
            }
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    /* renamed from: a */
    protected void mo6742a(Bundle bundle) {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f5175e != null && m8920b() == this.f5175e) {
            if (!this.f5175e.mo6529e()) {
                finish();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: a */
    public boolean m8016a(String str, boolean z, InterfaceC1380a interfaceC1380a) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PACKAGE_NAME", str);
            if (str.startsWith("DIY://")) {
                Object m7385b = C1821e.m7385b(str.substring("DIY://".length()) + File.separator + "diy.config", "isLocalDiy");
                if (m7385b instanceof Boolean) {
                    jSONObject.put("NO_ICON_GROUP", m7385b);
                }
                jSONObject.put("IS_USING_ONLINE_WALLPAPER", z);
                if (str.contains("_LP")) {
                    jSONObject.put("IS_3DTHEME", str.contains("_3D"));
                }
            }
        } catch (JSONException e) {
            Log.v("ThemeDetailActivity", "applyTheme err = " + e);
        }
        String jSONObject2 = jSONObject.toString();
        if (this.f5177g != null) {
            this.f5177g.mo7563a(jSONObject2, interfaceC1380a);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8017a(C1848k c1848k) {
        if (c1848k != null) {
            c1848k.m7307d(getResources().getString(C1536f.C1543g.shared_theme));
            this.f5175e.setTheme(c1848k);
            this.f5175e.m8209h();
        }
    }
}
