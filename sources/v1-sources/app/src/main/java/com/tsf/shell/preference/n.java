package com.tsf.shell.preference;

import android.content.Context;

/* loaded from: classes.dex */
final class n extends com.tsf.shell.action.e {
    final /* synthetic */ SettingGesturePreferenceActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(SettingGesturePreferenceActivity settingGesturePreferenceActivity, Context context, com.tsf.shell.h hVar) {
        super(context, hVar, false);
        this.a = settingGesturePreferenceActivity;
    }

    @Override // com.tsf.shell.action.e
    public final void a(com.tsf.shell.action.f fVar) {
        super.a(fVar);
        this.a.findPreference("gesture_pinch_out").setSummary(fVar.a);
        SettingGesturePreferenceActivity.a(this.a, 1, fVar);
    }
}
