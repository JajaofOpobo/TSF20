package android.support.p002v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.p002v4.widget.C0496h;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
/* renamed from: android.support.v4.widget.g */
/* loaded from: classes.dex */
public abstract class AbstractC0492g extends BaseAdapter implements C0496h.InterfaceC0497a, Filterable {

    /* renamed from: a */
    protected boolean f1043a;

    /* renamed from: b */
    protected boolean f1044b;

    /* renamed from: c */
    protected Cursor f1045c;

    /* renamed from: d */
    protected Context f1046d;

    /* renamed from: e */
    protected int f1047e;

    /* renamed from: f */
    protected C0494a f1048f;

    /* renamed from: g */
    protected DataSetObserver f1049g;

    /* renamed from: h */
    protected C0496h f1050h;

    /* renamed from: i */
    protected FilterQueryProvider f1051i;

    /* renamed from: a */
    public abstract View mo11090a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo11085a(View view, Context context, Cursor cursor);

    public AbstractC0492g(Context context, Cursor cursor, boolean z) {
        m12269a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    void m12269a(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f1044b = true;
        } else {
            this.f1044b = false;
        }
        boolean z = cursor != null;
        this.f1045c = cursor;
        this.f1043a = z;
        this.f1046d = context;
        this.f1047e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1048f = new C0494a();
            this.f1049g = new C0495b();
        } else {
            this.f1048f = null;
            this.f1049g = null;
        }
        if (z) {
            if (this.f1048f != null) {
                cursor.registerContentObserver(this.f1048f);
            }
            if (this.f1049g != null) {
                cursor.registerDataSetObserver(this.f1049g);
            }
        }
    }

    @Override // android.support.p002v4.widget.C0496h.InterfaceC0497a
    /* renamed from: a */
    public Cursor mo12266a() {
        return this.f1045c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f1043a || this.f1045c == null) {
            return 0;
        }
        return this.f1045c.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (!this.f1043a || this.f1045c == null) {
            return null;
        }
        this.f1045c.moveToPosition(i);
        return this.f1045c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (this.f1043a && this.f1045c != null && this.f1045c.moveToPosition(i)) {
            return this.f1045c.getLong(this.f1047e);
        }
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1043a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1045c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = mo11090a(this.f1046d, this.f1045c, viewGroup);
        }
        mo11085a(view, this.f1046d, this.f1045c);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f1043a) {
            this.f1045c.moveToPosition(i);
            if (view == null) {
                view = mo12164b(this.f1046d, this.f1045c, viewGroup);
            }
            mo11085a(view, this.f1046d, this.f1045c);
            return view;
        }
        return null;
    }

    /* renamed from: b */
    public View mo12164b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo11090a(context, cursor, viewGroup);
    }

    @Override // android.support.p002v4.widget.C0496h.InterfaceC0497a
    /* renamed from: a */
    public void mo11089a(Cursor cursor) {
        Cursor m12267b = m12267b(cursor);
        if (m12267b != null) {
            m12267b.close();
        }
    }

    /* renamed from: b */
    public Cursor m12267b(Cursor cursor) {
        if (cursor == this.f1045c) {
            return null;
        }
        Cursor cursor2 = this.f1045c;
        if (cursor2 != null) {
            if (this.f1048f != null) {
                cursor2.unregisterContentObserver(this.f1048f);
            }
            if (this.f1049g != null) {
                cursor2.unregisterDataSetObserver(this.f1049g);
            }
        }
        this.f1045c = cursor;
        if (cursor != null) {
            if (this.f1048f != null) {
                cursor.registerContentObserver(this.f1048f);
            }
            if (this.f1049g != null) {
                cursor.registerDataSetObserver(this.f1049g);
            }
            this.f1047e = cursor.getColumnIndexOrThrow("_id");
            this.f1043a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f1047e = -1;
        this.f1043a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    @Override // android.support.p002v4.widget.C0496h.InterfaceC0497a
    /* renamed from: c */
    public CharSequence mo11075c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.support.p002v4.widget.C0496h.InterfaceC0497a
    /* renamed from: a */
    public Cursor mo11082a(CharSequence charSequence) {
        return this.f1051i != null ? this.f1051i.runQuery(charSequence) : this.f1045c;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1050h == null) {
            this.f1050h = new C0496h(this);
        }
        return this.f1050h;
    }

    /* renamed from: b */
    protected void m12268b() {
        if (this.f1044b && this.f1045c != null && !this.f1045c.isClosed()) {
            this.f1043a = this.f1045c.requery();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.g$a */
    /* loaded from: classes.dex */
    public class C0494a extends ContentObserver {
        public C0494a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC0492g.this.m12268b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.g$b */
    /* loaded from: classes.dex */
    public class C0495b extends DataSetObserver {
        private C0495b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0492g.this.f1043a = true;
            AbstractC0492g.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0492g.this.f1043a = false;
            AbstractC0492g.this.notifyDataSetInvalidated();
        }
    }
}
