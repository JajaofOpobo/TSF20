package android.support.p013v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.p002v4.p010os.C0219a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.d */
/* loaded from: classes.dex */
public class C0733d extends DataSetObservable {

    /* renamed from: a */
    private static final String f2100a = C0733d.class.getSimpleName();

    /* renamed from: b */
    private static final Object f2101b = new Object();

    /* renamed from: c */
    private static final Map<String, C0733d> f2102c = new HashMap();

    /* renamed from: d */
    private final Object f2103d;

    /* renamed from: e */
    private final List<C0735a> f2104e;

    /* renamed from: f */
    private final List<C0737c> f2105f;

    /* renamed from: g */
    private final Context f2106g;

    /* renamed from: h */
    private final String f2107h;

    /* renamed from: i */
    private Intent f2108i;

    /* renamed from: j */
    private InterfaceC0736b f2109j;

    /* renamed from: k */
    private int f2110k;

    /* renamed from: l */
    private boolean f2111l;

    /* renamed from: m */
    private boolean f2112m;

    /* renamed from: n */
    private boolean f2113n;

    /* renamed from: o */
    private boolean f2114o;

    /* renamed from: p */
    private InterfaceC0738d f2115p;

    /* renamed from: android.support.v7.widget.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0736b {
        /* renamed from: a */
        void m11236a(Intent intent, List<C0735a> list, List<C0737c> list2);
    }

    /* renamed from: android.support.v7.widget.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0738d {
        /* renamed from: a */
        boolean m11235a(C0733d c0733d, Intent intent);
    }

    /* renamed from: a */
    public int m11256a() {
        int size;
        synchronized (this.f2103d) {
            m11243f();
            size = this.f2104e.size();
        }
        return size;
    }

    /* renamed from: a */
    public ResolveInfo m11255a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f2103d) {
            m11243f();
            resolveInfo = this.f2104e.get(i).f2116a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public int m11254a(ResolveInfo resolveInfo) {
        synchronized (this.f2103d) {
            m11243f();
            List<C0735a> list = this.f2104e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f2116a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public Intent m11249b(int i) {
        synchronized (this.f2103d) {
            if (this.f2108i == null) {
                return null;
            }
            m11243f();
            C0735a c0735a = this.f2104e.get(i);
            ComponentName componentName = new ComponentName(c0735a.f2116a.activityInfo.packageName, c0735a.f2116a.activityInfo.name);
            Intent intent = new Intent(this.f2108i);
            intent.setComponent(componentName);
            if (this.f2115p != null) {
                if (this.f2115p.m11235a(this, new Intent(intent))) {
                    return null;
                }
            }
            m11253a(new C0737c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo m11250b() {
        synchronized (this.f2103d) {
            m11243f();
            if (!this.f2104e.isEmpty()) {
                return this.f2104e.get(0).f2116a;
            }
            return null;
        }
    }

    /* renamed from: c */
    public void m11246c(int i) {
        float f;
        synchronized (this.f2103d) {
            m11243f();
            C0735a c0735a = this.f2104e.get(i);
            C0735a c0735a2 = this.f2104e.get(0);
            if (c0735a2 != null) {
                f = (c0735a2.f2117b - c0735a.f2117b) + 5.0f;
            } else {
                f = 1.0f;
            }
            m11253a(new C0737c(new ComponentName(c0735a.f2116a.activityInfo.packageName, c0735a.f2116a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    /* renamed from: e */
    private void m11244e() {
        if (!this.f2112m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f2113n) {
            this.f2113n = false;
            if (!TextUtils.isEmpty(this.f2107h)) {
                C0219a.m13215a(new AsyncTaskC0739e(), new ArrayList(this.f2105f), this.f2107h);
            }
        }
    }

    /* renamed from: c */
    public int m11247c() {
        int size;
        synchronized (this.f2103d) {
            m11243f();
            size = this.f2105f.size();
        }
        return size;
    }

    /* renamed from: f */
    private void m11243f() {
        boolean m11241h = m11241h() | m11240i();
        m11239j();
        if (m11241h) {
            m11242g();
            notifyChanged();
        }
    }

    /* renamed from: g */
    private boolean m11242g() {
        if (this.f2109j == null || this.f2108i == null || this.f2104e.isEmpty() || this.f2105f.isEmpty()) {
            return false;
        }
        this.f2109j.m11236a(this.f2108i, this.f2104e, Collections.unmodifiableList(this.f2105f));
        return true;
    }

    /* renamed from: h */
    private boolean m11241h() {
        if (!this.f2114o || this.f2108i == null) {
            return false;
        }
        this.f2114o = false;
        this.f2104e.clear();
        List<ResolveInfo> queryIntentActivities = this.f2106g.getPackageManager().queryIntentActivities(this.f2108i, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f2104e.add(new C0735a(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: i */
    private boolean m11240i() {
        if (this.f2111l && this.f2113n && !TextUtils.isEmpty(this.f2107h)) {
            this.f2111l = false;
            this.f2112m = true;
            m11238k();
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m11253a(C0737c c0737c) {
        boolean add = this.f2105f.add(c0737c);
        if (add) {
            this.f2113n = true;
            m11239j();
            m11244e();
            m11242g();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: j */
    private void m11239j() {
        int size = this.f2105f.size() - this.f2110k;
        if (size > 0) {
            this.f2113n = true;
            for (int i = 0; i < size; i++) {
                this.f2105f.remove(0);
            }
        }
    }

    /* renamed from: android.support.v7.widget.d$c */
    /* loaded from: classes.dex */
    public static final class C0737c {

        /* renamed from: a */
        public final ComponentName f2119a;

        /* renamed from: b */
        public final long f2120b;

        /* renamed from: c */
        public final float f2121c;

        public C0737c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C0737c(ComponentName componentName, long j, float f) {
            this.f2119a = componentName;
            this.f2120b = j;
            this.f2121c = f;
        }

        public int hashCode() {
            return (((((this.f2119a == null ? 0 : this.f2119a.hashCode()) + 31) * 31) + ((int) (this.f2120b ^ (this.f2120b >>> 32)))) * 31) + Float.floatToIntBits(this.f2121c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C0737c c0737c = (C0737c) obj;
                if (this.f2119a == null) {
                    if (c0737c.f2119a != null) {
                        return false;
                    }
                } else if (!this.f2119a.equals(c0737c.f2119a)) {
                    return false;
                }
                return this.f2120b == c0737c.f2120b && Float.floatToIntBits(this.f2121c) == Float.floatToIntBits(c0737c.f2121c);
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:").append(this.f2119a);
            sb.append("; time:").append(this.f2120b);
            sb.append("; weight:").append(new BigDecimal(this.f2121c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.d$a */
    /* loaded from: classes.dex */
    public final class C0735a implements Comparable<C0735a> {

        /* renamed from: a */
        public final ResolveInfo f2116a;

        /* renamed from: b */
        public float f2117b;

        public C0735a(ResolveInfo resolveInfo) {
            this.f2116a = resolveInfo;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f2117b) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f2117b) == Float.floatToIntBits(((C0735a) obj).f2117b);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C0735a c0735a) {
            return Float.floatToIntBits(c0735a.f2117b) - Float.floatToIntBits(this.f2117b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:").append(this.f2116a.toString());
            sb.append("; weight:").append(new BigDecimal(this.f2117b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: k */
    private void m11238k() {
        FileInputStream fileInputStream;
        try {
            try {
                FileInputStream openFileInput = this.f2106g.openFileInput(this.f2107h);
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                        }
                        if (!"historical-records".equals(newPullParser.getName())) {
                            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        List<C0737c> list = this.f2105f;
                        list.clear();
                        while (true) {
                            int next = newPullParser.next();
                            if (next == 1) {
                                if (openFileInput != null) {
                                    try {
                                        openFileInput.close();
                                        return;
                                    } catch (IOException e) {
                                        return;
                                    }
                                }
                                return;
                            } else if (next != 3 && next != 4) {
                                if (!"historical-record".equals(newPullParser.getName())) {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new C0737c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            }
                        }
                    } catch (XmlPullParserException e2) {
                        Log.e(f2100a, "Error reading historical recrod file: " + this.f2107h, e2);
                        if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException e3) {
                            }
                        }
                    }
                } catch (IOException e4) {
                    Log.e(f2100a, "Error reading historical recrod file: " + this.f2107h, e4);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e5) {
                        }
                    }
                }
            } catch (FileNotFoundException e6) {
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e7) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.d$e */
    /* loaded from: classes.dex */
    public final class AsyncTaskC0739e extends AsyncTask<Object, Void, Void> {
        private AsyncTaskC0739e() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream openFileOutput = C0733d.this.f2106g.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", true);
                        newSerializer.startTag(null, "historical-records");
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            C0737c c0737c = (C0737c) list.remove(0);
                            newSerializer.startTag(null, "historical-record");
                            newSerializer.attribute(null, "activity", c0737c.f2119a.flattenToString());
                            newSerializer.attribute(null, "time", String.valueOf(c0737c.f2120b));
                            newSerializer.attribute(null, "weight", String.valueOf(c0737c.f2121c));
                            newSerializer.endTag(null, "historical-record");
                        }
                        newSerializer.endTag(null, "historical-records");
                        newSerializer.endDocument();
                        C0733d.this.f2111l = true;
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException e) {
                            }
                        }
                    } catch (Throwable th) {
                        C0733d.this.f2111l = true;
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException e2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    Log.e(C0733d.f2100a, "Error writing historical recrod file: " + C0733d.this.f2107h, e3);
                    C0733d.this.f2111l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (IllegalArgumentException e5) {
                    Log.e(C0733d.f2100a, "Error writing historical recrod file: " + C0733d.this.f2107h, e5);
                    C0733d.this.f2111l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e6) {
                        }
                    }
                } catch (IllegalStateException e7) {
                    Log.e(C0733d.f2100a, "Error writing historical recrod file: " + C0733d.this.f2107h, e7);
                    C0733d.this.f2111l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e8) {
                        }
                    }
                }
            } catch (FileNotFoundException e9) {
                Log.e(C0733d.f2100a, "Error writing historical recrod file: " + str, e9);
            }
            return null;
        }
    }
}
