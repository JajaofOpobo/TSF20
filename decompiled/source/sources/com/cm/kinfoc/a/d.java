package com.cm.kinfoc.a;
/* loaded from: classes.dex */
public abstract class d {
    private static d b = null;
    protected com.cm.kinfoc.a.a<b> a = null;

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWTYPE,
        MAINRECOMMEND,
        FUNCRECOMMEND,
        REP_PRIVATE_DATA
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(a aVar, boolean z, String str);
    }

    public abstract void a(c cVar);

    public static d a() {
        if (b == null) {
            return null;
        }
        return b;
    }

    public static void a(d dVar) {
        b = dVar;
    }

    /* loaded from: classes.dex */
    protected class b {
        public c a;
        public int b;

        public b(int i, c cVar) {
            this.a = null;
            this.b = 0;
            this.b = i;
            this.a = cVar;
        }
    }
}
