package android.support.p002v4.p009d;

import android.util.Log;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.Writer;
/* renamed from: android.support.v4.d.d */
/* loaded from: classes.dex */
public class C0164d extends Writer {

    /* renamed from: a */
    private final String f431a;

    /* renamed from: b */
    private StringBuilder f432b = new StringBuilder((int) ItemInfo.APP_INTENT);

    public C0164d(String str) {
        this.f431a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m13370a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m13370a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m13370a();
            } else {
                this.f432b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m13370a() {
        if (this.f432b.length() > 0) {
            Log.d(this.f431a, this.f432b.toString());
            this.f432b.delete(0, this.f432b.length());
        }
    }
}
