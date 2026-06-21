package android.support.v4.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public class a {
    public static final Drawable a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 21 ? b.a(context, i) : context.getResources().getDrawable(i);
    }
}
