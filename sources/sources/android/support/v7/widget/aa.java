package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class aa {
    private final Context a;
    private final TypedArray b;

    public static aa a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aa(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static aa a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new aa(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private aa(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public Drawable a(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : g.a().a(this.a, resourceId);
    }

    public Drawable b(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return g.a().a(this.a, resourceId, true);
    }

    public CharSequence c(int i) {
        return this.b.getText(i);
    }

    public String d(int i) {
        return this.b.getString(i);
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public int a(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public float a(int i, float f) {
        return this.b.getFloat(i, f);
    }

    public int b(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public int c(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public int d(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public int e(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public int f(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public int g(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public CharSequence[] e(int i) {
        return this.b.getTextArray(i);
    }

    public boolean f(int i) {
        return this.b.hasValue(i);
    }

    public void a() {
        this.b.recycle();
    }
}
