package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class i {
    private final Context a;
    private final TypedArray b;
    private f c;

    public static i a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new i(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private i(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public Drawable a(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : b().a(resourceId);
    }

    public CharSequence b(int i) {
        return this.b.getText(i);
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public int a(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public int b(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public void a() {
        this.b.recycle();
    }

    public f b() {
        f fVar;
        if (this.c == null) {
            if (this.a instanceof e) {
                fVar = ((e) this.a).a();
            } else {
                fVar = new f(this.a);
            }
            this.c = fVar;
        }
        return this.c;
    }
}
