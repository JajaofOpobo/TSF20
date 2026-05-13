package android.support.p013v7.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* renamed from: android.support.v7.widget.j */
/* loaded from: classes.dex */
class C0750j extends C0749i {

    /* renamed from: b */
    private static final int[] f2156b = {16843074};

    /* renamed from: c */
    private final SeekBar f2157c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0750j(SeekBar seekBar, C0742g c0742g) {
        super(seekBar, c0742g);
        this.f2157c = seekBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p013v7.widget.C0749i
    /* renamed from: a */
    public void mo11172a(AttributeSet attributeSet, int i) {
        super.mo11172a(attributeSet, i);
        C0725aa m11295a = C0725aa.m11295a(this.f2157c.getContext(), attributeSet, f2156b, i, 0);
        Drawable m11294b = m11295a.m11294b(0);
        if (m11294b != null) {
            this.f2157c.setThumb(m11294b);
        }
        m11295a.m11301a();
    }
}
