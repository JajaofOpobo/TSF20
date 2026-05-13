package com.tsf.shell.utils;

import android.opengl.GLES20;
import android.util.Log;
/* renamed from: com.tsf.shell.utils.s */
/* loaded from: classes.dex */
public class C4183s {
    /* renamed from: a */
    public static int m629a(String str, String str2) {
        int m630a;
        int m630a2 = m630a(35633, str);
        if (m630a2 == 0 || (m630a = m630a(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, m630a2);
            C4189x.m597a("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, m630a);
            C4189x.m597a("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e("Censivn3D", "Could not link program: ");
                Log.e("Censivn3D", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                return 0;
            }
        }
        return glCreateProgram;
    }

    /* renamed from: a */
    private static int m630a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                Log.e("Censivn3D", "Could not compile shader " + i + ":");
                Log.e("Censivn3D", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
        }
        return glCreateShader;
    }
}
