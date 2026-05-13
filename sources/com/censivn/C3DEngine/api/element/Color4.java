package com.censivn.C3DEngine.api.element;

import android.graphics.Color;
/* loaded from: classes.dex */
public class Color4 {

    /* renamed from: a */
    public short f2522a;

    /* renamed from: b */
    public short f2523b;
    public int color;

    /* renamed from: g */
    public short f2524g;
    public float glA;
    public float glB;
    public float glG;
    public float glR;

    /* renamed from: r */
    public short f2525r;

    public Color4() {
        reset();
    }

    public Color4(int i) {
        set(i);
    }

    public Color4(int i, int i2, int i3, int i4) {
        set((short) i4, (short) i, (short) i2, (short) i3);
    }

    public Color4(float f, float f2, float f3, float f4) {
        set((short) f4, (short) f, (short) f2, (short) f3);
    }

    public void set(int i) {
        set(Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i));
    }

    public void set(int i, int i2, int i3, int i4) {
        set((short) i, (short) i2, (short) i3, (short) i4);
    }

    public void set(short s, short s2, short s3, short s4) {
        this.f2522a = s;
        this.f2525r = s2;
        this.f2524g = s3;
        this.f2523b = s4;
        this.glA = s / 255.0f;
        this.glR = s2 / 255.0f;
        this.glG = s3 / 255.0f;
        this.glB = s4 / 255.0f;
        this.color = Color.argb((int) s, (int) s2, (int) s3, (int) s4);
    }

    public void reset() {
        this.f2525r = (short) 255;
        this.f2524g = (short) 255;
        this.f2523b = (short) 255;
        this.f2522a = (short) 255;
        this.glB = 1.0f;
        this.glG = 1.0f;
        this.glR = 1.0f;
        this.glA = 1.0f;
        this.color = Color.argb((int) this.f2522a, (int) this.f2525r, (int) this.f2524g, (int) this.f2523b);
    }

    /* renamed from: clone */
    public Color4 m13943clone() {
        return new Color4((int) this.f2525r, (int) this.f2524g, (int) this.f2523b, (int) this.f2522a);
    }
}
