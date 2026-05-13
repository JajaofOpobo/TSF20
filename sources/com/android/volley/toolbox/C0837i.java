package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.AbstractC0795l;
import com.android.volley.C0785d;
import com.android.volley.C0792i;
import com.android.volley.C0794k;
import com.android.volley.C0802n;
import com.android.volley.C0810t;
import com.android.volley.InterfaceC0806p;
/* renamed from: com.android.volley.toolbox.i */
/* loaded from: classes.dex */
public class C0837i extends AbstractC0795l<Bitmap> {

    /* renamed from: f */
    private static final Object f2390f = new Object();

    /* renamed from: a */
    private final C0802n.InterfaceC0804b<Bitmap> f2391a;

    /* renamed from: b */
    private final Bitmap.Config f2392b;

    /* renamed from: c */
    private final int f2393c;

    /* renamed from: d */
    private final int f2394d;

    /* renamed from: e */
    private ImageView.ScaleType f2395e;

    public C0837i(String str, C0802n.InterfaceC0804b<Bitmap> interfaceC0804b, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C0802n.InterfaceC0803a interfaceC0803a) {
        super(0, str, interfaceC0803a);
        m11034a((InterfaceC0806p) new C0785d(1000, 2, 2.0f));
        this.f2391a = interfaceC0804b;
        this.f2392b = config;
        this.f2393c = i;
        this.f2394d = i2;
        this.f2395e = scaleType;
    }

    @Deprecated
    public C0837i(String str, C0802n.InterfaceC0804b<Bitmap> interfaceC0804b, int i, int i2, Bitmap.Config config, C0802n.InterfaceC0803a interfaceC0803a) {
        this(str, interfaceC0804b, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, interfaceC0803a);
    }

    @Override // com.android.volley.AbstractC0795l
    /* renamed from: s */
    public AbstractC0795l.EnumC0797a mo6643s() {
        return AbstractC0795l.EnumC0797a.LOW;
    }

    /* renamed from: a */
    private static int m10908a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else if (i == 0) {
            return (int) ((i2 / i4) * i3);
        } else {
            if (i2 != 0) {
                double d = i4 / i3;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    if (i * d < i2) {
                        return (int) (i2 / d);
                    }
                    return i;
                } else if (i * d > i2) {
                    return (int) (i2 / d);
                } else {
                    return i;
                }
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0795l
    /* renamed from: a */
    public C0802n<Bitmap> mo6646a(C0792i c0792i) {
        C0802n<Bitmap> m11001a;
        synchronized (f2390f) {
            try {
                m11001a = m10906b(c0792i);
            } catch (OutOfMemoryError e) {
                C0810t.m10989c("Caught OOM for %d byte image, url=%s", Integer.valueOf(c0792i.f2281b.length), m11025d());
                m11001a = C0802n.m11001a(new C0794k(e));
            }
        }
        return m11001a;
    }

    /* renamed from: b */
    private C0802n<Bitmap> m10906b(C0792i c0792i) {
        Bitmap bitmap;
        byte[] bArr = c0792i.f2281b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f2393c == 0 && this.f2394d == 0) {
            options.inPreferredConfig = this.f2392b;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int m10908a = m10908a(this.f2393c, this.f2394d, i, i2, this.f2395e);
            int m10908a2 = m10908a(this.f2394d, this.f2393c, i2, i, this.f2395e);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m10909a(i, i2, m10908a, m10908a2);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= m10908a && decodeByteArray.getHeight() <= m10908a2)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, m10908a, m10908a2, true);
                decodeByteArray.recycle();
            }
        }
        if (bitmap == null) {
            return C0802n.m11001a(new C0794k(c0792i));
        }
        return C0802n.m11000a(bitmap, C0824e.m10946a(c0792i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0795l
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo7365a(Bitmap bitmap) {
        this.f2391a.mo6192a(bitmap);
    }

    /* renamed from: a */
    static int m10909a(int i, int i2, int i3, int i4) {
        float f = 1.0f;
        while (f * 2.0f <= Math.min(i / i3, i2 / i4)) {
            f *= 2.0f;
        }
        return (int) f;
    }
}
