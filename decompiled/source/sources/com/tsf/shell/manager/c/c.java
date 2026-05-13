package com.tsf.shell.manager.c;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
/* loaded from: classes.dex */
public class c {
    public static boolean a(com.tsf.shell.manager.c.a.a.a aVar) {
        int i;
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"version", "display_name", "photo_id"}, "contact_id= ?", new String[]{String.valueOf(aVar.b)}, null);
        if (!query.moveToFirst() || aVar.e == (i = query.getInt(0))) {
            return false;
        }
        String string = query.getString(1);
        String string2 = query.getString(2);
        aVar.c = string;
        aVar.d = string2;
        aVar.e = i;
        aVar.i();
        return true;
    }

    public static void a(Context context, com.tsf.shell.manager.c.a.a.a aVar) {
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(aVar.b)}, null);
        if (query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data2");
            while (!query.isAfterLast()) {
                aVar.c(query.getString(columnIndex), ContactsContract.CommonDataKinds.Phone.getTypeLabel(context.getResources(), query.getInt(columnIndex2), "Custom").toString());
                query.moveToNext();
            }
        }
        query.close();
    }

    public static void b(Context context, com.tsf.shell.manager.c.a.a.a aVar) {
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(aVar.b)}, null);
        if (query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data2");
            while (!query.isAfterLast()) {
                aVar.b(query.getString(columnIndex), ContactsContract.CommonDataKinds.Email.getTypeLabel(context.getResources(), query.getInt(columnIndex2), "Custom").toString());
                query.moveToNext();
            }
        }
        query.close();
    }

    public static byte[] a(Context context, String str) {
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
