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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.f;
import com.tsf.extend.theme.ThemeAlbumsPager;
import com.tsf.extend.theme.ThemeDetail;
import com.tsf.extend.theme.ao;
import com.tsf.extend.theme.core.ThemeManagerService;
import com.tsf.extend.theme.diy.d;
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
public class PersonalizationActivity extends PageActivity implements d.a {
    public static boolean e = true;
    public int f;
    private a l;
    private com.tsf.extend.base.c.b m;
    private com.tsf.extend.theme.diy.d p;
    private boolean q;
    private boolean s;
    private ComponentName t;
    private Runnable u;
    private Runnable v;
    private c x;
    private PersonalizationPager i = null;
    private long j = 0;
    private List<n> k = Lists.newArrayList();
    private String n = "CURRENT_THEME_NONE";
    private List<b> o = Lists.newArrayList();
    private boolean r = false;
    private boolean w = false;
    private ServiceConnection y = new ServiceConnection() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            PersonalizationActivity.this.m = null;
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
                com.tsf.extend.base.c.b r10 = (com.tsf.extend.base.c.b) r10
                com.tsf.extend.wallpaper.PersonalizationActivity.a(r0, r10)
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r2 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.base.c.b r2 = com.tsf.extend.wallpaper.PersonalizationActivity.a(r2)     // Catch: java.lang.Exception -> L47
                java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity.a(r0, r2)     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r2 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                com.tsf.extend.base.c.b r2 = com.tsf.extend.wallpaper.PersonalizationActivity.a(r2)     // Catch: java.lang.Exception -> L47
                boolean r2 = r2.d()     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity.a(r0, r2)     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                java.util.List r0 = com.tsf.extend.wallpaper.PersonalizationActivity.b(r0)     // Catch: java.lang.Exception -> L47
                java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L47
            L31:
                boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L47
                if (r0 == 0) goto L7d
                java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity$b r0 = (com.tsf.extend.wallpaper.PersonalizationActivity.b) r0     // Catch: java.lang.Exception -> L47
                com.tsf.extend.wallpaper.PersonalizationActivity r4 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L47
                java.lang.String r4 = com.tsf.extend.wallpaper.PersonalizationActivity.c(r4)     // Catch: java.lang.Exception -> L47
                r0.a(r4)     // Catch: java.lang.Exception -> L47
                goto L31
            L47:
                r0 = move-exception
                r0.printStackTrace()
            L4b:
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L87
                com.tsf.extend.base.c.b r0 = com.tsf.extend.wallpaper.PersonalizationActivity.a(r0)     // Catch: java.lang.Exception -> L87
                if (r0 == 0) goto L8b
                com.tsf.extend.wallpaper.PersonalizationActivity r0 = com.tsf.extend.wallpaper.PersonalizationActivity.this     // Catch: java.lang.Exception -> L87
                com.tsf.extend.base.c.b r0 = com.tsf.extend.wallpaper.PersonalizationActivity.a(r0)     // Catch: java.lang.Exception -> L87
                boolean r0 = r0.c()     // Catch: java.lang.Exception -> L87
            L5d:
                int[] r5 = com.tsf.extend.theme.ThemeDetail.b
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
                java.util.List r0 = com.tsf.extend.wallpaper.PersonalizationActivity.b(r0)     // Catch: java.lang.Exception -> L47
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
                int[] r5 = com.tsf.extend.wallpaper.PersonalizationPager.a
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
                int[] r5 = com.tsf.extend.base.view.PagerIndicator.b
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
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.PersonalizationActivity.AnonymousClass1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }
    };
    Runnable g = new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.3
        @Override // java.lang.Runnable
        public void run() {
            PersonalizationActivity.this.n();
        }
    };
    Runnable h = new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.4
        @Override // java.lang.Runnable
        public void run() {
            PersonalizationActivity.this.q();
        }
    };

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public interface h {
        void b(boolean z);
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(AbsListView absListView, int i);
    }

    /* loaded from: classes.dex */
    public interface n {

        /* loaded from: classes.dex */
        public enum a {
            REMOVE,
            ADD
        }

        void a(String str, a aVar);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    public com.tsf.extend.base.c.b c() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        File file;
        String str;
        com.tsf.extend.base.j.p.a((Activity) this);
        com.tsf.extend.wallpaper.a.a.a(this);
        z.h();
        getWindow().addFlags(ItemInfo.APP_VERSION_CODE);
        getWindow().addFlags(ItemInfo.APP_VERSION_NAME);
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                getWindow().addFlags(67108864);
            } catch (Exception e2) {
            }
        }
        super.onCreate(bundle);
        c((Context) this);
        aa.a().a(getApplicationContext());
        this.f = com.tsf.extend.base.j.p.c(this);
        com.tsf.extend.base.b.a(getIntent().getStringExtra("theme_entry"));
        int intExtra = getIntent().getIntExtra("target", 1);
        e = a((Context) this).getInt("use_new_icon", 2) == 2;
        this.w = getIntent().getBooleanExtra("isPro", false);
        this.i = (PersonalizationPager) LayoutInflater.from(this).inflate(f.C0052f.personalize_group, (ViewGroup) null);
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
            if (!TextUtils.isEmpty(a(stringExtra))) {
            }
            if (stringExtra2 == null) {
            }
            if (intExtra != 2 || this.i.getThemeSecondTab() == null) {
            }
        } else if (intExtra != 3 || getIntent().getStringExtra("inlet") == null) {
        }
        this.i.a(intExtra, getIntent().getStringExtra("tab_select_index"));
        this.i.a(intExtra);
        this.i.setPadding(0, this.i.getPaddingTop(), 0, this.f);
        a(this.i);
        this.l = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.l, intentFilter);
        getApplicationContext().bindService(new Intent(this, ThemeManagerService.class), this.y, 1);
        if (intExtra == 2) {
            String stringExtra3 = getIntent().getStringExtra("id");
            String stringExtra4 = getIntent().getStringExtra("inlet");
            if (com.tsf.extend.theme.h.a(stringExtra4)) {
                String b2 = com.tsf.extend.theme.h.b(stringExtra4);
                if (b2 == null) {
                    b2 = "";
                }
                a(stringExtra3, b2, false, stringExtra4);
            }
        } else if (intExtra == 4) {
            String stringExtra5 = getIntent().getStringExtra("id");
            String stringExtra6 = getIntent().getStringExtra("inlet");
            if (("5".equals(stringExtra6) || "4".equals(stringExtra6) || "2".equals(stringExtra6)) && !"theme_push_notifition_invalid".equals(stringExtra5)) {
                ThemeAlbumsPager themeAlbumsPager = (ThemeAlbumsPager) LayoutInflater.from(this).inflate(f.C0052f.theme_albums_list, (ViewGroup) null);
                themeAlbumsPager.a(stringExtra5, (String) null, "105");
                a((PageActivity.a) themeAlbumsPager);
            }
        }
        a(getIntent());
        try {
            if (e) {
                file = new File(getFilesDir().getAbsolutePath(), "diy_theme_default_3d.png");
                str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
            } else {
                file = new File(getFilesDir().getAbsolutePath(), "diy_theme_default_3d.png");
                str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
            }
            if (!file.exists()) {
                this.p = new com.tsf.extend.theme.diy.d(this);
                com.tsf.extend.theme.v.h().a(str, this.p);
            }
        } catch (Throwable th) {
        }
        ao.b().a(new m(this));
        ao.b().a();
        if (ao.b().e()) {
            a(2000);
            p();
        }
        b(500);
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, android.app.Activity
    public void onBackPressed() {
        if (this.r) {
            this.r = false;
            finish();
            return;
        }
        super.onBackPressed();
    }

    public void a(String str, String str2, boolean z, String str3) {
        try {
            long parseLong = Long.parseLong(str);
            ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(this).inflate(f.C0052f.theme_detail, (ViewGroup) null);
            themeDetail.a(parseLong, str2, z, str3);
            if ("2".equals(str3)) {
                themeDetail.setFromInlet("5");
            }
            if (com.tsf.extend.theme.h.a(str3)) {
                themeDetail.setFromTab(str2);
            }
            a(str3, themeDetail);
            a((PageActivity.a) themeDetail);
        } catch (Exception e2) {
        }
    }

    private String a(String str) {
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

    private void a(String str, ThemeDetail themeDetail) {
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2)) {
            themeDetail.setFromInlet(a2);
        }
    }

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ArrayList<n> newArrayList = Lists.newArrayList();
            newArrayList.addAll(PersonalizationActivity.this.k);
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                com.tsf.extend.theme.v.h();
                if (com.tsf.extend.theme.v.e(schemeSpecificPart)) {
                    for (n nVar : newArrayList) {
                        nVar.a(schemeSpecificPart, n.a.ADD);
                    }
                }
            } else if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                for (n nVar2 : newArrayList) {
                    nVar2.a(schemeSpecificPart, n.a.REMOVE);
                }
            }
        }
    }

    public void a(n nVar) {
        this.k.add(nVar);
    }

    public void b(n nVar) {
        this.k.remove(nVar);
    }

    public void a(n.a aVar) {
        for (n nVar : this.k) {
            nVar.a(null, aVar);
        }
    }

    public PersonalizationPager e() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a((n.a) null);
        this.j = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.j) / 1000);
        this.j = 0L;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity
    protected void a(Bundle bundle) {
        if (bundle != null) {
        }
    }

    public void b(boolean z) {
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
        d((Context) this);
        ao.b().a((ao.a) null);
        z.h().f();
        com.tsf.extend.theme.v.h().f();
        com.tsf.extend.wallpaper.a.a.b(this);
        this.i = null;
        this.k.clear();
        if (this.l != null) {
            try {
                unregisterReceiver(this.l);
            } catch (Exception e2) {
            }
        }
        if (this.m != null) {
            try {
                getApplicationContext().unbindService(this.y);
            } catch (Exception e3) {
            }
        }
        b((Context) this);
        com.tsf.extend.base.b.a("");
        this.s = true;
        if (this.u != null) {
            com.tsf.extend.base.j.z.b(0, this.u);
            this.u = null;
        }
        if (this.v != null) {
            com.tsf.extend.base.j.z.b(0, this.v);
            this.v = null;
        }
        com.tsf.extend.theme.x.a();
        k();
        l();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.i.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public static int a(Context context, float f2) {
        return (int) ((context.getResources().getDisplayMetrics().density * f2) + 0.5f);
    }

    public boolean a(String str, boolean z, com.tsf.extend.base.c.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PACKAGE_NAME", str);
            if (str.startsWith("DIY://")) {
                Object b2 = com.tsf.extend.theme.diy.e.b(str.substring("DIY://".length()) + File.separator + "diy.config", "isLocalDiy");
                if (b2 instanceof Boolean) {
                    jSONObject.put("NO_ICON_GROUP", b2);
                }
                jSONObject.put("IS_USING_ONLINE_WALLPAPER", z);
                if (str.contains("_LP")) {
                    jSONObject.put("IS_3DTHEME", str.contains("_3D"));
                }
            }
        } catch (JSONException e2) {
        }
        String jSONObject2 = jSONObject.toString();
        if (this.m != null) {
            this.m.a(jSONObject2, aVar);
            return true;
        }
        return false;
    }

    public String f() {
        return this.n;
    }

    public void a(b bVar) {
        if (!"CURRENT_THEME_NONE".equals(this.n)) {
            bVar.a(this.n);
        } else {
            this.o.add(bVar);
        }
    }

    public boolean b(b bVar) {
        return this.o.remove(bVar);
    }

    /* loaded from: classes.dex */
    public static class f {
        private View b;
        private AnimatorSet a = null;
        private boolean c = true;
        private long d = 20;
        private long e = 0;
        private float f = 0.0f;
        private float g = 0.0f;

        public f(View view) {
            this.b = null;
            this.b = view;
        }

        public void a() {
            if (this.b != null && this.c) {
                if (this.b.getVisibility() != 0) {
                    this.b.setVisibility(0);
                }
                if (this.a != null) {
                    this.a.cancel();
                }
                this.c = false;
                this.a = new AnimatorSet();
                this.f = this.b.getTranslationY();
                this.g = com.tsf.extend.base.j.i.a((float) this.d);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "translationY", this.f, this.g);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b, "alpha", 1.0f, 0.5f);
                this.a.setDuration(this.e);
                this.a.playTogether(ofFloat, ofFloat2);
                this.a.start();
            }
        }

        public void b() {
            if (this.b != null && !this.c) {
                if (this.a != null) {
                    this.a.cancel();
                }
                if (this.b.getVisibility() != 0) {
                    this.b.setVisibility(0);
                }
                this.c = true;
                this.a = new AnimatorSet();
                this.f = this.b.getTranslationY();
                this.g = -com.tsf.extend.base.j.i.a((float) this.d);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "translationY", this.f, this.g);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b, "alpha", 0.5f, 1.0f);
                this.a.setDuration(this.e);
                this.a.playTogether(ofFloat, ofFloat2);
                this.a.start();
            }
        }

        public void c() {
            if (this.b != null && !this.c) {
                this.c = true;
                this.b.setAlpha(1.0f);
                this.b.setTranslationY(-com.tsf.extend.base.j.i.a((float) this.d));
            }
        }

        public void a(long j) {
            this.e = j;
        }

        public void b(long j) {
            this.d = j;
        }
    }

    public static void a(Context context, String str, String str2, String str3, boolean z) {
        Intent intent = new Intent(context, PersonalizationActivity.class);
        intent.putExtra("target", z ? 2 : 4);
        intent.putExtra("inlet", str);
        intent.putExtra("id", str2);
        intent.putExtra("pushid", str3);
        intent.putExtra("theme_entry", com.tsf.extend.base.b.a());
        intent.putExtra("isPro", false);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        a(intent);
    }

    private void a(Intent intent) {
        this.t = (ComponentName) intent.getParcelableExtra("from_live_wallpaper_app");
        if (this.t != null) {
            if (this.i != null) {
                this.i.setChildPagerDefIndex(1);
            }
            com.tsf.extend.theme.x.a("cml_themelist_wpapk_more");
        }
        switch (intent.getIntExtra("TARGET_PAGE", 0)) {
            case 1:
                if (this.i != null) {
                    this.i.setTabIndex(1);
                    break;
                }
                break;
            case 2:
                if (this.i != null) {
                    this.i.setTabIndex(2);
                    break;
                }
                break;
        }
        if (5 == intent.getIntExtra("target", 1) && this.i != null) {
            if ("10".equals(intent.getStringExtra("type"))) {
                this.r = true;
            }
            this.i.a(intent);
        }
    }

    @Override // com.tsf.extend.theme.diy.d.a
    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            com.tsf.extend.theme.v.h();
            com.tsf.extend.theme.v.a(this, bitmap);
        }
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multi_shared_perfs", 4);
    }

    public static void b(Context context) {
        InputMethodManager inputMethodManager;
        int i2 = 0;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        String[] strArr = {"mCurRootView", "mServedView", "mNextServedView", "mLastSrvView"};
        while (true) {
            int i3 = i2;
            if (i3 < strArr.length) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i3]);
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
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    public boolean g() {
        return this.q;
    }

    public void h() {
        if (this.i != null) {
            d();
            this.i.setTabIndex(1);
            this.i.j();
        }
    }

    public void a(final com.tsf.extend.base.b.a aVar, final com.tsf.extend.base.b.a aVar2) {
        if (this.u != null) {
            com.tsf.extend.base.j.z.b(0, this.u);
            this.u = null;
        }
        this.u = new Runnable() { // from class: com.tsf.extend.wallpaper.PersonalizationActivity.2
            @Override // java.lang.Runnable
            public void run() {
                List a2;
                List a3;
                if (PersonalizationActivity.this.o() && (a2 = aVar.a()) != null && !a2.isEmpty()) {
                    if (aVar2 != null && (a3 = aVar2.a()) != null && !a3.isEmpty()) {
                        Iterator it = a2.iterator();
                        while (it.hasNext()) {
                            com.tsf.extend.theme.k kVar = (com.tsf.extend.theme.k) it.next();
                            Iterator it2 = a3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (((com.tsf.extend.theme.k) it2.next()).g().equals(kVar.g())) {
                                    it.remove();
                                    break;
                                }
                            }
                        }
                    }
                    if (!a2.isEmpty()) {
                        PersonalizationActivity.this.a(a2, aVar2);
                    }
                }
            }
        };
        com.tsf.extend.base.j.z.a(0, this.u);
    }

    /* loaded from: classes.dex */
    static class m implements ao.a {
        WeakReference<PersonalizationActivity> a;

        public m(PersonalizationActivity personalizationActivity) {
            this.a = new WeakReference<>(personalizationActivity);
        }

        @Override // com.tsf.extend.theme.ao.a
        public void a() {
        }

        @Override // com.tsf.extend.theme.ao.a
        public void b() {
            PersonalizationActivity personalizationActivity = this.a.get();
            if (personalizationActivity != null) {
                personalizationActivity.a(ACRAConstants.DEFAULT_CONNECTION_TIMEOUT);
                personalizationActivity.p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private WeakReference<PersonalizationActivity> a;
        private com.tsf.extend.base.b.a b;

        public l(PersonalizationActivity personalizationActivity, com.tsf.extend.base.b.a aVar) {
            this.a = new WeakReference<>(personalizationActivity);
            this.b = aVar;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.a aVar) {
            PersonalizationActivity personalizationActivity = this.a.get();
            if (personalizationActivity != null) {
                if (personalizationActivity == null || !personalizationActivity.isDestroyed()) {
                    personalizationActivity.a(aVar, this.b);
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.extend.base.b.a aVar, String str) {
        com.tsf.extend.theme.v.h().b(new l(this, aVar), a.b.Refresh, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private WeakReference<PersonalizationActivity> a;
        private String b;

        public j(PersonalizationActivity personalizationActivity, String str) {
            this.a = new WeakReference<>(personalizationActivity);
            this.b = str;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.a aVar) {
            PersonalizationActivity personalizationActivity = this.a.get();
            if (personalizationActivity != null) {
                if ((personalizationActivity == null || !personalizationActivity.isDestroyed()) && personalizationActivity.o()) {
                    if (aVar != null) {
                        for (com.tsf.extend.theme.k kVar : aVar.a()) {
                            if (personalizationActivity.a(kVar)) {
                                return;
                            }
                        }
                    }
                    personalizationActivity.a(aVar, this.b);
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        String c2;
        if (!isDestroyed() && o() && ao.b().d() && (c2 = ao.b().c()) != null && !"system".equals(c2)) {
            com.tsf.extend.theme.v.h();
            com.tsf.extend.theme.v.c(new j(this, c2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements a.InterfaceC0048a<List<com.tsf.extend.theme.k>> {
        private WeakReference<PersonalizationActivity> a;
        private List<com.tsf.extend.theme.k> b;
        private com.tsf.extend.base.b.a c;

        public g(PersonalizationActivity personalizationActivity, List<com.tsf.extend.theme.k> list, com.tsf.extend.base.b.a aVar) {
            this.a = new WeakReference<>(personalizationActivity);
            this.b = list;
            this.c = aVar;
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, List<com.tsf.extend.theme.k> list) {
            PersonalizationActivity personalizationActivity = this.a.get();
            if (personalizationActivity != null) {
                if ((personalizationActivity == null || !personalizationActivity.isDestroyed()) && personalizationActivity.o()) {
                    if (list != null) {
                        Iterator<com.tsf.extend.theme.k> it = this.b.iterator();
                        while (it.hasNext()) {
                            com.tsf.extend.theme.k next = it.next();
                            Iterator<com.tsf.extend.theme.k> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (it2.next().g().equals(next.g())) {
                                    it.remove();
                                    break;
                                }
                            }
                        }
                    }
                    if (!this.b.isEmpty()) {
                        personalizationActivity.b(this.b, this.c);
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, List<com.tsf.extend.theme.k> list) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<com.tsf.extend.theme.k> list, com.tsf.extend.base.b.a aVar) {
        com.tsf.extend.theme.v.h().a(new g(this, list, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<com.tsf.extend.theme.k> list, com.tsf.extend.base.b.a aVar) {
        if (!ah.a) {
            com.tsf.extend.theme.k kVar = list.get(0);
            r rVar = new r(this, kVar);
            rVar.setCanceledOnTouchOutside(false);
            rVar.show();
            if (aVar == null) {
                aVar = new com.tsf.extend.base.b.a();
                aVar.a(System.currentTimeMillis());
                aVar.a(new k());
            }
            kVar.c(System.currentTimeMillis());
            aVar.a().add(aVar.a().size(), kVar);
            com.tsf.extend.theme.v.h().a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.tsf.extend.theme.k kVar) {
        return kVar.D() >= i() && kVar.D() <= j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k implements com.tsf.extend.base.b.b {
        k() {
        }

        @Override // com.tsf.extend.base.b.b
        public boolean a(com.tsf.extend.base.b.a aVar) {
            return System.currentTimeMillis() - aVar.c() > 2592000000L;
        }
    }

    public static long i() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long j() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 24);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        return b() instanceof PersonalizationPager;
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return Build.VERSION.SDK_INT >= 17 ? super.isDestroyed() : this.s;
    }

    public void k() {
        if (this.c != null) {
            this.c.removeCallbacks(this.g);
        }
    }

    public void a(int i2) {
        if (!ao.b().g() && this.c != null) {
            this.c.postDelayed(this.g, i2);
        }
    }

    public void l() {
        if (this.c != null) {
            this.c.removeCallbacks(this.h);
        }
    }

    public void b(int i2) {
        if (this.c != null) {
            this.c.postDelayed(this.h, i2);
        }
    }

    public boolean m() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (!isDestroyed() && o()) {
            com.tsf.extend.keyboard.a.h().a(new d(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private WeakReference<PersonalizationActivity> a;

        public d(PersonalizationActivity personalizationActivity) {
            this.a = new WeakReference<>(personalizationActivity);
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.a aVar) {
            PersonalizationActivity personalizationActivity = this.a.get();
            if (personalizationActivity != null) {
                if ((personalizationActivity == null || !personalizationActivity.isDestroyed()) && personalizationActivity.o()) {
                    if (aVar == null) {
                        personalizationActivity.r();
                    } else {
                        com.tsf.extend.keyboard.a.h().b(aVar);
                    }
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        com.tsf.extend.keyboard.a.h().a(new e(this), a.b.Refresh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private WeakReference<PersonalizationActivity> a;

        public e(PersonalizationActivity personalizationActivity) {
            this.a = new WeakReference<>(personalizationActivity);
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.a aVar) {
            if (aVar != null) {
                Calendar calendar = Calendar.getInstance();
                aVar.e(calendar.get(5) + ((calendar.get(2) + 1) * 100));
            }
            com.tsf.extend.keyboard.a.h().b(aVar);
            com.tsf.extend.keyboard.a.h().a(aVar);
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.keyboard.a.h().b((com.tsf.extend.base.b.a) null);
        }
    }

    private void c(Context context) {
        if (this.x == null) {
            this.x = new c();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(this.x, intentFilter);
        }
    }

    private void d(Context context) {
        if (this.x != null) {
            context.unregisterReceiver(this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        private c() {
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
