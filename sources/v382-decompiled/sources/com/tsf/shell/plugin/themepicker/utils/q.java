package com.tsf.shell.plugin.themepicker.utils;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.Log;
import android.widget.ImageView;
import com.censivn.C3DEngine.api.tween.VEasing;

/* loaded from: classes.dex */
public abstract class q {
    private l a;
    private m b;
    protected Resources d;
    private Bitmap e;
    private boolean f = true;
    private boolean g = false;
    protected boolean c = false;
    private final Object h = new Object();

    protected abstract Bitmap a(Object obj);

    protected q(Context context) {
        this.d = context.getResources();
    }

    public void a(Object obj, ImageView imageView) {
        if (obj != null) {
            BitmapDrawable bitmapDrawable = null;
            if (this.a != null) {
                bitmapDrawable = this.a.a(String.valueOf(obj));
            }
            if (bitmapDrawable != null) {
                imageView.setImageDrawable(bitmapDrawable);
            } else if (b(obj, imageView)) {
                s sVar = new s(this, obj, imageView);
                imageView.setImageDrawable(new r(this.d, this.e, sVar));
                sVar.a(a.c, new Void[0]);
            }
        }
    }

    public void a(int i) {
        this.e = BitmapFactory.decodeResource(this.d, i);
    }

    public void a(android.support.v4.app.k kVar, m mVar) {
        this.b = mVar;
        this.a = l.a(kVar, this.b);
        new t(this).c(1);
    }

    public void a(boolean z) {
        this.g = z;
        b(false);
    }

    protected l f() {
        return this.a;
    }

    public static boolean b(Object obj, ImageView imageView) {
        s b = b(imageView);
        if (b == null) {
            return true;
        }
        Object obj2 = b.e;
        if (obj2 == null || !obj2.equals(obj)) {
            b.a(true);
            com.tsf.shell.plugin.themepicker.g.c("ImageWorker", "--------------------cancelPotentialWork - cancelled work for " + obj);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s b(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r) {
                return ((r) drawable).a();
            }
        }
        return null;
    }

    protected void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ImageView imageView, Drawable drawable) {
        if (this.f) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(R.color.transparent), drawable});
            imageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(VEasing.Back.easeIn);
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public void b(boolean z) {
        Log.w("", "setPauseWork--------------------------:" + z);
        synchronized (this.h) {
            this.c = z;
            if (!this.c) {
                this.h.notifyAll();
            }
        }
    }

    protected void a() {
        if (this.a != null) {
            this.a.a();
        }
    }

    protected void b() {
        if (this.a != null) {
            this.a.b();
        }
    }

    protected void c() {
        if (this.a != null) {
            this.a.c();
        }
    }

    protected void d() {
        if (this.a != null) {
            this.a.d();
            this.a = null;
        }
    }

    public void h() {
        new t(this).c(2);
    }

    public void i() {
        new t(this).c(3);
    }
}
