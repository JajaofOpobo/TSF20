package android.support.v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    MediaSessionCompat.Token a;
    private final android.support.v4.d.a<IBinder, b> b = new android.support.v4.d.a<>();
    private final f c = new f(this, null);

    private interface d {
        IBinder a();

        void a(String str, MediaSessionCompat.Token token, Bundle bundle);

        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle);

        void b();
    }

    private class h {
    }

    private class i extends h {
    }

    public abstract a a(String str, int i2, Bundle bundle);

    public abstract void a(String str, c<List<MediaBrowserCompat.MediaItem>> cVar);

    private final class f extends Handler {
        private final g b;

        private f() {
            this.b = new g(MediaBrowserServiceCompat.this, null);
        }

        /* synthetic */ f(MediaBrowserServiceCompat mediaBrowserServiceCompat, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.b.a(data.getString("data_package_name"), data.getInt("data_calling_uid"), data.getBundle("data_root_hints"), MediaBrowserServiceCompat.this.new e(message.replyTo));
                    break;
                case 2:
                    this.b.a(MediaBrowserServiceCompat.this.new e(message.replyTo));
                    break;
                case 3:
                    this.b.a(data.getString("data_media_item_id"), data.getBundle("data_options"), MediaBrowserServiceCompat.this.new e(message.replyTo));
                    break;
                case 4:
                    this.b.b(data.getString("data_media_item_id"), data.getBundle("data_options"), MediaBrowserServiceCompat.this.new e(message.replyTo));
                    break;
                case 5:
                    this.b.a(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"));
                    break;
                case 6:
                    this.b.b(MediaBrowserServiceCompat.this.new e(message.replyTo));
                    break;
                case 7:
                    this.b.c(MediaBrowserServiceCompat.this.new e(message.replyTo));
                    break;
                default:
                    Log.w("MediaBrowserServiceCompat", "Unhandled message: " + message + "\n  Service version: 1\n  Client version: " + message.arg1);
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    private class b {
        String a;
        Bundle b;
        d c;
        a d;
        HashMap<String, List<Bundle>> e;

        private b() {
            this.e = new HashMap<>();
        }

        /* synthetic */ b(MediaBrowserServiceCompat mediaBrowserServiceCompat, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class c<T> {
        private Object a;
        private boolean b;
        private boolean c;
        private int d;

        c(Object obj) {
            this.a = obj;
        }

        public void a(T t) {
            if (this.c) {
                throw new IllegalStateException("sendResult() called twice for: " + this.a);
            }
            this.c = true;
            a(t, this.d);
        }

        boolean a() {
            return this.b || this.c;
        }

        void a(int i) {
            this.d = i;
        }

        void a(T t, int i) {
        }
    }

    private class g {
        private g() {
        }

        /* synthetic */ g(MediaBrowserServiceCompat mediaBrowserServiceCompat, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void a(final String str, final int i, final Bundle bundle, final d dVar) {
            if (MediaBrowserServiceCompat.this.a(str, i)) {
                MediaBrowserServiceCompat.this.c.a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IBinder iBinderA = dVar.a();
                        MediaBrowserServiceCompat.this.b.remove(iBinderA);
                        b bVar = new b(MediaBrowserServiceCompat.this, null);
                        bVar.a = str;
                        bVar.b = bundle;
                        bVar.c = dVar;
                        bVar.d = MediaBrowserServiceCompat.this.a(str, i, bundle);
                        if (bVar.d != null) {
                            try {
                                MediaBrowserServiceCompat.this.b.put(iBinderA, bVar);
                                if (MediaBrowserServiceCompat.this.a != null) {
                                    dVar.a(bVar.d.a(), MediaBrowserServiceCompat.this.a, bVar.d.b());
                                    return;
                                }
                                return;
                            } catch (RemoteException e) {
                                Log.w("MediaBrowserServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
                                MediaBrowserServiceCompat.this.b.remove(iBinderA);
                                return;
                            }
                        }
                        Log.i("MediaBrowserServiceCompat", "No root for client " + str + " from service " + getClass().getName());
                        try {
                            dVar.b();
                        } catch (RemoteException e2) {
                            Log.w("MediaBrowserServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i + " package=" + str);
        }

        public void a(final d dVar) {
            MediaBrowserServiceCompat.this.c.a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (((b) MediaBrowserServiceCompat.this.b.remove(dVar.a())) != null) {
                    }
                }
            });
        }

        public void a(final String str, final Bundle bundle, final d dVar) {
            MediaBrowserServiceCompat.this.c.a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    b bVar = (b) MediaBrowserServiceCompat.this.b.get(dVar.a());
                    if (bVar != null) {
                        MediaBrowserServiceCompat.this.a(str, bVar, bundle);
                    } else {
                        Log.w("MediaBrowserServiceCompat", "addSubscription for callback that isn't registered id=" + str);
                    }
                }
            });
        }

        public void b(final String str, final Bundle bundle, final d dVar) {
            MediaBrowserServiceCompat.this.c.a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    b bVar = (b) MediaBrowserServiceCompat.this.b.get(dVar.a());
                    if (bVar != null) {
                        if (!MediaBrowserServiceCompat.this.b(str, bVar, bundle)) {
                            Log.w("MediaBrowserServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                            return;
                        }
                        return;
                    }
                    Log.w("MediaBrowserServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                }
            });
        }

        public void a(final String str, final ResultReceiver resultReceiver) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.c.a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaBrowserServiceCompat.this.a(str, resultReceiver);
                    }
                });
            }
        }

        public void b(final d dVar) {
            MediaBrowserServiceCompat.this.c.a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.6
                @Override // java.lang.Runnable
                public void run() {
                    IBinder iBinderA = dVar.a();
                    MediaBrowserServiceCompat.this.b.remove(iBinderA);
                    b bVar = new b(MediaBrowserServiceCompat.this, null);
                    bVar.c = dVar;
                    MediaBrowserServiceCompat.this.b.put(iBinderA, bVar);
                }
            });
        }

        public void c(final d dVar) {
            MediaBrowserServiceCompat.this.c.a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.7
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserServiceCompat.this.b.remove(dVar.a());
                }
            });
        }
    }

    private class e implements d {
        final Messenger a;

        e(Messenger messenger) {
            this.a = messenger;
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.d
        public IBinder a() {
            return this.a.getBinder();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.d
        public void a(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 1);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            a(1, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.d
        public void b() throws RemoteException {
            a(2, null);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.d
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            a(3, bundle2);
        }

        private void a(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            this.a.send(messageObtain);
        }
    }

    public void a(String str, c<List<MediaBrowserCompat.MediaItem>> cVar, Bundle bundle) {
        cVar.a(1);
        a(str, cVar);
    }

    public void b(String str, c<MediaBrowserCompat.MediaItem> cVar) {
        cVar.a((MediaBrowserCompat.MediaItem) null);
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserServiceCompat$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ MediaSessionCompat.Token a;
        final /* synthetic */ MediaBrowserServiceCompat b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            for (IBinder iBinder : this.b.b.keySet()) {
                b bVar = (b) this.b.b.get(iBinder);
                try {
                    bVar.c.a(bVar.d.a(), this.a, bVar.d.b());
                } catch (RemoteException e) {
                    Log.w("MediaBrowserServiceCompat", "Connection for " + bVar.a + " is no longer valid.");
                    this.b.b.remove(iBinder);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, b bVar, Bundle bundle) {
        List<Bundle> list = bVar.e.get(str);
        List<Bundle> arrayList = list == null ? new ArrayList() : list;
        Iterator<Bundle> it = arrayList.iterator();
        while (it.hasNext()) {
            if (android.support.v4.media.a.a(bundle, it.next())) {
                return;
            }
        }
        arrayList.add(bundle);
        bVar.e.put(str, arrayList);
        c(str, bVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str, b bVar, Bundle bundle) {
        boolean z;
        List<Bundle> list = bVar.e.get(str);
        if (list == null) {
            return false;
        }
        Iterator<Bundle> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Bundle next = it.next();
            if (android.support.v4.media.a.a(bundle, next)) {
                list.remove(next);
                z = true;
                break;
            }
        }
        if (list.size() == 0) {
            bVar.e.remove(str);
            return z;
        }
        return z;
    }

    private void c(final String str, final b bVar, final Bundle bundle) {
        c<List<MediaBrowserCompat.MediaItem>> cVar = new c<List<MediaBrowserCompat.MediaItem>>(str) { // from class: android.support.v4.media.MediaBrowserServiceCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // android.support.v4.media.MediaBrowserServiceCompat.c
            public void a(List<MediaBrowserCompat.MediaItem> list, int i2) {
                if (MediaBrowserServiceCompat.this.b.get(bVar.c.a()) == bVar) {
                    if ((i2 & 1) != 0) {
                        list = android.support.v4.media.a.a(list, bundle);
                    }
                    try {
                        bVar.c.a(str, list, bundle);
                    } catch (RemoteException e2) {
                        Log.w("MediaBrowserServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + bVar.a);
                    }
                }
            }
        };
        if (bundle == null) {
            a(str, cVar);
        } else {
            a(str, cVar, bundle);
        }
        if (!cVar.a()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + bVar.a + " id=" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final ResultReceiver resultReceiver) {
        c<MediaBrowserCompat.MediaItem> cVar = new c<MediaBrowserCompat.MediaItem>(str) { // from class: android.support.v4.media.MediaBrowserServiceCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // android.support.v4.media.MediaBrowserServiceCompat.c
            public void a(MediaBrowserCompat.MediaItem mediaItem, int i2) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.b(0, bundle);
            }
        };
        b(str, cVar);
        if (!cVar.a()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    public static final class a {
        private final String a;
        private final Bundle b;

        public String a() {
            return this.a;
        }

        public Bundle b() {
            return this.b;
        }
    }
}
