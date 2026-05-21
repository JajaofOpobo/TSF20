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
import android.os.IBinder;
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
import com.tsf.extend.base.view.PagerIndicator;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
@SuppressLint({"InflateParams"})
@TargetApi(19)
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

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            PersonalizationActivity.this.m = (com.tsf.extend.base.c.b) iBinder;
            try {
                PersonalizationActivity.this.n = PersonalizationActivity.this.m.a();
                PersonalizationActivity.this.q = PersonalizationActivity.this.m.d();
                Iterator it = PersonalizationActivity.this.o.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(PersonalizationActivity.this.n);
                }
                PersonalizationActivity.this.o.clear();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            boolean zC = PersonalizationActivity.this.m != null ? PersonalizationActivity.this.m.c() : false;
            for (int i2 : ThemeDetail.b) {
                if (PersonalizationActivity.this.findViewById(i2) != null) {
                    PersonalizationActivity.this.findViewById(i2).setSoundEffectsEnabled(!zC);
                }
            }
            for (int i3 : PersonalizationPager.a) {
                if (PersonalizationActivity.this.findViewById(i3) != null) {
                    PersonalizationActivity.this.findViewById(i3).setSoundEffectsEnabled(!zC);
                }
            }
            for (int i4 : PagerIndicator.b) {
                if (PersonalizationActivity.this.findViewById(i4) != null) {
                    PersonalizationActivity.this.findViewById(i4).setSoundEffectsEnabled(!zC);
                }
            }
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

    public interface b {
        void a(String str);
    }

    public interface h {
        void b(boolean z);
    }

    public interface i {
        void a(AbsListView absListView, int i);
    }

    public interface n {

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

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
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
        getApplicationContext().bindService(new Intent(this, (Class<?>) ThemeManagerService.class), this.y, 1);
        if (intExtra == 2) {
            String stringExtra3 = getIntent().getStringExtra("id");
            String stringExtra4 = getIntent().getStringExtra("inlet");
            if (com.tsf.extend.theme.h.a(stringExtra4)) {
                String strB = com.tsf.extend.theme.h.b(stringExtra4);
                if (strB == null) {
                    strB = "";
                }
                a(stringExtra3, strB, false, stringExtra4);
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
        } else {
            super.onBackPressed();
        }
    }

    public void a(String str, String str2, boolean z, String str3) {
        try {
            long j2 = Long.parseLong(str);
            ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(this).inflate(f.C0052f.theme_detail, (ViewGroup) null);
            themeDetail.a(j2, str2, z, str3);
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
        boolean zEquals = "theme_promotion_menu".equals(str);
        boolean zEquals2 = "theme_push_desk_icon".equals(str);
        boolean zEquals3 = "theme_promotion_allapp".equals(str);
        boolean zEquals4 = "theme_promotion_weather".equals(str);
        if (!zEquals && !zEquals2 && !zEquals3 && !zEquals4) {
            return "";
        }
        if (zEquals2) {
            return "11";
        }
        if (zEquals3) {
            return "12";
        }
        if (zEquals4) {
            return "13";
        }
        if (!zEquals) {
            return "";
        }
        return "14";
    }

    private void a(String str, ThemeDetail themeDetail) {
        String strA = a(str);
        if (!TextUtils.isEmpty(strA)) {
            themeDetail.setFromInlet(strA);
        }
    }

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            arrayListNewArrayList.addAll(PersonalizationActivity.this.k);
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                com.tsf.extend.theme.v.h();
                if (com.tsf.extend.theme.v.e(schemeSpecificPart)) {
                    Iterator it = arrayListNewArrayList.iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).a(schemeSpecificPart, n.a.ADD);
                    }
                    return;
                }
                return;
            }
            if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                Iterator it2 = arrayListNewArrayList.iterator();
                while (it2.hasNext()) {
                    ((n) it2.next()).a(schemeSpecificPart, n.a.REMOVE);
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
        Iterator<n> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a(null, aVar);
        }
    }

    public PersonalizationPager e() {
        return this.i;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        a((n.a) null);
        this.j = System.currentTimeMillis();
    }

    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
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
        } else {
            getWindow().addFlags(2048);
        }
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity, com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onDestroy() {
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
        } catch (JSONException e2) {
        }
        String string = jSONObject.toString();
        if (this.m == null) {
            return false;
        }
        this.m.a(string, aVar);
        return true;
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
                this.g = com.tsf.extend.base.j.i.a(this.d);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.b, "translationY", this.f, this.g);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.b, "alpha", 1.0f, 0.5f);
                this.a.setDuration(this.e);
                this.a.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
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
                this.g = -com.tsf.extend.base.j.i.a(this.d);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.b, "translationY", this.f, this.g);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.b, "alpha", 0.5f, 1.0f);
                this.a.setDuration(this.e);
                this.a.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                this.a.start();
            }
        }

        public void c() {
            if (this.b != null && !this.c) {
                this.c = true;
                this.b.setAlpha(1.0f);
                this.b.setTranslationY(-com.tsf.extend.base.j.i.a(this.d));
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
        Intent intent = new Intent(context, (Class<?>) PersonalizationActivity.class);
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
                }
                break;
            case 2:
                if (this.i != null) {
                    this.i.setTabIndex(2);
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
    public void a(Bitmap bitmap) throws Throwable {
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
        if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
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
                List listA;
                List listA2;
                if (PersonalizationActivity.this.o() && (listA = aVar.a()) != null && !listA.isEmpty()) {
                    if (aVar2 != null && (listA2 = aVar2.a()) != null && !listA2.isEmpty()) {
                        Iterator it = listA.iterator();
                        while (it.hasNext()) {
                            com.tsf.extend.theme.k kVar = (com.tsf.extend.theme.k) it.next();
                            Iterator it2 = listA2.iterator();
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
                    if (!listA.isEmpty()) {
                        PersonalizationActivity.this.a((List<com.tsf.extend.theme.k>) listA, aVar2);
                    }
                }
            }
        };
        com.tsf.extend.base.j.z.a(0, this.u);
    }

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

    static class l implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
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

    static class j implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
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
                        Iterator it = aVar.a().iterator();
                        while (it.hasNext()) {
                            if (personalizationActivity.a((com.tsf.extend.theme.k) it.next())) {
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
        String strC;
        if (!isDestroyed() && o() && ao.b().d() && (strC = ao.b().c()) != null && !"system".equals(strC)) {
            com.tsf.extend.theme.v.h();
            com.tsf.extend.theme.v.c(new j(this, strC));
        }
    }

    static class g implements a.InterfaceC0048a<List<com.tsf.extend.theme.k>> {
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

    static class k implements com.tsf.extend.base.b.b {
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

    static class d implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
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

    static class e implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
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

    private class c extends BroadcastReceiver {
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
