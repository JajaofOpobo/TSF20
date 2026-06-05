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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class ac implements Iterable<Intent> {
    private static final b a;
    private final ArrayList<Intent> b = new ArrayList<>();
    private final Context c;

    public interface a {
        Intent a();
    }

    interface b {
    }

    static class c implements b {
        c() {
        }
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    public ac a(Activity activity) {
        Intent intentA = null;
        if (activity instanceof a) {
            intentA = ((a) activity).a();
        }
        Intent intentA2 = intentA == null ? x.a(activity) : intentA;
        if (intentA2 != null) {
            ComponentName component = intentA2.getComponent();
            if (component == null) {
                component = intentA2.resolveActivity(this.c.getPackageManager());
            }
            a(component);
            a(intentA2);
        }
        return this;
    }

    public ac a(ComponentName componentName) {
        int size = this.b.size();
        try {
            Intent intentA = x.a(this.c, componentName);
            while (intentA != null) {
                this.b.add(size, intentA);
                intentA = x.a(this.c, intentA.getComponent());
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
