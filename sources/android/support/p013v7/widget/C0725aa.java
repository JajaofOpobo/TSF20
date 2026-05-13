package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
/* renamed from: android.support.v7.widget.aa */
/* loaded from: classes.dex */
public class C0725aa {

    /* renamed from: a */
    private final Context f2072a;

    /* renamed from: b */
    private final TypedArray f2073b;

    /* renamed from: a */
    public static C0725aa m11296a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0725aa(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0725aa m11295a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0725aa(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private C0725aa(Context context, TypedArray typedArray) {
        this.f2072a = context;
        this.f2073b = typedArray;
    }

    /* renamed from: a */
    public Drawable m11300a(int i) {
        int resourceId;
        return (!this.f2073b.hasValue(i) || (resourceId = this.f2073b.getResourceId(i, 0)) == 0) ? this.f2073b.getDrawable(i) : C0742g.m11215a().m11211a(this.f2072a, resourceId);
    }

    /* renamed from: b */
    public Drawable m11294b(int i) {
        int resourceId;
        if (!this.f2073b.hasValue(i) || (resourceId = this.f2073b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0742g.m11215a().m11208a(this.f2072a, resourceId, true);
    }

    /* renamed from: c */
    public CharSequence m11292c(int i) {
        return this.f2073b.getText(i);
    }

    /* renamed from: d */
    public String m11290d(int i) {
        return this.f2073b.getString(i);
    }

    /* renamed from: a */
    public boolean m11297a(int i, boolean z) {
        return this.f2073b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int m11298a(int i, int i2) {
        return this.f2073b.getInt(i, i2);
    }

    /* renamed from: a */
    public float m11299a(int i, float f) {
        return this.f2073b.getFloat(i, f);
    }

    /* renamed from: b */
    public int m11293b(int i, int i2) {
        return this.f2073b.getColor(i, i2);
    }

    /* renamed from: c */
    public int m11291c(int i, int i2) {
        return this.f2073b.getInteger(i, i2);
    }

    /* renamed from: d */
    public int m11289d(int i, int i2) {
        return this.f2073b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int m11287e(int i, int i2) {
        return this.f2073b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public int m11285f(int i, int i2) {
        return this.f2073b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int m11284g(int i, int i2) {
        return this.f2073b.getResourceId(i, i2);
    }

    /* renamed from: e */
    public CharSequence[] m11288e(int i) {
        return this.f2073b.getTextArray(i);
    }

    /* renamed from: f */
    public boolean m11286f(int i) {
        return this.f2073b.hasValue(i);
    }

    /* renamed from: a */
    public void m11301a() {
        this.f2073b.recycle();
    }
}
