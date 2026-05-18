package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.ai;
import android.support.v7.a.a;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.x;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class j {
    private static final Class<?>[] a = {Context.class, AttributeSet.class};
    private static final int[] b = {R.attr.onClick};
    private static final String[] c = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> d = new android.support.v4.d.a();
    private final Object[] e = new Object[2];

    j() {
    }

    public final View a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View appCompatSeekBar;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = x.a(context2);
        }
        appCompatSeekBar = null;
        switch (str) {
            case "TextView":
                appCompatSeekBar = new AppCompatTextView(context2, attributeSet);
                break;
            case "ImageView":
                appCompatSeekBar = new AppCompatImageView(context2, attributeSet);
                break;
            case "Button":
                appCompatSeekBar = new AppCompatButton(context2, attributeSet);
                break;
            case "EditText":
                appCompatSeekBar = new AppCompatEditText(context2, attributeSet);
                break;
            case "Spinner":
                appCompatSeekBar = new AppCompatSpinner(context2, attributeSet);
                break;
            case "ImageButton":
                appCompatSeekBar = new AppCompatImageButton(context2, attributeSet);
                break;
            case "CheckBox":
                appCompatSeekBar = new AppCompatCheckBox(context2, attributeSet);
                break;
            case "RadioButton":
                appCompatSeekBar = new AppCompatRadioButton(context2, attributeSet);
                break;
            case "CheckedTextView":
                appCompatSeekBar = new AppCompatCheckedTextView(context2, attributeSet);
                break;
            case "AutoCompleteTextView":
                appCompatSeekBar = new AppCompatAutoCompleteTextView(context2, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                appCompatSeekBar = new AppCompatMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case "RatingBar":
                appCompatSeekBar = new AppCompatRatingBar(context2, attributeSet);
                break;
            case "SeekBar":
                appCompatSeekBar = new AppCompatSeekBar(context2, attributeSet);
                break;
        }
        View viewA = (appCompatSeekBar != null || context == context2) ? appCompatSeekBar : a(context2, str, attributeSet);
        if (viewA != null) {
            a(viewA, attributeSet);
        }
        return viewA;
    }

    private View a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.e[0] = context;
            this.e[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return a(context, str, (String) null);
            }
            for (int i = 0; i < c.length; i++) {
                View viewA = a(context, str, c[i]);
                if (viewA != null) {
                    return viewA;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            this.e[0] = null;
            this.e[1] = null;
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || ai.z(view)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private View a(Context context, String str, String str2) {
        Constructor<? extends View> constructor = d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(a);
                d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.e);
    }

    private static Context a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(a.k.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(a.k.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        int i = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if (!(context instanceof android.support.v7.view.d) || ((android.support.v7.view.d) context).a() != i) {
            return new android.support.v7.view.d(context, i);
        }
        return context;
    }

    private static class a implements View.OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public a(View view, String str) {
            this.a = view;
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.c == null) {
                a(this.a.getContext(), this.b);
            }
            try {
                this.c.invoke(this.d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void a(Context context, String str) {
            Method method;
            Context baseContext = context;
            while (baseContext != null) {
                try {
                    if (!baseContext.isRestricted() && (method = baseContext.getClass().getMethod(this.b, View.class)) != null) {
                        this.c = method;
                        this.d = baseContext;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                if (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    baseContext = null;
                }
            }
            int id = this.a.getId();
            throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.a.getClass() + (id == -1 ? "" : " with id '" + this.a.getContext().getResources().getResourceEntryName(id) + "'"));
        }
    }
}
