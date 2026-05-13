package com.tsf.extend.theme;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class ThemeShareIconImageView extends ImageView {
    private boolean a;

    public ThemeShareIconImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            setPressed(false);
        }
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        Drawable drawable = getDrawable();
        if (drawable != null && this.a != z) {
            this.a = z;
            if (this.a) {
                drawable.setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
            } else {
                drawable.clearColorFilter();
            }
            invalidate();
        }
    }
}
