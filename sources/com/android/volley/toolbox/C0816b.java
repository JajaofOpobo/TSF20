package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.android.volley.toolbox.b */
/* loaded from: classes.dex */
public class C0816b {

    /* renamed from: a */
    protected static final Comparator<byte[]> f2348a = new Comparator<byte[]>() { // from class: com.android.volley.toolbox.b.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b */
    private List<byte[]> f2349b = new LinkedList();

    /* renamed from: c */
    private List<byte[]> f2350c = new ArrayList(64);

    /* renamed from: d */
    private int f2351d = 0;

    /* renamed from: e */
    private final int f2352e;

    public C0816b(int i) {
        this.f2352e = i;
    }

    /* renamed from: a */
    public synchronized byte[] m10973a(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.f2350c.size()) {
                bArr = this.f2350c.get(i3);
                if (bArr.length < i) {
                    i2 = i3 + 1;
                } else {
                    this.f2351d -= bArr.length;
                    this.f2350c.remove(i3);
                    this.f2349b.remove(bArr);
                    break;
                }
            } else {
                bArr = new byte[i];
                break;
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public synchronized void m10972a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f2352e) {
                this.f2349b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f2350c, bArr, f2348a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f2350c.add(binarySearch, bArr);
                this.f2351d += bArr.length;
                m10974a();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m10974a() {
        while (this.f2351d > this.f2352e) {
            byte[] remove = this.f2349b.remove(0);
            this.f2350c.remove(remove);
            this.f2351d -= remove.length;
        }
    }
}
