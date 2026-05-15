package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent2.setPackage(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices.isEmpty()) {
            intent2.setAction("android.media.browse.MediaBrowserService");
            listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        }
        if (listQueryIntentServices.isEmpty()) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or a media browser service implementation");
        }
        if (listQueryIntentServices.size() != 1) {
            throw new IllegalStateException("Expected 1 Service that handles " + intent2.getAction() + ", found " + listQueryIntentServices.size());
        }
        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
        intent.setComponent(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
        context.startService(intent);
    }
}
