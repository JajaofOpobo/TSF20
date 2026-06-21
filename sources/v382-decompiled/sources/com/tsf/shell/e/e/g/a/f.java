package com.tsf.shell.e.e.g.a;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;

/* loaded from: classes.dex */
public class f extends e {
    private g mTitleContainer = new g() { // from class: com.tsf.shell.e.e.g.a.f.1
        @Override // com.tsf.shell.e.e.g.a.g
        public void a() {
            f.this.onRequestExit();
        }
    };

    public void onRequestExit() {
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void recycle() {
        this.mTitleContainer.d();
        super.recycle();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        this.mTitleContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.mTitleContainer.position().x = com.censivn.C3DEngine.b.b.a.z;
    }

    public void setTitle(int i) {
        this.mTitleContainer.a(i);
    }

    public void setTitle(String str) {
        this.mTitleContainer.a(str);
    }

    public void addIcon(j jVar) {
        this.mTitleContainer.a(jVar);
    }

    public void removeIcon() {
        this.mTitleContainer.b();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getMenuContainer() {
        return this.mTitleContainer;
    }
}
