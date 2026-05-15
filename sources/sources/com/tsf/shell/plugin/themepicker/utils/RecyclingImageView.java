package com.tsf.shell.plugin.themepicker.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class RecyclingImageView extends ImageView {
    public RecyclingImageView(Context context) {
        super(context);
    }

    public RecyclingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setImageDrawable(null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        super.setImageDrawable(drawable);
        a(drawable, true);
        a(drawable2, false);
    }

    private static void a(Drawable drawable, boolean z) {
        if (drawable instanceof g) {
            ((g) drawable).a(z);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                a(layerDrawable.getDrawable(i), z);
            }
        }
    }
}
