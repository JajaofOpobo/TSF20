package com.tsf.shell.f.f;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageEventDispatcher {
    private ArrayList<PageShaderNode> a = new ArrayList<>();
    private WorkspacePage b;

    public static class a {
        public void a(WorkspacePage gVar) {
        }

        public void a() {
        }

        public void b() {
        }
    }

    public void a(A aVar) {
        if (!this.PageShaderNode.contains(aVar)) {
            this.PageShaderNode.add(aVar);
        }
    }

    public void a() {
        Iterator<PageShaderNode> it = this.PageShaderNode.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void b() {
        Iterator<PageShaderNode> it = this.PageShaderNode.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a(WorkspacePage gVar) {
        if (this.b != gVar) {
            this.b = gVar;
            Iterator<PageShaderNode> it = this.PageShaderNode.iterator();
            while (it.hasNext()) {
                it.next().a(gVar);
            }
        }
    }
}
