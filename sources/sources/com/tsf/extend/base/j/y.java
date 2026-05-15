package com.tsf.extend.base.j;

import android.content.ComponentName;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class y {
    public static List<String> a(Context context, String str, String str2) throws Throwable {
        InputStream inputStreamOpen;
        BufferedReader bufferedReader;
        InputStream inputStream;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3 = null;
        try {
            inputStreamOpen = context.getAssets().open(str + "/" + str2);
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpen));
            } catch (Exception e) {
                bufferedReader = null;
                inputStream = inputStreamOpen;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            bufferedReader = null;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpen = null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    break;
                }
                String strTrim = line.trim();
                if (strTrim.length() > 0) {
                    arrayList.add(strTrim);
                }
            }
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Exception e3) {
                }
            }
            if (bufferedReader2 == null) {
                return arrayList;
            }
            try {
                bufferedReader2.close();
                return arrayList;
            } catch (Exception e4) {
                return arrayList;
            }
        } catch (Exception e5) {
            bufferedReader = bufferedReader2;
            inputStream = inputStreamOpen;
            if (inputStream != null) {
                try {
                    inputStream.close();
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
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Exception e8) {
                }
            }
            if (bufferedReader3 == null) {
                throw th;
            }
            try {
                bufferedReader3.close();
                throw th;
            } catch (Exception e9) {
                throw th;
            }
        }
    }

    public static List<a> b(Context context, String str, String str2) throws Throwable {
        String strTrim;
        String str3 = null;
        List<String> listA = a(context, str, str2);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : listA) {
            if (str4 == null || str4.startsWith("#")) {
                strTrim = str3;
            } else if (str4.contains("category=")) {
                strTrim = str4.substring("category=".length()).trim();
            } else {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str4);
                if (componentNameUnflattenFromString == null) {
                    arrayList.add(new a(str3, str4));
                    strTrim = str3;
                } else {
                    arrayList.add(new a(str3, componentNameUnflattenFromString));
                    strTrim = str3;
                }
            }
            str3 = strTrim;
        }
        return arrayList;
    }

    public static class a {
        public String a;
        public ComponentName b;
        public String c;

        public a(String str, ComponentName componentName) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.a = str;
            this.b = componentName;
        }

        public a(String str, String str2) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.a = str;
            this.c = str2;
        }

        public boolean a(String str) {
            return this.c != null ? this.c.equals(str) : this.b.getPackageName().equals(str);
        }

        public String a() {
            String str = this.c;
            if (str == null && this.b != null) {
                return this.b.getPackageName();
            }
            return str;
        }

        public boolean equals(Object obj) {
            return obj instanceof a ? a(((a) obj).a()) : super.equals(obj);
        }
    }
}
