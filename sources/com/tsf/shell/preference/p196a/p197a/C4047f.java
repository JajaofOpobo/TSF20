package com.tsf.shell.preference.p196a.p197a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.censivn.C3DEngine.p031b.p037e.C0957j;
import com.tsf.C1306b;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.preference.a.a.f */
/* loaded from: classes.dex */
public class C4047f extends C0956i {

    /* renamed from: a */
    private C0938a f13238a;

    /* renamed from: b */
    private C0957j f13239b;

    /* renamed from: c */
    private int f13240c;

    public C4047f() {
        m10516a(C1306b.C1315i.text_preferences);
        C0957j c0957j = new C0957j();
        this.f13239b = c0957j;
        c0957j.m10488h(C1306b.C1315i.mn_folder_animation);
        c0957j.m10462a(new C0957j.C0959a() { // from class: com.tsf.shell.preference.a.a.f.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0957j.C0959a
            /* renamed from: a */
            public void mo842a() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.a.a.f.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C4047f.this.m844j();
                    }
                });
            }
        });
        mo838b(c0957j);
        C0938a c0938a = new C0938a();
        this.f13238a = c0938a;
        c0938a.m10488h(C1306b.C1315i.mn_folder_auto_close);
        c0938a.m10487i(C1306b.C1315i.mn_folder_auto_close_summary);
        c0938a.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.f.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C3430e.m2420t(z);
                return true;
            }
        });
        mo838b(c0938a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m844j() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
        builder.setTitle(C1306b.C1315i.mn_folder_animation);
        final int m2507ar = C3430e.m2507ar();
        builder.setSingleChoiceItems(new String[]{C4189x.m588c(C1306b.C1315i.mn_folder_animation_quick), C4189x.m588c(C1306b.C1315i.mn_folder_animation_normal)}, m2507ar, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.f.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C4047f.this.f13240c = i;
            }
        });
        builder.setPositiveButton(C1306b.C1315i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.f.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (m2507ar != C4047f.this.f13240c) {
                    C3430e.m2427r(C4047f.this.f13240c);
                    C4047f.this.m845i();
                }
            }
        });
        builder.setNegativeButton(C1306b.C1315i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.f.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }

    /* renamed from: i */
    public void m845i() {
        switch (C3430e.m2507ar()) {
            case 0:
                this.f13239b.m10490b(C4189x.m588c(C1306b.C1315i.mn_folder_animation_quick));
                return;
            case 1:
                this.f13239b.m10490b(C4189x.m588c(C1306b.C1315i.mn_folder_animation_normal));
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public static int m846c(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 1) {
            return 1;
        }
        return i;
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        m845i();
    }
}
