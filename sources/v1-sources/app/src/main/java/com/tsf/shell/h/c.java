package com.tsf.shell.h;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;

/* loaded from: classes.dex */
public final class c extends AppWidgetHost {
    public c(Context context) {
        super(context, 1024);
    }

    @Override // android.appwidget.AppWidgetHost
    protected final AppWidgetHostView onCreateView(Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        return new g(context);
    }
}
