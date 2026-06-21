package com.tsf.shell.f.i.c.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.b;
import com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneComponentC extends com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode {
    public static Context c;
    public static VTextureManager d;
    public static m e;
    public static k f;
    public static o g;
    public static l h;
    public final int a;
    public final int b;
    long n;
    private h o;
    private h p;

    public SceneComponentC(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.a = -13521439;
        this.b = -13421773;
        this.n = 0L;
        c = context;
        d = vTextureManager;
        SceneComponentC();
    }

    private void e() {
        f = new SceneComponentK();
        g = new SceneComponentO();
        e = new SceneComponentM();
        h = new SceneComponentL();
        this.p = new SceneComponentH(VInformation.Scale());
        this.p.position().y = 80.0f;
        this.p.scale().setAll(0.8f, 0.8f, 0.8f);
        this.p.a(-13521439);
        addChild(this.p);
        this.o = new SceneComponentH(VInformation.Scale());
        this.o.position().y = -70.0f;
        this.o.b(0);
        this.o.a(-13421773);
        addChild(this.o);
    }

    @Override // com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.n > 1000) {
            this.n = jCurrentTimeMillis;
            this.o.a(jCurrentTimeMillis, true);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.ITextureCallback
    public void b() {
    }

    @Override // com.tsf.shell.f.i.c.a.ITextureCallback
    public void c() {
    }

    @Override // com.tsf.shell.f.i.c.a.ITextureCallback
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(DeferredItemGroup.d.widget_preview_cubeclock_shadow, new VObject3d[0]);
            this.k.add(new SceneComponentA(AppPreviewLabel));
            this.k.add(new SceneComponentA(ItemGroupBase));
            this.k.add(new SceneComponentA(ItemStubHelper));
            this.k.add(new SceneComponentA(h));
            c(z);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode, com.tsf.shell.f.i.c.a.IAsyncTaskListener
    public void a(int i, TextureElement textureElement) {
        if (i == DeferredItemGroup.d.widget_preview_cubeclock_shadow) {
            this.m = textureElement;
        }
    }

    class a extends j.a {
        private e h;

        public a(e eVar) {
            super();
            this.h = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode.a, com.tsf.shell.f.i.c.a.c
        public Bitmap c() {
                        return this.h.a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode.a, com.tsf.shell.f.i.c.a.c
        public void a(Bitmap bitmap) {
            this.h.a(bitmap);
            FolderItemGroup.this.a(this);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode
    public void f() {
        com.tsf.shell.f.i.c.a.NodeConfig.a("-----------onTaskMissionFinish");
        this.o.a(this.m, f, g, e);
        this.p.a(this.m, f, g, e);
    }

    @Override // com.tsf.shell.f.i.c.a.FolderSceneNodesyncTextureNode, com.tsf.shell.f.i.c.a.ITextureCallback
    public void d() {
        if (this.l) {
            this.l = false;
            PendingItemGroup.deleteTexture(this.m);
            AppPreviewLabel.b();
            ItemGroupBase.b();
            ItemStubHelper.b();
            h.b();
            this.o.a();
            this.p.a();
        }
    }
}
