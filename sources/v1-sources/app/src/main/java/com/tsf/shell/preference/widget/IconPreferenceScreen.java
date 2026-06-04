package com.tsf.shell.preference.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class IconPreferenceScreen extends Preference {
    private Drawable a;

    public IconPreferenceScreen(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconPreferenceScreen(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutResource(R.layout.icon_preferences);
        this.a = context.obtainStyledAttributes(attributeSet, R.styleable.b, i, 0).getDrawable(0);
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        if (imageView != null && this.a != null) {
            imageView.setImageDrawable(this.a);
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
