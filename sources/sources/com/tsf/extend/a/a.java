package com.tsf.extend.a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static final double[] e = new double[ItemInfo.APP_INTENT];
    public int a;
    private char b;
    private CharSequence c;
    private int d;

    public a(CharSequence charSequence, int i) {
        this.c = charSequence;
        this.a = i;
        this.d = charSequence.length();
        this.b = charSequence.charAt(i);
    }

    private char f() {
        if (this.a < this.d) {
            this.a++;
        }
        if (this.a == this.d) {
            return (char) 0;
        }
        return this.c.charAt(this.a);
    }

    public void a() {
        while (this.a < this.d && Character.isWhitespace(this.c.charAt(this.a))) {
            c();
        }
    }

    public void b() {
        while (this.a < this.d) {
            switch (this.c.charAt(this.a)) {
                case '\t':
                case '\n':
                case ' ':
                case ',':
                    c();
                    break;
                default:
                    return;
            }
        }
    }

    public void c() {
        this.b = f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2 A[PHI: r2
  0x00d2: PHI (r2v1 boolean) = (r2v0 boolean), (r2v2 boolean) binds: [B:49:0x00b3, B:53:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[LOOP:1: B:35:0x0080->B:76:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:5: B:23:0x004e->B:88:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float d() {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.a.a.d():float");
    }

    private void a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public static float a(int i, int i2) {
        if (i2 < -125 || i == 0) {
            return 0.0f;
        }
        if (i2 >= 128) {
            return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        }
        if (i2 == 0) {
            return i;
        }
        if (i >= 67108864) {
            i++;
        }
        return (float) (i2 > 0 ? ((double) i) * e[i2] : ((double) i) / e[-i2]);
    }

    static {
        for (int i = 0; i < e.length; i++) {
            e[i] = Math.pow(10.0d, i);
        }
    }

    public float e() {
        a();
        float fD = d();
        b();
        return fD;
    }
}
