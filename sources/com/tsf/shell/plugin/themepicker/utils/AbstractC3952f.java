package com.tsf.shell.plugin.themepicker.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.p002v4.app.AbstractC0094o;
import android.util.Log;
import android.widget.ImageView;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.utils.C3946c;
import java.lang.ref.WeakReference;
/* renamed from: com.tsf.shell.plugin.themepicker.utils.f */
/* loaded from: classes.dex */
public abstract class AbstractC3952f {

    /* renamed from: a */
    private C3946c f12951a;

    /* renamed from: b */
    private C3946c.C3948a f12952b;

    /* renamed from: d */
    protected Resources f12954d;

    /* renamed from: e */
    private Bitmap f12955e;

    /* renamed from: f */
    private boolean f12956f = true;

    /* renamed from: g */
    private boolean f12957g = false;

    /* renamed from: c */
    protected boolean f12953c = false;

    /* renamed from: h */
    private final Object f12958h = new Object();

    /* renamed from: a */
    protected abstract Bitmap mo998a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3952f(Context context) {
        this.f12954d = context.getResources();
    }

    /* renamed from: a */
    public void m1037a(Object obj, ImageView imageView) {
        if (obj != null) {
            BitmapDrawable bitmapDrawable = null;
            if (this.f12951a != null) {
                bitmapDrawable = this.f12951a.m1074a(String.valueOf(obj));
            }
            if (bitmapDrawable != null) {
                imageView.setImageDrawable(bitmapDrawable);
            } else if (m1032b(obj, imageView)) {
                C3954b c3954b = new C3954b(obj, imageView);
                imageView.setImageDrawable(new C3953a(this.f12954d, this.f12955e, c3954b));
                c3954b.m1149a(AbstractC3929a.f12874c, new Void[0]);
            }
        }
    }

    /* renamed from: a */
    public void m1043a(int i) {
        this.f12955e = BitmapFactory.decodeResource(this.f12954d, i);
    }

    /* renamed from: a */
    public void m1042a(AbstractC0094o abstractC0094o, C3946c.C3948a c3948a) {
        this.f12952b = c3948a;
        this.f12951a = C3946c.m1078a(abstractC0094o, this.f12952b);
        new C3955c().m1141c(1);
    }

    /* renamed from: a */
    public void m1036a(boolean z) {
        this.f12957g = z;
        m1031b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public C3946c m1027f() {
        return this.f12951a;
    }

    /* renamed from: b */
    public static boolean m1032b(Object obj, ImageView imageView) {
        C3954b m1034b = m1034b(imageView);
        if (m1034b != null) {
            Object obj2 = m1034b.f12961e;
            if (obj2 == null || !obj2.equals(obj)) {
                m1034b.m1148a(true);
                C3851e.m1315c("ImageWorker", "--------------------cancelPotentialWork - cancelled work for " + obj);
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C3954b m1034b(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof C3953a) {
                return ((C3953a) drawable).m1023a();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.f$b */
    /* loaded from: classes.dex */
    public class C3954b extends AbstractC3929a<Void, Void, BitmapDrawable> {

        /* renamed from: e */
        private Object f12961e;

        /* renamed from: f */
        private final WeakReference<ImageView> f12962f;

        public C3954b(Object obj, ImageView imageView) {
            this.f12961e = obj;
            this.f12962f = new WeakReference<>(imageView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public BitmapDrawable mo1015a(Void... voidArr) {
            BitmapDrawable bitmapDrawable = null;
            C3851e.m1318a("ImageWorker", "doInBackground - starting work");
            String valueOf = String.valueOf(this.f12961e);
            synchronized (AbstractC3952f.this.f12958h) {
                while (AbstractC3952f.this.f12953c && !m1144c()) {
                    try {
                        AbstractC3952f.this.f12958h.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            C3851e.m1315c("", "doInBackground Thread isRunning...");
            Bitmap m1069b = (AbstractC3952f.this.f12951a == null || m1144c() || m1016d() == null || AbstractC3952f.this.f12957g) ? null : AbstractC3952f.this.f12951a.m1069b(valueOf);
            if (m1069b == null && !m1144c() && m1016d() != null && !AbstractC3952f.this.f12957g) {
                m1069b = AbstractC3952f.this.mo998a(this.f12961e);
            }
            if (m1069b != null) {
                if (C3957h.m1007c()) {
                    bitmapDrawable = new BitmapDrawable(AbstractC3952f.this.f12954d, m1069b);
                } else {
                    bitmapDrawable = new C3956g(AbstractC3952f.this.f12954d, m1069b);
                }
                if (AbstractC3952f.this.f12951a != null) {
                    AbstractC3952f.this.f12951a.m1073a(valueOf, bitmapDrawable);
                }
            }
            C3851e.m1318a("ImageWorker", "doInBackground - finished work");
            return bitmapDrawable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo1020a(BitmapDrawable bitmapDrawable) {
            bitmapDrawable = (m1144c() || AbstractC3952f.this.f12957g) ? null : null;
            ImageView m1016d = m1016d();
            if (bitmapDrawable != null && m1016d != null) {
                C3851e.m1318a("ImageWorker", "onPostExecute - setting bitmap");
                AbstractC3952f.this.m1040a(m1016d, bitmapDrawable);
            } else {
                C3851e.m1315c("", "onPostExecute Thread set Bitmap miss...---------------");
            }
            AbstractC3952f.this.m1026g();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public void mo1017b(BitmapDrawable bitmapDrawable) {
            super.mo1017b((C3954b) bitmapDrawable);
            synchronized (AbstractC3952f.this.f12958h) {
                AbstractC3952f.this.f12958h.notifyAll();
            }
        }

        /* renamed from: d */
        private ImageView m1016d() {
            ImageView imageView = this.f12962f.get();
            if (this == AbstractC3952f.m1034b(imageView)) {
                return imageView;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.utils.f$a */
    /* loaded from: classes.dex */
    public static class C3953a extends BitmapDrawable {

        /* renamed from: a */
        private final WeakReference<C3954b> f12959a;

        public C3953a(Resources resources, Bitmap bitmap, C3954b c3954b) {
            super(resources, bitmap);
            this.f12959a = new WeakReference<>(c3954b);
        }

        /* renamed from: a */
        public C3954b m1023a() {
            return this.f12959a.get();
        }
    }

    /* renamed from: g */
    protected void m1026g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1040a(ImageView imageView, Drawable drawable) {
        if (this.f12956f) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(17170445), drawable});
            imageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(VEasing.Back.easeIn);
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: b */
    public void m1031b(boolean z) {
        Log.w("", "setPauseWork--------------------------:" + z);
        synchronized (this.f12958h) {
            this.f12953c = z;
            if (!this.f12953c) {
                this.f12958h.notifyAll();
            }
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.utils.f$c */
    /* loaded from: classes.dex */
    protected class C3955c extends AbstractC3929a<Object, Void, Void> {
        protected C3955c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: d */
        public Void mo1015a(Object... objArr) {
            switch (((Integer) objArr[0]).intValue()) {
                case 0:
                    AbstractC3952f.this.mo1035b();
                    return null;
                case 1:
                    AbstractC3952f.this.mo1044a();
                    return null;
                case 2:
                    AbstractC3952f.this.mo1030c();
                    return null;
                case 3:
                    AbstractC3952f.this.mo1028d();
                    return null;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1044a() {
        if (this.f12951a != null) {
            this.f12951a.m1086a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1035b() {
        if (this.f12951a != null) {
            this.f12951a.m1071b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1030c() {
        if (this.f12951a != null) {
            this.f12951a.m1068c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1028d() {
        if (this.f12951a != null) {
            this.f12951a.m1066d();
            this.f12951a = null;
        }
    }

    /* renamed from: h */
    public void m1025h() {
        new C3955c().m1141c(2);
    }

    /* renamed from: i */
    public void m1024i() {
        new C3955c().m1141c(3);
    }
}
