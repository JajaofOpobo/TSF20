package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p118e.C2636k;
/* loaded from: classes.dex */
public class ThemeMenuMixElementPlane extends C0980j {
    public static final int WIDTH = 300;
    private C2636k mNotifPoint;
    public C0984m mSummaryView;
    public C0984m mTitleView;
    private TextureElement previewTE = new TextureElement(0, false);
    public C0981k mPreviewView = new C0981k(C0892a.m10742a(180.0f), C0892a.m10742a(180.0f), false);

    public ThemeMenuMixElementPlane() {
        this.mPreviewView.textures().addElement(this.previewTE);
        this.mPreviewView.position().f2527y = C0892a.m10742a(100.0f);
        this.mTitleView = new C0984m();
        this.mTitleView.m10347d(40);
        this.mTitleView.position().f2527y = -C0892a.m10742a(50.0f);
        C3567c.m1967a(this.mTitleView, C3567c.f11849h);
        this.mSummaryView = new C0984m();
        this.mSummaryView.m10347d(32);
        this.mSummaryView.m10343g(300);
        this.mSummaryView.position().f2527y = -C0892a.m10742a(100.0f);
        C3567c.m1967a(this.mSummaryView, C3567c.f11850i);
        addChild(this.mPreviewView);
        addChild(this.mTitleView);
        addChild(this.mSummaryView);
        setAABBPX(C0892a.m10742a(300.0f), C0892a.m10742a(300.0f));
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                ThemeMenuMixElementPlane.this.onClick();
            }
        });
    }

    public TextureElement getTexture() {
        return this.previewTE;
    }

    public void onClick() {
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.previewTE.f2529id == 0) {
            Bitmap previewBitmap = getPreviewBitmap();
            if (previewBitmap == null) {
                previewBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            C0853a.m10853g().m10540a(this.previewTE, previewBitmap);
            previewBitmap.recycle();
            this.mTitleView.m10355a(getTitle());
            this.mSummaryView.m10355a(getSummary());
        }
        super.onDrawStart();
    }

    public void enableNotifPoint() {
        if (this.mNotifPoint == null) {
            this.mNotifPoint = new C2636k();
            this.mNotifPoint.position().f2526x = C0892a.m10742a(100.0f);
            this.mNotifPoint.position().f2527y = C0892a.m10742a(200.0f);
        }
        addChild(this.mNotifPoint);
    }

    public void disableNotifPoint() {
        this.mNotifPoint.m5101a();
        this.mNotifPoint.removeFromParent();
    }

    public void update() {
        if (this.previewTE.f2529id != 0) {
            C0853a.m10853g().m10543a(this.previewTE);
        }
    }

    public void recycle() {
        if (this.previewTE.f2529id != 0) {
            C0853a.m10853g().m10543a(this.previewTE);
        }
        this.mTitleView.m10358a();
        this.mSummaryView.m10358a();
    }

    public void initTexture() {
    }

    public Bitmap getPreviewBitmap() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public String getSummary() {
        return null;
    }
}
