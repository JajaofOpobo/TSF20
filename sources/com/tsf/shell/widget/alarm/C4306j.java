package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.C0879Uv;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.primitives.VRectangle;
/* renamed from: com.tsf.shell.widget.alarm.j */
/* loaded from: classes.dex */
public class C4306j extends VRectangle {

    /* renamed from: a */
    public static TextureElement f13973a;

    /* renamed from: b */
    public static TextureElement f13974b;

    /* renamed from: c */
    public C0879Uv[] f13975c;

    /* renamed from: d */
    private int f13976d;

    /* renamed from: e */
    private InterfaceC4308a f13977e;

    /* renamed from: f */
    private final float f13978f;

    /* renamed from: g */
    private final float f13979g;

    /* renamed from: h */
    private final float f13980h;

    /* renamed from: i */
    private final float f13981i;

    /* renamed from: com.tsf.shell.widget.alarm.j$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4308a {
        /* renamed from: a */
        void mo252a();
    }

    /* renamed from: a */
    public void m254a(InterfaceC4308a interfaceC4308a) {
        this.f13977e = interfaceC4308a;
    }

    public C4306j() {
        super(33.333332f, 34.166664f);
        this.f13975c = new C0879Uv[4];
        this.f13978f = 40.0f;
        this.f13979g = 41.0f;
        this.f13980h = 40.0f;
        this.f13981i = 496.0f;
        if (f13973a == null) {
            Bitmap m230a = C4324p.m230a(AlarmWidget.f13714h, "back_number");
            f13973a = AlarmWidget.f13709c.createTexture(m230a, true);
            m230a.recycle();
        }
        if (f13974b == null) {
            Bitmap m230a2 = C4324p.m230a(AlarmWidget.f13714h, "back_number_minute");
            f13974b = AlarmWidget.f13709c.createTexture(m230a2, true);
            m230a2.recycle();
        }
        m255a(0);
    }

    /* renamed from: a */
    public static void m257a() {
        AlarmWidget.f13711e.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.j.1
            @Override // java.lang.Runnable
            public void run() {
                if (C4306j.f13973a != null) {
                    Bitmap m230a = C4324p.m230a(AlarmWidget.f13714h, "back_number");
                    C4324p.m232a(C4306j.f13973a.f2529id, m230a, 0, 0);
                    m230a.recycle();
                }
                if (C4306j.f13974b != null) {
                    Bitmap m230a2 = C4324p.m230a(AlarmWidget.f13714h, "back_number_minute");
                    C4324p.m232a(C4306j.f13974b.f2529id, m230a2, 0, 0);
                    m230a2.recycle();
                }
            }
        }, VMessageQueueManager.TYPE_GL_THREAD);
    }

    /* renamed from: a */
    public void m255a(int i) {
        int i2 = i % 12;
        if (i2 < 0) {
            i2 += 12;
        }
        int i3 = 11 - i2;
        if (this.f13976d != i3) {
            m256a(0.0f, i3 * 41);
            if (((this.f13976d == 10 && i3 == 11) || (this.f13976d == 11 && i3 == 10)) && this.f13977e != null) {
                this.f13977e.mo252a();
            }
            this.f13976d = i3;
            C4305i.m259c("SetNumber:" + i3);
        }
    }

    /* renamed from: b */
    public int m253b() {
        return this.f13976d;
    }

    /* renamed from: a */
    public void m256a(float f, float f2) {
        C0879Uv[] c0879UvArr = this.f13975c;
        C0879Uv c0879Uv = new C0879Uv();
        c0879UvArr[0] = c0879Uv;
        c0879Uv.f2530u = (f + 40.0f) / 40.0f;
        c0879Uv.f2531v = (f2 + 41.0f) / 496.0f;
        C0879Uv[] c0879UvArr2 = this.f13975c;
        C0879Uv c0879Uv2 = new C0879Uv();
        c0879UvArr2[1] = c0879Uv2;
        c0879Uv2.f2530u = f / 40.0f;
        c0879Uv2.f2531v = (f2 + 41.0f) / 496.0f;
        C0879Uv[] c0879UvArr3 = this.f13975c;
        C0879Uv c0879Uv3 = new C0879Uv();
        c0879UvArr3[2] = c0879Uv3;
        c0879Uv3.f2530u = (f + 40.0f) / 40.0f;
        c0879Uv3.f2531v = f2 / 496.0f;
        C0879Uv[] c0879UvArr4 = this.f13975c;
        C0879Uv c0879Uv4 = new C0879Uv();
        c0879UvArr4[3] = c0879Uv4;
        c0879Uv4.f2530u = f / 40.0f;
        c0879Uv4.f2531v = f2 / 496.0f;
        for (int i = 0; i < 4; i++) {
            m10748uv().set(i, this.f13975c[i]);
        }
        updateUvsVBO();
    }
}
