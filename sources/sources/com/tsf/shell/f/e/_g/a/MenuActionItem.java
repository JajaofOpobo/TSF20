package com.tsf.shell.f.e._g.a;

import android.view.MotionEvent;
import com.tsf.shell.f.e._g.MenuExpandItem;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MenuActionItem extends MenuActionHandler {
    private MenuExpandItem icon;
    private ArrayList<MenuItemBase> mChildMenus;
    private MenuItemBase mCurrentChildMenu;
    private int mMarkTextureId;

    public MenuActionItem(int i) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        createTitleButton(x.c(i));
    }

    public MenuActionItem(String str) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        createTitleButton(str);
    }

    public MenuActionItem(int i, int i2) {
        this.mChildMenus = new ArrayList<>();
        this.mMarkTextureId = 0;
        this.mMarkTextureId = i2;
        createTitleButton(x.c(i));
    }

    private void createTitleButton(String str) {
        if (this.icon == null) {
            this.icon = new e(this.mMarkTextureId);
            this.icon.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.icon) { // from class: com.tsf.shell.f.e._g.a.MenuActionItem.1
                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent) {
                    w.b();
                    MenuActionItem.this.menu.changeMenu(MenuActionItem.this);
                }
            });
        }
        this.icon.a(str);
    }

    public void showChildMenu(MenuItemBase menuItemBase) {
        if (this.mCurrentChildMenu != menuItemBase) {
            if (this.mChildMenus.contains(menuItemBase)) {
                this.mChildMenus.remove(menuItemBase);
            }
            if (this.mCurrentChildMenu != null) {
                this.mCurrentChildMenu.hide(true);
            }
            this.mChildMenus.add(menuItemBase);
            showChildMenu(menuItemBase);
            this.mCurrentChildMenu = menuItemBase;
        }
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void hide(boolean z) {
        this.icon.h();
        super.hide(z);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuActionHandler, com.tsf.shell.f.e._g.a.MenuItemBase
    public void show(boolean z) {
        this.icon.g();
        super.show(z);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuActionHandler, com.tsf.shell.f.e._g.a.MenuItemBase
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

    public MenuExpandItem getTitleIcon() {
        return this.icon;
    }
}
