package com.tsf.shell.e.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends o {
    private ArrayList a;
    private VObject3dContainer b;
    private float c;
    private TextureElement[] d;

    public h(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.a = new ArrayList();
        this.c = 180.0f;
        this.d = new TextureElement[8];
        h();
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        this.c -= 0.5f;
        this.c = this.c < -180.0f ? this.c + 360.0f : this.c;
        this.b.rotation().y = this.c;
        e();
    }

    private void e() {
        Collections.sort(this.a, new Comparator() { // from class: com.tsf.shell.e.i.c.a.h.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(VRectangle vRectangle, VRectangle vRectangle2) {
                return (int) (h.this.a(vRectangle2.rotation().y) - h.this.a(vRectangle.rotation().y));
            }
        });
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((VRectangle) it.next()).setZOrderOnTop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f) {
        float f2 = this.c + f;
        if (f2 > 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return Math.abs(f2);
    }

    private void h() {
        this.b = new VObject3dContainer();
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
                rotation.y = f;
                this.a.add(vRectangle);
                this.b.addChild(vRectangle);
                i = i2 + 1;
            } else {
                this.b.rotation().x = 14.0f;
                addChild(this.b);
                return;
            }
        }
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void b() {
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void c() {
    }

    @Override // com.tsf.shell.e.i.c.a.o
    public void a() {
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(R.drawable.widget_preview_gallery_item0, (VObject3d) this.a.get(0));
            a(R.drawable.widget_preview_gallery_item1, (VObject3d) this.a.get(1));
            a(R.drawable.widget_preview_gallery_item2, (VObject3d) this.a.get(2));
            a(R.drawable.widget_preview_gallery_item3, (VObject3d) this.a.get(3));
            a(R.drawable.widget_preview_gallery_item4, (VObject3d) this.a.get(4));
            a(R.drawable.widget_preview_gallery_item5, (VObject3d) this.a.get(5));
            a(R.drawable.widget_preview_gallery_item6, (VObject3d) this.a.get(6));
            a(R.drawable.widget_preview_gallery_item7, (VObject3d) this.a.get(7));
            c(z);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.n
    public void a(int i, TextureElement textureElement) {
        if (i == R.drawable.widget_preview_gallery_item0) {
            this.d[0] = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_gallery_item1) {
            this.d[1] = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_gallery_item2) {
            this.d[2] = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_gallery_item3) {
            this.d[3] = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_gallery_item4) {
            this.d[4] = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_gallery_item5) {
            this.d[5] = textureElement;
        } else if (i == R.drawable.widget_preview_gallery_item6) {
            this.d[6] = textureElement;
        } else if (i == R.drawable.widget_preview_gallery_item7) {
            this.d[7] = textureElement;
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o
    protected void a(int i, VObject3d... vObject3dArr) {
        this.k.add(new i(this, this, i, vObject3dArr));
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.q
    public void d() {
        int i = 0;
        if (this.l) {
            this.l = false;
            while (true) {
                int i2 = i;
                if (i2 < 8) {
                    ((VRectangle) this.a.get(i2)).textures().removeAll();
                    this.j.deleteTexture(this.d[i2]);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }
}
