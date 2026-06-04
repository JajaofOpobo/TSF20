package com.tsf.shell.workspace3D.h;

import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.Iterator;

/* loaded from: classes.dex */
final class am extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ab a;

    am(ab abVar) {
        this.a = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.e.b bVar;
        TextureElement textureElement;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        TextureElement textureElement2;
        bVar = this.a.L;
        bVar.z().d();
        textureElement = this.a.K;
        if (textureElement != null) {
            com.censivn.C3DEngine.b.ad f = com.censivn.C3DEngine.a.f();
            textureElement2 = this.a.K;
            f.a(textureElement2);
            this.a.K = null;
        }
        vVar = this.a.f;
        vVar.Q();
        vVar2 = this.a.g;
        vVar2.Q();
        this.a.u = false;
        this.a.h = false;
        r0.A.a(this.a.a.x);
        String str = "";
        Iterator it = this.a.a.i.iterator();
        while (true) {
            String str2 = str;
            if (it.hasNext()) {
                str = String.valueOf(str2) + ((a) it.next()).aG() + ",";
            } else {
                String substring = str2.substring(0, str2.length() - 1);
                com.tsf.shell.a.s sVar = new com.tsf.shell.a.s();
                sVar.a = this.a.a.l - 1;
                sVar.b = substring;
                com.tsf.shell.a.t.a(sVar);
                return;
            }
        }
    }
}
