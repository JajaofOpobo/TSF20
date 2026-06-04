package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
final class g extends Handler {
    final /* synthetic */ FragmentActivity a;

    g(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.a.f) {
                    this.a.a(false);
                    break;
                }
                break;
            case 2:
                this.a.a();
                this.a.b.d();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
