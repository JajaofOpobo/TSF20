package com.tsf.shell.f.i.c.a.c;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneRendererC extends j {
    private a a;

    public c(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) getVirtualTarget();
        this.a = new a();
        jVar.addChild(this.a);
    }

    @Override // com.tsf.shell.f.i.c.a.ITextureCallback
    public void b() {
        this.a.d();
    }

    @Override // com.tsf.shell.f.i.c.a.ITextureCallback
    public void c() {
    }

    @Override // com.tsf.shell.f.i.c.a.ITextureCallback
    public void a(boolean z) {
        this.a.b();
    }

    @Override // com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode, com.tsf.shell.f.i.c.a.ITextureCallback
    public void d() {
        this.a.c();
    }
}
