package com.censivn.C3DEngine.api.element;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(floatBuffer.limit() * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.mBuffer.put(floatBuffer);
        this.mNumElements = i;
    }

    public UvBufferManager(int i) {
        this.mNumElements = 0;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * 2 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = byteBufferAllocateDirect.asFloatBuffer();
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

    public void add(Uv uv) {
        set(this.mNumElements, uv);
        this.mNumElements++;
    }

    public void add(float f, float f2) {
        set(this.mNumElements, f, f2);
        this.mNumElements++;
    }

    public void set(int i, Uv uv) {
        this.mBuffer.position(i * 2);
        this.mBuffer.put(uv.u);
        this.mBuffer.put(uv.v);
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

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UvBufferManager m7clone() {
        this.mBuffer.position(0);
        return new UvBufferManager(this.mBuffer, size());
    }
}
