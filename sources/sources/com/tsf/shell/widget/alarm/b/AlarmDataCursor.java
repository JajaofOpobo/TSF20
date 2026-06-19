package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.shell.widget.alarm.b.AlarmDataEntry;
import com.tsf.shell.widget.alarm.AlarmTouchManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmDataCursor extends AlarmDataEntry {
    public AlarmDataEntry.a[] a;
    public AlarmDataEntry.a b;
    public AlarmDataEntry.a c;

    public AlarmDataCursor(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.a = new AlarmDataEntry.a[10];
        for (int i = 0; i < 10; i++) {
            this.a[i] = new AlarmDataEntry.a(i * 41, 0, 41, 86);
        }
        this.b = new AlarmDataEntry.a(436, 26, 31, 43);
        this.c = new AlarmDataEntry.a(410, 0, 26, 86);
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected void a() {
        Bitmap bitmapA = p.a(this.i, "digital_clock");
        this.k = this.j.createTexture(bitmapA, false);
        bitmapA.recycle();
    }

    public Bitmap c() {
                return p.a(this.i, "digital_clock");
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float c() {
        return 470.0f;
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float d() {
        return 86.0f;
    }

    public void a(VRectangle vRectangle, int i) {
        this.a[i].a(vRectangle);
    }
}
