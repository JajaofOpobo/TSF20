package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.p018d.C0605a;
import android.support.p013v7.view.C0606a;
import android.support.p013v7.view.menu.AbstractC0623b;
import android.support.p013v7.view.menu.ActionMenuItemView;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.C0632h;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.support.p013v7.view.menu.SubMenuC0649p;
import android.support.p013v7.view.menu.View$OnKeyListenerC0641k;
import android.support.p013v7.widget.ActionMenuView;
import android.support.p013v7.widget.ListPopupWindow;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.ActionMenuPresenter */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends AbstractC0623b implements AbstractC0388d.InterfaceC0389a {

    /* renamed from: A */
    private C0659b f1660A;

    /* renamed from: g */
    final C0664f f1661g;

    /* renamed from: h */
    int f1662h;

    /* renamed from: i */
    private C0661d f1663i;

    /* renamed from: j */
    private Drawable f1664j;

    /* renamed from: k */
    private boolean f1665k;

    /* renamed from: l */
    private boolean f1666l;

    /* renamed from: m */
    private boolean f1667m;

    /* renamed from: n */
    private int f1668n;

    /* renamed from: o */
    private int f1669o;

    /* renamed from: p */
    private int f1670p;

    /* renamed from: q */
    private boolean f1671q;

    /* renamed from: r */
    private boolean f1672r;

    /* renamed from: s */
    private boolean f1673s;

    /* renamed from: t */
    private boolean f1674t;

    /* renamed from: u */
    private int f1675u;

    /* renamed from: v */
    private final SparseBooleanArray f1676v;

    /* renamed from: w */
    private View f1677w;

    /* renamed from: x */
    private C0663e f1678x;

    /* renamed from: y */
    private C0658a f1679y;

    /* renamed from: z */
    private RunnableC0660c f1680z;

    public ActionMenuPresenter(Context context) {
        super(context, C0535a.C0543h.abc_action_menu_layout, C0535a.C0543h.abc_action_menu_item_layout);
        this.f1676v = new SparseBooleanArray();
        this.f1661g = new C0664f();
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b, android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11319a(Context context, C0628f c0628f) {
        super.mo11319a(context, c0628f);
        Resources resources = context.getResources();
        C0606a m11878a = C0606a.m11878a(context);
        if (!this.f1667m) {
            this.f1666l = m11878a.m11877b();
        }
        if (!this.f1673s) {
            this.f1668n = m11878a.m11876c();
        }
        if (!this.f1671q) {
            this.f1670p = m11878a.m11879a();
        }
        int i = this.f1668n;
        if (this.f1666l) {
            if (this.f1663i == null) {
                this.f1663i = new C0661d(this.f1494a);
                if (this.f1665k) {
                    this.f1663i.setImageDrawable(this.f1664j);
                    this.f1664j = null;
                    this.f1665k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1663i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1663i.getMeasuredWidth();
        } else {
            this.f1663i = null;
        }
        this.f1669o = i;
        this.f1675u = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f1677w = null;
    }

    /* renamed from: a */
    public void m11634a(Configuration configuration) {
        if (!this.f1671q) {
            this.f1670p = this.f1495b.getResources().getInteger(C0535a.C0542g.abc_max_action_buttons);
        }
        if (this.f1496c != null) {
            this.f1496c.m11761b(true);
        }
    }

    /* renamed from: c */
    public void m11618c(boolean z) {
        this.f1666l = z;
        this.f1667m = true;
    }

    /* renamed from: d */
    public void m11615d(boolean z) {
        this.f1674t = z;
    }

    /* renamed from: a */
    public void m11633a(Drawable drawable) {
        if (this.f1663i != null) {
            this.f1663i.setImageDrawable(drawable);
            return;
        }
        this.f1665k = true;
        this.f1664j = drawable;
    }

    /* renamed from: c */
    public Drawable m11620c() {
        if (this.f1663i != null) {
            return this.f1663i.getDrawable();
        }
        if (this.f1665k) {
            return this.f1664j;
        }
        return null;
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b
    /* renamed from: a */
    public InterfaceC0645m mo11624a(ViewGroup viewGroup) {
        InterfaceC0645m mo11624a = super.mo11624a(viewGroup);
        ((ActionMenuView) mo11624a).setPresenter(this);
        return mo11624a;
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b
    /* renamed from: a */
    public View mo11631a(C0632h c0632h, View view, ViewGroup viewGroup) {
        View actionView = c0632h.getActionView();
        if (actionView == null || c0632h.m11712n()) {
            actionView = super.mo11631a(c0632h, view, viewGroup);
        }
        actionView.setVisibility(c0632h.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b
    /* renamed from: a */
    public void mo11632a(C0632h c0632h, InterfaceC0645m.InterfaceC0646a interfaceC0646a) {
        interfaceC0646a.mo11680a(c0632h, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0646a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1499f);
        if (this.f1660A == null) {
            this.f1660A = new C0659b();
        }
        actionMenuItemView.setPopupCallback(this.f1660A);
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b
    /* renamed from: a */
    public boolean mo11635a(int i, C0632h c0632h) {
        return c0632h.m11716j();
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b, android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public void mo11313b(boolean z) {
        boolean z2 = false;
        ViewGroup viewGroup = (ViewGroup) ((View) this.f1499f).getParent();
        if (viewGroup != null) {
            C0605a.m11880a(viewGroup);
        }
        super.mo11313b(z);
        ((View) this.f1499f).requestLayout();
        if (this.f1496c != null) {
            ArrayList<C0632h> m11748k = this.f1496c.m11748k();
            int size = m11748k.size();
            for (int i = 0; i < size; i++) {
                AbstractC0388d mo11739a = m11748k.get(i).mo11739a();
                if (mo11739a != null) {
                    mo11739a.m12651a(this);
                }
            }
        }
        ArrayList<C0632h> m11747l = this.f1496c != null ? this.f1496c.m11747l() : null;
        if (this.f1666l && m11747l != null) {
            int size2 = m11747l.size();
            if (size2 == 1) {
                z2 = !m11747l.get(0).isActionViewExpanded();
            } else {
                z2 = size2 > 0;
            }
        }
        if (z2) {
            if (this.f1663i == null) {
                this.f1663i = new C0661d(this.f1494a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f1663i.getParent();
            if (viewGroup2 != this.f1499f) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f1663i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1499f;
                actionMenuView.addView(this.f1663i, actionMenuView.m11590c());
            }
        } else if (this.f1663i != null && this.f1663i.getParent() == this.f1499f) {
            ((ViewGroup) this.f1499f).removeView(this.f1663i);
        }
        ((ActionMenuView) this.f1499f).setOverflowReserved(this.f1666l);
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b
    /* renamed from: a */
    public boolean mo11623a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1663i) {
            return false;
        }
        return super.mo11623a(viewGroup, i);
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b, android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public boolean mo11316a(SubMenuC0649p subMenuC0649p) {
        if (subMenuC0649p.hasVisibleItems()) {
            SubMenuC0649p subMenuC0649p2 = subMenuC0649p;
            while (subMenuC0649p2.m11668s() != this.f1496c) {
                subMenuC0649p2 = (SubMenuC0649p) subMenuC0649p2.m11668s();
            }
            View m11625a = m11625a(subMenuC0649p2.getItem());
            if (m11625a == null) {
                if (this.f1663i == null) {
                    return false;
                }
                m11625a = this.f1663i;
            }
            this.f1662h = subMenuC0649p.getItem().getItemId();
            this.f1679y = new C0658a(this, this.f1495b, subMenuC0649p);
            this.f1679y.m11693a(m11625a);
            this.f1679y.m11697a();
            super.mo11316a(subMenuC0649p);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private View m11625a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1499f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0645m.InterfaceC0646a) && ((InterfaceC0645m.InterfaceC0646a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean m11617d() {
        if (!this.f1666l || m11608h() || this.f1496c == null || this.f1499f == null || this.f1680z != null || this.f1496c.m11747l().isEmpty()) {
            return false;
        }
        this.f1680z = new RunnableC0660c(new C0663e(this.f1495b, this.f1496c, this.f1663i, true));
        ((View) this.f1499f).post(this.f1680z);
        super.mo11316a((SubMenuC0649p) null);
        return true;
    }

    /* renamed from: e */
    public boolean m11614e() {
        if (this.f1680z != null && this.f1499f != null) {
            ((View) this.f1499f).removeCallbacks(this.f1680z);
            this.f1680z = null;
            return true;
        }
        C0663e c0663e = this.f1678x;
        if (c0663e != null) {
            c0663e.m11687e();
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m11612f() {
        return m11614e() | m11610g();
    }

    /* renamed from: g */
    public boolean m11610g() {
        if (this.f1679y != null) {
            this.f1679y.m11687e();
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m11608h() {
        return this.f1678x != null && this.f1678x.m11686f();
    }

    /* renamed from: i */
    public boolean m11606i() {
        return this.f1680z != null || m11608h();
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b, android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public boolean mo11315b() {
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
        ArrayList<C0632h> m11750i = this.f1496c.m11750i();
        int size = m11750i.size();
        int i9 = this.f1670p;
        int i10 = this.f1669o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1499f;
        int i11 = 0;
        int i12 = 0;
        boolean z3 = false;
        int i13 = 0;
        while (i13 < size) {
            C0632h c0632h = m11750i.get(i13);
            if (c0632h.m11714l()) {
                i11++;
            } else if (c0632h.m11715k()) {
                i12++;
            } else {
                z3 = true;
            }
            i13++;
            i9 = (this.f1674t && c0632h.isActionViewExpanded()) ? 0 : i9;
        }
        if (this.f1666l && (z3 || i11 + i12 > i9)) {
            i9--;
        }
        int i14 = i9 - i11;
        SparseBooleanArray sparseBooleanArray = this.f1676v;
        sparseBooleanArray.clear();
        int i15 = 0;
        if (!this.f1672r) {
            i = 0;
        } else {
            i15 = i10 / this.f1675u;
            i = ((i10 % this.f1675u) / i15) + this.f1675u;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = i15;
        while (i16 < size) {
            C0632h c0632h2 = m11750i.get(i16);
            if (c0632h2.m11714l()) {
                View mo11631a = mo11631a(c0632h2, this.f1677w, viewGroup);
                if (this.f1677w == null) {
                    this.f1677w = mo11631a;
                }
                if (this.f1672r) {
                    i18 -= ActionMenuView.m11594a(mo11631a, i, i18, makeMeasureSpec, 0);
                } else {
                    mo11631a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i2 = mo11631a.getMeasuredWidth();
                int i19 = i10 - i2;
                if (i17 != 0) {
                    i2 = i17;
                }
                int groupId = c0632h2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0632h2.m11723d(true);
                i3 = i19;
                i4 = i14;
            } else if (c0632h2.m11715k()) {
                int groupId2 = c0632h2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i14 > 0 || z4) && i10 > 0 && (!this.f1672r || i18 > 0);
                if (z5) {
                    View mo11631a2 = mo11631a(c0632h2, this.f1677w, viewGroup);
                    if (this.f1677w == null) {
                        this.f1677w = mo11631a2;
                    }
                    if (this.f1672r) {
                        int m11594a = ActionMenuView.m11594a(mo11631a2, i, i18, makeMeasureSpec, 0);
                        int i20 = i18 - m11594a;
                        z2 = m11594a == 0 ? false : z5;
                        i8 = i20;
                    } else {
                        mo11631a2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z6 = z5;
                        i8 = i18;
                        z2 = z6;
                    }
                    int measuredWidth = mo11631a2.getMeasuredWidth();
                    i10 -= measuredWidth;
                    if (i17 == 0) {
                        i17 = measuredWidth;
                    }
                    if (this.f1672r) {
                        z = z2 & (i10 >= 0);
                        i5 = i17;
                        i6 = i8;
                    } else {
                        z = z2 & (i10 + i17 > 0);
                        i5 = i17;
                        i6 = i8;
                    }
                } else {
                    z = z5;
                    i5 = i17;
                    i6 = i18;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i7 = i14;
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i21 = i14;
                    for (int i22 = 0; i22 < i16; i22++) {
                        C0632h c0632h3 = m11750i.get(i22);
                        if (c0632h3.getGroupId() == groupId2) {
                            if (c0632h3.m11716j()) {
                                i21++;
                            }
                            c0632h3.m11723d(false);
                        }
                    }
                    i7 = i21;
                } else {
                    i7 = i14;
                }
                if (z) {
                    i7--;
                }
                c0632h2.m11723d(z);
                i2 = i5;
                i3 = i10;
                int i23 = i6;
                i4 = i7;
                i18 = i23;
            } else {
                c0632h2.m11723d(false);
                i2 = i17;
                i3 = i10;
                i4 = i14;
            }
            i16++;
            i10 = i3;
            i14 = i4;
            i17 = i2;
        }
        return true;
    }

    @Override // android.support.p013v7.view.menu.AbstractC0623b, android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11317a(C0628f c0628f, boolean z) {
        m11612f();
        super.mo11317a(c0628f, z);
    }

    @Override // android.support.p002v4.view.AbstractC0388d.InterfaceC0389a
    /* renamed from: a */
    public void mo11622a(boolean z) {
        if (z) {
            super.mo11316a((SubMenuC0649p) null);
        } else {
            this.f1496c.m11766a(false);
        }
    }

    /* renamed from: a */
    public void m11626a(ActionMenuView actionMenuView) {
        this.f1499f = actionMenuView;
        actionMenuView.mo11599a(this.f1496c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
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

        /* renamed from: a */
        public int f1681a;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f1681a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1681a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuPresenter$d */
    /* loaded from: classes.dex */
    public class C0661d extends AppCompatImageView implements ActionMenuView.InterfaceC0666a {

        /* renamed from: b */
        private final float[] f1688b;

        public C0661d(Context context) {
            super(context, null, C0535a.C0536a.actionOverflowButtonStyle);
            this.f1688b = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new ListPopupWindow.AbstractView$OnTouchListenerC0688b(this) { // from class: android.support.v7.widget.ActionMenuPresenter.d.1
                @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
                /* renamed from: a */
                public ListPopupWindow mo11474a() {
                    if (ActionMenuPresenter.this.f1678x != null) {
                        return ActionMenuPresenter.this.f1678x.m11690c();
                    }
                    return null;
                }

                @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
                /* renamed from: b */
                public boolean mo11469b() {
                    ActionMenuPresenter.this.m11617d();
                    return true;
                }

                @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
                /* renamed from: c */
                public boolean mo11465c() {
                    if (ActionMenuPresenter.this.f1680z != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.m11614e();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                ActionMenuPresenter.this.m11617d();
            }
            return true;
        }

        @Override // android.support.p013v7.widget.ActionMenuView.InterfaceC0666a
        /* renamed from: c */
        public boolean mo11582c() {
            return false;
        }

        @Override // android.support.p013v7.widget.ActionMenuView.InterfaceC0666a
        /* renamed from: d */
        public boolean mo11581d() {
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
                C0021a.m13861a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuPresenter$e */
    /* loaded from: classes.dex */
    public class C0663e extends View$OnKeyListenerC0641k {
        public C0663e(Context context, C0628f c0628f, View view, boolean z) {
            super(context, c0628f, view, z, C0535a.C0536a.actionOverflowMenuStyle);
            m11696a(8388613);
            m11694a(ActionMenuPresenter.this.f1661g);
        }

        @Override // android.support.p013v7.view.menu.View$OnKeyListenerC0641k, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            if (ActionMenuPresenter.this.f1496c != null) {
                ActionMenuPresenter.this.f1496c.close();
            }
            ActionMenuPresenter.this.f1678x = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuPresenter$a */
    /* loaded from: classes.dex */
    public class C0658a extends View$OnKeyListenerC0641k {

        /* renamed from: c */
        final /* synthetic */ ActionMenuPresenter f1682c;

        /* renamed from: d */
        private SubMenuC0649p f1683d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0658a(ActionMenuPresenter actionMenuPresenter, Context context, SubMenuC0649p subMenuC0649p) {
            super(context, subMenuC0649p, null, false, C0535a.C0536a.actionOverflowMenuStyle);
            boolean z = false;
            this.f1682c = actionMenuPresenter;
            this.f1683d = subMenuC0649p;
            if (!((C0632h) subMenuC0649p.getItem()).m11716j()) {
                m11693a(actionMenuPresenter.f1663i == null ? (View) actionMenuPresenter.f1499f : actionMenuPresenter.f1663i);
            }
            m11694a(actionMenuPresenter.f1661g);
            int size = subMenuC0649p.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = subMenuC0649p.getItem(i);
                if (!item.isVisible() || item.getIcon() == null) {
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            m11692a(z);
        }

        @Override // android.support.p013v7.view.menu.View$OnKeyListenerC0641k, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            this.f1682c.f1679y = null;
            this.f1682c.f1662h = 0;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$f */
    /* loaded from: classes.dex */
    private class C0664f implements InterfaceC0643l.InterfaceC0644a {
        private C0664f() {
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a_ */
        public boolean mo11114a_(C0628f c0628f) {
            if (c0628f == null) {
                return false;
            }
            ActionMenuPresenter.this.f1662h = ((SubMenuC0649p) c0628f).getItem().getItemId();
            InterfaceC0643l.InterfaceC0644a a = ActionMenuPresenter.this.m11802a();
            return a != null ? a.mo11114a_(c0628f) : false;
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a */
        public void mo11116a(C0628f c0628f, boolean z) {
            if (c0628f instanceof SubMenuC0649p) {
                ((SubMenuC0649p) c0628f).mo11669p().m11766a(false);
            }
            InterfaceC0643l.InterfaceC0644a a = ActionMenuPresenter.this.m11802a();
            if (a != null) {
                a.mo11116a(c0628f, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuPresenter$c */
    /* loaded from: classes.dex */
    public class RunnableC0660c implements Runnable {

        /* renamed from: b */
        private C0663e f1686b;

        public RunnableC0660c(C0663e c0663e) {
            this.f1686b = c0663e;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuPresenter.this.f1496c.m11753f();
            View view = (View) ActionMenuPresenter.this.f1499f;
            if (view != null && view.getWindowToken() != null && this.f1686b.m11688d()) {
                ActionMenuPresenter.this.f1678x = this.f1686b;
            }
            ActionMenuPresenter.this.f1680z = null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$b */
    /* loaded from: classes.dex */
    private class C0659b extends ActionMenuItemView.AbstractC0621b {
        private C0659b() {
        }

        @Override // android.support.p013v7.view.menu.ActionMenuItemView.AbstractC0621b
        /* renamed from: a */
        public ListPopupWindow mo11602a() {
            if (ActionMenuPresenter.this.f1679y != null) {
                return ActionMenuPresenter.this.f1679y.m11690c();
            }
            return null;
        }
    }
}
