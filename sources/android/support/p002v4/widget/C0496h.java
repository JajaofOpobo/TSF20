package android.support.p002v4.widget;

import android.database.Cursor;
import android.widget.Filter;
/* renamed from: android.support.v4.widget.h */
/* loaded from: classes.dex */
class C0496h extends Filter {

    /* renamed from: a */
    InterfaceC0497a f1054a;

    /* renamed from: android.support.v4.widget.h$a */
    /* loaded from: classes.dex */
    interface InterfaceC0497a {
        /* renamed from: a */
        Cursor mo12266a();

        /* renamed from: a */
        Cursor mo11082a(CharSequence charSequence);

        /* renamed from: a */
        void mo11089a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo11075c(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0496h(InterfaceC0497a interfaceC0497a) {
        this.f1054a = interfaceC0497a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1054a.mo11075c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo11082a = this.f1054a.mo11082a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo11082a != null) {
            filterResults.count = mo11082a.getCount();
            filterResults.values = mo11082a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo12266a = this.f1054a.mo12266a();
        if (filterResults.values != null && filterResults.values != mo12266a) {
            this.f1054a.mo11089a((Cursor) filterResults.values);
        }
    }
}
