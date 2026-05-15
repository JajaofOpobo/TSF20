package com.censivn.C3DEngine.api.element;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class Vertices {
    private boolean hasColors;
    private boolean hasNormals;
    private boolean hasUvs;
    private Color4BufferList mColors;
    private PointBufferManager mNormals;
    private PointBufferManager mPpoints;
    private UvBufferManager mUvs;

    public Vertices(int i, Boolean bool, Boolean bool2, Boolean bool3) {
        this.mPpoints = new PointBufferManager(i);
        this.hasUvs = bool.booleanValue();
        this.hasNormals = bool2.booleanValue();
        this.hasColors = bool3.booleanValue();
        if (this.hasUvs) {
            this.mUvs = new UvBufferManager(i);
        }
        if (this.hasNormals) {
            this.mNormals = new PointBufferManager(i);
        }
        if (this.hasColors) {
            this.mColors = new Color4BufferList(i);
        }
    }

    public Vertices(PointBufferManager pointBufferManager, UvBufferManager uvBufferManager, PointBufferManager pointBufferManager2, Color4BufferList color4BufferList) {
        this.mPpoints = pointBufferManager;
        this.mUvs = uvBufferManager;
        this.mNormals = pointBufferManager2;
        this.mColors = color4BufferList;
        this.hasUvs = this.mUvs != null && this.mUvs.size() > 0;
        this.hasNormals = this.mNormals != null && this.mNormals.size() > 0;
        this.hasColors = this.mColors != null && this.mColors.size() > 0;
    }

    public int size() {
        return this.mPpoints.size();
    }

    public int capacity() {
        return this.mPpoints.capacity();
    }

    public boolean hasUvs() {
        return this.hasUvs;
    }

    public boolean hasNormals() {
        return this.hasNormals;
    }

    public boolean hasColors() {
        return this.hasColors;
    }

    public short addVertex(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, short s, short s2, short s3, short s4) {
        this.mPpoints.addPX(f, f2, f3);
        if (this.hasUvs) {
            this.mUvs.add(f4, f5);
        }
        if (this.hasNormals) {
            this.mNormals.addPX(f6, f7, f8);
        }
        if (this.hasColors) {
            this.mColors.add(s, s2, s3, s4);
        }
        return (short) (this.mPpoints.size() - 1);
    }

    public short addVertex(Number3d number3d, Uv uv, Number3d number3d2, Color4 color4) {
        this.mPpoints.addPX(number3d);
        if (this.hasUvs) {
            this.mUvs.add(uv);
        }
        if (this.hasNormals) {
            this.mNormals.addPX(number3d2);
        }
        if (this.hasColors) {
            this.mColors.add(color4);
        }
        return (short) (this.mPpoints.size() - 1);
    }

    public void overwriteVerts(float[] fArr) {
        this.mPpoints.overwrite(fArr);
    }

    public void overwriteNormals(float[] fArr) {
        this.mNormals.overwrite(fArr);
    }

    public PointBufferManager points() {
        return this.mPpoints;
    }

    public UvBufferManager uvs() {
        return this.mUvs;
    }

    public PointBufferManager normals() {
        return this.mNormals;
    }

    public Color4BufferList colors() {
        return this.mColors;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Vertices m8clone() {
        return new Vertices(this.mPpoints.m5clone(), this.mUvs.m7clone(), this.mNormals.m5clone(), this.mColors == null ? null : this.mColors.m2clone());
    }
}
