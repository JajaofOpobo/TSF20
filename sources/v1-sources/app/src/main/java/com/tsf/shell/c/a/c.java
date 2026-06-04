package com.tsf.shell.c.a;

import android.content.Context;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.s;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public final class c {
    private b[] a;
    private ArrayList b;
    private boolean c = false;

    public final b[] a(Context context) {
        if (this.a != null) {
            return null;
        }
        this.a = b(context);
        this.b = new ArrayList();
        this.c = true;
        return this.a;
    }

    public final s a(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.a.equals(str)) {
                return sVar;
            }
        }
        return null;
    }

    public final ArrayList a() {
        return this.b;
    }

    public final void a(s sVar) {
        this.b.add(sVar);
    }

    public final s b(String str) {
        if (!this.c) {
            return null;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.a.equals(str)) {
                return sVar;
            }
        }
        return null;
    }

    public final int c(String str) {
        int i = -1;
        if (this.c) {
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s sVar = (s) it.next();
                if (sVar.a.equals(str)) {
                    switch (sVar.i) {
                        case 0:
                            i = bf.l().c().a(sVar.d);
                            break;
                        case 1:
                            i = bf.l().d().a(sVar.d);
                            break;
                    }
                    sVar.d();
                    this.b.remove(sVar);
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static b[] b(Context context) {
        InputStream inputStream;
        String attribute;
        try {
            String[] list = context.getAssets().list("push/widget");
            b[] bVarArr = new b[list.length];
            String language = Locale.getDefault().getLanguage();
            String country = context.getResources().getConfiguration().locale.getCountry();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= list.length) {
                    return bVarArr;
                }
                b bVar = new b();
                InputStream inputStream2 = null;
                try {
                    inputStream = context.getAssets().open("push/widget/" + list[i2] + "/description.xml");
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                }
                try {
                    Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
                    Element element = (Element) documentElement.getElementsByTagName("widget").item(0);
                    bVar.a = element.getAttribute("versionCode");
                    bVar.b = element.getAttribute("icon");
                    bVar.c = element.getAttribute("cover");
                    bVar.d = element.getAttribute("category");
                    bVar.f = list[i2];
                    NodeList elementsByTagName = documentElement.getElementsByTagName("appname");
                    if (elementsByTagName.getLength() > 0) {
                        Element element2 = (Element) elementsByTagName.item(0);
                        String str = "";
                        NodeList elementsByTagName2 = element2.getElementsByTagName(language);
                        int length = elementsByTagName2.getLength();
                        if (length > 0) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    attribute = str;
                                    break;
                                }
                                Element element3 = (Element) elementsByTagName2.item(i3);
                                String attribute2 = element3.getAttribute("r");
                                if (country.equals(attribute2)) {
                                    attribute = element3.getAttribute("name");
                                    break;
                                }
                                if (attribute2.equals("")) {
                                    str = element3.getAttribute("name");
                                }
                                String attribute3 = (i3 == length + (-1) && str.equals("")) ? element3.getAttribute("name") : str;
                                i3++;
                                str = attribute3;
                            }
                        } else {
                            attribute = ((Element) element2.getElementsByTagName("default").item(0)).getAttribute("name");
                        }
                        bVar.e = attribute;
                    }
                    bVarArr[i2] = bVar;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    inputStream2 = inputStream;
                    try {
                        e.printStackTrace();
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e4) {
                            }
                        }
                        i = i2 + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e5) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (inputStream != null) {
                    }
                    throw th;
                }
                i = i2 + 1;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
