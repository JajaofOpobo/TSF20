package com.p060cm.kinfoc;

import com.p060cm.kinfoc.InterfaceC1140d;
import com.p060cm.kinfoc.p062a.AbstractC1132d;
import com.p060cm.kinfoc.p062a.C1126a;
/* renamed from: com.cm.kinfoc.n */
/* loaded from: classes.dex */
public class C1157n {

    /* renamed from: a */
    private static C1157n f3679a = null;

    /* renamed from: b */
    private C1126a<InterfaceC1140d.C1141a> f3680b;

    /* renamed from: a */
    public static C1157n m9659a() {
        if (f3679a == null) {
            synchronized (C1157n.class) {
                if (f3679a == null) {
                    f3679a = new C1157n();
                }
            }
        }
        return f3679a;
    }

    private C1157n() {
        this.f3680b = null;
        C1155m.m9671a(false);
        final C1162b c1162b = new C1162b();
        this.f3680b = new C1126a.C1128a().m9789a(17000).m9787a(new C1126a.InterfaceC1129b<InterfaceC1140d.C1141a>() { // from class: com.cm.kinfoc.n.1
            @Override // com.p060cm.kinfoc.p062a.C1126a.InterfaceC1129b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo9653a(InterfaceC1140d.C1141a c1141a) {
                if (c1141a != null && C1155m.m9670b() && c1162b != null) {
                    c1162b.m9652a(C1155m.m9678a(), c1141a);
                }
            }
        }).m9790a();
    }

    /* renamed from: a */
    public void m9656a(final String str, final String str2) {
        if (str != null && str2 != null) {
            AbstractC1132d.m9744a().mo9743a(new AbstractC1132d.InterfaceC1135c() { // from class: com.cm.kinfoc.n.2
                @Override // com.p060cm.kinfoc.p062a.AbstractC1132d.InterfaceC1135c
                /* renamed from: a */
                public void mo9612a(AbstractC1132d.EnumC1133a enumC1133a, boolean z, String str3) {
                    if (z) {
                        InterfaceC1140d.C1141a c1141a = new InterfaceC1140d.C1141a();
                        c1141a.f3610a = 1;
                        C1161a c1161a = new C1161a();
                        c1161a.f3689a = str;
                        c1161a.f3690b = str2;
                        c1141a.f3611b = c1161a;
                        C1157n.this.m9658a(c1141a);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void m9655b(final String str, final String str2) {
        AbstractC1132d.m9744a().mo9743a(new AbstractC1132d.InterfaceC1135c() { // from class: com.cm.kinfoc.n.3
            @Override // com.p060cm.kinfoc.p062a.AbstractC1132d.InterfaceC1135c
            /* renamed from: a */
            public void mo9612a(AbstractC1132d.EnumC1133a enumC1133a, boolean z, String str3) {
                if (z) {
                    InterfaceC1140d.C1141a c1141a = new InterfaceC1140d.C1141a();
                    c1141a.f3610a = 4;
                    C1161a c1161a = new C1161a();
                    c1161a.f3689a = str;
                    c1161a.f3690b = str2;
                    c1141a.f3611b = c1161a;
                    C1157n.this.m9658a(c1141a);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9658a(InterfaceC1140d.C1141a c1141a) {
        this.f3680b.m9793a((C1126a<InterfaceC1140d.C1141a>) c1141a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.cm.kinfoc.n$a */
    /* loaded from: classes.dex */
    public class C1161a {

        /* renamed from: a */
        public String f3689a;

        /* renamed from: b */
        public String f3690b;

        private C1161a() {
            this.f3689a = null;
            this.f3690b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.cm.kinfoc.n$b */
    /* loaded from: classes.dex */
    public class C1162b implements InterfaceC1140d {
        private C1162b() {
        }

        /* renamed from: a */
        public void m9652a(C1155m c1155m, InterfaceC1140d.C1141a c1141a) {
            if (c1155m != null && c1141a != null) {
                switch (c1141a.f3610a) {
                    case 1:
                        if (c1141a.f3611b != null) {
                            c1155m.m9669b(((C1161a) c1141a.f3611b).f3689a, ((C1161a) c1141a.f3611b).f3690b);
                            return;
                        }
                        return;
                    case 2:
                    case 3:
                    default:
                        return;
                    case 4:
                        if (c1141a.f3611b != null) {
                            c1155m.m9666c(((C1161a) c1141a.f3611b).f3689a, ((C1161a) c1141a.f3611b).f3690b);
                            return;
                        }
                        return;
                }
            }
        }
    }
}
