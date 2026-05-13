package com.tsf.shell.p096f.p118e.p127g.p128a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.tsf.shell.p096f.p118e.p127g.C2602e;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.g.a.b */
/* loaded from: classes.dex */
public class C2578b extends C2574a {
    private C2602e icon;
    private ArrayList<AbstractC2580c> mChildMenus;
    private AbstractC2580c mCurrentChildMenu;
    private int mMarkTextureId;

    public C2578b(int i) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        createTitleButton(C4189x.m588c(i));
    }

    public C2578b(String str) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        createTitleButton(str);
    }

    public C2578b(int i, int i2) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        this.mMarkTextureId = i2;
        createTitleButton(C4189x.m588c(i));
    }

    private void createTitleButton(String str) {
        if (this.icon == null) {
            this.icon = new C2602e(this.mMarkTextureId);
            this.icon.setMouseEventListener(new C0937a(this.icon) { // from class: com.tsf.shell.f.e.g.a.b.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    C4187w.m614b();
                    C2578b.this.menu.changeMenu(C2578b.this);
                }
            });
        }
        this.icon.m5213a(str);
    }

    public void showChildMenu(AbstractC2580c abstractC2580c) {
        if (this.mCurrentChildMenu != abstractC2580c) {
            if (this.mChildMenus.contains(abstractC2580c)) {
                this.mChildMenus.remove(abstractC2580c);
            }
            if (this.mCurrentChildMenu != null) {
                this.mCurrentChildMenu.hide(true);
            }
            this.mChildMenus.add(abstractC2580c);
            showChildMenu(abstractC2580c);
            this.mCurrentChildMenu = abstractC2580c;
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void hide(boolean z) {
        this.icon.m5206h();
        super.hide(z);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void show(boolean z) {
        this.icon.m5207g();
        super.show(z);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void recycle() {
        if (this.icon != null) {
            this.icon.m5208f();
        }
        super.recycle();
    }

    public void disable() {
        this.icon.m5210d();
    }

    public void enable() {
        this.icon.m5211c();
    }

    public boolean isEnable() {
        return this.icon.m5209e();
    }

    public C2602e getTitleIcon() {
        return this.icon;
    }
}
