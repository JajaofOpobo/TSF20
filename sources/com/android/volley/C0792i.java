package com.android.volley;

import com.censivn.C3DEngine.api.tween.VEasing;
import java.util.Map;
/* renamed from: com.android.volley.i */
/* loaded from: classes.dex */
public class C0792i {

    /* renamed from: a */
    public final int f2280a;

    /* renamed from: b */
    public final byte[] f2281b;

    /* renamed from: c */
    public final Map<String, String> f2282c;

    /* renamed from: d */
    public final boolean f2283d;

    /* renamed from: e */
    public final long f2284e;

    public C0792i(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f2280a = i;
        this.f2281b = bArr;
        this.f2282c = map;
        this.f2283d = z;
        this.f2284e = j;
    }

    public C0792i(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public C0792i(byte[] bArr, Map<String, String> map) {
        this(VEasing.Back.easeIn, bArr, map, false, 0L);
    }
}
