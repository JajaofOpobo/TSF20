package com.tsf.shell.p096f.p118e;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.utils.C4176l;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.e */
/* loaded from: classes.dex */
public class C2529e extends C0980j {

    /* renamed from: a */
    private static C2529e f8394a = new C2529e();

    /* renamed from: b */
    private static Number3d f8395b = new Number3d();

    /* renamed from: c */
    private static C3231c f8396c;

    public C2529e() {
        renderChildren(false);
    }

    /* renamed from: a */
    public static boolean m5340a(C3231c c3231c) {
        return c3231c == f8396c && f8394a.numChildren() > 0;
    }

    /* renamed from: a */
    public static int m5341a() {
        return f8394a.numChildren();
    }

    /* renamed from: b */
    public static boolean m5337b(C3231c c3231c) {
        if (c3231c != f8396c || f8394a.numChildren() <= 0) {
            return false;
        }
        Iterator<C0975i> it = f8394a.children().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof C3145b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m5335c(C3231c c3231c) {
        if (f8394a.parent() == null) {
            c3231c.m3069an();
            f8396c = c3231c;
            C3359a.f11096j.m2232a(f8394a);
        } else if (f8396c != c3231c) {
            C4176l.m668a(f8394a, "FollowingContainer exist FollowingTarget:" + f8396c);
        }
    }

    /* renamed from: a */
    public static void m5339a(ArrayList<C3231c> arrayList) {
        Iterator<C3231c> it = arrayList.iterator();
        while (it.hasNext()) {
            m5334d(it.next());
        }
    }

    /* renamed from: d */
    public static void m5334d(C3231c c3231c) {
        c3231c.visible(true);
        c3231c.alpha(255.0f);
        c3231c.m3069an();
        f8395b.reset();
        c3231c.localToGlobal(f8395b);
        c3231c.position().setAllFrom(f8395b);
        c3231c.removeFromParent();
        f8394a.addChild(c3231c);
    }

    /* renamed from: b */
    public static ArrayList<C3231c> m5338b() {
        ArrayList<C3231c> arrayList = new ArrayList<>();
        Iterator<C0975i> it = f8394a.children().iterator();
        while (it.hasNext()) {
            arrayList.add((C3231c) it.next());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList<C3231c> m5336c() {
        ArrayList<C3231c> m5338b = m5338b();
        while (f8394a.numChildren() > 0) {
            f8394a.getChildAt(0).removeFromParent();
        }
        C3359a.f11096j.m2223b(f8394a);
        f8396c = null;
        return m5338b;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (f8396c != null) {
            C0975i c0975i = f8396c;
            float numChildren = numChildren() * 0.04f;
            float f = numChildren <= 0.3f ? numChildren : 0.3f;
            float f2 = ((double) f) < 0.12d ? 0.12f : f;
            Iterator<C0975i> it = children().iterator();
            while (it.hasNext()) {
                C0975i next = it.next();
                next.position().f2526x += ((c0975i.position().f2526x + (10.0f * C0892a.f2567c)) - next.position().f2526x) * f2;
                PositionNumber3d position = next.position();
                position.f2527y = ((c0975i.position().f2527y - next.position().f2527y) * f2) + position.f2527y;
                c0975i = next;
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        int numChildren = numChildren();
        while (true) {
            numChildren--;
            if (numChildren > -1) {
                C0975i childAt = getChildAt(numChildren);
                onDrawChildStart(childAt);
                childAt.dispatchDraw();
                onDrawChildEnd(childAt);
            } else {
                return;
            }
        }
    }
}
