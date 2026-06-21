package com.tsf.shell.e.f;

import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class m {
    public Object a;
    public TextureElement b;

    public void a() {
        if (this.b == null) {
            this.b = com.censivn.C3DEngine.a.g().a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, false);
        }
    }

    public void b() {
        ArrayList arrayList;
        boolean z;
        this.a = null;
        if (this.b != null) {
            com.censivn.C3DEngine.a.g().a(this.b);
        }
        this.b = null;
        arrayList = l.d;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (((m) it.next()).b != null) {
                z = false;
                break;
            }
        }
        if (!z) {
            return;
        }
        l.g();
    }
}
