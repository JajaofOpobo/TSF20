package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.tsf.shell.widget.alarm.b.AlarmDataEntry;
import com.tsf.shell.widget.alarm.AlarmTouchManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmDataBase extends AlarmDataEntry {
    public static int a = 198;
    public static int b = 69;
    public AlarmDataEntry.a c;
    public AlarmDataEntry.a d;
    public AlarmDataEntry.a e;
    public AlarmDataEntry.a f;
    public AlarmDataEntry.a g;
    public AlarmDataEntry.a h;

    public a(Context context, VTextureManager vTextureManager) {
        super(context, vTextureManager);
        this.c = new AlarmDataEntry.a(0, 0, 68, 68);
        this.d = new AlarmDataEntry.a(68, 0, 68, 68);
        this.e = new AlarmDataEntry.a(172, 35, 25, 31);
        this.f = new AlarmDataEntry.a(172, 2, 25, 31);
        this.g = new AlarmDataEntry.a(137, 35, 33, 31);
        this.h = new AlarmDataEntry.a(137, 2, 33, 31);
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected void a() {
        Bitmap bitmapB = b();
        this.k = this.j.createTexture(bitmapB, false);
        bitmapB.recycle();
    }

    public class Bitmap 
        return p.a(this.i, "alarm_btn");
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float c() {
        return 198.0f;
    }

    @Override // com.tsf.shell.widget.alarm.b.AlarmDataEntry
    protected float d() {
        return 69.0f;
    }
}
