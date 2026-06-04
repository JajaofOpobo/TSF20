package android.support.v4.view.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class i implements m {
    final /* synthetic */ f a;
    final /* synthetic */ h b;

    i(h hVar, f fVar) {
        this.b = hVar;
        this.a = fVar;
    }

    @Override // android.support.v4.view.a.m
    public final boolean a() {
        f fVar = this.a;
        return f.c();
    }

    @Override // android.support.v4.view.a.m
    public final List b() {
        List list = null;
        f fVar = this.a;
        f.d();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((a) list.get(i)).a());
        }
        return arrayList;
    }

    @Override // android.support.v4.view.a.m
    public final Object c() {
        f fVar = this.a;
        f.b();
        return null;
    }
}
