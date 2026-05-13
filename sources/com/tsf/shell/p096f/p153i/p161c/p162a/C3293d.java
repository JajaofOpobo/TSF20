package com.tsf.shell.p096f.p153i.p161c.p162a;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.i.c.a.d */
/* loaded from: classes.dex */
public class C3293d extends AbstractC3322j {

    /* renamed from: a */
    private ArrayList<VRectangle> f10875a;

    /* renamed from: b */
    private VObject3dContainer f10876b;

    /* renamed from: c */
    private float f10877c;

    /* renamed from: d */
    private TextureElement[] f10878d;

    public C3293d(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.f10875a = new ArrayList<>();
        this.f10877c = 180.0f;
        this.f10878d = new TextureElement[8];
        m2910h();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        this.f10877c -= 0.5f;
        this.f10877c = this.f10877c < -180.0f ? this.f10877c + 360.0f : this.f10877c;
        this.f10876b.rotation().f2527y = this.f10877c;
        m2911e();
    }

    /* renamed from: e */
    private void m2911e() {
        Collections.sort(this.f10875a, new Comparator<VRectangle>() { // from class: com.tsf.shell.f.i.c.a.d.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(VRectangle vRectangle, VRectangle vRectangle2) {
                return (int) (C3293d.this.m2913a(vRectangle2.rotation().f2527y) - C3293d.this.m2913a(vRectangle.rotation().f2527y));
            }
        });
        Iterator<VRectangle> it = this.f10875a.iterator();
        while (it.hasNext()) {
            it.next().setZOrderOnTop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public float m2913a(float f) {
        float f2 = this.f10877c + f;
        if (f2 > 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return Math.abs(f2);
    }

    /* renamed from: h */
    private void m2910h() {
        this.f10876b = new VObject3dContainer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 8) {
                VRectangle vRectangle = new VRectangle(128.0f, 72.0f);
                vRectangle.doubleSidedEnabled(true);
                vRectangle.moveAllPointsSP(0.0f, 0.0f, 160.0f);
                float f = i2 * (-45);
                Number3d rotation = vRectangle.rotation();
                if (f < -180.0f) {
                    f += 360.0f;
                }
                rotation.f2527y = f;
                this.f10875a.add(vRectangle);
                this.f10876b.addChild(vRectangle);
                i = i2 + 1;
            } else {
                this.f10876b.rotation().f2526x = 14.0f;
                addChild(this.f10876b);
                return;
            }
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j
    /* renamed from: a */
    public void mo2855a() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_gallery_item0, this.f10875a.get(0));
            mo2854a(C1306b.C1310d.widget_preview_gallery_item1, this.f10875a.get(1));
            mo2854a(C1306b.C1310d.widget_preview_gallery_item2, this.f10875a.get(2));
            mo2854a(C1306b.C1310d.widget_preview_gallery_item3, this.f10875a.get(3));
            mo2854a(C1306b.C1310d.widget_preview_gallery_item4, this.f10875a.get(4));
            mo2854a(C1306b.C1310d.widget_preview_gallery_item5, this.f10875a.get(5));
            mo2854a(C1306b.C1310d.widget_preview_gallery_item6, this.f10875a.get(6));
            mo2854a(C1306b.C1310d.widget_preview_gallery_item7, this.f10875a.get(7));
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_gallery_item0) {
            this.f10878d[0] = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_gallery_item1) {
            this.f10878d[1] = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_gallery_item2) {
            this.f10878d[2] = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_gallery_item3) {
            this.f10878d[3] = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_gallery_item4) {
            this.f10878d[4] = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_gallery_item5) {
            this.f10878d[5] = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_gallery_item6) {
            this.f10878d[6] = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_gallery_item7) {
            this.f10878d[7] = textureElement;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.c.a.d$a */
    /* loaded from: classes.dex */
    public class C3295a extends AbstractC3322j.C3323a {
        public C3295a(InterfaceC3321i interfaceC3321i, int i, VObject3d... vObject3dArr) {
            super(interfaceC3321i, i, vObject3dArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j.C3323a, com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: a */
        public Bitmap mo2846a(Void... voidArr) {
            return C3325l.m2837b(C3325l.m2840a(C3293d.this.f10960i, this.f10964d));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j
    /* renamed from: a */
    public void mo2854a(int i, VObject3d... vObject3dArr) {
        this.f10962k.add(new C3295a(this, i, vObject3dArr));
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        int i = 0;
        if (this.f10963l) {
            this.f10963l = false;
            while (true) {
                int i2 = i;
                if (i2 < 8) {
                    this.f10875a.get(i2).textures().removeAll();
                    this.f10961j.deleteTexture(this.f10878d[i2]);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }
}
