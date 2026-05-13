package com.tsf.shell.p095e;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
/* renamed from: com.tsf.shell.e.a */
/* loaded from: classes.dex */
public class C2254a extends AppWidgetHost {
    public C2254a(Context context, int i) {
        super(context, i);
    }

    @Override // android.appwidget.AppWidgetHost
    protected AppWidgetHostView onCreateView(Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        return new C2259c(context);
    }
}
