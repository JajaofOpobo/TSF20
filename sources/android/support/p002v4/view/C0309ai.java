package android.support.p002v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;
/* renamed from: android.support.v4.view.ai */
/* loaded from: classes.dex */
public final class C0309ai {

    /* renamed from: a */
    static final InterfaceC0322m f751a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.ai$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0322m {
        /* renamed from: a */
        int mo12877a(int i, int i2, int i3);

        /* renamed from: a */
        int mo12876a(View view);

        /* renamed from: a */
        C0383bi mo12865a(View view, C0383bi c0383bi);

        /* renamed from: a */
        void mo12875a(View view, float f);

        /* renamed from: a */
        void mo12873a(View view, int i, int i2);

        /* renamed from: a */
        void mo12872a(View view, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo12871a(View view, int i, Paint paint);

        /* renamed from: a */
        void mo12870a(View view, ColorStateList colorStateList);

        /* renamed from: a */
        void mo12869a(View view, Paint paint);

        /* renamed from: a */
        void mo12868a(View view, PorterDuff.Mode mode);

        /* renamed from: a */
        void mo12867a(View view, C0249a c0249a);

        /* renamed from: a */
        void mo12866a(View view, InterfaceC0298ab interfaceC0298ab);

        /* renamed from: a */
        void mo12864a(View view, Runnable runnable);

        /* renamed from: a */
        void mo12863a(View view, Runnable runnable, long j);

        /* renamed from: a */
        void mo12862a(View view, boolean z);

        /* renamed from: a */
        void mo12861a(ViewGroup viewGroup, boolean z);

        /* renamed from: a */
        boolean mo12874a(View view, int i);

        /* renamed from: b */
        C0383bi mo12857b(View view, C0383bi c0383bi);

        /* renamed from: b */
        void mo12860b(View view);

        /* renamed from: b */
        void mo12859b(View view, float f);

        /* renamed from: b */
        void mo12856b(View view, boolean z);

        /* renamed from: b */
        boolean mo12858b(View view, int i);

        /* renamed from: c */
        int mo12855c(View view);

        /* renamed from: c */
        void mo12854c(View view, float f);

        /* renamed from: c */
        void mo12853c(View view, int i);

        /* renamed from: d */
        int mo12852d(View view);

        /* renamed from: d */
        void mo12851d(View view, float f);

        /* renamed from: d */
        void mo12850d(View view, int i);

        /* renamed from: e */
        int mo12849e(View view);

        /* renamed from: e */
        void mo12848e(View view, float f);

        /* renamed from: e */
        void mo12847e(View view, int i);

        /* renamed from: f */
        ViewParent mo12846f(View view);

        /* renamed from: g */
        boolean mo12845g(View view);

        /* renamed from: h */
        int mo12844h(View view);

        /* renamed from: i */
        int mo12843i(View view);

        /* renamed from: j */
        boolean mo12842j(View view);

        /* renamed from: k */
        float mo12841k(View view);

        /* renamed from: l */
        float mo12840l(View view);

        /* renamed from: m */
        int mo12839m(View view);

        /* renamed from: n */
        C0363bb mo12838n(View view);

        /* renamed from: o */
        int mo12837o(View view);

        /* renamed from: p */
        void mo12836p(View view);

        /* renamed from: q */
        float mo12835q(View view);

        /* renamed from: r */
        boolean mo12834r(View view);

        /* renamed from: s */
        void mo12833s(View view);

        /* renamed from: t */
        boolean mo12832t(View view);

        /* renamed from: u */
        ColorStateList mo12831u(View view);

        /* renamed from: v */
        PorterDuff.Mode mo12830v(View view);

        /* renamed from: w */
        void mo12829w(View view);

        /* renamed from: x */
        boolean mo12828x(View view);

        /* renamed from: y */
        boolean mo12827y(View view);

        /* renamed from: z */
        boolean mo12826z(View view);
    }

    /* renamed from: android.support.v4.view.ai$a */
    /* loaded from: classes.dex */
    static class C0310a implements InterfaceC0322m {

        /* renamed from: a */
        WeakHashMap<View, C0363bb> f752a = null;

        C0310a() {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public boolean mo12874a(View view, int i) {
            return (view instanceof InterfaceC0302ae) && m12880a((InterfaceC0302ae) view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public boolean mo12858b(View view, int i) {
            return (view instanceof InterfaceC0302ae) && m12879b((InterfaceC0302ae) view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public int mo12876a(View view) {
            return 2;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12867a(View view, C0249a c0249a) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public void mo12860b(View view) {
            view.invalidate();
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12872a(View view, int i, int i2, int i3, int i4) {
            view.invalidate(i, i2, i3, i4);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12864a(View view, Runnable runnable) {
            view.postDelayed(runnable, mo12878a());
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12863a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, mo12878a() + j);
        }

        /* renamed from: a */
        long mo12878a() {
            return 10L;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: c */
        public int mo12855c(View view) {
            return 0;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: c */
        public void mo12853c(View view, int i) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12871a(View view, int i, Paint paint) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public int mo12852d(View view) {
            return 0;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12869a(View view, Paint paint) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public int mo12849e(View view) {
            return 0;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: f */
        public ViewParent mo12846f(View view) {
            return view.getParent();
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: g */
        public boolean mo12845g(View view) {
            Drawable background = view.getBackground();
            return background != null && background.getOpacity() == -1;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public int mo12877a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: h */
        public int mo12844h(View view) {
            return view.getMeasuredWidth();
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: i */
        public int mo12843i(View view) {
            return 0;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: j */
        public boolean mo12842j(View view) {
            return true;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: k */
        public float mo12841k(View view) {
            return 0.0f;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: l */
        public float mo12840l(View view) {
            return 0.0f;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: m */
        public int mo12839m(View view) {
            return C0323aj.m12818d(view);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: n */
        public C0363bb mo12838n(View view) {
            return new C0363bb(view);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12875a(View view, float f) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public void mo12859b(View view, float f) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: c */
        public void mo12854c(View view, float f) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public void mo12851d(View view, float f) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: o */
        public int mo12837o(View view) {
            return 0;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: p */
        public void mo12836p(View view) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public void mo12848e(View view, float f) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: q */
        public float mo12835q(View view) {
            return 0.0f;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12861a(ViewGroup viewGroup, boolean z) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: r */
        public boolean mo12834r(View view) {
            return false;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: s */
        public void mo12833s(View view) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12866a(View view, InterfaceC0298ab interfaceC0298ab) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public C0383bi mo12865a(View view, C0383bi c0383bi) {
            return c0383bi;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public C0383bi mo12857b(View view, C0383bi c0383bi) {
            return c0383bi;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12862a(View view, boolean z) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public void mo12856b(View view, boolean z) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: t */
        public boolean mo12832t(View view) {
            if (view instanceof InterfaceC0436x) {
                return ((InterfaceC0436x) view).isNestedScrollingEnabled();
            }
            return false;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: u */
        public ColorStateList mo12831u(View view) {
            return C0323aj.m12825a(view);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12870a(View view, ColorStateList colorStateList) {
            C0323aj.m12823a(view, colorStateList);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12868a(View view, PorterDuff.Mode mode) {
            C0323aj.m12822a(view, mode);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: v */
        public PorterDuff.Mode mo12830v(View view) {
            return C0323aj.m12821b(view);
        }

        /* renamed from: a */
        private boolean m12880a(InterfaceC0302ae interfaceC0302ae, int i) {
            int computeHorizontalScrollOffset = interfaceC0302ae.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = interfaceC0302ae.computeHorizontalScrollRange() - interfaceC0302ae.computeHorizontalScrollExtent();
            if (computeHorizontalScrollRange == 0) {
                return false;
            }
            return i < 0 ? computeHorizontalScrollOffset > 0 : computeHorizontalScrollOffset < computeHorizontalScrollRange + (-1);
        }

        /* renamed from: b */
        private boolean m12879b(InterfaceC0302ae interfaceC0302ae, int i) {
            int computeVerticalScrollOffset = interfaceC0302ae.computeVerticalScrollOffset();
            int computeVerticalScrollRange = interfaceC0302ae.computeVerticalScrollRange() - interfaceC0302ae.computeVerticalScrollExtent();
            if (computeVerticalScrollRange == 0) {
                return false;
            }
            return i < 0 ? computeVerticalScrollOffset > 0 : computeVerticalScrollOffset < computeVerticalScrollRange + (-1);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: w */
        public void mo12829w(View view) {
            if (view instanceof InterfaceC0436x) {
                ((InterfaceC0436x) view).stopNestedScroll();
            }
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: x */
        public boolean mo12828x(View view) {
            return C0323aj.m12819c(view);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: y */
        public boolean mo12827y(View view) {
            return C0323aj.m12817e(view);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: z */
        public boolean mo12826z(View view) {
            return false;
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12873a(View view, int i, int i2) {
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public void mo12850d(View view, int i) {
            C0323aj.m12820b(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public void mo12847e(View view, int i) {
            C0323aj.m12824a(view, i);
        }
    }

    /* renamed from: android.support.v4.view.ai$b */
    /* loaded from: classes.dex */
    static class C0311b extends C0310a {
        C0311b() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: g */
        public boolean mo12845g(View view) {
            return C0324ak.m12816a(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12861a(ViewGroup viewGroup, boolean z) {
            C0324ak.m12815a(viewGroup, z);
        }
    }

    /* renamed from: android.support.v4.view.ai$c */
    /* loaded from: classes.dex */
    static class C0312c extends C0311b {
        C0312c() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public int mo12876a(View view) {
            return C0325al.m12814a(view);
        }
    }

    /* renamed from: android.support.v4.view.ai$d */
    /* loaded from: classes.dex */
    static class C0313d extends C0312c {
        C0313d() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a
        /* renamed from: a */
        long mo12878a() {
            return C0326am.m12813a();
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12871a(View view, int i, Paint paint) {
            C0326am.m12808a(view, i, paint);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public int mo12852d(View view) {
            return C0326am.m12811a(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12869a(View view, Paint paint) {
            mo12871a(view, mo12852d(view), paint);
            view.invalidate();
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public int mo12877a(int i, int i2, int i3) {
            return C0326am.m12812a(i, i2, i3);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: h */
        public int mo12844h(View view) {
            return C0326am.m12806b(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: i */
        public int mo12843i(View view) {
            return C0326am.m12802c(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: k */
        public float mo12841k(View view) {
            return C0326am.m12800d(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12875a(View view, float f) {
            C0326am.m12810a(view, f);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public void mo12859b(View view, float f) {
            C0326am.m12805b(view, f);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: c */
        public void mo12854c(View view, float f) {
            C0326am.m12801c(view, f);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public void mo12851d(View view, float f) {
            C0326am.m12799d(view, f);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: l */
        public float mo12840l(View view) {
            return C0326am.m12798e(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: s */
        public void mo12833s(View view) {
            C0326am.m12797f(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12862a(View view, boolean z) {
            C0326am.m12807a(view, z);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public void mo12856b(View view, boolean z) {
            C0326am.m12803b(view, z);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public void mo12850d(View view, int i) {
            C0326am.m12804b(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public void mo12847e(View view, int i) {
            C0326am.m12809a(view, i);
        }
    }

    /* renamed from: android.support.v4.view.ai$f */
    /* loaded from: classes.dex */
    static class C0315f extends C0313d {

        /* renamed from: b */
        static boolean f753b = false;

        C0315f() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public boolean mo12874a(View view, int i) {
            return C0327an.m12795a(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public boolean mo12858b(View view, int i) {
            return C0327an.m12793b(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12867a(View view, C0249a c0249a) {
            C0327an.m12794a(view, c0249a == null ? null : c0249a.m13148a());
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: n */
        public C0363bb mo12838n(View view) {
            if (this.f752a == null) {
                this.f752a = new WeakHashMap<>();
            }
            C0363bb c0363bb = this.f752a.get(view);
            if (c0363bb == null) {
                C0363bb c0363bb2 = new C0363bb(view);
                this.f752a.put(view, c0363bb2);
                return c0363bb2;
            }
            return c0363bb;
        }
    }

    /* renamed from: android.support.v4.view.ai$e */
    /* loaded from: classes.dex */
    static class C0314e extends C0315f {
        C0314e() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: z */
        public boolean mo12826z(View view) {
            return C0328ao.m12792a(view);
        }
    }

    /* renamed from: android.support.v4.view.ai$g */
    /* loaded from: classes.dex */
    static class C0316g extends C0314e {
        C0316g() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public void mo12860b(View view) {
            C0329ap.m12791a(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12872a(View view, int i, int i2, int i3, int i4) {
            C0329ap.m12789a(view, i, i2, i3, i4);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12864a(View view, Runnable runnable) {
            C0329ap.m12788a(view, runnable);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12863a(View view, Runnable runnable, long j) {
            C0329ap.m12787a(view, runnable, j);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: c */
        public int mo12855c(View view) {
            return C0329ap.m12786b(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: c */
        public void mo12853c(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            C0329ap.m12790a(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: f */
        public ViewParent mo12846f(View view) {
            return C0329ap.m12785c(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: m */
        public int mo12839m(View view) {
            return C0329ap.m12784d(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: p */
        public void mo12836p(View view) {
            C0329ap.m12783e(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: r */
        public boolean mo12834r(View view) {
            return C0329ap.m12782f(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: j */
        public boolean mo12842j(View view) {
            return C0329ap.m12781g(view);
        }
    }

    /* renamed from: android.support.v4.view.ai$h */
    /* loaded from: classes.dex */
    static class C0317h extends C0316g {
        C0317h() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0313d, android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12869a(View view, Paint paint) {
            C0330aq.m12779a(view, paint);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public int mo12849e(View view) {
            return C0330aq.m12780a(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: o */
        public int mo12837o(View view) {
            return C0330aq.m12778b(view);
        }
    }

    /* renamed from: android.support.v4.view.ai$i */
    /* loaded from: classes.dex */
    static class C0318i extends C0317h {
        C0318i() {
        }
    }

    /* renamed from: android.support.v4.view.ai$j */
    /* loaded from: classes.dex */
    static class C0319j extends C0318i {
        C0319j() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0316g, android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: c */
        public void mo12853c(View view, int i) {
            C0329ap.m12790a(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: x */
        public boolean mo12828x(View view) {
            return C0331ar.m12777a(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: y */
        public boolean mo12827y(View view) {
            return C0331ar.m12776b(view);
        }
    }

    /* renamed from: android.support.v4.view.ai$k */
    /* loaded from: classes.dex */
    static class C0320k extends C0319j {
        C0320k() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0316g, android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: p */
        public void mo12836p(View view) {
            C0332as.m12774a(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public void mo12848e(View view, float f) {
            C0332as.m12773a(view, f);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: q */
        public float mo12835q(View view) {
            return C0332as.m12767b(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12866a(View view, InterfaceC0298ab interfaceC0298ab) {
            C0332as.m12769a(view, interfaceC0298ab);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: t */
        public boolean mo12832t(View view) {
            return C0332as.m12762e(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: w */
        public void mo12829w(View view) {
            C0332as.m12761f(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: u */
        public ColorStateList mo12831u(View view) {
            return C0332as.m12764c(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12870a(View view, ColorStateList colorStateList) {
            C0332as.m12771a(view, colorStateList);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12868a(View view, PorterDuff.Mode mode) {
            C0332as.m12770a(view, mode);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: v */
        public PorterDuff.Mode mo12830v(View view) {
            return C0332as.m12763d(view);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public C0383bi mo12865a(View view, C0383bi c0383bi) {
            return C0332as.m12768a(view, c0383bi);
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: b */
        public C0383bi mo12857b(View view, C0383bi c0383bi) {
            return C0332as.m12765b(view, c0383bi);
        }

        @Override // android.support.p002v4.view.C0309ai.C0313d, android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public void mo12850d(View view, int i) {
            C0332as.m12766b(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.C0313d, android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public void mo12847e(View view, int i) {
            C0332as.m12772a(view, i);
        }
    }

    /* renamed from: android.support.v4.view.ai$l */
    /* loaded from: classes.dex */
    static class C0321l extends C0320k {
        C0321l() {
        }

        @Override // android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: a */
        public void mo12873a(View view, int i, int i2) {
            C0334at.m12759a(view, i, i2);
        }

        @Override // android.support.p002v4.view.C0309ai.C0320k, android.support.p002v4.view.C0309ai.C0313d, android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: d */
        public void mo12850d(View view, int i) {
            C0334at.m12758b(view, i);
        }

        @Override // android.support.p002v4.view.C0309ai.C0320k, android.support.p002v4.view.C0309ai.C0313d, android.support.p002v4.view.C0309ai.C0310a, android.support.p002v4.view.C0309ai.InterfaceC0322m
        /* renamed from: e */
        public void mo12847e(View view, int i) {
            C0334at.m12760a(view, i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f751a = new C0321l();
        } else if (i >= 21) {
            f751a = new C0320k();
        } else if (i >= 19) {
            f751a = new C0319j();
        } else if (i >= 17) {
            f751a = new C0317h();
        } else if (i >= 16) {
            f751a = new C0316g();
        } else if (i >= 15) {
            f751a = new C0314e();
        } else if (i >= 14) {
            f751a = new C0315f();
        } else if (i >= 11) {
            f751a = new C0313d();
        } else if (i >= 9) {
            f751a = new C0312c();
        } else if (i >= 7) {
            f751a = new C0311b();
        } else {
            f751a = new C0310a();
        }
    }

    /* renamed from: a */
    public static boolean m12929a(View view, int i) {
        return f751a.mo12874a(view, i);
    }

    /* renamed from: b */
    public static boolean m12913b(View view, int i) {
        return f751a.mo12858b(view, i);
    }

    /* renamed from: a */
    public static int m12931a(View view) {
        return f751a.mo12876a(view);
    }

    /* renamed from: a */
    public static void m12922a(View view, C0249a c0249a) {
        f751a.mo12867a(view, c0249a);
    }

    /* renamed from: b */
    public static void m12915b(View view) {
        f751a.mo12860b(view);
    }

    /* renamed from: a */
    public static void m12927a(View view, int i, int i2, int i3, int i4) {
        f751a.mo12872a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m12919a(View view, Runnable runnable) {
        f751a.mo12864a(view, runnable);
    }

    /* renamed from: a */
    public static void m12918a(View view, Runnable runnable, long j) {
        f751a.mo12863a(view, runnable, j);
    }

    /* renamed from: c */
    public static int m12910c(View view) {
        return f751a.mo12855c(view);
    }

    /* renamed from: c */
    public static void m12908c(View view, int i) {
        f751a.mo12853c(view, i);
    }

    /* renamed from: a */
    public static void m12926a(View view, int i, Paint paint) {
        f751a.mo12871a(view, i, paint);
    }

    /* renamed from: d */
    public static int m12907d(View view) {
        return f751a.mo12852d(view);
    }

    /* renamed from: a */
    public static void m12924a(View view, Paint paint) {
        f751a.mo12869a(view, paint);
    }

    /* renamed from: e */
    public static int m12904e(View view) {
        return f751a.mo12849e(view);
    }

    /* renamed from: f */
    public static ViewParent m12901f(View view) {
        return f751a.mo12846f(view);
    }

    /* renamed from: g */
    public static boolean m12900g(View view) {
        return f751a.mo12845g(view);
    }

    /* renamed from: a */
    public static int m12932a(int i, int i2, int i3) {
        return f751a.mo12877a(i, i2, i3);
    }

    /* renamed from: h */
    public static int m12899h(View view) {
        return f751a.mo12844h(view);
    }

    /* renamed from: i */
    public static int m12898i(View view) {
        return f751a.mo12843i(view);
    }

    /* renamed from: j */
    public static float m12897j(View view) {
        return f751a.mo12841k(view);
    }

    /* renamed from: k */
    public static int m12896k(View view) {
        return f751a.mo12839m(view);
    }

    /* renamed from: l */
    public static C0363bb m12895l(View view) {
        return f751a.mo12838n(view);
    }

    /* renamed from: a */
    public static void m12930a(View view, float f) {
        f751a.mo12875a(view, f);
    }

    /* renamed from: b */
    public static void m12914b(View view, float f) {
        f751a.mo12859b(view, f);
    }

    /* renamed from: c */
    public static void m12909c(View view, float f) {
        f751a.mo12854c(view, f);
    }

    /* renamed from: d */
    public static void m12906d(View view, float f) {
        f751a.mo12851d(view, f);
    }

    /* renamed from: m */
    public static float m12894m(View view) {
        return f751a.mo12840l(view);
    }

    /* renamed from: e */
    public static void m12903e(View view, float f) {
        f751a.mo12848e(view, f);
    }

    /* renamed from: n */
    public static float m12893n(View view) {
        return f751a.mo12835q(view);
    }

    /* renamed from: o */
    public static int m12892o(View view) {
        return f751a.mo12837o(view);
    }

    /* renamed from: p */
    public static void m12891p(View view) {
        f751a.mo12836p(view);
    }

    /* renamed from: a */
    public static void m12916a(ViewGroup viewGroup, boolean z) {
        f751a.mo12861a(viewGroup, z);
    }

    /* renamed from: q */
    public static boolean m12890q(View view) {
        return f751a.mo12834r(view);
    }

    /* renamed from: r */
    public static void m12889r(View view) {
        f751a.mo12833s(view);
    }

    /* renamed from: a */
    public static void m12921a(View view, InterfaceC0298ab interfaceC0298ab) {
        f751a.mo12866a(view, interfaceC0298ab);
    }

    /* renamed from: a */
    public static C0383bi m12920a(View view, C0383bi c0383bi) {
        return f751a.mo12865a(view, c0383bi);
    }

    /* renamed from: b */
    public static C0383bi m12912b(View view, C0383bi c0383bi) {
        return f751a.mo12857b(view, c0383bi);
    }

    /* renamed from: a */
    public static void m12917a(View view, boolean z) {
        f751a.mo12862a(view, z);
    }

    /* renamed from: b */
    public static void m12911b(View view, boolean z) {
        f751a.mo12856b(view, z);
    }

    /* renamed from: s */
    public static boolean m12888s(View view) {
        return f751a.mo12842j(view);
    }

    /* renamed from: t */
    public static ColorStateList m12887t(View view) {
        return f751a.mo12831u(view);
    }

    /* renamed from: a */
    public static void m12925a(View view, ColorStateList colorStateList) {
        f751a.mo12870a(view, colorStateList);
    }

    /* renamed from: u */
    public static PorterDuff.Mode m12886u(View view) {
        return f751a.mo12830v(view);
    }

    /* renamed from: a */
    public static void m12923a(View view, PorterDuff.Mode mode) {
        f751a.mo12868a(view, mode);
    }

    /* renamed from: v */
    public static boolean m12885v(View view) {
        return f751a.mo12832t(view);
    }

    /* renamed from: w */
    public static void m12884w(View view) {
        f751a.mo12829w(view);
    }

    /* renamed from: x */
    public static boolean m12883x(View view) {
        return f751a.mo12828x(view);
    }

    /* renamed from: d */
    public static void m12905d(View view, int i) {
        f751a.mo12847e(view, i);
    }

    /* renamed from: e */
    public static void m12902e(View view, int i) {
        f751a.mo12850d(view, i);
    }

    /* renamed from: y */
    public static boolean m12882y(View view) {
        return f751a.mo12827y(view);
    }

    /* renamed from: z */
    public static boolean m12881z(View view) {
        return f751a.mo12826z(view);
    }

    /* renamed from: a */
    public static void m12928a(View view, int i, int i2) {
        f751a.mo12873a(view, i, i2);
    }
}
