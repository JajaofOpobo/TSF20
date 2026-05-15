package com.tsf.shell.preference.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class IconPreference extends Preference {
    private Drawable a;
    private ImageView b;

    public IconPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutResource(b.g.icon_preferences);
        this.a = context.obtainStyledAttributes(attributeSet, b.j.IconPreference, i, 0).getDrawable(b.j.IconPreference_ico);
    }

    @Override // android.preference.Preference
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.b != null) {
            this.b.setEnabled(z);
        }
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ImageView imageView = (ImageView) view.findViewById(b.e.icon);
        this.b = imageView;
        if (imageView != null && this.a != null) {
            imageView.setImageDrawable(this.a);
        }
        if (!isEnabled()) {
            this.b.setEnabled(false);
        }
    }

    @Override // android.preference.Preference
    public void setIcon(Drawable drawable) {
        if ((drawable == null && this.a != null) || (drawable != null && !drawable.equals(this.a))) {
            this.a = drawable;
            notifyChanged();
        }
    }

    @Override // android.preference.Preference
    public Drawable getIcon() {
        return this.a;
    }
}
