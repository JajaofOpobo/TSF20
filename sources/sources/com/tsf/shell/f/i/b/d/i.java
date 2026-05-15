package com.tsf.shell.f.i.b.d;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i extends com.censivn.C3DEngine.b.f.k {
    private static TextureElement g;
    private FloatBuffer a;
    private int d;
    private int e;
    private boolean f;
    private com.censivn.C3DEngine.b.f.k h;

    public i(float f, float f2, boolean z, ThemeDescription themeDescription) throws Throwable {
        super(f, f2, 3, 1, false);
        this.f = false;
        if (g == null) {
            g = com.censivn.C3DEngine.a.g().a(themeDescription.getBitmap(ThemeFolderDescription.SCROLLING_POINT), false);
        }
        this.h = new com.censivn.C3DEngine.b.f.k(19.0f * com.censivn.C3DEngine.b.b.a.b, 10.0f * com.censivn.C3DEngine.b.b.a.b, false);
        this.h.textures().addElement(g);
        addChild(this.h);
        if (z) {
            this.h.rotation().z = 180.0f;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(ItemInfo.APP_INTENT);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.a = byteBufferAllocateDirect.asFloatBuffer();
        this.d = a("#77FFFFFF", -1);
        this.e = a("#22FFFFFF", -1);
        e();
        a();
    }

    public void a() {
        calAABB(1.0f, 4.0f, 1.0f);
    }

    public static int a(String str, int i) {
        if (str != null && !str.equals("")) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                return i;
            }
        }
        return i;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean d() {
        return this.f;
    }

    private void e() {
        int i = 0;
        this.a.position(0);
        int i2 = this.f ? this.d : this.e;
        float fAlpha = Color.alpha(i2) / 255.0f;
        while (true) {
            int i3 = i;
            if (i3 < 8) {
                float fAlpha2 = (((i3 == 0 || i3 == 3 || i3 == 4 || i3 == 7) ? 0.0f : fAlpha) * alpha()) / 255.0f;
                this.a.put((Color.red(i2) / 255.0f) * fAlpha2);
                this.a.put((Color.green(i2) / 255.0f) * fAlpha2);
                this.a.put((Color.blue(i2) / 255.0f) * fAlpha2);
                this.a.put(fAlpha2);
                i = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.k, com.censivn.C3DEngine.b.f.i
    public void draw() {
        ShaderManager.enableShader(ShaderManager.SHADER_COLOR);
        f();
        drawMVPMatrix();
        drawElement();
        GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maColor4Handle);
    }

    private void f() {
        e();
        this.a.position(0);
        ShaderManager.SHADER_COLOR.glColorPointer(4, 5126, false, 0, this.a);
    }
}
