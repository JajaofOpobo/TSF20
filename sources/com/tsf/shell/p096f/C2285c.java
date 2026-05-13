package com.tsf.shell.p096f;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.c */
/* loaded from: classes.dex */
public class C2285c {

    /* renamed from: a */
    private static ArrayList<AbstractC3208b> f7457a = new ArrayList<>();

    /* renamed from: a */
    public static AbstractC3208b m5957a(C0975i c0975i) {
        AbstractC3208b remove;
        if (f7457a.isEmpty()) {
            remove = new C3224h();
            remove.visible(false);
        } else {
            remove = f7457a.remove(0);
        }
        remove.position().setAllFrom(c0975i.position());
        remove.scale().setAllFrom(c0975i.scale());
        remove.rotation().setAllFrom(c0975i.rotation());
        remove.setAABBPX(c0975i.minX(), c0975i.minY(), c0975i.minZ(), c0975i.maxX(), c0975i.maxY(), c0975i.maxZ());
        return remove;
    }

    /* renamed from: a */
    public static void m5956a(AbstractC3208b abstractC3208b) {
        f7457a.add(abstractC3208b);
    }
}
