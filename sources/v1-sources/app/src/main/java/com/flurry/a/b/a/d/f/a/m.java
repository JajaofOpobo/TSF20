package com.flurry.a.b.a.d.f.a;

import com.flurry.a.b.a.a.v;
import com.flurry.a.b.a.a.w;
import com.flurry.a.b.a.d.ah;
import com.flurry.a.b.a.d.as;
import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.az;
import java.util.Collection;

/* loaded from: classes.dex */
public final class m implements com.flurry.a.b.a.d.f.d {
    protected w a;
    protected v b;
    protected String c;
    protected Class d;
    protected com.flurry.a.b.a.d.f.c e;

    @Override // com.flurry.a.b.a.d.f.d
    public final /* synthetic */ com.flurry.a.b.a.d.f.d a(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("includeAs can not be null");
        }
        this.b = vVar;
        return this;
    }

    @Override // com.flurry.a.b.a.d.f.d
    public final /* bridge */ /* synthetic */ com.flurry.a.b.a.d.f.d a(Class cls) {
        this.d = cls;
        return this;
    }

    @Override // com.flurry.a.b.a.d.f.d
    public final /* synthetic */ com.flurry.a.b.a.d.f.d a(String str) {
        if (str == null || str.length() == 0) {
            str = this.a.a();
        }
        this.c = str;
        return this;
    }

    @Override // com.flurry.a.b.a.d.f.d
    public final Class a() {
        return this.d;
    }

    @Override // com.flurry.a.b.a.d.f.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m a(w wVar, com.flurry.a.b.a.d.f.c cVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("idType can not be null");
        }
        this.a = wVar;
        this.e = cVar;
        this.c = wVar.a();
        return this;
    }

    @Override // com.flurry.a.b.a.d.f.d
    public final az a(as asVar, com.flurry.a.b.a.g.a aVar, Collection collection, com.flurry.a.b.a.d.f fVar) {
        if (this.a == w.NONE) {
            return null;
        }
        com.flurry.a.b.a.d.f.c a = a(asVar, aVar, collection, true, false);
        switch (this.b) {
            case WRAPPER_ARRAY:
                return new b(a, fVar);
            case PROPERTY:
                return new g(a, fVar, this.c);
            case WRAPPER_OBJECT:
                return new i(a, fVar);
            case EXTERNAL_PROPERTY:
                return new d(a, fVar, this.c);
            default:
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.b);
        }
    }

    @Override // com.flurry.a.b.a.d.f.d
    public final ay a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, Collection collection, com.flurry.a.b.a.d.f fVar) {
        if (this.a == w.NONE) {
            return null;
        }
        com.flurry.a.b.a.d.f.c a = a(nVar, aVar, collection, false, true);
        switch (this.b) {
            case WRAPPER_ARRAY:
                return new a(aVar, a, fVar, this.d);
            case PROPERTY:
                return new e(aVar, a, fVar, this.d, this.c);
            case WRAPPER_OBJECT:
                Class cls = this.d;
                return new h(aVar, a, fVar);
            case EXTERNAL_PROPERTY:
                return new c(aVar, a, fVar, this.d, this.c);
            default:
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.b);
        }
    }

    private com.flurry.a.b.a.d.f.c a(ah ahVar, com.flurry.a.b.a.g.a aVar, Collection collection, boolean z, boolean z2) {
        if (this.e != null) {
            return this.e;
        }
        if (this.a == null) {
            throw new IllegalStateException("Can not build, 'init()' not yet called");
        }
        switch (this.a) {
            case CLASS:
                return new j(aVar, ahVar.n());
            case MINIMAL_CLASS:
                return new k(aVar, ahVar.n());
            case NAME:
                return q.a(ahVar, aVar, collection, z, z2);
            case NONE:
                return null;
            default:
                throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.a);
        }
    }
}
