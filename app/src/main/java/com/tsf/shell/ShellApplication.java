package com.tsf.shell;

import android.app.Application;
import com.tsf.shell.data.local.AppDatabase;
import com.tsf.shell.data.local.LegacyMigration;

public class ShellApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppDatabase db = AppDatabase.getInstance(this);
        LegacyMigration.run(this, db);
    }
}