package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class d extends DataSetObservable {
    private static final String a = d.class.getSimpleName();
    private static final Object b = new Object();
    private static final Map<String, d> c = new HashMap();
    private final Object d;
    private final List<a> e;
    private final List<c> f;
    private final Context g;
    private final String h;
    private Intent i;
    private b j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private InterfaceC0017d p;

    public interface b {
        void a(Intent intent, List<a> list, List<c> list2);
    }

    /* JADX INFO: renamed from: android.support.v7.widget.d$d, reason: collision with other inner class name */
    public interface InterfaceC0017d {
        boolean a(d dVar, Intent intent);
    }

    public int a() {
        int size;
        synchronized (this.d) {
            f();
            size = this.e.size();
        }
        return size;
    }

    public ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.d) {
            f();
            resolveInfo = this.e.get(i).a;
        }
        return resolveInfo;
    }

    public int a(ResolveInfo resolveInfo) {
        synchronized (this.d) {
            f();
            List<a> list = this.e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public Intent b(int i) {
        synchronized (this.d) {
            if (this.i == null) {
                return null;
            }
            f();
            a aVar = this.e.get(i);
            ComponentName componentName = new ComponentName(aVar.a.activityInfo.packageName, aVar.a.activityInfo.name);
            Intent intent = new Intent(this.i);
            intent.setComponent(componentName);
            if (this.p != null) {
                if (this.p.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo b() {
        synchronized (this.d) {
            f();
            if (!this.e.isEmpty()) {
                return this.e.get(0).a;
            }
            return null;
        }
    }

    public void c(int i) {
        float f;
        synchronized (this.d) {
            f();
            a aVar = this.e.get(i);
            a aVar2 = this.e.get(0);
            if (aVar2 != null) {
                f = (aVar2.b - aVar.b) + 5.0f;
            } else {
                f = 1.0f;
            }
            a(new c(new ComponentName(aVar.a.activityInfo.packageName, aVar.a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    private void e() {
        if (!this.m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.n) {
            this.n = false;
            if (!TextUtils.isEmpty(this.h)) {
                android.support.v4.os.a.a(new e(), new ArrayList(this.f), this.h);
            }
        }
    }

    public int c() {
        int size;
        synchronized (this.d) {
            f();
            size = this.f.size();
        }
        return size;
    }

    private void f() {
        boolean zH = h() | i();
        j();
        if (zH) {
            g();
            notifyChanged();
        }
    }

    private boolean g() {
        if (this.j == null || this.i == null || this.e.isEmpty() || this.f.isEmpty()) {
            return false;
        }
        this.j.a(this.i, this.e, Collections.unmodifiableList(this.f));
        return true;
    }

    private boolean h() {
        if (!this.o || this.i == null) {
            return false;
        }
        this.o = false;
        this.e.clear();
        List<ResolveInfo> listQueryIntentActivities = this.g.getPackageManager().queryIntentActivities(this.i, 0);
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a(listQueryIntentActivities.get(i)));
        }
        return true;
    }

    private boolean i() {
        if (!this.l || !this.n || TextUtils.isEmpty(this.h)) {
            return false;
        }
        this.l = false;
        this.m = true;
        k();
        return true;
    }

    private boolean a(c cVar) {
        boolean zAdd = this.f.add(cVar);
        if (zAdd) {
            this.n = true;
            j();
            e();
            g();
            notifyChanged();
        }
        return zAdd;
    }

    private void j() {
        int size = this.f.size() - this.k;
        if (size > 0) {
            this.n = true;
            for (int i = 0; i < size; i++) {
                this.f.remove(0);
            }
        }
    }

    public static final class c {
        public final ComponentName a;
        public final long b;
        public final float c;

        public c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public c(ComponentName componentName, long j, float f) {
            this.a = componentName;
            this.b = j;
            this.c = f;
        }

        public int hashCode() {
            return (((((this.a == null ? 0 : this.a.hashCode()) + 31) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + Float.floatToIntBits(this.c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                if (this.a == null) {
                    if (cVar.a != null) {
                        return false;
                    }
                } else if (!this.a.equals(cVar.a)) {
                    return false;
                }
                return this.b == cVar.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(cVar.c);
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:").append(this.a);
            sb.append("; time:").append(this.b);
            sb.append("; weight:").append(new BigDecimal(this.c));
            sb.append("]");
            return sb.toString();
        }
    }

    public final class a implements Comparable<a> {
        public final ResolveInfo a;
        public float b;

        public a(ResolveInfo resolveInfo) {
            this.a = resolveInfo;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.b) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((a) obj).b);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.b) - Float.floatToIntBits(this.b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:").append(this.a.toString());
            sb.append("; weight:").append(new BigDecimal(this.b));
            sb.append("]");
            return sb.toString();
        }
    }

    private void k() {
        FileInputStream fileInputStreamOpenFileInput;
        try {
            try {
                fileInputStreamOpenFileInput = this.g.openFileInput(this.h);
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                        }
                        if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        List<c> list = this.f;
                        list.clear();
                        while (true) {
                            int next2 = xmlPullParserNewPullParser.next();
                            if (next2 == 1) {
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                        return;
                                    } catch (IOException e2) {
                                        return;
                                    }
                                }
                                return;
                            }
                            if (next2 != 3 && next2 != 4) {
                                if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new c(xmlPullParserNewPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                            }
                        }
                    } catch (XmlPullParserException e3) {
                        Log.e(a, "Error reading historical recrod file: " + this.h, e3);
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException e4) {
                            }
                        }
                    }
                } catch (IOException e5) {
                    Log.e(a, "Error reading historical recrod file: " + this.h, e5);
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException e6) {
                        }
                    }
                }
            } catch (FileNotFoundException e7) {
            }
        } catch (Throwable th) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException e8) {
                }
            }
            throw th;
        }
    }

    private final class e extends AsyncTask<Object, Void, Void> {
        private e() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = d.this.g.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", true);
                        xmlSerializerNewSerializer.startTag(null, "historical-records");
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            c cVar = (c) list.remove(0);
                            xmlSerializerNewSerializer.startTag(null, "historical-record");
                            xmlSerializerNewSerializer.attribute(null, "activity", cVar.a.flattenToString());
                            xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(cVar.b));
                            xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(cVar.c));
                            xmlSerializerNewSerializer.endTag(null, "historical-record");
                        }
                        xmlSerializerNewSerializer.endTag(null, "historical-records");
                        xmlSerializerNewSerializer.endDocument();
                        d.this.l = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException e) {
                            }
                        }
                    } catch (Throwable th) {
                        d.this.l = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException e2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    Log.e(d.a, "Error writing historical recrod file: " + d.this.h, e3);
                    d.this.l = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (IllegalArgumentException e5) {
                    Log.e(d.a, "Error writing historical recrod file: " + d.this.h, e5);
                    d.this.l = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e6) {
                        }
                    }
                } catch (IllegalStateException e7) {
                    Log.e(d.a, "Error writing historical recrod file: " + d.this.h, e7);
                    d.this.l = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e8) {
                        }
                    }
                }
            } catch (FileNotFoundException e9) {
                Log.e(d.a, "Error writing historical recrod file: " + str, e9);
            }
            return null;
        }
    }
}
