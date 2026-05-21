package com.censivn.C3DEngine.c.a;

import com.censivn.C3DEngine.api.element.FacesBufferedList;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.b.f.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    protected ArrayList<e> a = new ArrayList<>();
    protected ArrayList<a> b = new ArrayList<>();
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected int i;
    protected int j;
    protected int k;
    protected float l;
    protected float m;
    protected float n;

    public void a(i iVar) {
        PointBufferManager pointBufferManagerPoints = iVar.points();
        FacesBufferedList facesBufferedListFaces = iVar.faces();
        int size = pointBufferManagerPoints.size();
        int size2 = facesBufferedListFaces.size();
        for (int i = 0; i < size; i++) {
            e eVar = new e();
            eVar.a(i, pointBufferManagerPoints);
            this.a.add(eVar);
        }
        for (int i2 = 0; i2 < size2; i2++) {
            a aVar = new a();
            short propertyA = facesBufferedListFaces.getPropertyA(i2);
            short propertyB = facesBufferedListFaces.getPropertyB(i2);
            int propertyC = (int) facesBufferedListFaces.getPropertyC(i2);
            aVar.a(this.a.get(propertyA));
            aVar.a(this.a.get(propertyB));
            aVar.a(this.a.get(propertyC));
            this.b.add(aVar);
        }
    }

    public void b(i iVar) {
        PointBufferManager pointBufferManagerPoints = iVar.points();
        int size = pointBufferManagerPoints.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i).a(i, pointBufferManagerPoints);
        }
    }

    public ArrayList<e> a() {
        return this.a;
    }

    public ArrayList<a> b() {
        return this.b;
    }

    public void c() {
        int size = a().size();
        for (int i = 0; i < size; i++) {
            e eVar = a().get(i);
            if (i == 0) {
                float fA = eVar.a();
                this.c = fA;
                this.f = fA;
                float fB = eVar.b();
                this.d = fB;
                this.g = fB;
                float fC = eVar.c();
                this.e = fC;
                this.h = fC;
            } else {
                this.f = Math.min(this.f, eVar.a());
                this.g = Math.min(this.g, eVar.b());
                this.h = Math.min(this.h, eVar.c());
                this.c = Math.max(this.c, eVar.a());
                this.d = Math.max(this.d, eVar.b());
                this.e = Math.max(this.e, eVar.c());
            }
            eVar.b(eVar.a(), eVar.b(), eVar.c());
        }
        this.l = this.c - this.f;
        this.m = this.d - this.g;
        this.n = this.e - this.h;
        float fMax = Math.max(this.l, Math.max(this.m, this.n));
        float fMin = Math.min(this.l, Math.min(this.m, this.n));
        if (fMax == this.l && fMin == this.m) {
            this.k = 2;
            this.j = 4;
            this.i = 1;
        } else if (fMax == this.l && fMin == this.n) {
            this.k = 4;
            this.j = 2;
            this.i = 1;
        } else if (fMax == this.m && fMin == this.l) {
            this.k = 1;
            this.j = 4;
            this.i = 2;
        } else if (fMax == this.m && fMin == this.n) {
            this.k = 4;
            this.j = 1;
            this.i = 2;
        } else if (fMax == this.n && fMin == this.l) {
            this.k = 1;
            this.j = 2;
            this.i = 4;
        } else if (fMax == this.n && fMin == this.m) {
            this.k = 2;
            this.j = 1;
            this.i = 4;
        }
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = a().get(i2);
            eVar2.a((eVar2.a() - this.f) / this.l, (eVar2.b() - this.g) / this.m, (eVar2.c() - this.h) / this.n);
        }
    }

    public void d() {
        int size = a().size();
        for (int i = 0; i < size; i++) {
            a().get(i).d();
        }
    }

    public void e() {
        int size = a().size();
        for (int i = 0; i < size; i++) {
            a().get(i).e();
        }
        c();
    }

    public float a(int i) {
        switch (i) {
            case 1:
                return this.f;
            case 2:
                return this.g;
            case 3:
            default:
                return -1.0f;
            case 4:
                return this.h;
        }
    }

    public float f() {
        return this.c;
    }

    public float g() {
        return this.d;
    }

    public float h() {
        return this.e;
    }

    public float b(int i) {
        switch (i) {
            case 1:
                return this.c;
            case 2:
                return this.d;
            case 3:
            default:
                return -1.0f;
            case 4:
                return this.e;
        }
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.k;
    }

    public void k() {
    }
}
