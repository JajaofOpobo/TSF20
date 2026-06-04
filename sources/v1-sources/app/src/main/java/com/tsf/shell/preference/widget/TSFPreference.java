package com.tsf.shell.preference.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tsf.shell.R;
import com.tsf.shell.preference.SettingPreferenceActivity;

/* loaded from: classes.dex */
public class TSFPreference extends Preference {
    private Context a;

    public TSFPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        super.onBindView(view);
    }

    @Override // android.preference.Preference
    protected View onCreateView(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.tsf_preferences, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.logo);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.social_facebook);
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.social_weixin);
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.social_google_plus);
        ImageView imageView5 = (ImageView) inflate.findViewById(R.id.social_twitter);
        ImageView imageView6 = (ImageView) inflate.findViewById(R.id.social_weibo);
        a aVar = new a(this);
        imageView.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        imageView5.setOnClickListener(aVar);
        imageView6.setOnClickListener(aVar);
        return inflate;
    }

    static /* synthetic */ void a(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        SettingPreferenceActivity.a.startActivity(intent);
    }
}
