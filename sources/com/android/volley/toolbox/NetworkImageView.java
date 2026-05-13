package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.C0809s;
import com.android.volley.toolbox.C0828h;
/* loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* renamed from: a */
    private String f2334a;

    /* renamed from: b */
    private int f2335b;

    /* renamed from: c */
    private int f2336c;

    /* renamed from: d */
    private C0828h f2337d;

    /* renamed from: e */
    private C0828h.C0834c f2338e;

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDefaultImageResId(int i) {
        this.f2335b = i;
    }

    public void setErrorImageResId(int i) {
        this.f2336c = i;
    }

    /* renamed from: a */
    void m10981a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z3 = getLayoutParams().width == -2;
            z2 = getLayoutParams().height == -2;
        } else {
            z2 = false;
            z3 = false;
        }
        if (!z3 || !z2) {
            z4 = false;
        }
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.f2334a)) {
                if (this.f2338e != null) {
                    this.f2338e.m10915a();
                    this.f2338e = null;
                }
                m10983a();
                return;
            }
            if (this.f2338e != null && this.f2338e.m10911c() != null) {
                if (!this.f2338e.m10911c().equals(this.f2334a)) {
                    this.f2338e.m10915a();
                    m10983a();
                } else {
                    return;
                }
            }
            int i = z3 ? 0 : width;
            if (z2) {
                height = 0;
            }
            this.f2338e = this.f2337d.m10927a(this.f2334a, new C08131(z), i, height, scaleType);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.NetworkImageView$1 */
    /* loaded from: classes.dex */
    public class C08131 implements C0828h.InterfaceC0835d {

        /* renamed from: a */
        final /* synthetic */ boolean f2339a;

        C08131(boolean z) {
            this.f2339a = z;
        }

        @Override // com.android.volley.C0802n.InterfaceC0803a
        /* renamed from: a */
        public void mo6194a(C0809s c0809s) {
            if (NetworkImageView.this.f2336c != 0) {
                NetworkImageView.this.setImageResource(NetworkImageView.this.f2336c);
            }
        }

        @Override // com.android.volley.toolbox.C0828h.InterfaceC0835d
        /* renamed from: a */
        public void mo10910a(final C0828h.C0834c c0834c, boolean z) {
            if (z && this.f2339a) {
                NetworkImageView.this.post(new Runnable() { // from class: com.android.volley.toolbox.NetworkImageView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C08131.this.mo10910a(c0834c, false);
                    }
                });
            } else if (c0834c.m10912b() == null) {
                if (NetworkImageView.this.f2335b != 0) {
                    NetworkImageView.this.setImageResource(NetworkImageView.this.f2335b);
                }
            } else {
                NetworkImageView.this.setImageBitmap(c0834c.m10912b());
            }
        }
    }

    /* renamed from: a */
    private void m10983a() {
        if (this.f2335b != 0) {
            setImageResource(this.f2335b);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m10981a(true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f2338e != null) {
            this.f2338e.m10915a();
            setImageBitmap(null);
            this.f2338e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
