package android.support.p002v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.shell.theme.inside.element.ThemeElementType;
/* renamed from: android.support.v4.view.PagerTabStrip */
/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: f */
    private int f585f;

    /* renamed from: g */
    private int f586g;

    /* renamed from: h */
    private int f587h;

    /* renamed from: i */
    private int f588i;

    /* renamed from: j */
    private int f589j;

    /* renamed from: k */
    private int f590k;

    /* renamed from: l */
    private final Paint f591l;

    /* renamed from: m */
    private final Rect f592m;

    /* renamed from: n */
    private int f593n;

    /* renamed from: o */
    private boolean f594o;

    /* renamed from: p */
    private boolean f595p;

    /* renamed from: q */
    private int f596q;

    /* renamed from: r */
    private boolean f597r;

    /* renamed from: s */
    private float f598s;

    /* renamed from: t */
    private float f599t;

    /* renamed from: u */
    private int f600u;

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f591l = new Paint();
        this.f592m = new Rect();
        this.f593n = 255;
        this.f594o = false;
        this.f595p = false;
        this.f585f = this.f610e;
        this.f591l.setColor(this.f585f);
        float f = context.getResources().getDisplayMetrics().density;
        this.f586g = (int) ((3.0f * f) + 0.5f);
        this.f587h = (int) ((6.0f * f) + 0.5f);
        this.f588i = (int) (64.0f * f);
        this.f590k = (int) ((16.0f * f) + 0.5f);
        this.f596q = (int) ((1.0f * f) + 0.5f);
        this.f589j = (int) ((f * 32.0f) + 0.5f);
        this.f600u = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f607b.setFocusable(true);
        this.f607b.setOnClickListener(new View.OnClickListener() { // from class: android.support.v4.view.PagerTabStrip.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PagerTabStrip.this.f606a.setCurrentItem(PagerTabStrip.this.f606a.getCurrentItem() - 1);
            }
        });
        this.f609d.setFocusable(true);
        this.f609d.setOnClickListener(new View.OnClickListener() { // from class: android.support.v4.view.PagerTabStrip.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PagerTabStrip.this.f606a.setCurrentItem(PagerTabStrip.this.f606a.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.f594o = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.f585f = i;
        this.f591l.setColor(this.f585f);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getResources().getColor(i));
    }

    public int getTabIndicatorColor() {
        return this.f585f;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f587h) {
            i4 = this.f587h;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.p002v4.view.PagerTitleStrip
    public void setTextSpacing(int i) {
        if (i < this.f588i) {
            i = this.f588i;
        }
        super.setTextSpacing(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f595p) {
            this.f594o = drawable == null;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f595p) {
            this.f594o = ((-16777216) & i) == 0;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f595p) {
            this.f594o = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f594o = z;
        this.f595p = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.f594o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p002v4.view.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f589j);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || !this.f597r) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            switch (action) {
                case 0:
                    this.f598s = x;
                    this.f599t = y;
                    this.f597r = false;
                    break;
                case 1:
                    if (x < this.f608c.getLeft() - this.f590k) {
                        this.f606a.setCurrentItem(this.f606a.getCurrentItem() - 1);
                        break;
                    } else if (x > this.f608c.getRight() + this.f590k) {
                        this.f606a.setCurrentItem(this.f606a.getCurrentItem() + 1);
                        break;
                    }
                    break;
                case 2:
                    if (Math.abs(x - this.f598s) > this.f600u || Math.abs(y - this.f599t) > this.f600u) {
                        this.f597r = true;
                        break;
                    }
                    break;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f608c.getLeft() - this.f590k;
        int right = this.f608c.getRight() + this.f590k;
        int i = height - this.f586g;
        this.f591l.setColor((this.f593n << 24) | (this.f585f & ThemeElementType.PARSER_CONFIG_ALL));
        canvas.drawRect(left, i, right, height, this.f591l);
        if (this.f594o) {
            this.f591l.setColor((-16777216) | (this.f585f & ThemeElementType.PARSER_CONFIG_ALL));
            canvas.drawRect(getPaddingLeft(), height - this.f596q, getWidth() - getPaddingRight(), height, this.f591l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p002v4.view.PagerTitleStrip
    /* renamed from: a */
    public void mo13208a(int i, float f, boolean z) {
        Rect rect = this.f592m;
        int height = getHeight();
        int left = this.f608c.getLeft() - this.f590k;
        int right = this.f608c.getRight() + this.f590k;
        int i2 = height - this.f586g;
        rect.set(left, i2, right, height);
        super.mo13208a(i, f, z);
        this.f593n = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f608c.getLeft() - this.f590k, i2, this.f608c.getRight() + this.f590k, height);
        invalidate(rect);
    }
}
