package com.flurry.a.b.a.d.d;

import com.flurry.a.b.a.d.ac;
import com.flurry.a.b.a.d.b.b.ap;
import com.flurry.a.b.a.d.i.x;
import com.flurry.a.b.a.d.w;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    protected a() {
    }

    public final ac a(com.flurry.a.b.a.g.a aVar) {
        String str;
        Class<?> p = aVar.p();
        String name = p.getName();
        if (name.startsWith("org.joda.time.")) {
            str = "com.flurry.org.codehaus.jackson.map.ext.JodaSerializers";
        } else if (name.startsWith("javax.xml.") || c(p, "javax.xml.")) {
            str = "com.flurry.org.codehaus.jackson.map.ext.CoreXMLSerializers";
        } else {
            if (a(p, "org.w3c.dom.Node")) {
                return (ac) a("com.flurry.org.codehaus.jackson.map.ext.DOMSerializer");
            }
            return null;
        }
        Object a2 = a(str);
        if (a2 == null) {
            return null;
        }
        Collection<Map.Entry> a3 = ((x) a2).a();
        for (Map.Entry entry : a3) {
            if (p == entry.getKey()) {
                return (ac) entry.getValue();
            }
        }
        for (Map.Entry entry2 : a3) {
            if (((Class) entry2.getKey()).isAssignableFrom(p)) {
                return (ac) entry2.getValue();
            }
        }
        return null;
    }

    public final w b(com.flurry.a.b.a.g.a aVar) {
        String str;
        Class p = aVar.p();
        String name = p.getName();
        if (name.startsWith("org.joda.time.")) {
            str = "com.flurry.org.codehaus.jackson.map.ext.JodaDeserializers";
        } else if (name.startsWith("javax.xml.") || c(p, "javax.xml.")) {
            str = "com.flurry.org.codehaus.jackson.map.ext.CoreXMLDeserializers";
        } else {
            if (a(p, "org.w3c.dom.Node")) {
                return (w) a("com.flurry.org.codehaus.jackson.map.ext.DOMDeserializer$DocumentDeserializer");
            }
            if (a(p, "org.w3c.dom.Node")) {
                return (w) a("com.flurry.org.codehaus.jackson.map.ext.DOMDeserializer$NodeDeserializer");
            }
            return null;
        }
        Object a2 = a(str);
        if (a2 == null) {
            return null;
        }
        Collection<ap> a3 = ((x) a2).a();
        for (ap apVar : a3) {
            if (p == apVar.d()) {
                return apVar;
            }
        }
        for (ap apVar2 : a3) {
            if (apVar2.d().isAssignableFrom(p)) {
                return apVar2;
            }
        }
        return null;
    }

    private static Object a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Exception | LinkageError e) {
            return null;
        }
    }

    private boolean a(Class cls, String str) {
        while (cls != null) {
            if (cls.getName().equals(str) || b(cls, str)) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    private boolean b(Class cls, String str) {
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> cls2 : interfaces) {
            if (cls2.getName().equals(str)) {
                return true;
            }
        }
        for (Class<?> cls3 : interfaces) {
            if (b(cls3, str)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(Class cls, String str) {
        for (Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().startsWith(str)) {
                return true;
            }
        }
        while (cls != null) {
            if (d(cls, str)) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    private boolean d(Class cls, String str) {
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> cls2 : interfaces) {
            if (cls2.getName().startsWith(str)) {
                return true;
            }
        }
        for (Class<?> cls3 : interfaces) {
            if (d(cls3, str)) {
                return true;
            }
        }
        return false;
    }
}
