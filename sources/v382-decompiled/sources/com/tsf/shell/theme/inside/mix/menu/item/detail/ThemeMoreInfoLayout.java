package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.o;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.j;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.theme.inside.ThemeListsManager;

/* loaded from: classes.dex */
public class ThemeMoreInfoLayout extends l {
    private o mAuthorView;
    private o mCheckUpdate;
    private com.tsf.shell.e.i.b.e.b mIcon = new j(com.tsf.shell.manager.o.b.c);
    private o mLinkView;
    private ThemeListsManager.ThemeInfo mThemeInfo;
    private o mTitleView;
    private o mUninstall;

    public ThemeMoreInfoLayout() {
        this.mIcon.aL();
        this.mTitleView = new o();
        this.mTitleView.d(45);
        this.mTitleView.g(700);
        this.mAuthorView = new o();
        this.mAuthorView.d(45);
        this.mAuthorView.g(700);
        this.mLinkView = new o();
        this.mLinkView.e(-16728065);
        this.mLinkView.d(40);
        this.mLinkView.g(700);
        this.mLinkView.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                String c;
                if (ThemeMoreInfoLayout.this.mThemeInfo != null && (c = ThemeMoreInfoLayout.this.mLinkView.c()) != null && !c.equals("")) {
                    com.tsf.shell.utils.l.b(Home.b(), ThemeMoreInfoLayout.this.mLinkView.c());
                }
            }
        });
        this.mCheckUpdate = new o();
        this.mCheckUpdate.d(45);
        this.mCheckUpdate.c(R.string.text_check_for_update);
        this.mCheckUpdate.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (ThemeMoreInfoLayout.this.mThemeInfo != null) {
                    com.tsf.shell.utils.l.a(Home.b(), ThemeMoreInfoLayout.this.mThemeInfo.packagename);
                }
            }
        });
        this.mUninstall = new o();
        this.mUninstall.d(45);
        this.mUninstall.c(R.string.text_uninstall);
        this.mUninstall.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.3
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
        this.mAuthorView.a(ac.d(themeInfo.context));
        this.mLinkView.a(ac.e(themeInfo.context));
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
        com.censivn.C3DEngine.b.f.j[] jVarArr = {this.mIcon, this.mTitleView, this.mAuthorView, this.mLinkView, this.mCheckUpdate, this.mUninstall};
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            com.censivn.C3DEngine.b.f.j jVar = jVarArr[i];
            jVar.alpha(0.0f);
            jVar.position().y = f - com.censivn.C3DEngine.b.b.a.a(150.0f);
            x xVar = new x();
            xVar.h(f);
            xVar.a(com.censivn.C3DEngine.b.g.a.e);
            xVar.a(255);
            xVar.b(i * 80);
            w.a(jVar);
            w.a(jVar, 600, xVar);
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

    @Override // com.censivn.C3DEngine.b.f.j
    public void transferCanvas(float f, float f2, float f3, float f4) {
    }
}
