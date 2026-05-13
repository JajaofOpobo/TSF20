package android.support.p002v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v4.content.C0144a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: android.support.v4.app.ac */
/* loaded from: classes.dex */
public final class C0067ac implements Iterable<Intent> {

    /* renamed from: a */
    private static final InterfaceC0069b f218a;

    /* renamed from: b */
    private final ArrayList<Intent> f219b = new ArrayList<>();

    /* renamed from: c */
    private final Context f220c;

    /* renamed from: android.support.v4.app.ac$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0068a {
        /* renamed from: a */
        Intent mo12115a();
    }

    /* renamed from: android.support.v4.app.ac$b */
    /* loaded from: classes.dex */
    interface InterfaceC0069b {
    }

    /* renamed from: android.support.v4.app.ac$c */
    /* loaded from: classes.dex */
    static class C0070c implements InterfaceC0069b {
        C0070c() {
        }
    }

    /* renamed from: android.support.v4.app.ac$d */
    /* loaded from: classes.dex */
    static class C0071d implements InterfaceC0069b {
        C0071d() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f218a = new C0071d();
        } else {
            f218a = new C0070c();
        }
    }

    private C0067ac(Context context) {
        this.f220c = context;
    }

    /* renamed from: a */
    public static C0067ac m13690a(Context context) {
        return new C0067ac(context);
    }

    /* renamed from: a */
    public C0067ac m13689a(Intent intent) {
        this.f219b.add(intent);
        return this;
    }

    /* renamed from: a */
    public C0067ac m13692a(Activity activity) {
        Intent intent = null;
        if (activity instanceof InterfaceC0068a) {
            intent = ((InterfaceC0068a) activity).mo12115a();
        }
        Intent m13439a = intent == null ? C0121x.m13439a(activity) : intent;
        if (m13439a != null) {
            ComponentName component = m13439a.getComponent();
            if (component == null) {
                component = m13439a.resolveActivity(this.f220c.getPackageManager());
            }
            m13691a(component);
            m13689a(m13439a);
        }
        return this;
    }

    /* renamed from: a */
    public C0067ac m13691a(ComponentName componentName) {
        int size = this.f219b.size();
        try {
            Intent m13437a = C0121x.m13437a(this.f220c, componentName);
            while (m13437a != null) {
                this.f219b.add(size, m13437a);
                m13437a = C0121x.m13437a(this.f220c, m13437a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Intent> iterator() {
        return this.f219b.iterator();
    }

    /* renamed from: a */
    public void m13693a() {
        m13688a((Bundle) null);
    }

    /* renamed from: a */
    public void m13688a(Bundle bundle) {
        if (this.f219b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f219b.toArray(new Intent[this.f219b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!C0144a.m13402a(this.f220c, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f220c.startActivity(intent);
        }
    }
}
