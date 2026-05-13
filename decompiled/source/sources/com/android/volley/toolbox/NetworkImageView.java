package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.s;
import com.android.volley.toolbox.h;
/* loaded from: classes.dex */
public class NetworkImageView extends ImageView {
    private String a;
    private int b;
    private int c;
    private h d;
    private h.c e;

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDefaultImageResId(int i) {
        this.b = i;
    }

    public void setErrorImageResId(int i) {
        this.c = i;
    }

    void a(boolean z) {
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
            if (TextUtils.isEmpty(this.a)) {
                if (this.e != null) {
                    this.e.a();
                    this.e = null;
                }
                a();
                return;
            }
            if (this.e != null && this.e.c() != null) {
                if (!this.e.c().equals(this.a)) {
                    this.e.a();
                    a();
                } else {
                    return;
                }
            }
            int i = z3 ? 0 : width;
            if (z2) {
                height = 0;
            }
            this.e = this.d.a(this.a, new AnonymousClass1(z), i, height, scaleType);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.NetworkImageView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements h.d {
        final /* synthetic */ boolean a;

        AnonymousClass1(boolean z) {
            this.a = z;
        }

        @Override // com.android.volley.n.a
        public void a(s sVar) {
            if (NetworkImageView.this.c != 0) {
                NetworkImageView.this.setImageResource(NetworkImageView.this.c);
            }
        }

        @Override // com.android.volley.toolbox.h.d
        public void a(final h.c cVar, boolean z) {
            if (z && this.a) {
                NetworkImageView.this.post(new Runnable() { // from class: com.android.volley.toolbox.NetworkImageView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1.this.a(cVar, false);
                    }
                });
            } else if (cVar.b() == null) {
                if (NetworkImageView.this.b != 0) {
                    NetworkImageView.this.setImageResource(NetworkImageView.this.b);
                }
            } else {
                NetworkImageView.this.setImageBitmap(cVar.b());
            }
        }
    }

    private void a() {
        if (this.b != 0) {
            setImageResource(this.b);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.e != null) {
            this.e.a();
            setImageBitmap(null);
            this.e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
