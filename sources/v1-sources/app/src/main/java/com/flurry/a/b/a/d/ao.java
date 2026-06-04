package com.flurry.a.b.a.d;

/* loaded from: classes.dex */
public final class ao extends ap {
    @Override // com.flurry.a.b.a.d.ap
    public final String e(String str) {
        int i;
        char c;
        boolean z;
        if (str != null) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i2 = 0;
            boolean z2 = false;
            int i3 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (i2 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z2 && i3 > 0 && sb.charAt(i3 - 1) != '_') {
                            sb.append('_');
                            i3++;
                        }
                        char lowerCase = Character.toLowerCase(charAt);
                        z = true;
                        i = i3;
                        c = lowerCase;
                    } else {
                        i = i3;
                        c = charAt;
                        z = false;
                    }
                    sb.append(c);
                    i3 = i + 1;
                } else {
                    z = z2;
                }
                i2++;
                z2 = z;
            }
            return i3 > 0 ? sb.toString() : str;
        }
        return str;
    }
}
