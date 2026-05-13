package android.support.p013v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p002v4.p009d.C0160a;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.C0610d;
import android.support.p013v7.widget.AppCompatAutoCompleteTextView;
import android.support.p013v7.widget.AppCompatButton;
import android.support.p013v7.widget.AppCompatCheckBox;
import android.support.p013v7.widget.AppCompatCheckedTextView;
import android.support.p013v7.widget.AppCompatEditText;
import android.support.p013v7.widget.AppCompatImageButton;
import android.support.p013v7.widget.AppCompatImageView;
import android.support.p013v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.p013v7.widget.AppCompatRadioButton;
import android.support.p013v7.widget.AppCompatRatingBar;
import android.support.p013v7.widget.AppCompatSeekBar;
import android.support.p013v7.widget.AppCompatSpinner;
import android.support.p013v7.widget.AppCompatTextView;
import android.support.p013v7.widget.C0772x;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.j */
/* loaded from: classes.dex */
public class C0588j {

    /* renamed from: a */
    private static final Class<?>[] f1310a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f1311b = {16843375};

    /* renamed from: c */
    private static final String[] f1312c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f1313d = new C0160a();

    /* renamed from: e */
    private final Object[] f1314e = new Object[2];

    /* renamed from: a */
    public final View m11941a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m11945a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0772x.m11063a(context2);
        }
        View view2 = null;
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = new AppCompatTextView(context2, attributeSet);
                break;
            case 1:
                view2 = new AppCompatImageView(context2, attributeSet);
                break;
            case 2:
                view2 = new AppCompatButton(context2, attributeSet);
                break;
            case 3:
                view2 = new AppCompatEditText(context2, attributeSet);
                break;
            case 4:
                view2 = new AppCompatSpinner(context2, attributeSet);
                break;
            case 5:
                view2 = new AppCompatImageButton(context2, attributeSet);
                break;
            case 6:
                view2 = new AppCompatCheckBox(context2, attributeSet);
                break;
            case 7:
                view2 = new AppCompatRadioButton(context2, attributeSet);
                break;
            case '\b':
                view2 = new AppCompatCheckedTextView(context2, attributeSet);
                break;
            case '\t':
                view2 = new AppCompatAutoCompleteTextView(context2, attributeSet);
                break;
            case '\n':
                view2 = new AppCompatMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view2 = new AppCompatRatingBar(context2, attributeSet);
                break;
            case '\f':
                view2 = new AppCompatSeekBar(context2, attributeSet);
                break;
        }
        View m11944a = (view2 != null || context == context2) ? view2 : m11944a(context2, str, attributeSet);
        if (m11944a != null) {
            m11942a(m11944a, attributeSet);
        }
        return m11944a;
    }

    /* renamed from: a */
    private View m11944a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f1314e[0] = context;
            this.f1314e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < f1312c.length; i++) {
                    View m11943a = m11943a(context, str, f1312c[i]);
                    if (m11943a != null) {
                        return m11943a;
                    }
                }
                return null;
            }
            return m11943a(context, str, (String) null);
        } catch (Exception e) {
            return null;
        } finally {
            this.f1314e[0] = null;
            this.f1314e[1] = null;
        }
    }

    /* renamed from: a */
    private void m11942a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C0309ai.m12881z(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1311b);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new View$OnClickListenerC0589a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: a */
    private View m11943a(Context context, String str, String str2) {
        Constructor<? extends View> constructor = f1313d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f1310a);
                f1313d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f1314e);
    }

    /* renamed from: a */
    private static Context m11945a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0535a.C0546k.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0535a.C0546k.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (!(context instanceof C0610d) || ((C0610d) context).m11868a() != i) {
                return new C0610d(context, i);
            }
            return context;
        }
        return context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.j$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC0589a implements View.OnClickListener {

        /* renamed from: a */
        private final View f1315a;

        /* renamed from: b */
        private final String f1316b;

        /* renamed from: c */
        private Method f1317c;

        /* renamed from: d */
        private Context f1318d;

        public View$OnClickListenerC0589a(View view, String str) {
            this.f1315a = view;
            this.f1316b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1317c == null) {
                m11940a(this.f1315a.getContext(), this.f1316b);
            }
            try {
                this.f1317c.invoke(this.f1318d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: a */
        private void m11940a(Context context, String str) {
            Method method;
            Context context2 = context;
            while (context2 != null) {
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.f1316b, View.class)) != null) {
                        this.f1317c = method;
                        this.f1318d = context2;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else {
                    context2 = null;
                }
            }
            int id = this.f1315a.getId();
            throw new IllegalStateException("Could not find method " + this.f1316b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1315a.getClass() + (id == -1 ? "" : " with id '" + this.f1315a.getContext().getResources().getResourceEntryName(id) + "'"));
        }
    }
}
