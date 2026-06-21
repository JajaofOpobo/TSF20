package com.tsf.shell.f.e.f;

import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.f.i.ShortcutItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EditModeNode extends BaseRenderable {
    private WorkspaceEditor a;
    private ArrayList<Integer> b;
    private ArrayList<Integer> c;
    private boolean d = false;

    public interface a {
    }

    public float q() {
        return 0.0f;
    }

    public void a(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    public ArrayList<Integer> r() {
        return this.b;
    }

    public ArrayList<Integer> s() {
        return this.c;
    }

    public void a(WorkspaceEditor aVar) {
        this.a = aVar;
    }

    public void b(WorkspaceEditor aVar) {
        if (aVar == this.a) {
            this.a = null;
        }
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderable
    public void dispatchDraw() {
        super.dispatchDraw();
    }

    public void a(EditModeConfig cVar) {
    }

    public void t() {
        this.d = true;
    }

    public void u() {
        this.d = false;
    }

    public boolean v() {
        return this.d;
    }

    public IRenderable d() {
        return null;
    }
}
