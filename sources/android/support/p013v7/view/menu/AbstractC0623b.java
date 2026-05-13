package android.support.p013v7.view.menu;

import android.content.Context;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* renamed from: android.support.v7.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0623b implements InterfaceC0643l {

    /* renamed from: a */
    protected Context f1494a;

    /* renamed from: b */
    protected Context f1495b;

    /* renamed from: c */
    protected C0628f f1496c;

    /* renamed from: d */
    protected LayoutInflater f1497d;

    /* renamed from: e */
    protected LayoutInflater f1498e;

    /* renamed from: f */
    protected InterfaceC0645m f1499f;

    /* renamed from: g */
    private InterfaceC0643l.InterfaceC0644a f1500g;

    /* renamed from: h */
    private int f1501h;

    /* renamed from: i */
    private int f1502i;

    /* renamed from: j */
    private int f1503j;

    /* renamed from: a */
    public abstract void mo11632a(C0632h c0632h, InterfaceC0645m.InterfaceC0646a interfaceC0646a);

    public AbstractC0623b(Context context, int i, int i2) {
        this.f1494a = context;
        this.f1497d = LayoutInflater.from(context);
        this.f1501h = i;
        this.f1502i = i2;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11319a(Context context, C0628f c0628f) {
        this.f1495b = context;
        this.f1498e = LayoutInflater.from(this.f1495b);
        this.f1496c = c0628f;
    }

    /* renamed from: a */
    public InterfaceC0645m mo11624a(ViewGroup viewGroup) {
        if (this.f1499f == null) {
            this.f1499f = (InterfaceC0645m) this.f1497d.inflate(this.f1501h, viewGroup, false);
            this.f1499f.mo11599a(this.f1496c);
            mo11313b(true);
        }
        return this.f1499f;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public void mo11313b(boolean z) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f1499f;
        if (viewGroup != null) {
            if (this.f1496c != null) {
                this.f1496c.m11749j();
                ArrayList<C0632h> m11750i = this.f1496c.m11750i();
                int size = m11750i.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    C0632h c0632h = m11750i.get(i3);
                    if (mo11635a(i, c0632h)) {
                        View childAt = viewGroup.getChildAt(i);
                        C0632h itemData = childAt instanceof InterfaceC0645m.InterfaceC0646a ? ((InterfaceC0645m.InterfaceC0646a) childAt).getItemData() : null;
                        View mo11631a = mo11631a(c0632h, childAt, viewGroup);
                        if (c0632h != itemData) {
                            mo11631a.setPressed(false);
                            C0309ai.m12889r(mo11631a);
                        }
                        if (mo11631a != childAt) {
                            m11799a(mo11631a, i);
                        }
                        i2 = i + 1;
                    } else {
                        i2 = i;
                    }
                    i3++;
                    i = i2;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo11623a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    protected void m11799a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1499f).addView(view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11623a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void m11800a(InterfaceC0643l.InterfaceC0644a interfaceC0644a) {
        this.f1500g = interfaceC0644a;
    }

    /* renamed from: a */
    public InterfaceC0643l.InterfaceC0644a m11802a() {
        return this.f1500g;
    }

    /* renamed from: b */
    public InterfaceC0645m.InterfaceC0646a m11798b(ViewGroup viewGroup) {
        return (InterfaceC0645m.InterfaceC0646a) this.f1497d.inflate(this.f1502i, viewGroup, false);
    }

    /* renamed from: a */
    public View mo11631a(C0632h c0632h, View view, ViewGroup viewGroup) {
        InterfaceC0645m.InterfaceC0646a m11798b;
        if (view instanceof InterfaceC0645m.InterfaceC0646a) {
            m11798b = (InterfaceC0645m.InterfaceC0646a) view;
        } else {
            m11798b = m11798b(viewGroup);
        }
        mo11632a(c0632h, m11798b);
        return (View) m11798b;
    }

    /* renamed from: a */
    public boolean mo11635a(int i, C0632h c0632h) {
        return true;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11317a(C0628f c0628f, boolean z) {
        if (this.f1500g != null) {
            this.f1500g.mo11116a(c0628f, z);
        }
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public boolean mo11316a(SubMenuC0649p subMenuC0649p) {
        if (this.f1500g != null) {
            return this.f1500g.mo11114a_(subMenuC0649p);
        }
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public boolean mo11315b() {
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public boolean mo11318a(C0628f c0628f, C0632h c0632h) {
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public boolean mo11314b(C0628f c0628f, C0632h c0632h) {
        return false;
    }

    /* renamed from: a */
    public void m11801a(int i) {
        this.f1503j = i;
    }
}
