package android.support.p002v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p002v4.media.MediaBrowserCompat;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.support.p002v4.p009d.C0160a;
import android.support.p002v4.p010os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: android.support.v4.media.MediaBrowserServiceCompat */
/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a */
    MediaSessionCompat.Token f477a;

    /* renamed from: b */
    private final C0160a<IBinder, C0182b> f478b = new C0160a<>();

    /* renamed from: c */
    private final HandlerC0186f f479c = new HandlerC0186f(this, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0184d {
        /* renamed from: a */
        IBinder mo13284a();

        /* renamed from: a */
        void mo13282a(String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: a */
        void mo13281a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle);

        /* renamed from: b */
        void mo13280b();
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$h */
    /* loaded from: classes.dex */
    private class C0195h {
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$i */
    /* loaded from: classes.dex */
    private class C0196i extends C0195h {
    }

    /* renamed from: a */
    public abstract C0181a m13302a(String str, int i, Bundle bundle);

    /* renamed from: a */
    public abstract void m13300a(String str, C0183c<List<MediaBrowserCompat.MediaItem>> c0183c);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$f */
    /* loaded from: classes.dex */
    public final class HandlerC0186f extends Handler {

        /* renamed from: b */
        private final C0187g f503b;

        private HandlerC0186f() {
            this.f503b = new C0187g(MediaBrowserServiceCompat.this, null);
        }

        /* synthetic */ HandlerC0186f(MediaBrowserServiceCompat mediaBrowserServiceCompat, RunnableC01781 runnableC01781) {
            this();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.f503b.m13277a(data.getString("data_package_name"), data.getInt("data_calling_uid"), data.getBundle("data_root_hints"), new C0185e(message.replyTo));
                    return;
                case 2:
                    this.f503b.m13278a(new C0185e(message.replyTo));
                    return;
                case 3:
                    this.f503b.m13276a(data.getString("data_media_item_id"), data.getBundle("data_options"), new C0185e(message.replyTo));
                    return;
                case 4:
                    this.f503b.m13273b(data.getString("data_media_item_id"), data.getBundle("data_options"), new C0185e(message.replyTo));
                    return;
                case 5:
                    this.f503b.m13275a(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"));
                    return;
                case 6:
                    this.f503b.m13274b(new C0185e(message.replyTo));
                    return;
                case 7:
                    this.f503b.m13272c(new C0185e(message.replyTo));
                    return;
                default:
                    Log.w("MediaBrowserServiceCompat", "Unhandled message: " + message + "\n  Service version: 1\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }

        /* renamed from: a */
        public void m13279a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b */
    /* loaded from: classes.dex */
    public class C0182b {

        /* renamed from: a */
        String f490a;

        /* renamed from: b */
        Bundle f491b;

        /* renamed from: c */
        InterfaceC0184d f492c;

        /* renamed from: d */
        C0181a f493d;

        /* renamed from: e */
        HashMap<String, List<Bundle>> f494e;

        private C0182b() {
            this.f494e = new HashMap<>();
        }

        /* synthetic */ C0182b(MediaBrowserServiceCompat mediaBrowserServiceCompat, RunnableC01781 runnableC01781) {
            this();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$c */
    /* loaded from: classes.dex */
    public static class C0183c<T> {

        /* renamed from: a */
        private Object f496a;

        /* renamed from: b */
        private boolean f497b;

        /* renamed from: c */
        private boolean f498c;

        /* renamed from: d */
        private int f499d;

        C0183c(Object obj) {
            this.f496a = obj;
        }

        /* renamed from: a */
        public void m13286a(T t) {
            if (this.f498c) {
                throw new IllegalStateException("sendResult() called twice for: " + this.f496a);
            }
            this.f498c = true;
            mo13285a(t, this.f499d);
        }

        /* renamed from: a */
        boolean m13288a() {
            return this.f497b || this.f498c;
        }

        /* renamed from: a */
        void m13287a(int i) {
            this.f499d = i;
        }

        /* renamed from: a */
        void mo13285a(T t, int i) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$g */
    /* loaded from: classes.dex */
    private class C0187g {
        private C0187g() {
        }

        /* synthetic */ C0187g(MediaBrowserServiceCompat mediaBrowserServiceCompat, RunnableC01781 runnableC01781) {
            this();
        }

        /* renamed from: a */
        public void m13277a(final String str, final int i, final Bundle bundle, final InterfaceC0184d interfaceC0184d) {
            if (MediaBrowserServiceCompat.this.m13303a(str, i)) {
                MediaBrowserServiceCompat.this.f479c.m13279a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IBinder mo13284a = interfaceC0184d.mo13284a();
                        MediaBrowserServiceCompat.this.f478b.remove(mo13284a);
                        C0182b c0182b = new C0182b(MediaBrowserServiceCompat.this, null);
                        c0182b.f490a = str;
                        c0182b.f491b = bundle;
                        c0182b.f492c = interfaceC0184d;
                        c0182b.f493d = MediaBrowserServiceCompat.this.m13302a(str, i, bundle);
                        if (c0182b.f493d != null) {
                            try {
                                MediaBrowserServiceCompat.this.f478b.put(mo13284a, c0182b);
                                if (MediaBrowserServiceCompat.this.f477a != null) {
                                    interfaceC0184d.mo13282a(c0182b.f493d.m13290a(), MediaBrowserServiceCompat.this.f477a, c0182b.f493d.m13289b());
                                    return;
                                }
                                return;
                            } catch (RemoteException e) {
                                Log.w("MediaBrowserServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
                                MediaBrowserServiceCompat.this.f478b.remove(mo13284a);
                                return;
                            }
                        }
                        Log.i("MediaBrowserServiceCompat", "No root for client " + str + " from service " + getClass().getName());
                        try {
                            interfaceC0184d.mo13280b();
                        } catch (RemoteException e2) {
                            Log.w("MediaBrowserServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i + " package=" + str);
        }

        /* renamed from: a */
        public void m13278a(final InterfaceC0184d interfaceC0184d) {
            MediaBrowserServiceCompat.this.f479c.m13279a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((C0182b) MediaBrowserServiceCompat.this.f478b.remove(interfaceC0184d.mo13284a())) != null) {
                    }
                }
            });
        }

        /* renamed from: a */
        public void m13276a(final String str, final Bundle bundle, final InterfaceC0184d interfaceC0184d) {
            MediaBrowserServiceCompat.this.f479c.m13279a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.3
                @Override // java.lang.Runnable
                public void run() {
                    C0182b c0182b = (C0182b) MediaBrowserServiceCompat.this.f478b.get(interfaceC0184d.mo13284a());
                    if (c0182b != null) {
                        MediaBrowserServiceCompat.this.m13301a(str, c0182b, bundle);
                    } else {
                        Log.w("MediaBrowserServiceCompat", "addSubscription for callback that isn't registered id=" + str);
                    }
                }
            });
        }

        /* renamed from: b */
        public void m13273b(final String str, final Bundle bundle, final InterfaceC0184d interfaceC0184d) {
            MediaBrowserServiceCompat.this.f479c.m13279a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.4
                @Override // java.lang.Runnable
                public void run() {
                    C0182b c0182b = (C0182b) MediaBrowserServiceCompat.this.f478b.get(interfaceC0184d.mo13284a());
                    if (c0182b != null) {
                        if (!MediaBrowserServiceCompat.this.m13295b(str, c0182b, bundle)) {
                            Log.w("MediaBrowserServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                            return;
                        }
                        return;
                    }
                    Log.w("MediaBrowserServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                }
            });
        }

        /* renamed from: a */
        public void m13275a(final String str, final ResultReceiver resultReceiver) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f479c.m13279a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaBrowserServiceCompat.this.m13298a(str, resultReceiver);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m13274b(final InterfaceC0184d interfaceC0184d) {
            MediaBrowserServiceCompat.this.f479c.m13279a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.6
                @Override // java.lang.Runnable
                public void run() {
                    IBinder mo13284a = interfaceC0184d.mo13284a();
                    MediaBrowserServiceCompat.this.f478b.remove(mo13284a);
                    C0182b c0182b = new C0182b(MediaBrowserServiceCompat.this, null);
                    c0182b.f492c = interfaceC0184d;
                    MediaBrowserServiceCompat.this.f478b.put(mo13284a, c0182b);
                }
            });
        }

        /* renamed from: c */
        public void m13272c(final InterfaceC0184d interfaceC0184d) {
            MediaBrowserServiceCompat.this.f479c.m13279a(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.g.7
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserServiceCompat.this.f478b.remove(interfaceC0184d.mo13284a());
                }
            });
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$e */
    /* loaded from: classes.dex */
    private class C0185e implements InterfaceC0184d {

        /* renamed from: a */
        final Messenger f500a;

        C0185e(Messenger messenger) {
            this.f500a = messenger;
        }

        @Override // android.support.p002v4.media.MediaBrowserServiceCompat.InterfaceC0184d
        /* renamed from: a */
        public IBinder mo13284a() {
            return this.f500a.getBinder();
        }

        @Override // android.support.p002v4.media.MediaBrowserServiceCompat.InterfaceC0184d
        /* renamed from: a */
        public void mo13282a(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 1);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m13283a(1, bundle2);
        }

        @Override // android.support.p002v4.media.MediaBrowserServiceCompat.InterfaceC0184d
        /* renamed from: b */
        public void mo13280b() {
            m13283a(2, null);
        }

        @Override // android.support.p002v4.media.MediaBrowserServiceCompat.InterfaceC0184d
        /* renamed from: a */
        public void mo13281a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m13283a(3, bundle2);
        }

        /* renamed from: a */
        private void m13283a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            this.f500a.send(obtain);
        }
    }

    /* renamed from: a */
    public void m13299a(String str, C0183c<List<MediaBrowserCompat.MediaItem>> c0183c, Bundle bundle) {
        c0183c.m13287a(1);
        m13300a(str, c0183c);
    }

    /* renamed from: b */
    public void m13294b(String str, C0183c<MediaBrowserCompat.MediaItem> c0183c) {
        c0183c.m13286a((C0183c<MediaBrowserCompat.MediaItem>) null);
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$1 */
    /* loaded from: classes.dex */
    class RunnableC01781 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MediaSessionCompat.Token f480a;

        /* renamed from: b */
        final /* synthetic */ MediaBrowserServiceCompat f481b;

        @Override // java.lang.Runnable
        public void run() {
            for (IBinder iBinder : this.f481b.f478b.keySet()) {
                C0182b c0182b = (C0182b) this.f481b.f478b.get(iBinder);
                try {
                    c0182b.f492c.mo13282a(c0182b.f493d.m13290a(), this.f480a, c0182b.f493d.m13289b());
                } catch (RemoteException e) {
                    Log.w("MediaBrowserServiceCompat", "Connection for " + c0182b.f490a + " is no longer valid.");
                    this.f481b.f478b.remove(iBinder);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m13303a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13301a(String str, C0182b c0182b, Bundle bundle) {
        List<Bundle> list = c0182b.f494e.get(str);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        for (Bundle bundle2 : arrayList) {
            if (C0201a.m13254a(bundle, bundle2)) {
                return;
            }
        }
        arrayList.add(bundle);
        c0182b.f494e.put(str, arrayList);
        m13293c(str, c0182b, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m13295b(String str, C0182b c0182b, Bundle bundle) {
        boolean z;
        List<Bundle> list = c0182b.f494e.get(str);
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
            if (C0201a.m13254a(bundle, next)) {
                list.remove(next);
                z = true;
                break;
            }
        }
        if (list.size() == 0) {
            c0182b.f494e.remove(str);
            return z;
        }
        return z;
    }

    /* renamed from: c */
    private void m13293c(final String str, final C0182b c0182b, final Bundle bundle) {
        C0183c<List<MediaBrowserCompat.MediaItem>> c0183c = new C0183c<List<MediaBrowserCompat.MediaItem>>(str) { // from class: android.support.v4.media.MediaBrowserServiceCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // android.support.p002v4.media.MediaBrowserServiceCompat.C0183c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo13285a(List<MediaBrowserCompat.MediaItem> list, int i) {
                if (MediaBrowserServiceCompat.this.f478b.get(c0182b.f492c.mo13284a()) == c0182b) {
                    if ((i & 1) != 0) {
                        list = C0201a.m13253a(list, bundle);
                    }
                    try {
                        c0182b.f492c.mo13281a(str, list, bundle);
                    } catch (RemoteException e) {
                        Log.w("MediaBrowserServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + c0182b.f490a);
                    }
                }
            }
        };
        if (bundle == null) {
            m13300a(str, c0183c);
        } else {
            m13299a(str, c0183c, bundle);
        }
        if (!c0183c.m13288a()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c0182b.f490a + " id=" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13298a(String str, final ResultReceiver resultReceiver) {
        C0183c<MediaBrowserCompat.MediaItem> c0183c = new C0183c<MediaBrowserCompat.MediaItem>(str) { // from class: android.support.v4.media.MediaBrowserServiceCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // android.support.p002v4.media.MediaBrowserServiceCompat.C0183c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo13285a(MediaBrowserCompat.MediaItem mediaItem, int i) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.m13218b(0, bundle);
            }
        };
        m13294b(str, c0183c);
        if (!c0183c.m13288a()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$a */
    /* loaded from: classes.dex */
    public static final class C0181a {

        /* renamed from: a */
        private final String f488a;

        /* renamed from: b */
        private final Bundle f489b;

        /* renamed from: a */
        public String m13290a() {
            return this.f488a;
        }

        /* renamed from: b */
        public Bundle m13289b() {
            return this.f489b;
        }
    }
}
