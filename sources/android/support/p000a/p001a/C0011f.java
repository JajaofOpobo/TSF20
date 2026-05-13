package android.support.p000a.p001a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.p000a.p001a.C0005c;
import android.support.p002v4.content.p008a.C0145a;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.p009d.C0160a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@TargetApi(21)
/* renamed from: android.support.a.a.f */
/* loaded from: classes.dex */
public class C0011f extends AbstractC0010e {

    /* renamed from: b */
    static final PorterDuff.Mode f21b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C0018f f22c;

    /* renamed from: d */
    private PorterDuffColorFilter f23d;

    /* renamed from: e */
    private ColorFilter f24e;

    /* renamed from: f */
    private boolean f25f;

    /* renamed from: g */
    private boolean f26g;

    /* renamed from: h */
    private Drawable.ConstantState f27h;

    /* renamed from: i */
    private final float[] f28i;

    /* renamed from: j */
    private final Matrix f29j;

    /* renamed from: k */
    private final Rect f30k;

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getLayoutDirection() {
        return super.getLayoutDirection();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    private C0011f() {
        this.f26g = true;
        this.f28i = new float[9];
        this.f29j = new Matrix();
        this.f30k = new Rect();
        this.f22c = new C0018f();
    }

    private C0011f(C0018f c0018f) {
        this.f26g = true;
        this.f28i = new float[9];
        this.f29j = new Matrix();
        this.f30k = new Rect();
        this.f22c = c0018f;
        this.f23d = m13911a(this.f23d, c0018f.f78c, c0018f.f79d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f20a != null) {
            this.f20a.mutate();
        } else if (!this.f25f && super.mutate() == this) {
            this.f22c = new C0018f(this.f22c);
            this.f25f = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Object m13910a(String str) {
        return this.f22c.f77b.f67g.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f20a != null) {
            return new C0019g(this.f20a.getConstantState());
        }
        this.f22c.f76a = getChangingConfigurations();
        return this.f22c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f20a != null) {
            this.f20a.draw(canvas);
            return;
        }
        copyBounds(this.f30k);
        if (this.f30k.width() > 0 && this.f30k.height() > 0) {
            ColorFilter colorFilter = this.f24e == null ? this.f23d : this.f24e;
            canvas.getMatrix(this.f29j);
            this.f29j.getValues(this.f28i);
            float abs = Math.abs(this.f28i[0]);
            float abs2 = Math.abs(this.f28i[4]);
            float abs3 = Math.abs(this.f28i[1]);
            float abs4 = Math.abs(this.f28i[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int min = Math.min(2048, (int) (abs * this.f30k.width()));
            int min2 = Math.min(2048, (int) (abs2 * this.f30k.height()));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(this.f30k.left, this.f30k.top);
                if (m13917a()) {
                    canvas.translate(this.f30k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f30k.offsetTo(0, 0);
                this.f22c.m13871b(min, min2);
                if (!this.f26g) {
                    this.f22c.m13875a(min, min2);
                } else if (!this.f22c.m13872b()) {
                    this.f22c.m13875a(min, min2);
                    this.f22c.m13870c();
                }
                this.f22c.m13874a(canvas, colorFilter, this.f30k);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20a != null ? C0021a.m13853c(this.f20a) : this.f22c.f77b.m13890a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f20a != null) {
            this.f20a.setAlpha(i);
        } else if (this.f22c.f77b.m13890a() != i) {
            this.f22c.f77b.m13887a(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f20a != null) {
            this.f20a.setColorFilter(colorFilter);
            return;
        }
        this.f24e = colorFilter;
        invalidateSelf();
    }

    /* renamed from: a */
    PorterDuffColorFilter m13911a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTint(int i) {
        if (this.f20a != null) {
            C0021a.m13862a(this.f20a, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintList(ColorStateList colorStateList) {
        if (this.f20a != null) {
            C0021a.m13860a(this.f20a, colorStateList);
            return;
        }
        C0018f c0018f = this.f22c;
        if (c0018f.f78c != colorStateList) {
            c0018f.f78c = colorStateList;
            this.f23d = m13911a(this.f23d, colorStateList, c0018f.f79d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f20a != null) {
            C0021a.m13857a(this.f20a, mode);
            return;
        }
        C0018f c0018f = this.f22c;
        if (c0018f.f79d != mode) {
            c0018f.f79d = mode;
            this.f23d = m13911a(this.f23d, c0018f.f78c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.f20a != null) {
            return this.f20a.isStateful();
        }
        return super.isStateful() || !(this.f22c == null || this.f22c.f78c == null || !this.f22c.f78c.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f20a != null) {
            return this.f20a.setState(iArr);
        }
        C0018f c0018f = this.f22c;
        if (c0018f.f78c != null && c0018f.f79d != null) {
            this.f23d = m13911a(this.f23d, c0018f.f78c, c0018f.f79d);
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f20a != null) {
            return this.f20a.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20a != null ? this.f20a.getIntrinsicWidth() : (int) this.f22c.f77b.f61a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20a != null ? this.f20a.getIntrinsicHeight() : (int) this.f22c.f77b.f62b;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f20a != null) {
            C0021a.m13852d(this.f20a);
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public static C0011f m13914a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 23) {
            C0011f c0011f = new C0011f();
            c0011f.f20a = C0145a.m13401a(resources, i, theme);
            c0011f.f27h = new C0019g(c0011f.f20a.getConstantState());
            return c0011f;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m13913a(resources, xml, asAttributeSet, theme);
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static C0011f m13913a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0011f c0011f = new C0011f();
        c0011f.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0011f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m13908b(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f20a != null) {
            this.f20a.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f20a != null) {
            C0021a.m13858a(this.f20a, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0018f c0018f = this.f22c;
        c0018f.f77b = new C0017e();
        TypedArray b = m13918b(resources, theme, attributeSet, C0000a.f0a);
        m13912a(b, xmlPullParser);
        b.recycle();
        c0018f.f76a = getChangingConfigurations();
        c0018f.f86k = true;
        m13907b(resources, xmlPullParser, attributeSet, theme);
        this.f23d = m13911a(this.f23d, c0018f.f78c, c0018f.f79d);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m13915a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
        }
    }

    /* renamed from: a */
    private void m13912a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0018f c0018f = this.f22c;
        C0017e c0017e = c0018f.f77b;
        c0018f.f79d = m13915a(C0009d.m13922a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0018f.f78c = colorStateList;
        }
        c0018f.f80e = C0009d.m13921a(typedArray, xmlPullParser, "autoMirrored", 5, c0018f.f80e);
        c0017e.f63c = C0009d.m13923a(typedArray, xmlPullParser, "viewportWidth", 7, c0017e.f63c);
        c0017e.f64d = C0009d.m13923a(typedArray, xmlPullParser, "viewportHeight", 8, c0017e.f64d);
        if (c0017e.f63c <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (c0017e.f64d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0017e.f61a = typedArray.getDimension(3, c0017e.f61a);
        c0017e.f62b = typedArray.getDimension(2, c0017e.f62b);
        if (c0017e.f61a <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (c0017e.f62b <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0017e.m13889a(C0009d.m13923a(typedArray, xmlPullParser, "alpha", 4, c0017e.m13880b()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0017e.f66f = string;
            c0017e.f67g.put(string, c0017e);
        }
    }

    /* renamed from: b */
    private void m13907b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z;
        C0018f c0018f = this.f22c;
        C0017e c0017e = c0018f.f77b;
        Stack stack = new Stack();
        stack.push(c0017e.f75p);
        int eventType = xmlPullParser.getEventType();
        boolean z2 = true;
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0015c c0015c = (C0015c) stack.peek();
                if ("path".equals(name)) {
                    C0014b c0014b = new C0014b();
                    c0014b.m13902a(resources, attributeSet, theme, xmlPullParser);
                    c0015c.f44a.add(c0014b);
                    if (c0014b.m13891b() != null) {
                        c0017e.f67g.put(c0014b.m13891b(), c0014b);
                    }
                    z = false;
                    c0018f.f76a = c0014b.f59o | c0018f.f76a;
                } else if ("clip-path".equals(name)) {
                    C0013a c0013a = new C0013a();
                    c0013a.m13906a(resources, attributeSet, theme, xmlPullParser);
                    c0015c.f44a.add(c0013a);
                    if (c0013a.m13891b() != null) {
                        c0017e.f67g.put(c0013a.m13891b(), c0013a);
                    }
                    c0018f.f76a |= c0013a.f59o;
                    z = z2;
                } else {
                    if ("group".equals(name)) {
                        C0015c c0015c2 = new C0015c();
                        c0015c2.m13899a(resources, attributeSet, theme, xmlPullParser);
                        c0015c.f44a.add(c0015c2);
                        stack.push(c0015c2);
                        if (c0015c2.m13900a() != null) {
                            c0017e.f67g.put(c0015c2.m13900a(), c0015c2);
                        }
                        c0018f.f76a |= c0015c2.f54k;
                    }
                    z = z2;
                }
                z2 = z;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + ((Object) stringBuffer) + " defined");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13909a(boolean z) {
        this.f26g = z;
    }

    /* renamed from: a */
    private boolean m13917a() {
        return false;
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f20a != null) {
            this.f20a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f20a != null ? this.f20a.getChangingConfigurations() : super.getChangingConfigurations() | this.f22c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f20a != null) {
            this.f20a.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f20a != null) {
            this.f20a.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.f20a != null ? this.f20a.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.f20a != null) {
            this.f20a.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$g */
    /* loaded from: classes.dex */
    public static class C0019g extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f88a;

        public C0019g(Drawable.ConstantState constantState) {
            this.f88a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0011f c0011f = new C0011f();
            c0011f.f20a = (VectorDrawable) this.f88a.newDrawable();
            return c0011f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0011f c0011f = new C0011f();
            c0011f.f20a = (VectorDrawable) this.f88a.newDrawable(resources);
            return c0011f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0011f c0011f = new C0011f();
            c0011f.f20a = (VectorDrawable) this.f88a.newDrawable(resources, theme);
            return c0011f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f88a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f88a.getChangingConfigurations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$f */
    /* loaded from: classes.dex */
    public static class C0018f extends Drawable.ConstantState {

        /* renamed from: a */
        int f76a;

        /* renamed from: b */
        C0017e f77b;

        /* renamed from: c */
        ColorStateList f78c;

        /* renamed from: d */
        PorterDuff.Mode f79d;

        /* renamed from: e */
        boolean f80e;

        /* renamed from: f */
        Bitmap f81f;

        /* renamed from: g */
        ColorStateList f82g;

        /* renamed from: h */
        PorterDuff.Mode f83h;

        /* renamed from: i */
        int f84i;

        /* renamed from: j */
        boolean f85j;

        /* renamed from: k */
        boolean f86k;

        /* renamed from: l */
        Paint f87l;

        public C0018f(C0018f c0018f) {
            this.f78c = null;
            this.f79d = C0011f.f21b;
            if (c0018f != null) {
                this.f76a = c0018f.f76a;
                this.f77b = new C0017e(c0018f.f77b);
                if (c0018f.f77b.f72m != null) {
                    this.f77b.f72m = new Paint(c0018f.f77b.f72m);
                }
                if (c0018f.f77b.f71l != null) {
                    this.f77b.f71l = new Paint(c0018f.f77b.f71l);
                }
                this.f78c = c0018f.f78c;
                this.f79d = c0018f.f79d;
                this.f80e = c0018f.f80e;
            }
        }

        /* renamed from: a */
        public void m13874a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f81f, (Rect) null, rect, m13873a(colorFilter));
        }

        /* renamed from: a */
        public boolean m13876a() {
            return this.f77b.m13890a() < 255;
        }

        /* renamed from: a */
        public Paint m13873a(ColorFilter colorFilter) {
            if (!m13876a() && colorFilter == null) {
                return null;
            }
            if (this.f87l == null) {
                this.f87l = new Paint();
                this.f87l.setFilterBitmap(true);
            }
            this.f87l.setAlpha(this.f77b.m13890a());
            this.f87l.setColorFilter(colorFilter);
            return this.f87l;
        }

        /* renamed from: a */
        public void m13875a(int i, int i2) {
            this.f81f.eraseColor(0);
            this.f77b.m13886a(new Canvas(this.f81f), i, i2, (ColorFilter) null);
        }

        /* renamed from: b */
        public void m13871b(int i, int i2) {
            if (this.f81f == null || !m13869c(i, i2)) {
                this.f81f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f86k = true;
            }
        }

        /* renamed from: c */
        public boolean m13869c(int i, int i2) {
            return i == this.f81f.getWidth() && i2 == this.f81f.getHeight();
        }

        /* renamed from: b */
        public boolean m13872b() {
            return !this.f86k && this.f82g == this.f78c && this.f83h == this.f79d && this.f85j == this.f80e && this.f84i == this.f77b.m13890a();
        }

        /* renamed from: c */
        public void m13870c() {
            this.f82g = this.f78c;
            this.f83h = this.f79d;
            this.f84i = this.f77b.m13890a();
            this.f85j = this.f80e;
            this.f86k = false;
        }

        public C0018f() {
            this.f78c = null;
            this.f79d = C0011f.f21b;
            this.f77b = new C0017e();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0011f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0011f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f76a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$e */
    /* loaded from: classes.dex */
    public static class C0017e {

        /* renamed from: j */
        private static final Matrix f60j = new Matrix();

        /* renamed from: a */
        float f61a;

        /* renamed from: b */
        float f62b;

        /* renamed from: c */
        float f63c;

        /* renamed from: d */
        float f64d;

        /* renamed from: e */
        int f65e;

        /* renamed from: f */
        String f66f;

        /* renamed from: g */
        final C0160a<String, Object> f67g;

        /* renamed from: h */
        private final Path f68h;

        /* renamed from: i */
        private final Path f69i;

        /* renamed from: k */
        private final Matrix f70k;

        /* renamed from: l */
        private Paint f71l;

        /* renamed from: m */
        private Paint f72m;

        /* renamed from: n */
        private PathMeasure f73n;

        /* renamed from: o */
        private int f74o;

        /* renamed from: p */
        private final C0015c f75p;

        public C0017e() {
            this.f70k = new Matrix();
            this.f61a = 0.0f;
            this.f62b = 0.0f;
            this.f63c = 0.0f;
            this.f64d = 0.0f;
            this.f65e = 255;
            this.f66f = null;
            this.f67g = new C0160a<>();
            this.f75p = new C0015c();
            this.f68h = new Path();
            this.f69i = new Path();
        }

        /* renamed from: a */
        public void m13887a(int i) {
            this.f65e = i;
        }

        /* renamed from: a */
        public int m13890a() {
            return this.f65e;
        }

        /* renamed from: a */
        public void m13889a(float f) {
            m13887a((int) (255.0f * f));
        }

        /* renamed from: b */
        public float m13880b() {
            return m13890a() / 255.0f;
        }

        public C0017e(C0017e c0017e) {
            this.f70k = new Matrix();
            this.f61a = 0.0f;
            this.f62b = 0.0f;
            this.f63c = 0.0f;
            this.f64d = 0.0f;
            this.f65e = 255;
            this.f66f = null;
            this.f67g = new C0160a<>();
            this.f75p = new C0015c(c0017e.f75p, this.f67g);
            this.f68h = new Path(c0017e.f68h);
            this.f69i = new Path(c0017e.f69i);
            this.f61a = c0017e.f61a;
            this.f62b = c0017e.f62b;
            this.f63c = c0017e.f63c;
            this.f64d = c0017e.f64d;
            this.f74o = c0017e.f74o;
            this.f65e = c0017e.f65e;
            this.f66f = c0017e.f66f;
            if (c0017e.f66f != null) {
                this.f67g.put(c0017e.f66f, this);
            }
        }

        /* renamed from: a */
        private void m13884a(C0015c c0015c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0015c.f45b.set(matrix);
            c0015c.f45b.preConcat(c0015c.f53j);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < c0015c.f44a.size()) {
                    Object obj = c0015c.f44a.get(i4);
                    if (!(obj instanceof C0015c)) {
                        if (obj instanceof C0016d) {
                            m13883a(c0015c, (C0016d) obj, canvas, i, i2, colorFilter);
                        }
                    } else {
                        m13884a((C0015c) obj, c0015c.f45b, canvas, i, i2, colorFilter);
                    }
                    i3 = i4 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void m13886a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m13884a(this.f75p, f60j, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        private void m13883a(C0015c c0015c, C0016d c0016d, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f63c;
            float f2 = i2 / this.f64d;
            float min = Math.min(f, f2);
            Matrix matrix = c0015c.f45b;
            this.f70k.set(matrix);
            this.f70k.postScale(f, f2);
            float m13885a = m13885a(matrix);
            if (m13885a != 0.0f) {
                c0016d.m13892a(this.f68h);
                Path path = this.f68h;
                this.f69i.reset();
                if (c0016d.mo13893a()) {
                    this.f69i.addPath(path, this.f70k);
                    canvas.clipPath(this.f69i, Region.Op.REPLACE);
                    return;
                }
                C0014b c0014b = (C0014b) c0016d;
                if (c0014b.f37g != 0.0f || c0014b.f38h != 1.0f) {
                    float f3 = (c0014b.f37g + c0014b.f39i) % 1.0f;
                    float f4 = (c0014b.f38h + c0014b.f39i) % 1.0f;
                    if (this.f73n == null) {
                        this.f73n = new PathMeasure();
                    }
                    this.f73n.setPath(this.f68h, false);
                    float length = this.f73n.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f73n.getSegment(f5, length, path, true);
                        this.f73n.getSegment(0.0f, f6, path, true);
                    } else {
                        this.f73n.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f69i.addPath(path, this.f70k);
                if (c0014b.f33c != 0) {
                    if (this.f72m == null) {
                        this.f72m = new Paint();
                        this.f72m.setStyle(Paint.Style.FILL);
                        this.f72m.setAntiAlias(true);
                    }
                    Paint paint = this.f72m;
                    paint.setColor(C0011f.m13908b(c0014b.f33c, c0014b.f36f));
                    paint.setColorFilter(colorFilter);
                    canvas.drawPath(this.f69i, paint);
                }
                if (c0014b.f31a != 0) {
                    if (this.f71l == null) {
                        this.f71l = new Paint();
                        this.f71l.setStyle(Paint.Style.STROKE);
                        this.f71l.setAntiAlias(true);
                    }
                    Paint paint2 = this.f71l;
                    if (c0014b.f41k != null) {
                        paint2.setStrokeJoin(c0014b.f41k);
                    }
                    if (c0014b.f40j != null) {
                        paint2.setStrokeCap(c0014b.f40j);
                    }
                    paint2.setStrokeMiter(c0014b.f42l);
                    paint2.setColor(C0011f.m13908b(c0014b.f31a, c0014b.f34d));
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(m13885a * min * c0014b.f32b);
                    canvas.drawPath(this.f69i, paint2);
                }
            }
        }

        /* renamed from: a */
        private static float m13888a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m13885a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[2], fArr[3]);
            float m13888a = m13888a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), hypot);
            if (max > 0.0f) {
                return Math.abs(m13888a) / max;
            }
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$c */
    /* loaded from: classes.dex */
    public static class C0015c {

        /* renamed from: a */
        final ArrayList<Object> f44a;

        /* renamed from: b */
        private final Matrix f45b;

        /* renamed from: c */
        private float f46c;

        /* renamed from: d */
        private float f47d;

        /* renamed from: e */
        private float f48e;

        /* renamed from: f */
        private float f49f;

        /* renamed from: g */
        private float f50g;

        /* renamed from: h */
        private float f51h;

        /* renamed from: i */
        private float f52i;

        /* renamed from: j */
        private final Matrix f53j;

        /* renamed from: k */
        private int f54k;

        /* renamed from: l */
        private int[] f55l;

        /* renamed from: m */
        private String f56m;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v8, types: [android.support.a.a.f$b] */
        /* JADX WARN: Type inference failed for: r7v0, types: [android.support.v4.d.a<java.lang.String, java.lang.Object>, android.support.v4.d.a] */
        public C0015c(C0015c c0015c, C0160a<String, Object> c0160a) {
            C0013a c0013a;
            this.f45b = new Matrix();
            this.f44a = new ArrayList<>();
            this.f46c = 0.0f;
            this.f47d = 0.0f;
            this.f48e = 0.0f;
            this.f49f = 1.0f;
            this.f50g = 1.0f;
            this.f51h = 0.0f;
            this.f52i = 0.0f;
            this.f53j = new Matrix();
            this.f56m = null;
            this.f46c = c0015c.f46c;
            this.f47d = c0015c.f47d;
            this.f48e = c0015c.f48e;
            this.f49f = c0015c.f49f;
            this.f50g = c0015c.f50g;
            this.f51h = c0015c.f51h;
            this.f52i = c0015c.f52i;
            this.f55l = c0015c.f55l;
            this.f56m = c0015c.f56m;
            this.f54k = c0015c.f54k;
            if (this.f56m != null) {
                c0160a.put(this.f56m, this);
            }
            this.f53j.set(c0015c.f53j);
            ArrayList<Object> arrayList = c0015c.f44a;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    Object obj = arrayList.get(i2);
                    if (obj instanceof C0015c) {
                        this.f44a.add(new C0015c((C0015c) obj, c0160a));
                    } else {
                        if (obj instanceof C0014b) {
                            c0013a = new C0014b((C0014b) obj);
                        } else if (obj instanceof C0013a) {
                            c0013a = new C0013a((C0013a) obj);
                        } else {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        this.f44a.add(c0013a);
                        if (c0013a.f58n != null) {
                            c0160a.put(c0013a.f58n, c0013a);
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        public C0015c() {
            this.f45b = new Matrix();
            this.f44a = new ArrayList<>();
            this.f46c = 0.0f;
            this.f47d = 0.0f;
            this.f48e = 0.0f;
            this.f49f = 1.0f;
            this.f50g = 1.0f;
            this.f51h = 0.0f;
            this.f52i = 0.0f;
            this.f53j = new Matrix();
            this.f56m = null;
        }

        /* renamed from: a */
        public String m13900a() {
            return this.f56m;
        }

        /* renamed from: a */
        public void m13899a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m13918b = AbstractC0010e.m13918b(resources, theme, attributeSet, C0000a.f1b);
            m13898a(m13918b, xmlPullParser);
            m13918b.recycle();
        }

        /* renamed from: a */
        private void m13898a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f55l = null;
            this.f46c = C0009d.m13923a(typedArray, xmlPullParser, "rotation", 5, this.f46c);
            this.f47d = typedArray.getFloat(1, this.f47d);
            this.f48e = typedArray.getFloat(2, this.f48e);
            this.f49f = C0009d.m13923a(typedArray, xmlPullParser, "scaleX", 3, this.f49f);
            this.f50g = C0009d.m13923a(typedArray, xmlPullParser, "scaleY", 4, this.f50g);
            this.f51h = C0009d.m13923a(typedArray, xmlPullParser, "translateX", 6, this.f51h);
            this.f52i = C0009d.m13923a(typedArray, xmlPullParser, "translateY", 7, this.f52i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f56m = string;
            }
            m13896b();
        }

        /* renamed from: b */
        private void m13896b() {
            this.f53j.reset();
            this.f53j.postTranslate(-this.f47d, -this.f48e);
            this.f53j.postScale(this.f49f, this.f50g);
            this.f53j.postRotate(this.f46c, 0.0f, 0.0f);
            this.f53j.postTranslate(this.f51h + this.f47d, this.f52i + this.f48e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$d */
    /* loaded from: classes.dex */
    public static class C0016d {

        /* renamed from: m */
        protected C0005c.C0008b[] f57m;

        /* renamed from: n */
        String f58n;

        /* renamed from: o */
        int f59o;

        public C0016d() {
            this.f57m = null;
        }

        public C0016d(C0016d c0016d) {
            this.f57m = null;
            this.f58n = c0016d.f58n;
            this.f59o = c0016d.f59o;
            this.f57m = C0005c.m13930a(c0016d.f57m);
        }

        /* renamed from: a */
        public void m13892a(Path path) {
            path.reset();
            if (this.f57m != null) {
                C0005c.C0008b.m13924a(this.f57m, path);
            }
        }

        /* renamed from: b */
        public String m13891b() {
            return this.f58n;
        }

        /* renamed from: a */
        public boolean mo13893a() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$a */
    /* loaded from: classes.dex */
    public static class C0013a extends C0016d {
        public C0013a() {
        }

        public C0013a(C0013a c0013a) {
            super(c0013a);
        }

        /* renamed from: a */
        public void m13906a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0009d.m13920a(xmlPullParser, "pathData")) {
                TypedArray m13918b = AbstractC0010e.m13918b(resources, theme, attributeSet, C0000a.f3d);
                m13905a(m13918b);
                m13918b.recycle();
            }
        }

        /* renamed from: a */
        private void m13905a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f58n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f57m = C0005c.m13935a(string2);
            }
        }

        @Override // android.support.p000a.p001a.C0011f.C0016d
        /* renamed from: a */
        public boolean mo13893a() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$b */
    /* loaded from: classes.dex */
    public static class C0014b extends C0016d {

        /* renamed from: a */
        int f31a;

        /* renamed from: b */
        float f32b;

        /* renamed from: c */
        int f33c;

        /* renamed from: d */
        float f34d;

        /* renamed from: e */
        int f35e;

        /* renamed from: f */
        float f36f;

        /* renamed from: g */
        float f37g;

        /* renamed from: h */
        float f38h;

        /* renamed from: i */
        float f39i;

        /* renamed from: j */
        Paint.Cap f40j;

        /* renamed from: k */
        Paint.Join f41k;

        /* renamed from: l */
        float f42l;

        /* renamed from: p */
        private int[] f43p;

        public C0014b() {
            this.f31a = 0;
            this.f32b = 0.0f;
            this.f33c = 0;
            this.f34d = 1.0f;
            this.f36f = 1.0f;
            this.f37g = 0.0f;
            this.f38h = 1.0f;
            this.f39i = 0.0f;
            this.f40j = Paint.Cap.BUTT;
            this.f41k = Paint.Join.MITER;
            this.f42l = 4.0f;
        }

        public C0014b(C0014b c0014b) {
            super(c0014b);
            this.f31a = 0;
            this.f32b = 0.0f;
            this.f33c = 0;
            this.f34d = 1.0f;
            this.f36f = 1.0f;
            this.f37g = 0.0f;
            this.f38h = 1.0f;
            this.f39i = 0.0f;
            this.f40j = Paint.Cap.BUTT;
            this.f41k = Paint.Join.MITER;
            this.f42l = 4.0f;
            this.f43p = c0014b.f43p;
            this.f31a = c0014b.f31a;
            this.f32b = c0014b.f32b;
            this.f34d = c0014b.f34d;
            this.f33c = c0014b.f33c;
            this.f35e = c0014b.f35e;
            this.f36f = c0014b.f36f;
            this.f37g = c0014b.f37g;
            this.f38h = c0014b.f38h;
            this.f39i = c0014b.f39i;
            this.f40j = c0014b.f40j;
            this.f41k = c0014b.f41k;
            this.f42l = c0014b.f42l;
        }

        /* renamed from: a */
        private Paint.Cap m13904a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Paint.Join m13903a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        public void m13902a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m13918b = AbstractC0010e.m13918b(resources, theme, attributeSet, C0000a.f2c);
            m13901a(m13918b, xmlPullParser);
            m13918b.recycle();
        }

        /* renamed from: a */
        private void m13901a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f43p = null;
            if (C0009d.m13920a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f58n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f57m = C0005c.m13935a(string2);
                }
                this.f33c = C0009d.m13919b(typedArray, xmlPullParser, "fillColor", 1, this.f33c);
                this.f36f = C0009d.m13923a(typedArray, xmlPullParser, "fillAlpha", 12, this.f36f);
                this.f40j = m13904a(C0009d.m13922a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f40j);
                this.f41k = m13903a(C0009d.m13922a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f41k);
                this.f42l = C0009d.m13923a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f42l);
                this.f31a = C0009d.m13919b(typedArray, xmlPullParser, "strokeColor", 3, this.f31a);
                this.f34d = C0009d.m13923a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f34d);
                this.f32b = C0009d.m13923a(typedArray, xmlPullParser, "strokeWidth", 4, this.f32b);
                this.f38h = C0009d.m13923a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f38h);
                this.f39i = C0009d.m13923a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f39i);
                this.f37g = C0009d.m13923a(typedArray, xmlPullParser, "trimPathStart", 5, this.f37g);
            }
        }
    }
}
