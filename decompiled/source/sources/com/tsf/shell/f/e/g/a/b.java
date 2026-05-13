package com.tsf.shell.f.e.g.a;

import android.view.MotionEvent;
import com.tsf.shell.f.e.g.e;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b extends a {
    private e icon;
    private ArrayList<c> mChildMenus;
    private c mCurrentChildMenu;
    private int mMarkTextureId;

    public b(int i) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        createTitleButton(x.c(i));
    }

    public b(String str) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        createTitleButton(str);
    }

    public b(int i, int i2) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        this.mMarkTextureId = i2;
        createTitleButton(x.c(i));
    }

    private void createTitleButton(String str) {
        if (this.icon == null) {
            this.icon = new e(this.mMarkTextureId);
            this.icon.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.icon) { // from class: com.tsf.shell.f.e.g.a.b.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    w.b();
                    b.this.menu.changeMenu(b.this);
                }
            });
        }
        this.icon.a(str);
    }

    public void showChildMenu(c cVar) {
        if (this.mCurrentChildMenu != cVar) {
            if (this.mChildMenus.contains(cVar)) {
                this.mChildMenus.remove(cVar);
            }
            if (this.mCurrentChildMenu != null) {
                this.mCurrentChildMenu.hide(true);
            }
            this.mChildMenus.add(cVar);
            showChildMenu(cVar);
            this.mCurrentChildMenu = cVar;
        }
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void hide(boolean z) {
        this.icon.h();
        super.hide(z);
    }

    @Override // com.tsf.shell.f.e.g.a.a, com.tsf.shell.f.e.g.a.c
    public void show(boolean z) {
        this.icon.g();
        super.show(z);
    }

    @Override // com.tsf.shell.f.e.g.a.a, com.tsf.shell.f.e.g.a.c
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

    public e getTitleIcon() {
        return this.icon;
    }
}
