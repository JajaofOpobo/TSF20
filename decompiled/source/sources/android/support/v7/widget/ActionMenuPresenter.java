package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.support.v7.a.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.ListPopupWindow;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends android.support.v7.view.menu.b implements d.a {
    private b A;
    final f g;
    int h;
    private d i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private final SparseBooleanArray v;
    private View w;
    private e x;
    private a y;
    private c z;

    public ActionMenuPresenter(Context context) {
        super(context, a.h.abc_action_menu_layout, a.h.abc_action_menu_item_layout);
        this.v = new SparseBooleanArray();
        this.g = new f();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.l
    public void a(Context context, android.support.v7.view.menu.f fVar) {
        super.a(context, fVar);
        Resources resources = context.getResources();
        android.support.v7.view.a a2 = android.support.v7.view.a.a(context);
        if (!this.m) {
            this.l = a2.b();
        }
        if (!this.s) {
            this.n = a2.c();
        }
        if (!this.q) {
            this.p = a2.a();
        }
        int i = this.n;
        if (this.l) {
            if (this.i == null) {
                this.i = new d(this.a);
                if (this.k) {
                    this.i.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = i;
        this.u = (int) (56.0f * resources.getDisplayMetrics().density);
        this.w = null;
    }

    public void a(Configuration configuration) {
        if (!this.q) {
            this.p = this.b.getResources().getInteger(a.g.abc_max_action_buttons);
        }
        if (this.c != null) {
            this.c.b(true);
        }
    }

    public void c(boolean z) {
        this.l = z;
        this.m = true;
    }

    public void d(boolean z) {
        this.t = z;
    }

    public void a(Drawable drawable) {
        if (this.i != null) {
            this.i.setImageDrawable(drawable);
            return;
        }
        this.k = true;
        this.j = drawable;
    }

    public Drawable c() {
        if (this.i != null) {
            return this.i.getDrawable();
        }
        if (this.k) {
            return this.j;
        }
        return null;
    }

    @Override // android.support.v7.view.menu.b
    public android.support.v7.view.menu.m a(ViewGroup viewGroup) {
        android.support.v7.view.menu.m a2 = super.a(viewGroup);
        ((ActionMenuView) a2).setPresenter(this);
        return a2;
    }

    @Override // android.support.v7.view.menu.b
    public View a(android.support.v7.view.menu.h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.n()) {
            actionView = super.a(hVar, view, viewGroup);
        }
        actionView.setVisibility(hVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.b
    public void a(android.support.v7.view.menu.h hVar, m.a aVar) {
        aVar.a(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.A == null) {
            this.A = new b();
        }
        actionMenuItemView.setPopupCallback(this.A);
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(int i, android.support.v7.view.menu.h hVar) {
        return hVar.j();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.l
    public void b(boolean z) {
        boolean z2 = false;
        ViewGroup viewGroup = (ViewGroup) ((View) this.f).getParent();
        if (viewGroup != null) {
            android.support.v7.d.a.a(viewGroup);
        }
        super.b(z);
        ((View) this.f).requestLayout();
        if (this.c != null) {
            ArrayList<android.support.v7.view.menu.h> k = this.c.k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                android.support.v4.view.d a2 = k.get(i).a();
                if (a2 != null) {
                    a2.a(this);
                }
            }
        }
        ArrayList<android.support.v7.view.menu.h> l = this.c != null ? this.c.l() : null;
        if (this.l && l != null) {
            int size2 = l.size();
            if (size2 == 1) {
                z2 = !l.get(0).isActionViewExpanded();
            } else {
                z2 = size2 > 0;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new d(this.a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.i.getParent();
            if (viewGroup2 != this.f) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.i, actionMenuView.c());
            }
        } else if (this.i != null && this.i.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.i);
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.l);
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.i) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.l
    public boolean a(android.support.v7.view.menu.p pVar) {
        if (pVar.hasVisibleItems()) {
            android.support.v7.view.menu.p pVar2 = pVar;
            while (pVar2.s() != this.c) {
                pVar2 = (android.support.v7.view.menu.p) pVar2.s();
            }
            View a2 = a(pVar2.getItem());
            if (a2 == null) {
                if (this.i == null) {
                    return false;
                }
                a2 = this.i;
            }
            this.h = pVar.getItem().getItemId();
            this.y = new a(this, this.b, pVar);
            this.y.a(a2);
            this.y.a();
            super.a(pVar);
            return true;
        }
        return false;
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof m.a) && ((m.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean d() {
        if (!this.l || h() || this.c == null || this.f == null || this.z != null || this.c.l().isEmpty()) {
            return false;
        }
        this.z = new c(new e(this.b, this.c, this.i, true));
        ((View) this.f).post(this.z);
        super.a((android.support.v7.view.menu.p) null);
        return true;
    }

    public boolean e() {
        if (this.z != null && this.f != null) {
            ((View) this.f).removeCallbacks(this.z);
            this.z = null;
            return true;
        }
        e eVar = this.x;
        if (eVar != null) {
            eVar.e();
            return true;
        }
        return false;
    }

    public boolean f() {
        return e() | g();
    }

    public boolean g() {
        if (this.y != null) {
            this.y.e();
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.x != null && this.x.f();
    }

    public boolean i() {
        return this.z != null || h();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.l
    public boolean b() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        ArrayList<android.support.v7.view.menu.h> i9 = this.c.i();
        int size = i9.size();
        int i10 = this.p;
        int i11 = this.o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i12 = 0;
        int i13 = 0;
        boolean z3 = false;
        int i14 = 0;
        while (i14 < size) {
            android.support.v7.view.menu.h hVar = i9.get(i14);
            if (hVar.l()) {
                i12++;
            } else if (hVar.k()) {
                i13++;
            } else {
                z3 = true;
            }
            i14++;
            i10 = (this.t && hVar.isActionViewExpanded()) ? 0 : i10;
        }
        if (this.l && (z3 || i12 + i13 > i10)) {
            i10--;
        }
        int i15 = i10 - i12;
        SparseBooleanArray sparseBooleanArray = this.v;
        sparseBooleanArray.clear();
        int i16 = 0;
        if (!this.r) {
            i = 0;
        } else {
            i16 = i11 / this.u;
            i = ((i11 % this.u) / i16) + this.u;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = i16;
        while (i17 < size) {
            android.support.v7.view.menu.h hVar2 = i9.get(i17);
            if (hVar2.l()) {
                View a2 = a(hVar2, this.w, viewGroup);
                if (this.w == null) {
                    this.w = a2;
                }
                if (this.r) {
                    i19 -= ActionMenuView.a(a2, i, i19, makeMeasureSpec, 0);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i2 = a2.getMeasuredWidth();
                int i20 = i11 - i2;
                if (i18 != 0) {
                    i2 = i18;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.d(true);
                i3 = i20;
                i4 = i15;
            } else if (hVar2.k()) {
                int groupId2 = hVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i15 > 0 || z4) && i11 > 0 && (!this.r || i19 > 0);
                if (z5) {
                    View a3 = a(hVar2, this.w, viewGroup);
                    if (this.w == null) {
                        this.w = a3;
                    }
                    if (this.r) {
                        int a4 = ActionMenuView.a(a3, i, i19, makeMeasureSpec, 0);
                        int i21 = i19 - a4;
                        z2 = a4 == 0 ? false : z5;
                        i8 = i21;
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z6 = z5;
                        i8 = i19;
                        z2 = z6;
                    }
                    int measuredWidth = a3.getMeasuredWidth();
                    i11 -= measuredWidth;
                    if (i18 == 0) {
                        i18 = measuredWidth;
                    }
                    if (this.r) {
                        z = z2 & (i11 >= 0);
                        i5 = i18;
                        i6 = i8;
                    } else {
                        z = z2 & (i11 + i18 > 0);
                        i5 = i18;
                        i6 = i8;
                    }
                } else {
                    z = z5;
                    i5 = i18;
                    i6 = i19;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i7 = i15;
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i22 = i15;
                    for (int i23 = 0; i23 < i17; i23++) {
                        android.support.v7.view.menu.h hVar3 = i9.get(i23);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.j()) {
                                i22++;
                            }
                            hVar3.d(false);
                        }
                    }
                    i7 = i22;
                } else {
                    i7 = i15;
                }
                if (z) {
                    i7--;
                }
                hVar2.d(z);
                i2 = i5;
                i3 = i11;
                int i24 = i6;
                i4 = i7;
                i19 = i24;
            } else {
                hVar2.d(false);
                i2 = i18;
                i3 = i11;
                i4 = i15;
            }
            i17++;
            i11 = i3;
            i15 = i4;
            i18 = i2;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.l
    public void a(android.support.v7.view.menu.f fVar, boolean z) {
        f();
        super.a(fVar, z);
    }

    @Override // android.support.v4.view.d.a
    public void a(boolean z) {
        if (z) {
            super.a((android.support.v7.view.menu.p) null);
        } else {
            this.c.a(false);
        }
    }

    public void a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.ActionMenuPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int a;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {
        private final float[] b;

        public d(Context context) {
            super(context, null, a.C0012a.actionOverflowButtonStyle);
            this.b = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new ListPopupWindow.b(this) { // from class: android.support.v7.widget.ActionMenuPresenter.d.1
                @Override // android.support.v7.widget.ListPopupWindow.b
                public ListPopupWindow a() {
                    if (ActionMenuPresenter.this.x != null) {
                        return ActionMenuPresenter.this.x.c();
                    }
                    return null;
                }

                @Override // android.support.v7.widget.ListPopupWindow.b
                public boolean b() {
                    ActionMenuPresenter.this.d();
                    return true;
                }

                @Override // android.support.v7.widget.ListPopupWindow.b
                public boolean c() {
                    if (ActionMenuPresenter.this.z != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.e();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                ActionMenuPresenter.this.d();
            }
            return true;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean d() {
            return false;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                android.support.v4.a.a.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends android.support.v7.view.menu.k {
        public e(Context context, android.support.v7.view.menu.f fVar, View view, boolean z) {
            super(context, fVar, view, z, a.C0012a.actionOverflowMenuStyle);
            a(8388613);
            a(ActionMenuPresenter.this.g);
        }

        @Override // android.support.v7.view.menu.k, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            if (ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.close();
            }
            ActionMenuPresenter.this.x = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends android.support.v7.view.menu.k {
        final /* synthetic */ ActionMenuPresenter c;
        private android.support.v7.view.menu.p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActionMenuPresenter actionMenuPresenter, Context context, android.support.v7.view.menu.p pVar) {
            super(context, pVar, null, false, a.C0012a.actionOverflowMenuStyle);
            boolean z = false;
            this.c = actionMenuPresenter;
            this.d = pVar;
            if (!((android.support.v7.view.menu.h) pVar.getItem()).j()) {
                a(actionMenuPresenter.i == null ? (View) actionMenuPresenter.f : actionMenuPresenter.i);
            }
            a(actionMenuPresenter.g);
            int size = pVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = pVar.getItem(i);
                if (!item.isVisible() || item.getIcon() == null) {
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            a(z);
        }

        @Override // android.support.v7.view.menu.k, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            this.c.y = null;
            this.c.h = 0;
        }
    }

    /* loaded from: classes.dex */
    private class f implements l.a {
        private f() {
        }

        @Override // android.support.v7.view.menu.l.a
        public boolean a_(android.support.v7.view.menu.f fVar) {
            if (fVar == null) {
                return false;
            }
            ActionMenuPresenter.this.h = ((android.support.v7.view.menu.p) fVar).getItem().getItemId();
            l.a a = ActionMenuPresenter.this.a();
            return a != null ? a.a_(fVar) : false;
        }

        @Override // android.support.v7.view.menu.l.a
        public void a(android.support.v7.view.menu.f fVar, boolean z) {
            if (fVar instanceof android.support.v7.view.menu.p) {
                ((android.support.v7.view.menu.p) fVar).p().a(false);
            }
            l.a a = ActionMenuPresenter.this.a();
            if (a != null) {
                a.a(fVar, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private e b;

        public c(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuPresenter.this.c.f();
            View view = (View) ActionMenuPresenter.this.f;
            if (view != null && view.getWindowToken() != null && this.b.d()) {
                ActionMenuPresenter.this.x = this.b;
            }
            ActionMenuPresenter.this.z = null;
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        private b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public ListPopupWindow a() {
            if (ActionMenuPresenter.this.y != null) {
                return ActionMenuPresenter.this.y.c();
            }
            return null;
        }
    }
}
