package android.support.v4.app;

import android.app.Notification;
import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* loaded from: classes.dex */
class am extends al {
    am() {
    }

    @Override // android.support.v4.app.al, android.support.v4.app.ai
    public Notification a(ag agVar) {
        Notification notification = agVar.B;
        notification.setLatestEventInfo(agVar.a, agVar.b, agVar.c, agVar.d);
        Notification a = az.a(notification, agVar.a, agVar.b, agVar.c, agVar.d, agVar.e);
        if (agVar.j > 0) {
            a.flags |= ItemInfo.APP_INTENT;
        }
        return a;
    }
}
