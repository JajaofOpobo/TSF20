package com.flurry.a.b.a.d.g.b;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class al implements com.flurry.a.b.a.d.i.x {
    @Override // com.flurry.a.b.a.d.i.x
    public final Collection a() {
        HashMap hashMap = new HashMap();
        ba baVar = ba.a;
        hashMap.put(URL.class, baVar);
        hashMap.put(URI.class, baVar);
        hashMap.put(Currency.class, baVar);
        hashMap.put(UUID.class, baVar);
        hashMap.put(Pattern.class, baVar);
        hashMap.put(Locale.class, baVar);
        hashMap.put(Locale.class, baVar);
        hashMap.put(AtomicReference.class, ap.class);
        hashMap.put(AtomicBoolean.class, am.class);
        hashMap.put(AtomicInteger.class, an.class);
        hashMap.put(AtomicLong.class, ao.class);
        hashMap.put(File.class, ar.class);
        hashMap.put(Class.class, aq.class);
        hashMap.put(Void.TYPE, p.class);
        return hashMap.entrySet();
    }
}
