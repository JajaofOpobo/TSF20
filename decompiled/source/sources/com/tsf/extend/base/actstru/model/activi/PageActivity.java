package com.tsf.extend.base.actstru.model.activi;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.tsf.extend.base.c.b;
import com.tsf.extend.base.j.g;
import com.tsf.extend.wallpaper.WallpaperOnLineActivity;
import java.util.Stack;
/* loaded from: classes.dex */
public abstract class PageActivity extends CustomActivity {
    LayoutTransition d;
    private FrameLayout e;
    private final Stack<a> f = new Stack<>();
    private boolean g = true;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(PageActivity pageActivity);

        void b();

        void c();

        void d();

        boolean e();

        void f();

        View getContent();

        boolean getPendingTransition();

        Bundle getResult();
    }

    protected abstract void a(Bundle bundle);

    public abstract b c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = new FrameLayout(this);
        setContentView(this.e);
        if (Build.VERSION.SDK_INT >= 11) {
            this.d = new LayoutTransition();
            this.e.setLayoutTransition(this.d);
        }
        if (Build.VERSION.SDK_INT >= 16 && !(this instanceof WallpaperOnLineActivity)) {
            this.e.setSystemUiVisibility(1536);
        }
        g.a(this.e);
    }

    public final void a(a aVar) {
        if (aVar != null && this.e != null) {
            aVar.a(this);
            View content = aVar.getContent();
            if (content != null) {
                if (this.f.size() > 0) {
                    this.f.peek().b();
                }
                if (!aVar.getPendingTransition()) {
                    for (int i = 0; i < this.e.getChildCount(); i++) {
                        this.e.getChildAt(i).setVisibility(4);
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.d.setDuration(0L);
                    }
                } else if (Build.VERSION.SDK_INT >= 11) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "translationX", this.e.getWidth(), 0.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "translationX", 0.0f, this.e.getWidth());
                    this.d.setAnimator(2, ofFloat);
                    this.d.setAnimator(3, ofFloat2);
                    this.d.setDuration(300L);
                }
                this.e.addView(content);
                aVar.a();
                this.f.add(aVar);
            }
        }
    }

    public final void b(a aVar) {
        if ((Build.VERSION.SDK_INT < 11 || !this.d.isRunning()) && aVar != null && this.e != null) {
            aVar.a(this);
            View content = aVar.getContent();
            if (content != null) {
                a peek = this.f.size() > 0 ? this.f.peek() : null;
                if (!aVar.getPendingTransition()) {
                    for (int i = 0; i < this.e.getChildCount(); i++) {
                        this.e.getChildAt(i).setVisibility(4);
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.d.setDuration(0L);
                    }
                } else if (Build.VERSION.SDK_INT >= 11) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "translationX", this.e.getWidth(), 0.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "translationX", 0.0f, this.e.getWidth());
                    this.d.setAnimator(2, ofFloat);
                    this.d.setAnimator(3, ofFloat2);
                    this.d.setDuration(300L);
                }
                if (peek != null) {
                    View content2 = peek.getContent();
                    if (content2 != null) {
                        peek.c();
                        this.f.remove(peek);
                        content2.setVisibility(8);
                        this.e.removeView(content2);
                        peek.b();
                        a(peek.getResult());
                    }
                    this.e.addView(content);
                    aVar.a();
                    this.f.add(aVar);
                }
            }
        }
    }

    public void a(boolean z) {
        this.g = z;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f.isEmpty()) {
            a peek = this.f.peek();
            if (!peek.e()) {
                View content = peek.getContent();
                if (content != null) {
                    peek.c();
                    this.f.pop();
                    if (peek.getPendingTransition()) {
                        if (Build.VERSION.SDK_INT >= 11) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "translationX", this.e.getWidth(), 0.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "translationX", 0.0f, this.e.getWidth());
                            this.d.setAnimator(2, ofFloat);
                            this.d.setAnimator(3, ofFloat2);
                            this.d.setDuration(300L);
                        }
                    } else if (Build.VERSION.SDK_INT >= 11) {
                        this.d.setDuration(0L);
                    }
                    if (this.f.size() > 0) {
                        ((View) this.f.peek()).setVisibility(0);
                    }
                    content.setVisibility(8);
                    this.e.removeView(content);
                    peek.b();
                    if (this.f.size() > 0) {
                        this.f.peek().a();
                    }
                    a(peek.getResult());
                    return;
                }
            } else {
                return;
            }
        }
        this.g = false;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        a pop;
        super.onDestroy();
        if (this.e != null) {
            this.e.removeAllViews();
            this.e = null;
        }
        if (this.f != null && !this.f.isEmpty()) {
            if (this.g) {
                this.f.peek().f();
            }
            while (!this.f.isEmpty() && (pop = this.f.pop()) != null) {
                pop.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.g = true;
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f.size()) {
                    a aVar = this.f.get(i2);
                    if (aVar != null) {
                        aVar.d();
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
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f.size()) {
                    a aVar = this.f.get(i2);
                    if (aVar != null) {
                        aVar.a();
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
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f.size()) {
                    a aVar = this.f.get(i2);
                    if (aVar != null) {
                        aVar.b();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public FrameLayout a() {
        return this.e;
    }

    public a b() {
        if (this.f == null || this.f.isEmpty()) {
            return null;
        }
        return this.f.peek();
    }

    public void d() {
        int size = this.f.size();
        while (true) {
            int i = size;
            a peek = this.f.peek();
            View content = peek.getContent();
            if (content != null) {
                peek.c();
                this.f.pop();
                this.e.removeView(content);
                peek.b();
                a(peek.getResult());
                size = i - 1;
            } else {
                size = i;
            }
            if (this.f.size() <= 1) {
                break;
            }
        }
        if (this.f.size() > 0) {
            ((View) this.f.peek()).setVisibility(0);
        }
        if (this.f.size() > 0) {
            this.f.peek().a();
        }
    }
}
