package com.tsf.shell.workspace3D.k.c.b;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class an extends com.censivn.C3DEngine.e.b {
    private static TextureElement F;
    private int C;
    private int D;
    private boolean E;
    private com.censivn.C3DEngine.e.b G;
    private FloatBuffer a;

    public an(boolean z, SystemFolderTheme systemFolderTheme) {
        super(500.0f, 11.0f, 3, 1, false);
        this.E = false;
        a(1.0f, 3.0f, 1.0f);
        if (F == null) {
            F = com.censivn.C3DEngine.a.f().a(systemFolderTheme.getScrollingPointBitmap(), false);
        }
        this.G = new com.censivn.C3DEngine.e.b(F.width * com.censivn.C3DEngine.a.b, F.height * com.censivn.C3DEngine.a.b, (byte) 0);
        this.G.z().c(F);
        d(this.G);
        if (z) {
            this.G.M().z = 180.0f;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(128);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.a = allocateDirect.asFloatBuffer();
        this.C = c("#99FFFFFF");
        this.D = c("#22FFFFFF");
        l();
    }

    private static int c(String str) {
        if (str == null || str.equals("")) {
            return -1;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            return -1;
        }
    }

    public final void h(boolean z) {
        this.E = z;
    }

    public final boolean k() {
        return this.E;
    }

    private void l() {
        int i = 0;
        this.a.position(0);
        int i2 = this.E ? this.C : this.D;
        float alpha = Color.alpha(i2) / 255.0f;
        while (true) {
            int i3 = i;
            if (i3 < 8) {
                float I = (((i3 == 0 || i3 == 3 || i3 == 4 || i3 == 7) ? 0.0f : alpha) * I()) / 255.0f;
                this.a.put((Color.red(i2) / 255.0f) * I);
                this.a.put((Color.green(i2) / 255.0f) * I);
                this.a.put((Color.blue(i2) / 255.0f) * I);
                this.a.put(I * (Color.alpha(i2) / 255.0f));
                i = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void e() {
        ShaderManager.enableShader(ShaderManager.SHADER_COLOR);
        l();
        this.a.position(0);
        ShaderManager.SHADER_COLOR.glColorPointer(4, 5126, false, 0, this.a);
        g();
        h();
        GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maColor4Handle);
    }
}
