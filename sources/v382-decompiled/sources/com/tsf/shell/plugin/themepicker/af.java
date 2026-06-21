package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class af extends com.tsf.shell.plugin.themepicker.utils.a {
    private String a;
    private ae e;
    private Context f;

    public af(Context context, String str, ae aeVar) {
        this.a = str;
        this.e = aeVar;
        this.f = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    public List a(Void... voidArr) {
        InputStream inputStream;
        if (this.a != null) {
            try {
                inputStream = ac.a(this.a);
            } catch (IOException e) {
                e.printStackTrace();
                inputStream = null;
            }
        } else {
            inputStream = this.f.getResources().openRawResource(q.onlinetheme);
        }
        if (inputStream == null) {
            return null;
        }
        ab abVar = new ab();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, abVar);
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ParserConfigurationException e3) {
            e3.printStackTrace();
        } catch (SAXException e4) {
            e4.printStackTrace();
        }
        try {
            inputStream.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return abVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    public void a(List list) {
        this.e.a(list);
    }
}
