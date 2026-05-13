package com.tsf.shell.widget.p200a.p201a;

import android.content.Context;
import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.tsf.shell.widget.p200a.C4192a;
import com.tsf.shell.widget.p200a.C4220h;
import com.tsf.shell.widget.p200a.p201a.C4204c;
/* renamed from: com.tsf.shell.widget.a.a.b */
/* loaded from: classes.dex */
public class C4200b extends C0956i {

    /* renamed from: a */
    private InterfaceC4203a f13554a;

    /* renamed from: b */
    private C0938a f13555b;

    /* renamed from: c */
    private C4192a f13556c;

    /* renamed from: com.tsf.shell.widget.a.a.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4203a {
        /* renamed from: a */
        void mo506a();

        /* renamed from: b */
        void mo503b();
    }

    /* renamed from: a */
    public void m555a(InterfaceC4203a interfaceC4203a) {
        this.f13554a = interfaceC4203a;
    }

    public C4200b(Context context, C4192a c4192a) {
        this.f13556c = c4192a;
        m10511a(context.getString(C4220h.C4221a.widget_dots_clock_setting));
        mo838b(new C4198a(context, c4192a));
        this.f13555b = new C0938a();
        this.f13555b.m10491a(context.getString(C4220h.C4221a.widget_dots_clock_shownumber));
        this.f13555b.m10535c(this.f13556c.f13519c.f13620a);
        this.f13555b.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.widget.a.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C4200b.this.f13556c.f13519c.f13620a = z;
                C4200b.this.f13556c.m574a(z);
                return true;
            }
        });
        mo838b(this.f13555b);
        C4204c c4204c = new C4204c(context);
        c4204c.m10492l();
        c4204c.m547a(context.getString(C4220h.C4221a.widget_dots_clock_color));
        c4204c.m549a(new C4204c.InterfaceC4210c() { // from class: com.tsf.shell.widget.a.a.b.2
            @Override // com.tsf.shell.widget.p200a.p201a.C4204c.InterfaceC4210c
            /* renamed from: a */
            public boolean mo524a(int i) {
                C4200b.this.f13556c.f13519c.f13621b = i;
                C4200b.this.f13556c.m579a(i);
                return false;
            }
        });
        mo838b(c4204c);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        if (this.f13554a != null) {
            this.f13554a.mo503b();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        if (this.f13554a != null) {
            this.f13554a.mo506a();
        }
    }
}
