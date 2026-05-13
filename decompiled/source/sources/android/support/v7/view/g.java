package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.view.q;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends MenuInflater {
    private static final Class<?>[] a = {Context.class};
    private static final Class<?>[] b = a;
    private final Object[] c;
    private final Object[] d;
    private Context e;
    private Object f;

    public g(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
        this.d = this.c;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof android.support.v4.b.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = this.e.getResources().getLayout(i);
                a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        boolean z;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        Object obj = null;
        boolean z2 = false;
        int i = eventType;
        boolean z3 = false;
        while (!z3) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (z2) {
                        z = z2;
                        continue;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            bVar.a(attributeSet);
                            z = z2;
                        } else if (name2.equals("item")) {
                            bVar.b(attributeSet);
                            z = z2;
                        } else if (name2.equals("menu")) {
                            a(xmlPullParser, attributeSet, bVar.c());
                            z = z2;
                        } else {
                            obj = name2;
                            z = true;
                        }
                    }
                    boolean z4 = z;
                    i = xmlPullParser.next();
                    z2 = z4;
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (z2 && name3.equals(obj)) {
                        obj = null;
                        z = false;
                        continue;
                    } else if (name3.equals("group")) {
                        bVar.a();
                        z = z2;
                    } else if (name3.equals("item")) {
                        if (!bVar.d()) {
                            if (bVar.z != null && bVar.z.e()) {
                                bVar.c();
                                z = z2;
                            } else {
                                bVar.b();
                                z = z2;
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z3 = true;
                        z = z2;
                    }
                    boolean z42 = z;
                    i = xmlPullParser.next();
                    z2 = z42;
                    break;
            }
            z = z2;
            boolean z422 = z;
            i = xmlPullParser.next();
            z2 = z422;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c() {
        if (this.f == null) {
            this.f = a(this.e);
        }
        return this.f;
    }

    private Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] a = {MenuItem.class};
        private Object b;
        private Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.b, menuItem)).booleanValue();
                }
                this.c.invoke(this.b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        private Menu b;
        private int c;
        private int d;
        private int e;
        private int f;
        private boolean g;
        private boolean h;
        private boolean i;
        private int j;
        private int k;
        private CharSequence l;
        private CharSequence m;
        private int n;
        private char o;
        private char p;
        private int q;
        private boolean r;
        private boolean s;
        private boolean t;
        private int u;
        private int v;
        private String w;
        private String x;
        private String y;
        private android.support.v4.view.d z;

        public b(Menu menu) {
            this.b = menu;
            a();
        }

        public void a() {
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = true;
            this.h = true;
        }

        public void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.e.obtainStyledAttributes(attributeSet, a.k.MenuGroup);
            this.c = obtainStyledAttributes.getResourceId(a.k.MenuGroup_android_id, 0);
            this.d = obtainStyledAttributes.getInt(a.k.MenuGroup_android_menuCategory, 0);
            this.e = obtainStyledAttributes.getInt(a.k.MenuGroup_android_orderInCategory, 0);
            this.f = obtainStyledAttributes.getInt(a.k.MenuGroup_android_checkableBehavior, 0);
            this.g = obtainStyledAttributes.getBoolean(a.k.MenuGroup_android_visible, true);
            this.h = obtainStyledAttributes.getBoolean(a.k.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.e.obtainStyledAttributes(attributeSet, a.k.MenuItem);
            this.j = obtainStyledAttributes.getResourceId(a.k.MenuItem_android_id, 0);
            this.k = (obtainStyledAttributes.getInt(a.k.MenuItem_android_menuCategory, this.d) & (-65536)) | (obtainStyledAttributes.getInt(a.k.MenuItem_android_orderInCategory, this.e) & 65535);
            this.l = obtainStyledAttributes.getText(a.k.MenuItem_android_title);
            this.m = obtainStyledAttributes.getText(a.k.MenuItem_android_titleCondensed);
            this.n = obtainStyledAttributes.getResourceId(a.k.MenuItem_android_icon, 0);
            this.o = a(obtainStyledAttributes.getString(a.k.MenuItem_android_alphabeticShortcut));
            this.p = a(obtainStyledAttributes.getString(a.k.MenuItem_android_numericShortcut));
            if (obtainStyledAttributes.hasValue(a.k.MenuItem_android_checkable)) {
                this.q = obtainStyledAttributes.getBoolean(a.k.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.q = this.f;
            }
            this.r = obtainStyledAttributes.getBoolean(a.k.MenuItem_android_checked, false);
            this.s = obtainStyledAttributes.getBoolean(a.k.MenuItem_android_visible, this.g);
            this.t = obtainStyledAttributes.getBoolean(a.k.MenuItem_android_enabled, this.h);
            this.u = obtainStyledAttributes.getInt(a.k.MenuItem_showAsAction, -1);
            this.y = obtainStyledAttributes.getString(a.k.MenuItem_android_onClick);
            this.v = obtainStyledAttributes.getResourceId(a.k.MenuItem_actionLayout, 0);
            this.w = obtainStyledAttributes.getString(a.k.MenuItem_actionViewClass);
            this.x = obtainStyledAttributes.getString(a.k.MenuItem_actionProviderClass);
            boolean z = this.x != null;
            if (z && this.v == 0 && this.w == null) {
                this.z = (android.support.v4.view.d) a(this.x, g.b, g.this.d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.z = null;
            }
            obtainStyledAttributes.recycle();
            this.i = false;
        }

        private char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private void a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.r).setVisible(this.s).setEnabled(this.t).setCheckable(this.q >= 1).setTitleCondensed(this.m).setIcon(this.n).setAlphabeticShortcut(this.o).setNumericShortcut(this.p);
            if (this.u >= 0) {
                q.a(menuItem, this.u);
            }
            if (this.y != null) {
                if (g.this.e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.c(), this.y));
            }
            if (menuItem instanceof android.support.v7.view.menu.h) {
                android.support.v7.view.menu.h hVar = (android.support.v7.view.menu.h) menuItem;
            }
            if (this.q >= 2) {
                if (menuItem instanceof android.support.v7.view.menu.h) {
                    ((android.support.v7.view.menu.h) menuItem).a(true);
                } else if (menuItem instanceof android.support.v7.view.menu.i) {
                    ((android.support.v7.view.menu.i) menuItem).a(true);
                }
            }
            if (this.w != null) {
                q.a(menuItem, (View) a(this.w, g.a, g.this.c));
            } else {
                z = false;
            }
            if (this.v > 0) {
                if (!z) {
                    q.b(menuItem, this.v);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.z != null) {
                q.a(menuItem, this.z);
            }
        }

        public void b() {
            this.i = true;
            a(this.b.add(this.c, this.j, this.k, this.l));
        }

        public SubMenu c() {
            this.i = true;
            SubMenu addSubMenu = this.b.addSubMenu(this.c, this.j, this.k, this.l);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.i;
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }
}
