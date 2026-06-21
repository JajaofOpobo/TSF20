package com.tsf.shell.plugin.themepicker.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class s extends a {
    final /* synthetic */ q a;
    private Object e;
    private final WeakReference f;

    public s(q qVar, Object obj, ImageView imageView) {
        this.a = qVar;
        this.e = obj;
        this.f = new WeakReference(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitmapDrawable a(Void... voidArr) {
        Object obj;
        l lVar;
        Bitmap bitmap;
        l lVar2;
        l lVar3;
        boolean z;
        boolean z2;
        l lVar4;
        Object obj2;
        BitmapDrawable bitmapDrawable = null;
        com.tsf.shell.plugin.themepicker.g.a("ImageWorker", "doInBackground - starting work");
        String valueOf = String.valueOf(this.e);
        obj = this.a.h;
        synchronized (obj) {
            while (this.a.c && !c()) {
                try {
                    obj2 = this.a.h;
                    obj2.wait();
                } catch (InterruptedException e) {
                }
            }
        }
        com.tsf.shell.plugin.themepicker.g.c("", "doInBackground Thread isRunning...");
        lVar = this.a.a;
        if (lVar != null && !c() && e() != null) {
            z2 = this.a.g;
            if (!z2) {
                lVar4 = this.a.a;
                bitmap = lVar4.b(valueOf);
                if (bitmap == null && !c() && e() != null) {
                    z = this.a.g;
                    if (!z) {
                        bitmap = this.a.a(this.e);
                    }
                }
                if (bitmap != null) {
                    if (v.c()) {
                        bitmapDrawable = new BitmapDrawable(this.a.d, bitmap);
                    } else {
                        bitmapDrawable = new u(this.a.d, bitmap);
                    }
                    lVar2 = this.a.a;
                    if (lVar2 != null) {
                        lVar3 = this.a.a;
                        lVar3.a(valueOf, bitmapDrawable);
                    }
                }
                com.tsf.shell.plugin.themepicker.g.a("ImageWorker", "doInBackground - finished work");
                return bitmapDrawable;
            }
        }
        bitmap = null;
        if (bitmap == null) {
            z = this.a.g;
            if (!z) {
            }
        }
        if (bitmap != null) {
        }
        com.tsf.shell.plugin.themepicker.g.a("ImageWorker", "doInBackground - finished work");
        return bitmapDrawable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0 != false) goto L6;
     */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(BitmapDrawable bitmapDrawable) {
        boolean z;
        if (!c()) {
            z = this.a.g;
        }
        bitmapDrawable = null;
        ImageView e = e();
        if (bitmapDrawable != null && e != null) {
            com.tsf.shell.plugin.themepicker.g.a("ImageWorker", "onPostExecute - setting bitmap");
            this.a.a(e, bitmapDrawable);
        } else {
            com.tsf.shell.plugin.themepicker.g.c("", "onPostExecute Thread set Bitmap miss...---------------");
        }
        this.a.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    public void b(BitmapDrawable bitmapDrawable) {
        Object obj;
        Object obj2;
        super.b((Object) bitmapDrawable);
        obj = this.a.h;
        synchronized (obj) {
            obj2 = this.a.h;
            obj2.notifyAll();
        }
    }

    private ImageView e() {
        s b;
        ImageView imageView = (ImageView) this.f.get();
        b = q.b(imageView);
        if (this == b) {
            return imageView;
        }
        return null;
    }
}
