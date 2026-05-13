package com.tsf.shell.p096f.p118e.p129h;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.shell.Home;
import com.tsf.shell.activity.PhotoSelectorActivity;
import com.tsf.shell.utils.C4181q;
/* renamed from: com.tsf.shell.f.e.h.a */
/* loaded from: classes.dex */
public class C2611a implements C0913a.InterfaceC0914a {

    /* renamed from: a */
    private static C2611a f8597a;

    /* renamed from: b */
    private InterfaceC2613a f8598b;

    /* renamed from: c */
    private int f8599c;

    /* renamed from: com.tsf.shell.f.e.h.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2613a {
        /* renamed from: a */
        void mo3470a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static void m5163a(InterfaceC2613a interfaceC2613a, int i, int i2) {
        if (f8597a == null) {
            f8597a = new C2611a();
        }
        f8597a.m5160b(interfaceC2613a, i, i2);
    }

    /* renamed from: b */
    public void m5160b(InterfaceC2613a interfaceC2613a, int i, int i2) {
        this.f8598b = interfaceC2613a;
        Intent intent = new Intent();
        intent.setClass(C0853a.m10856d(), PhotoSelectorActivity.class);
        intent.putExtra("image_width", i);
        intent.putExtra("image_height", i2);
        this.f8599c = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) this);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, final Intent intent) {
        if (i2 == -1) {
            if (i == this.f8599c) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.e.h.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap m635d;
                        if (intent.getIntExtra("data_mode", 0) == 0) {
                            m635d = (Bitmap) intent.getParcelableExtra("data");
                        } else {
                            m635d = C4181q.m635d(BitmapFactory.decodeFile(intent.getData().getPath()), intent.getIntExtra("image_width", 100), intent.getIntExtra("image_height", 100));
                        }
                        if (C2611a.this.f8598b != null) {
                            try {
                                C2611a.this.f8598b.mo3470a(m635d);
                                C2611a.this.f8598b = null;
                                return;
                            } catch (Exception e) {
                                C2611a.this.f8598b = null;
                                m635d.recycle();
                                return;
                            }
                        }
                        m635d.recycle();
                    }
                });
                return;
            }
            return;
        }
        this.f8598b = null;
    }
}
