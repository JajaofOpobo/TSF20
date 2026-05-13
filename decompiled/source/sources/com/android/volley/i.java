package com.android.volley;

import com.censivn.C3DEngine.api.tween.VEasing;
import java.util.Map;
/* loaded from: classes.dex */
public class i {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final boolean d;
    public final long e;

    public i(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = z;
        this.e = j;
    }

    public i(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public i(byte[] bArr, Map<String, String> map) {
        this(VEasing.Back.easeIn, bArr, map, false, 0L);
    }
}
