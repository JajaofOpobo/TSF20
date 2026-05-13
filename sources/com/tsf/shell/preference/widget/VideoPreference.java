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
import com.tsf.C1306b;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.preference.video.VideoViwerActivity;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class VideoPreference extends Preference {

    /* renamed from: a */
    private RelativeLayout f13340a;

    /* renamed from: b */
    private Context f13341b;

    /* renamed from: c */
    private ImageView f13342c;

    public VideoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13341b = context;
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        super.onBindView(view);
    }

    @Override // android.preference.Preference
    protected View onCreateView(ViewGroup viewGroup) {
        this.f13340a = (RelativeLayout) LayoutInflater.from(getContext()).inflate(C1306b.C1313g.normal_preference, viewGroup, false);
        ((TextView) this.f13340a.findViewById(C1306b.C1311e.text)).setText(C4189x.m588c(C1306b.C1315i.mn_introduction_video));
        this.f13342c = (ImageView) this.f13340a.findViewById(C1306b.C1311e.new_icon);
        try {
            if (C3430e.m2446l().equals(VideoViwerActivity.f13312a)) {
                m783a(false);
            } else {
                m783a(true);
            }
        } catch (Exception e) {
        }
        return this.f13340a;
    }

    /* renamed from: a */
    public void m783a(boolean z) {
        if (z) {
            this.f13342c.setVisibility(0);
        } else {
            this.f13342c.setVisibility(4);
        }
    }
}
