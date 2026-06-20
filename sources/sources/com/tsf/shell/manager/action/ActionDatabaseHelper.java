package com.tsf.shell.manager.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.tsf.b;
import com.tsf.shell.ShellGraphicsContext;
import com.tsf.shell.manager.action.ActionModel;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ActionDatabaseHelper {
    public static void a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = com.censivn.C3DEngine.C3DEngine.d().getContentResolver();
        contentValues.put("action", Integer.valueOf(i));
        contentValues.put("name", str);
        contentValues.put("intent", str2);
        Cursor cursorQuery = contentResolver.query(g.a.a, new String[]{"action", "_id"}, "action=" + i, null, "_id desc");
        if (cursorQuery.moveToFirst()) {
            contentResolver.update(g.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))), contentValues, null, null);
        } else {
            contentResolver.insert(g.a.a, contentValues);
        }
        cursorQuery.close();
    }

    public static ActionModel a(int i) {
        ActionModel actionModel;
        try {
            Cursor cursorQuery = com.censivn.C3DEngine.C3DEngine.d().getContentResolver().query(g.a.a, new String[]{"action", "name", "intent"}, "action=" + i, null, "_id desc");
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("name"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("intent"));
                cursorQuery.close();
                actionModel = new ActionModel(i, string, string2);
            } else {
                cursorQuery.close();
                actionModel = new ActionModel(i, GraphicsEngineBridge.c(b.i.none), "");
            }
            return actionModel;
        } catch (Exception e) {
            return new ActionModel(i, GraphicsEngineBridge.c(b.i.none), "");
        }
    }
}
