package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.d.a;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.f.i.b.e.b;
import com.tsf.shell.f.i.b.e.h;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.utils.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeMoreInfoLayout extends j {
    private m mAuthorView;
    private m mCheckUpdate;
    private b mIcon = new h(com.tsf.shell.manager.o.b.c);
    private m mLinkView;
    private ThemeListsManager.ThemeInfo mThemeInfo;
    private m mTitleView;
    private m mUninstall;

    public ThemeMoreInfoLayout() {
        this.mIcon.aL();
        this.mTitleView = new m();
        this.mTitleView.d(45);
        this.mTitleView.g(700);
        this.mAuthorView = new m();
        this.mAuthorView.d(45);
        this.mAuthorView.g(700);
        this.mLinkView = new m();
        this.mLinkView.e(-16728065);
        this.mLinkView.d(40);
        this.mLinkView.g(700);
        this.mLinkView.setMouseEventListener(new a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                String strC;
                if (ThemeMoreInfoLayout.this.mThemeInfo != null && (strC = ThemeMoreInfoLayout.this.mLinkView.c()) != null && !strC.equals("")) {
                    k.b(Home.b(), ThemeMoreInfoLayout.this.mLinkView.c());
                }
            }
        });
        this.mCheckUpdate = new m();
        this.mCheckUpdate.d(45);
        this.mCheckUpdate.c(b.i.text_check_for_update);
        this.mCheckUpdate.setMouseEventListener(new a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (ThemeMoreInfoLayout.this.mThemeInfo != null) {
                    k.a(Home.b(), ThemeMoreInfoLayout.this.mThemeInfo.packagename);
                }
            }
        });
        this.mUninstall = new m();
        this.mUninstall.d(45);
        this.mUninstall.c(b.i.text_uninstall);
        this.mUninstall.setMouseEventListener(new a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.3
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (ThemeMoreInfoLayout.this.mThemeInfo != null) {
                    com.tsf.shell.utils.a.a(ThemeMoreInfoLayout.this.mThemeInfo.packagename);
                }
            }
        });
        addChild(this.mIcon);
        addChild(this.mTitleView);
        addChild(this.mAuthorView);
        addChild(this.mLinkView);
        addChild(this.mCheckUpdate);
        addChild(this.mUninstall);
    }

    public void setTheme(ThemeListsManager.ThemeInfo themeInfo) {
        this.mThemeInfo = themeInfo;
        this.mTitleView.a(themeInfo.name);
        this.mAuthorView.a(com.tsf.shell.plugin.themepicker.k.d(themeInfo.context));
        this.mLinkView.a(com.tsf.shell.plugin.themepicker.k.e(themeInfo.context));
        this.mIcon.k.textures().clear();
        if (themeInfo.getIconTexture() != null) {
            this.mIcon.k.textures().addElement(themeInfo.getIconTexture());
        }
    }

    public void show() {
        float[] fArr;
        if (this.mThemeInfo.packagename.equals(com.censivn.C3DEngine.a.b())) {
            this.mUninstall.visible(false);
            fArr = new float[]{com.censivn.C3DEngine.b.b.a.a(170.0f), com.censivn.C3DEngine.b.b.a.a(70.0f), com.censivn.C3DEngine.b.b.a.a(-10.0f), com.censivn.C3DEngine.b.b.a.a(-70.0f), com.censivn.C3DEngine.b.b.a.a(-250.0f), com.censivn.C3DEngine.b.b.a.a(-250.0f)};
        } else {
            this.mUninstall.visible(true);
            fArr = new float[]{com.censivn.C3DEngine.b.b.a.a(170.0f), com.censivn.C3DEngine.b.b.a.a(70.0f), com.censivn.C3DEngine.b.b.a.a(-10.0f), com.censivn.C3DEngine.b.b.a.a(-70.0f), com.censivn.C3DEngine.b.b.a.a(-200.0f), com.censivn.C3DEngine.b.b.a.a(-300.0f)};
        }
        i[] iVarArr = {this.mIcon, this.mTitleView, this.mAuthorView, this.mLinkView, this.mCheckUpdate, this.mUninstall};
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            i iVar = iVarArr[i];
            iVar.alpha(0.0f);
            iVar.position().y = f - com.censivn.C3DEngine.b.b.a.a(150.0f);
            d dVar = new d();
            dVar.h(f);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            dVar.a(255);
            dVar.b(i * 80);
            c.a(iVar);
            c.a(iVar, 600, dVar);
        }
    }

    public void hide() {
    }

    public void recycle() {
        this.mThemeInfo = null;
        this.mIcon.k.textures().clear();
        this.mTitleView.a();
        this.mAuthorView.a();
        this.mLinkView.a();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void transferCanvas(float f, float f2, float f3, float f4) {
    }
}
