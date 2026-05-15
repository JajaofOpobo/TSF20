package com.censivn.C3DEngine.b.f;

import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends j {
    private static C0029a a;
    private boolean b = false;

    public a() {
        if (a == null) {
            a = new C0029a();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (this.b) {
            a();
        }
        super.dispatchDraw();
    }

    public void a() {
        Collections.sort(children(), a);
    }

    /* JADX INFO: renamed from: com.censivn.C3DEngine.b.f.a$a, reason: collision with other inner class name */
    public class C0029a implements Comparator<i> {
        public C0029a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            int rendererPriorityLevel = iVar.getRendererPriorityLevel();
            int rendererPriorityLevel2 = iVar2.getRendererPriorityLevel();
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
