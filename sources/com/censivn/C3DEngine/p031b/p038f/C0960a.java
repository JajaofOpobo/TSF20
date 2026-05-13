package com.censivn.C3DEngine.p031b.p038f;

import java.util.Collections;
import java.util.Comparator;
/* renamed from: com.censivn.C3DEngine.b.f.a */
/* loaded from: classes.dex */
public class C0960a extends C0980j {

    /* renamed from: a */
    private static C0961a f2807a;

    /* renamed from: b */
    private boolean f2808b = false;

    public C0960a() {
        if (f2807a == null) {
            f2807a = new C0961a();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (this.f2808b) {
            m10460a();
        }
        super.dispatchDraw();
    }

    /* renamed from: a */
    public void m10460a() {
        Collections.sort(children(), f2807a);
    }

    /* renamed from: com.censivn.C3DEngine.b.f.a$a */
    /* loaded from: classes.dex */
    public class C0961a implements Comparator<C0975i> {
        public C0961a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C0975i c0975i, C0975i c0975i2) {
            int rendererPriorityLevel = c0975i.getRendererPriorityLevel();
            int rendererPriorityLevel2 = c0975i2.getRendererPriorityLevel();
            if (rendererPriorityLevel > rendererPriorityLevel2) {
                return 1;
            }
            if (rendererPriorityLevel < rendererPriorityLevel2) {
                return -1;
            }
            return 0;
        }
    }
}
