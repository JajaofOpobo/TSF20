package com.tsf.extend.base.actstru.model.activi;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.tsf.extend.base.p073c.AbstractBinderC1381b;
import com.tsf.extend.base.p080j.C1428g;
import com.tsf.extend.wallpaper.WallpaperOnLineActivity;
import java.util.Stack;
/* loaded from: classes.dex */
public abstract class PageActivity extends CustomActivity {

    /* renamed from: d */
    LayoutTransition f4257d;

    /* renamed from: e */
    private FrameLayout f4258e;

    /* renamed from: f */
    private final Stack<InterfaceC1352a> f4259f = new Stack<>();

    /* renamed from: g */
    private boolean f4260g = true;

    /* renamed from: com.tsf.extend.base.actstru.model.activi.PageActivity$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1352a {
        /* renamed from: a */
        void mo6536a();

        /* renamed from: a */
        void mo6535a(PageActivity pageActivity);

        /* renamed from: b */
        void mo6532b();

        /* renamed from: c */
        void mo6531c();

        /* renamed from: d */
        void mo6530d();

        /* renamed from: e */
        boolean mo6529e();

        /* renamed from: f */
        void mo6528f();

        View getContent();

        boolean getPendingTransition();

        Bundle getResult();
    }

    /* renamed from: a */
    protected abstract void mo6742a(Bundle bundle);

    /* renamed from: c */
    public abstract AbstractBinderC1381b mo6732c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4258e = new FrameLayout(this);
        setContentView(this.f4258e);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f4257d = new LayoutTransition();
            this.f4258e.setLayoutTransition(this.f4257d);
        }
        if (Build.VERSION.SDK_INT >= 16 && !(this instanceof WallpaperOnLineActivity)) {
            this.f4258e.setSystemUiVisibility(1536);
        }
        C1428g.m8663a(this.f4258e);
    }

    /* renamed from: a */
    public final void m8922a(InterfaceC1352a interfaceC1352a) {
        if (interfaceC1352a != null && this.f4258e != null) {
            interfaceC1352a.mo6535a(this);
            View content = interfaceC1352a.getContent();
            if (content != null) {
                if (this.f4259f.size() > 0) {
                    this.f4259f.peek().mo6532b();
                }
                if (!interfaceC1352a.getPendingTransition()) {
                    for (int i = 0; i < this.f4258e.getChildCount(); i++) {
                        this.f4258e.getChildAt(i).setVisibility(4);
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.f4257d.setDuration(0L);
                    }
                } else if (Build.VERSION.SDK_INT >= 11) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "translationX", this.f4258e.getWidth(), 0.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "translationX", 0.0f, this.f4258e.getWidth());
                    this.f4257d.setAnimator(2, ofFloat);
                    this.f4257d.setAnimator(3, ofFloat2);
                    this.f4257d.setDuration(300L);
                }
                this.f4258e.addView(content);
                interfaceC1352a.mo6536a();
                this.f4259f.add(interfaceC1352a);
            }
        }
    }

    /* renamed from: b */
    public final void m8919b(InterfaceC1352a interfaceC1352a) {
        if ((Build.VERSION.SDK_INT < 11 || !this.f4257d.isRunning()) && interfaceC1352a != null && this.f4258e != null) {
            interfaceC1352a.mo6535a(this);
            View content = interfaceC1352a.getContent();
            if (content != null) {
                InterfaceC1352a peek = this.f4259f.size() > 0 ? this.f4259f.peek() : null;
                if (!interfaceC1352a.getPendingTransition()) {
                    for (int i = 0; i < this.f4258e.getChildCount(); i++) {
                        this.f4258e.getChildAt(i).setVisibility(4);
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.f4257d.setDuration(0L);
                    }
                } else if (Build.VERSION.SDK_INT >= 11) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "translationX", this.f4258e.getWidth(), 0.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "translationX", 0.0f, this.f4258e.getWidth());
                    this.f4257d.setAnimator(2, ofFloat);
                    this.f4257d.setAnimator(3, ofFloat2);
                    this.f4257d.setDuration(300L);
                }
                if (peek != null) {
                    View content2 = peek.getContent();
                    if (content2 != null) {
                        peek.mo6531c();
                        this.f4259f.remove(peek);
                        content2.setVisibility(8);
                        this.f4258e.removeView(content2);
                        peek.mo6532b();
                        mo6742a(peek.getResult());
                    }
                    this.f4258e.addView(content);
                    interfaceC1352a.mo6536a();
                    this.f4259f.add(interfaceC1352a);
                }
            }
        }
    }

    /* renamed from: a */
    public void m8921a(boolean z) {
        this.f4260g = z;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f4259f.isEmpty()) {
            InterfaceC1352a peek = this.f4259f.peek();
            if (!peek.mo6529e()) {
                View content = peek.getContent();
                if (content != null) {
                    peek.mo6531c();
                    this.f4259f.pop();
                    if (peek.getPendingTransition()) {
                        if (Build.VERSION.SDK_INT >= 11) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "translationX", this.f4258e.getWidth(), 0.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "translationX", 0.0f, this.f4258e.getWidth());
                            this.f4257d.setAnimator(2, ofFloat);
                            this.f4257d.setAnimator(3, ofFloat2);
                            this.f4257d.setDuration(300L);
                        }
                    } else if (Build.VERSION.SDK_INT >= 11) {
                        this.f4257d.setDuration(0L);
                    }
                    if (this.f4259f.size() > 0) {
                        ((View) this.f4259f.peek()).setVisibility(0);
                    }
                    content.setVisibility(8);
                    this.f4258e.removeView(content);
                    peek.mo6532b();
                    if (this.f4259f.size() > 0) {
                        this.f4259f.peek().mo6536a();
                    }
                    mo6742a(peek.getResult());
                    return;
                }
            } else {
                return;
            }
        }
        this.f4260g = false;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        InterfaceC1352a pop;
        super.onDestroy();
        if (this.f4258e != null) {
            this.f4258e.removeAllViews();
            this.f4258e = null;
        }
        if (this.f4259f != null && !this.f4259f.isEmpty()) {
            if (this.f4260g) {
                this.f4259f.peek().mo6528f();
            }
            while (!this.f4259f.isEmpty() && (pop = this.f4259f.pop()) != null) {
                pop.mo6531c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f4260g = true;
        if (this.f4259f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f4259f.size()) {
                    InterfaceC1352a interfaceC1352a = this.f4259f.get(i2);
                    if (interfaceC1352a != null) {
                        interfaceC1352a.mo6530d();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.f4259f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f4259f.size()) {
                    InterfaceC1352a interfaceC1352a = this.f4259f.get(i2);
                    if (interfaceC1352a != null) {
                        interfaceC1352a.mo6536a();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.f4259f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f4259f.size()) {
                    InterfaceC1352a interfaceC1352a = this.f4259f.get(i2);
                    if (interfaceC1352a != null) {
                        interfaceC1352a.mo6532b();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public FrameLayout m8923a() {
        return this.f4258e;
    }

    /* renamed from: b */
    public InterfaceC1352a m8920b() {
        if (this.f4259f == null || this.f4259f.isEmpty()) {
            return null;
        }
        return this.f4259f.peek();
    }

    /* renamed from: d */
    public void m8918d() {
        int size = this.f4259f.size();
        while (true) {
            int i = size;
            InterfaceC1352a peek = this.f4259f.peek();
            View content = peek.getContent();
            if (content != null) {
                peek.mo6531c();
                this.f4259f.pop();
                this.f4258e.removeView(content);
                peek.mo6532b();
                mo6742a(peek.getResult());
                size = i - 1;
            } else {
                size = i;
            }
            if (this.f4259f.size() <= 1) {
                break;
            }
        }
        if (this.f4259f.size() > 0) {
            ((View) this.f4259f.peek()).setVisibility(0);
        }
        if (this.f4259f.size() > 0) {
            this.f4259f.peek().mo6536a();
        }
    }
}
