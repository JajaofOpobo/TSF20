package android.support.v4.app;

import android.app.Notification;
import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* loaded from: classes.dex */
class al implements ai {
    al() {
    }

    @Override // android.support.v4.app.ai
    public Notification a(ag agVar) {
        Notification notification = agVar.B;
        notification.setLatestEventInfo(agVar.a, agVar.b, agVar.c, agVar.d);
        if (agVar.j > 0) {
            notification.flags |= ItemInfo.APP_INTENT;
        }
        return notification;
    }
}
