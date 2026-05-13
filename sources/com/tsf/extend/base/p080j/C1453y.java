package com.tsf.extend.base.p080j;

import android.content.ComponentName;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.extend.base.j.y */
/* loaded from: classes.dex */
public class C1453y {
    /* renamed from: a */
    public static List<String> m8570a(Context context, String str, String str2) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        InputStream inputStream2;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3 = null;
        try {
            inputStream = context.getAssets().open(str + "/" + str2);
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Exception e) {
                bufferedReader = null;
                inputStream2 = inputStream;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            bufferedReader = null;
            inputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    break;
                }
                String trim = readLine.trim();
                if (trim.length() > 0) {
                    arrayList.add(trim);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                }
            }
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                    return arrayList;
                } catch (Exception e4) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e5) {
            bufferedReader = bufferedReader2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception e6) {
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e7) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader3 = bufferedReader2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e8) {
                }
            }
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                } catch (Exception e9) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static List<C1454a> m8569b(Context context, String str, String str2) {
        String str3;
        String str4 = null;
        List<String> m8570a = m8570a(context, str, str2);
        if (m8570a != null) {
            ArrayList arrayList = new ArrayList();
            for (String str5 : m8570a) {
                if (str5 != null && !str5.startsWith("#")) {
                    if (str5.contains("category=")) {
                        str3 = str5.substring("category=".length()).trim();
                    } else {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str5);
                        if (unflattenFromString == null) {
                            arrayList.add(new C1454a(str4, str5));
                            str3 = str4;
                        } else {
                            arrayList.add(new C1454a(str4, unflattenFromString));
                        }
                    }
                    str4 = str3;
                }
                str3 = str4;
                str4 = str3;
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: com.tsf.extend.base.j.y$a */
    /* loaded from: classes.dex */
    public static class C1454a {

        /* renamed from: a */
        public String f4459a;

        /* renamed from: b */
        public ComponentName f4460b;

        /* renamed from: c */
        public String f4461c;

        public C1454a(String str, ComponentName componentName) {
            this.f4459a = null;
            this.f4460b = null;
            this.f4461c = null;
            this.f4459a = str;
            this.f4460b = componentName;
        }

        public C1454a(String str, String str2) {
            this.f4459a = null;
            this.f4460b = null;
            this.f4461c = null;
            this.f4459a = str;
            this.f4461c = str2;
        }

        /* renamed from: a */
        public boolean m8567a(String str) {
            return this.f4461c != null ? this.f4461c.equals(str) : this.f4460b.getPackageName().equals(str);
        }

        /* renamed from: a */
        public String m8568a() {
            String str = this.f4461c;
            if (str == null && this.f4460b != null) {
                return this.f4460b.getPackageName();
            }
            return str;
        }

        public boolean equals(Object obj) {
            return obj instanceof C1454a ? m8567a(((C1454a) obj).m8568a()) : super.equals(obj);
        }
    }
}
