package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class n extends p {
    n() {
    }

    @Override // android.support.v4.view.a.p, android.support.v4.view.a.m
    public Object a(final l lVar) {
        return q.a(new r() { // from class: android.support.v4.view.a.n.1
            @Override // android.support.v4.view.a.r
            public boolean a(int i, int i2, Bundle bundle) {
                return lVar.a(i, i2, bundle);
            }

            @Override // android.support.v4.view.a.r
            public List a(String str, int i) {
                List a = lVar.a(str, i);
                ArrayList arrayList = new ArrayList();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((a) a.get(i2)).a());
                }
                return arrayList;
            }

            @Override // android.support.v4.view.a.r
            public Object a(int i) {
                a a = lVar.a(i);
                if (a == null) {
                    return null;
                }
                return a.a();
            }
        });
    }
}
