package android.support.p013v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v4.content.C0144a;
import android.support.p002v4.widget.AbstractC0528x;
import android.support.p013v7.p014a.C0535a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: android.support.v7.widget.u */
/* loaded from: classes.dex */
class View$OnClickListenerC0768u extends AbstractC0528x implements View.OnClickListener {

    /* renamed from: j */
    private final SearchManager f2205j;

    /* renamed from: k */
    private final SearchView f2206k;

    /* renamed from: l */
    private final SearchableInfo f2207l;

    /* renamed from: m */
    private final Context f2208m;

    /* renamed from: n */
    private final WeakHashMap<String, Drawable.ConstantState> f2209n;

    /* renamed from: o */
    private final int f2210o;

    /* renamed from: p */
    private boolean f2211p;

    /* renamed from: q */
    private int f2212q;

    /* renamed from: r */
    private ColorStateList f2213r;

    /* renamed from: s */
    private int f2214s;

    /* renamed from: t */
    private int f2215t;

    /* renamed from: u */
    private int f2216u;

    /* renamed from: v */
    private int f2217v;

    /* renamed from: w */
    private int f2218w;

    /* renamed from: x */
    private int f2219x;

    public View$OnClickListenerC0768u(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f2211p = false;
        this.f2212q = 1;
        this.f2214s = -1;
        this.f2215t = -1;
        this.f2216u = -1;
        this.f2217v = -1;
        this.f2218w = -1;
        this.f2219x = -1;
        this.f2205j = (SearchManager) this.f1046d.getSystemService("search");
        this.f2206k = searchView;
        this.f2207l = searchableInfo;
        this.f2210o = searchView.getSuggestionCommitIconResId();
        this.f2208m = context;
        this.f2209n = weakHashMap;
    }

    /* renamed from: a */
    public void m11093a(int i) {
        this.f2212q = i;
    }

    @Override // android.support.p002v4.widget.AbstractC0492g, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.support.p002v4.widget.AbstractC0492g, android.support.p002v4.widget.C0496h.InterfaceC0497a
    /* renamed from: a */
    public Cursor mo11082a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2206k.getVisibility() == 0 && this.f2206k.getWindowVisibility() == 0) {
            try {
                Cursor m11092a = m11092a(this.f2207l, charSequence2, 50);
                if (m11092a != null) {
                    m11092a.getCount();
                    return m11092a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m11074d(mo12266a());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m11074d(mo12266a());
    }

    /* renamed from: d */
    private void m11074d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.support.p002v4.widget.AbstractC0492g, android.support.p002v4.widget.C0496h.InterfaceC0497a
    /* renamed from: a */
    public void mo11089a(Cursor cursor) {
        if (this.f2211p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo11089a(cursor);
            if (cursor != null) {
                this.f2214s = cursor.getColumnIndex("suggest_text_1");
                this.f2215t = cursor.getColumnIndex("suggest_text_2");
                this.f2216u = cursor.getColumnIndex("suggest_text_2_url");
                this.f2217v = cursor.getColumnIndex("suggest_icon_1");
                this.f2218w = cursor.getColumnIndex("suggest_icon_2");
                this.f2219x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // android.support.p002v4.widget.AbstractC0528x, android.support.p002v4.widget.AbstractC0492g
    /* renamed from: a */
    public View mo11090a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo11090a = super.mo11090a(context, cursor, viewGroup);
        mo11090a.setTag(new C0769a(mo11090a));
        ((ImageView) mo11090a.findViewById(C0535a.C0541f.edit_query)).setImageResource(this.f2210o);
        return mo11090a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.u$a */
    /* loaded from: classes.dex */
    public static final class C0769a {

        /* renamed from: a */
        public final TextView f2220a;

        /* renamed from: b */
        public final TextView f2221b;

        /* renamed from: c */
        public final ImageView f2222c;

        /* renamed from: d */
        public final ImageView f2223d;

        /* renamed from: e */
        public final ImageView f2224e;

        public C0769a(View view) {
            this.f2220a = (TextView) view.findViewById(16908308);
            this.f2221b = (TextView) view.findViewById(16908309);
            this.f2222c = (ImageView) view.findViewById(16908295);
            this.f2223d = (ImageView) view.findViewById(16908296);
            this.f2224e = (ImageView) view.findViewById(C0535a.C0541f.edit_query);
        }
    }

    @Override // android.support.p002v4.widget.AbstractC0492g
    /* renamed from: a */
    public void mo11085a(View view, Context context, Cursor cursor) {
        CharSequence m11088a;
        C0769a c0769a = (C0769a) view.getTag();
        int i = this.f2219x != -1 ? cursor.getInt(this.f2219x) : 0;
        if (c0769a.f2220a != null) {
            m11083a(c0769a.f2220a, m11088a(cursor, this.f2214s));
        }
        if (c0769a.f2221b != null) {
            String m11088a2 = m11088a(cursor, this.f2216u);
            if (m11088a2 != null) {
                m11088a = m11077b((CharSequence) m11088a2);
            } else {
                m11088a = m11088a(cursor, this.f2215t);
            }
            if (TextUtils.isEmpty(m11088a)) {
                if (c0769a.f2220a != null) {
                    c0769a.f2220a.setSingleLine(false);
                    c0769a.f2220a.setMaxLines(2);
                }
            } else if (c0769a.f2220a != null) {
                c0769a.f2220a.setSingleLine(true);
                c0769a.f2220a.setMaxLines(1);
            }
            m11083a(c0769a.f2221b, m11088a);
        }
        if (c0769a.f2222c != null) {
            m11084a(c0769a.f2222c, m11073e(cursor), 4);
        }
        if (c0769a.f2223d != null) {
            m11084a(c0769a.f2223d, m11072f(cursor), 8);
        }
        if (this.f2212q == 2 || (this.f2212q == 1 && (i & 1) != 0)) {
            c0769a.f2224e.setVisibility(0);
            c0769a.f2224e.setTag(c0769a.f2220a.getText());
            c0769a.f2224e.setOnClickListener(this);
            return;
        }
        c0769a.f2224e.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2206k.m11437a((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private CharSequence m11077b(CharSequence charSequence) {
        if (this.f2213r == null) {
            TypedValue typedValue = new TypedValue();
            this.f1046d.getTheme().resolveAttribute(C0535a.C0536a.textColorSearchUrl, typedValue, true);
            this.f2213r = this.f1046d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2213r, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    private void m11083a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: e */
    private Drawable m11073e(Cursor cursor) {
        if (this.f2217v == -1) {
            return null;
        }
        Drawable m11081a = m11081a(cursor.getString(this.f2217v));
        return m11081a == null ? m11071g(cursor) : m11081a;
    }

    /* renamed from: f */
    private Drawable m11072f(Cursor cursor) {
        if (this.f2218w == -1) {
            return null;
        }
        return m11081a(cursor.getString(this.f2218w));
    }

    /* renamed from: a */
    private void m11084a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // android.support.p002v4.widget.AbstractC0492g, android.support.p002v4.widget.C0496h.InterfaceC0497a
    /* renamed from: c */
    public CharSequence mo11075c(Cursor cursor) {
        String m11087a;
        String m11087a2;
        if (cursor == null) {
            return null;
        }
        String m11087a3 = m11087a(cursor, "suggest_intent_query");
        if (m11087a3 != null) {
            return m11087a3;
        }
        if (!this.f2207l.shouldRewriteQueryFromData() || (m11087a2 = m11087a(cursor, "suggest_intent_data")) == null) {
            if (!this.f2207l.shouldRewriteQueryFromText() || (m11087a = m11087a(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return m11087a;
        }
        return m11087a2;
    }

    @Override // android.support.p002v4.widget.AbstractC0492g, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo11090a = mo11090a(this.f1046d, this.f1045c, viewGroup);
            if (mo11090a != null) {
                ((C0769a) mo11090a.getTag()).f2220a.setText(e.toString());
            }
            return mo11090a;
        }
    }

    /* renamed from: a */
    private Drawable m11081a(String str) {
        if (str == null || str.length() == 0 || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2208m.getPackageName() + "/" + parseInt;
            Drawable m11076b = m11076b(str2);
            if (m11076b == null) {
                Drawable m13403a = C0144a.m13403a(this.f2208m, parseInt);
                m11080a(str2, m13403a);
                return m13403a;
            }
            return m11076b;
        } catch (Resources.NotFoundException e) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException e2) {
            Drawable m11076b2 = m11076b(str);
            if (m11076b2 == null) {
                Drawable m11078b = m11078b(Uri.parse(str));
                m11080a(str, m11078b);
                return m11078b;
            }
            return m11076b2;
        }
    }

    /* renamed from: b */
    private Drawable m11078b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m11086a(uri);
                } catch (Resources.NotFoundException e) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f2208m.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (IOException e2) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                return createFromStream;
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    /* renamed from: b */
    private Drawable m11076b(String str) {
        Drawable.ConstantState constantState = this.f2209n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private void m11080a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2209n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: g */
    private Drawable m11071g(Cursor cursor) {
        Drawable m11091a = m11091a(this.f2207l.getSearchActivity());
        return m11091a != null ? m11091a : this.f1046d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    private Drawable m11091a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f2209n.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f2209n.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.f2208m.getResources());
        }
        Drawable m11079b = m11079b(componentName);
        this.f2209n.put(flattenToShortString, m11079b != null ? m11079b.getConstantState() : null);
        return m11079b;
    }

    /* renamed from: b */
    private Drawable m11079b(ComponentName componentName) {
        PackageManager packageManager = this.f1046d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, ItemInfo.APP_INTENT);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m11087a(Cursor cursor, String str) {
        return m11088a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m11088a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    Drawable m11086a(Uri uri) {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1046d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (identifier == 0) {
                throw new FileNotFoundException("No resource found for: " + uri);
            }
            return resourcesForApplication.getDrawable(identifier);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: a */
    Cursor m11092a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1046d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }
}
