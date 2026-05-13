package android.support.a.a;

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
import android.support.a.a.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@TargetApi(21)
/* loaded from: classes.dex */
public class f extends android.support.a.a.e {
    static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private C0001f c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private Drawable.ConstantState h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getLayoutDirection() {
        return super.getLayoutDirection();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    private f() {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.c = new C0001f();
    }

    private f(C0001f c0001f) {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.c = c0001f;
        this.d = a(this.d, c0001f.c, c0001f.d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.a != null) {
            this.a.mutate();
        } else if (!this.f && super.mutate() == this) {
            this.c = new C0001f(this.c);
            this.f = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a(String str) {
        return this.c.b.g.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new g(this.a.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() > 0 && this.k.height() > 0) {
            ColorFilter colorFilter = this.e == null ? this.d : this.e;
            canvas.getMatrix(this.j);
            this.j.getValues(this.i);
            float abs = Math.abs(this.i[0]);
            float abs2 = Math.abs(this.i[4]);
            float abs3 = Math.abs(this.i[1]);
            float abs4 = Math.abs(this.i[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int min = Math.min(2048, (int) (abs * this.k.width()));
            int min2 = Math.min(2048, (int) (abs2 * this.k.height()));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(this.k.left, this.k.top);
                if (a()) {
                    canvas.translate(this.k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.k.offsetTo(0, 0);
                this.c.b(min, min2);
                if (!this.g) {
                    this.c.a(min, min2);
                } else if (!this.c.b()) {
                    this.c.a(min, min2);
                    this.c.c();
                }
                this.c.a(canvas, colorFilter, this.k);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a != null ? android.support.v4.a.a.a.c(this.a) : this.c.b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.a != null) {
            this.a.setAlpha(i);
        } else if (this.c.b.a() != i) {
            this.c.b.a(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.a != null) {
            this.a.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.a.a.o
    public void setTint(int i) {
        if (this.a != null) {
            android.support.v4.a.a.a.a(this.a, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.a.a.o
    public void setTintList(ColorStateList colorStateList) {
        if (this.a != null) {
            android.support.v4.a.a.a.a(this.a, colorStateList);
            return;
        }
        C0001f c0001f = this.c;
        if (c0001f.c != colorStateList) {
            c0001f.c = colorStateList;
            this.d = a(this.d, colorStateList, c0001f.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.a.a.o
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.a != null) {
            android.support.v4.a.a.a.a(this.a, mode);
            return;
        }
        C0001f c0001f = this.c;
        if (c0001f.d != mode) {
            c0001f.d = mode;
            this.d = a(this.d, c0001f.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.a != null) {
            return this.a.isStateful();
        }
        return super.isStateful() || !(this.c == null || this.c.c == null || !this.c.c.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.a != null) {
            return this.a.setState(iArr);
        }
        C0001f c0001f = this.c;
        if (c0001f.c != null && c0001f.d != null) {
            this.d = a(this.d, c0001f.c, c0001f.d);
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.a != null) {
            return this.a.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a != null ? this.a.getIntrinsicWidth() : (int) this.c.b.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a != null ? this.a.getIntrinsicHeight() : (int) this.c.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.a != null) {
            android.support.v4.a.a.a.d(this.a);
            return false;
        }
        return false;
    }

    public static f a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 23) {
            f fVar = new f();
            fVar.a = android.support.v4.content.a.a.a(resources, i, theme);
            fVar.h = new g(fVar.a.getConstantState());
            return fVar;
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
            return a(resources, xml, asAttributeSet, theme);
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static f a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f fVar = new f();
        fVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.a != null) {
            this.a.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.a != null) {
            android.support.v4.a.a.a.a(this.a, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0001f c0001f = this.c;
        c0001f.b = new e();
        TypedArray b2 = b(resources, theme, attributeSet, android.support.a.a.a.a);
        a(b2, xmlPullParser);
        b2.recycle();
        c0001f.a = getChangingConfigurations();
        c0001f.k = true;
        b(resources, xmlPullParser, attributeSet, theme);
        this.d = a(this.d, c0001f.c, c0001f.d);
    }

    private static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
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

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0001f c0001f = this.c;
        e eVar = c0001f.b;
        c0001f.d = a(android.support.a.a.d.a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0001f.c = colorStateList;
        }
        c0001f.e = android.support.a.a.d.a(typedArray, xmlPullParser, "autoMirrored", 5, c0001f.e);
        eVar.c = android.support.a.a.d.a(typedArray, xmlPullParser, "viewportWidth", 7, eVar.c);
        eVar.d = android.support.a.a.d.a(typedArray, xmlPullParser, "viewportHeight", 8, eVar.d);
        if (eVar.c <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (eVar.d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        eVar.a = typedArray.getDimension(3, eVar.a);
        eVar.b = typedArray.getDimension(2, eVar.b);
        if (eVar.a <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (eVar.b <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        eVar.a(android.support.a.a.d.a(typedArray, xmlPullParser, "alpha", 4, eVar.b()));
        String string = typedArray.getString(0);
        if (string != null) {
            eVar.f = string;
            eVar.g.put(string, eVar);
        }
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z;
        C0001f c0001f = this.c;
        e eVar = c0001f.b;
        Stack stack = new Stack();
        stack.push(eVar.p);
        int eventType = xmlPullParser.getEventType();
        boolean z2 = true;
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) stack.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.a.add(bVar);
                    if (bVar.b() != null) {
                        eVar.g.put(bVar.b(), bVar);
                    }
                    z = false;
                    c0001f.a = bVar.o | c0001f.a;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    aVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.a.add(aVar);
                    if (aVar.b() != null) {
                        eVar.g.put(aVar.b(), aVar);
                    }
                    c0001f.a |= aVar.o;
                    z = z2;
                } else {
                    if ("group".equals(name)) {
                        c cVar2 = new c();
                        cVar2.a(resources, attributeSet, theme, xmlPullParser);
                        cVar.a.add(cVar2);
                        stack.push(cVar2);
                        if (cVar2.a() != null) {
                            eVar.g.put(cVar2.a(), cVar2);
                        }
                        c0001f.a |= cVar2.k;
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
    public void a(boolean z) {
        this.g = z;
    }

    private boolean a() {
        return false;
    }

    @Override // android.support.a.a.e, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.a != null) {
            this.a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.a != null ? this.a.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.a != null) {
            this.a.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.a != null) {
            this.a.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.a != null ? this.a.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.a != null) {
            this.a.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public g(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.a = (VectorDrawable) this.a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.a = (VectorDrawable) this.a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0001f extends Drawable.ConstantState {
        int a;
        e b;
        ColorStateList c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public C0001f(C0001f c0001f) {
            this.c = null;
            this.d = f.b;
            if (c0001f != null) {
                this.a = c0001f.a;
                this.b = new e(c0001f.b);
                if (c0001f.b.m != null) {
                    this.b.m = new Paint(c0001f.b.m);
                }
                if (c0001f.b.l != null) {
                    this.b.l = new Paint(c0001f.b.l);
                }
                this.c = c0001f.c;
                this.d = c0001f.d;
                this.e = c0001f.e;
            }
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return this.b.a() < 255;
        }

        public Paint a(ColorFilter colorFilter) {
            if (!a() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                this.l = new Paint();
                this.l.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.a());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public void a(int i, int i2) {
            this.f.eraseColor(0);
            this.b.a(new Canvas(this.f), i, i2, (ColorFilter) null);
        }

        public void b(int i, int i2) {
            if (this.f == null || !c(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean c(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.a();
        }

        public void c() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.a();
            this.j = this.e;
            this.k = false;
        }

        public C0001f() {
            this.c = null;
            this.d = f.b;
            this.b = new e();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {
        private static final Matrix j = new Matrix();
        float a;
        float b;
        float c;
        float d;
        int e;
        String f;
        final android.support.v4.d.a<String, Object> g;
        private final Path h;
        private final Path i;
        private final Matrix k;
        private Paint l;
        private Paint m;
        private PathMeasure n;
        private int o;
        private final c p;

        public e() {
            this.k = new Matrix();
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 255;
            this.f = null;
            this.g = new android.support.v4.d.a<>();
            this.p = new c();
            this.h = new Path();
            this.i = new Path();
        }

        public void a(int i) {
            this.e = i;
        }

        public int a() {
            return this.e;
        }

        public void a(float f) {
            a((int) (255.0f * f));
        }

        public float b() {
            return a() / 255.0f;
        }

        public e(e eVar) {
            this.k = new Matrix();
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 255;
            this.f = null;
            this.g = new android.support.v4.d.a<>();
            this.p = new c(eVar.p, this.g);
            this.h = new Path(eVar.h);
            this.i = new Path(eVar.i);
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.o = eVar.o;
            this.e = eVar.e;
            this.f = eVar.f;
            if (eVar.f != null) {
                this.g.put(eVar.f, this);
            }
        }

        private void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.b.set(matrix);
            cVar.b.preConcat(cVar.j);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < cVar.a.size()) {
                    Object obj = cVar.a.get(i4);
                    if (!(obj instanceof c)) {
                        if (obj instanceof d) {
                            a(cVar, (d) obj, canvas, i, i2, colorFilter);
                        }
                    } else {
                        a((c) obj, cVar.b, canvas, i, i2, colorFilter);
                    }
                    i3 = i4 + 1;
                } else {
                    return;
                }
            }
        }

        public void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.p, j, canvas, i, i2, colorFilter);
        }

        private void a(c cVar, d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.c;
            float f2 = i2 / this.d;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.b;
            this.k.set(matrix);
            this.k.postScale(f, f2);
            float a = a(matrix);
            if (a != 0.0f) {
                dVar.a(this.h);
                Path path = this.h;
                this.i.reset();
                if (dVar.a()) {
                    this.i.addPath(path, this.k);
                    canvas.clipPath(this.i, Region.Op.REPLACE);
                    return;
                }
                b bVar = (b) dVar;
                if (bVar.g != 0.0f || bVar.h != 1.0f) {
                    float f3 = (bVar.g + bVar.i) % 1.0f;
                    float f4 = (bVar.h + bVar.i) % 1.0f;
                    if (this.n == null) {
                        this.n = new PathMeasure();
                    }
                    this.n.setPath(this.h, false);
                    float length = this.n.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.n.getSegment(f5, length, path, true);
                        this.n.getSegment(0.0f, f6, path, true);
                    } else {
                        this.n.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.i.addPath(path, this.k);
                if (bVar.c != 0) {
                    if (this.m == null) {
                        this.m = new Paint();
                        this.m.setStyle(Paint.Style.FILL);
                        this.m.setAntiAlias(true);
                    }
                    Paint paint = this.m;
                    paint.setColor(f.b(bVar.c, bVar.f));
                    paint.setColorFilter(colorFilter);
                    canvas.drawPath(this.i, paint);
                }
                if (bVar.a != 0) {
                    if (this.l == null) {
                        this.l = new Paint();
                        this.l.setStyle(Paint.Style.STROKE);
                        this.l.setAntiAlias(true);
                    }
                    Paint paint2 = this.l;
                    if (bVar.k != null) {
                        paint2.setStrokeJoin(bVar.k);
                    }
                    if (bVar.j != null) {
                        paint2.setStrokeCap(bVar.j);
                    }
                    paint2.setStrokeMiter(bVar.l);
                    paint2.setColor(f.b(bVar.a, bVar.d));
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(a * min * bVar.b);
                    canvas.drawPath(this.i, paint2);
                }
            }
        }

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[2], fArr[3]);
            float a = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), hypot);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        final ArrayList<Object> a;
        private final Matrix b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        private final Matrix j;
        private int k;
        private int[] l;
        private String m;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v8, types: [android.support.a.a.f$b] */
        /* JADX WARN: Type inference failed for: r7v0, types: [android.support.v4.d.a<java.lang.String, java.lang.Object>, android.support.v4.d.a] */
        public c(c cVar, android.support.v4.d.a<String, Object> aVar) {
            a aVar2;
            this.b = new Matrix();
            this.a = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.l = cVar.l;
            this.m = cVar.m;
            this.k = cVar.k;
            if (this.m != null) {
                aVar.put(this.m, this);
            }
            this.j.set(cVar.j);
            ArrayList<Object> arrayList = cVar.a;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    Object obj = arrayList.get(i2);
                    if (obj instanceof c) {
                        this.a.add(new c((c) obj, aVar));
                    } else {
                        if (obj instanceof b) {
                            aVar2 = new b((b) obj);
                        } else if (obj instanceof a) {
                            aVar2 = new a((a) obj);
                        } else {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        this.a.add(aVar2);
                        if (aVar2.n != null) {
                            aVar.put(aVar2.n, aVar2);
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        public c() {
            this.b = new Matrix();
            this.a = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public String a() {
            return this.m;
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray b = android.support.a.a.e.b(resources, theme, attributeSet, android.support.a.a.a.b);
            a(b, xmlPullParser);
            b.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = android.support.a.a.d.a(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = android.support.a.a.d.a(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = android.support.a.a.d.a(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = android.support.a.a.d.a(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = android.support.a.a.d.a(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        protected c.b[] m;
        String n;
        int o;

        public d() {
            this.m = null;
        }

        public d(d dVar) {
            this.m = null;
            this.n = dVar.n;
            this.o = dVar.o;
            this.m = android.support.a.a.c.a(dVar.m);
        }

        public void a(Path path) {
            path.reset();
            if (this.m != null) {
                c.b.a(this.m, path);
            }
        }

        public String b() {
            return this.n;
        }

        public boolean a() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends d {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (android.support.a.a.d.a(xmlPullParser, "pathData")) {
                TypedArray b = android.support.a.a.e.b(resources, theme, attributeSet, android.support.a.a.a.d);
                a(b);
                b.recycle();
            }
        }

        private void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.m = android.support.a.a.c.a(string2);
            }
        }

        @Override // android.support.a.a.f.d
        public boolean a() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends d {
        int a;
        float b;
        int c;
        float d;
        int e;
        float f;
        float g;
        float h;
        float i;
        Paint.Cap j;
        Paint.Join k;
        float l;
        private int[] p;

        public b() {
            this.a = 0;
            this.b = 0.0f;
            this.c = 0;
            this.d = 1.0f;
            this.f = 1.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.a = 0;
            this.b = 0.0f;
            this.c = 0;
            this.d = 1.0f;
            this.f = 1.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
            this.p = bVar.p;
            this.a = bVar.a;
            this.b = bVar.b;
            this.d = bVar.d;
            this.c = bVar.c;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
        }

        private Paint.Cap a(int i, Paint.Cap cap) {
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

        private Paint.Join a(int i, Paint.Join join) {
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

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray b = android.support.a.a.e.b(resources, theme, attributeSet, android.support.a.a.a.c);
            a(b, xmlPullParser);
            b.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.p = null;
            if (android.support.a.a.d.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.m = android.support.a.a.c.a(string2);
                }
                this.c = android.support.a.a.d.b(typedArray, xmlPullParser, "fillColor", 1, this.c);
                this.f = android.support.a.a.d.a(typedArray, xmlPullParser, "fillAlpha", 12, this.f);
                this.j = a(android.support.a.a.d.a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.j);
                this.k = a(android.support.a.a.d.a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.k);
                this.l = android.support.a.a.d.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.l);
                this.a = android.support.a.a.d.b(typedArray, xmlPullParser, "strokeColor", 3, this.a);
                this.d = android.support.a.a.d.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.d);
                this.b = android.support.a.a.d.a(typedArray, xmlPullParser, "strokeWidth", 4, this.b);
                this.h = android.support.a.a.d.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.h);
                this.i = android.support.a.a.d.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.i);
                this.g = android.support.a.a.d.a(typedArray, xmlPullParser, "trimPathStart", 5, this.g);
            }
        }
    }
}
