package android.support.v7.widget;

import android.R;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class j extends i {
    private static final int[] b = {R.attr.thumb};
    private final SeekBar c;

    j(SeekBar seekBar, g gVar) {
        super(seekBar, gVar);
        this.c = seekBar;
    }

    @Override // android.support.v7.widget.i
    void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        aa aaVarA = aa.a(this.c.getContext(), attributeSet, b, i, 0);
        Drawable drawableB = aaVarA.b(0);
        if (drawableB != null) {
            this.c.setThumb(drawableB);
        }
        aaVarA.a();
    }
}
