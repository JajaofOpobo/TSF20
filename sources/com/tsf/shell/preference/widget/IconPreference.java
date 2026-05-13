package com.tsf.shell.preference.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class IconPreference extends Preference {

    /* renamed from: a */
    private Drawable f13327a;

    /* renamed from: b */
    private ImageView f13328b;

    public IconPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutResource(C1306b.C1313g.icon_preferences);
        this.f13327a = context.obtainStyledAttributes(attributeSet, C1306b.C1316j.IconPreference, i, 0).getDrawable(C1306b.C1316j.IconPreference_ico);
    }

    @Override // android.preference.Preference
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f13328b != null) {
            this.f13328b.setEnabled(z);
        }
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ImageView imageView = (ImageView) view.findViewById(C1306b.C1311e.icon);
        this.f13328b = imageView;
        if (imageView != null && this.f13327a != null) {
            imageView.setImageDrawable(this.f13327a);
        }
        if (!isEnabled()) {
            this.f13328b.setEnabled(false);
        }
    }

    @Override // android.preference.Preference
    public void setIcon(Drawable drawable) {
        if ((drawable == null && this.f13327a != null) || (drawable != null && !drawable.equals(this.f13327a))) {
            this.f13327a = drawable;
            notifyChanged();
        }
    }

    @Override // android.preference.Preference
    public Drawable getIcon() {
        return this.f13327a;
    }
}
