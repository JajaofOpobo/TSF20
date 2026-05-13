package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class ac implements Iterable<Intent> {
    private static final b a;
    private final ArrayList<Intent> b = new ArrayList<>();
    private final Context c;

    /* loaded from: classes.dex */
    public interface a {
        Intent a();
    }

    /* loaded from: classes.dex */
    interface b {
    }

    /* loaded from: classes.dex */
    static class c implements b {
        c() {
        }
    }

    /* loaded from: classes.dex */
    static class d implements b {
        d() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new d();
        } else {
            a = new c();
        }
    }

    private ac(Context context) {
        this.c = context;
    }

    public static ac a(Context context) {
        return new ac(context);
    }

    public ac a(Intent intent) {
        this.b.add(intent);
        return this;
    }

    public ac a(Activity activity) {
        Intent intent = null;
        if (activity instanceof a) {
            intent = ((a) activity).a();
        }
        Intent a2 = intent == null ? x.a(activity) : intent;
        if (a2 != null) {
            ComponentName component = a2.getComponent();
            if (component == null) {
                component = a2.resolveActivity(this.c.getPackageManager());
            }
            a(component);
            a(a2);
        }
        return this;
    }

    public ac a(ComponentName componentName) {
        int size = this.b.size();
        try {
            Intent a2 = x.a(this.c, componentName);
            while (a2 != null) {
                this.b.add(size, a2);
                a2 = x.a(this.c, a2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Intent> iterator() {
        return this.b.iterator();
    }

    public void a() {
        a((Bundle) null);
    }

    public void a(Bundle bundle) {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.b.toArray(new Intent[this.b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!android.support.v4.content.a.a(this.c, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.c.startActivity(intent);
        }
    }
}
