package com.tsf.shell.manager.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.C3345g;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.action.a */
/* loaded from: classes.dex */
public class C3385a {
    /* renamed from: a */
    public static void m2672a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
        contentValues.put("action", Integer.valueOf(i));
        contentValues.put("name", str);
        contentValues.put("intent", str2);
        Cursor query = contentResolver.query(C3345g.C3346a.f11066a, new String[]{"action", "_id"}, "action=" + i, null, "_id desc");
        if (query.moveToFirst()) {
            contentResolver.update(C3345g.C3346a.m2783a(query.getInt(query.getColumnIndex("_id"))), contentValues, null, null);
        } else {
            contentResolver.insert(C3345g.C3346a.f11066a, contentValues);
        }
        query.close();
    }

    /* renamed from: a */
    public static C3397e m2673a(int i) {
        C3397e c3397e;
        try {
            Cursor query = C0853a.m10856d().getContentResolver().query(C3345g.C3346a.f11066a, new String[]{"action", "name", "intent"}, "action=" + i, null, "_id desc");
            if (query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("name"));
                String string2 = query.getString(query.getColumnIndex("intent"));
                query.close();
                c3397e = new C3397e(i, string, string2);
            } else {
                query.close();
                c3397e = new C3397e(i, C4189x.m588c(C1306b.C1315i.none), "");
            }
            return c3397e;
        } catch (Exception e) {
            return new C3397e(i, C4189x.m588c(C1306b.C1315i.none), "");
        }
    }
}
