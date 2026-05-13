package com.tsf.extend.theme.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.extend.f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class i extends LinearLayout implements View.OnClickListener {
    private f a;
    private List<String> b;
    private TextView c;
    private int d;
    private int e;
    private a f;
    private RotateAnimation g;
    private View h;
    private View i;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public i(Context context) {
        super(context);
        this.b = new ArrayList();
        this.d = 0;
        this.e = 0;
        this.d = com.tsf.extend.base.j.i.a(10.0f);
        f();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.e.theme_search_tag_refresh) {
            e();
        } else {
            a(view);
        }
    }

    public void setTagData(List<e> list) {
        if (list != null && list.size() > 0) {
            this.b.clear();
            this.b.addAll(a(list));
            g();
            a();
            return;
        }
        b();
    }

    public void a() {
        if (this.i != null) {
            this.i.setVisibility(0);
        }
    }

    public void b() {
        if (this.i != null) {
            this.i.setVisibility(8);
        }
    }

    public void setPromptText(String str) {
        if (this.c != null) {
            this.c.setText(str);
        }
    }

    public void c() {
        if (this.c != null) {
            this.c.setVisibility(0);
        }
    }

    public void d() {
        if (this.c != null) {
            this.c.setVisibility(8);
        }
    }

    private void e() {
        this.h.startAnimation(this.g);
        int i = this.e + 1;
        int size = this.b.size();
        if (i * 20 >= size) {
            i = 0;
        }
        if (i != this.e) {
            this.a.removeAllViews();
            int i2 = i * 20;
            int i3 = size - i2;
            int i4 = i3 <= 20 ? i3 : 20;
            for (int i5 = 0; i5 < i4; i5++) {
                a(this.b.get(i5 + i2));
            }
            this.e = i;
        }
        com.tsf.extend.theme.c.a.a();
    }

    private void a(View view) {
        String charSequence = ((TextView) view).getText().toString();
        if (this.f != null) {
            this.f.a(charSequence);
        }
    }

    private void f() {
        setOrientation(1);
        Context context = getContext();
        this.c = new TextView(context);
        this.c.setText(f.g.theme_search_no_search_result);
        this.c.setTextSize(14.0f);
        this.c.setTextColor(2134061875);
        int a2 = com.tsf.extend.base.j.i.a(16.0f);
        this.c.setPadding(a2, 0, a2, 0);
        addView(this.c);
        setBottomMargin(this.c);
        View inflate = LayoutInflater.from(context).inflate(f.C0052f.theme_search_tag_refresh_view, (ViewGroup) null);
        this.h = inflate.findViewById(f.e.theme_search_tag_refresh);
        this.h.setOnClickListener(this);
        addView(inflate);
        setBottomMargin(inflate);
        this.i = inflate;
        this.a = new f(context);
        addView(this.a);
        h();
    }

    private void setBottomMargin(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.getLayoutParams());
        layoutParams.bottomMargin = this.d;
        view.setLayoutParams(layoutParams);
    }

    private List<String> a(List<e> list) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : list) {
            arrayList.add(eVar.a());
        }
        return arrayList;
    }

    private void g() {
        int size = this.b.size();
        if (size > 20) {
            size = 20;
        }
        for (int i = 0; i < size; i++) {
            a(this.b.get(i));
        }
        this.e = 0;
    }

    private void a(String str) {
        g gVar = new g(getContext());
        gVar.setText(str);
        gVar.setOnClickListener(this);
        this.a.addView(gVar);
    }

    private void h() {
        this.g = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.g.setRepeatCount(-1);
        this.g.setRepeatMode(1);
        this.g.setInterpolator(new LinearInterpolator());
        this.g.setDuration(500L);
        this.g.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.c.i.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                if (i.this.h != null) {
                    i.this.h.clearAnimation();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }
        });
    }

    public void setOnTagClickListener(a aVar) {
        this.f = aVar;
    }
}
