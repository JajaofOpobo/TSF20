package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class x extends ContextWrapper {
    private static final ArrayList<WeakReference<x>> a = new ArrayList<>();
    private Resources b;
    private final Resources.Theme c;

    public static Context a(Context context) {
        if (b(context)) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                WeakReference<x> weakReference = a.get(i);
                x xVar = weakReference != null ? weakReference.get() : null;
                if (xVar != null && xVar.getBaseContext() == context) {
                    return xVar;
                }
            }
            x xVar2 = new x(context);
            a.add(new WeakReference<>(xVar2));
            return xVar2;
        }
        return context;
    }

    private static boolean b(Context context) {
        if ((context instanceof x) || (context.getResources() instanceof z) || (context.getResources() instanceof ac)) {
            return false;
        }
        return !android.support.v7.app.d.j() || Build.VERSION.SDK_INT <= 20;
    }

    private x(Context context) {
        super(context);
        if (ac.a()) {
            this.c = getResources().newTheme();
            this.c.setTo(context.getTheme());
        } else {
            this.c = null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return this.c == null ? super.getTheme() : this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.c == null) {
            super.setTheme(i);
        } else {
            this.c.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.b == null) {
            this.b = this.c == null ? new z(this, super.getResources()) : new ac(this, super.getResources());
        }
        return this.b;
    }
}
