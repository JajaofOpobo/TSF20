package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {
    private j a;
    private g b;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0012a.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = g.a();
        this.a = new j(this, this.b);
        this.a.a(attributeSet, i);
    }
}
