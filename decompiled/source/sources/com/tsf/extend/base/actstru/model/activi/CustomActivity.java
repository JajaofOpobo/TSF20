package com.tsf.extend.base.actstru.model.activi;

import android.content.Context;
import com.tsf.extend.base.actstru.model.EventBasedActivity;
import com.tsf.extend.base.actstru.model.a.b;
/* loaded from: classes.dex */
public class CustomActivity extends EventBasedActivity {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(new b(context));
    }
}
