package com.tsf.extend.theme;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
/* renamed from: com.tsf.extend.theme.g */
/* loaded from: classes.dex */
public class Notification$BuilderC1843g extends Notification.Builder {
    public Notification$BuilderC1843g(Context context) {
        super(context);
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public Notification$BuilderC1843g addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
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
    /* renamed from: a */
    public Notification$BuilderC1843g setExtras(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 19) {
            super.setExtras(bundle);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public Notification$BuilderC1843g setPriority(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setPriority(i);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public Notification$BuilderC1843g setShowWhen(boolean z) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.setShowWhen(z);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public Notification$BuilderC1843g setStyle(Notification.Style style) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setStyle(style);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a */
    public Notification$BuilderC1843g setSubText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setSubText(charSequence);
        }
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: b */
    public Notification$BuilderC1843g setUsesChronometer(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setUsesChronometer(z);
        }
        return this;
    }
}
