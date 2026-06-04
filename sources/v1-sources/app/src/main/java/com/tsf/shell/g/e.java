package com.tsf.shell.g;

/* loaded from: classes.dex */
public final class e {
    public static String a() {
        String str = "";
        for (StackTraceElement stackTraceElement : new Error("TextureManager deleteTexture null").getStackTrace()) {
            str = String.valueOf(str) + stackTraceElement.toString() + "  '\\'";
        }
        return str;
    }
}
