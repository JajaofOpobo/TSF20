package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class be extends br {
    private static final String a = be.class.getSimpleName();
    private static final Map b;
    private final eb c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(LinearLayout.class, new cs());
        hashMap.put(AbsoluteLayout.class, new bx());
        hashMap.put(FrameLayout.class, new ba());
        hashMap.put(RelativeLayout.class, new ao());
        b = Collections.unmodifiableMap(hashMap);
    }

    public be(eb ebVar, j jVar) {
        super(jVar);
        this.c = ebVar;
    }

    @Override // com.flurry.android.br
    public final void a(Context context, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        String str = "render(" + context + ", " + viewGroup + ")";
        if (this.c == null || context == null || viewGroup == null) {
            String str2 = "failed to render banner ad for bannerView = " + this.c + " for context = " + context + " for viewGroup = " + viewGroup;
            return;
        }
        s a2 = s.a();
        an a3 = a2.c.a(a2, context, viewGroup, b());
        if (a3 == null) {
            String str3 = "failed to render banner ad for holder = " + a3 + " for adSpaceName = " + b();
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) a3.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(a3);
        }
        a3.b();
        a3.removeAllViews();
        ViewGroup viewGroup3 = (ViewGroup) this.c.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeView(this.c);
        }
        a3.addView(this.c, new RelativeLayout.LayoutParams(-1, -1));
        this.c.a(context);
        if (a() == null || a().d().size() <= 0) {
            layoutParams = null;
        } else {
            i e = ((b) a().d().get(0)).e();
            if (e == null) {
                layoutParams = null;
            } else {
                cx cxVar = (cx) b.get(viewGroup.getClass());
                if (cxVar == null) {
                    String str4 = "Ad space layout and alignment from the server is being ignored for ViewGroup subclass " + viewGroup.getClass().getSimpleName();
                    layoutParams = null;
                } else {
                    layoutParams = cxVar.a(context, e);
                    if (layoutParams == null) {
                        String str5 = "Ad space layout and alignment from the server is being ignored for ViewGroup subclass " + viewGroup.getClass().getSimpleName();
                    }
                }
            }
        }
        if (layoutParams != null) {
            a3.setLayoutParams(layoutParams);
            String str6 = "banner ad holder layout params = " + layoutParams.getClass().getName() + " {width = " + layoutParams.width + ", height = " + layoutParams.height + "} for banner ad with adSpaceName = " + b();
        }
        int childCount = viewGroup.getChildCount();
        if (a() == null || a().d().size() <= 0) {
            i = childCount;
        } else {
            i e2 = ((b) a().d().get(0)).e();
            if (e2 != null) {
                String[] split = e2.f().toString().split("-");
                if (split.length == 2 && "t".equals(split[0])) {
                    i = 0;
                }
            }
            i = childCount;
        }
        viewGroup.addView(a3, i);
    }
}
