package android.support.p013v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.p002v4.p005b.p006a.InterfaceMenuC0127a;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.support.p002v4.p009d.C0173h;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.view.menu.C0647n;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
@TargetApi(11)
/* renamed from: android.support.v7.view.f */
/* loaded from: classes.dex */
public class C0612f extends ActionMode {

    /* renamed from: a */
    final Context f1400a;

    /* renamed from: b */
    final AbstractC0607b f1401b;

    public C0612f(Context context, AbstractC0607b abstractC0607b) {
        this.f1400a = context;
        this.f1401b = abstractC0607b;
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1401b.m11870j();
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1401b.m11871a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1401b.mo11858b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1401b.mo11862a(charSequence);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1401b.mo11856d();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1401b.mo11857c();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return C0647n.m11679a(this.f1400a, (InterfaceMenuC0127a) this.f1401b.mo11860b());
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1401b.mo11855f();
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f1401b.mo11864a(i);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1401b.mo11854g();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f1401b.mo11859b(i);
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1401b.mo11852i();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1401b.mo11863a(view);
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1401b.mo11865a();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1401b.m11869k();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1401b.mo11861a(z);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1401b.mo11853h();
    }

    /* renamed from: android.support.v7.view.f$a */
    /* loaded from: classes.dex */
    public static class C0613a implements AbstractC0607b.InterfaceC0608a {

        /* renamed from: a */
        final ActionMode.Callback f1402a;

        /* renamed from: b */
        final Context f1403b;

        /* renamed from: c */
        final ArrayList<C0612f> f1404c = new ArrayList<>();

        /* renamed from: d */
        final C0173h<Menu, Menu> f1405d = new C0173h<>();

        public C0613a(Context context, ActionMode.Callback callback) {
            this.f1403b = context;
            this.f1402a = callback;
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: a */
        public boolean mo11850a(AbstractC0607b abstractC0607b, Menu menu) {
            return this.f1402a.onCreateActionMode(m11847b(abstractC0607b), m11848a(menu));
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: b */
        public boolean mo11846b(AbstractC0607b abstractC0607b, Menu menu) {
            return this.f1402a.onPrepareActionMode(m11847b(abstractC0607b), m11848a(menu));
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: a */
        public boolean mo11849a(AbstractC0607b abstractC0607b, MenuItem menuItem) {
            return this.f1402a.onActionItemClicked(m11847b(abstractC0607b), C0647n.m11678a(this.f1403b, (InterfaceMenuItemC0128b) menuItem));
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: a */
        public void mo11851a(AbstractC0607b abstractC0607b) {
            this.f1402a.onDestroyActionMode(m11847b(abstractC0607b));
        }

        /* renamed from: a */
        private Menu m11848a(Menu menu) {
            Menu menu2 = this.f1405d.get(menu);
            if (menu2 == null) {
                Menu m11679a = C0647n.m11679a(this.f1403b, (InterfaceMenuC0127a) menu);
                this.f1405d.put(menu, m11679a);
                return m11679a;
            }
            return menu2;
        }

        /* renamed from: b */
        public ActionMode m11847b(AbstractC0607b abstractC0607b) {
            int size = this.f1404c.size();
            for (int i = 0; i < size; i++) {
                C0612f c0612f = this.f1404c.get(i);
                if (c0612f != null && c0612f.f1401b == abstractC0607b) {
                    return c0612f;
                }
            }
            C0612f c0612f2 = new C0612f(this.f1403b, abstractC0607b);
            this.f1404c.add(c0612f2);
            return c0612f2;
        }
    }
}
