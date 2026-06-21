package com.tsf.shell.plugin.fontspicker;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public class g {
    Context a;

    public g(Context context) {
        this.a = context;
    }

    public void a(b bVar, TextView textView) {
        if (bVar != null) {
            textView.setTypeface(Typeface.DEFAULT);
            if (b(bVar, textView)) {
                h hVar = new h(this, bVar, textView);
                textView.setTag(hVar);
                hVar.a(com.tsf.shell.plugin.themepicker.utils.a.c, new Void[0]);
            }
        }
    }

    public static boolean b(b bVar, TextView textView) {
        b bVar2;
        h a = a(textView);
        if (a == null) {
            return true;
        }
        bVar2 = a.e;
        if (bVar2 == null || !bVar2.equals(bVar)) {
            a.a(true);
            com.tsf.shell.plugin.themepicker.g.c("", "--------------------cancelPotentialWork - cancelled work for " + bVar);
            return true;
        }
        return false;
    }

    private static h a(TextView textView) {
        if (textView != null) {
            return (h) textView.getTag();
        }
        return null;
    }
}
