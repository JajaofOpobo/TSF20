package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.ai;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class b implements l {
    protected Context a;
    protected Context b;
    protected f c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    protected m f;
    private l.a g;
    private int h;
    private int i;
    private int j;

    public abstract void a(h hVar, m.a aVar);

    public b(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.h = i;
        this.i = i2;
    }

    @Override // android.support.v7.view.menu.l
    public void a(Context context, f fVar) {
        this.b = context;
        this.e = LayoutInflater.from(this.b);
        this.c = fVar;
    }

    public m a(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = (m) this.d.inflate(this.h, viewGroup, false);
            this.f.a(this.c);
            b(true);
        }
        return this.f;
    }

    @Override // android.support.v7.view.menu.l
    public void b(boolean z) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup != null) {
            if (this.c != null) {
                this.c.j();
                ArrayList<h> i3 = this.c.i();
                int size = i3.size();
                int i4 = 0;
                i = 0;
                while (i4 < size) {
                    h hVar = i3.get(i4);
                    if (a(i, hVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof m.a ? ((m.a) childAt).getItemData() : null;
                        View a = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            a.setPressed(false);
                            ai.r(a);
                        }
                        if (a != childAt) {
                            a(a, i);
                        }
                        i2 = i + 1;
                    } else {
                        i2 = i;
                    }
                    i4++;
                    i = i2;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f).addView(view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public void a(l.a aVar) {
        this.g = aVar;
    }

    public l.a a() {
        return this.g;
    }

    public m.a b(ViewGroup viewGroup) {
        return (m.a) this.d.inflate(this.i, viewGroup, false);
    }

    public View a(h hVar, View view, ViewGroup viewGroup) {
        m.a b;
        if (view instanceof m.a) {
            b = (m.a) view;
        } else {
            b = b(viewGroup);
        }
        a(hVar, b);
        return (View) b;
    }

    public boolean a(int i, h hVar) {
        return true;
    }

    @Override // android.support.v7.view.menu.l
    public void a(f fVar, boolean z) {
        if (this.g != null) {
            this.g.a(fVar, z);
        }
    }

    @Override // android.support.v7.view.menu.l
    public boolean a(p pVar) {
        if (this.g != null) {
            return this.g.a_(pVar);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean b() {
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean a(f fVar, h hVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean b(f fVar, h hVar) {
        return false;
    }

    public void a(int i) {
        this.j = i;
    }
}
