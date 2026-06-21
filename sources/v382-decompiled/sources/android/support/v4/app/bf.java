package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bf implements aa, ab {
    private Notification.Builder a;
    private Bundle b;
    private List c = new ArrayList();

    public bf(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList arrayList, Bundle bundle, String str, boolean z5, String str2) {
        this.a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & ItemInfo.APP_INTENT) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
        this.b = new Bundle();
        if (bundle != null) {
            this.b.putAll(bundle);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.b.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        if (z4) {
            this.b.putBoolean("android.support.localOnly", true);
        }
        if (str != null) {
            this.b.putString("android.support.groupKey", str);
            if (z5) {
                this.b.putBoolean("android.support.isGroupSummary", true);
            } else {
                this.b.putBoolean("android.support.useSideChannel", true);
            }
        }
        if (str2 != null) {
            this.b.putString("android.support.sortKey", str2);
        }
    }

    @Override // android.support.v4.app.aa
    public void a(ax axVar) {
        this.c.add(bc.a(this.a, axVar));
    }

    @Override // android.support.v4.app.ab
    public Notification.Builder a() {
        return this.a;
    }

    public Notification b() {
        SparseArray<? extends Parcelable> a = bc.a(this.c);
        if (a != null) {
            this.b.putSparseParcelableArray("android.support.actionExtras", a);
        }
        this.a.setExtras(this.b);
        return this.a.build();
    }
}
