package com.tsf.shell.e.e.g.a;

import android.view.MotionEvent;
import com.tsf.shell.e.e.g.h;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends a {
    private h icon;
    private ArrayList mChildMenus;
    private e mCurrentChildMenu;
    private int mMarkTextureId;

    public d(int i) {
        this.mChildMenus = new ArrayList();
        this.mMarkTextureId = 0;
        createTitleButton(x.c(i));
    }

    public d(String str) {
        this.mChildMenus = new ArrayList();
        this.mMarkTextureId = 0;
        createTitleButton(str);
    }

    public d(int i, int i2) {
        this.mChildMenus = new ArrayList();
        this.mMarkTextureId = 0;
        this.mMarkTextureId = i2;
        createTitleButton(x.c(i));
    }

    private void createTitleButton(String str) {
        if (this.icon == null) {
            this.icon = new h(this.mMarkTextureId);
            this.icon.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.icon) { // from class: com.tsf.shell.e.e.g.a.d.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    w.b();
                    d.this.menu.changeMenu(d.this);
                }
            });
        }
        this.icon.a(str);
    }

    public void showChildMenu(e eVar) {
        if (this.mCurrentChildMenu != eVar) {
            if (this.mChildMenus.contains(eVar)) {
                this.mChildMenus.remove(eVar);
            }
            if (this.mCurrentChildMenu != null) {
                this.mCurrentChildMenu.hide(true);
            }
            this.mChildMenus.add(eVar);
            showChildMenu(eVar);
            this.mCurrentChildMenu = eVar;
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void hide(boolean z) {
        this.icon.h();
        super.hide(z);
    }

    @Override // com.tsf.shell.e.e.g.a.a, com.tsf.shell.e.e.g.a.e
    public void show(boolean z) {
        this.icon.g();
        super.show(z);
    }

    @Override // com.tsf.shell.e.e.g.a.a, com.tsf.shell.e.e.g.a.e
    public void recycle() {
        if (this.icon != null) {
            this.icon.f();
        }
        super.recycle();
    }

    public void disable() {
        this.icon.d();
    }

    public void enable() {
        this.icon.c();
    }

    public boolean isEnable() {
        return this.icon.e();
    }

    public h getTitleIcon() {
        return this.icon;
    }
}
