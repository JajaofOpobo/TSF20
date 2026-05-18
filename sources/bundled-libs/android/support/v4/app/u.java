package android.support.v4.app;

import android.R;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class u extends Fragment {
    ListAdapter a;
    ListView b;
    View c;
    TextView d;
    View e;
    View f;
    CharSequence g;
    boolean h;
    private final Handler i = new Handler();
    private final Runnable ai = new Runnable() { // from class: android.support.v4.app.u.1
        @Override // java.lang.Runnable
        public void run() {
            u.this.b.focusableViewAvailable(u.this.b);
        }
    };
    private final AdapterView.OnItemClickListener aj = new AdapterView.OnItemClickListener() { // from class: android.support.v4.app.u.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            u.this.a((ListView) adapterView, view, i, j);
        }
    };

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity fragmentActivityI = i();
        FrameLayout frameLayout = new FrameLayout(fragmentActivityI);
        LinearLayout linearLayout = new LinearLayout(fragmentActivityI);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(fragmentActivityI, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(fragmentActivityI);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(i());
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(i());
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // android.support.v4.app.Fragment
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        a();
    }

    @Override // android.support.v4.app.Fragment
    public void f() {
        this.i.removeCallbacks(this.ai);
        this.b = null;
        this.h = false;
        this.f = null;
        this.e = null;
        this.c = null;
        this.d = null;
        super.f();
    }

    public void a(ListView listView, View view, int i, long j) {
    }

    public void a(ListAdapter listAdapter) {
        boolean z = this.a != null;
        this.a = listAdapter;
        if (this.b != null) {
            this.b.setAdapter(listAdapter);
            if (!this.h && !z) {
                a(true, p().getWindowToken() != null);
            }
        }
    }

    private void a(boolean z, boolean z2) {
        a();
        if (this.e == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.h != z) {
            this.h = z;
            if (z) {
                if (z2) {
                    this.e.startAnimation(AnimationUtils.loadAnimation(i(), R.anim.fade_out));
                    this.f.startAnimation(AnimationUtils.loadAnimation(i(), R.anim.fade_in));
                } else {
                    this.e.clearAnimation();
                    this.f.clearAnimation();
                }
                this.e.setVisibility(8);
                this.f.setVisibility(0);
                return;
            }
            if (z2) {
                this.e.startAnimation(AnimationUtils.loadAnimation(i(), R.anim.fade_in));
                this.f.startAnimation(AnimationUtils.loadAnimation(i(), R.anim.fade_out));
            } else {
                this.e.clearAnimation();
                this.f.clearAnimation();
            }
            this.e.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    private void a() {
        if (this.b == null) {
            View viewP = p();
            if (viewP == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (viewP instanceof ListView) {
                this.b = (ListView) viewP;
            } else {
                this.d = (TextView) viewP.findViewById(16711681);
                if (this.d == null) {
                    this.c = viewP.findViewById(R.id.empty);
                } else {
                    this.d.setVisibility(8);
                }
                this.e = viewP.findViewById(16711682);
                this.f = viewP.findViewById(16711683);
                View viewFindViewById = viewP.findViewById(R.id.list);
                if (!(viewFindViewById instanceof ListView)) {
                    if (viewFindViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                this.b = (ListView) viewFindViewById;
                if (this.c != null) {
                    this.b.setEmptyView(this.c);
                } else if (this.g != null) {
                    this.d.setText(this.g);
                    this.b.setEmptyView(this.d);
                }
            }
            this.h = true;
            this.b.setOnItemClickListener(this.aj);
            if (this.a != null) {
                ListAdapter listAdapter = this.a;
                this.a = null;
                a(listAdapter);
            } else if (this.e != null) {
                a(false, false);
            }
            this.i.post(this.ai);
        }
    }
}
