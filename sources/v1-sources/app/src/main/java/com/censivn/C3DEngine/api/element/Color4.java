package com.censivn.C3DEngine.api.element;

import com.censivn.C3DEngine.h.a;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class Color4 {
    public short a;
    public short b;
    public short g;
    public short r;

    public Color4() {
        this.r = (short) 255;
        this.g = (short) 255;
        this.b = (short) 255;
        this.a = (short) 255;
    }

    public Color4(short s, short s2, short s3, short s4) {
        this.r = s;
        this.g = s2;
        this.b = s3;
        this.a = s4;
    }

    public Color4(int i, int i2, int i3, int i4) {
        this.r = (short) i;
        this.g = (short) i2;
        this.b = (short) i3;
        this.a = (short) i4;
    }

    public Color4(float f, float f2, float f3, float f4) {
        this.r = (short) f;
        this.g = (short) f2;
        this.b = (short) f3;
        this.a = (short) f4;
    }

    public void setAll(short s, short s2, short s3, short s4) {
        this.r = s;
        this.g = s2;
        this.b = s3;
        this.a = s4;
    }

    public void setAll(long j) {
        this.a = (short) ((j >> 24) & 255);
        this.r = (short) ((j >> 16) & 255);
        this.g = (short) ((j >> 8) & 255);
        this.b = (short) (j & 255);
    }

    public String toString() {
        return "r:" + ((int) this.r) + ", g:" + ((int) this.g) + ", b:" + ((int) this.b) + ", a:" + ((int) this.a);
    }

    public FloatBuffer toFloatBuffer() {
        return a.a(this.r, this.g, this.b, this.a);
    }

    public void toFloatBuffer(FloatBuffer floatBuffer) {
        floatBuffer.position(0);
        floatBuffer.put(this.r / 255.0f);
        floatBuffer.put(this.g / 255.0f);
        floatBuffer.put(this.b / 255.0f);
        floatBuffer.put(this.a / 255.0f);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Color4 m1clone() {
        return new Color4(this.r, this.g, this.b, this.a);
    }
}
