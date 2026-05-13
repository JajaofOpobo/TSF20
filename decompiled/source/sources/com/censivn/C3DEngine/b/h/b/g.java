package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class g extends j {
    private float d;
    private float e;
    private float f;
    private int a = 0;
    private float g = 0.0f;
    private boolean h = true;
    private boolean i = false;
    private float j = 0.0f;
    private float k = 0.0f;
    private boolean l = false;
    private boolean m = false;
    private ArrayList<i> b = new ArrayList<>();
    private j c = new j();

    public g(float f, float f2, float f3, float f4, float f5) {
        this.d = 0.0f;
        this.e = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = f5;
        addChild(this.c);
        setAABBPX(f, f3, 0.0f, f2, f4, 0.0f);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.censivn.C3DEngine.b.h.b.g.1
            boolean a = true;
            float b = 0.0f;
            boolean d = false;
            private i f;

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                if (this.a) {
                    g.this.i = true;
                    g.this.h = false;
                    g.this.c.setAnimationObjectState(true);
                    g.this.c.invalidate();
                    this.b = g.this.c.position().x;
                    this.a = false;
                }
                g.this.g = this.b + (motionEvent2.getX() - motionEvent.getX());
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (Math.abs(g.this.g - g.this.c.position().x) < 50.0f) {
                    this.d = false;
                } else {
                    this.d = true;
                }
                g.this.g = g.this.c.position().x;
                this.f = null;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                g.this.i = false;
                this.a = true;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
                g.this.g += f6 / 5.0f;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (!this.d) {
                    float[] a = x.a(motionEvent);
                    i hittingTarget = g.this.c.getHittingTarget(a[0], a[1], true);
                    if (hittingTarget != null) {
                        g.this.a(hittingTarget, hittingTarget.getDisplayTag());
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                if (!this.d) {
                    float[] a = x.a(motionEvent);
                    i hittingTarget = g.this.c.getHittingTarget(a[0], a[1], true);
                    if (hittingTarget != null) {
                        this.f = hittingTarget;
                        g.this.a(motionEvent, hittingTarget, hittingTarget.getDisplayTag());
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (this.f != null) {
                    g.this.b(motionEvent, this.f, this.f.getDisplayTag());
                    this.f = null;
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (this.f != null) {
                    g.this.a(motionEvent, motionEvent2, this.f, this.f.getDisplayTag());
                }
            }
        });
        b();
        a();
    }

    public void a(float f, float f2, float f3, float f4) {
        setAABBPX(f, f2, 0.0f, f3, f4, 0.0f);
        this.d = f;
        this.e = f3;
        b();
        c();
    }

    public void a(int i) {
        int numChildren = this.c.numChildren();
        int i2 = 0;
        while (true) {
            if (i2 >= numChildren) {
                i2 = -1;
                break;
            }
            i childAt = this.c.getChildAt(i2);
            if (childAt.getDisplayTag() != i) {
                i2++;
            } else {
                childAt.removeFromParent();
                this.b.add(childAt);
                break;
            }
        }
        if (i2 != -1) {
            int numChildren2 = this.c.numChildren();
            while (i2 < numChildren2) {
                i childAt2 = this.c.getChildAt(i2);
                if (i2 == numChildren2 - 1) {
                    a(childAt2, i, new Runnable() { // from class: com.censivn.C3DEngine.b.h.b.g.2
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.h();
                        }
                    });
                } else {
                    a(childAt2, i, (Runnable) null);
                }
                i++;
                i2++;
            }
        }
    }

    public void a() {
        PositionNumber3d position = this.c.position();
        float f = this.j;
        this.g = f;
        position.x = f;
        while (!this.c.children().isEmpty()) {
            this.b.add(this.c.removeChildAt(0));
        }
    }

    public void b() {
        this.l = true;
    }

    private void f() {
        if (this.l) {
            this.l = false;
            this.a = e() - 1;
            this.j = (int) (com.censivn.C3DEngine.b.b.a.z + (this.f / 2.0f));
            this.k = (int) ((((-this.a) * this.f) + com.censivn.C3DEngine.b.b.a.A) - (this.f / 2.0f));
            this.h = false;
            this.c.setAnimationObjectState(true);
            this.c.invalidate();
            int numChildren = this.c.numChildren();
            for (int i = 0; i < numChildren; i++) {
                i childAt = this.c.getChildAt(i);
                if (i > this.a) {
                    childAt.removeFromParent();
                    this.b.add(childAt);
                } else if (childAt.getDisplayTag() > this.a) {
                    childAt.removeFromParent();
                    this.b.add(childAt);
                } else {
                    a(childAt.getDisplayTag(), childAt);
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        f();
        d();
        if (!this.h) {
            if (this.i) {
                PositionNumber3d position = this.c.position();
                position.x = ((this.g - this.c.position().x) * 0.5f) + position.x;
            } else {
                PositionNumber3d position2 = this.c.position();
                position2.x = ((this.g - this.c.position().x) * 0.1f) + position2.x;
                if (this.c.position().x > this.j && this.g > this.j) {
                    this.g += (this.j - this.g) * 0.2f;
                } else if (this.c.position().x < this.k && this.g < this.k) {
                    this.g += (this.k - this.g) * 0.2f;
                }
                if (Math.abs(this.c.position().x - this.g) < 0.5f) {
                    this.c.position().x = this.g;
                    this.c.setAnimationObjectState(false);
                    this.h = true;
                }
            }
            c();
        }
    }

    private int g() {
        int i = (int) ((this.d - this.c.position().x) / this.f);
        if ((this.d - this.c.position().x) % this.f == 0.0f) {
            return i - 1;
        }
        return i;
    }

    public void c() {
        this.m = true;
    }

    public void d() {
        if (this.m) {
            this.m = false;
            i();
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i a;
        if (this.a >= 0) {
            int g = g();
            if (g < 0) {
                g = 0;
            } else if (g > this.a) {
                g = this.a;
            }
            int numChildren = this.c.numChildren();
            int i = g;
            for (int i2 = 0; i2 < numChildren; i2++) {
                i childAt = this.c.getChildAt(i2);
                if (i2 == numChildren - 1 && childAt.getDisplayTag() != this.a) {
                    if (childAt.position().x + this.c.position().x < this.e + this.f && i < this.a) {
                        i a2 = a(i + 1, j());
                        a2.removeFromParent();
                        this.c.addChild(a2);
                        a2.position().x = childAt.position().x + this.f;
                        c();
                        return;
                    }
                } else if (i2 == 0 && childAt.position().x + this.c.position().x > this.d && childAt.getDisplayTag() != 0 && (a = a(i, j())) != null) {
                    a.removeFromParent();
                    this.c.addChildAt(a, 0);
                    a.position().x = childAt.position().x - this.f;
                    c();
                    return;
                }
                b(childAt, i);
                i++;
            }
            if (numChildren == 0) {
                i a3 = a(i, j());
                a3.removeFromParent();
                b(a3, i);
                this.c.addChild(a3);
                h();
            }
        }
    }

    private void i() {
        int numChildren = this.c.numChildren();
        for (int i = 0; i < numChildren; i++) {
            i childAt = this.c.getChildAt(i);
            if (i == numChildren - 1) {
                if (childAt.position().x + this.c.position().x > this.e + (this.f * 2.0f)) {
                    this.c.removeChildAt(i);
                    this.b.add(childAt);
                    i();
                    return;
                }
            } else if (i == 0 && childAt.position().x + this.c.position().x < this.d - this.f) {
                this.c.removeChildAt(i);
                this.b.add(childAt);
                i();
                return;
            }
        }
    }

    private i j() {
        int size = this.b.size();
        if (size == 0) {
            return null;
        }
        return this.b.remove(size - 1);
    }

    private void a(i iVar, int i, Runnable runnable) {
        i a;
        if (iVar.getDisplayTag() != i && (a = a(i, iVar)) != null) {
            a.setDisplayTag(i);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.a(runnable);
            dVar.f(i * this.f);
            com.censivn.C3DEngine.b.g.c.a(a);
            com.censivn.C3DEngine.b.g.c.a(a, 300, dVar);
        }
    }

    private void b(i iVar, int i) {
        i a;
        if (iVar.getDisplayTag() != i && (a = a(i, iVar)) != null) {
            a.setDisplayTag(i);
            a.position().x = i * this.f;
        }
    }

    public void a(i iVar, int i) {
    }

    public void a(MotionEvent motionEvent, i iVar, int i) {
    }

    public void b(MotionEvent motionEvent, i iVar, int i) {
    }

    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, i iVar, int i) {
    }

    public int e() {
        return 0;
    }

    public i a(int i, i iVar) {
        return null;
    }
}
