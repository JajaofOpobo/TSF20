package com.tsf.extend.wallpaper;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.google.android.collect.Lists;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.C1367b;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p071b.InterfaceC1373b;
import com.tsf.extend.base.p073c.AbstractBinderC1381b;
import com.tsf.extend.base.p073c.InterfaceC1380a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.keyboard.C1558a;
import com.tsf.extend.theme.C1696ao;
import com.tsf.extend.theme.C1844h;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.C1920x;
import com.tsf.extend.theme.ThemeAlbumsPager;
import com.tsf.extend.theme.ThemeDetail;
import com.tsf.extend.theme.core.ThemeManagerService;
import com.tsf.extend.theme.diy.C1819d;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.wallpaper.p085a.C2021a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.acra.ACRAConstants;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"InflateParams"})
@TargetApi(19)
/* loaded from: classes.dex */
public class PersonalizationActivity extends PageActivity implements C1819d.InterfaceC1820a {

    /* renamed from: e */
    public static boolean f6215e = true;

    /* renamed from: f */
    public int f6216f;

    /* renamed from: l */
    private C1941a f6222l;

    /* renamed from: m */
    private AbstractBinderC1381b f6223m;

    /* renamed from: p */
    private C1819d f6226p;

    /* renamed from: q */
    private boolean f6227q;

    /* renamed from: s */
    private boolean f6229s;

    /* renamed from: t */
    private ComponentName f6230t;

    /* renamed from: u */
    private Runnable f6231u;

    /* renamed from: v */
    private Runnable f6232v;

    /* renamed from: x */
    private C1943c f6234x;

    /* renamed from: i */
    private PersonalizationPager f6219i = null;

    /* renamed from: j */
    private long f6220j = 0;

    /* renamed from: k */
    private List<InterfaceC1954n> f6221k = Lists.newArrayList();

    /* renamed from: n */
    private String f6224n = "CURRENT_THEME_NONE";

    /* renamed from: o */
    private List<InterfaceC1942b> f6225o = Lists.newArrayList();

    /* renamed from: r */
    private boolean f6228r = false;

    /* renamed from: w */
    private boolean f6233w = false;

    /* renamed from: y */
    private ServiceConnection f6235y = new ServiceConnection() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            PersonalizationActivity.this.f6223m = null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
        @Override // android.content.ServiceConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onServiceConnected(android.content.ComponentName r9, android.os.IBinder r10) {
            /*
                r8 = this;
                r3 = 1
                r1 = 0
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this
                com.tsf.extend.base.c.b r10 = (com.tsf.extend.base.p073c.AbstractBinderC1381b) r10
                com.tsf.extend.wallpaper.PersonalizationActivity.m7000a(r0, r10)
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r2 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.base.c.b r2 = com.tsf.extend.wallpaper.PersonalizationActivity.m7002a(r2)     // Catch: java.lang.Exception -> L47
                java.lang.String r2 = r2.mo7565a()     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity.m6998a(r0, r2)     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r2 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.base.c.b r2 = com.tsf.extend.wallpaper.PersonalizationActivity.m7002a(r2)     // Catch: java.lang.Exception -> L47
                boolean r2 = r2.mo7560d()     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity.m6996a(r0, r2)     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                java.util.List r0 = com.tsf.extend.wallpaper.PersonalizationActivity.m6986b(r0)     // Catch: java.lang.Exception -> L47
                java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L47
            L31:
                boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L47
                if (r0 == 0) goto L7d
                java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity$b r0 = (com.tsf.extend.wallpaper.PersonalizationActivity.InterfaceC1942b) r0     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r4 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                java.lang.String r4 = com.tsf.extend.wallpaper.PersonalizationActivity.m6981c(r4)     // Catch: java.lang.Exception -> L47
                r0.mo6959a(r4)     // Catch: java.lang.Exception -> L47
                goto L31
            L47:
                r0 = move-exception
                r0.printStackTrace()
            L4b:
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L87
                com.tsf.extend.base.c.b r0 = com.tsf.extend.wallpaper.PersonalizationActivity.m7002a(r0)     // Catch: java.lang.Exception -> L87
                if (r0 == 0) goto L8b
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L87
                com.tsf.extend.base.c.b r0 = com.tsf.extend.wallpaper.PersonalizationActivity.m7002a(r0)     // Catch: java.lang.Exception -> L87
                boolean r0 = r0.mo7561c()     // Catch: java.lang.Exception -> L87
            L5d:
                int[] r5 = com.tsf.extend.theme.ThemeDetail.f5071b
                int r6 = r5.length
                r4 = r1
            L61:
                if (r4 >= r6) goto L8f
                r2 = r5[r4]
                com.tsf.extend.wallpaper.PersonalizationActivity r7 = com.tsf.extend.wallpaper.PersonalizationActivity.this
                android.view.View r7 = r7.findViewById(r2)
                if (r7 == 0) goto L79
                com.tsf.extend.wallpaper.PersonalizationActivity r7 = com.tsf.extend.wallpaper.PersonalizationActivity.this
                android.view.View r7 = r7.findViewById(r2)
                if (r0 != 0) goto L8d
                r2 = r3
            L76:
                r7.setSoundEffectsEnabled(r2)
            L79:
                int r2 = r4 + 1
                r4 = r2
                goto L61
            L7d:
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                java.util.List r0 = com.tsf.extend.wallpaper.PersonalizationActivity.m6986b(r0)     // Catch: java.lang.Exception -> L47
                r0.clear()     // Catch: java.lang.Exception -> L47
                goto L4b
            L87:
                r0 = move-exception
                r0.printStackTrace()
            L8b:
                r0 = r1
                goto L5d
            L8d:
                r2 = r1
                goto L76
            L8f:
                int[] r5 = com.tsf.extend.wallpaper.PersonalizationPager.f6264a
                int r6 = r5.length
                r4 = r1
            L93:
                if (r4 >= r6) goto Lb1
                r2 = r5[r4]
                com.tsf.extend.wallpaper.PersonalizationActivity r7 = com.tsf.extend.wallpaper.PersonalizationActivity.this
                android.view.View r7 = r7.findViewById(r2)
                if (r7 == 0) goto Lab
                com.tsf.extend.wallpaper.PersonalizationActivity r7 = com.tsf.extend.wallpaper.PersonalizationActivity.this
                android.view.View r7 = r7.findViewById(r2)
                if (r0 != 0) goto Laf
                r2 = r3
            La8:
                r7.setSoundEffectsEnabled(r2)
            Lab:
                int r2 = r4 + 1
                r4 = r2
                goto L93
            Laf:
                r2 = r1
                goto La8
            Lb1:
                int[] r5 = com.tsf.extend.base.view.PagerIndicator.f4556b
                int r6 = r5.length
                r4 = r1
            Lb5:
                if (r4 >= r6) goto Ld3
                r2 = r5[r4]
                com.tsf.extend.wallpaper.PersonalizationActivity r7 = com.tsf.extend.wallpaper.PersonalizationActivity.this
                android.view.View r7 = r7.findViewById(r2)
                if (r7 == 0) goto Lcd
                com.tsf.extend.wallpaper.PersonalizationActivity r7 = com.tsf.extend.wallpaper.PersonalizationActivity.this
                android.view.View r7 = r7.findViewById(r2)
                if (r0 != 0) goto Ld1
                r2 = r3
            Lca:
                r7.setSoundEffectsEnabled(r2)
            Lcd:
                int r2 = r4 + 1
                r4 = r2
                goto Lb5
            Ld1:
                r2 = r1
                goto Lca
            Ld3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.PersonalizationActivity.ServiceConnectionC19371.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }
    };

    /* renamed from: g */
    Runnable f6217g = new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.3
        @Override // java.lang.Runnable
        public void run() {
            PersonalizationActivity.this.m6964n();
        }
    };

    /* renamed from: h */
    Runnable f6218h = new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.4
        @Override // java.lang.Runnable
        public void run() {
            PersonalizationActivity.this.m6961q();
        }
    };

    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1942b {
        /* renamed from: a */
        void mo6959a(String str);
    }

    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$h */
    /* loaded from: classes.dex */
    public interface InterfaceC1948h {
        /* renamed from: b */
        void mo6947b(boolean z);
    }

    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$i */
    /* loaded from: classes.dex */
    public interface InterfaceC1949i {
        /* renamed from: a */
        void mo6726a(AbsListView absListView, int i);
    }

    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$n */
    /* loaded from: classes.dex */
    public interface InterfaceC1954n {

        /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$n$a */
        /* loaded from: classes.dex */
        public enum EnumC1955a {
            REMOVE,
            ADD
        }

        /* renamed from: a */
        void mo6940a(String str, EnumC1955a enumC1955a);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    /* renamed from: c */
    public AbstractBinderC1381b mo6732c() {
        return this.f6223m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        File file;
        String str;
        C1437p.m8622a((Activity) this);
        C2021a.m6705a(this);
        C2148z.m6199h();
        getWindow().addFlags(ItemInfo.APP_VERSION_CODE);
        getWindow().addFlags(ItemInfo.APP_VERSION_NAME);
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                getWindow().addFlags(67108864);
            } catch (Exception e) {
            }
        }
        super.onCreate(bundle);
        m6982c((Context) this);
        C2026aa.m6695a().m6694a(getApplicationContext());
        this.f6216f = C1437p.m8615c(this);
        C1367b.m8876a(getIntent().getStringExtra("theme_entry"));
        int intExtra = getIntent().getIntExtra("target", 1);
        f6215e = m7013a((Context) this).getInt("use_new_icon", 2) == 2;
        this.f6233w = getIntent().getBooleanExtra("isPro", false);
        this.f6219i = (PersonalizationPager) LayoutInflater.from(this).inflate(C1536f.C1542f.personalize_group, (ViewGroup) null);
        if (intExtra == 1) {
            if (getIntent().getStringExtra("inlet") == null) {
            }
            if (getIntent().getStringExtra("pushid") == null) {
            }
        } else if (intExtra == 2 || intExtra == 4) {
            String stringExtra = getIntent().getStringExtra("inlet");
            String stringExtra2 = getIntent().getStringExtra("pushid");
            if (stringExtra == null) {
                stringExtra = "0";
            }
            if (!TextUtils.isEmpty(m6995a(stringExtra))) {
            }
            if (stringExtra2 == null) {
            }
            if (intExtra != 2 || this.f6219i.getThemeSecondTab() == null) {
            }
        } else if (intExtra != 3 || getIntent().getStringExtra("inlet") == null) {
        }
        this.f6219i.m6937a(intExtra, getIntent().getStringExtra("tab_select_index"));
        this.f6219i.m6939a(intExtra);
        this.f6219i.setPadding(0, this.f6219i.getPaddingTop(), 0, this.f6216f);
        m8922a(this.f6219i);
        this.f6222l = new C1941a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.f6222l, intentFilter);
        getApplicationContext().bindService(new Intent(this, ThemeManagerService.class), this.f6235y, 1);
        if (intExtra == 2) {
            String stringExtra3 = getIntent().getStringExtra("id");
            String stringExtra4 = getIntent().getStringExtra("inlet");
            if (C1844h.m7341a(stringExtra4)) {
                String m7340b = C1844h.m7340b(stringExtra4);
                if (m7340b == null) {
                    m7340b = "";
                }
                m6993a(stringExtra3, m7340b, false, stringExtra4);
            }
        } else if (intExtra == 4) {
            String stringExtra5 = getIntent().getStringExtra("id");
            String stringExtra6 = getIntent().getStringExtra("inlet");
            if (("5".equals(stringExtra6) || "4".equals(stringExtra6) || "2".equals(stringExtra6)) && !"theme_push_notifition_invalid".equals(stringExtra5)) {
                ThemeAlbumsPager themeAlbumsPager = (ThemeAlbumsPager) LayoutInflater.from(this).inflate(C1536f.C1542f.theme_albums_list, (ViewGroup) null);
                themeAlbumsPager.m8164a(stringExtra5, (String) null, "105");
                m8922a((PageActivity.InterfaceC1352a) themeAlbumsPager);
            }
        }
        m7010a(getIntent());
        try {
            if (f6215e) {
                file = new File(getFilesDir().getAbsolutePath(), "diy_theme_default_3d.png");
                str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
            } else {
                file = new File(getFilesDir().getAbsolutePath(), "diy_theme_default_3d.png");
                str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
            }
            if (!file.exists()) {
                this.f6226p = new C1819d(this);
                C1894v.m7069h().m8801a(str, this.f6226p);
            }
        } catch (Throwable th) {
        }
        C1696ao.m7774b().m7778a(new C1953m(this));
        C1696ao.m7774b().m7780a();
        if (C1696ao.m7774b().m7771e()) {
            m7014a(2000);
            m6962p();
        }
        m6990b(500);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f6228r) {
            this.f6228r = false;
            finish();
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: a */
    public void m6993a(String str, String str2, boolean z, String str3) {
        try {
            long parseLong = Long.parseLong(str);
            ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(this).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
            themeDetail.m8108a(parseLong, str2, z, str3);
            if ("2".equals(str3)) {
                themeDetail.setFromInlet("5");
            }
            if (C1844h.m7341a(str3)) {
                themeDetail.setFromTab(str2);
            }
            m6994a(str3, themeDetail);
            m8922a((PageActivity.InterfaceC1352a) themeDetail);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private String m6995a(String str) {
        boolean equals = "theme_promotion_menu".equals(str);
        boolean equals2 = "theme_push_desk_icon".equals(str);
        boolean equals3 = "theme_promotion_allapp".equals(str);
        boolean equals4 = "theme_promotion_weather".equals(str);
        if (!equals && !equals2 && !equals3 && !equals4) {
            return "";
        }
        if (equals2) {
            return "11";
        }
        if (equals3) {
            return "12";
        }
        if (equals4) {
            return "13";
        }
        if (!equals) {
            return "";
        }
        return "14";
    }

    /* renamed from: a */
    private void m6994a(String str, ThemeDetail themeDetail) {
        String m6995a = m6995a(str);
        if (!TextUtils.isEmpty(m6995a)) {
            themeDetail.setFromInlet(m6995a);
        }
    }

    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$a */
    /* loaded from: classes.dex */
    class C1941a extends BroadcastReceiver {
        C1941a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ArrayList<InterfaceC1954n> newArrayList = Lists.newArrayList();
            newArrayList.addAll(PersonalizationActivity.this.f6221k);
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                C1894v.m7069h();
                if (C1894v.m7075e(schemeSpecificPart)) {
                    for (InterfaceC1954n interfaceC1954n : newArrayList) {
                        interfaceC1954n.mo6940a(schemeSpecificPart, InterfaceC1954n.EnumC1955a.ADD);
                    }
                }
            } else if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                for (InterfaceC1954n interfaceC1954n2 : newArrayList) {
                    interfaceC1954n2.mo6940a(schemeSpecificPart, InterfaceC1954n.EnumC1955a.REMOVE);
                }
            }
        }
    }

    /* renamed from: a */
    public void m7003a(InterfaceC1954n interfaceC1954n) {
        this.f6221k.add(interfaceC1954n);
    }

    /* renamed from: b */
    public void m6987b(InterfaceC1954n interfaceC1954n) {
        this.f6221k.remove(interfaceC1954n);
    }

    /* renamed from: a */
    public void m7004a(InterfaceC1954n.EnumC1955a enumC1955a) {
        for (InterfaceC1954n interfaceC1954n : this.f6221k) {
            interfaceC1954n.mo6940a(null, enumC1955a);
        }
    }

    /* renamed from: e */
    public PersonalizationPager m6978e() {
        return this.f6219i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m7004a((InterfaceC1954n.EnumC1955a) null);
        this.f6220j = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f6220j) / 1000);
        this.f6220j = 0L;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    /* renamed from: a */
    protected void mo6742a(Bundle bundle) {
        if (bundle != null) {
        }
    }

    /* renamed from: b */
    public void m6983b(boolean z) {
        if (z) {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
            return;
        }
        getWindow().addFlags(2048);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m6980d((Context) this);
        C1696ao.m7774b().m7778a((C1696ao.InterfaceC1698a) null);
        C2148z.m6199h().mo6200f();
        C1894v.m7069h().mo6200f();
        C2021a.m6702b(this);
        this.f6219i = null;
        this.f6221k.clear();
        if (this.f6222l != null) {
            try {
                unregisterReceiver(this.f6222l);
            } catch (Exception e) {
            }
        }
        if (this.f6223m != null) {
            try {
                getApplicationContext().unbindService(this.f6235y);
            } catch (Exception e2) {
            }
        }
        m6989b((Context) this);
        C1367b.m8876a("");
        this.f6229s = true;
        if (this.f6231u != null) {
            C1455z.m8562b(0, this.f6231u);
            this.f6231u = null;
        }
        if (this.f6232v != null) {
            C1455z.m8562b(0, this.f6232v);
            this.f6232v = null;
        }
        C1920x.m7053a();
        m6967k();
        m6966l();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f6219i.m6938a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public static int m7012a(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    /* renamed from: a */
    public boolean m6992a(String str, boolean z, InterfaceC1380a interfaceC1380a) {
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
        }
        String jSONObject2 = jSONObject.toString();
        if (this.f6223m != null) {
            this.f6223m.mo7563a(jSONObject2, interfaceC1380a);
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m6976f() {
        return this.f6224n;
    }

    /* renamed from: a */
    public void m7005a(InterfaceC1942b interfaceC1942b) {
        if (!"CURRENT_THEME_NONE".equals(this.f6224n)) {
            interfaceC1942b.mo6959a(this.f6224n);
        } else {
            this.f6225o.add(interfaceC1942b);
        }
    }

    /* renamed from: b */
    public boolean m6988b(InterfaceC1942b interfaceC1942b) {
        return this.f6225o.remove(interfaceC1942b);
    }

    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$f */
    /* loaded from: classes.dex */
    public static class C1946f {

        /* renamed from: b */
        private View f6247b;

        /* renamed from: a */
        private AnimatorSet f6246a = null;

        /* renamed from: c */
        private boolean f6248c = true;

        /* renamed from: d */
        private long f6249d = 20;

        /* renamed from: e */
        private long f6250e = 0;

        /* renamed from: f */
        private float f6251f = 0.0f;

        /* renamed from: g */
        private float f6252g = 0.0f;

        public C1946f(View view) {
            this.f6247b = null;
            this.f6247b = view;
        }

        /* renamed from: a */
        public void m6954a() {
            if (this.f6247b != null && this.f6248c) {
                if (this.f6247b.getVisibility() != 0) {
                    this.f6247b.setVisibility(0);
                }
                if (this.f6246a != null) {
                    this.f6246a.cancel();
                }
                this.f6248c = false;
                this.f6246a = new AnimatorSet();
                this.f6251f = this.f6247b.getTranslationY();
                this.f6252g = C1430i.m8659a((float) this.f6249d);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6247b, "translationY", this.f6251f, this.f6252g);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6247b, "alpha", 1.0f, 0.5f);
                this.f6246a.setDuration(this.f6250e);
                this.f6246a.playTogether(ofFloat, ofFloat2);
                this.f6246a.start();
            }
        }

        /* renamed from: b */
        public void m6952b() {
            if (this.f6247b != null && !this.f6248c) {
                if (this.f6246a != null) {
                    this.f6246a.cancel();
                }
                if (this.f6247b.getVisibility() != 0) {
                    this.f6247b.setVisibility(0);
                }
                this.f6248c = true;
                this.f6246a = new AnimatorSet();
                this.f6251f = this.f6247b.getTranslationY();
                this.f6252g = -C1430i.m8659a((float) this.f6249d);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6247b, "translationY", this.f6251f, this.f6252g);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6247b, "alpha", 0.5f, 1.0f);
                this.f6246a.setDuration(this.f6250e);
                this.f6246a.playTogether(ofFloat, ofFloat2);
                this.f6246a.start();
            }
        }

        /* renamed from: c */
        public void m6950c() {
            if (this.f6247b != null && !this.f6248c) {
                this.f6248c = true;
                this.f6247b.setAlpha(1.0f);
                this.f6247b.setTranslationY(-C1430i.m8659a((float) this.f6249d));
            }
        }

        /* renamed from: a */
        public void m6953a(long j) {
            this.f6250e = j;
        }

        /* renamed from: b */
        public void m6951b(long j) {
            this.f6249d = j;
        }
    }

    /* renamed from: a */
    public static void m7011a(Context context, String str, String str2, String str3, boolean z) {
        Intent intent = new Intent(context, PersonalizationActivity.class);
        intent.putExtra("target", z ? 2 : 4);
        intent.putExtra("inlet", str);
        intent.putExtra("id", str2);
        intent.putExtra("pushid", str3);
        intent.putExtra("theme_entry", C1367b.m8879a());
        intent.putExtra("isPro", false);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        m7010a(intent);
    }

    /* renamed from: a */
    private void m7010a(Intent intent) {
        this.f6230t = (ComponentName) intent.getParcelableExtra("from_live_wallpaper_app");
        if (this.f6230t != null) {
            if (this.f6219i != null) {
                this.f6219i.setChildPagerDefIndex(1);
            }
            C1920x.m7050a("cml_themelist_wpapk_more");
        }
        switch (intent.getIntExtra("TARGET_PAGE", 0)) {
            case 1:
                if (this.f6219i != null) {
                    this.f6219i.setTabIndex(1);
                    break;
                }
                break;
            case 2:
                if (this.f6219i != null) {
                    this.f6219i.setTabIndex(2);
                    break;
                }
                break;
        }
        if (5 == intent.getIntExtra("target", 1) && this.f6219i != null) {
            if ("10".equals(intent.getStringExtra("type"))) {
                this.f6228r = true;
            }
            this.f6219i.m6936a(intent);
        }
    }

    @Override // com.tsf.extend.theme.diy.C1819d.InterfaceC1820a
    /* renamed from: a */
    public void mo7009a(Bitmap bitmap) {
        if (bitmap != null) {
            C1894v.m7069h();
            C1894v.m7109a(this, bitmap);
        }
    }

    /* renamed from: a */
    public static SharedPreferences m7013a(Context context) {
        return context.getSharedPreferences("multi_shared_perfs", 4);
    }

    /* renamed from: b */
    public static void m6989b(Context context) {
        InputMethodManager inputMethodManager;
        int i = 0;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        String[] strArr = {"mCurRootView", "mServedView", "mNextServedView", "mLastSrvView"};
        while (true) {
            int i2 = i;
            if (i2 < strArr.length) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i2]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof View)) {
                        View view = (View) obj;
                        if (view != null && view.getContext() == context) {
                            declaredField.set(inputMethodManager, null);
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th) {
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public boolean m6974g() {
        return this.f6227q;
    }

    /* renamed from: h */
    public void m6972h() {
        if (this.f6219i != null) {
            m8918d();
            this.f6219i.setTabIndex(1);
            this.f6219i.m6931j();
        }
    }

    /* renamed from: a */
    public void m7008a(final C1368a c1368a, final C1368a c1368a2) {
        if (this.f6231u != null) {
            C1455z.m8562b(0, this.f6231u);
            this.f6231u = null;
        }
        this.f6231u = new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.2
            @Override // java.lang.Runnable
            public void run() {
                List m8875a;
                List m8875a2;
                if (PersonalizationActivity.this.m6963o() && (m8875a = c1368a.m8875a()) != null && !m8875a.isEmpty()) {
                    if (c1368a2 != null && (m8875a2 = c1368a2.m8875a()) != null && !m8875a2.isEmpty()) {
                        Iterator it = m8875a.iterator();
                        while (it.hasNext()) {
                            C1848k c1848k = (C1848k) it.next();
                            Iterator it2 = m8875a2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (((C1848k) it2.next()).m7300g().equals(c1848k.m7300g())) {
                                    it.remove();
                                    break;
                                }
                            }
                        }
                    }
                    if (!m8875a.isEmpty()) {
                        PersonalizationActivity.this.m6991a(m8875a, c1368a2);
                    }
                }
            }
        };
        C1455z.m8564a(0, this.f6231u);
    }

    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$m */
    /* loaded from: classes.dex */
    static class C1953m implements C1696ao.InterfaceC1698a {

        /* renamed from: a */
        WeakReference<PersonalizationActivity> f6260a;

        public C1953m(PersonalizationActivity personalizationActivity) {
            this.f6260a = new WeakReference<>(personalizationActivity);
        }

        @Override // com.tsf.extend.theme.C1696ao.InterfaceC1698a
        /* renamed from: a */
        public void mo6942a() {
        }

        @Override // com.tsf.extend.theme.C1696ao.InterfaceC1698a
        /* renamed from: b */
        public void mo6941b() {
            PersonalizationActivity personalizationActivity = this.f6260a.get();
            if (personalizationActivity != null) {
                personalizationActivity.m7014a(ACRAConstants.DEFAULT_CONNECTION_TIMEOUT);
                personalizationActivity.m6962p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$l */
    /* loaded from: classes.dex */
    public static class C1952l implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: a */
        private WeakReference<PersonalizationActivity> f6258a;

        /* renamed from: b */
        private C1368a f6259b;

        public C1952l(PersonalizationActivity personalizationActivity, C1368a c1368a) {
            this.f6258a = new WeakReference<>(personalizationActivity);
            this.f6259b = c1368a;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            PersonalizationActivity personalizationActivity = this.f6258a.get();
            if (personalizationActivity != null) {
                if (personalizationActivity == null || !personalizationActivity.isDestroyed()) {
                    personalizationActivity.m7008a(c1368a, this.f6259b);
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7007a(C1368a c1368a, String str) {
        C1894v.m7069h().m7086b(new C1952l(this, c1368a), AbstractC1386a.EnumC1397b.Refresh, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$j */
    /* loaded from: classes.dex */
    public static class C1950j implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: a */
        private WeakReference<PersonalizationActivity> f6256a;

        /* renamed from: b */
        private String f6257b;

        public C1950j(PersonalizationActivity personalizationActivity, String str) {
            this.f6256a = new WeakReference<>(personalizationActivity);
            this.f6257b = str;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            PersonalizationActivity personalizationActivity = this.f6256a.get();
            if (personalizationActivity != null) {
                if ((personalizationActivity == null || !personalizationActivity.isDestroyed()) && personalizationActivity.m6963o()) {
                    if (c1368a != null) {
                        for (C1848k c1848k : c1368a.m8875a()) {
                            if (personalizationActivity.m7006a(c1848k)) {
                                return;
                            }
                        }
                    }
                    personalizationActivity.m7007a(c1368a, this.f6257b);
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m6964n() {
        String m7773c;
        if (!isDestroyed() && m6963o() && C1696ao.m7774b().m7772d() && (m7773c = C1696ao.m7774b().m7773c()) != null && !"system".equals(m7773c)) {
            C1894v.m7069h();
            C1894v.m7082c(new C1950j(this, m7773c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$g */
    /* loaded from: classes.dex */
    public static class C1947g implements AbstractC1386a.InterfaceC1396a<List<C1848k>> {

        /* renamed from: a */
        private WeakReference<PersonalizationActivity> f6253a;

        /* renamed from: b */
        private List<C1848k> f6254b;

        /* renamed from: c */
        private C1368a f6255c;

        public C1947g(PersonalizationActivity personalizationActivity, List<C1848k> list, C1368a c1368a) {
            this.f6253a = new WeakReference<>(personalizationActivity);
            this.f6254b = list;
            this.f6255c = c1368a;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, List<C1848k> list) {
            PersonalizationActivity personalizationActivity = this.f6253a.get();
            if (personalizationActivity != null) {
                if ((personalizationActivity == null || !personalizationActivity.isDestroyed()) && personalizationActivity.m6963o()) {
                    if (list != null) {
                        Iterator<C1848k> it = this.f6254b.iterator();
                        while (it.hasNext()) {
                            C1848k next = it.next();
                            Iterator<C1848k> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (it2.next().m7300g().equals(next.m7300g())) {
                                    it.remove();
                                    break;
                                }
                            }
                        }
                    }
                    if (!this.f6254b.isEmpty()) {
                        personalizationActivity.m6984b(this.f6254b, this.f6255c);
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, List<C1848k> list) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6991a(List<C1848k> list, C1368a c1368a) {
        C1894v.m7069h().m7106a(new C1947g(this, list, c1368a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6984b(List<C1848k> list, C1368a c1368a) {
        if (!View$OnClickListenerC2056ah.f6710a) {
            C1848k c1848k = list.get(0);
            View$OnClickListenerC2101r view$OnClickListenerC2101r = new View$OnClickListenerC2101r(this, c1848k);
            view$OnClickListenerC2101r.setCanceledOnTouchOutside(false);
            view$OnClickListenerC2101r.show();
            if (c1368a == null) {
                c1368a = new C1368a();
                c1368a.m8873a(System.currentTimeMillis());
                c1368a.m8872a(new C1951k());
            }
            c1848k.m7311c(System.currentTimeMillis());
            c1368a.m8875a().add(c1368a.m8875a().size(), c1848k);
            C1894v.m7069h().m7107a(c1368a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7006a(C1848k c1848k) {
        return c1848k.m7328D() >= m6970i() && c1848k.m7328D() <= m6968j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$k */
    /* loaded from: classes.dex */
    public static class C1951k implements InterfaceC1373b {
        C1951k() {
        }

        @Override // com.tsf.extend.base.p071b.InterfaceC1373b
        /* renamed from: a */
        public boolean mo6189a(C1368a c1368a) {
            return System.currentTimeMillis() - c1368a.m8865c() > 2592000000L;
        }
    }

    /* renamed from: i */
    public static long m6970i() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: j */
    public static long m6968j() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 24);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public boolean m6963o() {
        return m8920b() instanceof PersonalizationPager;
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return Build.VERSION.SDK_INT >= 17 ? super.isDestroyed() : this.f6229s;
    }

    /* renamed from: k */
    public void m6967k() {
        if (this.f4232c != null) {
            this.f4232c.removeCallbacks(this.f6217g);
        }
    }

    /* renamed from: a */
    public void m7014a(int i) {
        if (!C1696ao.m7774b().m7769g() && this.f4232c != null) {
            this.f4232c.postDelayed(this.f6217g, i);
        }
    }

    /* renamed from: l */
    public void m6966l() {
        if (this.f4232c != null) {
            this.f4232c.removeCallbacks(this.f6218h);
        }
    }

    /* renamed from: b */
    public void m6990b(int i) {
        if (this.f4232c != null) {
            this.f4232c.postDelayed(this.f6218h, i);
        }
    }

    /* renamed from: m */
    public boolean m6965m() {
        return this.f6233w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m6962p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m6961q() {
        if (!isDestroyed() && m6963o()) {
            C1558a.m8241h().m8253a(new C1944d(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$d */
    /* loaded from: classes.dex */
    public static class C1944d implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: a */
        private WeakReference<PersonalizationActivity> f6244a;

        public C1944d(PersonalizationActivity personalizationActivity) {
            this.f6244a = new WeakReference<>(personalizationActivity);
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            PersonalizationActivity personalizationActivity = this.f6244a.get();
            if (personalizationActivity != null) {
                if ((personalizationActivity == null || !personalizationActivity.isDestroyed()) && personalizationActivity.m6963o()) {
                    if (c1368a == null) {
                        personalizationActivity.m6960r();
                    } else {
                        C1558a.m8241h().m8246b(c1368a);
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m6960r() {
        C1558a.m8241h().m8252a(new C1945e(this), AbstractC1386a.EnumC1397b.Refresh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$e */
    /* loaded from: classes.dex */
    public static class C1945e implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: a */
        private WeakReference<PersonalizationActivity> f6245a;

        public C1945e(PersonalizationActivity personalizationActivity) {
            this.f6245a = new WeakReference<>(personalizationActivity);
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            if (c1368a != null) {
                Calendar calendar = Calendar.getInstance();
                c1368a.m8860e(calendar.get(5) + ((calendar.get(2) + 1) * 100));
            }
            C1558a.m8241h().m8246b(c1368a);
            C1558a.m8241h().m8254a(c1368a);
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            C1558a.m8241h().m8246b((C1368a) null);
        }
    }

    /* renamed from: c */
    private void m6982c(Context context) {
        if (this.f6234x == null) {
            this.f6234x = new C1943c();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(this.f6234x, intentFilter);
        }
    }

    /* renamed from: d */
    private void m6980d(Context context) {
        if (this.f6234x != null) {
            context.unregisterReceiver(this.f6234x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.PersonalizationActivity$c */
    /* loaded from: classes.dex */
    public class C1943c extends BroadcastReceiver {
        private C1943c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                String stringExtra = intent.getStringExtra("reason");
                if ("homekey".equals(stringExtra)) {
                    PersonalizationActivity.this.onBackPressed();
                } else if ("assist".equals(stringExtra)) {
                    PersonalizationActivity.this.onBackPressed();
                }
            }
        }
    }
}
