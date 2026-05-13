package com.tsf.shell.manager.p169c;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.manager.p169c.p170a.p171a.C3459a;
/* renamed from: com.tsf.shell.manager.c.c */
/* loaded from: classes.dex */
public class C3465c {
    /* renamed from: a */
    public static boolean m2299a(C3459a c3459a) {
        int i;
        Cursor query = C0853a.m10856d().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"version", "display_name", "photo_id"}, "contact_id= ?", new String[]{String.valueOf(c3459a.f11433b)}, null);
        if (!query.moveToFirst() || c3459a.f11436e == (i = query.getInt(0))) {
            return false;
        }
        String string = query.getString(1);
        String string2 = query.getString(2);
        c3459a.f11434c = string;
        c3459a.f11435d = string2;
        c3459a.f11436e = i;
        c3459a.m2311i();
        return true;
    }

    /* renamed from: a */
    public static void m2301a(Context context, C3459a c3459a) {
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(c3459a.f11433b)}, null);
        if (query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data2");
            while (!query.isAfterLast()) {
                c3459a.m2317c(query.getString(columnIndex), ContactsContract.CommonDataKinds.Phone.getTypeLabel(context.getResources(), query.getInt(columnIndex2), "Custom").toString());
                query.moveToNext();
            }
        }
        query.close();
    }

    /* renamed from: b */
    public static void m2298b(Context context, C3459a c3459a) {
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(c3459a.f11433b)}, null);
        if (query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data2");
            while (!query.isAfterLast()) {
                c3459a.m2319b(query.getString(columnIndex), ContactsContract.CommonDataKinds.Email.getTypeLabel(context.getResources(), query.getInt(columnIndex2), "Custom").toString());
                query.moveToNext();
            }
        }
        query.close();
    }

    /* renamed from: a */
    public static byte[] m2300a(Context context, String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data15"}, "_id = " + str, null, null);
        try {
            bArr = query.moveToFirst() ? query.getBlob(0) : null;
        } catch (Exception e) {
            bArr = null;
        }
        query.close();
        if (bArr != null) {
            return bArr;
        }
        return null;
    }
}
