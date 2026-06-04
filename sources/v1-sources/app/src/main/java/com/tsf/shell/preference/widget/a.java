package com.tsf.shell.preference.widget;

import android.view.View;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class a implements View.OnClickListener {
    final /* synthetic */ TSFPreference a;

    a(TSFPreference tSFPreference) {
        this.a = tSFPreference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.logo /* 2131624018 */:
                TSFPreference tSFPreference = this.a;
                TSFPreference.a("http://www.tsfui.com");
                break;
            case R.id.social_facebook /* 2131624019 */:
                TSFPreference tSFPreference2 = this.a;
                TSFPreference.a("http://www.facebook.com/tsfapp");
                break;
            case R.id.social_google_plus /* 2131624021 */:
                TSFPreference tSFPreference3 = this.a;
                TSFPreference.a("http://gplus.to/tsf");
                break;
            case R.id.social_twitter /* 2131624022 */:
                TSFPreference tSFPreference4 = this.a;
                TSFPreference.a("http://www.twitter.com/tsfapp");
                break;
            case R.id.social_weibo /* 2131624023 */:
                TSFPreference tSFPreference5 = this.a;
                TSFPreference.a("http://weixin.qq.com/r/dnXk68HE5P_bh9CInyBS");
                break;
        }
    }
}
