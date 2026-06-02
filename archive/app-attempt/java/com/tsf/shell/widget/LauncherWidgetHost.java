package com.tsf.shell.widget;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import java.util.List;

public class LauncherWidgetHost extends AppWidgetHost {

    private static final int HOST_ID = 1001;
    private final Context context;

    public LauncherWidgetHost(Context context) {
        super(context, HOST_ID);
        this.context = context;
    }

    @Override
    protected AppWidgetHostView onCreateView(Context context, int appWidgetId, AppWidgetProviderInfo appWidgetProviderInfo) {
        AppWidgetHostView view = super.onCreateView(context, appWidgetId, appWidgetProviderInfo);
        view.setPadding(0, 0, 0, 0);
        return view;
    }

    public List<AppWidgetProviderInfo> getAvailableWidgets() {
        AppWidgetManager manager = AppWidgetManager.getInstance(context);
        return manager.getInstalledProviders();
    }

    public static boolean bindAppWidget(Context context, int appWidgetId, ComponentName provider) {
        try {
            AppWidgetManager manager = AppWidgetManager.getInstance(context);
            return manager.bindAppWidgetIdIfAllowed(appWidgetId, provider);
        } catch (Exception e) {
            return false;
        }
    }
}