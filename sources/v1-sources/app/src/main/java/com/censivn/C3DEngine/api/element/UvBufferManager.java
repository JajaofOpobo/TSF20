package com.censivn.C3DEngine.api.element;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class UvBufferManager {
    public static final int BYTES_PER_PROPERTY = 4;
    public static final int PROPERTIES_PER_ELEMENT = 2;
    private FloatBuffer _b;
    private int _numElements;

    public UvBufferManager() {
        this._numElements = 0;
    }

    public UvBufferManager(FloatBuffer floatBuffer, int i) {
        this._numElements = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(floatBuffer.limit() * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this._b = allocateDirect.asFloatBuffer();
        this._b.put(floatBuffer);
        this._numElements = i;
    }

    public UvBufferManager(int i) {
        this._numElements = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 2 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this._b = allocateDirect.asFloatBuffer();
    }

    public int size() {
        return this._numElements;
    }

    public int capacity() {
        return this._b.capacity() / 2;
    }

    public void clear() {
        this._b.clear();
    }

    public void add(Uv uv) {
        set(this._numElements, uv);
        this._numElements++;
    }

    public void add(float f, float f2) {
        set(this._numElements, f, f2);
        this._numElements++;
    }

    public void set(int i, Uv uv) {
        this._b.position(i * 2);
        this._b.put(uv.u);
        this._b.put(uv.v);
    }

    public void set(int i, float f, float f2) {
        this._b.position(i * 2);
        this._b.put(f);
        this._b.put(f2);
    }

    public void setU(int i, float f) {
        this._b.position(i * 2);
        this._b.put(f);
    }

    public void setV(int i, float f) {
        this._b.position((i * 2) + 1);
        this._b.put(f);
    }

    public float getU(int i) {
        this._b.position(i * 2);
        return this._b.get();
    }

    public float getV(int i) {
        this._b.position((i * 2) + 1);
        return this._b.get();
    }

    public FloatBuffer buffer() {
        return this._b;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UvBufferManager m5clone() {
        this._b.position(0);
        return new UvBufferManager(this._b, size());
    }
}
