package com.tsf.shell.preference.widget;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.a.t;
import com.tsf.shell.preference.video.VideoViwerActivity;

/* loaded from: classes.dex */
public class VideoPreference extends Preference {
    private RelativeLayout a;
    private Context b;
    private ImageView c;

    public VideoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        super.onBindView(view);
    }

    @Override // android.preference.Preference
    protected View onCreateView(ViewGroup viewGroup) {
        this.a = (RelativeLayout) LayoutInflater.from(getContext()).inflate(R.layout.normal_preference, viewGroup, false);
        ((TextView) this.a.findViewById(R.id.text)).setText(com.censivn.C3DEngine.h.a.c(R.string.mn_introduction_video));
        this.c = (ImageView) this.a.findViewById(R.id.new_icon);
        try {
            if (t.b().equals(VideoViwerActivity.a)) {
                a(false);
            } else {
                a(true);
            }
        } catch (Exception e) {
        }
        return this.a;
    }

    private void a(boolean z) {
        if (z) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(4);
        }
    }
}
