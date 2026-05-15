package com.tsf.extend.theme.diy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.collect.Lists;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.j.p;
import com.tsf.extend.base.j.z;
import com.tsf.extend.e;
import com.tsf.extend.f;
import com.tsf.extend.theme.aq;
import com.tsf.extend.theme.cmclub.ThemeCmClubActivity;
import com.tsf.extend.theme.diy.b;
import com.tsf.extend.theme.diy.d;
import com.tsf.extend.theme.diy.e;
import com.tsf.extend.theme.diy.view.ThemeLoadingAnim;
import com.tsf.extend.theme.v;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.WallpaperOnLineActivity;
import com.tsf.extend.wallpaper.ab;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeDIYActivity extends Activity implements DialogInterface.OnClickListener, View.OnClickListener, d.a {
    public static float a = 0.5625f;
    public static float b = 720.0f;
    public static float c = 1280.0f;
    private com.tsf.extend.base.c.b A;
    private Timer B;
    private ThemeLoadingAnim C;
    private ThemeLoadingAnim D;
    private long E;
    private View K;
    private View L;
    private View M;
    private com.tsf.extend.e O;
    private int P;
    private f Q;
    private View R;
    private View S;
    private View T;
    private int U;
    private int V;
    private float ab;
    private TextView af;
    private boolean ag;
    private Runnable ah;
    private com.tsf.extend.theme.diy.d aj;
    private String aq;
    private View ar;
    private View as;
    private Animator av;
    private TextView d;
    private View e;
    private ListView f;
    private m g;
    private View h;
    private View i;
    private Handler j;
    private h k;
    private j n;
    private com.tsf.extend.theme.b.a o;
    private l p;
    private FrameLayout q;
    private FrameLayout r;
    private ImageView s;
    private com.tsf.extend.theme.o t;
    private k u;
    private View v;
    private d w;
    private LinearLayout x;
    private b y;
    private aq z;
    private List<n> l = Lists.newArrayList();
    private List<c> m = Lists.newArrayList();
    private String F = "1600";
    private boolean G = true;
    private boolean H = true;
    private boolean I = true;
    private boolean J = false;
    private i N = i.CHOOSE_WALLPAER_A;
    private int W = 0;
    private boolean X = true;
    private boolean Y = false;
    private Rect Z = new Rect();
    private Rect aa = new Rect();
    private boolean ac = false;
    private boolean ad = false;
    private boolean ae = false;
    private boolean ai = false;
    private String ak = null;
    private String al = null;
    private String am = null;
    private String an = null;
    private Uri ao = null;
    private o ap = o.FROM_UNSELECT;
    private ServiceConnection at = new ServiceConnection() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ThemeDIYActivity.this.A = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThemeDIYActivity.this.A = (com.tsf.extend.base.c.b) iBinder;
        }
    };
    private Handler au = new Handler() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.6
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ThemeDIYActivity.this.o();
                    ThemeDIYActivity.this.G = false;
                    ThemeDIYActivity.this.finish();
                    break;
                case 1:
                    ThemeDIYActivity.this.N = i.CHOOSE_ICON;
                    ThemeDIYActivity.this.a();
                    ThemeDIYActivity.this.k();
                    ThemeDIYActivity.this.o();
                    Toast.makeText(ThemeDIYActivity.this, f.g.theme_changing_fail, 0).show();
                    break;
            }
        }
    };

    private enum a {
        SET_WALLPAER,
        SET_THEME
    }

    private enum i {
        CHOOSE_WALLPAER_A(1),
        CHOOSE_WALLPAER_B(2),
        CHOOSE_ICON(3),
        SAVE(4),
        APPLY(5);

        private int f;

        i(int i) {
            this.f = i;
        }

        public int a() {
            return this.f;
        }
    }

    private enum o {
        FROM_ALUME(2),
        FROM_ONLINE(3),
        FROM_UNSELECT(4);

        private int d;

        o(int i) {
            this.d = i;
        }
    }

    public static i a(int i2) {
        switch (i2) {
        }
        return i.CHOOSE_WALLPAER_A;
    }

    private class b {
        public int a;
        private Bitmap c;
        private Bitmap d;

        private b() {
            this.c = null;
            this.d = null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f.C0052f.theme_diy_activity);
        p.a((Activity) this);
        this.y = new b();
        this.d = (TextView) findViewById(f.e.title);
        this.d.setOnClickListener(this);
        int iA = com.tsf.extend.base.j.i.a(64.0f);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, com.tsf.extend.base.j.i.a(22.0f) + iA));
        this.e = findViewById(f.e.icons_chooser_panel);
        this.e.setOnClickListener(this);
        this.f = (ListView) findViewById(f.e.gridview);
        this.f.addFooterView(view, null, false);
        this.g = new m(this);
        this.f.setAdapter((ListAdapter) this.g);
        this.q = (FrameLayout) findViewById(f.e.theme_diy_preview_container);
        this.s = (ImageView) this.q.findViewById(f.e.theme_icons_btn);
        this.s.setOnClickListener(this);
        this.r = (FrameLayout) this.q.findViewById(f.e.theme_diy_preview_pager);
        a(this.r);
        this.C = (ThemeLoadingAnim) findViewById(f.e.loading_progress);
        this.D = (ThemeLoadingAnim) findViewById(f.e.thumb_loading_progress);
        this.D.setText("");
        this.D.setTextColor(getResources().getColor(f.b.black));
        this.D.setLoadingIconTint(getResources().getColor(f.b.black));
        this.h = findViewById(f.e.load_error_page);
        this.h.setOnClickListener(this);
        HandlerThread handlerThread = new HandlerThread("diy_theme");
        handlerThread.start();
        this.j = new Handler(handlerThread.getLooper());
        this.n = new j();
        getApplicationContext().bindService(new Intent("android.service.theme.ManagerService"), this.at, 1);
        this.K = findViewById(f.e.theme_btn);
        this.K.setTag(this.N);
        this.K.setOnClickListener(this);
        this.M = findViewById(f.e.choose_button_padding);
        this.as = findViewById(f.e.choose_next_group);
        this.L = findViewById(f.e.theme_choose_link);
        this.L.setOnClickListener(this);
        this.af = (TextView) findViewById(f.e.theme_btn_choose_wallpaper);
        this.af.setOnClickListener(this);
        findViewById(f.e.theme_btn_next).setOnClickListener(this);
        this.i = findViewById(f.e.theme_btn_next_default);
        this.i.setOnClickListener(this);
        this.R = findViewById(f.e.tab_choose_wallpaper);
        this.S = findViewById(f.e.tab_choose_icon);
        this.T = findViewById(f.e.tab_arrow1);
        this.R.setOnClickListener(this);
        this.S.setOnClickListener(this);
        this.v = findViewById(f.e.theme_save_succ_group);
        this.x = (LinearLayout) findViewById(f.e.content_layout);
        a();
        if (getIntent() != null) {
            this.aq = getIntent().getStringExtra("launch_host");
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(f.c.theme_diy_list_padding);
        this.V = getResources().getDimensionPixelSize(f.c.theme_diy_list_panel_height);
        if (Build.VERSION.SDK_INT >= 11) {
            this.e.setTranslationY(this.V);
        }
        this.U = this.V - iA;
        this.P = (p.b() - (dimensionPixelSize * 4)) / 3;
        this.Q = new f(dimensionPixelSize, dimensionPixelSize);
        new g().execute(new Void[0]);
        p();
        findViewById(f.e.theme_diy_head_mask).setOnClickListener(this);
        findViewById(f.e.content_top_mask).setOnClickListener(this);
        this.ar = findViewById(f.e.new_diy);
        this.ar.setOnClickListener(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.X) {
            d(false);
            e(false);
            this.X = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        switch (this.N) {
            case CHOOSE_WALLPAER_A:
            case CHOOSE_WALLPAER_B:
                this.S.setSelected(false);
                this.R.setSelected(true);
                this.T.setSelected(true);
                this.s.setVisibility(8);
                this.af.setVisibility(0);
                break;
            case CHOOSE_ICON:
                this.R.setSelected(false);
                this.T.setSelected(false);
                this.S.setSelected(true);
                this.s.setVisibility(0);
                this.af.setVisibility(8);
                break;
            case SAVE:
            case APPLY:
                this.s.setVisibility(8);
                this.R.setSelected(false);
                this.T.setSelected(false);
                this.S.setSelected(true);
                break;
        }
    }

    @Override // com.tsf.extend.theme.diy.d.a
    public void a(Bitmap bitmap) throws Throwable {
        if (bitmap != null) {
            if (!isFinishing()) {
                this.y.d = bitmap;
                a(this.r, a.SET_THEME);
            }
            v.a(this, bitmap);
        }
    }

    class g extends AsyncTask<Void, Void, Pair<Bitmap, Integer>> {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.util.Pair<android.graphics.Bitmap, java.lang.Integer> doInBackground(java.lang.Void... r11) throws java.lang.Throwable {
            /*
                r10 = this;
                r9 = 1065353216(0x3f800000, float:1.0)
                r1 = 540(0x21c, float:7.57E-43)
                r2 = 0
                r6 = 1
                r7 = 0
                com.tsf.extend.theme.diy.ThemeDIYActivity r0 = com.tsf.extend.theme.diy.ThemeDIYActivity.this
                java.io.File r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.a(r0)
                if (r3 == 0) goto Lb7
                boolean r0 = r3.exists()
                if (r0 == 0) goto Lb7
                int r0 = com.tsf.extend.base.j.i.d()
                if (r0 > r1) goto L36
                r0 = r1
            L1c:
                float r4 = (float) r0
                float r5 = com.tsf.extend.theme.diy.ThemeDIYActivity.a
                float r4 = r4 / r5
                int r4 = (int) r4
                com.tsf.extend.theme.diy.ThemeDIYActivity r5 = com.tsf.extend.theme.diy.ThemeDIYActivity.this     // Catch: java.lang.Exception -> L3a
                android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch: java.lang.Exception -> L3a
                r8 = 1
                android.graphics.Bitmap r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.a(r5, r3, r0, r4, r8)     // Catch: java.lang.Exception -> L3a
                r0 = 2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Laf
                android.util.Pair r2 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Exception -> Laf
            L35:
                return r2
            L36:
                float r0 = com.tsf.extend.theme.diy.ThemeDIYActivity.b
                int r0 = (int) r0
                goto L1c
            L3a:
                r0 = move-exception
                r0 = r7
            L3c:
                r3 = r0
            L3d:
                if (r2 != 0) goto Lb5
                com.tsf.extend.theme.diy.ThemeDIYActivity r0 = com.tsf.extend.theme.diy.ThemeDIYActivity.this
                android.app.WallpaperManager r0 = android.app.WallpaperManager.getInstance(r0)
                android.app.WallpaperInfo r4 = r0.getWallpaperInfo()
                if (r4 != 0) goto Lb5
                android.graphics.Bitmap r0 = com.tsf.extend.base.j.d.b(r0)
                r3 = r6
            L50:
                if (r0 != 0) goto Lb3
                int r0 = com.tsf.extend.base.j.i.d()
                if (r0 > r1) goto Lb1
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
                r0.<init>()
                r1 = 2
                r0.inSampleSize = r1
            L60:
                com.tsf.extend.theme.diy.ThemeDIYActivity r1 = com.tsf.extend.theme.diy.ThemeDIYActivity.this
                android.graphics.Bitmap r0 = com.tsf.extend.wallpaper.ab.a(r1, r0, r7, r7, r7)
                r8 = r7
            L67:
                if (r0 == 0) goto L35
                int r1 = r0.getWidth()
                float r1 = (float) r1
                float r1 = r1 * r9
                int r2 = r0.getHeight()
                float r2 = (float) r2
                float r1 = r1 / r2
                float r1 = r1 * r9
                float r2 = com.tsf.extend.theme.diy.ThemeDIYActivity.a
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L9f
                int r2 = r0.getHeight()
                int r1 = r0.getHeight()
                float r1 = (float) r1
                float r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.a
                float r1 = r1 * r3
                int r1 = (int) r1
            L89:
                r3 = 8388611(0x800003, float:1.1754948E-38)
                r4 = 17
                android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
                if (r8 == r6) goto Lad
            L92:
                android.graphics.Bitmap r0 = com.tsf.extend.base.j.e.a(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                android.util.Pair r2 = android.util.Pair.create(r0, r1)
                goto L35
            L9f:
                int r1 = r0.getWidth()
                int r2 = r0.getWidth()
                float r2 = (float) r2
                float r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.a
                float r2 = r2 / r3
                int r2 = (int) r2
                goto L89
            Lad:
                r6 = r7
                goto L92
            Laf:
                r3 = move-exception
                goto L3c
            Lb1:
                r0 = r2
                goto L60
            Lb3:
                r8 = r3
                goto L67
            Lb5:
                r0 = r2
                goto L50
            Lb7:
                r3 = r7
                goto L3d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.diy.ThemeDIYActivity.g.doInBackground(java.lang.Void[]):android.util.Pair");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<Bitmap, Integer> pair) {
            BitmapFactory.Options options;
            String str;
            super.onPostExecute(pair);
            ThemeDIYActivity.this.ag = true;
            try {
                ThemeDIYActivity.this.y.c = (Bitmap) pair.first;
                ThemeDIYActivity.this.y.a = ((Integer) pair.second).intValue();
                ThemeDIYActivity.this.a(ThemeDIYActivity.this.r, a.SET_WALLPAER);
                if (com.tsf.extend.base.j.i.d() <= 540) {
                    options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                } else {
                    options = null;
                }
                Bitmap bitmapA = v.h().a(ThemeDIYActivity.this, options);
                if (bitmapA != null) {
                    ThemeDIYActivity.this.y.d = bitmapA;
                    ThemeDIYActivity.this.a(ThemeDIYActivity.this.r, a.SET_THEME);
                } else {
                    if (PersonalizationActivity.e) {
                        str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
                    } else {
                        str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
                    }
                    ThemeDIYActivity.this.aj = new com.tsf.extend.theme.diy.d(ThemeDIYActivity.this);
                    v.h().a(str, ThemeDIYActivity.this.aj);
                }
            } catch (Throwable th) {
            }
            if (ThemeDIYActivity.this.ah != null) {
                ThemeDIYActivity.this.ah.run();
                ThemeDIYActivity.this.ah = null;
            }
        }
    }

    private void b() {
        int i2;
        switch (this.N) {
            case CHOOSE_WALLPAER_A:
            case CHOOSE_WALLPAER_B:
            case CHOOSE_ICON:
                i2 = f.g.theme_diy_btn_choose_wallpaper;
                break;
            case SAVE:
            default:
                i2 = 0;
                break;
            case APPLY:
                i2 = f.g.save_and_apply;
                break;
        }
        if (i2 == 0) {
            this.K.setVisibility(8);
            return;
        }
        this.K.setVisibility(0);
        ((TextView) this.K).setText(i2);
        this.K.setTag(this.N);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.theme_btn) {
            switch ((i) view.getTag()) {
                case CHOOSE_WALLPAER_A:
                case CHOOSE_WALLPAER_B:
                    b(false);
                    break;
                case CHOOSE_ICON:
                case SAVE:
                case APPLY:
                    g();
                    break;
            }
            return;
        }
        if (id == f.e.title) {
            int iA = this.N.a();
            if (iA > i.CHOOSE_WALLPAER_A.a() && iA < i.APPLY.a()) {
                if (c()) {
                    super.onBackPressed();
                    return;
                } else {
                    c(false);
                    return;
                }
            }
            onBackPressed();
            return;
        }
        if (id == f.e.load_error_page) {
            this.h.setVisibility(8);
            this.e.setVisibility(0);
            p();
            return;
        }
        if (id == f.e.theme_btn_choose_wallpaper) {
            this.Y = true;
            t();
            e(false);
            return;
        }
        if (id == f.e.theme_btn_next_default) {
            if (i.CHOOSE_WALLPAER_A == this.N) {
                b(i.CHOOSE_WALLPAER_B);
            }
            this.J = true;
            this.G = true;
            i();
            u();
            e();
            return;
        }
        if (id == f.e.theme_btn_next) {
            d();
            i();
            u();
            return;
        }
        if (id == f.e.tab_choose_wallpaper) {
            if (this.N != i.CHOOSE_WALLPAER_A && this.N != i.CHOOSE_WALLPAER_B) {
                a(i.CHOOSE_WALLPAER_B);
                b(i.CHOOSE_WALLPAER_B);
                return;
            }
            return;
        }
        if (id == f.e.tab_choose_icon) {
            if (this.N != i.APPLY && this.N != i.CHOOSE_ICON) {
                a(i.CHOOSE_ICON);
                b(i.CHOOSE_ICON);
                return;
            }
            return;
        }
        if (id == f.e.theme_choose_link) {
            s();
            return;
        }
        if (id == f.e.theme_diy_head_mask || id == f.e.content_top_mask) {
            v();
            e(true);
            return;
        }
        if (id == f.e.theme_icons_btn) {
            if (this.ae) {
                k();
                return;
            } else {
                m();
                return;
            }
        }
        if (id == f.e.theme_diy_wallpaper_iv) {
            if (this.N != i.SAVE && this.N != i.APPLY) {
                b(true);
                return;
            }
            return;
        }
        if (id == f.e.new_diy) {
            ThemeCmClubActivity.a(this, "launch_host_club", "", 4);
            return;
        }
        e eVar = (e) view.getTag();
        if (eVar != null) {
            if (this.o != null) {
                long jA = this.o.a();
                if (jA != eVar.a.a()) {
                    Iterator<n> it = this.l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        n next = it.next();
                        if (next.a != null && next.a.a != null && next.a.a.a() == jA) {
                            next.a.c.setVisibility(8);
                            break;
                        }
                        if (next.b != null && next.b.a != null && next.b.a.a() == jA) {
                            next.b.c.setVisibility(8);
                            break;
                        } else if (next.c != null && next.c.a != null && next.c.a.a() == jA) {
                            next.c.c.setVisibility(8);
                            break;
                        }
                    }
                } else {
                    return;
                }
            }
            eVar.c.setVisibility(0);
            this.o = eVar.a;
            String str = this.o.c().get(0);
            if (str != null) {
                if (this.u == null) {
                    this.u = new k();
                }
                this.C.setVisibility(0);
                this.E = System.currentTimeMillis();
                com.tsf.extend.theme.diy.c.a().a(str, this.u);
                this.F = "1602";
            }
        }
    }

    private boolean c() {
        return (this.y.a == 1 || this.y.a == 2 || this.y.a == 0) && this.o == null;
    }

    private void d() {
        if (this.N == i.CHOOSE_WALLPAER_B) {
            this.F = "1602";
        } else if (this.N == i.CHOOSE_ICON && a(this.N.a() + 1) != i.SAVE) {
            this.F = "1606";
        }
    }

    private void e() {
        this.F = "1602";
    }

    private void f() {
        if (this.N == i.CHOOSE_WALLPAER_B || this.N == i.CHOOSE_WALLPAER_A || this.N == i.CHOOSE_ICON) {
        }
    }

    private void a(i iVar) {
        switch (this.N) {
            case CHOOSE_WALLPAER_A:
            case CHOOSE_WALLPAER_B:
                String str = this.F;
                if (iVar == i.CHOOSE_ICON) {
                    this.F = "1602";
                } else {
                    this.F = "1606";
                }
                break;
            case CHOOSE_ICON:
                String str2 = this.F;
                if (iVar == i.CHOOSE_WALLPAER_B) {
                    this.F = "1600";
                } else {
                    this.F = "1606";
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.z != null && this.z.I() != null && this.A != null) {
            b(getResources().getString(f.g.theme_applying_theme));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PACKAGE_NAME", "DIY://" + this.z.I());
                if (this.z.K()) {
                    jSONObject.put("NO_ICON_GROUP", true);
                }
                jSONObject.put("IS_USING_ONLINE_WALLPAPER", z);
                jSONObject.put("SHOW_SHARE_TIP", this.z.J());
                jSONObject.put("launch_host", this.aq);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("icon_group_id", String.valueOf(this.z.K() ? 0L : this.z.h()));
                jSONObject2.put("theme_pkg", "DIY://" + this.z.I());
                jSONObject2.put("wallpaper_id", this.ak);
                jSONObject2.put("wallpaper_categoryId", this.al);
                jSONObject2.put("wallpaper_tag", this.am);
                jSONObject2.put("wallpaper_name", this.an);
                jSONObject2.put("wallpaper_online", this.ai);
                if (!this.z.K()) {
                    String strA = this.z.a("theme.png");
                    if (new File(strA).exists()) {
                        jSONObject2.put("upload_icon_path", strA);
                    }
                }
                if (this.ao != null) {
                    jSONObject2.put("wallpaper_uri", this.ao.toString());
                } else {
                    File fileY = y();
                    if (fileY != null) {
                        jSONObject2.put("wallpaper_uri", Uri.fromFile(fileY).toString());
                    }
                }
                jSONObject.put("upload_wallpaper_data", jSONObject2);
                String string = jSONObject2.getString("wallpaper_uri");
                Bitmap bitmapA = com.tsf.extend.theme.j.a(getBaseContext(), jSONObject2.optString("upload_icon_path"));
                try {
                    this.A.a("");
                } catch (Exception e2) {
                }
                com.tsf.extend.theme.diy.e.a(this, bitmapA, Uri.parse(string), jSONObject2, UploadWallpaperService.a.APPLY, new e.g() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.7
                    @Override // com.tsf.extend.theme.diy.e.g
                    public void a(String str) {
                        try {
                            if (ThemeDIYActivity.this.A != null) {
                                ThemeDIYActivity.this.A.a(str);
                            }
                        } catch (Exception e3) {
                        }
                    }

                    @Override // com.tsf.extend.theme.diy.e.g
                    public void b(String str) {
                        try {
                            if (ThemeDIYActivity.this.A != null) {
                                ThemeDIYActivity.this.A.a(str);
                            }
                        } catch (Exception e3) {
                        }
                    }
                });
            } catch (JSONException e3) {
            }
            a(jSONObject.toString());
        }
    }

    private void g() {
        if (this.t == null || !this.t.isShowing()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(aq aqVar) {
        List<String> listE;
        if (this.o != null && (listE = this.o.e()) != null && listE.size() != 0) {
            this.w = new d(aqVar);
            Iterator<String> it = listE.iterator();
            while (it.hasNext()) {
                v.h().c(it.next(), this.w);
            }
        }
    }

    private void b(boolean z) {
        this.G = false;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        try {
            startActivityForResult(intent, 0);
        } catch (Exception e2) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tsf.extend.theme.diy.ThemeDIYActivity$9] */
    private void a(final String str) {
        final com.tsf.extend.base.c.a aVar = new com.tsf.extend.base.c.a() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.8
            @Override // com.tsf.extend.base.c.a
            public void a(int i2) {
                if (ThemeDIYActivity.this.B != null) {
                    ThemeDIYActivity.this.B.cancel();
                }
                ThemeDIYActivity.this.au.sendEmptyMessage(i2);
            }
        };
        new AsyncTask<Void, Void, Void>() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.9
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                try {
                    ThemeDIYActivity.this.A.a(str, aVar);
                    return null;
                } catch (Exception e2) {
                    ThemeDIYActivity.this.au.sendEmptyMessage(1);
                    return null;
                }
            }
        }.execute(new Void[0]);
        this.B = new Timer();
        this.B.schedule(new TimerTask() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.10
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ThemeDIYActivity.this.au.sendEmptyMessage(1);
            }
        }, 60000L);
    }

    private void h() {
        if (this.y.d == null && (this.o == null || TextUtils.isEmpty(this.o.d()))) {
            this.n.a(0, (aq) null);
            return;
        }
        b(getResources().getString(f.g.theme_diy_generating));
        if (this.o == null || TextUtils.isEmpty(this.o.d())) {
            this.j.post(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.11
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    com.tsf.extend.theme.b bVar = new com.tsf.extend.theme.b();
                    bVar.f(true);
                    File fileG = bVar.g(ThemeDIYActivity.this);
                    if (fileG == null) {
                        ThemeDIYActivity.this.n.a(0, (aq) null);
                    } else {
                        com.tsf.extend.theme.diy.e.a(fileG.getAbsolutePath() + File.separator + "diy.config", "isLocalDiy", (Object) true);
                        ThemeDIYActivity.this.n.a((aq) bVar);
                    }
                }
            });
        } else {
            com.tsf.extend.theme.diy.c.a().a(this.o, this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(aq aqVar) {
        v.a(aqVar.d(this), a(this.y.c, this.y.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float f2 = (((float) width) * 1.0f) / ((float) height) > a ? b / width : c / height;
        matrix.postScale(f2, f2);
        Matrix matrix2 = new Matrix();
        float f3 = (((float) width2) * 1.0f) / ((float) height2) > a ? b / width2 : c / height2;
        matrix2.postScale(f3, f3);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) b, (int) c, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, matrix2, null);
            canvas.drawBitmap(bitmap2, matrix, null);
            canvas.save(31);
            canvas.restore();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            return bitmap2;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.au.removeCallbacksAndMessages(null);
        com.tsf.extend.theme.diy.c.a().b();
        v.h().c();
        if (this.C != null) {
            this.C.a();
            this.C = null;
        }
        if (this.D != null) {
            this.D.a();
            this.D = null;
        }
        this.w = null;
        this.l.clear();
        if (this.A != null) {
            getApplicationContext().unbindService(this.at);
        }
        if (this.O != null && this.O.isShowing()) {
            this.O.dismiss();
            this.O = null;
        }
        if (this.y != null) {
            this.y.d = null;
            this.y.c = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onActivityResult(final int i2, final int i3, final Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (!this.ag) {
            this.ah = new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.12
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDIYActivity.this.onActivityResult(i2, i3, intent);
                }
            };
            return;
        }
        if (i2 == 0 || i2 == 1) {
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    this.ao = com.tsf.extend.base.j.e.c(this, data);
                    this.ap = i2 == 1 ? o.FROM_ONLINE : o.FROM_ALUME;
                    if (i2 == 1) {
                        this.ak = intent.getStringExtra("wallpaper_id");
                        this.al = intent.getStringExtra("wallpaper_categoryId");
                        this.am = intent.getStringExtra("wallpaper_tag");
                        this.an = intent.getStringExtra("wallpaper_name");
                    } else {
                        this.ak = null;
                        this.al = null;
                        this.am = null;
                        this.an = null;
                    }
                    if (this.y.c != null && com.tsf.extend.base.j.i.d() <= 540) {
                        this.y.c.recycle();
                        this.y.c = null;
                        a(this.r, a.SET_WALLPAER);
                    }
                    if (i.CHOOSE_WALLPAER_A == this.N) {
                        b(i.CHOOSE_WALLPAER_B);
                    }
                    r();
                    this.j.post(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.13
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                int i4 = com.tsf.extend.base.j.i.d() > 540 ? (int) ThemeDIYActivity.b : 540;
                                ThemeDIYActivity.this.y.c = ThemeDIYActivity.a(ThemeDIYActivity.this, ThemeDIYActivity.this.ao, i4, (int) (i4 / ThemeDIYActivity.a), true);
                                ThemeDIYActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.13.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ThemeDIYActivity.this.y.a = 3;
                                        ThemeDIYActivity.this.a(ThemeDIYActivity.this.r, a.SET_WALLPAER);
                                        if (ThemeDIYActivity.this.C != null) {
                                            ThemeDIYActivity.this.C.setVisibility(8);
                                        }
                                        ThemeDIYActivity.this.d(true);
                                    }
                                });
                                File file = new File(com.tsf.extend.theme.diy.e.b(ThemeDIYActivity.this), "temp_1width_wallpaper");
                                if ("content".equals(ThemeDIYActivity.this.ao.getScheme()) || "file".equals(ThemeDIYActivity.this.ao.getScheme())) {
                                    v.a(file, ThemeDIYActivity.a(ThemeDIYActivity.this, ThemeDIYActivity.this.ao, p.b(), p.c(), false));
                                } else {
                                    v.a(file, ThemeDIYActivity.a(ThemeDIYActivity.this, ThemeDIYActivity.this.ao, p.b() * 2, p.c(), false));
                                }
                                ThemeDIYActivity.this.ai = i2 == 1;
                            } catch (Throwable th) {
                                ThemeDIYActivity.this.o();
                            }
                        }
                    });
                }
                if (i2 == 0) {
                }
            } else if (i2 == 0) {
            }
        }
        this.J = true;
        this.G = true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (q()) {
            v();
            return;
        }
        if (this.C.getVisibility() != 0) {
            int iA = this.N.a();
            if (iA == 1 || iA == i.APPLY.a()) {
                this.G = false;
                super.onBackPressed();
            } else {
                if (iA > 2) {
                    if (this.N == i.SAVE) {
                        this.F = "1602";
                    } else if (this.N == i.CHOOSE_ICON) {
                    }
                    j();
                    return;
                }
                if (c()) {
                    super.onBackPressed();
                } else {
                    c(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        b(a(this.N.a() + 1));
    }

    private void j() {
        b(a(this.N.a() - 1));
    }

    private void b(i iVar) {
        this.N = iVar;
        if (iVar != i.APPLY) {
            this.v.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.q.getLayoutParams();
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = com.tsf.extend.base.j.i.a(20.0f);
            this.q.setLayoutParams(layoutParams);
        }
        switch (iVar) {
            case CHOOSE_WALLPAER_B:
                this.as.setVisibility(0);
                ((TextView) findViewById(f.e.theme_btn_next)).setText(f.g.theme_btn_next);
                m();
                b(8);
                break;
            case CHOOSE_ICON:
                if (this.C != null) {
                    this.C.setText("");
                }
                this.as.setVisibility(0);
                ((TextView) findViewById(f.e.theme_btn_next)).setText(f.g.save_and_apply);
                k();
                break;
            case SAVE:
                this.as.setVisibility(8);
                this.i.setVisibility(8);
                m();
                g();
                break;
            case APPLY:
                this.i.setVisibility(8);
                break;
        }
        b();
        a();
        c(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.L.getVisibility() == 0) {
            d(true);
        }
        if (this.av != null && Build.VERSION.SDK_INT >= 11) {
            this.av.cancel();
        }
        this.e.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.av = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.q, "translationY", this.q.getTranslationY(), -this.U);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.e, "translationY", this.e.getTranslationY(), 0.0f);
            objectAnimatorOfFloat2.setStartDelay(30L);
            ((AnimatorSet) this.av).playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.av.setDuration(200L);
            this.av.start();
        }
        this.s.setImageResource(f.d.theme_icons_down);
        this.ae = false;
    }

    private void l() {
        if (x()) {
            this.ac = true;
        } else if (w()) {
            this.ad = true;
        }
    }

    public void a(MotionEvent motionEvent) {
        float y = motionEvent.getY() - this.ab;
        float fA = com.tsf.extend.base.j.i.a(5.0f);
        if ((y > fA && this.ad) || (y < (-fA) && this.ac)) {
            if (this.ac) {
                k();
                this.ac = false;
                return;
            } else {
                m();
                this.ad = false;
                return;
            }
        }
        this.ac = false;
        this.ad = false;
    }

    private void m() {
        if (this.av != null && Build.VERSION.SDK_INT >= 11) {
            this.av.cancel();
        }
        float translationY = Build.VERSION.SDK_INT >= 11 ? this.q.getTranslationY() : 0.0f;
        if (Build.VERSION.SDK_INT >= 11) {
            this.av = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.q, "translationY", translationY, 0.0f);
            objectAnimatorOfFloat.setStartDelay(30L);
            ((AnimatorSet) this.av).playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(this.e, "translationY", this.e.getTranslationY(), this.V));
            this.av.addListener(new AnimatorListenerAdapter() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ThemeDIYActivity.this.e.setVisibility(8);
                }
            });
            this.av.setDuration(200L);
            this.av.start();
        }
        this.s.setImageResource(f.d.theme_icons_up);
        this.ae = true;
    }

    private void c(boolean z) {
        this.I = z;
        this.O = new e.a(this).a(f.g.theme_diy_dialog_message).b(f.g.theme_diy_dialog_exit, this).a(f.g.theme_diy_dialog_cancel, this).a();
        this.O.a(true);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.G) {
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (!this.G || this.H || !this.J) {
        }
        this.J = false;
        this.H = false;
    }

    public static Bitmap a(Context context, Uri uri, int i2, int i3, boolean z) throws Throwable {
        InputStream inputStreamOpenInputStream;
        BitmapFactory.Options options;
        InputStream inputStream;
        InputStream inputStreamOpenInputStream2;
        Throwable th;
        int iA = com.tsf.extend.base.j.e.a(context, uri);
        boolean z2 = (iA == 0 || (iA / 90) % 2 == 0) ? false : true;
        try {
            if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } else {
                inputStreamOpenInputStream = new FileInputStream(new File(uri.toString()));
            }
        } catch (Exception e2) {
            inputStreamOpenInputStream = null;
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        if (z || inputStreamOpenInputStream.available() > 2097152) {
            try {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                int iA2 = com.tsf.extend.base.j.e.a(options2, z2 ? i3 : i2, z2 ? i2 : i3);
                BitmapFactory.Options options3 = new BitmapFactory.Options();
                options3.inSampleSize = iA2;
                options3.inJustDecodeBounds = false;
                inputStreamOpenInputStream.close();
                options = options3;
                inputStream = null;
            } catch (Throwable th2) {
                inputStreamOpenInputStream.close();
                throw th2;
            }
        } else {
            inputStream = inputStreamOpenInputStream;
            options = null;
        }
        if (inputStream == null) {
            try {
                if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                    inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                } else {
                    inputStreamOpenInputStream2 = new FileInputStream(new File(uri.toString()));
                }
            } catch (Throwable th3) {
                inputStreamOpenInputStream2 = inputStream;
                th = th3;
                inputStreamOpenInputStream2.close();
                throw th;
            }
        } else {
            inputStreamOpenInputStream2 = inputStream;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
            Bitmap bitmapA = com.tsf.extend.base.j.e.a(bitmapDecodeStream, i2, i3, iA, ((float) bitmapDecodeStream.getWidth()) / ((float) bitmapDecodeStream.getHeight()) > ((float) p.b()) / ((float) p.c()) ? 17 : 48, Bitmap.Config.ARGB_8888, true);
            inputStreamOpenInputStream2.close();
            return bitmapA;
        } catch (Throwable th4) {
            inputStream = inputStreamOpenInputStream2;
            inputStream.close();
            return null;
        }
    }

    private void a(ViewGroup viewGroup) {
        ImageView imageView = (ImageView) findViewById(f.e.theme_diy_wallpaper_iv);
        imageView.setImageBitmap(this.y.c);
        imageView.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup, a aVar) {
        ImageView imageView = (ImageView) viewGroup.findViewById(f.e.theme_diy_wallpaper_iv);
        if (aVar == a.SET_WALLPAER) {
            com.tsf.extend.base.j.b.a(imageView, new BitmapDrawable(getResources(), this.y.c));
        } else if (aVar == a.SET_THEME) {
            imageView.setImageDrawable(new BitmapDrawable(getResources(), this.y.d));
        }
    }

    public class m extends BaseAdapter {
        private Context b;

        public m(Context context) {
            this.b = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (ThemeDIYActivity.this.m != null) {
                return ThemeDIYActivity.this.m.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c getItem(int i) {
            if (i < getCount()) {
                return (c) ThemeDIYActivity.this.m.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            n nVar;
            View viewInflate;
            if (view == null) {
                viewInflate = LayoutInflater.from(this.b).inflate(f.C0052f.theme_diy_list_item, viewGroup, false);
                n nVar2 = new n();
                viewInflate.setTag(nVar2);
                nVar2.a.b = viewInflate.findViewById(f.e.left_item);
                nVar2.a.d = (ImageView) nVar2.a.b.findViewById(f.e.theme_icons_thumb);
                nVar2.a.c = (ImageView) nVar2.a.b.findViewById(f.e.theme_icons_selector);
                nVar2.b.b = viewInflate.findViewById(f.e.center_item);
                nVar2.b.d = (ImageView) nVar2.b.b.findViewById(f.e.theme_icons_thumb);
                nVar2.b.c = (ImageView) nVar2.b.b.findViewById(f.e.theme_icons_selector);
                nVar2.c.b = viewInflate.findViewById(f.e.right_item);
                nVar2.c.d = (ImageView) nVar2.c.b.findViewById(f.e.theme_icons_thumb);
                nVar2.c.c = (ImageView) nVar2.c.b.findViewById(f.e.theme_icons_selector);
                a(nVar2.a.b);
                a(nVar2.b.b);
                a(nVar2.c.b);
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                if (Build.VERSION.SDK_INT >= 11) {
                    linearLayout.setDividerDrawable(ThemeDIYActivity.this.Q);
                    linearLayout.setShowDividers(2);
                }
                nVar2.a.b.setOnClickListener(ThemeDIYActivity.this);
                nVar2.b.b.setOnClickListener(ThemeDIYActivity.this);
                nVar2.c.b.setOnClickListener(ThemeDIYActivity.this);
                ThemeDIYActivity.this.l.add(nVar2);
                nVar = nVar2;
            } else {
                nVar = (n) view.getTag();
                viewInflate = view;
            }
            c item = getItem(i);
            nVar.a.a = item.a;
            nVar.b.a = item.b;
            nVar.c.a = item.c;
            a(nVar.a);
            a(nVar.b);
            a(nVar.c);
            return viewInflate;
        }

        private void a(View view) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = ThemeDIYActivity.this.P;
            layoutParams.height = ThemeDIYActivity.this.P;
        }

        private void a(e eVar) {
            if (eVar.a == null) {
                eVar.b.setVisibility(4);
                return;
            }
            eVar.b.setTag(eVar);
            eVar.b.setVisibility(0);
            if (!TextUtils.isEmpty(eVar.a.b())) {
                com.tsf.extend.theme.diy.c.a().a(eVar.a.b(), ThemeDIYActivity.this.p);
            }
            if (ThemeDIYActivity.this.o != null && ThemeDIYActivity.this.o.a() == eVar.a.a()) {
                eVar.c.setVisibility(0);
            } else {
                eVar.c.setVisibility(8);
            }
        }
    }

    private class n {
        public e a;
        public e b;
        public e c;

        private n() {
            this.a = ThemeDIYActivity.this.new e();
            this.b = ThemeDIYActivity.this.new e();
            this.c = ThemeDIYActivity.this.new e();
        }
    }

    class e {
        public com.tsf.extend.theme.b.a a;
        public View b;
        public ImageView c;
        public ImageView d;

        e() {
        }
    }

    class h implements b.a<com.tsf.extend.base.b.a> {
        public h() {
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(final com.tsf.extend.base.b.a aVar) {
            if (aVar != null) {
                z.a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.h.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ThemeDIYActivity.this.m.clear();
                        List listA = aVar.a();
                        ArrayList arrayListNewArrayList = Lists.newArrayList();
                        int size = (listA.size() / 3) + (listA.size() % 3 == 0 ? 0 : 1);
                        for (int i = 0; i < size; i++) {
                            com.tsf.extend.theme.b.a aVar2 = (com.tsf.extend.theme.b.a) listA.get(i * 3);
                            com.tsf.extend.theme.b.a aVar3 = (i * 3) + 1 < listA.size() ? (com.tsf.extend.theme.b.a) listA.get((i * 3) + 1) : null;
                            com.tsf.extend.theme.b.a aVar4 = (i * 3) + 2 < listA.size() ? (com.tsf.extend.theme.b.a) listA.get((i * 3) + 2) : null;
                            c cVar = ThemeDIYActivity.this.new c();
                            cVar.a = aVar2;
                            cVar.b = aVar3;
                            cVar.c = aVar4;
                            arrayListNewArrayList.add(cVar);
                        }
                        ThemeDIYActivity.this.m.addAll(arrayListNewArrayList);
                        ThemeDIYActivity.this.f.setVisibility(0);
                        ThemeDIYActivity.this.h.setVisibility(8);
                        if (ThemeDIYActivity.this.D != null) {
                            ThemeDIYActivity.this.D.setVisibility(8);
                        }
                        ThemeDIYActivity.this.g.notifyDataSetChanged();
                    }
                });
            }
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(int i, com.tsf.extend.base.b.a aVar) {
            if (aVar != null) {
                z.a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.h.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ThemeDIYActivity.this.m.size() > 0) {
                            ThemeDIYActivity.this.f.setVisibility(0);
                            ThemeDIYActivity.this.h.setVisibility(8);
                            if (ThemeDIYActivity.this.D != null) {
                                ThemeDIYActivity.this.D.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        ThemeDIYActivity.this.f.setVisibility(8);
                        ThemeDIYActivity.this.h.setVisibility(0);
                        if (ThemeDIYActivity.this.D != null) {
                            ThemeDIYActivity.this.D.setVisibility(8);
                        }
                    }
                });
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.C != null && this.C.getVisibility() == 0) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ab = motionEvent.getY();
            if ((w() || x()) && b(motionEvent)) {
                l();
            }
        } else if (action == 1 || action == 3) {
            a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private class l implements b.a<Pair<String, Bitmap>> {
        private l() {
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                b(pair);
            }
        }

        private void b(Pair<String, Bitmap> pair) {
            String str = (String) pair.first;
            Bitmap bitmap = (Bitmap) pair.second;
            if (!TextUtils.isEmpty(str) && bitmap != null) {
                for (n nVar : ThemeDIYActivity.this.l) {
                    if (nVar.a != null && nVar.a.a != null && str.equals(nVar.a.a.b())) {
                        nVar.a.d.setImageBitmap(bitmap);
                    } else if (nVar.b != null && nVar.b.a != null && str.equals(nVar.b.a.b())) {
                        nVar.b.d.setImageBitmap(bitmap);
                    } else if (nVar.c != null && nVar.c.a != null && str.equals(nVar.c.a.b())) {
                        nVar.c.d.setImageBitmap(bitmap);
                    }
                }
            }
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(int i, Pair<String, Bitmap> pair) {
            if (pair != null) {
                b(pair);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        long jCurrentTimeMillis = 500 - (System.currentTimeMillis() - this.E);
        if (jCurrentTimeMillis > 0) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDIYActivity.this.a(ThemeDIYActivity.this.r, a.SET_THEME);
                    if (ThemeDIYActivity.this.C != null) {
                        ThemeDIYActivity.this.C.setVisibility(8);
                    }
                }
            }, jCurrentTimeMillis);
        } else {
            z.a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDIYActivity.this.a(ThemeDIYActivity.this.r, a.SET_THEME);
                    if (ThemeDIYActivity.this.C != null) {
                        ThemeDIYActivity.this.C.setVisibility(8);
                    }
                }
            });
        }
    }

    private class k implements b.a<Pair<String, Bitmap>> {
        private k() {
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                b(pair);
            }
        }

        private void b(Pair<String, Bitmap> pair) {
            String str = (String) pair.first;
            Bitmap bitmap = (Bitmap) pair.second;
            if (!TextUtils.isEmpty(str) && bitmap != null) {
                ThemeDIYActivity.this.y.d = (Bitmap) pair.second;
            }
            ThemeDIYActivity.this.n();
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(int i, Pair<String, Bitmap> pair) {
            if (pair != null) {
                b(pair);
                Toast.makeText(ThemeDIYActivity.this, f.g.changewallpaper_toast_text_error, 0).show();
                ThemeDIYActivity.this.o();
            }
        }
    }

    private class j implements b.a<aq> {
        private j() {
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(final aq aqVar) {
            if (aqVar != null) {
                ThemeDIYActivity.this.j.post(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.1
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        File fileA;
                        ThemeDIYActivity.this.z = aqVar;
                        if (ThemeDIYActivity.this.z != null && (fileA = aqVar.a(ThemeDIYActivity.this)) != null) {
                            if (ThemeDIYActivity.this.y.a != 1) {
                                if (ThemeDIYActivity.this.y.a != 0) {
                                    if (ThemeDIYActivity.this.y.a == 2) {
                                        File fileY = ThemeDIYActivity.this.y();
                                        if (fileY != null) {
                                            com.tsf.extend.base.j.l.a(fileY.getAbsolutePath(), fileA.getAbsolutePath());
                                        } else {
                                            return;
                                        }
                                    } else {
                                        com.tsf.extend.base.j.l.a(com.tsf.extend.theme.diy.e.b(ThemeDIYActivity.this).getAbsolutePath() + File.separator + "temp_1width_wallpaper", fileA.getAbsolutePath());
                                    }
                                } else {
                                    v.a(fileA, ab.a(ThemeDIYActivity.this, null, false, false, 0));
                                }
                            } else {
                                v.a(fileA, com.tsf.extend.base.j.d.b(WallpaperManager.getInstance(ThemeDIYActivity.this)));
                            }
                        }
                        ThemeDIYActivity.this.b(aqVar);
                        z.a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (ThemeDIYActivity.this.C != null) {
                                    ThemeDIYActivity.this.C.setVisibility(8);
                                }
                                ThemeDIYActivity.this.i();
                                ThemeDIYActivity.this.F = "1605";
                            }
                        });
                        ThemeDIYActivity.this.a(aqVar);
                        com.tsf.extend.theme.diy.e.a(aqVar.g(ThemeDIYActivity.this).getAbsolutePath() + File.separator + "diy.config", "isUsingOnLineWallpaper", Boolean.valueOf(ThemeDIYActivity.this.ai));
                        ThemeDIYActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ThemeDIYActivity.this.a(ThemeDIYActivity.this.ai);
                            }
                        });
                    }
                });
            }
        }

        @Override // com.tsf.extend.theme.diy.b.a
        public void a(int i, aq aqVar) {
            if (aqVar != null) {
                z.a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ThemeDIYActivity.this.N = i.CHOOSE_ICON;
                        ThemeDIYActivity.this.a();
                        ThemeDIYActivity.this.k();
                        ThemeDIYActivity.this.o();
                        Toast.makeText(ThemeDIYActivity.this, f.g.theme_diy_download_failed, 1).show();
                    }
                });
            }
        }
    }

    private class d implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        private final List<String> b;
        private aq c;

        public d(aq aqVar) {
            this.c = aqVar;
            this.b = ThemeDIYActivity.this.o.e();
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                final Bitmap bitmap = (Bitmap) pair.second;
                String str = (String) pair.first;
                if (bitmap != null && str != null && !TextUtils.isEmpty(str)) {
                    final int iIndexOf = this.b.indexOf(str);
                    z.a(2, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            v.a(d.this.c.a(ThemeDIYActivity.this, iIndexOf), ThemeDIYActivity.this.a(ThemeDIYActivity.this.y.c, bitmap));
                        }
                    });
                }
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
        if (this.C != null) {
            this.C.setVisibility(8);
        }
    }

    private void b(String str) {
        if (this.t != null && this.t.isShowing()) {
            this.t.a(str);
            return;
        }
        this.t = new com.tsf.extend.theme.o(this);
        this.t.a(str);
        this.t.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.t != null) {
            this.t.dismiss();
            this.t = null;
        }
    }

    private void p() {
        if (this.k == null) {
            this.k = new h();
        }
        if (this.p == null) {
            this.p = new l();
        }
        if (this.D != null) {
            this.D.setVisibility(0);
        }
        com.tsf.extend.theme.diy.c.a().a(this.k, b.EnumC0061b.LoadCache);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.O.dismiss();
        String str = this.F;
        if (i2 == -2) {
            this.G = false;
            finish();
        }
        switch (this.N) {
            case CHOOSE_WALLPAER_B:
                this.F = "1600";
                break;
            case CHOOSE_ICON:
                this.F = "1602";
                break;
            case SAVE:
                this.F = "1606";
                break;
        }
    }

    class c {
        public com.tsf.extend.theme.b.a a;
        public com.tsf.extend.theme.b.a b;
        public com.tsf.extend.theme.b.a c;

        c() {
        }
    }

    public class f extends ColorDrawable {
        int a;
        int b;

        public f(int i, int i2) {
            this.b = i;
            this.a = i;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.b;
        }
    }

    private boolean q() {
        return findViewById(f.e.content_mask).getVisibility() == 0;
    }

    private void b(int i2) {
        findViewById(f.e.content_mask).setVisibility(i2);
        findViewById(f.e.theme_diy_head_mask).setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        if (this.W == 0) {
            this.W = this.x.getHeight();
        }
        if (z) {
            layoutParams.height = this.W + com.tsf.extend.base.j.i.a(34.0f);
        } else {
            layoutParams.height = this.W - com.tsf.extend.base.j.i.a(30.0f);
        }
        this.x.setLayoutParams(layoutParams);
    }

    private void e(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.q.getLayoutParams();
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = com.tsf.extend.base.j.i.a(z ? 20.0f : 5.0f);
        this.q.setLayoutParams(layoutParams);
    }

    private void c(int i2) {
        this.L.setVisibility(i2);
    }

    private void r() {
        b(8);
        d(true);
        c(8);
        this.K.setVisibility(8);
        this.as.setVisibility(0);
    }

    private void s() {
        Intent intent = new Intent(this, (Class<?>) WallpaperOnLineActivity.class);
        intent.putExtra("DIY_PAGE_FROM", this.F);
        startActivityForResult(intent, 1);
    }

    private void t() {
        b(0);
        c(0);
        this.K.setVisibility(0);
        if (this.e.getVisibility() != 0) {
            d(false);
        }
        this.as.setVisibility(8);
        this.M.setVisibility(8);
        this.i.setVisibility(0);
        b();
        f();
    }

    private void u() {
        c(8);
        d(true);
    }

    private void c(i iVar) {
        switch (iVar) {
            case CHOOSE_WALLPAER_B:
                b(8);
                this.as.setVisibility(0);
                this.K.setVisibility(8);
                this.L.setVisibility(8);
                d(true);
                this.M.setVisibility(8);
                break;
            case CHOOSE_ICON:
                b(8);
                this.L.setVisibility(8);
                this.as.setVisibility(0);
                this.K.setVisibility(8);
                this.M.setVisibility(8);
                break;
            case SAVE:
                this.M.setVisibility(0);
                b(8);
                ((TextView) this.K).setText(f.g.save_and_apply);
                this.L.setVisibility(8);
                this.as.setVisibility(8);
                this.K.setVisibility(0);
                d(true);
                break;
        }
    }

    private void v() {
        c(this.N);
    }

    private boolean w() {
        return this.e.getVisibility() == 0;
    }

    private boolean x() {
        return this.e.getVisibility() == 8 && this.s.getVisibility() == 0;
    }

    private boolean b(MotionEvent motionEvent) {
        this.q.getGlobalVisibleRect(this.Z);
        this.r.getGlobalVisibleRect(this.aa);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        return this.Z.contains(rawX, rawY) && !this.aa.contains(rawX, rawY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File y() {
        List<aq> listI = v.i();
        if (listI.isEmpty()) {
            return null;
        }
        return listI.get(listI.size() - 1).a(this);
    }

    public static void a(Context context, String str, int i2) {
        String strA;
        Intent intent = new Intent(context, (Class<?>) ThemeDIYActivity.class);
        if ((context instanceof ThemeCmClubActivity) && (strA = ((ThemeCmClubActivity) context).a()) != null) {
            intent.putExtra("launch_host", strA);
        }
        context.startActivity(intent);
    }
}
