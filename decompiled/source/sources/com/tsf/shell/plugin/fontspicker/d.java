package com.tsf.shell.plugin.fontspicker;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.tsf.shell.plugin.fontspicker.a;
import com.tsf.shell.plugin.themepicker.e;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class d {
    Context a;

    public d(Context context) {
        this.a = context;
    }

    public void a(a.C0152a c0152a, TextView textView) {
        if (c0152a != null) {
            textView.setTypeface(Typeface.DEFAULT);
            if (b(c0152a, textView)) {
                a aVar = new a(c0152a, textView);
                textView.setTag(aVar);
                aVar.a(com.tsf.shell.plugin.themepicker.utils.a.c, new Void[0]);
            }
        }
    }

    public static boolean b(a.C0152a c0152a, TextView textView) {
        a a2 = a(textView);
        if (a2 != null) {
            a.C0152a c0152a2 = a2.e;
            if (c0152a2 == null || !c0152a2.equals(c0152a)) {
                a2.a(true);
                e.c("", "--------------------cancelPotentialWork - cancelled work for " + c0152a);
                return true;
            }
            return false;
        }
        return true;
    }

    private static a a(TextView textView) {
        if (textView != null) {
            return (a) textView.getTag();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends com.tsf.shell.plugin.themepicker.utils.a<Void, Void, Typeface> {
        private a.C0152a e;
        private final WeakReference<TextView> f;

        public a(a.C0152a c0152a, TextView textView) {
            this.e = c0152a;
            this.f = new WeakReference<>(textView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public Typeface a(Void... voidArr) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this.e.a(d.this.a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public void a(Typeface typeface) {
            if (c()) {
                typeface = null;
            }
            TextView textView = this.f.get();
            if (typeface != null && textView != null && ((a) textView.getTag()) == this) {
                textView.setTypeface(typeface);
            }
        }
    }
}
