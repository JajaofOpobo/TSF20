package com.tsf.shell.p096f.p153i.p155b.p159d;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* renamed from: com.tsf.shell.f.i.b.d.i */
/* loaded from: classes.dex */
public class C3186i extends C0981k {

    /* renamed from: g */
    private static TextureElement f10389g;

    /* renamed from: a */
    private FloatBuffer f10390a;

    /* renamed from: d */
    private int f10391d;

    /* renamed from: e */
    private int f10392e;

    /* renamed from: f */
    private boolean f10393f;

    /* renamed from: h */
    private C0981k f10394h;

    public C3186i(float f, float f2, boolean z, ThemeDescription themeDescription) {
        super(f, f2, 3, 1, false);
        this.f10393f = false;
        if (f10389g == null) {
            f10389g = C0853a.m10853g().m10544a(themeDescription.getBitmap(ThemeFolderDescription.SCROLLING_POINT), false);
        }
        this.f10394h = new C0981k(19.0f * C0892a.f2566b, 10.0f * C0892a.f2566b, false);
        this.f10394h.textures().addElement(f10389g);
        addChild(this.f10394h);
        if (z) {
            this.f10394h.rotation().f2528z = 180.0f;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(ItemInfo.APP_INTENT);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f10390a = allocateDirect.asFloatBuffer();
        this.f10391d = m3238a("#77FFFFFF", -1);
        this.f10392e = m3238a("#22FFFFFF", -1);
        m3235e();
        m3239a();
    }

    /* renamed from: a */
    public void m3239a() {
        calAABB(1.0f, 4.0f, 1.0f);
    }

    /* renamed from: a */
    public static int m3238a(String str, int i) {
        if (str != null && !str.equals("")) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                return i;
            }
        }
        return i;
    }

    /* renamed from: a */
    public void m3237a(boolean z) {
        this.f10393f = z;
    }

    /* renamed from: d */
    public boolean m3236d() {
        return this.f10393f;
    }

    /* renamed from: e */
    private void m3235e() {
        int i = 0;
        this.f10390a.position(0);
        int i2 = this.f10393f ? this.f10391d : this.f10392e;
        float alpha = Color.alpha(i2) / 255.0f;
        while (true) {
            int i3 = i;
            if (i3 < 8) {
                float alpha2 = (((i3 == 0 || i3 == 3 || i3 == 4 || i3 == 7) ? 0.0f : alpha) * alpha()) / 255.0f;
                this.f10390a.put((Color.red(i2) / 255.0f) * alpha2);
                this.f10390a.put((Color.green(i2) / 255.0f) * alpha2);
                this.f10390a.put((Color.blue(i2) / 255.0f) * alpha2);
                this.f10390a.put(alpha2);
                i = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0981k, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void draw() {
        ShaderManager.enableShader(ShaderManager.SHADER_COLOR);
        m3234f();
        drawMVPMatrix();
        drawElement();
        GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maColor4Handle);
    }

    /* renamed from: f */
    private void m3234f() {
        m3235e();
        this.f10390a.position(0);
        ShaderManager.SHADER_COLOR.glColorPointer(4, 5126, false, 0, this.f10390a);
    }
}
