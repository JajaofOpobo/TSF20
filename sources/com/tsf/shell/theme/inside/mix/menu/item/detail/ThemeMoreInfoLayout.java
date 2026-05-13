package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.utils.C4164a;
import com.tsf.shell.utils.C4175k;
/* loaded from: classes.dex */
public class ThemeMoreInfoLayout extends C0980j {
    private C0984m mAuthorView;
    private C0984m mCheckUpdate;
    private AbstractC3208b mIcon = new C3224h(C3566b.f11841c);
    private C0984m mLinkView;
    private ThemeListsManager.ThemeInfo mThemeInfo;
    private C0984m mTitleView;
    private C0984m mUninstall;

    public ThemeMoreInfoLayout() {
        this.mIcon.m3154aL();
        this.mTitleView = new C0984m();
        this.mTitleView.m10347d(45);
        this.mTitleView.m10343g(700);
        this.mAuthorView = new C0984m();
        this.mAuthorView.m10347d(45);
        this.mAuthorView.m10343g(700);
        this.mLinkView = new C0984m();
        this.mLinkView.m10345e(-16728065);
        this.mLinkView.m10347d(40);
        this.mLinkView.m10343g(700);
        this.mLinkView.setMouseEventListener(new C0937a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                String m10350c;
                if (ThemeMoreInfoLayout.this.mThemeInfo != null && (m10350c = ThemeMoreInfoLayout.this.mLinkView.m10350c()) != null && !m10350c.equals("")) {
                    C4175k.m670b(Home.m6177b(), ThemeMoreInfoLayout.this.mLinkView.m10350c());
                }
            }
        });
        this.mCheckUpdate = new C0984m();
        this.mCheckUpdate.m10347d(45);
        this.mCheckUpdate.m10349c(C1306b.C1315i.text_check_for_update);
        this.mCheckUpdate.setMouseEventListener(new C0937a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.2
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (ThemeMoreInfoLayout.this.mThemeInfo != null) {
                    C4175k.m671a(Home.m6177b(), ThemeMoreInfoLayout.this.mThemeInfo.packagename);
                }
            }
        });
        this.mUninstall = new C0984m();
        this.mUninstall.m10347d(45);
        this.mUninstall.m10349c(C1306b.C1315i.text_uninstall);
        this.mUninstall.setMouseEventListener(new C0937a(this.mUninstall) { // from class: com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeMoreInfoLayout.3
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (ThemeMoreInfoLayout.this.mThemeInfo != null) {
                    C4164a.m709a(ThemeMoreInfoLayout.this.mThemeInfo.packagename);
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
        this.mTitleView.m10355a(themeInfo.name);
        this.mAuthorView.m10355a(C3897k.m1223d(themeInfo.context));
        this.mLinkView.m10355a(C3897k.m1221e(themeInfo.context));
        this.mIcon.f10495k.textures().clear();
        if (themeInfo.getIconTexture() != null) {
            this.mIcon.f10495k.textures().addElement(themeInfo.getIconTexture());
        }
    }

    public void show() {
        float[] fArr;
        if (this.mThemeInfo.packagename.equals(C0853a.m10858b())) {
            this.mUninstall.visible(false);
            fArr = new float[]{C0892a.m10742a(170.0f), C0892a.m10742a(70.0f), C0892a.m10742a(-10.0f), C0892a.m10742a(-70.0f), C0892a.m10742a(-250.0f), C0892a.m10742a(-250.0f)};
        } else {
            this.mUninstall.visible(true);
            fArr = new float[]{C0892a.m10742a(170.0f), C0892a.m10742a(70.0f), C0892a.m10742a(-10.0f), C0892a.m10742a(-70.0f), C0892a.m10742a(-200.0f), C0892a.m10742a(-300.0f)};
        }
        C0975i[] c0975iArr = {this.mIcon, this.mTitleView, this.mAuthorView, this.mLinkView, this.mCheckUpdate, this.mUninstall};
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            C0975i c0975i = c0975iArr[i];
            c0975i.alpha(0.0f);
            c0975i.position().f2527y = f - C0892a.m10742a(150.0f);
            C1017d c1017d = new C1017d();
            c1017d.mo10298h(f);
            c1017d.m10313a(C0986a.f2950e);
            c1017d.m10314a(255);
            c1017d.m10309b(i * 80);
            C1014c.m10326a(c0975i);
            C1014c.m10325a(c0975i, 600, c1017d);
        }
    }

    public void hide() {
    }

    public void recycle() {
        this.mThemeInfo = null;
        this.mIcon.f10495k.textures().clear();
        this.mTitleView.m10358a();
        this.mAuthorView.m10358a();
        this.mLinkView.m10358a();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void transferCanvas(float f, float f2, float f3, float f4) {
    }
}
