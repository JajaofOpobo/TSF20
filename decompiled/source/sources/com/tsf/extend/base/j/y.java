package com.tsf.extend.base.j;

import android.content.ComponentName;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class y {
    public static List<String> a(Context context, String str, String str2) {
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

    public static List<a> b(Context context, String str, String str2) {
        String str3;
        String str4 = null;
        List<String> a2 = a(context, str, str2);
        if (a2 != null) {
            ArrayList arrayList = new ArrayList();
            for (String str5 : a2) {
                if (str5 != null && !str5.startsWith("#")) {
                    if (str5.contains("category=")) {
                        str3 = str5.substring("category=".length()).trim();
                    } else {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str5);
                        if (unflattenFromString == null) {
                            arrayList.add(new a(str4, str5));
                            str3 = str4;
                        } else {
                            arrayList.add(new a(str4, unflattenFromString));
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

    /* loaded from: classes.dex */
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
