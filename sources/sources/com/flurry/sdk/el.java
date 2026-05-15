package com.flurry.sdk;

import com.flurry.sdk.en;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class el<RequestObjectType, ResponseObjectType> extends en {
    private a<RequestObjectType, ResponseObjectType> a;
    private RequestObjectType b;
    private ResponseObjectType c;
    private ex<RequestObjectType> d;
    private ex<ResponseObjectType> e;

    public interface a<RequestObjectType, ResponseObjectType> {
        void a(el<RequestObjectType, ResponseObjectType> elVar, ResponseObjectType responseobjecttype);
    }

    public void a(RequestObjectType requestobjecttype) {
        this.b = requestobjecttype;
    }

    public void a(ex<RequestObjectType> exVar) {
        this.d = exVar;
    }

    public void b(ex<ResponseObjectType> exVar) {
        this.e = exVar;
    }

    public void a(a<RequestObjectType, ResponseObjectType> aVar) {
        this.a = aVar;
    }

    @Override // com.flurry.sdk.en, com.flurry.sdk.ff
    public void a() {
        m();
        super.a();
    }

    private void m() {
        a(new en.c() { // from class: com.flurry.sdk.el.1
            @Override // com.flurry.sdk.en.c
            public void a(en enVar, OutputStream outputStream) {
                if (el.this.b != null && el.this.d != null) {
                    el.this.d.a(outputStream, el.this.b);
                }
            }

            @Override // com.flurry.sdk.en.c
            public void a(en enVar, InputStream inputStream) {
                if (enVar.d() && el.this.e != null) {
                    el.this.c = el.this.e.a(inputStream);
                }
            }

            @Override // com.flurry.sdk.en.c
            public void a(en enVar) {
                el.this.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.a != null && !b()) {
            this.a.a(this, this.c);
        }
    }
}
