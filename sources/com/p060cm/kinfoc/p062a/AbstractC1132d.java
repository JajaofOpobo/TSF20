package com.p060cm.kinfoc.p062a;
/* renamed from: com.cm.kinfoc.a.d */
/* loaded from: classes.dex */
public abstract class AbstractC1132d {

    /* renamed from: b */
    private static AbstractC1132d f3597b = null;

    /* renamed from: a */
    protected C1126a<C1134b> f3598a = null;

    /* renamed from: com.cm.kinfoc.a.d$a */
    /* loaded from: classes.dex */
    public enum EnumC1133a {
        UNKNOWTYPE,
        MAINRECOMMEND,
        FUNCRECOMMEND,
        REP_PRIVATE_DATA
    }

    /* renamed from: com.cm.kinfoc.a.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1135c {
        /* renamed from: a */
        void mo9612a(EnumC1133a enumC1133a, boolean z, String str);
    }

    /* renamed from: a */
    public abstract void mo9743a(InterfaceC1135c interfaceC1135c);

    /* renamed from: a */
    public static AbstractC1132d m9744a() {
        if (f3597b == null) {
            return null;
        }
        return f3597b;
    }

    /* renamed from: a */
    public static void m9742a(AbstractC1132d abstractC1132d) {
        f3597b = abstractC1132d;
    }

    /* renamed from: com.cm.kinfoc.a.d$b */
    /* loaded from: classes.dex */
    protected class C1134b {

        /* renamed from: a */
        public InterfaceC1135c f3604a;

        /* renamed from: b */
        public int f3605b;

        public C1134b(int i, InterfaceC1135c interfaceC1135c) {
            this.f3604a = null;
            this.f3605b = 0;
            this.f3605b = i;
            this.f3604a = interfaceC1135c;
        }
    }
}
