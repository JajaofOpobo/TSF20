package com.tsf.shell.plugin.fontspicker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.f;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends BaseAdapter {
    private Context a;
    private d c;
    private ArrayList<C0152a> b = new ArrayList<>();
    private int d = -1;

    public a(Context context) {
        this.a = context;
        this.c = new d(context);
        a();
    }

    public void a() {
        Context contextCreatePackageContext;
        this.b = new ArrayList<>();
        Cursor cursorA = c.a(this.a).a(b.d, null, b.c + "=?", new String[]{this.a.getPackageName()}, null);
        if (cursorA != null) {
            e.b("Size:" + cursorA.getCount());
            int columnIndex = cursorA.getColumnIndex(b.c);
            int columnIndex2 = cursorA.getColumnIndex(b.a);
            int columnIndex3 = cursorA.getColumnIndex(b.b);
            while (cursorA.moveToNext()) {
                this.b.add(new C0152a(cursorA.getString(columnIndex), cursorA.getString(columnIndex2), cursorA.getString(columnIndex3)));
            }
            cursorA.close();
            c.a(this.a).b();
        }
        Cursor cursorA2 = c.a(this.a).a(b.d, null, b.c + "!=?", new String[]{this.a.getPackageName()}, null);
        if (cursorA2 != null) {
            e.c("", "Size:" + cursorA2.getCount());
            int columnIndex4 = cursorA2.getColumnIndex(b.c);
            int columnIndex5 = cursorA2.getColumnIndex(b.a);
            int columnIndex6 = cursorA2.getColumnIndex(b.b);
            while (cursorA2.moveToNext()) {
                C0152a c0152a = new C0152a(cursorA2.getString(columnIndex4), cursorA2.getString(columnIndex5), cursorA2.getString(columnIndex6));
                if (c0152a.b.equals("external")) {
                    if (new File(c0152a.c).exists()) {
                        this.b.add(c0152a);
                    } else {
                        e.b("fonts is miss delete " + c.a(this.a).a(b.d, "_id=" + cursorA2.getInt(cursorA2.getColumnIndex("_id")), null));
                    }
                } else if (c0152a.b.equals("package")) {
                    try {
                        contextCreatePackageContext = this.a.createPackageContext(c0152a.a, 2);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.c("", e.getMessage());
                        contextCreatePackageContext = null;
                    }
                    if (contextCreatePackageContext != null) {
                        this.b.add(c0152a);
                    } else {
                        e.b("fonts is miss delete " + c.a(this.a).a(b.d, "_id=" + cursorA2.getInt(cursorA2.getColumnIndex("_id")), null));
                    }
                } else {
                    this.b.add(c0152a);
                }
            }
            cursorA2.close();
            c.a(this.a).b();
        }
    }

    public C0152a a(int i) {
        return this.b.get(i - 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size() + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(f.h.fonts_list_item_radio, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(f.C0155f.textView1);
        if (i == 0) {
            textView.setText("Default");
            textView.setTag(null);
            textView.setTypeface(Typeface.DEFAULT);
        } else {
            C0152a c0152a = this.b.get(i - 1);
            this.c.a(c0152a, textView);
            textView.setText(c0152a.b(this.a));
        }
        return view;
    }

    public void a(ListView listView, View view, int i) {
    }

    /* JADX INFO: renamed from: com.tsf.shell.plugin.fontspicker.a$a, reason: collision with other inner class name */
    public static class C0152a {
        public String a;
        public String b;
        public String c;

        public C0152a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public Typeface a(Context context) {
            if (this.b.equals("package")) {
                Context contextD = d(context);
                if (contextD == null) {
                    return null;
                }
                try {
                    return Typeface.createFromAsset(contextD.getAssets(), this.c);
                } catch (Exception e) {
                    e.c("", e.getMessage());
                    return null;
                }
            }
            if (this.b.equals("default")) {
                return null;
            }
            try {
                return Typeface.createFromFile(this.c);
            } catch (Exception e2) {
                return null;
            }
        }

        public String b(Context context) {
            String str;
            String strSubstring = this.c.substring(this.c.lastIndexOf("/") + 1, this.c.lastIndexOf("."));
            if (this.b.equals("package")) {
                Context contextD = d(context);
                if (contextD != null) {
                    str = " [" + contextD.getApplicationInfo().loadLabel(context.getPackageManager()).toString() + "]";
                } else {
                    str = " []";
                }
            } else {
                str = " [" + this.b + "]";
            }
            return strSubstring + str;
        }

        private Context d(Context context) {
            try {
                return context.createPackageContext(this.a, 2);
            } catch (PackageManager.NameNotFoundException e) {
                e.c("", e.getMessage());
                return null;
            }
        }

        public void c(Context context) throws Throwable {
            File file = new File(context.getCacheDir().getPath() + "/fonts");
            if (!file.exists()) {
                file.mkdir();
            }
            String str = file.getPath() + "/select.ttf";
            if (this.b.equals("package")) {
                Context contextD = d(context);
                if (contextD != null) {
                    try {
                        a(contextD.getAssets().open(this.c), str);
                        return;
                    } catch (Exception e) {
                        e.c("", e.getMessage());
                        return;
                    }
                }
                return;
            }
            if (this.b.equals("default")) {
                File file2 = new File(str);
                if (file2.exists()) {
                    file2.delete();
                    return;
                }
                return;
            }
            try {
                a(a(this.c), str);
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }

        public static InputStream a(String str) {
            return new BufferedInputStream(new FileInputStream(new File(str)));
        }

        public static void a(InputStream inputStream, String str) throws Throwable {
            FileOutputStream fileOutputStream;
            byte[] bArr = new byte[1024];
            try {
                fileOutputStream = new FileOutputStream(str, false);
                while (true) {
                    try {
                        try {
                            int i = inputStream.read(bArr);
                            if (i > 0) {
                                fileOutputStream.write(bArr, 0, i);
                            } else {
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    inputStream.close();
                                    return;
                                } catch (IOException e) {
                                    throw e;
                                }
                            }
                        } catch (IOException e2) {
                            throw e2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStream.close();
                            throw th;
                        } catch (IOException e3) {
                            throw e3;
                        }
                    }
                }
            } catch (IOException e4) {
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        }
    }
}
