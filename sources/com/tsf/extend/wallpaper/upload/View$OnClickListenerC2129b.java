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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.wallpaper.C2145w;
import com.tsf.extend.wallpaper.C2148z;
import java.util.List;
import org.acra.ACRAConstants;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.wallpaper.upload.b */
/* loaded from: classes.dex */
public class View$OnClickListenerC2129b extends FrameLayout implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private UploadWallpaperActivity f6984a;

    /* renamed from: b */
    private List<C2145w> f6985b;

    /* renamed from: c */
    private C2134c f6986c;

    /* renamed from: d */
    private ProgressBar f6987d;

    /* renamed from: e */
    private C2131a f6988e;

    /* renamed from: f */
    private TextView f6989f;

    /* renamed from: g */
    private LinearLayout f6990g;

    /* renamed from: h */
    private TextView f6991h;

    /* renamed from: i */
    private int f6992i;

    /* renamed from: j */
    private int f6993j;

    /* renamed from: k */
    private int f6994k;

    /* renamed from: l */
    private int f6995l;

    /* renamed from: m */
    private int f6996m;

    /* renamed from: n */
    private LinearLayout f6997n;

    /* renamed from: o */
    private int f6998o;

    /* renamed from: p */
    private int f6999p;

    /* renamed from: q */
    private int f7000q;

    /* renamed from: r */
    private int f7001r;

    /* renamed from: s */
    private int f7002s;

    /* renamed from: a */
    public int m6309a(float f) {
        return (int) ((getContext().getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public View$OnClickListenerC2129b(Context context) {
        super(context);
        this.f6994k = ACRAConstants.DEFAULT_CONNECTION_TIMEOUT;
        this.f6999p = 0;
        this.f7000q = 0;
        this.f7001r = 0;
        this.f7002s = 0;
    }

    /* renamed from: a */
    public void m6307a(UploadWallpaperActivity uploadWallpaperActivity, C2134c c2134c) {
        this.f6986c = c2134c;
        this.f6984a = uploadWallpaperActivity;
    }

    /* renamed from: a */
    public void m6310a() {
        this.f6995l = m6309a(16.0f);
        this.f6996m = this.f6995l * 2;
        this.f7000q = m6309a(116.0f);
        this.f7001r = m6309a(49.0f);
        this.f7002s = m6309a(48.0f);
        int m6309a = m6309a(24.0f);
        setPadding(this.f6995l, 0, this.f6995l, 0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f6993j = ((displayMetrics.heightPixels - C1437p.m8615c(getContext())) - C1437p.m8618b((Activity) this.f6984a)) - this.f7001r;
        this.f6992i = (displayMetrics.widthPixels - this.f6995l) - m6309a;
        m6299c();
        if (this.f6985b != null && this.f6985b.size() >= 0) {
            m6289g();
            m6296d();
            m6287h();
        } else {
            m6291f();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: c */
    private void m6299c() {
        if (C2148z.m6199h().m6197j() == null) {
            this.f6988e = new C2131a();
            C2148z.m6199h().mo8250a(C2148z.f7087d, this.f6988e, AbstractC1386a.EnumC1397b.Refresh, (JSONObject) null);
            return;
        }
        this.f6985b = getCategoryData();
    }

    /* renamed from: b */
    public boolean m6303b() {
        return this.f6985b == null || this.f6985b.size() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.wallpaper.upload.b$a */
    /* loaded from: classes.dex */
    public class C2131a implements AbstractC1386a.InterfaceC1396a<C1368a> {
        private C2131a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.b.a.1
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC2129b.this.m6293e();
                    View$OnClickListenerC2129b.this.f6985b = View$OnClickListenerC2129b.this.getCategoryData();
                    if (View$OnClickListenerC2129b.this.f6985b != null && View$OnClickListenerC2129b.this.f6985b.size() >= 0) {
                        View$OnClickListenerC2129b.this.m6289g();
                        View$OnClickListenerC2129b.this.m6296d();
                        View$OnClickListenerC2129b.this.m6287h();
                        View$OnClickListenerC2129b.this.invalidate();
                        return;
                    }
                    C2131a.this.mo6247a((JSONObject) null, 0, (C1368a) null);
                }
            });
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.upload.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC2129b.this.m6293e();
                    View$OnClickListenerC2129b.this.f6986c.setTabIndex(1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6296d() {
        this.f6990g = new LinearLayout(getContext());
        this.f6990g.setOrientation(1);
        int size = this.f6985b.size();
        this.f6998o = this.f6992i;
        C2148z m6199h = C2148z.m6199h();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            int m6244a = this.f6985b.get(i).m6244a();
            z = m6308a(m6244a, m6199h.m6218a(getContext(), m6244a), z);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.f7000q;
        this.f6990g.setLayoutParams(layoutParams);
        addView(this.f6990g);
    }

    /* renamed from: a */
    private boolean m6308a(int i, String str, boolean z) {
        int i2;
        Button m6302b = m6302b(i, str, z);
        int measureText = this.f6996m + ((int) m6302b.getPaint().measureText(m6302b.getText().toString()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m6302b.getLayoutParams();
        int i3 = this.f6995l + measureText;
        if (this.f6998o < measureText) {
            z = true;
            this.f6997n = getRowView();
            this.f6998o = this.f6992i - i3;
            this.f6999p += this.f7002s;
            i2 = i3;
        } else if (this.f6998o >= measureText && this.f6998o <= i3) {
            layoutParams.rightMargin = 0;
            i2 = i3 - this.f6995l;
            this.f6998o -= measureText;
        } else {
            this.f6998o -= i3;
            if (this.f6997n == null) {
                this.f6997n = getRowView();
                this.f6999p = this.f7002s;
            }
            i2 = i3;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i2, this.f7002s));
        frameLayout.addView(m6302b);
        this.f6997n.addView(frameLayout);
        if (z) {
            this.f6990g.addView(this.f6997n);
        }
        return false;
    }

    private LinearLayout getRowView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    /* renamed from: b */
    private Button m6302b(int i, String str, boolean z) {
        int m6309a = m6309a(16.0f);
        Button button = new Button(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, m6309a * 2);
        button.setText(str);
        button.setPadding(m6309a, 0, m6309a, 0);
        C1421b.m8699a(button, getResources().getDrawable(C1536f.C1540d.upload_wallpaper_category_btn));
        layoutParams.setMargins(0, m6309a, m6309a, 0);
        button.setLayoutParams(layoutParams);
        button.setTextSize(14.0f);
        button.setSingleLine();
        button.setOnClickListener(this);
        button.setTextColor(Color.rgb(255, 255, 255));
        if (Build.VERSION.SDK_INT >= 17) {
            button.setTextAlignment(4);
        }
        button.setTag(C1536f.C1541e.live, Integer.valueOf(i));
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6293e() {
        if (this.f6987d != null) {
            this.f6987d.setVisibility(8);
            removeView(this.f6987d);
        }
    }

    /* renamed from: f */
    private void m6291f() {
        if (this.f6987d == null) {
            this.f6987d = new ProgressBar(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m6309a(70.0f), m6309a(70.0f));
            layoutParams.gravity = 17;
            this.f6987d.setLayoutParams(layoutParams);
            this.f6987d.setIndeterminateDrawable(new C1518d(getContext(), 3));
            addView(this.f6987d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m6289g() {
        if (this.f6989f == null) {
            this.f6989f = new TextView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = this.f7000q + this.f6999p;
            this.f6989f.setLayoutParams(layoutParams);
            this.f6989f.setTextSize(20.0f);
            this.f6989f.setTextColor(Color.rgb(255, 255, 255));
            this.f6989f.setText(C1536f.C1543g.upload_wallpaper_categroypage_selettip);
            addView(this.f6989f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m6287h() {
        if (this.f6991h == null) {
            this.f6991h = new TextView(getContext());
            this.f6991h.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f6991h.setTextSize(16.0f);
            this.f6991h.setGravity(5);
            this.f6991h.setTextColor(Color.rgb(255, 255, 255));
            this.f6991h.setText(C1536f.C1543g.upload_wallpaper_categroypage_skip);
            this.f6991h.setOnClickListener(this);
            addView(this.f6991h);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != this.f6991h && (view instanceof Button) && (num = (Integer) view.getTag(C1536f.C1541e.live)) != null) {
            this.f6984a.m6372a(num.intValue());
        }
        this.f6986c.setTabIndex(1);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = getHeight();
        if (height > 0 && this.f6990g != null && this.f6989f != null && this.f6991h != null && this.f6986c != null) {
            int height2 = this.f6990g.getHeight();
            if (((height - this.f7000q) - height2) - this.f6989f.getHeight() > 0) {
                if (Build.VERSION.SDK_INT >= 11) {
                    this.f6990g.setY((height - this.f7000q) - height2);
                    this.f6989f.setY(((height - this.f7000q) - height2) - this.f6989f.getHeight());
                    this.f6991h.setY((height - C1430i.m8659a(29.0f)) - this.f6991h.getHeight());
                }
                this.f6986c.setCategoryRealY(((height - this.f7000q) - height2) - this.f6989f.getHeight());
                C1421b.m8698a(this, this);
            }
        }
    }

    /* renamed from: a */
    public void m6304a(boolean z) {
    }

    /* renamed from: b */
    public void m6300b(boolean z) {
    }

    /* renamed from: c */
    public void m6297c(boolean z) {
    }

    /* renamed from: d */
    public void m6294d(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<C2145w> getCategoryData() {
        C1368a m6197j = C2148z.m6199h().m6197j();
        if (m6197j != null) {
            return m6197j.m8875a();
        }
        return null;
    }
}
