package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;

/* loaded from: classes.dex */
class as {
    public static void a(Notification.Builder builder, ax axVar) {
        Notification.Action.Builder builder2 = new Notification.Action.Builder(axVar.a(), axVar.b(), axVar.c());
        if (axVar.f() != null) {
            for (RemoteInput remoteInput : bl.a(axVar.f())) {
                builder2.addRemoteInput(remoteInput);
            }
        }
        if (axVar.d() != null) {
            builder2.addExtras(axVar.d());
        }
        builder.addAction(builder2.build());
    }
}
