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
import com.tsf.extend.C1536f;
import com.tsf.extend.DialogInterfaceC1526e;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p073c.AbstractBinderC1381b;
import com.tsf.extend.base.p073c.InterfaceC1380a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1433l;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.AbstractC1700aq;
import com.tsf.extend.theme.C1703b;
import com.tsf.extend.theme.C1846j;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.DialogC1859o;
import com.tsf.extend.theme.cmclub.ThemeCmClubActivity;
import com.tsf.extend.theme.diy.C1819d;
import com.tsf.extend.theme.diy.C1821e;
import com.tsf.extend.theme.diy.InterfaceC1803b;
import com.tsf.extend.theme.diy.view.ThemeLoadingAnim;
import com.tsf.extend.theme.p083b.C1704a;
import com.tsf.extend.wallpaper.C2035ab;
import com.tsf.extend.wallpaper.PersonalizationActivity;
import com.tsf.extend.wallpaper.WallpaperOnLineActivity;
import com.tsf.extend.wallpaper.upload.UploadWallpaperService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeDIYActivity extends Activity implements DialogInterface.OnClickListener, View.OnClickListener, C1819d.InterfaceC1820a {

    /* renamed from: a */
    public static float f5666a = 0.5625f;

    /* renamed from: b */
    public static float f5667b = 720.0f;

    /* renamed from: c */
    public static float f5668c = 1280.0f;

    /* renamed from: A */
    private AbstractBinderC1381b f5669A;

    /* renamed from: B */
    private Timer f5670B;

    /* renamed from: C */
    private ThemeLoadingAnim f5671C;

    /* renamed from: D */
    private ThemeLoadingAnim f5672D;

    /* renamed from: E */
    private long f5673E;

    /* renamed from: K */
    private View f5679K;

    /* renamed from: L */
    private View f5680L;

    /* renamed from: M */
    private View f5681M;

    /* renamed from: O */
    private DialogInterfaceC1526e f5683O;

    /* renamed from: P */
    private int f5684P;

    /* renamed from: Q */
    private C1784f f5685Q;

    /* renamed from: R */
    private View f5686R;

    /* renamed from: S */
    private View f5687S;

    /* renamed from: T */
    private View f5688T;

    /* renamed from: U */
    private int f5689U;

    /* renamed from: V */
    private int f5690V;

    /* renamed from: ab */
    private float f5696ab;

    /* renamed from: af */
    private TextView f5700af;

    /* renamed from: ag */
    private boolean f5701ag;

    /* renamed from: ah */
    private Runnable f5702ah;

    /* renamed from: aj */
    private C1819d f5704aj;

    /* renamed from: aq */
    private String f5711aq;

    /* renamed from: ar */
    private View f5712ar;

    /* renamed from: as */
    private View f5713as;

    /* renamed from: av */
    private Animator f5716av;

    /* renamed from: d */
    private TextView f5717d;

    /* renamed from: e */
    private View f5718e;

    /* renamed from: f */
    private ListView f5719f;

    /* renamed from: g */
    private C1797m f5720g;

    /* renamed from: h */
    private View f5721h;

    /* renamed from: i */
    private View f5722i;

    /* renamed from: j */
    private Handler f5723j;

    /* renamed from: k */
    private C1786h f5724k;

    /* renamed from: n */
    private C1790j f5727n;

    /* renamed from: o */
    private C1704a f5728o;

    /* renamed from: p */
    private C1796l f5729p;

    /* renamed from: q */
    private FrameLayout f5730q;

    /* renamed from: r */
    private FrameLayout f5731r;

    /* renamed from: s */
    private ImageView f5732s;

    /* renamed from: t */
    private DialogC1859o f5733t;

    /* renamed from: u */
    private C1795k f5734u;

    /* renamed from: v */
    private View f5735v;

    /* renamed from: w */
    private C1781d f5736w;

    /* renamed from: x */
    private LinearLayout f5737x;

    /* renamed from: y */
    private C1779b f5738y;

    /* renamed from: z */
    private AbstractC1700aq f5739z;

    /* renamed from: l */
    private List<C1798n> f5725l = Lists.newArrayList();

    /* renamed from: m */
    private List<C1780c> f5726m = Lists.newArrayList();

    /* renamed from: F */
    private String f5674F = "1600";

    /* renamed from: G */
    private boolean f5675G = true;

    /* renamed from: H */
    private boolean f5676H = true;

    /* renamed from: I */
    private boolean f5677I = true;

    /* renamed from: J */
    private boolean f5678J = false;

    /* renamed from: N */
    private EnumC1789i f5682N = EnumC1789i.CHOOSE_WALLPAER_A;

    /* renamed from: W */
    private int f5691W = 0;

    /* renamed from: X */
    private boolean f5692X = true;

    /* renamed from: Y */
    private boolean f5693Y = false;

    /* renamed from: Z */
    private Rect f5694Z = new Rect();

    /* renamed from: aa */
    private Rect f5695aa = new Rect();

    /* renamed from: ac */
    private boolean f5697ac = false;

    /* renamed from: ad */
    private boolean f5698ad = false;

    /* renamed from: ae */
    private boolean f5699ae = false;

    /* renamed from: ai */
    private boolean f5703ai = false;

    /* renamed from: ak */
    private String f5705ak = null;

    /* renamed from: al */
    private String f5706al = null;

    /* renamed from: am */
    private String f5707am = null;

    /* renamed from: an */
    private String f5708an = null;

    /* renamed from: ao */
    private Uri f5709ao = null;

    /* renamed from: ap */
    private EnumC1799o f5710ap = EnumC1799o.FROM_UNSELECT;

    /* renamed from: at */
    private ServiceConnection f5714at = new ServiceConnection() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ThemeDIYActivity.this.f5669A = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ThemeDIYActivity.this.f5669A = (AbstractBinderC1381b) iBinder;
        }
    };

    /* renamed from: au */
    private Handler f5715au = new Handler() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.6
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ThemeDIYActivity.this.m7487o();
                    ThemeDIYActivity.this.f5675G = false;
                    ThemeDIYActivity.this.finish();
                    return;
                case 1:
                    ThemeDIYActivity.this.f5682N = EnumC1789i.CHOOSE_ICON;
                    ThemeDIYActivity.this.m7552a();
                    ThemeDIYActivity.this.m7495k();
                    ThemeDIYActivity.this.m7487o();
                    Toast.makeText(ThemeDIYActivity.this, C1536f.C1543g.theme_changing_fail, 0).show();
                    return;
                default:
                    return;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$a */
    /* loaded from: classes.dex */
    public enum EnumC1778a {
        SET_WALLPAER,
        SET_THEME
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$i */
    /* loaded from: classes.dex */
    public enum EnumC1789i {
        CHOOSE_WALLPAER_A(1),
        CHOOSE_WALLPAER_B(2),
        CHOOSE_ICON(3),
        SAVE(4),
        APPLY(5);
        

        /* renamed from: f */
        private int f5796f;

        EnumC1789i(int i) {
            this.f5796f = i;
        }

        /* renamed from: a */
        public int m7451a() {
            return this.f5796f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$o */
    /* loaded from: classes.dex */
    public enum EnumC1799o {
        FROM_ALUME(2),
        FROM_ONLINE(3),
        FROM_UNSELECT(4);
        

        /* renamed from: d */
        private int f5815d;

        EnumC1799o(int i) {
            this.f5815d = i;
        }
    }

    /* renamed from: a */
    public static EnumC1789i m7551a(int i) {
        switch (i) {
            case 1:
                return EnumC1789i.CHOOSE_WALLPAER_A;
            case 2:
                return EnumC1789i.CHOOSE_WALLPAER_B;
            case 3:
                return EnumC1789i.CHOOSE_ICON;
            case 4:
                return EnumC1789i.SAVE;
            case 5:
                return EnumC1789i.APPLY;
            default:
                return EnumC1789i.CHOOSE_WALLPAER_A;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$b */
    /* loaded from: classes.dex */
    public class C1779b {

        /* renamed from: a */
        public int f5763a;

        /* renamed from: c */
        private Bitmap f5765c;

        /* renamed from: d */
        private Bitmap f5766d;

        private C1779b() {
            this.f5765c = null;
            this.f5766d = null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1536f.C1542f.theme_diy_activity);
        C1437p.m8622a((Activity) this);
        this.f5738y = new C1779b();
        this.f5717d = (TextView) findViewById(C1536f.C1541e.title);
        this.f5717d.setOnClickListener(this);
        int m8659a = C1430i.m8659a(64.0f);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, C1430i.m8659a(22.0f) + m8659a));
        this.f5718e = findViewById(C1536f.C1541e.icons_chooser_panel);
        this.f5718e.setOnClickListener(this);
        this.f5719f = (ListView) findViewById(C1536f.C1541e.gridview);
        this.f5719f.addFooterView(view, null, false);
        this.f5720g = new C1797m(this);
        this.f5719f.setAdapter((ListAdapter) this.f5720g);
        this.f5730q = (FrameLayout) findViewById(C1536f.C1541e.theme_diy_preview_container);
        this.f5732s = (ImageView) this.f5730q.findViewById(C1536f.C1541e.theme_icons_btn);
        this.f5732s.setOnClickListener(this);
        this.f5731r = (FrameLayout) this.f5730q.findViewById(C1536f.C1541e.theme_diy_preview_pager);
        m7546a(this.f5731r);
        this.f5671C = (ThemeLoadingAnim) findViewById(C1536f.C1541e.loading_progress);
        this.f5672D = (ThemeLoadingAnim) findViewById(C1536f.C1541e.thumb_loading_progress);
        this.f5672D.setText("");
        this.f5672D.setTextColor(getResources().getColor(C1536f.C1538b.black));
        this.f5672D.setLoadingIconTint(getResources().getColor(C1536f.C1538b.black));
        this.f5721h = findViewById(C1536f.C1541e.load_error_page);
        this.f5721h.setOnClickListener(this);
        HandlerThread handlerThread = new HandlerThread("diy_theme");
        handlerThread.start();
        this.f5723j = new Handler(handlerThread.getLooper());
        this.f5727n = new C1790j();
        getApplicationContext().bindService(new Intent("android.service.theme.ManagerService"), this.f5714at, 1);
        this.f5679K = findViewById(C1536f.C1541e.theme_btn);
        this.f5679K.setTag(this.f5682N);
        this.f5679K.setOnClickListener(this);
        this.f5681M = findViewById(C1536f.C1541e.choose_button_padding);
        this.f5713as = findViewById(C1536f.C1541e.choose_next_group);
        this.f5680L = findViewById(C1536f.C1541e.theme_choose_link);
        this.f5680L.setOnClickListener(this);
        this.f5700af = (TextView) findViewById(C1536f.C1541e.theme_btn_choose_wallpaper);
        this.f5700af.setOnClickListener(this);
        findViewById(C1536f.C1541e.theme_btn_next).setOnClickListener(this);
        this.f5722i = findViewById(C1536f.C1541e.theme_btn_next_default);
        this.f5722i.setOnClickListener(this);
        this.f5686R = findViewById(C1536f.C1541e.tab_choose_wallpaper);
        this.f5687S = findViewById(C1536f.C1541e.tab_choose_icon);
        this.f5688T = findViewById(C1536f.C1541e.tab_arrow1);
        this.f5686R.setOnClickListener(this);
        this.f5687S.setOnClickListener(this);
        this.f5735v = findViewById(C1536f.C1541e.theme_save_succ_group);
        this.f5737x = (LinearLayout) findViewById(C1536f.C1541e.content_layout);
        m7552a();
        if (getIntent() != null) {
            this.f5711aq = getIntent().getStringExtra("launch_host");
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1536f.C1539c.theme_diy_list_padding);
        this.f5690V = getResources().getDimensionPixelSize(C1536f.C1539c.theme_diy_list_panel_height);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f5718e.setTranslationY(this.f5690V);
        }
        this.f5689U = this.f5690V - m8659a;
        this.f5684P = (C1437p.m8619b() - (dimensionPixelSize * 4)) / 3;
        this.f5685Q = new C1784f(dimensionPixelSize, dimensionPixelSize);
        new AsyncTaskC1785g().execute(new Void[0]);
        m7485p();
        findViewById(C1536f.C1541e.theme_diy_head_mask).setOnClickListener(this);
        findViewById(C1536f.C1541e.content_top_mask).setOnClickListener(this);
        this.f5712ar = findViewById(C1536f.C1541e.new_diy);
        this.f5712ar.setOnClickListener(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f5692X) {
            m7510d(false);
            m7506e(false);
            this.f5692X = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7552a() {
        switch (this.f5682N) {
            case CHOOSE_WALLPAER_A:
            case CHOOSE_WALLPAER_B:
                this.f5687S.setSelected(false);
                this.f5686R.setSelected(true);
                this.f5688T.setSelected(true);
                this.f5732s.setVisibility(8);
                this.f5700af.setVisibility(0);
                return;
            case CHOOSE_ICON:
                this.f5686R.setSelected(false);
                this.f5688T.setSelected(false);
                this.f5687S.setSelected(true);
                this.f5732s.setVisibility(0);
                this.f5700af.setVisibility(8);
                return;
            case SAVE:
            case APPLY:
                this.f5732s.setVisibility(8);
                this.f5686R.setSelected(false);
                this.f5688T.setSelected(false);
                this.f5687S.setSelected(true);
                return;
            default:
                return;
        }
    }

    @Override // com.tsf.extend.theme.diy.C1819d.InterfaceC1820a
    /* renamed from: a */
    public void mo7009a(Bitmap bitmap) {
        if (bitmap != null) {
            if (!isFinishing()) {
                this.f5738y.f5766d = bitmap;
                m7545a(this.f5731r, EnumC1778a.SET_THEME);
            }
            C1894v.m7109a(this, bitmap);
        }
    }

    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$g */
    /* loaded from: classes.dex */
    class AsyncTaskC1785g extends AsyncTask<Void, Void, Pair<Bitmap, Integer>> {
        AsyncTaskC1785g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.util.Pair<android.graphics.Bitmap, java.lang.Integer> doInBackground(java.lang.Void... r11) {
            /*
                r10 = this;
                r9 = 1065353216(0x3f800000, float:1.0)
                r1 = 540(0x21c, float:7.57E-43)
                r2 = 0
                r6 = 1
                r7 = 0
                com.tsf.extend.theme.diy.ThemeDIYActivity r0 = com.tsf.extend.theme.diy.ThemeDIYActivity.this
                java.io.File r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.m7542a(r0)
                if (r3 == 0) goto Lb7
                boolean r0 = r3.exists()
                if (r0 == 0) goto Lb7
                int r0 = com.tsf.extend.base.p080j.C1430i.m8655d()
                if (r0 > r1) goto L36
                r0 = r1
            L1c:
                float r4 = (float) r0
                float r5 = com.tsf.extend.theme.diy.ThemeDIYActivity.f5666a
                float r4 = r4 / r5
                int r4 = (int) r4
                com.tsf.extend.theme.diy.ThemeDIYActivity r5 = com.tsf.extend.theme.diy.ThemeDIYActivity.this     // Catch: java.lang.Exception -> L3a
                android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch: java.lang.Exception -> L3a
                r8 = 1
                android.graphics.Bitmap r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.m7550a(r5, r3, r0, r4, r8)     // Catch: java.lang.Exception -> L3a
                r0 = 2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Laf
                android.util.Pair r2 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Exception -> Laf
            L35:
                return r2
            L36:
                float r0 = com.tsf.extend.theme.diy.ThemeDIYActivity.f5667b
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
                android.graphics.Bitmap r0 = com.tsf.extend.base.p080j.C1423d.m8687b(r0)
                r3 = r6
            L50:
                if (r0 != 0) goto Lb3
                int r0 = com.tsf.extend.base.p080j.C1430i.m8655d()
                if (r0 > r1) goto Lb1
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
                r0.<init>()
                r1 = 2
                r0.inSampleSize = r1
            L60:
                com.tsf.extend.theme.diy.ThemeDIYActivity r1 = com.tsf.extend.theme.diy.ThemeDIYActivity.this
                android.graphics.Bitmap r0 = com.tsf.extend.wallpaper.C2035ab.m6662a(r1, r0, r7, r7, r7)
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
                float r2 = com.tsf.extend.theme.diy.ThemeDIYActivity.f5666a
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L9f
                int r2 = r0.getHeight()
                int r1 = r0.getHeight()
                float r1 = (float) r1
                float r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.f5666a
                float r1 = r1 * r3
                int r1 = (int) r1
            L89:
                r3 = 8388611(0x800003, float:1.1754948E-38)
                r4 = 17
                android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
                if (r8 == r6) goto Lad
            L92:
                android.graphics.Bitmap r0 = com.tsf.extend.base.p080j.C1426e.m8672a(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                android.util.Pair r2 = android.util.Pair.create(r0, r1)
                goto L35
            L9f:
                int r1 = r0.getWidth()
                int r2 = r0.getWidth()
                float r2 = (float) r2
                float r3 = com.tsf.extend.theme.diy.ThemeDIYActivity.f5666a
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
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.diy.ThemeDIYActivity.AsyncTaskC1785g.doInBackground(java.lang.Void[]):android.util.Pair");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Pair<Bitmap, Integer> pair) {
            BitmapFactory.Options options;
            String str;
            super.onPostExecute(pair);
            ThemeDIYActivity.this.f5701ag = true;
            try {
                ThemeDIYActivity.this.f5738y.f5765c = (Bitmap) pair.first;
                ThemeDIYActivity.this.f5738y.f5763a = ((Integer) pair.second).intValue();
                ThemeDIYActivity.this.m7545a(ThemeDIYActivity.this.f5731r, EnumC1778a.SET_WALLPAER);
                if (C1430i.m8655d() <= 540) {
                    options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                } else {
                    options = null;
                }
                Bitmap m7108a = C1894v.m7069h().m7108a(ThemeDIYActivity.this, options);
                if (m7108a != null) {
                    ThemeDIYActivity.this.f5738y.f5766d = m7108a;
                    ThemeDIYActivity.this.m7545a(ThemeDIYActivity.this.f5731r, EnumC1778a.SET_THEME);
                } else {
                    if (PersonalizationActivity.f6215e) {
                        str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
                    } else {
                        str = "http://img.launcher.ksmobile.com/diy/diy_theme_default_3d.png";
                    }
                    ThemeDIYActivity.this.f5704aj = new C1819d(ThemeDIYActivity.this);
                    C1894v.m7069h().m8801a(str, ThemeDIYActivity.this.f5704aj);
                }
            } catch (Throwable th) {
            }
            if (ThemeDIYActivity.this.f5702ah != null) {
                ThemeDIYActivity.this.f5702ah.run();
                ThemeDIYActivity.this.f5702ah = null;
            }
        }
    }

    /* renamed from: b */
    private void m7530b() {
        int i;
        switch (this.f5682N) {
            case CHOOSE_WALLPAER_A:
            case CHOOSE_WALLPAER_B:
            case CHOOSE_ICON:
                i = C1536f.C1543g.theme_diy_btn_choose_wallpaper;
                break;
            case SAVE:
            default:
                i = 0;
                break;
            case APPLY:
                i = C1536f.C1543g.save_and_apply;
                break;
        }
        if (i == 0) {
            this.f5679K.setVisibility(8);
            return;
        }
        this.f5679K.setVisibility(0);
        ((TextView) this.f5679K).setText(i);
        this.f5679K.setTag(this.f5682N);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.theme_btn) {
            switch ((EnumC1789i) view.getTag()) {
                case CHOOSE_WALLPAER_A:
                case CHOOSE_WALLPAER_B:
                    m7521b(false);
                    return;
                case CHOOSE_ICON:
                case SAVE:
                case APPLY:
                    m7503g();
                    return;
                default:
                    return;
            }
        } else if (id == C1536f.C1541e.title) {
            int m7451a = this.f5682N.m7451a();
            if (m7451a > EnumC1789i.CHOOSE_WALLPAER_A.m7451a() && m7451a < EnumC1789i.APPLY.m7451a()) {
                if (m7520c()) {
                    super.onBackPressed();
                    return;
                } else {
                    m7514c(false);
                    return;
                }
            }
            onBackPressed();
        } else if (id == C1536f.C1541e.load_error_page) {
            this.f5721h.setVisibility(8);
            this.f5718e.setVisibility(0);
            m7485p();
        } else if (id == C1536f.C1541e.theme_btn_choose_wallpaper) {
            this.f5693Y = true;
            m7477t();
            m7506e(false);
        } else if (id == C1536f.C1541e.theme_btn_next_default) {
            if (EnumC1789i.CHOOSE_WALLPAER_A == this.f5682N) {
                m7526b(EnumC1789i.CHOOSE_WALLPAER_B);
            }
            this.f5678J = true;
            this.f5675G = true;
            m7499i();
            m7475u();
            m7509e();
        } else if (id == C1536f.C1541e.theme_btn_next) {
            m7513d();
            m7499i();
            m7475u();
        } else if (id == C1536f.C1541e.tab_choose_wallpaper) {
            if (this.f5682N != EnumC1789i.CHOOSE_WALLPAER_A && this.f5682N != EnumC1789i.CHOOSE_WALLPAER_B) {
                m7543a(EnumC1789i.CHOOSE_WALLPAER_B);
                m7526b(EnumC1789i.CHOOSE_WALLPAER_B);
            }
        } else if (id == C1536f.C1541e.tab_choose_icon) {
            if (this.f5682N != EnumC1789i.APPLY && this.f5682N != EnumC1789i.CHOOSE_ICON) {
                m7543a(EnumC1789i.CHOOSE_ICON);
                m7526b(EnumC1789i.CHOOSE_ICON);
            }
        } else if (id == C1536f.C1541e.theme_choose_link) {
            m7479s();
        } else if (id == C1536f.C1541e.theme_diy_head_mask || id == C1536f.C1541e.content_top_mask) {
            m7473v();
            m7506e(true);
        } else if (id == C1536f.C1541e.theme_icons_btn) {
            if (this.f5699ae) {
                m7495k();
            } else {
                m7491m();
            }
        } else if (id == C1536f.C1541e.theme_diy_wallpaper_iv) {
            if (this.f5682N != EnumC1789i.SAVE && this.f5682N != EnumC1789i.APPLY) {
                m7521b(true);
            }
        } else if (id == C1536f.C1541e.new_diy) {
            ThemeCmClubActivity.m7629a(this, "launch_host_club", "", 4);
        } else {
            C1783e c1783e = (C1783e) view.getTag();
            if (c1783e != null) {
                if (this.f5728o != null) {
                    long m7746a = this.f5728o.m7746a();
                    if (m7746a != c1783e.f5777a.m7746a()) {
                        Iterator<C1798n> it = this.f5725l.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C1798n next = it.next();
                            if (next.f5807a != null && next.f5807a.f5777a != null && next.f5807a.f5777a.m7746a() == m7746a) {
                                next.f5807a.f5779c.setVisibility(8);
                                break;
                            } else if (next.f5808b != null && next.f5808b.f5777a != null && next.f5808b.f5777a.m7746a() == m7746a) {
                                next.f5808b.f5779c.setVisibility(8);
                                break;
                            } else if (next.f5809c != null && next.f5809c.f5777a != null && next.f5809c.f5777a.m7746a() == m7746a) {
                                next.f5809c.f5779c.setVisibility(8);
                                break;
                            }
                        }
                    } else {
                        return;
                    }
                }
                c1783e.f5779c.setVisibility(0);
                this.f5728o = c1783e.f5777a;
                String str = this.f5728o.m7738c().get(0);
                if (str != null) {
                    if (this.f5734u == null) {
                        this.f5734u = new C1795k();
                    }
                    this.f5671C.setVisibility(0);
                    this.f5673E = System.currentTimeMillis();
                    C1806c.m7429a().m7421a(str, this.f5734u);
                    this.f5674F = "1602";
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m7520c() {
        return (this.f5738y.f5763a == 1 || this.f5738y.f5763a == 2 || this.f5738y.f5763a == 0) && this.f5728o == null;
    }

    /* renamed from: d */
    private void m7513d() {
        if (this.f5682N == EnumC1789i.CHOOSE_WALLPAER_B) {
            this.f5674F = "1602";
        } else if (this.f5682N == EnumC1789i.CHOOSE_ICON && m7551a(this.f5682N.m7451a() + 1) != EnumC1789i.SAVE) {
            this.f5674F = "1606";
        }
    }

    /* renamed from: e */
    private void m7509e() {
        this.f5674F = "1602";
    }

    /* renamed from: f */
    private void m7505f() {
        if (this.f5682N == EnumC1789i.CHOOSE_WALLPAER_B || this.f5682N == EnumC1789i.CHOOSE_WALLPAER_A || this.f5682N == EnumC1789i.CHOOSE_ICON) {
        }
    }

    /* renamed from: a */
    private void m7543a(EnumC1789i enumC1789i) {
        switch (this.f5682N) {
            case CHOOSE_WALLPAER_A:
            case CHOOSE_WALLPAER_B:
                String str = this.f5674F;
                if (enumC1789i == EnumC1789i.CHOOSE_ICON) {
                    this.f5674F = "1602";
                    return;
                } else {
                    this.f5674F = "1606";
                    return;
                }
            case CHOOSE_ICON:
                String str2 = this.f5674F;
                if (enumC1789i == EnumC1789i.CHOOSE_WALLPAER_B) {
                    this.f5674F = "1600";
                    return;
                } else {
                    this.f5674F = "1606";
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7531a(boolean z) {
        if (this.f5739z != null && this.f5739z.m7764I() != null && this.f5669A != null) {
            m7522b(getResources().getString(C1536f.C1543g.theme_applying_theme));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("PACKAGE_NAME", "DIY://" + this.f5739z.m7764I());
                if (this.f5739z.m7762K()) {
                    jSONObject.put("NO_ICON_GROUP", true);
                }
                jSONObject.put("IS_USING_ONLINE_WALLPAPER", z);
                jSONObject.put("SHOW_SHARE_TIP", this.f5739z.m7763J());
                jSONObject.put("launch_host", this.f5711aq);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("icon_group_id", String.valueOf(this.f5739z.m7762K() ? 0L : this.f5739z.m7297h()));
                jSONObject2.put("theme_pkg", "DIY://" + this.f5739z.m7764I());
                jSONObject2.put("wallpaper_id", this.f5705ak);
                jSONObject2.put("wallpaper_categoryId", this.f5706al);
                jSONObject2.put("wallpaper_tag", this.f5707am);
                jSONObject2.put("wallpaper_name", this.f5708an);
                jSONObject2.put("wallpaper_online", this.f5703ai);
                if (!this.f5739z.m7762K()) {
                    String mo7435a = this.f5739z.mo7435a("theme.png");
                    if (new File(mo7435a).exists()) {
                        jSONObject2.put("upload_icon_path", mo7435a);
                    }
                }
                if (this.f5709ao != null) {
                    jSONObject2.put("wallpaper_uri", this.f5709ao.toString());
                } else {
                    File m7467y = m7467y();
                    if (m7467y != null) {
                        jSONObject2.put("wallpaper_uri", Uri.fromFile(m7467y).toString());
                    }
                }
                jSONObject.put("upload_wallpaper_data", jSONObject2);
                String string = jSONObject2.getString("wallpaper_uri");
                Bitmap m7335a = C1846j.m7335a(getBaseContext(), jSONObject2.optString("upload_icon_path"));
                try {
                    this.f5669A.mo7564a("");
                } catch (Exception e) {
                }
                C1821e.m7402a(this, m7335a, Uri.parse(string), jSONObject2, UploadWallpaperService.EnumC2121a.APPLY, new C1821e.InterfaceC1836g() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.7
                    @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1836g
                    /* renamed from: a */
                    public void mo7369a(String str) {
                        try {
                            if (ThemeDIYActivity.this.f5669A != null) {
                                ThemeDIYActivity.this.f5669A.mo7564a(str);
                            }
                        } catch (Exception e2) {
                        }
                    }

                    @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1836g
                    /* renamed from: b */
                    public void mo7368b(String str) {
                        try {
                            if (ThemeDIYActivity.this.f5669A != null) {
                                ThemeDIYActivity.this.f5669A.mo7564a(str);
                            }
                        } catch (Exception e2) {
                        }
                    }
                });
            } catch (JSONException e2) {
            }
            m7532a(jSONObject.toString());
        }
    }

    /* renamed from: g */
    private void m7503g() {
        if (this.f5733t == null || !this.f5733t.isShowing()) {
            m7501h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7544a(AbstractC1700aq abstractC1700aq) {
        List<String> m7736e;
        if (this.f5728o != null && (m7736e = this.f5728o.m7736e()) != null && m7736e.size() != 0) {
            this.f5736w = new C1781d(abstractC1700aq);
            for (String str : m7736e) {
                C1894v.m7069h().m7079c(str, this.f5736w);
            }
        }
    }

    /* renamed from: b */
    private void m7521b(boolean z) {
        this.f5675G = false;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        try {
            startActivityForResult(intent, 0);
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tsf.extend.theme.diy.ThemeDIYActivity$9] */
    /* renamed from: a */
    private void m7532a(final String str) {
        final InterfaceC1380a interfaceC1380a = new InterfaceC1380a() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.8
            @Override // com.tsf.extend.base.p073c.InterfaceC1380a
            /* renamed from: a */
            public void mo7464a(int i) {
                if (ThemeDIYActivity.this.f5670B != null) {
                    ThemeDIYActivity.this.f5670B.cancel();
                }
                ThemeDIYActivity.this.f5715au.sendEmptyMessage(i);
            }
        };
        new AsyncTask<Void, Void, Void>() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.9
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                try {
                    ThemeDIYActivity.this.f5669A.mo7563a(str, interfaceC1380a);
                    return null;
                } catch (Exception e) {
                    ThemeDIYActivity.this.f5715au.sendEmptyMessage(1);
                    return null;
                }
            }
        }.execute(new Void[0]);
        this.f5670B = new Timer();
        this.f5670B.schedule(new TimerTask() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.10
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ThemeDIYActivity.this.f5715au.sendEmptyMessage(1);
            }
        }, 60000L);
    }

    /* renamed from: h */
    private void m7501h() {
        if (this.f5738y.f5766d == null && (this.f5728o == null || TextUtils.isEmpty(this.f5728o.m7737d()))) {
            this.f5727n.mo7431a(0, (AbstractC1700aq) null);
            return;
        }
        m7522b(getResources().getString(C1536f.C1543g.theme_diy_generating));
        if (this.f5728o == null || TextUtils.isEmpty(this.f5728o.m7737d())) {
            this.f5723j.post(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.11
                @Override // java.lang.Runnable
                public void run() {
                    C1703b c1703b = new C1703b();
                    c1703b.m7754f(true);
                    File g = c1703b.m7753g(ThemeDIYActivity.this);
                    if (g == null) {
                        ThemeDIYActivity.this.f5727n.mo7431a(0, (AbstractC1700aq) null);
                        return;
                    }
                    C1821e.m7390a(g.getAbsolutePath() + File.separator + "diy.config", "isLocalDiy", (Object) true);
                    ThemeDIYActivity.this.f5727n.mo7430a((AbstractC1700aq) c1703b);
                }
            });
        } else {
            C1806c.m7429a().m7426a(this.f5728o, this.f5727n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7527b(AbstractC1700aq abstractC1700aq) {
        C1894v.m8805a(abstractC1700aq.m7757d(this), m7548a(this.f5738y.f5765c, this.f5738y.f5766d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m7548a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float f = (((float) width) * 1.0f) / ((float) height) > f5666a ? f5667b / width : f5668c / height;
        matrix.postScale(f, f);
        Matrix matrix2 = new Matrix();
        float f2 = (((float) width2) * 1.0f) / ((float) height2) > f5666a ? f5667b / width2 : f5668c / height2;
        matrix2.postScale(f2, f2);
        try {
            Bitmap createBitmap = Bitmap.createBitmap((int) f5667b, (int) f5668c, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, matrix2, null);
            canvas.drawBitmap(bitmap2, matrix, null);
            canvas.save(31);
            canvas.restore();
            return createBitmap;
        } catch (Throwable th) {
            return bitmap2;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f5715au.removeCallbacksAndMessages(null);
        C1806c.m7429a().m7418b();
        C1894v.m7069h().m8794c();
        if (this.f5671C != null) {
            this.f5671C.m7364a();
            this.f5671C = null;
        }
        if (this.f5672D != null) {
            this.f5672D.m7364a();
            this.f5672D = null;
        }
        this.f5736w = null;
        this.f5725l.clear();
        if (this.f5669A != null) {
            getApplicationContext().unbindService(this.f5714at);
        }
        if (this.f5683O != null && this.f5683O.isShowing()) {
            this.f5683O.dismiss();
            this.f5683O = null;
        }
        if (this.f5738y != null) {
            this.f5738y.f5766d = null;
            this.f5738y.f5765c = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onActivityResult(final int i, final int i2, final Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f5701ag) {
            this.f5702ah = new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.12
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDIYActivity.this.onActivityResult(i, i2, intent);
                }
            };
            return;
        }
        if (i == 0 || i == 1) {
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    this.f5709ao = C1426e.m8665c(this, data);
                    this.f5710ap = i == 1 ? EnumC1799o.FROM_ONLINE : EnumC1799o.FROM_ALUME;
                    if (i == 1) {
                        this.f5705ak = intent.getStringExtra("wallpaper_id");
                        this.f5706al = intent.getStringExtra("wallpaper_categoryId");
                        this.f5707am = intent.getStringExtra("wallpaper_tag");
                        this.f5708an = intent.getStringExtra("wallpaper_name");
                    } else {
                        this.f5705ak = null;
                        this.f5706al = null;
                        this.f5707am = null;
                        this.f5708an = null;
                    }
                    if (this.f5738y.f5765c != null && C1430i.m8655d() <= 540) {
                        this.f5738y.f5765c.recycle();
                        this.f5738y.f5765c = null;
                        m7545a(this.f5731r, EnumC1778a.SET_WALLPAER);
                    }
                    if (EnumC1789i.CHOOSE_WALLPAER_A == this.f5682N) {
                        m7526b(EnumC1789i.CHOOSE_WALLPAER_B);
                    }
                    m7481r();
                    this.f5723j.post(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.13
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                int i3 = C1430i.m8655d() > 540 ? (int) ThemeDIYActivity.f5667b : 540;
                                ThemeDIYActivity.this.f5738y.f5765c = ThemeDIYActivity.m7550a(ThemeDIYActivity.this, ThemeDIYActivity.this.f5709ao, i3, (int) (i3 / ThemeDIYActivity.f5666a), true);
                                ThemeDIYActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.13.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ThemeDIYActivity.this.f5738y.f5763a = 3;
                                        ThemeDIYActivity.this.m7545a(ThemeDIYActivity.this.f5731r, EnumC1778a.SET_WALLPAER);
                                        if (ThemeDIYActivity.this.f5671C != null) {
                                            ThemeDIYActivity.this.f5671C.setVisibility(8);
                                        }
                                        ThemeDIYActivity.this.m7510d(true);
                                    }
                                });
                                File file = new File(C1821e.m7387b(ThemeDIYActivity.this), "temp_1width_wallpaper");
                                if ("content".equals(ThemeDIYActivity.this.f5709ao.getScheme()) || "file".equals(ThemeDIYActivity.this.f5709ao.getScheme())) {
                                    C1894v.m8805a(file, ThemeDIYActivity.m7550a(ThemeDIYActivity.this, ThemeDIYActivity.this.f5709ao, C1437p.m8619b(), C1437p.m8616c(), false));
                                } else {
                                    C1894v.m8805a(file, ThemeDIYActivity.m7550a(ThemeDIYActivity.this, ThemeDIYActivity.this.f5709ao, C1437p.m8619b() * 2, C1437p.m8616c(), false));
                                }
                                ThemeDIYActivity.this.f5703ai = i == 1;
                            } catch (Throwable th) {
                                ThemeDIYActivity.this.m7487o();
                            }
                        }
                    });
                }
                if (i == 0) {
                }
            } else if (i == 0) {
            }
        }
        this.f5678J = true;
        this.f5675G = true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (m7483q()) {
            m7473v();
        } else if (this.f5671C.getVisibility() != 0) {
            int m7451a = this.f5682N.m7451a();
            if (m7451a == 1 || m7451a == EnumC1789i.APPLY.m7451a()) {
                this.f5675G = false;
                super.onBackPressed();
            } else if (m7451a > 2) {
                if (this.f5682N == EnumC1789i.SAVE) {
                    this.f5674F = "1602";
                } else if (this.f5682N == EnumC1789i.CHOOSE_ICON) {
                }
                m7497j();
            } else if (m7520c()) {
                super.onBackPressed();
            } else {
                m7514c(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m7499i() {
        m7526b(m7551a(this.f5682N.m7451a() + 1));
    }

    /* renamed from: j */
    private void m7497j() {
        m7526b(m7551a(this.f5682N.m7451a() - 1));
    }

    /* renamed from: b */
    private void m7526b(EnumC1789i enumC1789i) {
        this.f5682N = enumC1789i;
        if (enumC1789i != EnumC1789i.APPLY) {
            this.f5735v.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5730q.getLayoutParams();
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = C1430i.m8659a(20.0f);
            this.f5730q.setLayoutParams(layoutParams);
        }
        switch (enumC1789i) {
            case CHOOSE_WALLPAER_B:
                this.f5713as.setVisibility(0);
                ((TextView) findViewById(C1536f.C1541e.theme_btn_next)).setText(C1536f.C1543g.theme_btn_next);
                m7491m();
                m7529b(8);
                break;
            case CHOOSE_ICON:
                if (this.f5671C != null) {
                    this.f5671C.setText("");
                }
                this.f5713as.setVisibility(0);
                ((TextView) findViewById(C1536f.C1541e.theme_btn_next)).setText(C1536f.C1543g.save_and_apply);
                m7495k();
                break;
            case SAVE:
                this.f5713as.setVisibility(8);
                this.f5722i.setVisibility(8);
                m7491m();
                m7503g();
                break;
            case APPLY:
                this.f5722i.setVisibility(8);
                break;
        }
        m7530b();
        m7552a();
        m7518c(enumC1789i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m7495k() {
        if (this.f5680L.getVisibility() == 0) {
            m7510d(true);
        }
        if (this.f5716av != null && Build.VERSION.SDK_INT >= 11) {
            this.f5716av.cancel();
        }
        this.f5718e.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f5716av = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5730q, "translationY", this.f5730q.getTranslationY(), -this.f5689U);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5718e, "translationY", this.f5718e.getTranslationY(), 0.0f);
            ofFloat2.setStartDelay(30L);
            ((AnimatorSet) this.f5716av).playTogether(ofFloat, ofFloat2);
            this.f5716av.setDuration(200L);
            this.f5716av.start();
        }
        this.f5732s.setImageResource(C1536f.C1540d.theme_icons_down);
        this.f5699ae = false;
    }

    /* renamed from: l */
    private void m7493l() {
        if (m7469x()) {
            this.f5697ac = true;
        } else if (m7471w()) {
            this.f5698ad = true;
        }
    }

    /* renamed from: a */
    public void m7547a(MotionEvent motionEvent) {
        float y = motionEvent.getY() - this.f5696ab;
        float m8659a = C1430i.m8659a(5.0f);
        if ((y > m8659a && this.f5698ad) || (y < (-m8659a) && this.f5697ac)) {
            if (this.f5697ac) {
                m7495k();
                this.f5697ac = false;
                return;
            }
            m7491m();
            this.f5698ad = false;
            return;
        }
        this.f5697ac = false;
        this.f5698ad = false;
    }

    /* renamed from: m */
    private void m7491m() {
        if (this.f5716av != null && Build.VERSION.SDK_INT >= 11) {
            this.f5716av.cancel();
        }
        float translationY = Build.VERSION.SDK_INT >= 11 ? this.f5730q.getTranslationY() : 0.0f;
        if (Build.VERSION.SDK_INT >= 11) {
            this.f5716av = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5730q, "translationY", translationY, 0.0f);
            ofFloat.setStartDelay(30L);
            ((AnimatorSet) this.f5716av).playTogether(ofFloat, ObjectAnimator.ofFloat(this.f5718e, "translationY", this.f5718e.getTranslationY(), this.f5690V));
            this.f5716av.addListener(new AnimatorListenerAdapter() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ThemeDIYActivity.this.f5718e.setVisibility(8);
                }
            });
            this.f5716av.setDuration(200L);
            this.f5716av.start();
        }
        this.f5732s.setImageResource(C1536f.C1540d.theme_icons_up);
        this.f5699ae = true;
    }

    /* renamed from: c */
    private void m7514c(boolean z) {
        this.f5677I = z;
        this.f5683O = new DialogInterfaceC1526e.C1532a(this).m8301a(C1536f.C1543g.theme_diy_dialog_message).m8298b(C1536f.C1543g.theme_diy_dialog_exit, this).m8300a(C1536f.C1543g.theme_diy_dialog_cancel, this).m8302a();
        this.f5683O.m8314a(true);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.f5675G) {
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (!this.f5675G || this.f5676H || !this.f5678J) {
        }
        this.f5678J = false;
        this.f5676H = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: a */
    public static android.graphics.Bitmap m7550a(android.content.Context r9, android.net.Uri r10, int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.theme.diy.ThemeDIYActivity.m7550a(android.content.Context, android.net.Uri, int, int, boolean):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private void m7546a(ViewGroup viewGroup) {
        ImageView imageView = (ImageView) findViewById(C1536f.C1541e.theme_diy_wallpaper_iv);
        imageView.setImageBitmap(this.f5738y.f5765c);
        imageView.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7545a(ViewGroup viewGroup, EnumC1778a enumC1778a) {
        ImageView imageView = (ImageView) viewGroup.findViewById(C1536f.C1541e.theme_diy_wallpaper_iv);
        if (enumC1778a == EnumC1778a.SET_WALLPAER) {
            C1421b.m8699a(imageView, new BitmapDrawable(getResources(), this.f5738y.f5765c));
        } else if (enumC1778a == EnumC1778a.SET_THEME) {
            imageView.setImageDrawable(new BitmapDrawable(getResources(), this.f5738y.f5766d));
        }
    }

    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$m */
    /* loaded from: classes.dex */
    public class C1797m extends BaseAdapter {

        /* renamed from: b */
        private Context f5806b;

        public C1797m(Context context) {
            this.f5806b = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (ThemeDIYActivity.this.f5726m != null) {
                return ThemeDIYActivity.this.f5726m.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public C1780c getItem(int i) {
            if (i < getCount()) {
                return (C1780c) ThemeDIYActivity.this.f5726m.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C1798n c1798n;
            View view2;
            if (view == null) {
                view2 = LayoutInflater.from(this.f5806b).inflate(C1536f.C1542f.theme_diy_list_item, viewGroup, false);
                C1798n c1798n2 = new C1798n();
                view2.setTag(c1798n2);
                c1798n2.f5807a.f5778b = view2.findViewById(C1536f.C1541e.left_item);
                c1798n2.f5807a.f5780d = (ImageView) c1798n2.f5807a.f5778b.findViewById(C1536f.C1541e.theme_icons_thumb);
                c1798n2.f5807a.f5779c = (ImageView) c1798n2.f5807a.f5778b.findViewById(C1536f.C1541e.theme_icons_selector);
                c1798n2.f5808b.f5778b = view2.findViewById(C1536f.C1541e.center_item);
                c1798n2.f5808b.f5780d = (ImageView) c1798n2.f5808b.f5778b.findViewById(C1536f.C1541e.theme_icons_thumb);
                c1798n2.f5808b.f5779c = (ImageView) c1798n2.f5808b.f5778b.findViewById(C1536f.C1541e.theme_icons_selector);
                c1798n2.f5809c.f5778b = view2.findViewById(C1536f.C1541e.right_item);
                c1798n2.f5809c.f5780d = (ImageView) c1798n2.f5809c.f5778b.findViewById(C1536f.C1541e.theme_icons_thumb);
                c1798n2.f5809c.f5779c = (ImageView) c1798n2.f5809c.f5778b.findViewById(C1536f.C1541e.theme_icons_selector);
                m7441a(c1798n2.f5807a.f5778b);
                m7441a(c1798n2.f5808b.f5778b);
                m7441a(c1798n2.f5809c.f5778b);
                LinearLayout linearLayout = (LinearLayout) view2;
                if (Build.VERSION.SDK_INT >= 11) {
                    linearLayout.setDividerDrawable(ThemeDIYActivity.this.f5685Q);
                    linearLayout.setShowDividers(2);
                }
                c1798n2.f5807a.f5778b.setOnClickListener(ThemeDIYActivity.this);
                c1798n2.f5808b.f5778b.setOnClickListener(ThemeDIYActivity.this);
                c1798n2.f5809c.f5778b.setOnClickListener(ThemeDIYActivity.this);
                ThemeDIYActivity.this.f5725l.add(c1798n2);
                c1798n = c1798n2;
            } else {
                c1798n = (C1798n) view.getTag();
                view2 = view;
            }
            C1780c item = getItem(i);
            c1798n.f5807a.f5777a = item.f5767a;
            c1798n.f5808b.f5777a = item.f5768b;
            c1798n.f5809c.f5777a = item.f5769c;
            m7440a(c1798n.f5807a);
            m7440a(c1798n.f5808b);
            m7440a(c1798n.f5809c);
            return view2;
        }

        /* renamed from: a */
        private void m7441a(View view) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = ThemeDIYActivity.this.f5684P;
            layoutParams.height = ThemeDIYActivity.this.f5684P;
        }

        /* renamed from: a */
        private void m7440a(C1783e c1783e) {
            if (c1783e.f5777a == null) {
                c1783e.f5778b.setVisibility(4);
                return;
            }
            c1783e.f5778b.setTag(c1783e);
            c1783e.f5778b.setVisibility(0);
            if (!TextUtils.isEmpty(c1783e.f5777a.m7741b())) {
                C1806c.m7429a().m7421a(c1783e.f5777a.m7741b(), ThemeDIYActivity.this.f5729p);
            }
            if (ThemeDIYActivity.this.f5728o != null && ThemeDIYActivity.this.f5728o.m7746a() == c1783e.f5777a.m7746a()) {
                c1783e.f5779c.setVisibility(0);
            } else {
                c1783e.f5779c.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$n */
    /* loaded from: classes.dex */
    public class C1798n {

        /* renamed from: a */
        public C1783e f5807a;

        /* renamed from: b */
        public C1783e f5808b;

        /* renamed from: c */
        public C1783e f5809c;

        private C1798n() {
            this.f5807a = new C1783e();
            this.f5808b = new C1783e();
            this.f5809c = new C1783e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$e */
    /* loaded from: classes.dex */
    public class C1783e {

        /* renamed from: a */
        public C1704a f5777a;

        /* renamed from: b */
        public View f5778b;

        /* renamed from: c */
        public ImageView f5779c;

        /* renamed from: d */
        public ImageView f5780d;

        C1783e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$h */
    /* loaded from: classes.dex */
    public class C1786h implements InterfaceC1803b.InterfaceC1804a<C1368a> {
        public C1786h() {
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7430a(final C1368a c1368a) {
            if (c1368a != null) {
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.h.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ThemeDIYActivity.this.f5726m.clear();
                        List m8875a = c1368a.m8875a();
                        ArrayList newArrayList = Lists.newArrayList();
                        int size = (m8875a.size() / 3) + (m8875a.size() % 3 == 0 ? 0 : 1);
                        for (int i = 0; i < size; i++) {
                            C1704a c1704a = (C1704a) m8875a.get(i * 3);
                            C1704a c1704a2 = (i * 3) + 1 < m8875a.size() ? (C1704a) m8875a.get((i * 3) + 1) : null;
                            C1704a c1704a3 = (i * 3) + 2 < m8875a.size() ? (C1704a) m8875a.get((i * 3) + 2) : null;
                            C1780c c1780c = new C1780c();
                            c1780c.f5767a = c1704a;
                            c1780c.f5768b = c1704a2;
                            c1780c.f5769c = c1704a3;
                            newArrayList.add(c1780c);
                        }
                        ThemeDIYActivity.this.f5726m.addAll(newArrayList);
                        ThemeDIYActivity.this.f5719f.setVisibility(0);
                        ThemeDIYActivity.this.f5721h.setVisibility(8);
                        if (ThemeDIYActivity.this.f5672D != null) {
                            ThemeDIYActivity.this.f5672D.setVisibility(8);
                        }
                        ThemeDIYActivity.this.f5720g.notifyDataSetChanged();
                    }
                });
            }
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7431a(int i, C1368a c1368a) {
            if (c1368a != null) {
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.h.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ThemeDIYActivity.this.f5726m.size() > 0) {
                            ThemeDIYActivity.this.f5719f.setVisibility(0);
                            ThemeDIYActivity.this.f5721h.setVisibility(8);
                            if (ThemeDIYActivity.this.f5672D != null) {
                                ThemeDIYActivity.this.f5672D.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        ThemeDIYActivity.this.f5719f.setVisibility(8);
                        ThemeDIYActivity.this.f5721h.setVisibility(0);
                        if (ThemeDIYActivity.this.f5672D != null) {
                            ThemeDIYActivity.this.f5672D.setVisibility(8);
                        }
                    }
                });
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5671C == null || this.f5671C.getVisibility() != 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f5696ab = motionEvent.getY();
                if ((m7471w() || m7469x()) && m7528b(motionEvent)) {
                    m7493l();
                }
            } else if (action == 1 || action == 3) {
                m7547a(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$l */
    /* loaded from: classes.dex */
    public class C1796l implements InterfaceC1803b.InterfaceC1804a<Pair<String, Bitmap>> {
        private C1796l() {
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7430a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                m7443b(pair);
            }
        }

        /* renamed from: b */
        private void m7443b(Pair<String, Bitmap> pair) {
            String str = (String) pair.first;
            Bitmap bitmap = (Bitmap) pair.second;
            if (!TextUtils.isEmpty(str) && bitmap != null) {
                for (C1798n c1798n : ThemeDIYActivity.this.f5725l) {
                    if (c1798n.f5807a != null && c1798n.f5807a.f5777a != null && str.equals(c1798n.f5807a.f5777a.m7741b())) {
                        c1798n.f5807a.f5780d.setImageBitmap(bitmap);
                    } else if (c1798n.f5808b != null && c1798n.f5808b.f5777a != null && str.equals(c1798n.f5808b.f5777a.m7741b())) {
                        c1798n.f5808b.f5780d.setImageBitmap(bitmap);
                    } else if (c1798n.f5809c != null && c1798n.f5809c.f5777a != null && str.equals(c1798n.f5809c.f5777a.m7741b())) {
                        c1798n.f5809c.f5780d.setImageBitmap(bitmap);
                    }
                }
            }
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7431a(int i, Pair<String, Bitmap> pair) {
            if (pair != null) {
                m7443b(pair);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m7489n() {
        long currentTimeMillis = 500 - (System.currentTimeMillis() - this.f5673E);
        if (currentTimeMillis > 0) {
            C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDIYActivity.this.m7545a(ThemeDIYActivity.this.f5731r, EnumC1778a.SET_THEME);
                    if (ThemeDIYActivity.this.f5671C != null) {
                        ThemeDIYActivity.this.f5671C.setVisibility(8);
                    }
                }
            }, currentTimeMillis);
        } else {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    ThemeDIYActivity.this.m7545a(ThemeDIYActivity.this.f5731r, EnumC1778a.SET_THEME);
                    if (ThemeDIYActivity.this.f5671C != null) {
                        ThemeDIYActivity.this.f5671C.setVisibility(8);
                    }
                }
            });
        }
    }

    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$k */
    /* loaded from: classes.dex */
    private class C1795k implements InterfaceC1803b.InterfaceC1804a<Pair<String, Bitmap>> {
        private C1795k() {
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7430a(Pair<String, Bitmap> pair) {
            if (pair != null) {
                m7446b(pair);
            }
        }

        /* renamed from: b */
        private void m7446b(Pair<String, Bitmap> pair) {
            Bitmap bitmap = (Bitmap) pair.second;
            if (!TextUtils.isEmpty((String) pair.first) && bitmap != null) {
                ThemeDIYActivity.this.f5738y.f5766d = (Bitmap) pair.second;
            }
            ThemeDIYActivity.this.m7489n();
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7431a(int i, Pair<String, Bitmap> pair) {
            if (pair != null) {
                m7446b(pair);
                Toast.makeText(ThemeDIYActivity.this, C1536f.C1543g.changewallpaper_toast_text_error, 0).show();
                ThemeDIYActivity.this.m7487o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$j */
    /* loaded from: classes.dex */
    public class C1790j implements InterfaceC1803b.InterfaceC1804a<AbstractC1700aq> {
        private C1790j() {
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7430a(final AbstractC1700aq abstractC1700aq) {
            if (abstractC1700aq != null) {
                ThemeDIYActivity.this.f5723j.post(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.1
                    @Override // java.lang.Runnable
                    public void run() {
                        File mo7436a;
                        ThemeDIYActivity.this.f5739z = abstractC1700aq;
                        if (ThemeDIYActivity.this.f5739z != null && (mo7436a = abstractC1700aq.mo7436a(ThemeDIYActivity.this)) != null) {
                            if (ThemeDIYActivity.this.f5738y.f5763a != 1) {
                                if (ThemeDIYActivity.this.f5738y.f5763a != 0) {
                                    if (ThemeDIYActivity.this.f5738y.f5763a == 2) {
                                        File m7467y = ThemeDIYActivity.this.m7467y();
                                        if (m7467y != null) {
                                            C1433l.m8642a(m7467y.getAbsolutePath(), mo7436a.getAbsolutePath());
                                        } else {
                                            return;
                                        }
                                    } else {
                                        C1433l.m8642a(C1821e.m7387b(ThemeDIYActivity.this).getAbsolutePath() + File.separator + "temp_1width_wallpaper", mo7436a.getAbsolutePath());
                                    }
                                } else {
                                    C1894v.m8805a(mo7436a, C2035ab.m6662a(ThemeDIYActivity.this, null, false, false, 0));
                                }
                            } else {
                                C1894v.m8805a(mo7436a, C1423d.m8687b(WallpaperManager.getInstance(ThemeDIYActivity.this)));
                            }
                        }
                        ThemeDIYActivity.this.m7527b(abstractC1700aq);
                        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (ThemeDIYActivity.this.f5671C != null) {
                                    ThemeDIYActivity.this.f5671C.setVisibility(8);
                                }
                                ThemeDIYActivity.this.m7499i();
                                ThemeDIYActivity.this.f5674F = "1605";
                            }
                        });
                        ThemeDIYActivity.this.m7544a(abstractC1700aq);
                        C1821e.m7390a(abstractC1700aq.m7753g(ThemeDIYActivity.this).getAbsolutePath() + File.separator + "diy.config", "isUsingOnLineWallpaper", Boolean.valueOf(ThemeDIYActivity.this.f5703ai));
                        ThemeDIYActivity.this.runOnUiThread(new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ThemeDIYActivity.this.m7531a(ThemeDIYActivity.this.f5703ai);
                            }
                        });
                    }
                });
            }
        }

        @Override // com.tsf.extend.theme.diy.InterfaceC1803b.InterfaceC1804a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7431a(int i, AbstractC1700aq abstractC1700aq) {
            if (abstractC1700aq != null) {
                C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.j.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ThemeDIYActivity.this.f5682N = EnumC1789i.CHOOSE_ICON;
                        ThemeDIYActivity.this.m7552a();
                        ThemeDIYActivity.this.m7495k();
                        ThemeDIYActivity.this.m7487o();
                        Toast.makeText(ThemeDIYActivity.this, C1536f.C1543g.theme_diy_download_failed, 1).show();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$d */
    /* loaded from: classes.dex */
    public class C1781d implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {

        /* renamed from: b */
        private final List<String> f5772b;

        /* renamed from: c */
        private AbstractC1700aq f5773c;

        public C1781d(AbstractC1700aq abstractC1700aq) {
            this.f5773c = abstractC1700aq;
            this.f5772b = ThemeDIYActivity.this.f5728o.m7736e();
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                final Bitmap bitmap = (Bitmap) pair.second;
                String str = (String) pair.first;
                if (bitmap != null && str != null && !TextUtils.isEmpty(str)) {
                    final int indexOf = this.f5772b.indexOf(str);
                    C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.theme.diy.ThemeDIYActivity.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C1894v.m8805a(C1781d.this.f5773c.m7761a(ThemeDIYActivity.this, indexOf), ThemeDIYActivity.this.m7548a(ThemeDIYActivity.this.f5738y.f5765c, bitmap));
                        }
                    });
                }
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7487o();
        if (this.f5671C != null) {
            this.f5671C.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m7522b(String str) {
        if (this.f5733t != null && this.f5733t.isShowing()) {
            this.f5733t.m7232a(str);
            return;
        }
        this.f5733t = new DialogC1859o(this);
        this.f5733t.m7232a(str);
        this.f5733t.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m7487o() {
        if (this.f5733t != null) {
            this.f5733t.dismiss();
            this.f5733t = null;
        }
    }

    /* renamed from: p */
    private void m7485p() {
        if (this.f5724k == null) {
            this.f5724k = new C1786h();
        }
        if (this.f5729p == null) {
            this.f5729p = new C1796l();
        }
        if (this.f5672D != null) {
            this.f5672D.setVisibility(0);
        }
        C1806c.m7429a().m7425a(this.f5724k, InterfaceC1803b.EnumC1805b.LoadCache);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5683O.dismiss();
        String str = this.f5674F;
        if (i == -2) {
            this.f5675G = false;
            finish();
        }
        switch (this.f5682N) {
            case CHOOSE_WALLPAER_B:
                this.f5674F = "1600";
                return;
            case CHOOSE_ICON:
                this.f5674F = "1602";
                return;
            case SAVE:
                this.f5674F = "1606";
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$c */
    /* loaded from: classes.dex */
    public class C1780c {

        /* renamed from: a */
        public C1704a f5767a;

        /* renamed from: b */
        public C1704a f5768b;

        /* renamed from: c */
        public C1704a f5769c;

        C1780c() {
        }
    }

    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYActivity$f */
    /* loaded from: classes.dex */
    public class C1784f extends ColorDrawable {

        /* renamed from: a */
        int f5782a;

        /* renamed from: b */
        int f5783b;

        public C1784f(int i, int i2) {
            this.f5783b = i;
            this.f5782a = i;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f5782a;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f5783b;
        }
    }

    /* renamed from: q */
    private boolean m7483q() {
        return findViewById(C1536f.C1541e.content_mask).getVisibility() == 0;
    }

    /* renamed from: b */
    private void m7529b(int i) {
        findViewById(C1536f.C1541e.content_mask).setVisibility(i);
        findViewById(C1536f.C1541e.theme_diy_head_mask).setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7510d(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5737x.getLayoutParams();
        if (this.f5691W == 0) {
            this.f5691W = this.f5737x.getHeight();
        }
        if (z) {
            layoutParams.height = this.f5691W + C1430i.m8659a(34.0f);
        } else {
            layoutParams.height = this.f5691W - C1430i.m8659a(30.0f);
        }
        this.f5737x.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private void m7506e(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5730q.getLayoutParams();
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = C1430i.m8659a(z ? 20.0f : 5.0f);
        this.f5730q.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m7519c(int i) {
        this.f5680L.setVisibility(i);
    }

    /* renamed from: r */
    private void m7481r() {
        m7529b(8);
        m7510d(true);
        m7519c(8);
        this.f5679K.setVisibility(8);
        this.f5713as.setVisibility(0);
    }

    /* renamed from: s */
    private void m7479s() {
        Intent intent = new Intent(this, WallpaperOnLineActivity.class);
        intent.putExtra("DIY_PAGE_FROM", this.f5674F);
        startActivityForResult(intent, 1);
    }

    /* renamed from: t */
    private void m7477t() {
        m7529b(0);
        m7519c(0);
        this.f5679K.setVisibility(0);
        if (this.f5718e.getVisibility() != 0) {
            m7510d(false);
        }
        this.f5713as.setVisibility(8);
        this.f5681M.setVisibility(8);
        this.f5722i.setVisibility(0);
        m7530b();
        m7505f();
    }

    /* renamed from: u */
    private void m7475u() {
        m7519c(8);
        m7510d(true);
    }

    /* renamed from: c */
    private void m7518c(EnumC1789i enumC1789i) {
        switch (enumC1789i) {
            case CHOOSE_WALLPAER_B:
                m7529b(8);
                this.f5713as.setVisibility(0);
                this.f5679K.setVisibility(8);
                this.f5680L.setVisibility(8);
                m7510d(true);
                this.f5681M.setVisibility(8);
                return;
            case CHOOSE_ICON:
                m7529b(8);
                this.f5680L.setVisibility(8);
                this.f5713as.setVisibility(0);
                this.f5679K.setVisibility(8);
                this.f5681M.setVisibility(8);
                return;
            case SAVE:
                this.f5681M.setVisibility(0);
                m7529b(8);
                ((TextView) this.f5679K).setText(C1536f.C1543g.save_and_apply);
                this.f5680L.setVisibility(8);
                this.f5713as.setVisibility(8);
                this.f5679K.setVisibility(0);
                m7510d(true);
                return;
            default:
                return;
        }
    }

    /* renamed from: v */
    private void m7473v() {
        m7518c(this.f5682N);
    }

    /* renamed from: w */
    private boolean m7471w() {
        return this.f5718e.getVisibility() == 0;
    }

    /* renamed from: x */
    private boolean m7469x() {
        return this.f5718e.getVisibility() == 8 && this.f5732s.getVisibility() == 0;
    }

    /* renamed from: b */
    private boolean m7528b(MotionEvent motionEvent) {
        this.f5730q.getGlobalVisibleRect(this.f5694Z);
        this.f5731r.getGlobalVisibleRect(this.f5695aa);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        return this.f5694Z.contains(rawX, rawY) && !this.f5695aa.contains(rawX, rawY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public File m7467y() {
        List<AbstractC1700aq> m7066i = C1894v.m7066i();
        if (m7066i.isEmpty()) {
            return null;
        }
        return m7066i.get(m7066i.size() - 1).mo7436a(this);
    }

    /* renamed from: a */
    public static void m7549a(Context context, String str, int i) {
        String m7633a;
        Intent intent = new Intent(context, ThemeDIYActivity.class);
        if ((context instanceof ThemeCmClubActivity) && (m7633a = ((ThemeCmClubActivity) context).m7633a()) != null) {
            intent.putExtra("launch_host", m7633a);
        }
        context.startActivity(intent);
    }
}
