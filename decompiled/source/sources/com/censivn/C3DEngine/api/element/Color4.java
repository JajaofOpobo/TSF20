package com.censivn.C3DEngine.api.element;

import android.graphics.Color;
/* loaded from: classes.dex */
public class Color4 {
    public short a;
    public short b;
    public int color;
    public short g;
    public float glA;
    public float glB;
    public float glG;
    public float glR;
    public short r;

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
        this.a = s;
        this.r = s2;
        this.g = s3;
        this.b = s4;
        this.glA = s / 255.0f;
        this.glR = s2 / 255.0f;
        this.glG = s3 / 255.0f;
        this.glB = s4 / 255.0f;
        this.color = Color.argb((int) s, (int) s2, (int) s3, (int) s4);
    }

    public void reset() {
        this.r = (short) 255;
        this.g = (short) 255;
        this.b = (short) 255;
        this.a = (short) 255;
        this.glB = 1.0f;
        this.glG = 1.0f;
        this.glR = 1.0f;
        this.glA = 1.0f;
        this.color = Color.argb((int) this.a, (int) this.r, (int) this.g, (int) this.b);
    }

    /* renamed from: clone */
    public Color4 m1clone() {
        return new Color4((int) this.r, (int) this.g, (int) this.b, (int) this.a);
    }
}
