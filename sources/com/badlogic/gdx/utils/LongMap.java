package com.badlogic.gdx.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class LongMap<V> {
    private static final int EMPTY = 0;
    private static final int PRIME1 = -1105259343;
    private static final int PRIME2 = -1262997959;
    private static final int PRIME3 = -825114047;
    int capacity;
    private Entries entries;
    boolean hasZeroValue;
    private int hashShift;
    long[] keyTable;
    private Keys keys;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    V[] valueTable;
    private Values values;
    V zeroValue;

    public LongMap() {
        this(32, 0.8f);
    }

    public LongMap(int i) {
        this(i, 0.8f);
    }

    public LongMap(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        if (this.capacity > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + i);
        }
        this.capacity = MathUtils.nextPowerOfTwo(i);
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.loadFactor = f;
        this.threshold = (int) (this.capacity * f);
        this.mask = this.capacity - 1;
        this.hashShift = 31 - Integer.numberOfTrailingZeros(this.capacity);
        this.stashCapacity = Math.max(3, ((int) Math.ceil(Math.log(this.capacity))) + 1);
        this.pushIterations = Math.max(Math.min(this.capacity, 32), ((int) Math.sqrt(this.capacity)) / 4);
        this.keyTable = new long[this.capacity + this.stashCapacity];
        this.valueTable = (V[]) new Object[this.keyTable.length];
    }

    public V put(long j, V v) {
        if (j == 0) {
            V v2 = this.zeroValue;
            this.zeroValue = v;
            this.hasZeroValue = true;
            this.size++;
            return v2;
        }
        int i = (int) (this.mask & j);
        long j2 = this.keyTable[i];
        if (j2 == j) {
            V v3 = this.valueTable[i];
            this.valueTable[i] = v;
            return v3;
        }
        int hash2 = hash2(j);
        long j3 = this.keyTable[hash2];
        if (j3 == j) {
            V v4 = this.valueTable[hash2];
            this.valueTable[hash2] = v;
            return v4;
        }
        int hash3 = hash3(j);
        long j4 = this.keyTable[hash3];
        if (j4 == j) {
            V v5 = this.valueTable[hash3];
            this.valueTable[hash3] = v;
            return v5;
        } else if (j2 == 0) {
            this.keyTable[i] = j;
            this.valueTable[i] = v;
            int i2 = this.size;
            this.size = i2 + 1;
            if (i2 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        } else if (j3 == 0) {
            this.keyTable[hash2] = j;
            this.valueTable[hash2] = v;
            int i3 = this.size;
            this.size = i3 + 1;
            if (i3 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        } else if (j4 == 0) {
            this.keyTable[hash3] = j;
            this.valueTable[hash3] = v;
            int i4 = this.size;
            this.size = i4 + 1;
            if (i4 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        } else {
            push(j, v, i, j2, hash2, j3, hash3, j4);
            return null;
        }
    }

    public void putAll(LongMap<V> longMap) {
        Iterator<Entry<V>> it = longMap.entries().iterator();
        while (it.hasNext()) {
            Entry<V> next = it.next();
            put(next.key, next.value);
        }
    }

    private void putResize(long j, V v) {
        if (j == 0) {
            this.zeroValue = v;
            this.hasZeroValue = true;
            return;
        }
        int i = (int) (this.mask & j);
        long j2 = this.keyTable[i];
        if (j2 == 0) {
            this.keyTable[i] = j;
            this.valueTable[i] = v;
            int i2 = this.size;
            this.size = i2 + 1;
            if (i2 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int hash2 = hash2(j);
        long j3 = this.keyTable[hash2];
        if (j3 == 0) {
            this.keyTable[hash2] = j;
            this.valueTable[hash2] = v;
            int i3 = this.size;
            this.size = i3 + 1;
            if (i3 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int hash3 = hash3(j);
        long j4 = this.keyTable[hash3];
        if (j4 == 0) {
            this.keyTable[hash3] = j;
            this.valueTable[hash3] = v;
            int i4 = this.size;
            this.size = i4 + 1;
            if (i4 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        push(j, v, i, j2, hash2, j3, hash3, j4);
    }

    private void push(long j, V v, int i, long j2, int i2, long j3, int i3, long j4) {
        long[] jArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i4 = this.mask;
        int i5 = 0;
        int i6 = this.pushIterations;
        do {
            switch (MathUtils.random(0, 2)) {
                case 0:
                    V v2 = vArr[i];
                    jArr[i] = j;
                    vArr[i] = v;
                    v = v2;
                    j = j2;
                    break;
                case 1:
                    V v3 = vArr[i2];
                    jArr[i2] = j;
                    vArr[i2] = v;
                    v = v3;
                    j = j3;
                    break;
                default:
                    V v4 = vArr[i3];
                    jArr[i3] = j;
                    vArr[i3] = v;
                    v = v4;
                    j = j4;
                    break;
            }
            i = (int) (i4 & j);
            j2 = jArr[i];
            if (j2 == 0) {
                jArr[i] = j;
                vArr[i] = v;
                int i7 = this.size;
                this.size = i7 + 1;
                if (i7 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i2 = hash2(j);
            j3 = jArr[i2];
            if (j3 == 0) {
                jArr[i2] = j;
                vArr[i2] = v;
                int i8 = this.size;
                this.size = i8 + 1;
                if (i8 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i3 = hash3(j);
            j4 = jArr[i3];
            if (j4 == 0) {
                jArr[i3] = j;
                vArr[i3] = v;
                int i9 = this.size;
                this.size = i9 + 1;
                if (i9 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i5++;
        } while (i5 != i6);
        putStash(j, v);
    }

    private void putStash(long j, V v) {
        if (this.stashSize == this.stashCapacity) {
            resize(this.capacity << 1);
            put(j, v);
            return;
        }
        long[] jArr = this.keyTable;
        int i = this.capacity;
        int i2 = this.stashSize + i;
        while (i < i2) {
            if (jArr[i] != j) {
                i++;
            } else {
                this.valueTable[i] = v;
                return;
            }
        }
        int i3 = this.capacity + this.stashSize;
        jArr[i3] = j;
        this.valueTable[i3] = v;
        this.stashSize++;
    }

    public V get(long j) {
        if (j == 0) {
            return this.zeroValue;
        }
        int i = (int) (this.mask & j);
        if (this.keyTable[i] != j) {
            i = hash2(j);
            if (this.keyTable[i] != j) {
                i = hash3(j);
                if (this.keyTable[i] != j) {
                    return getStash(j);
                }
            }
        }
        return this.valueTable[i];
    }

    private V getStash(long j) {
        long[] jArr = this.keyTable;
        int i = this.capacity;
        int i2 = this.stashSize + i;
        while (i < i2) {
            if (jArr[i] == j) {
                return this.valueTable[i];
            }
            i++;
        }
        return null;
    }

    public V remove(long j) {
        if (j == 0) {
            if (this.hasZeroValue) {
                V v = this.zeroValue;
                this.zeroValue = null;
                this.hasZeroValue = false;
                this.size--;
                return v;
            }
            return null;
        }
        int i = (int) (this.mask & j);
        if (this.keyTable[i] == j) {
            this.keyTable[i] = 0;
            V v2 = this.valueTable[i];
            this.valueTable[i] = null;
            this.size--;
            return v2;
        }
        int hash2 = hash2(j);
        if (this.keyTable[hash2] == j) {
            this.keyTable[hash2] = 0;
            V v3 = this.valueTable[hash2];
            this.valueTable[hash2] = null;
            this.size--;
            return v3;
        }
        int hash3 = hash3(j);
        if (this.keyTable[hash3] == j) {
            this.keyTable[hash3] = 0;
            V v4 = this.valueTable[hash3];
            this.valueTable[hash3] = null;
            this.size--;
            return v4;
        }
        return removeStash(j);
    }

    V removeStash(long j) {
        long[] jArr = this.keyTable;
        int i = this.capacity;
        int i2 = i + this.stashSize;
        for (int i3 = i; i3 < i2; i3++) {
            if (jArr[i3] == j) {
                V v = this.valueTable[i3];
                removeStashIndex(i3);
                this.size--;
                return v;
            }
        }
        return null;
    }

    void removeStashIndex(int i) {
        this.stashSize--;
        int i2 = this.capacity + this.stashSize;
        if (i < i2) {
            this.keyTable[i] = this.keyTable[i2];
            this.valueTable[i] = this.valueTable[i2];
            this.valueTable[i2] = null;
            return;
        }
        this.valueTable[i] = null;
    }

    public void clear() {
        long[] jArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i = this.capacity + this.stashSize;
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                jArr[i2] = 0;
                vArr[i2] = null;
                i = i2;
            } else {
                this.size = 0;
                this.stashSize = 0;
                this.zeroValue = null;
                this.hasZeroValue = false;
                return;
            }
        }
    }

    public boolean containsValue(Object obj, boolean z) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (!this.hasZeroValue || this.zeroValue != null) {
                long[] jArr = this.keyTable;
                int i = this.capacity + this.stashSize;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    } else if (jArr[i2] != 0 && vArr[i2] == null) {
                        return true;
                    } else {
                        i = i2;
                    }
                }
            } else {
                return true;
            }
        } else if (z) {
            if (obj == this.zeroValue) {
                return true;
            }
            int i3 = this.capacity + this.stashSize;
            while (true) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    break;
                } else if (vArr[i4] == obj) {
                    return true;
                } else {
                    i3 = i4;
                }
            }
        } else if (!this.hasZeroValue || !obj.equals(this.zeroValue)) {
            int i5 = this.capacity + this.stashSize;
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                } else if (obj.equals(vArr[i6])) {
                    return true;
                } else {
                    i5 = i6;
                }
            }
        } else {
            return true;
        }
        return false;
    }

    public boolean containsKey(long j) {
        if (j == 0) {
            return this.hasZeroValue;
        }
        if (this.keyTable[(int) (this.mask & j)] != j) {
            if (this.keyTable[hash2(j)] != j) {
                if (this.keyTable[hash3(j)] != j) {
                    return containsKeyStash(j);
                }
            }
        }
        return true;
    }

    private boolean containsKeyStash(long j) {
        long[] jArr = this.keyTable;
        int i = this.capacity;
        int i2 = this.stashSize + i;
        while (i < i2) {
            if (jArr[i] == j) {
                return true;
            }
            i++;
        }
        return false;
    }

    public void ensureCapacity(int i) {
        int i2 = this.size + i;
        if (i2 >= this.threshold) {
            resize(MathUtils.nextPowerOfTwo((int) (i2 / this.loadFactor)));
        }
    }

    private void resize(int i) {
        int i2 = this.stashSize + this.capacity;
        this.capacity = i;
        this.threshold = (int) (i * this.loadFactor);
        this.mask = i - 1;
        this.hashShift = 31 - Integer.numberOfTrailingZeros(i);
        this.stashCapacity = Math.max(3, (int) Math.ceil(Math.log(i)));
        this.pushIterations = Math.max(Math.min(this.capacity, 32), ((int) Math.sqrt(this.capacity)) / 4);
        long[] jArr = this.keyTable;
        V[] vArr = this.valueTable;
        this.keyTable = new long[this.stashCapacity + i];
        this.valueTable = (V[]) new Object[this.stashCapacity + i];
        this.size = this.hasZeroValue ? 1 : 0;
        this.stashSize = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                putResize(j, vArr[i3]);
            }
        }
    }

    private int hash2(long j) {
        long j2 = (-1262997959) * j;
        return (int) ((j2 ^ (j2 >>> this.hashShift)) & this.mask);
    }

    private int hash3(long j) {
        long j2 = (-825114047) * j;
        return (int) ((j2 ^ (j2 >>> this.hashShift)) & this.mask);
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        long[] jArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = jArr.length;
        while (true) {
            int i = length;
            length = i - 1;
            if (i <= 0) {
                break;
            }
            long j = jArr[length];
            if (j != 0) {
                sb.append(j);
                sb.append('=');
                sb.append(vArr[length]);
                break;
            }
        }
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                long j2 = jArr[i2];
                if (j2 == 0) {
                    length = i2;
                } else {
                    sb.append(", ");
                    sb.append(j2);
                    sb.append('=');
                    sb.append(vArr[i2]);
                    length = i2;
                }
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public Entries<V> entries() {
        if (this.entries == null) {
            this.entries = new Entries(this);
        } else {
            this.entries.reset();
        }
        return this.entries;
    }

    public Values<V> values() {
        if (this.values == null) {
            this.values = new Values(this);
        } else {
            this.values.reset();
        }
        return this.values;
    }

    public Keys keys() {
        if (this.keys == null) {
            this.keys = new Keys(this);
        } else {
            this.keys.reset();
        }
        return this.keys;
    }

    /* loaded from: classes.dex */
    public static class Entry<V> {
        public long key;
        public V value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.badlogic.gdx.utils.LongMap$a */
    /* loaded from: classes.dex */
    public static class C0849a<V> {
        static final int INDEX_ILLEGAL = -2;
        static final int INDEX_ZERO = -1;
        int currentIndex;
        public boolean hasNext;
        final LongMap<V> map;
        int nextIndex;

        public C0849a(LongMap<V> longMap) {
            this.map = longMap;
            reset();
        }

        public void reset() {
            this.currentIndex = INDEX_ILLEGAL;
            this.nextIndex = -1;
            if (this.map.hasZeroValue) {
                this.hasNext = true;
            } else {
                findNextIndex();
            }
        }

        void findNextIndex() {
            this.hasNext = false;
            long[] jArr = this.map.keyTable;
            int i = this.map.capacity + this.map.stashSize;
            do {
                int i2 = this.nextIndex + 1;
                this.nextIndex = i2;
                if (i2 >= i) {
                    return;
                }
            } while (jArr[this.nextIndex] == 0);
            this.hasNext = true;
        }

        public void remove() {
            if (this.currentIndex == -1 && this.map.hasZeroValue) {
                this.map.zeroValue = null;
                this.map.hasZeroValue = false;
            } else if (this.currentIndex < 0) {
                throw new IllegalStateException("next must be called before remove.");
            } else {
                if (this.currentIndex >= this.map.capacity) {
                    this.map.removeStashIndex(this.currentIndex);
                } else {
                    this.map.keyTable[this.currentIndex] = 0;
                    this.map.valueTable[this.currentIndex] = null;
                }
            }
            this.currentIndex = INDEX_ILLEGAL;
            LongMap<V> longMap = this.map;
            longMap.size--;
        }
    }

    /* loaded from: classes.dex */
    public static class Entries<V> extends C0849a<V> implements Iterable<Entry<V>>, Iterator<Entry<V>> {
        private Entry<V> entry;

        @Override // com.badlogic.gdx.utils.LongMap.C0849a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.LongMap.C0849a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Entries(LongMap longMap) {
            super(longMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public Entry<V> next() {
            if (this.hasNext) {
                long[] jArr = this.map.keyTable;
                if (this.nextIndex == -1) {
                    this.entry.key = 0L;
                    this.entry.value = this.map.zeroValue;
                } else {
                    this.entry.key = jArr[this.nextIndex];
                    this.entry.value = this.map.valueTable[this.nextIndex];
                }
                this.currentIndex = this.nextIndex;
                findNextIndex();
                return this.entry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.lang.Iterable
        public Iterator<Entry<V>> iterator() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class Values<V> extends C0849a<V> implements Iterable<V>, Iterator<V> {
        @Override // com.badlogic.gdx.utils.LongMap.C0849a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.LongMap.C0849a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Values(LongMap<V> longMap) {
            super(longMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public V next() {
            V v;
            if (this.nextIndex == -1) {
                v = this.map.zeroValue;
            } else {
                v = this.map.valueTable[this.nextIndex];
            }
            this.currentIndex = this.nextIndex;
            findNextIndex();
            return v;
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class Keys extends C0849a {
        @Override // com.badlogic.gdx.utils.LongMap.C0849a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.LongMap.C0849a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Keys(LongMap longMap) {
            super(longMap);
        }

        public long next() {
            long j = this.nextIndex == -1 ? 0L : this.map.keyTable[this.nextIndex];
            this.currentIndex = this.nextIndex;
            findNextIndex();
            return j;
        }
    }
}
