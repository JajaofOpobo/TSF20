package android.support.p013v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p002v4.p003a.p004a.InterfaceC0037i;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* renamed from: android.support.v7.widget.i */
/* loaded from: classes.dex */
class C0749i {

    /* renamed from: b */
    private static final int[] f2152b = {16843067, 16843068};

    /* renamed from: a */
    final C0742g f2153a;

    /* renamed from: c */
    private final ProgressBar f2154c;

    /* renamed from: d */
    private Bitmap f2155d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0749i(ProgressBar progressBar, C0742g c0742g) {
        this.f2154c = progressBar;
        this.f2153a = c0742g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11172a(AttributeSet attributeSet, int i) {
        C0725aa m11295a = C0725aa.m11295a(this.f2154c.getContext(), attributeSet, f2152b, i, 0);
        Drawable m11294b = m11295a.m11294b(0);
        if (m11294b != null) {
            this.f2154c.setIndeterminateDrawable(m11175a(m11294b));
        }
        Drawable m11294b2 = m11295a.m11294b(1);
        if (m11294b2 != null) {
            this.f2154c.setProgressDrawable(m11174a(m11294b2, false));
        }
        m11295a.m11301a();
    }

    /* renamed from: a */
    private Drawable m11174a(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0037i) {
            Drawable mo13805a = ((InterfaceC0037i) drawable).mo13805a();
            if (mo13805a != null) {
                ((InterfaceC0037i) drawable).mo13803a(m11174a(mo13805a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m11174a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2155d == null) {
                this.f2155d = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m11173b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable m11175a(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m11174a = m11174a(animationDrawable.getFrame(i), true);
                m11174a.setLevel(10000);
                animationDrawable2.addFrame(m11174a, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* renamed from: b */
    private Shape m11173b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m11176a() {
        return this.f2155d;
    }
}
