package com.tsf.shell.manager.c;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    public static boolean a(com.tsf.shell.manager.c.a.a.a aVar) {
        int i;
        Cursor cursorQuery = com.censivn.C3DEngine.a.d().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"version", "display_name", "photo_id"}, "contact_id= ?", new String[]{String.valueOf(aVar.b)}, null);
        if (!cursorQuery.moveToFirst() || aVar.e == (i = cursorQuery.getInt(0))) {
            return false;
        }
        String string = cursorQuery.getString(1);
        String string2 = cursorQuery.getString(2);
        aVar.c = string;
        aVar.d = string2;
        aVar.e = i;
        aVar.i();
        return true;
    }

    public static void a(Context context, com.tsf.shell.manager.c.a.a.a aVar) {
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(aVar.b)}, null);
        if (cursorQuery.moveToFirst()) {
            int columnIndex = cursorQuery.getColumnIndex("data1");
            int columnIndex2 = cursorQuery.getColumnIndex("data2");
            while (!cursorQuery.isAfterLast()) {
                aVar.c(cursorQuery.getString(columnIndex), ContactsContract.CommonDataKinds.Phone.getTypeLabel(context.getResources(), cursorQuery.getInt(columnIndex2), "Custom").toString());
                cursorQuery.moveToNext();
            }
        }
        cursorQuery.close();
    }

    public static void b(Context context, com.tsf.shell.manager.c.a.a.a aVar) {
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(aVar.b)}, null);
        if (cursorQuery.moveToFirst()) {
            int columnIndex = cursorQuery.getColumnIndex("data1");
            int columnIndex2 = cursorQuery.getColumnIndex("data2");
            while (!cursorQuery.isAfterLast()) {
                aVar.b(cursorQuery.getString(columnIndex), ContactsContract.CommonDataKinds.Email.getTypeLabel(context.getResources(), cursorQuery.getInt(columnIndex2), "Custom").toString());
                cursorQuery.moveToNext();
            }
        }
        cursorQuery.close();
    }

    public static byte[] a(Context context, String str) {
        byte[] blob;
        if (str == null) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data15"}, "_id = " + str, null, null);
        try {
            blob = cursorQuery.moveToFirst() ? cursorQuery.getBlob(0) : null;
        } catch (Exception e) {
            blob = null;
        }
        cursorQuery.close();
        if (blob != null) {
            return blob;
        }
        return null;
    }
}
