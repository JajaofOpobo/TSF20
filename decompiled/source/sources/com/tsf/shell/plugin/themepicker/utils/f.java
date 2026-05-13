package com.tsf.shell.plugin.themepicker.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v4.app.o;
import android.util.Log;
import android.widget.ImageView;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.plugin.themepicker.utils.c;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class f {
    private com.tsf.shell.plugin.themepicker.utils.c a;
    private c.a b;
    protected Resources d;
    private Bitmap e;
    private boolean f = true;
    private boolean g = false;
    protected boolean c = false;
    private final Object h = new Object();

    protected abstract Bitmap a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public f(Context context) {
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
                b bVar = new b(obj, imageView);
                imageView.setImageDrawable(new a(this.d, this.e, bVar));
                bVar.a(com.tsf.shell.plugin.themepicker.utils.a.c, new Void[0]);
            }
        }
    }

    public void a(int i) {
        this.e = BitmapFactory.decodeResource(this.d, i);
    }

    public void a(o oVar, c.a aVar) {
        this.b = aVar;
        this.a = com.tsf.shell.plugin.themepicker.utils.c.a(oVar, this.b);
        new c().c(1);
    }

    public void a(boolean z) {
        this.g = z;
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.tsf.shell.plugin.themepicker.utils.c f() {
        return this.a;
    }

    public static boolean b(Object obj, ImageView imageView) {
        b b2 = b(imageView);
        if (b2 != null) {
            Object obj2 = b2.e;
            if (obj2 == null || !obj2.equals(obj)) {
                b2.a(true);
                com.tsf.shell.plugin.themepicker.e.c("ImageWorker", "--------------------cancelPotentialWork - cancelled work for " + obj);
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b b(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a) {
                return ((a) drawable).a();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends com.tsf.shell.plugin.themepicker.utils.a<Void, Void, BitmapDrawable> {
        private Object e;
        private final WeakReference<ImageView> f;

        public b(Object obj, ImageView imageView) {
            this.e = obj;
            this.f = new WeakReference<>(imageView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public BitmapDrawable a(Void... voidArr) {
            BitmapDrawable bitmapDrawable = null;
            com.tsf.shell.plugin.themepicker.e.a("ImageWorker", "doInBackground - starting work");
            String valueOf = String.valueOf(this.e);
            synchronized (f.this.h) {
                while (f.this.c && !c()) {
                    try {
                        f.this.h.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            com.tsf.shell.plugin.themepicker.e.c("", "doInBackground Thread isRunning...");
            Bitmap b = (f.this.a == null || c() || d() == null || f.this.g) ? null : f.this.a.b(valueOf);
            if (b == null && !c() && d() != null && !f.this.g) {
                b = f.this.a(this.e);
            }
            if (b != null) {
                if (h.c()) {
                    bitmapDrawable = new BitmapDrawable(f.this.d, b);
                } else {
                    bitmapDrawable = new g(f.this.d, b);
                }
                if (f.this.a != null) {
                    f.this.a.a(valueOf, bitmapDrawable);
                }
            }
            com.tsf.shell.plugin.themepicker.e.a("ImageWorker", "doInBackground - finished work");
            return bitmapDrawable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public void a(BitmapDrawable bitmapDrawable) {
            bitmapDrawable = (c() || f.this.g) ? null : null;
            ImageView d = d();
            if (bitmapDrawable != null && d != null) {
                com.tsf.shell.plugin.themepicker.e.a("ImageWorker", "onPostExecute - setting bitmap");
                f.this.a(d, bitmapDrawable);
            } else {
                com.tsf.shell.plugin.themepicker.e.c("", "onPostExecute Thread set Bitmap miss...---------------");
            }
            f.this.g();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public void b(BitmapDrawable bitmapDrawable) {
            super.b((b) bitmapDrawable);
            synchronized (f.this.h) {
                f.this.h.notifyAll();
            }
        }

        private ImageView d() {
            ImageView imageView = this.f.get();
            if (this == f.b(imageView)) {
                return imageView;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends BitmapDrawable {
        private final WeakReference<b> a;

        public a(Resources resources, Bitmap bitmap, b bVar) {
            super(resources, bitmap);
            this.a = new WeakReference<>(bVar);
        }

        public b a() {
            return this.a.get();
        }
    }

    protected void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ImageView imageView, Drawable drawable) {
        if (this.f) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(17170445), drawable});
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

    /* loaded from: classes.dex */
    protected class c extends com.tsf.shell.plugin.themepicker.utils.a<Object, Void, Void> {
        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        /* renamed from: d */
        public Void a(Object... objArr) {
            switch (((Integer) objArr[0]).intValue()) {
                case 0:
                    f.this.b();
                    return null;
                case 1:
                    f.this.a();
                    return null;
                case 2:
                    f.this.c();
                    return null;
                case 3:
                    f.this.d();
                    return null;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        if (this.a != null) {
            this.a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (this.a != null) {
            this.a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        if (this.a != null) {
            this.a.d();
            this.a = null;
        }
    }

    public void h() {
        new c().c(2);
    }

    public void i() {
        new c().c(3);
    }
}
