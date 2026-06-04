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

/* loaded from: classes.dex */
public class w extends Fragment {
    ListAdapter P;
    ListView Q;
    View R;
    TextView S;
    View T;
    View U;
    CharSequence V;
    boolean W;
    private final Handler X = new Handler();
    private final Runnable Y = new x(this);
    private final AdapterView.OnItemClickListener Z = new y(this);

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity fragmentActivity = this.t;
        FrameLayout frameLayout = new FrameLayout(fragmentActivity);
        LinearLayout linearLayout = new LinearLayout(fragmentActivity);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(fragmentActivity, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(fragmentActivity);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(this.t);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(this.t);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        z();
    }

    @Override // android.support.v4.app.Fragment
    public final void n() {
        this.X.removeCallbacks(this.Y);
        this.Q = null;
        this.W = false;
        this.U = null;
        this.T = null;
        this.R = null;
        this.S = null;
        super.n();
    }

    public void a(int i) {
    }

    public final void a(ListAdapter listAdapter) {
        boolean z = this.P != null;
        this.P = listAdapter;
        if (this.Q != null) {
            this.Q.setAdapter(listAdapter);
            if (!this.W && !z) {
                a(true, this.I.getWindowToken() != null);
            }
        }
    }

    private void a(boolean z, boolean z2) {
        z();
        if (this.T == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.W != z) {
            this.W = z;
            if (z) {
                if (z2) {
                    this.T.startAnimation(AnimationUtils.loadAnimation(this.t, R.anim.fade_out));
                    this.U.startAnimation(AnimationUtils.loadAnimation(this.t, R.anim.fade_in));
                } else {
                    this.T.clearAnimation();
                    this.U.clearAnimation();
                }
                this.T.setVisibility(8);
                this.U.setVisibility(0);
                return;
            }
            if (z2) {
                this.T.startAnimation(AnimationUtils.loadAnimation(this.t, R.anim.fade_in));
                this.U.startAnimation(AnimationUtils.loadAnimation(this.t, R.anim.fade_out));
            } else {
                this.T.clearAnimation();
                this.U.clearAnimation();
            }
            this.T.setVisibility(0);
            this.U.setVisibility(8);
        }
    }

    private void z() {
        if (this.Q == null) {
            View view = this.I;
            if (view == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (view instanceof ListView) {
                this.Q = (ListView) view;
            } else {
                this.S = (TextView) view.findViewById(16711681);
                if (this.S == null) {
                    this.R = view.findViewById(R.id.empty);
                } else {
                    this.S.setVisibility(8);
                }
                this.T = view.findViewById(16711682);
                this.U = view.findViewById(16711683);
                View findViewById = view.findViewById(R.id.list);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                this.Q = (ListView) findViewById;
                if (this.R != null) {
                    this.Q.setEmptyView(this.R);
                } else if (this.V != null) {
                    this.S.setText(this.V);
                    this.Q.setEmptyView(this.S);
                }
            }
            this.W = true;
            this.Q.setOnItemClickListener(this.Z);
            if (this.P != null) {
                ListAdapter listAdapter = this.P;
                this.P = null;
                a(listAdapter);
            } else if (this.T != null) {
                a(false, false);
            }
            this.X.post(this.Y);
        }
    }
}
