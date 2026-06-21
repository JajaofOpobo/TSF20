package com.tsf.shell.manager.bind;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.tsf.shell.ShellProvider;
import com.tsf.shell.m;
import com.tsf.shell.u;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {
    public static byte[] a(ItemInfo itemInfo) {
        byte[] bArr;
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(u.a(itemInfo.id, false), null, null, null, null);
        try {
            query.moveToNext();
            bArr = query.getBlob(query.getColumnIndexOrThrow("icon"));
            try {
                query.close();
            } catch (Exception e) {
                query.close();
                return bArr;
            }
        } catch (Exception e2) {
            bArr = null;
        }
        return bArr;
    }

    public static void a(ItemInfo itemInfo, m mVar, SQLiteDatabase sQLiteDatabase) {
        if (itemInfo.id == -1) {
            ContentValues contentValues = new ContentValues();
            itemInfo.id = mVar.a();
            contentValues.put("_id", Integer.valueOf(itemInfo.id));
            itemInfo.onAddToDatabase(contentValues);
            sQLiteDatabase.insert("favorites", null, contentValues);
            contentValues.clear();
        }
    }

    public static void a(final ContentValues contentValues, final ItemInfo itemInfo, final Runnable runnable) {
        final boolean z = itemInfo.id == -1;
        if (z) {
            itemInfo.id = ShellProvider.a().b();
            contentValues.put("_id", Integer.valueOf(itemInfo.id));
            itemInfo.onAddToDatabase(contentValues);
        }
        ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.d.1
            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                HashMap hashMap;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                ArrayList arrayList7;
                HashMap hashMap2;
                ArrayList arrayList8;
                ArrayList arrayList9;
                ArrayList arrayList10;
                ArrayList arrayList11;
                obj = ShellModel.f;
                synchronized (obj) {
                    ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                    if (z) {
                        contentResolver.insert(u.a, contentValues);
                        hashMap = ShellModel.g;
                        hashMap.put(Integer.valueOf(itemInfo.id), itemInfo);
                        switch (itemInfo.itemType) {
                            case 1:
                                hashMap2 = ShellModel.h;
                                hashMap2.put(Integer.valueOf(itemInfo.id), (LauncherFolder3DInfo) itemInfo);
                                switch (itemInfo.container) {
                                    case -5:
                                        arrayList11 = ShellModel.n;
                                        arrayList11.add(itemInfo);
                                        break;
                                    case -4:
                                        arrayList8 = ShellModel.m;
                                        arrayList8.add(itemInfo);
                                        break;
                                    case -3:
                                        arrayList9 = ShellModel.k;
                                        arrayList9.add(itemInfo);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        arrayList10 = ShellModel.i;
                                        arrayList10.add(itemInfo);
                                        break;
                                }
                            case 2:
                            case 7:
                                switch (itemInfo.container) {
                                    case -5:
                                        arrayList7 = ShellModel.n;
                                        arrayList7.add(itemInfo);
                                        break;
                                    case -4:
                                        arrayList4 = ShellModel.m;
                                        arrayList4.add(itemInfo);
                                        break;
                                    case -3:
                                        arrayList5 = ShellModel.k;
                                        arrayList5.add(itemInfo);
                                        break;
                                    case -2:
                                        arrayList3 = ShellModel.l;
                                        arrayList3.add(itemInfo);
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        arrayList6 = ShellModel.i;
                                        arrayList6.add(itemInfo);
                                        break;
                                }
                            case 3:
                                arrayList2 = ShellModel.j;
                                arrayList2.add((LauncherAppWidgetInfo) itemInfo);
                                break;
                            case 5:
                                arrayList = ShellModel.i;
                                arrayList.add(itemInfo);
                                break;
                        }
                        ShellModel.a("insert");
                    } else {
                        contentResolver.update(u.a(itemInfo.id, false), contentValues, null, null);
                    }
                    contentValues.clear();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
    }

    public static void b(final ItemInfo itemInfo) {
        ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.d.2
            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                ArrayList arrayList7;
                HashMap hashMap;
                ArrayList arrayList8;
                ArrayList arrayList9;
                ArrayList arrayList10;
                ArrayList arrayList11;
                HashMap hashMap2;
                ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                contentResolver.delete(u.a(ItemInfo.this.id, false), null, null);
                obj = ShellModel.f;
                synchronized (obj) {
                    switch (ItemInfo.this.itemType) {
                        case 1:
                            contentResolver.delete(u.a, "container=" + ItemInfo.this.id, null);
                            hashMap = ShellModel.h;
                            hashMap.remove(Integer.valueOf(ItemInfo.this.id));
                            switch (ItemInfo.this.container) {
                                case -5:
                                    arrayList11 = ShellModel.n;
                                    arrayList11.remove(ItemInfo.this);
                                    break;
                                case -4:
                                    arrayList8 = ShellModel.m;
                                    arrayList8.remove(ItemInfo.this);
                                    break;
                                case -3:
                                    arrayList9 = ShellModel.k;
                                    arrayList9.remove(ItemInfo.this);
                                    break;
                                case ItemInfo.NO_ID /* -1 */:
                                    arrayList10 = ShellModel.i;
                                    arrayList10.remove(ItemInfo.this);
                                    break;
                            }
                        case 2:
                        case 7:
                            switch (ItemInfo.this.container) {
                                case -5:
                                    arrayList6 = ShellModel.n;
                                    arrayList6.remove(ItemInfo.this);
                                    break;
                                case -4:
                                    arrayList3 = ShellModel.m;
                                    arrayList3.remove(ItemInfo.this);
                                    break;
                                case -3:
                                    arrayList4 = ShellModel.k;
                                    arrayList4.remove(ItemInfo.this);
                                    break;
                                case -2:
                                    arrayList2 = ShellModel.l;
                                    arrayList2.remove(ItemInfo.this);
                                    break;
                                case ItemInfo.NO_ID /* -1 */:
                                    arrayList5 = ShellModel.i;
                                    arrayList5.remove(ItemInfo.this);
                                    break;
                            }
                        case 3:
                            arrayList = ShellModel.j;
                            arrayList.remove((LauncherAppWidgetInfo) ItemInfo.this);
                            break;
                        case 5:
                            arrayList7 = ShellModel.i;
                            arrayList7.remove(ItemInfo.this);
                            break;
                    }
                    hashMap2 = ShellModel.g;
                    hashMap2.remove(Integer.valueOf(ItemInfo.this.id));
                    ItemInfo.this.unbind();
                    ShellModel.a("delete");
                }
            }
        });
    }

    public static void a(final ItemInfo itemInfo, final int i, final int i2) {
        ShellModel.b.post(new Runnable() { // from class: com.tsf.shell.manager.bind.d.3
            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                ArrayList arrayList10;
                ArrayList arrayList11;
                ArrayList arrayList12;
                ArrayList arrayList13;
                ArrayList arrayList14;
                ArrayList arrayList15;
                ArrayList arrayList16;
                obj = ShellModel.f;
                synchronized (obj) {
                    if (i == -1) {
                        arrayList16 = ShellModel.i;
                        arrayList16.remove(itemInfo);
                    } else if (i == -3) {
                        arrayList4 = ShellModel.k;
                        arrayList4.remove(itemInfo);
                    } else if (i == -2) {
                        arrayList3 = ShellModel.l;
                        arrayList3.remove(itemInfo);
                    } else if (i == -4) {
                        arrayList2 = ShellModel.m;
                        arrayList2.remove(itemInfo);
                    } else if (i == -5) {
                        arrayList = ShellModel.n;
                        arrayList.remove(itemInfo);
                    }
                    if (i2 == -1) {
                        arrayList13 = ShellModel.i;
                        arrayList14 = ShellModel.i;
                        if (!arrayList13.contains(arrayList14)) {
                            arrayList15 = ShellModel.i;
                            arrayList15.add(itemInfo);
                        }
                    } else if (i2 == -3) {
                        arrayList11 = ShellModel.k;
                        if (!arrayList11.contains(itemInfo)) {
                            arrayList12 = ShellModel.k;
                            arrayList12.add(itemInfo);
                        }
                    } else if (i2 == -4) {
                        arrayList9 = ShellModel.m;
                        if (!arrayList9.contains(itemInfo)) {
                            arrayList10 = ShellModel.m;
                            arrayList10.add(itemInfo);
                        }
                    } else if (i2 == -2) {
                        arrayList7 = ShellModel.l;
                        if (!arrayList7.contains(itemInfo)) {
                            arrayList8 = ShellModel.l;
                            arrayList8.add(itemInfo);
                        }
                    } else if (i2 == -5) {
                        arrayList5 = ShellModel.n;
                        if (!arrayList5.contains(itemInfo)) {
                            arrayList6 = ShellModel.n;
                            arrayList6.add(itemInfo);
                        }
                    }
                    ShellModel.a("changeContainer");
                }
            }
        });
    }
}
