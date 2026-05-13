package com.tsf.shell.p096f.p148h.p149a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p037e.C0957j;
import com.tsf.C1306b;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.h.a.b */
/* loaded from: classes.dex */
public class C3069b extends C0957j {

    /* renamed from: a */
    private int f9956a;

    /* renamed from: b */
    private int f9957b;

    public C3069b() {
        m10488h(C1306b.C1315i.text_direction);
        m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.f.h.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.h.a.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3069b.this.m3675h();
                    }
                });
            }
        });
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        this.f9956a = C3430e.m2534aB();
        switch (this.f9956a) {
            case 0:
                this.f9956a = 0;
                break;
            case 1:
                this.f9956a = 1;
                break;
            default:
                this.f9956a = 0;
                break;
        }
        m3674m();
    }

    /* renamed from: e */
    public int m3676e() {
        return this.f9956a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m3674m() {
        if (this.f9956a == 0) {
            m10487i(C1306b.C1315i.text_top);
        } else {
            m10487i(C1306b.C1315i.text_bottom);
        }
    }

    /* renamed from: h */
    public void m3675h() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
        builder.setTitle(C1306b.C1315i.text_direction);
        builder.setSingleChoiceItems(new String[]{C4189x.m588c(C1306b.C1315i.text_top), C4189x.m588c(C1306b.C1315i.text_bottom)}, this.f9956a, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.h.a.b.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C3069b.this.f9957b = i;
            }
        });
        builder.setPositiveButton(C1306b.C1315i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.h.a.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (C3069b.this.f9956a != C3069b.this.f9957b) {
                    C3069b.this.f9956a = C3069b.this.f9957b;
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.h.a.b.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3069b.this.m3674m();
                        }
                    });
                }
            }
        });
        builder.setNegativeButton(C1306b.C1315i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.h.a.b.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }
}
