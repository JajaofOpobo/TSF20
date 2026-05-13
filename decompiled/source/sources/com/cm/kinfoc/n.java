package com.cm.kinfoc;

import com.cm.kinfoc.a.a;
import com.cm.kinfoc.a.d;
import com.cm.kinfoc.d;
/* loaded from: classes.dex */
public class n {
    private static n a = null;
    private com.cm.kinfoc.a.a<d.a> b;

    public static n a() {
        if (a == null) {
            synchronized (n.class) {
                if (a == null) {
                    a = new n();
                }
            }
        }
        return a;
    }

    private n() {
        this.b = null;
        m.a(false);
        final b bVar = new b();
        this.b = new a.C0041a().a(17000).a(new a.b<d.a>() { // from class: com.cm.kinfoc.n.1
            @Override // com.cm.kinfoc.a.a.b
            public void a(d.a aVar) {
                if (aVar != null && m.b() && bVar != null) {
                    bVar.a(m.a(), aVar);
                }
            }
        }).a();
    }

    public void a(final String str, final String str2) {
        if (str != null && str2 != null) {
            com.cm.kinfoc.a.d.a().a(new d.c() { // from class: com.cm.kinfoc.n.2
                @Override // com.cm.kinfoc.a.d.c
                public void a(d.a aVar, boolean z, String str3) {
                    if (z) {
                        d.a aVar2 = new d.a();
                        aVar2.a = 1;
                        a aVar3 = new a();
                        aVar3.a = str;
                        aVar3.b = str2;
                        aVar2.b = aVar3;
                        n.this.a(aVar2);
                    }
                }
            });
        }
    }

    public void b(final String str, final String str2) {
        com.cm.kinfoc.a.d.a().a(new d.c() { // from class: com.cm.kinfoc.n.3
            @Override // com.cm.kinfoc.a.d.c
            public void a(d.a aVar, boolean z, String str3) {
                if (z) {
                    d.a aVar2 = new d.a();
                    aVar2.a = 4;
                    a aVar3 = new a();
                    aVar3.a = str;
                    aVar3.b = str2;
                    aVar2.b = aVar3;
                    n.this.a(aVar2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d.a aVar) {
        this.b.a((com.cm.kinfoc.a.a<d.a>) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {
        public String a;
        public String b;

        private a() {
            this.a = null;
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements d {
        private b() {
        }

        public void a(m mVar, d.a aVar) {
            if (mVar != null && aVar != null) {
                switch (aVar.a) {
                    case 1:
                        if (aVar.b != null) {
                            mVar.b(((a) aVar.b).a, ((a) aVar.b).b);
                            return;
                        }
                        return;
                    case 2:
                    case 3:
                    default:
                        return;
                    case 4:
                        if (aVar.b != null) {
                            mVar.c(((a) aVar.b).a, ((a) aVar.b).b);
                            return;
                        }
                        return;
                }
            }
        }
    }
}
