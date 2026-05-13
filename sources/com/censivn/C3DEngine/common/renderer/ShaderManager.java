package com.censivn.C3DEngine.common.renderer;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.shader.Shader;
import com.censivn.C3DEngine.common.shader.ShaderAlpha;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import com.censivn.C3DEngine.common.shader.ShaderColorMatrixTexture;
import com.censivn.C3DEngine.common.shader.ShaderColorTexture;
import com.censivn.C3DEngine.common.shader.ShaderFillColorTexture;
import com.censivn.C3DEngine.common.shader.ShaderStandard;
import com.censivn.C3DEngine.common.shader.ShaderTextureMatrix;
/* loaded from: classes.dex */
public class ShaderManager {
    public static Shader CURRENT_SHADER;
    public static ShaderAlpha SHADER_ALPHA;
    public static ShaderColor SHADER_COLOR;
    public static ShaderColorMatrixTexture SHADER_COLOR_MATRIX_TEXTURE;
    public static ShaderColorTexture SHADER_COLOR_TEXTURE;
    public static ShaderFillColorTexture SHADER_FILL_COLOR_TEXTURE;
    public static boolean SHADER_LOCK = false;
    public static ShaderStandard SHADER_STANDARD;
    public static ShaderTextureMatrix SHADER_TEXTURE_MATRIX;

    public static void init() {
        SHADER_STANDARD = new ShaderStandard();
        SHADER_ALPHA = new ShaderAlpha();
        SHADER_COLOR_TEXTURE = new ShaderColorTexture();
        SHADER_COLOR = new ShaderColor();
        SHADER_TEXTURE_MATRIX = new ShaderTextureMatrix();
        SHADER_COLOR_MATRIX_TEXTURE = new ShaderColorMatrixTexture();
        SHADER_FILL_COLOR_TEXTURE = new ShaderFillColorTexture();
        CURRENT_SHADER = SHADER_STANDARD;
        GLES20.glUseProgram(SHADER_STANDARD.f3427id);
    }

    public static void enableShader(Shader shader) {
        if (CURRENT_SHADER.f3427id != shader.f3427id) {
            CURRENT_SHADER = shader;
        }
        GLES20.glUseProgram(shader.f3427id);
    }

    public static void lockShader() {
        SHADER_LOCK = true;
    }

    public static void unlockShader() {
        SHADER_LOCK = false;
    }
}
