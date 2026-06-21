package com.censivn.C3DEngine.e;

import java.util.StringTokenizer;

/* loaded from: classes.dex */
class l extends n {
    final /* synthetic */ k a;

    public l(k kVar, String str, String str2, int i) {
        boolean z = false;
        this.a = kVar;
        this.h = str2;
        this.e = i;
        boolean z2 = str.indexOf("//") > -1;
        StringTokenizer stringTokenizer = new StringTokenizer(z2 ? str.replace("//", "/") : str);
        stringTokenizer.nextToken();
        StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken(), "/");
        int countTokens = stringTokenizer2.countTokens();
        this.f = countTokens >= 2 && !z2;
        if (countTokens == 3 || (countTokens == 2 && z2)) {
            z = true;
        }
        this.g = z;
        this.b = new int[i];
        if (this.f) {
            this.c = new int[i];
        }
        if (this.g) {
            this.d = new int[i];
        }
        int i2 = 1;
        StringTokenizer stringTokenizer3 = stringTokenizer2;
        while (i2 < i + 1) {
            stringTokenizer3 = i2 > 1 ? new StringTokenizer(stringTokenizer.nextToken(), "/") : stringTokenizer3;
            int i3 = i2 - 1;
            this.b[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
            if (this.f) {
                this.c[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
            }
            if (this.g) {
                this.d[i3] = (short) (Short.parseShort(stringTokenizer3.nextToken()) - 1);
            }
            i2++;
        }
    }
}
