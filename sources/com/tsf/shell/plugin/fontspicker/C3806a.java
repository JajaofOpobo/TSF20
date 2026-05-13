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
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.plugin.fontspicker.a */
/* loaded from: classes.dex */
public class C3806a extends BaseAdapter {

    /* renamed from: a */
    private Context f12535a;

    /* renamed from: c */
    private C3811d f12537c;

    /* renamed from: b */
    private ArrayList<C3807a> f12536b = new ArrayList<>();

    /* renamed from: d */
    private int f12538d = -1;

    public C3806a(Context context) {
        this.f12535a = context;
        this.f12537c = new C3811d(context);
        m1399a();
    }

    /* renamed from: a */
    public void m1399a() {
        Context context;
        this.f12536b = new ArrayList<>();
        Cursor m1386a = C3809c.m1389a(this.f12535a).m1386a(C3808b.f12545d, null, C3808b.f12544c + "=?", new String[]{this.f12535a.getPackageName()}, null);
        if (m1386a != null) {
            C3851e.m1317b("Size:" + m1386a.getCount());
            int columnIndex = m1386a.getColumnIndex(C3808b.f12544c);
            int columnIndex2 = m1386a.getColumnIndex(C3808b.f12542a);
            int columnIndex3 = m1386a.getColumnIndex(C3808b.f12543b);
            while (m1386a.moveToNext()) {
                this.f12536b.add(new C3807a(m1386a.getString(columnIndex), m1386a.getString(columnIndex2), m1386a.getString(columnIndex3)));
            }
            m1386a.close();
            C3809c.m1389a(this.f12535a).m1385b();
        }
        Cursor m1386a2 = C3809c.m1389a(this.f12535a).m1386a(C3808b.f12545d, null, C3808b.f12544c + "!=?", new String[]{this.f12535a.getPackageName()}, null);
        if (m1386a2 != null) {
            C3851e.m1315c("", "Size:" + m1386a2.getCount());
            int columnIndex4 = m1386a2.getColumnIndex(C3808b.f12544c);
            int columnIndex5 = m1386a2.getColumnIndex(C3808b.f12542a);
            int columnIndex6 = m1386a2.getColumnIndex(C3808b.f12543b);
            while (m1386a2.moveToNext()) {
                C3807a c3807a = new C3807a(m1386a2.getString(columnIndex4), m1386a2.getString(columnIndex5), m1386a2.getString(columnIndex6));
                if (c3807a.f12540b.equals("external")) {
                    if (new File(c3807a.f12541c).exists()) {
                        this.f12536b.add(c3807a);
                    } else {
                        C3851e.m1317b("fonts is miss delete " + C3809c.m1389a(this.f12535a).m1387a(C3808b.f12545d, "_id=" + m1386a2.getInt(m1386a2.getColumnIndex("_id")), null));
                    }
                } else if (c3807a.f12540b.equals("package")) {
                    try {
                        context = this.f12535a.createPackageContext(c3807a.f12539a, 2);
                    } catch (PackageManager.NameNotFoundException e) {
                        C3851e.m1315c("", e.getMessage());
                        context = null;
                    }
                    if (context != null) {
                        this.f12536b.add(c3807a);
                    } else {
                        C3851e.m1317b("fonts is miss delete " + C3809c.m1389a(this.f12535a).m1387a(C3808b.f12545d, "_id=" + m1386a2.getInt(m1386a2.getColumnIndex("_id")), null));
                    }
                } else {
                    this.f12536b.add(c3807a);
                }
            }
            m1386a2.close();
            C3809c.m1389a(this.f12535a).m1385b();
        }
    }

    /* renamed from: a */
    public C3807a m1398a(int i) {
        return this.f12536b.get(i - 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f12536b.size() + 1;
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
            view = LayoutInflater.from(this.f12535a).inflate(C3852f.C3860h.fonts_list_item_radio, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(C3852f.C3858f.textView1);
        if (i == 0) {
            textView.setText("Default");
            textView.setTag(null);
            textView.setTypeface(Typeface.DEFAULT);
        } else {
            C3807a c3807a = this.f12536b.get(i - 1);
            this.f12537c.m1383a(c3807a, textView);
            textView.setText(c3807a.m1393b(this.f12535a));
        }
        return view;
    }

    /* renamed from: a */
    public void m1397a(ListView listView, View view, int i) {
    }

    /* renamed from: com.tsf.shell.plugin.fontspicker.a$a */
    /* loaded from: classes.dex */
    public static class C3807a {

        /* renamed from: a */
        public String f12539a;

        /* renamed from: b */
        public String f12540b;

        /* renamed from: c */
        public String f12541c;

        public C3807a(String str, String str2, String str3) {
            this.f12539a = str;
            this.f12540b = str2;
            this.f12541c = str3;
        }

        /* renamed from: a */
        public Typeface m1396a(Context context) {
            if (this.f12540b.equals("package")) {
                Context m1391d = m1391d(context);
                if (m1391d != null) {
                    try {
                        return Typeface.createFromAsset(m1391d.getAssets(), this.f12541c);
                    } catch (Exception e) {
                        C3851e.m1315c("", e.getMessage());
                        return null;
                    }
                }
                return null;
            } else if (this.f12540b.equals("default")) {
                return null;
            } else {
                try {
                    return Typeface.createFromFile(this.f12541c);
                } catch (Exception e2) {
                    return null;
                }
            }
        }

        /* renamed from: b */
        public String m1393b(Context context) {
            String str;
            Context m1391d;
            String substring = this.f12541c.substring(this.f12541c.lastIndexOf("/") + 1, this.f12541c.lastIndexOf("."));
            if (this.f12540b.equals("package")) {
                if (m1391d(context) != null) {
                    str = " [" + m1391d.getApplicationInfo().loadLabel(context.getPackageManager()).toString() + "]";
                } else {
                    str = " []";
                }
            } else {
                str = " [" + this.f12540b + "]";
            }
            return substring + str;
        }

        /* renamed from: d */
        private Context m1391d(Context context) {
            try {
                return context.createPackageContext(this.f12539a, 2);
            } catch (PackageManager.NameNotFoundException e) {
                C3851e.m1315c("", e.getMessage());
                return null;
            }
        }

        /* renamed from: c */
        public void m1392c(Context context) {
            File file = new File(context.getCacheDir().getPath() + "/fonts");
            if (!file.exists()) {
                file.mkdir();
            }
            String str = file.getPath() + "/select.ttf";
            if (this.f12540b.equals("package")) {
                Context m1391d = m1391d(context);
                if (m1391d != null) {
                    try {
                        m1395a(m1391d.getAssets().open(this.f12541c), str);
                    } catch (Exception e) {
                        C3851e.m1315c("", e.getMessage());
                    }
                }
            } else if (this.f12540b.equals("default")) {
                File file2 = new File(str);
                if (file2.exists()) {
                    file2.delete();
                }
            } else {
                try {
                    m1395a(m1394a(this.f12541c), str);
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public static InputStream m1394a(String str) {
            return new BufferedInputStream(new FileInputStream(new File(str)));
        }

        /* renamed from: a */
        public static void m1395a(InputStream inputStream, String str) {
            FileOutputStream fileOutputStream;
            byte[] bArr = new byte[1024];
            try {
                fileOutputStream = new FileOutputStream(str, false);
                while (true) {
                    try {
                        try {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
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
