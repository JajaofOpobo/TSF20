package android.support.p002v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
/* renamed from: android.support.v4.app.u */
/* loaded from: classes.dex */
public class C0114u extends Fragment {

    /* renamed from: a */
    ListAdapter f365a;

    /* renamed from: b */
    ListView f368b;

    /* renamed from: c */
    View f369c;

    /* renamed from: d */
    TextView f370d;

    /* renamed from: e */
    View f371e;

    /* renamed from: f */
    View f372f;

    /* renamed from: g */
    CharSequence f373g;

    /* renamed from: h */
    boolean f374h;

    /* renamed from: i */
    private final Handler f375i = new Handler();

    /* renamed from: ai */
    private final Runnable f366ai = new Runnable() { // from class: android.support.v4.app.u.1
        @Override // java.lang.Runnable
        public void run() {
            C0114u.this.f368b.focusableViewAvailable(C0114u.this.f368b);
        }
    };

    /* renamed from: aj */
    private final AdapterView.OnItemClickListener f367aj = new AdapterView.OnItemClickListener() { // from class: android.support.v4.app.u.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0114u.this.mo6072a((ListView) adapterView, view, i, j);
        }
    };

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity i = m13745i();
        FrameLayout frameLayout = new FrameLayout(i);
        LinearLayout linearLayout = new LinearLayout(i);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(i, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(i);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(m13745i());
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(m13745i());
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: a */
    public void mo13465a(View view, Bundle bundle) {
        super.mo13465a(view, bundle);
        m13466a();
    }

    @Override // android.support.p002v4.app.Fragment
    /* renamed from: f */
    public void mo13462f() {
        this.f375i.removeCallbacks(this.f366ai);
        this.f368b = null;
        this.f374h = false;
        this.f372f = null;
        this.f371e = null;
        this.f369c = null;
        this.f370d = null;
        super.mo13462f();
    }

    /* renamed from: a */
    public void mo6072a(ListView listView, View view, int i, long j) {
    }

    /* renamed from: a */
    public void m13464a(ListAdapter listAdapter) {
        boolean z = this.f365a != null;
        this.f365a = listAdapter;
        if (this.f368b != null) {
            this.f368b.setAdapter(listAdapter);
            if (!this.f374h && !z) {
                m13463a(true, m13735p().getWindowToken() != null);
            }
        }
    }

    /* renamed from: a */
    private void m13463a(boolean z, boolean z2) {
        m13466a();
        if (this.f371e == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f374h != z) {
            this.f374h = z;
            if (z) {
                if (z2) {
                    this.f371e.startAnimation(AnimationUtils.loadAnimation(m13745i(), 17432577));
                    this.f372f.startAnimation(AnimationUtils.loadAnimation(m13745i(), 17432576));
                } else {
                    this.f371e.clearAnimation();
                    this.f372f.clearAnimation();
                }
                this.f371e.setVisibility(8);
                this.f372f.setVisibility(0);
                return;
            }
            if (z2) {
                this.f371e.startAnimation(AnimationUtils.loadAnimation(m13745i(), 17432576));
                this.f372f.startAnimation(AnimationUtils.loadAnimation(m13745i(), 17432577));
            } else {
                this.f371e.clearAnimation();
                this.f372f.clearAnimation();
            }
            this.f371e.setVisibility(0);
            this.f372f.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m13466a() {
        if (this.f368b == null) {
            View p = m13735p();
            if (p == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (p instanceof ListView) {
                this.f368b = (ListView) p;
            } else {
                this.f370d = (TextView) p.findViewById(16711681);
                if (this.f370d == null) {
                    this.f369c = p.findViewById(16908292);
                } else {
                    this.f370d.setVisibility(8);
                }
                this.f371e = p.findViewById(16711682);
                this.f372f = p.findViewById(16711683);
                View findViewById = p.findViewById(16908298);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                this.f368b = (ListView) findViewById;
                if (this.f369c != null) {
                    this.f368b.setEmptyView(this.f369c);
                } else if (this.f373g != null) {
                    this.f370d.setText(this.f373g);
                    this.f368b.setEmptyView(this.f370d);
                }
            }
            this.f374h = true;
            this.f368b.setOnItemClickListener(this.f367aj);
            if (this.f365a != null) {
                ListAdapter listAdapter = this.f365a;
                this.f365a = null;
                m13464a(listAdapter);
            } else if (this.f371e != null) {
                m13463a(false, false);
            }
            this.f375i.post(this.f366ai);
        }
    }
}
