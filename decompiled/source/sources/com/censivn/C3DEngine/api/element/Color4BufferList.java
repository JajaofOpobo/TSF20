package com.censivn.C3DEngine.api.element;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class Color4BufferList {
    public static final int BYTES_PER_PROPERTY = 4;
    public static final int PROPERTIES_PER_ELEMENT = 4;
    private FloatBuffer mBuffer;
    private int mNumElements;

    public Color4BufferList(FloatBuffer floatBuffer, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(floatBuffer.limit() * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = allocateDirect.asFloatBuffer();
        this.mBuffer.put(floatBuffer);
        this.mNumElements = i;
    }

    public Color4BufferList(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 4 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = allocateDirect.asFloatBuffer();
    }

    public int size() {
        return this.mNumElements;
    }

    public int capacity() {
        return this.mBuffer.capacity() / 4;
    }

    public void clear() {
        this.mBuffer.clear();
    }

    public Color4 getAsColor4(int i) {
        this.mBuffer.position(i * 4);
        return new Color4(this.mBuffer.get(), this.mBuffer.get(), this.mBuffer.get(), this.mBuffer.get());
    }

    public void putInColor4(int i, Color4 color4) {
        this.mBuffer.position(i * 4);
        color4.r = (short) this.mBuffer.get();
        color4.g = (short) this.mBuffer.get();
        color4.b = (short) this.mBuffer.get();
        color4.a = (short) this.mBuffer.get();
    }

    public short getPropertyR(int i) {
        this.mBuffer.position(i * 4);
        return (short) this.mBuffer.get();
    }

    public short getPropertyG(int i) {
        this.mBuffer.position((i * 4) + 1);
        return (short) this.mBuffer.get();
    }

    public float getPropertyB(int i) {
        this.mBuffer.position((i * 4) + 2);
        return (short) this.mBuffer.get();
    }

    public float getPropertyA(int i) {
        this.mBuffer.position((i * 4) + 3);
        return (short) this.mBuffer.get();
    }

    public void add(Color4 color4) {
        set(this.mNumElements, color4);
        this.mNumElements++;
    }

    public void add(float f, float f2, float f3, float f4) {
        set(this.mNumElements, f, f2, f3, f4);
        this.mNumElements++;
    }

    public void set(int i, Color4 color4) {
        this.mBuffer.position(i * 4);
        this.mBuffer.put(color4.r);
        this.mBuffer.put(color4.g);
        this.mBuffer.put(color4.b);
        this.mBuffer.put(color4.a);
    }

    public void set(int i, float f, float f2, float f3, float f4) {
        this.mBuffer.position(i * 4);
        this.mBuffer.put(f);
        this.mBuffer.put(f2);
        this.mBuffer.put(f3);
        this.mBuffer.put(f4);
    }

    public void setPropertyR(int i, float f) {
        this.mBuffer.position(i * 4);
        this.mBuffer.put(f);
    }

    public void setPropertyG(int i, float f) {
        this.mBuffer.position((i * 4) + 1);
        this.mBuffer.put(f);
    }

    public void setPropertyB(int i, float f) {
        this.mBuffer.position((i * 4) + 2);
        this.mBuffer.put(f);
    }

    public void setPropertyA(int i, float f) {
        this.mBuffer.position((i * 4) + 3);
        this.mBuffer.put(f);
    }

    public FloatBuffer buffer() {
        return this.mBuffer;
    }

    /* renamed from: clone */
    public Color4BufferList m2clone() {
        this.mBuffer.position(0);
        return new Color4BufferList(this.mBuffer, size());
    }
}
