package com.flurry.a.b.a.b;

import com.flurry.a.b.a.k;
import com.flurry.a.b.a.o;

/* loaded from: classes.dex */
public abstract class d extends com.flurry.a.b.a.j {
    protected abstract void E();

    @Override // com.flurry.a.b.a.j
    public abstract o b();

    @Override // com.flurry.a.b.a.j
    public abstract String k();

    protected d() {
    }

    protected d(byte b) {
        super((byte) 0);
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.j d() {
        if (this.b == o.START_OBJECT || this.b == o.START_ARRAY) {
            int i = 1;
            while (true) {
                o b = b();
                if (b == null) {
                    E();
                } else {
                    switch (b) {
                        case START_OBJECT:
                        case START_ARRAY:
                            i++;
                            break;
                        case END_OBJECT:
                        case END_ARRAY:
                            i--;
                            if (i != 0) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r4 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        a(r13, r0, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r1 < r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1 + 1;
        r1 = r11.charAt(r1);
        r5 = r13.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r5 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        a(r13, r1, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r1 = (r4 << 6) | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0 < r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        r4 = r0 + 1;
        r0 = r11.charAt(r0);
        r5 = r13.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r5 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r1 = (r1 << 6) | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r4 < r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        r0 = r4 + 1;
        r4 = r11.charAt(r4);
        r5 = r13.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        if (r5 >= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        r12.c((r1 << 6) | r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r5 == (-2)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        a(r13, r4, 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r12.b(r1 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r13.a() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        r12.b(r1 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        throw a("Unexpected end-of-String in base64 content");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005d, code lost:
    
        if (r5 == (-2)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005f, code lost:
    
        a(r13, r0, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        if (r4 < r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        r0 = r4 + 1;
        r4 = r11.charAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
    
        if (r13.a(r4) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0078, code lost:
    
        a(r13, r4, 3, "expected padding character '" + r13.b() + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        r12.a(r1 >> 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006b, code lost:
    
        throw a("Unexpected end-of-String in base64 content");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0042, code lost:
    
        if (r13.a() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0044, code lost:
    
        r12.a(r1 >> 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0050, code lost:
    
        throw a("Unexpected end-of-String in base64 content");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0028, code lost:
    
        throw a("Unexpected end-of-String in base64 content");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r4 = r13.b(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void a(String str, com.flurry.a.b.a.h.d dVar, com.flurry.a.b.a.a aVar) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            while (true) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (i2 < length) {
                    if (charAt > ' ') {
                        break;
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    private void a(com.flurry.a.b.a.a aVar, char c, int i, String str) {
        String str2;
        if (c <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else if (aVar.a(c)) {
            str2 = "Unexpected padding character ('" + aVar.b() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw a(str2);
    }

    protected final void b(int i, String str) {
        String str2 = "Unexpected character (" + b(i) + ")";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw a(str2);
    }

    protected final void H() {
        c(" in " + this.b);
    }

    protected final void c(String str) {
        throw a("Unexpected end-of-input" + str);
    }

    protected final void I() {
        c(" in a value");
    }

    protected final void a(int i) {
        throw a("Illegal character (" + b((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    protected final void c(int i, String str) {
        if (!a(k.ALLOW_UNQUOTED_CONTROL_CHARS) || i >= 32) {
            throw a("Illegal unquoted character (" + b((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    protected final char a(char c) {
        if (a(k.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c == '\'' && a(k.ALLOW_SINGLE_QUOTES))) {
            return c;
        }
        throw a("Unrecognized character escape " + b(c));
    }

    protected static final String b(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        }
        if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        }
        return "'" + c + "' (code " + i + ")";
    }

    protected final void d(String str) {
        throw a(str);
    }

    protected final void a(String str, Throwable th) {
        throw new com.flurry.a.b.a.i(str, i(), th);
    }

    protected static void J() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
