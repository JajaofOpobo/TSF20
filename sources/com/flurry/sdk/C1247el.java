package com.flurry.sdk;

import com.flurry.sdk.C1251en;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: com.flurry.sdk.el */
/* loaded from: classes.dex */
public class C1247el<RequestObjectType, ResponseObjectType> extends C1251en {

    /* renamed from: a */
    private InterfaceC1249a<RequestObjectType, ResponseObjectType> f3982a;

    /* renamed from: b */
    private RequestObjectType f3983b;

    /* renamed from: c */
    private ResponseObjectType f3984c;

    /* renamed from: d */
    private InterfaceC1268ex<RequestObjectType> f3985d;

    /* renamed from: e */
    private InterfaceC1268ex<ResponseObjectType> f3986e;

    /* renamed from: com.flurry.sdk.el$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1249a<RequestObjectType, ResponseObjectType> {
        /* renamed from: a */
        void mo9266a(C1247el<RequestObjectType, ResponseObjectType> c1247el, ResponseObjectType responseobjecttype);
    }

    /* renamed from: a */
    public void m9273a(RequestObjectType requestobjecttype) {
        this.f3983b = requestobjecttype;
    }

    /* renamed from: a */
    public void m9274a(InterfaceC1268ex<RequestObjectType> interfaceC1268ex) {
        this.f3985d = interfaceC1268ex;
    }

    /* renamed from: b */
    public void m9271b(InterfaceC1268ex<ResponseObjectType> interfaceC1268ex) {
        this.f3986e = interfaceC1268ex;
    }

    /* renamed from: a */
    public void m9277a(InterfaceC1249a<RequestObjectType, ResponseObjectType> interfaceC1249a) {
        this.f3982a = interfaceC1249a;
    }

    @Override // com.flurry.sdk.C1251en, com.flurry.sdk.AbstractRunnableC1278ff
    /* renamed from: a */
    public void mo9140a() {
        m9268m();
        super.mo9140a();
    }

    /* renamed from: m */
    private void m9268m() {
        m9263a(new C1251en.InterfaceC1257c() { // from class: com.flurry.sdk.el.1
            @Override // com.flurry.sdk.C1251en.InterfaceC1257c
            /* renamed from: a */
            public void mo9237a(C1251en c1251en, OutputStream outputStream) {
                if (C1247el.this.f3983b != null && C1247el.this.f3985d != null) {
                    C1247el.this.f3985d.mo9195a(outputStream, C1247el.this.f3983b);
                }
            }

            @Override // com.flurry.sdk.C1251en.InterfaceC1257c
            /* renamed from: a */
            public void mo9238a(C1251en c1251en, InputStream inputStream) {
                if (c1251en.m9251d() && C1247el.this.f3986e != null) {
                    C1247el.this.f3984c = C1247el.this.f3986e.mo9196a(inputStream);
                }
            }

            @Override // com.flurry.sdk.C1251en.InterfaceC1257c
            /* renamed from: a */
            public void mo9239a(C1251en c1251en) {
                C1247el.this.m9267n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m9267n() {
        if (this.f3982a != null && !m9255b()) {
            this.f3982a.mo9266a(this, this.f3984c);
        }
    }
}
