package android.support.v4.d;

import java.util.LinkedHashMap;
import java.util.Map;

public class f<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;

    public f(int i) {
        if (i <= 0) throw new IllegalArgumentException("maxSize <= 0");
        this.c = i;
        this.a = new LinkedHashMap<K, V>(0, 0.75f, true);
    }

    public final V a(K k) {
        if (k == null) throw new NullPointerException("key == null");
        synchronized (this) {
            V v = this.a.get(k);
            if (v != null) {
                this.d++;
                return v;
            }
            this.e++;
        }
        return b(k);
    }

    protected V b(K k) {
        return null;
    }

    public final V a(K k, V v) {
        if (k == null || v == null) throw new NullPointerException("key == null || value == null");
        synchronized (this) {
            this.b++;
            V put = this.a.put(k, v);
            if (put != null) {
                this.b--;
            }
        }
        if (this.c > 0) {
            synchronized (this) {
                Map.Entry<K, V> entry;
                while (this.b > this.c && (entry = this.a.entrySet().iterator().next()) != null) {
                    this.a.remove(entry.getKey());
                    this.b -= b(entry.getKey(), entry.getValue());
                }
            }
        }
        return put;
    }

    protected int b(K k, V v) {
        return 1;
    }
}
