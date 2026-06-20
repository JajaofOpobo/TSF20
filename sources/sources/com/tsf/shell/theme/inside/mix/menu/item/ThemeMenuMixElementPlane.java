package com.tsf.shell.theme.inside.mix.menu.item;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.b.A;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.f.e.CircleDotNode;
import com.tsf.shell.manager.o.ThemeColorConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeMenuMixElementPlane extends j {
    public static final int WIDTH = 300;
    private CircleDotNode mNotifPoint;
    public m mSummaryView;
    public m mTitleView;
    private TextureElement previewTE = new TextureElement(0, false);
    public com.censivn.C3DEngine.b.f.k mPreviewView = new com.censivn.C3DEngine.b.f.k(A.a(180.0f), A.a(180.0f), false);

    public ThemeMenuMixElementPlane() {
        this.mPreviewView.textures().addElement(this.previewTE);
        this.mPreviewView.position().y = A.a(100.0f);
        this.mTitleView = new m();
        this.mTitleView.d(40);
        this.mTitleView.position().y = -A.a(50.0f);
        ThemeColorConstants.a(this.mTitleView, ThemeColorConstants.h);
        this.mSummaryView = new m();
        this.mSummaryView.d(32);
        this.mSummaryView.g(300);
        this.mSummaryView.position().y = -A.a(100.0f);
        ThemeColorConstants.a(this.mSummaryView, ThemeColorConstants.i);
        addChild(this.mPreviewView);
        addChild(this.mTitleView);
        addChild(this.mSummaryView);
        setAABBPX(A.a(300.0f), A.a(300.0f));
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

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.previewTE.id == 0) {
            Bitmap previewBitmap = getPreviewBitmap();
            if (previewBitmap == null) {
                previewBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            com.censivn.C3DEngine.C3DEngine.g().a(this.previewTE, previewBitmap);
            previewBitmap.recycle();
            this.mTitleView.a(getTitle());
            this.mSummaryView.a(getSummary());
        }
        super.onDrawStart();
    }

    public void enableNotifPoint() {
        if (this.mNotifPoint == null) {
            this.mNotifPoint = new CircleDotNode();
            this.mNotifPoint.position().x = A.a(100.0f);
            this.mNotifPoint.position().y = A.a(200.0f);
        }
        addChild(this.mNotifPoint);
    }

    public void disableNotifPoint() {
        this.mNotifPoint.a();
        this.mNotifPoint.removeFromParent();
    }

    public void update() {
        if (this.previewTE.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.previewTE);
        }
    }

    public void recycle() {
        if (this.previewTE.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.previewTE);
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
