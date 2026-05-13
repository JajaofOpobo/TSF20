package com.tsf.shell.plugin.fontspicker;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.tsf.shell.plugin.fontspicker.C3806a;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.utils.AbstractC3929a;
import java.lang.ref.WeakReference;
/* renamed from: com.tsf.shell.plugin.fontspicker.d */
/* loaded from: classes.dex */
public class C3811d {

    /* renamed from: a */
    Context f12551a;

    public C3811d(Context context) {
        this.f12551a = context;
    }

    /* renamed from: a */
    public void m1383a(C3806a.C3807a c3807a, TextView textView) {
        if (c3807a != null) {
            textView.setTypeface(Typeface.DEFAULT);
            if (m1382b(c3807a, textView)) {
                C3812a c3812a = new C3812a(c3807a, textView);
                textView.setTag(c3812a);
                c3812a.m1149a(AbstractC3929a.f12874c, new Void[0]);
            }
        }
    }

    /* renamed from: b */
    public static boolean m1382b(C3806a.C3807a c3807a, TextView textView) {
        C3812a m1384a = m1384a(textView);
        if (m1384a != null) {
            C3806a.C3807a c3807a2 = m1384a.f12553e;
            if (c3807a2 == null || !c3807a2.equals(c3807a)) {
                m1384a.m1148a(true);
                C3851e.m1315c("", "--------------------cancelPotentialWork - cancelled work for " + c3807a);
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C3812a m1384a(TextView textView) {
        if (textView != null) {
            return (C3812a) textView.getTag();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.fontspicker.d$a */
    /* loaded from: classes.dex */
    public class C3812a extends AbstractC3929a<Void, Void, Typeface> {

        /* renamed from: e */
        private C3806a.C3807a f12553e;

        /* renamed from: f */
        private final WeakReference<TextView> f12554f;

        public C3812a(C3806a.C3807a c3807a, TextView textView) {
            this.f12553e = c3807a;
            this.f12554f = new WeakReference<>(textView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public Typeface mo1015a(Void... voidArr) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this.f12553e.m1396a(C3811d.this.f12551a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo1020a(Typeface typeface) {
            if (m1144c()) {
                typeface = null;
            }
            TextView textView = this.f12554f.get();
            if (typeface != null && textView != null && ((C3812a) textView.getTag()) == this) {
                textView.setTypeface(typeface);
            }
        }
    }
}
