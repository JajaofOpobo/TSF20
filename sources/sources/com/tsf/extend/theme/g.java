package com.tsf.extend.theme;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends Notification.Builder {
    public g(Context context) {
        super(context);
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.addAction(i, charSequence, pendingIntent);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        return Build.VERSION.SDK_INT >= 16 ? super.build() : super.getNotification();
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g setExtras(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 19) {
            super.setExtras(bundle);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g setPriority(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setPriority(i);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g setShowWhen(boolean z) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.setShowWhen(z);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g setStyle(Notification.Style style) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setStyle(style);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g setSubText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setSubText(charSequence);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g setUsesChronometer(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setUsesChronometer(z);
        }
        return this;
    }
}
