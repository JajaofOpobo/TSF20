package com.censivn.C3DEngine.api.element;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class UvBufferManager {
    public static final int BYTES_PER_PROPERTY = 4;
    public static final int PROPERTIES_PER_ELEMENT = 2;
    private FloatBuffer mBuffer;
    private int mNumElements;

    public UvBufferManager() {
        this.mNumElements = 0;
    }

    public UvBufferManager(FloatBuffer floatBuffer, int i) {
        this.mNumElements = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(floatBuffer.limit() * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = allocateDirect.asFloatBuffer();
        this.mBuffer.put(floatBuffer);
        this.mNumElements = i;
    }

    public UvBufferManager(int i) {
        this.mNumElements = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 2 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = allocateDirect.asFloatBuffer();
    }

    public int size() {
        return this.mNumElements;
    }

    public int capacity() {
        return this.mBuffer.capacity() / 2;
    }

    public void clear() {
        this.mBuffer.clear();
    }

    public void add(C0879Uv c0879Uv) {
        set(this.mNumElements, c0879Uv);
        this.mNumElements++;
    }

    public void add(float f, float f2) {
        set(this.mNumElements, f, f2);
        this.mNumElements++;
    }

    public void set(int i, C0879Uv c0879Uv) {
        this.mBuffer.position(i * 2);
        this.mBuffer.put(c0879Uv.f2530u);
        this.mBuffer.put(c0879Uv.f2531v);
    }

    public void set(int i, float f, float f2) {
        this.mBuffer.position(i * 2);
        this.mBuffer.put(f);
        this.mBuffer.put(f2);
    }

    public void setU(int i, float f) {
        this.mBuffer.position(i * 2);
        this.mBuffer.put(f);
    }

    public void setV(int i, float f) {
        this.mBuffer.position((i * 2) + 1);
        this.mBuffer.put(f);
    }

    public float getU(int i) {
        this.mBuffer.position(i * 2);
        return this.mBuffer.get();
    }

    public float getV(int i) {
        this.mBuffer.position((i * 2) + 1);
        return this.mBuffer.get();
    }

    public FloatBuffer buffer() {
        return this.mBuffer;
    }

    /* renamed from: clone */
    public UvBufferManager m13949clone() {
        this.mBuffer.position(0);
        return new UvBufferManager(this.mBuffer, size());
    }
}
