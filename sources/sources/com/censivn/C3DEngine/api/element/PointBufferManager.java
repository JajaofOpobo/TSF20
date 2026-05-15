package com.censivn.C3DEngine.api.element;

import com.censivn.C3DEngine.b.b.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PointBufferManager {
    public static final int BYTES_PER_PROPERTY = 4;
    public static final int PROPERTIES_PER_ELEMENT = 3;
    private FloatBuffer mBuffer;
    private int mNumElements;

    public PointBufferManager() {
        this.mNumElements = 0;
    }

    public PointBufferManager(FloatBuffer floatBuffer, int i) {
        this.mNumElements = 0;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(floatBuffer.limit() * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.mBuffer.put(floatBuffer);
        this.mNumElements = i;
    }

    public PointBufferManager(int i) {
        this.mNumElements = 0;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * 3 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = byteBufferAllocateDirect.asFloatBuffer();
    }

    public int size() {
        return this.mNumElements;
    }

    public int capacity() {
        return this.mBuffer.capacity() / 3;
    }

    public void clear() {
        this.mBuffer.clear();
    }

    public Number3d getAsNumber3dPX(int i) {
        this.mBuffer.position(i * 3);
        return new Number3d(this.mBuffer.get(), this.mBuffer.get(), this.mBuffer.get());
    }

    public Number3d getAsNumber3dSP(int i) {
        this.mBuffer.position(i * 3);
        return new Number3d(this.mBuffer.get() / a.a, this.mBuffer.get() / a.a, this.mBuffer.get() / a.a);
    }

    public void putInNumber3d(int i, Number3d number3d) {
        this.mBuffer.position(i * 3);
        number3d.x = this.mBuffer.get();
        number3d.y = this.mBuffer.get();
        number3d.z = this.mBuffer.get();
    }

    public float pxX(int i) {
        this.mBuffer.position(i * 3);
        return this.mBuffer.get();
    }

    public float pxY(int i) {
        this.mBuffer.position((i * 3) + 1);
        return this.mBuffer.get();
    }

    public float pxZ(int i) {
        this.mBuffer.position((i * 3) + 2);
        return this.mBuffer.get();
    }

    public void pxX(int i, float f) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(f);
    }

    public void pxY(int i, float f) {
        this.mBuffer.position((i * 3) + 1);
        this.mBuffer.put(f);
    }

    public void pxZ(int i, float f) {
        this.mBuffer.position((i * 3) + 2);
        this.mBuffer.put(f);
    }

    public float spX(int i) {
        this.mBuffer.position(i * 3);
        return this.mBuffer.get() / a.a;
    }

    public float spY(int i) {
        this.mBuffer.position((i * 3) + 1);
        return this.mBuffer.get() / a.a;
    }

    public float spZ(int i) {
        this.mBuffer.position((i * 3) + 2);
        return this.mBuffer.get() / a.a;
    }

    public void spX(int i, float f) {
        pxX(i, a.a * f);
    }

    public void spY(int i, float f) {
        pxY(i, a.a * f);
    }

    public void spZ(int i, float f) {
        pxZ(i, a.a * f);
    }

    public void addPX(Number3d number3d) {
        setPX(this.mNumElements, number3d);
        this.mNumElements++;
    }

    public void addSP(Number3d number3d) {
        setSP(this.mNumElements, number3d);
        this.mNumElements++;
    }

    public void addPX(float f, float f2, float f3) {
        setPX(this.mNumElements, f, f2, f3);
        this.mNumElements++;
    }

    public void addSP(float f, float f2, float f3) {
        setSP(this.mNumElements, f, f2, f3);
        this.mNumElements++;
    }

    public void setPX(int i, Number3d number3d) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(number3d.x);
        this.mBuffer.put(number3d.y);
        this.mBuffer.put(number3d.z);
    }

    public void setSP(int i, Number3d number3d) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(number3d.x * a.a);
        this.mBuffer.put(number3d.y * a.a);
        this.mBuffer.put(number3d.z * a.a);
    }

    public void setPX(int i, float f, float f2, float f3) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(f);
        this.mBuffer.put(f2);
        this.mBuffer.put(f3);
    }

    public void setXPX(int i, float f) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(f);
    }

    public void setYPX(int i, float f) {
        this.mBuffer.position((i * 3) + 1);
        this.mBuffer.put(f);
    }

    public void setSP(int i, float f, float f2, float f3) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(a.a * f);
        this.mBuffer.put(a.a * f2);
        this.mBuffer.put(a.a * f2);
    }

    public FloatBuffer buffer() {
        return this.mBuffer;
    }

    public void overwrite(float[] fArr) {
        this.mBuffer.position(0);
        this.mBuffer.put(fArr);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PointBufferManager m5clone() {
        this.mBuffer.position(0);
        return new PointBufferManager(this.mBuffer, size());
    }
}
