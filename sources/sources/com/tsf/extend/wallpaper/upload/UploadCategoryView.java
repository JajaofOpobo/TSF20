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
import com.tsf.extend.base.d.BaseDataProvider;
import com.tsf.extend.base.j.i;
import com.tsf.extend.base.j.p;
import com.tsf.extend.ResourceIds;
import com.tsf.extend.wallpaper.w;
import com.tsf.extend.wallpaper.z;
import java.util.List;
import org.acra.ACRAConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class UploadCategoryView extends FrameLayout implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    private UploadWallpaperActivity a;
    private List<w> b;
    private UploadTabContainer c;
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

    public UploadCategoryView(Context context) {
        super(context);
        this.k = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
    }

    public void a(UploadWallpaperActivity uploadWallpaperActivity, UploadTabContainer cVar) {
        this.c = cVar;
        this.a = uploadWallpaperActivity;
    }

    public void a() {
        this.l = a(16.0f);
        this.m = this.l * 2;
        this.q = a(116.0f);
        this.r = a(49.0f);
        this.s = a(48.0f);
        int iA = a(24.0f);
        setPadding(this.l, 0, this.l, 0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.j = ((displayMetrics.heightPixels - p.c(getContext())) - p.b((Activity) this.a)) - this.r;
        this.i = (displayMetrics.widthPixels - this.l) - iA;
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
        } else {
            this.b = getCategoryData();
        }
    }

    public boolean b() {
        return this.b == null || this.b.size() <= 0;
    }

    private class a implements com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a<com.tsf.extend.base.b.A> {
        private a() {
        }

        @Override // com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, com.tsf.extend.base.b.A aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    UploadCategoryView.this.e();
                    UploadCategoryView.this.b = UploadCategoryView.this.getCategoryData();
                    if (UploadCategoryView.this.b != null && UploadCategoryView.this.b.size() >= 0) {
                        UploadCategoryView.this.g();
                        UploadCategoryView.this.d();
                        UploadCategoryView.this.h();
                        UploadCategoryView.this.invalidate();
                        return;
                    }
                    a.this.a((JSONObject) null, 0, (com.tsf.extend.base.b.A) null);
                }
            });
        }

        @Override // com.tsf.extend.base.d.BaseDataProvider.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, com.tsf.extend.base.b.A aVar) {
            com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    UploadCategoryView.this.e();
                    UploadCategoryView.this.c.setTabIndex(1);
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
        z zVarH = z.h();
        boolean zA = true;
        for (int i = 0; i < size; i++) {
            int iA = this.b.get(i).a();
            zA = a(iA, zVarH.a(getContext(), iA), zA);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.q;
        this.g.setLayoutParams(layoutParams);
        addView(this.g);
    }

    private boolean a(int i, String str, boolean z) {
        int i2;
        Button buttonB = b(i, str, z);
        int iMeasureText = this.m + ((int) buttonB.getPaint().measureText(buttonB.getText().toString()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) buttonB.getLayoutParams();
        int i3 = this.l + iMeasureText;
        if (this.o < iMeasureText) {
            z = true;
            this.n = getRowView();
            this.o = this.i - i3;
            this.p += this.s;
            i2 = i3;
        } else if (this.o >= iMeasureText && this.o <= i3) {
            layoutParams.rightMargin = 0;
            i2 = i3 - this.l;
            this.o -= iMeasureText;
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
        frameLayout.addView(buttonB);
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
        int iA = a(16.0f);
        Button button = new Button(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, iA * 2);
        button.setText(str);
        button.setPadding(iA, 0, iA, 0);
        com.tsf.extend.base.j.b.a(button, getResources().getDrawable(ResourceIds.d.upload_wallpaper_category_btn));
        layoutParams.setMargins(0, iA, iA, 0);
        button.setLayoutParams(layoutParams);
        button.setTextSize(14.0f);
        button.setSingleLine();
        button.setOnClickListener(this);
        button.setTextColor(Color.rgb(255, 255, 255));
        if (Build.VERSION.SDK_INT >= 17) {
            button.setTextAlignment(4);
        }
        button.setTag(ResourceIds.e.live, Integer.valueOf(i));
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
            this.ResourceIds.setLayoutParams(layoutParams);
            this.ResourceIds.setTextSize(20.0f);
            this.ResourceIds.setTextColor(Color.rgb(255, 255, 255));
            this.ResourceIds.setText(ResourceIds.g.upload_wallpaper_categroypage_selettip);
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
            this.h.setText(ResourceIds.g.upload_wallpaper_categroypage_skip);
            this.h.setOnClickListener(this);
            addView(this.h);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != this.h && (view instanceof Button) && (num = (Integer) view.getTag(ResourceIds.e.live)) != null) {
            this.a.a(num.intValue());
        }
        this.c.setTabIndex(1);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = getHeight();
        if (height > 0 && this.g != null && this.f != null && this.h != null && this.c != null) {
            int height2 = this.g.getHeight();
            if (((height - this.q) - height2) - this.ResourceIds.getHeight() > 0) {
                if (Build.VERSION.SDK_INT >= 11) {
                    this.g.setY((height - this.q) - height2);
                    this.ResourceIds.setY(((height - this.q) - height2) - this.ResourceIds.getHeight());
                    this.h.setY((height - i.a(29.0f)) - this.h.getHeight());
                }
                this.c.setCategoryRealY(((height - this.q) - height2) - this.ResourceIds.getHeight());
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
        com.tsf.extend.base.b.A aVarJ = z.h().j();
        if (aVarJ != null) {
            return aVarJ.a();
        }
        return null;
    }
}
