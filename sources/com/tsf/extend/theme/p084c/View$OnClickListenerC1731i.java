package com.tsf.extend.theme.p084c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1430i;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.theme.c.i */
/* loaded from: classes.dex */
public class View$OnClickListenerC1731i extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    private C1727f f5562a;

    /* renamed from: b */
    private List<String> f5563b;

    /* renamed from: c */
    private TextView f5564c;

    /* renamed from: d */
    private int f5565d;

    /* renamed from: e */
    private int f5566e;

    /* renamed from: f */
    private InterfaceC1733a f5567f;

    /* renamed from: g */
    private RotateAnimation f5568g;

    /* renamed from: h */
    private View f5569h;

    /* renamed from: i */
    private View f5570i;

    /* renamed from: com.tsf.extend.theme.c.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1733a {
        /* renamed from: a */
        void mo7634a(String str);
    }

    public View$OnClickListenerC1731i(Context context) {
        super(context);
        this.f5563b = new ArrayList();
        this.f5565d = 0;
        this.f5566e = 0;
        this.f5565d = C1430i.m8659a(10.0f);
        m7637f();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1536f.C1541e.theme_search_tag_refresh) {
            m7638e();
        } else {
            m7645a(view);
        }
    }

    public void setTagData(List<C1726e> list) {
        if (list != null && list.size() > 0) {
            this.f5563b.clear();
            this.f5563b.addAll(m7642a(list));
            m7636g();
            m7646a();
            return;
        }
        m7641b();
    }

    /* renamed from: a */
    public void m7646a() {
        if (this.f5570i != null) {
            this.f5570i.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m7641b() {
        if (this.f5570i != null) {
            this.f5570i.setVisibility(8);
        }
    }

    public void setPromptText(String str) {
        if (this.f5564c != null) {
            this.f5564c.setText(str);
        }
    }

    /* renamed from: c */
    public void m7640c() {
        if (this.f5564c != null) {
            this.f5564c.setVisibility(0);
        }
    }

    /* renamed from: d */
    public void m7639d() {
        if (this.f5564c != null) {
            this.f5564c.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m7638e() {
        this.f5569h.startAnimation(this.f5568g);
        int i = this.f5566e + 1;
        int size = this.f5563b.size();
        if (i * 20 >= size) {
            i = 0;
        }
        if (i != this.f5566e) {
            this.f5562a.removeAllViews();
            int i2 = i * 20;
            int i3 = size - i2;
            int i4 = i3 <= 20 ? i3 : 20;
            for (int i5 = 0; i5 < i4; i5++) {
                m7643a(this.f5563b.get(i5 + i2));
            }
            this.f5566e = i;
        }
        C1707a.m7734a();
    }

    /* renamed from: a */
    private void m7645a(View view) {
        String charSequence = ((TextView) view).getText().toString();
        if (this.f5567f != null) {
            this.f5567f.mo7634a(charSequence);
        }
    }

    /* renamed from: f */
    private void m7637f() {
        setOrientation(1);
        Context context = getContext();
        this.f5564c = new TextView(context);
        this.f5564c.setText(C1536f.C1543g.theme_search_no_search_result);
        this.f5564c.setTextSize(14.0f);
        this.f5564c.setTextColor(2134061875);
        int m8659a = C1430i.m8659a(16.0f);
        this.f5564c.setPadding(m8659a, 0, m8659a, 0);
        addView(this.f5564c);
        setBottomMargin(this.f5564c);
        View inflate = LayoutInflater.from(context).inflate(C1536f.C1542f.theme_search_tag_refresh_view, (ViewGroup) null);
        this.f5569h = inflate.findViewById(C1536f.C1541e.theme_search_tag_refresh);
        this.f5569h.setOnClickListener(this);
        addView(inflate);
        setBottomMargin(inflate);
        this.f5570i = inflate;
        this.f5562a = new C1727f(context);
        addView(this.f5562a);
        m7635h();
    }

    private void setBottomMargin(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.getLayoutParams());
        layoutParams.bottomMargin = this.f5565d;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private List<String> m7642a(List<C1726e> list) {
        ArrayList arrayList = new ArrayList();
        for (C1726e c1726e : list) {
            arrayList.add(c1726e.m7657a());
        }
        return arrayList;
    }

    /* renamed from: g */
    private void m7636g() {
        int size = this.f5563b.size();
        if (size > 20) {
            size = 20;
        }
        for (int i = 0; i < size; i++) {
            m7643a(this.f5563b.get(i));
        }
        this.f5566e = 0;
    }

    /* renamed from: a */
    private void m7643a(String str) {
        C1729g c1729g = new C1729g(getContext());
        c1729g.setText(str);
        c1729g.setOnClickListener(this);
        this.f5562a.addView(c1729g);
    }

    /* renamed from: h */
    private void m7635h() {
        this.f5568g = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f5568g.setRepeatCount(-1);
        this.f5568g.setRepeatMode(1);
        this.f5568g.setInterpolator(new LinearInterpolator());
        this.f5568g.setDuration(500L);
        this.f5568g.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.theme.c.i.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                if (View$OnClickListenerC1731i.this.f5569h != null) {
                    View$OnClickListenerC1731i.this.f5569h.clearAnimation();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }
        });
    }

    public void setOnTagClickListener(InterfaceC1733a interfaceC1733a) {
        this.f5567f = interfaceC1733a;
    }
}
