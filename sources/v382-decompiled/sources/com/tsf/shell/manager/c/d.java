package com.tsf.shell.manager.c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"display_name", "photo_id", "version"};
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, "starred =  1 ", null, null);
        if (query != null) {
            while (query.moveToNext()) {
                long j = query.getLong(query.getColumnIndex("_id"));
                Cursor query2 = com.censivn.C3DEngine.a.d().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, strArr, "contact_id=" + Long.toString(j), null, null);
                if (query2.getCount() > 0 && query2.moveToFirst()) {
                    com.tsf.shell.manager.c.a.a.b a = c.a();
                    String string = query2.getString(0);
                    String string2 = query2.getString(1);
                    int i = query2.getInt(2);
                    a.b = new StringBuilder().append(j).toString();
                    a.c = string;
                    a.d = string2;
                    a.e = i;
                    query2.close();
                    arrayList.add(a);
                }
            }
            query.close();
        }
        return arrayList;
    }

    public static ArrayList a(int i) {
        ArrayList arrayList = new ArrayList();
        System.currentTimeMillis();
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "type", "name"}, null, null, "date DESC");
        if (query != null) {
            int count = query.getCount();
            query.moveToFirst();
            for (int i2 = 0; i2 < count; i2++) {
                String string = query.getString(0);
                query.getString(1);
                String string2 = query.getString(2);
                if (string2 == null) {
                    string2 = "";
                }
                query.moveToNext();
                if (!b(string, arrayList)) {
                    com.tsf.shell.manager.c.a.a.a aVar = new com.tsf.shell.manager.c.a.a.a();
                    aVar.a = string2;
                    aVar.b = string;
                    arrayList.add(aVar);
                }
                if (arrayList.size() >= i) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.manager.c.a.a.a aVar2 = (com.tsf.shell.manager.c.a.a.a) it.next();
            com.tsf.shell.manager.c.a.a.b a = a(aVar2.b);
            if (a != null) {
                if (a(a.b, arrayList2)) {
                    a.i();
                    c.a(a);
                } else {
                    arrayList2.add(a);
                }
            }
            aVar2.a();
        }
        arrayList.clear();
        return arrayList2;
    }

    private static boolean a(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.tsf.shell.manager.c.a.a.b) it.next()).b.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(com.tsf.shell.manager.c.a.a.b bVar) {
        int i;
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"version", "display_name", "photo_id"}, "contact_id= ?", new String[]{String.valueOf(bVar.b)}, null);
        if (!query.moveToFirst() || bVar.e == (i = query.getInt(0))) {
            return false;
        }
        String string = query.getString(1);
        String string2 = query.getString(2);
        bVar.c = string;
        bVar.d = string2;
        bVar.e = i;
        bVar.i();
        return true;
    }

    public static void a(Context context, com.tsf.shell.manager.c.a.a.b bVar) {
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(bVar.b)}, null);
        if (query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data2");
            while (!query.isAfterLast()) {
                bVar.c(query.getString(columnIndex), ContactsContract.CommonDataKinds.Phone.getTypeLabel(context.getResources(), query.getInt(columnIndex2), "Custom").toString());
                query.moveToNext();
            }
        }
        query.close();
    }

    public static void b(Context context, com.tsf.shell.manager.c.a.a.b bVar) {
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[]{"data1", "data2"}, "contact_id= ?", new String[]{String.valueOf(bVar.b)}, null);
        if (query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data2");
            while (!query.isAfterLast()) {
                bVar.b(query.getString(columnIndex), ContactsContract.CommonDataKinds.Email.getTypeLabel(context.getResources(), query.getInt(columnIndex2), "Custom").toString());
                query.moveToNext();
            }
        }
        query.close();
    }

    public static com.tsf.shell.manager.c.a.a.b a(String str) {
        Cursor cursor;
        Cursor cursor2;
        try {
            cursor = com.censivn.C3DEngine.a.d().getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"_id", "display_name", "photo_id"}, null, null, null);
        } catch (Exception e) {
            cursor2 = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
        } catch (Exception e2) {
            cursor2 = cursor;
            if (cursor2 != null) {
                try {
                    cursor2.close();
                } catch (Exception e3) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e4) {
                }
            }
            throw th;
        }
        if (cursor.getCount() <= 0 || !cursor.moveToFirst()) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e5) {
                }
            }
            return null;
        }
        com.tsf.shell.manager.c.a.a.b a = c.a();
        String string = cursor.getString(0);
        String string2 = cursor.getString(1);
        String string3 = cursor.getString(2);
        a.b = string;
        a.c = string2;
        a.d = string3;
        if (cursor == null) {
            return a;
        }
        try {
            cursor.close();
            return a;
        } catch (Exception e6) {
            return a;
        }
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

    private static boolean b(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.tsf.shell.manager.c.a.a.a) it.next()).b.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
