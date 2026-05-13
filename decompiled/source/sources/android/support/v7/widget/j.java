package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
class j extends i {
    private static final int[] b = {16843074};
    private final SeekBar c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(SeekBar seekBar, g gVar) {
        super(seekBar, gVar);
        this.c = seekBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.i
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        aa a = aa.a(this.c.getContext(), attributeSet, b, i, 0);
        Drawable b2 = a.b(0);
        if (b2 != null) {
            this.c.setThumb(b2);
        }
        a.a();
    }
}
