package com.tsf.shell.e;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends AppWidgetHost {
    public a(Context context, int i) {
        super(context, i);
    }

    @Override // android.appwidget.AppWidgetHost
    protected AppWidgetHostView onCreateView(Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        return new c(context);
    }
}
