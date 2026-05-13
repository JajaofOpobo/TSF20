package com.tsf.extend.wallpaper.upload;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.j.i;
import com.tsf.extend.base.j.p;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.w;
import com.tsf.extend.wallpaper.z;
import java.util.List;
import org.acra.ACRAConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends FrameLayout implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    private UploadWallpaperActivity a;
    private List<w> b;
    private c c;
    private ProgressBar d;
    private a e;
    private TextView f;
    private LinearLayout g;
    private TextView h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private LinearLayout n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    public int a(float f) {
        return (int) ((getContext().getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public b(Context context) {
        super(context);
        this.k = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
    }

    public void a(UploadWallpaperActivity uploadWallpaperActivity, c cVar) {
        this.c = cVar;
        this.a = uploadWallpaperActivity;
    }

    public void a() {
        this.l = a(16.0f);
        this.m = this.l * 2;
        this.q = a(116.0f);
        this.r = a(49.0f);
        this.s = a(48.0f);
        int a2 = a(24.0f);
        setPadding(this.l, 0, this.l, 0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.j = ((displayMetrics.heightPixels - p.c(getContext())) - p.b((Activity) this.a)) - this.r;
        this.i = (displayMetrics.widthPixels - this.l) - a2;
        c();
        if (this.b != null && this.b.size() >= 0) {
            g();
            d();
            h();
        } else {
            f();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private void c() {
        if (z.h().j() == null) {
            this.e = new a();
            z.h().a(z.d, this.e, a.b.Refresh, (JSONObject) null);
            return;
        }
        this.b = getCategoryData();
    }

    public boolean b() {
        return this.b == null || this.b.size() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.e();
                    b.this.b = b.this.getCategoryData();
                    if (b.this.b != null && b.this.b.size() >= 0) {
                        b.this.g();
                        b.this.d();
                        b.this.h();
                        b.this.invalidate();
                        return;
                    }
                    a.this.a((JSONObject) null, 0, (com.tsf.extend.base.b.a) null);
                }
            });
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.a aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.e();
                    b.this.c.setTabIndex(1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.g = new LinearLayout(getContext());
        this.g.setOrientation(1);
        int size = this.b.size();
        this.o = this.i;
        z h = z.h();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            int a2 = this.b.get(i).a();
            z = a(a2, h.a(getContext(), a2), z);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.q;
        this.g.setLayoutParams(layoutParams);
        addView(this.g);
    }

    private boolean a(int i, String str, boolean z) {
        int i2;
        Button b = b(i, str, z);
        int measureText = this.m + ((int) b.getPaint().measureText(b.getText().toString()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.getLayoutParams();
        int i3 = this.l + measureText;
        if (this.o < measureText) {
            z = true;
            this.n = getRowView();
            this.o = this.i - i3;
            this.p += this.s;
            i2 = i3;
        } else if (this.o >= measureText && this.o <= i3) {
            layoutParams.rightMargin = 0;
            i2 = i3 - this.l;
            this.o -= measureText;
        } else {
            this.o -= i3;
            if (this.n == null) {
                this.n = getRowView();
                this.p = this.s;
            }
            i2 = i3;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i2, this.s));
        frameLayout.addView(b);
        this.n.addView(frameLayout);
        if (z) {
            this.g.addView(this.n);
        }
        return false;
    }

    private LinearLayout getRowView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    private Button b(int i, String str, boolean z) {
        int a2 = a(16.0f);
        Button button = new Button(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, a2 * 2);
        button.setText(str);
        button.setPadding(a2, 0, a2, 0);
        com.tsf.extend.base.j.b.a(button, getResources().getDrawable(f.d.upload_wallpaper_category_btn));
        layoutParams.setMargins(0, a2, a2, 0);
        button.setLayoutParams(layoutParams);
        button.setTextSize(14.0f);
        button.setSingleLine();
        button.setOnClickListener(this);
        button.setTextColor(Color.rgb(255, 255, 255));
        if (Build.VERSION.SDK_INT >= 17) {
            button.setTextAlignment(4);
        }
        button.setTag(f.e.live, Integer.valueOf(i));
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.d != null) {
            this.d.setVisibility(8);
            removeView(this.d);
        }
    }

    private void f() {
        if (this.d == null) {
            this.d = new ProgressBar(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(70.0f), a(70.0f));
            layoutParams.gravity = 17;
            this.d.setLayoutParams(layoutParams);
            this.d.setIndeterminateDrawable(new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3));
            addView(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f == null) {
            this.f = new TextView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = this.q + this.p;
            this.f.setLayoutParams(layoutParams);
            this.f.setTextSize(20.0f);
            this.f.setTextColor(Color.rgb(255, 255, 255));
            this.f.setText(f.g.upload_wallpaper_categroypage_selettip);
            addView(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.h == null) {
            this.h = new TextView(getContext());
            this.h.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.h.setTextSize(16.0f);
            this.h.setGravity(5);
            this.h.setTextColor(Color.rgb(255, 255, 255));
            this.h.setText(f.g.upload_wallpaper_categroypage_skip);
            this.h.setOnClickListener(this);
            addView(this.h);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != this.h && (view instanceof Button) && (num = (Integer) view.getTag(f.e.live)) != null) {
            this.a.a(num.intValue());
        }
        this.c.setTabIndex(1);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = getHeight();
        if (height > 0 && this.g != null && this.f != null && this.h != null && this.c != null) {
            int height2 = this.g.getHeight();
            if (((height - this.q) - height2) - this.f.getHeight() > 0) {
                if (Build.VERSION.SDK_INT >= 11) {
                    this.g.setY((height - this.q) - height2);
                    this.f.setY(((height - this.q) - height2) - this.f.getHeight());
                    this.h.setY((height - i.a(29.0f)) - this.h.getHeight());
                }
                this.c.setCategoryRealY(((height - this.q) - height2) - this.f.getHeight());
                com.tsf.extend.base.j.b.a(this, this);
            }
        }
    }

    public void a(boolean z) {
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<w> getCategoryData() {
        com.tsf.extend.base.b.a j = z.h().j();
        if (j != null) {
            return j.a();
        }
        return null;
    }
}
