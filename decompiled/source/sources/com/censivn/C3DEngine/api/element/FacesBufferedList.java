package com.censivn.C3DEngine.api.element;

import com.censivn.C3DEngine.f.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public class FacesBufferedList {
    public static final int BYTES_PER_PROPERTY = 2;
    public static final int PROPERTIES_PER_ELEMENT = 3;
    private ShortBuffer mBuffer;
    private int mNumElements;
    private int mRenderSubsetStartIndex = 0;
    private int mRenderSubsetLength = 1;

    public FacesBufferedList(ShortBuffer shortBuffer, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(shortBuffer.limit() * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = allocateDirect.asShortBuffer();
        this.mBuffer.put(shortBuffer);
        this.mNumElements = i;
    }

    public FacesBufferedList(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 3 * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.mBuffer = allocateDirect.asShortBuffer();
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

    public d get(int i) {
        this.mBuffer.position(i * 3);
        return new d(this.mBuffer.get(), this.mBuffer.get(), this.mBuffer.get());
    }

    public void putInFace(int i, d dVar) {
        this.mBuffer.position(i * 3);
        dVar.a = this.mBuffer.get();
        dVar.b = this.mBuffer.get();
        dVar.c = this.mBuffer.get();
    }

    public short getPropertyA(int i) {
        this.mBuffer.position(i * 3);
        return this.mBuffer.get();
    }

    public short getPropertyB(int i) {
        this.mBuffer.position((i * 3) + 1);
        return this.mBuffer.get();
    }

    public float getPropertyC(int i) {
        this.mBuffer.position((i * 3) + 2);
        return this.mBuffer.get();
    }

    public void renderSubsetStartIndex(int i) {
        this.mRenderSubsetStartIndex = i;
    }

    public int renderSubsetStartIndex() {
        return this.mRenderSubsetStartIndex;
    }

    public void renderSubsetLength(int i) {
        this.mRenderSubsetLength = i;
    }

    public int renderSubsetLength() {
        return this.mRenderSubsetLength;
    }

    public void add(d dVar) {
        set(this.mNumElements, dVar);
        this.mNumElements++;
    }

    public void add(int i, int i2, int i3) {
        add((short) i, (short) i2, (short) i3);
    }

    public void add(short s, short s2, short s3) {
        set(this.mNumElements, s, s2, s3);
        this.mNumElements++;
    }

    public void set(int i, d dVar) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(dVar.a);
        this.mBuffer.put(dVar.b);
        this.mBuffer.put(dVar.c);
    }

    public void set(int i, short s, short s2, short s3) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(s);
        this.mBuffer.put(s2);
        this.mBuffer.put(s3);
    }

    public void setPropertyA(int i, short s) {
        this.mBuffer.position(i * 3);
        this.mBuffer.put(s);
    }

    public void setPropertyB(int i, short s) {
        this.mBuffer.position((i * 3) + 1);
        this.mBuffer.put(s);
    }

    public void setPropertyC(int i, short s) {
        this.mBuffer.position((i * 3) + 2);
        this.mBuffer.put(s);
    }

    public ShortBuffer buffer() {
        return this.mBuffer;
    }

    /* renamed from: clone */
    public FacesBufferedList m3clone() {
        this.mBuffer.position(0);
        return new FacesBufferedList(this.mBuffer, size());
    }
}
