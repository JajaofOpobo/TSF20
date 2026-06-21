package com.tsf.shell.e.e.g.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends e {
    private static com.tsf.shell.manager.o.a.a textCreater;
    private ArrayList functions;
    private l functionsContainer;
    private boolean initExtraItem = false;

    public boolean hasFunctions() {
        if (this.functions == null || this.functions.isEmpty()) {
            return false;
        }
        Iterator it = this.functions.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f()) {
                return true;
            }
        }
        return false;
    }

    public void setFunctions(ArrayList arrayList) {
        this.functions = arrayList;
        if (arrayList != null) {
            this.functionsContainer = new com.tsf.shell.e.e.g.b();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.functionsContainer.addChild((b) it.next());
            }
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public l getMenuContainer() {
        return this.functionsContainer;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onThemeChanged() {
        super.onThemeChanged();
        int size = this.functions == null ? 0 : this.functions.size();
        for (int i = 0; i < size; i++) {
            ((b) this.functions.get(i)).g();
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void show(boolean z) {
        super.show(z);
        int size = this.functions == null ? 0 : this.functions.size();
        if (!this.initExtraItem && size > 0) {
            this.initExtraItem = true;
            for (int i = 0; i < size; i++) {
                ((b) this.functions.get(i)).d();
            }
            this.functionsContainer.measure();
        }
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void recycle() {
        int size = this.functions == null ? 0 : this.functions.size();
        for (int i = 0; i < size; i++) {
            ((b) this.functions.get(i)).e();
        }
        this.initExtraItem = false;
        super.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap createCustomIco(String str, Bitmap bitmap) {
        if (textCreater == null) {
            textCreater = new com.tsf.shell.manager.o.a.a();
        }
        textCreater.d(false);
        textCreater.h(40);
        textCreater.i(-1);
        Bitmap b = textCreater.b(str);
        int i = (int) (92.0f * com.censivn.C3DEngine.b.b.a.c);
        Bitmap createBitmap = Bitmap.createBitmap(b.getWidth() + i + ((int) (0.0f * com.censivn.C3DEngine.b.b.a.c)), i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, (i - bitmap.getWidth()) / 2.0f, (i - bitmap.getHeight()) / 2.0f, paint);
        bitmap.recycle();
        canvas.drawBitmap(b, r2 + i, (i - b.getHeight()) / 2.0f, paint);
        b.recycle();
        return createBitmap;
    }
}
