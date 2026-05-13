package android.support.p000a.p001a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.p009d.C0160a;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
@TargetApi(21)
/* renamed from: android.support.a.a.b */
/* loaded from: classes.dex */
public class C0001b extends AbstractC0010e implements Animatable {

    /* renamed from: b */
    private C0003a f6b;

    /* renamed from: c */
    private Context f7c;

    /* renamed from: d */
    private ArgbEvaluator f8d;

    /* renamed from: e */
    private final Drawable.Callback f9e;

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

    private C0001b() {
        this(null, null, null);
    }

    private C0001b(Context context) {
        this(context, null, null);
    }

    private C0001b(Context context, C0003a c0003a, Resources resources) {
        this.f8d = null;
        this.f9e = new Drawable.Callback() { // from class: android.support.a.a.b.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                C0001b.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0001b.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0001b.this.unscheduleSelf(runnable);
            }
        };
        this.f7c = context;
        if (c0003a != null) {
            this.f6b = c0003a;
        } else {
            this.f6b = new C0003a(context, c0003a, this.f9e, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f20a != null) {
            this.f20a.mutate();
            return this;
        }
        throw new IllegalStateException("Mutate() is not supported for older platform");
    }

    /* renamed from: a */
    public static C0001b m13939a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0001b c0001b = new C0001b(context);
        c0001b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0001b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f20a != null) {
            return new C0004b(this.f20a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f20a != null ? this.f20a.getChangingConfigurations() : super.getChangingConfigurations() | this.f6b.f11a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f20a != null) {
            this.f20a.draw(canvas);
            return;
        }
        this.f6b.f12b.draw(canvas);
        if (m13941a()) {
            invalidateSelf();
        }
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f20a != null) {
            this.f20a.setBounds(rect);
        } else {
            this.f6b.f12b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f20a != null ? this.f20a.setState(iArr) : this.f6b.f12b.setState(iArr);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f20a != null ? this.f20a.setLevel(i) : this.f6b.f12b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20a != null ? C0021a.m13853c(this.f20a) : this.f6b.f12b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f20a != null) {
            this.f20a.setAlpha(i);
        } else {
            this.f6b.f12b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f20a != null) {
            this.f20a.setColorFilter(colorFilter);
        } else {
            this.f6b.f12b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTint(int i) {
        if (this.f20a != null) {
            C0021a.m13862a(this.f20a, i);
        } else {
            this.f6b.f12b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintList(ColorStateList colorStateList) {
        if (this.f20a != null) {
            C0021a.m13860a(this.f20a, colorStateList);
        } else {
            this.f6b.f12b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f20a != null) {
            C0021a.m13857a(this.f20a, mode);
        } else {
            this.f6b.f12b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f20a != null) {
            return this.f20a.setVisible(z, z2);
        }
        this.f6b.f12b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f20a != null ? this.f20a.isStateful() : this.f6b.f12b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20a != null ? this.f20a.getOpacity() : this.f6b.f12b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20a != null ? this.f20a.getIntrinsicWidth() : this.f6b.f12b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20a != null ? this.f20a.getIntrinsicHeight() : this.f6b.f12b.getIntrinsicHeight();
    }

    /* renamed from: a */
    static TypedArray m13938a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f20a != null) {
            C0021a.m13858a(this.f20a, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m13938a = m13938a(resources, theme, attributeSet, C0000a.f4e);
                    int resourceId = m13938a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0011f m13914a = C0011f.m13914a(resources, resourceId, theme);
                        m13914a.m13909a(false);
                        m13914a.setCallback(this.f9e);
                        if (this.f6b.f12b != null) {
                            this.f6b.f12b.setCallback(null);
                        }
                        this.f6b.f12b = m13914a;
                    }
                    m13938a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0000a.f5f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f7c != null) {
                            m13936a(string, AnimatorInflater.loadAnimator(this.f7c, resourceId2));
                        } else {
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.support.p000a.p001a.AbstractC0010e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f20a != null) {
            C0021a.m13859a(this.f20a, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f20a != null) {
            return C0021a.m13852d(this.f20a);
        }
        return false;
    }

    /* renamed from: android.support.a.a.b$b */
    /* loaded from: classes.dex */
    private static class C0004b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f15a;

        public C0004b(Drawable.ConstantState constantState) {
            this.f15a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0001b c0001b = new C0001b();
            c0001b.f20a = this.f15a.newDrawable();
            c0001b.f20a.setCallback(c0001b.f9e);
            return c0001b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0001b c0001b = new C0001b();
            c0001b.f20a = this.f15a.newDrawable(resources);
            c0001b.f20a.setCallback(c0001b.f9e);
            return c0001b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0001b c0001b = new C0001b();
            c0001b.f20a = this.f15a.newDrawable(resources, theme);
            c0001b.f20a.setCallback(c0001b.f9e);
            return c0001b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f15a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15a.getChangingConfigurations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.a.a.b$a */
    /* loaded from: classes.dex */
    public static class C0003a extends Drawable.ConstantState {

        /* renamed from: a */
        int f11a;

        /* renamed from: b */
        C0011f f12b;

        /* renamed from: c */
        ArrayList<Animator> f13c;

        /* renamed from: d */
        C0160a<Animator, String> f14d;

        public C0003a(Context context, C0003a c0003a, Drawable.Callback callback, Resources resources) {
            if (c0003a != null) {
                this.f11a = c0003a.f11a;
                if (c0003a.f12b != null) {
                    Drawable.ConstantState constantState = c0003a.f12b.getConstantState();
                    if (resources != null) {
                        this.f12b = (C0011f) constantState.newDrawable(resources);
                    } else {
                        this.f12b = (C0011f) constantState.newDrawable();
                    }
                    this.f12b = (C0011f) this.f12b.mutate();
                    this.f12b.setCallback(callback);
                    this.f12b.setBounds(c0003a.f12b.getBounds());
                    this.f12b.m13909a(false);
                }
                if (c0003a.f13c != null) {
                    int size = c0003a.f13c.size();
                    this.f13c = new ArrayList<>(size);
                    this.f14d = new C0160a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c0003a.f13c.get(i);
                        Animator clone = animator.clone();
                        String str = c0003a.f14d.get(animator);
                        clone.setTarget(this.f12b.m13910a(str));
                        this.f13c.add(clone);
                        this.f14d.put(clone, str);
                    }
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 23.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 23.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11a;
        }
    }

    /* renamed from: a */
    private void m13940a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childAnimations.size()) {
                    break;
                }
                m13940a(childAnimations.get(i2));
                i = i2 + 1;
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f8d == null) {
                    this.f8d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f8d);
            }
        }
    }

    /* renamed from: a */
    private void m13936a(String str, Animator animator) {
        animator.setTarget(this.f6b.f12b.m13910a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m13940a(animator);
        }
        if (this.f6b.f13c == null) {
            this.f6b.f13c = new ArrayList<>();
            this.f6b.f14d = new C0160a<>();
        }
        this.f6b.f13c.add(animator);
        this.f6b.f14d.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.f20a != null) {
            return ((AnimatedVectorDrawable) this.f20a).isRunning();
        }
        ArrayList<Animator> arrayList = this.f6b.f13c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).isRunning()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m13941a() {
        ArrayList<Animator> arrayList = this.f6b.f13c;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f20a != null) {
            ((AnimatedVectorDrawable) this.f20a).start();
        } else if (!m13941a()) {
            ArrayList<Animator> arrayList = this.f6b.f13c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).start();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f20a != null) {
            ((AnimatedVectorDrawable) this.f20a).stop();
            return;
        }
        ArrayList<Animator> arrayList = this.f6b.f13c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).end();
        }
    }
}
