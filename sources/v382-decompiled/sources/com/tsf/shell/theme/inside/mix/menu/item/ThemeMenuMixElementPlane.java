package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;
import com.tsf.shell.e.e.n;
import com.tsf.shell.manager.o.c;

/* loaded from: classes.dex */
public class ThemeMenuMixElementPlane extends l {
    public static final int WIDTH = 300;
    private n mNotifPoint;
    public o mSummaryView;
    public o mTitleView;
    private TextureElement previewTE = new TextureElement(0, false);
    public m mPreviewView = new m(com.censivn.C3DEngine.b.b.a.a(180.0f), com.censivn.C3DEngine.b.b.a.a(180.0f), false);

    public ThemeMenuMixElementPlane() {
        this.mPreviewView.textures().addElement(this.previewTE);
        this.mPreviewView.position().y = com.censivn.C3DEngine.b.b.a.a(100.0f);
        this.mTitleView = new o();
        this.mTitleView.d(40);
        this.mTitleView.position().y = -com.censivn.C3DEngine.b.b.a.a(50.0f);
        c.a(this.mTitleView, c.h);
        this.mSummaryView = new o();
        this.mSummaryView.d(32);
        this.mSummaryView.g(300);
        this.mSummaryView.position().y = -com.censivn.C3DEngine.b.b.a.a(100.0f);
        c.a(this.mSummaryView, c.i);
        addChild(this.mPreviewView);
        addChild(this.mTitleView);
        addChild(this.mSummaryView);
        setAABBPX(com.censivn.C3DEngine.b.b.a.a(300.0f), com.censivn.C3DEngine.b.b.a.a(300.0f));
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                ThemeMenuMixElementPlane.this.onClick();
            }
        });
    }

    public TextureElement getTexture() {
        return this.previewTE;
    }

    public void onClick() {
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.previewTE.id == 0) {
            Bitmap previewBitmap = getPreviewBitmap();
            if (previewBitmap == null) {
                previewBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            com.censivn.C3DEngine.a.g().a(this.previewTE, previewBitmap);
            previewBitmap.recycle();
            this.mTitleView.a(getTitle());
            this.mSummaryView.a(getSummary());
        }
        super.onDrawStart();
    }

    public void enableNotifPoint() {
        if (this.mNotifPoint == null) {
            this.mNotifPoint = new n();
            this.mNotifPoint.position().x = com.censivn.C3DEngine.b.b.a.a(100.0f);
            this.mNotifPoint.position().y = com.censivn.C3DEngine.b.b.a.a(200.0f);
        }
        addChild(this.mNotifPoint);
    }

    public void disableNotifPoint() {
        this.mNotifPoint.a();
        this.mNotifPoint.removeFromParent();
    }

    public void update() {
        if (this.previewTE.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.previewTE);
        }
    }

    public void recycle() {
        if (this.previewTE.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.previewTE);
        }
        this.mTitleView.a();
        this.mSummaryView.a();
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
