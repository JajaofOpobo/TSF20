package org.acra.util;

import android.content.Context;
import android.widget.Toast;
import org.acra.ACRA;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class ToastSender {
    public static void sendToast(Context context, int i, int i2) {
        try {
            Toast.makeText(context, i, i2).show();
        } catch (RuntimeException e) {
            ACRA.log.e(ACRA.LOG_TAG, "Could not send crash Toast", e);
        }
    }
}
