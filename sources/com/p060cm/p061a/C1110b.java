package com.p060cm.p061a;

import android.app.Application;
import com.ksmobile.launcher.cmbase.utils.C1300b;
import com.ksmobile.launcher.cmbase.utils.C1303d;
import com.ksmobile.p063a.p065b.C1283b;
import com.ksmobile.p063a.p065b.C1286e;
import com.ksmobile.p063a.p065b.C1293g;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import com.tsf.shell.ShellApplication;
import java.io.File;
import java.io.InputStream;
/* renamed from: com.cm.a.b */
/* loaded from: classes.dex */
public class C1110b extends AbstractC1130b {
    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public boolean mo9784a() {
        return true;
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: b */
    public Application mo9773b() {
        return (Application) ShellApplication.m6152a();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: c */
    public boolean mo9771c() {
        return C1121k.m9821a(ShellApplication.m6152a()).m9814b();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public void mo9774a(boolean z) {
        C1121k.m9821a(ShellApplication.m6152a()).m9815a(z);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: d */
    public long mo9769d() {
        return C1121k.m9821a(ShellApplication.m6152a()).m9809c();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public void mo9781a(long j) {
        C1121k.m9821a(ShellApplication.m6152a()).m9823a(j);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: e */
    public File mo9768e() {
        return C1116f.m9841a(ShellApplication.m6152a());
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public String mo9779a(File file) {
        return C1286e.m9117a(file);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public String mo9778a(InputStream inputStream) {
        return C1286e.m9116a(inputStream);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: b */
    public boolean mo9772b(boolean z) {
        return C1117g.m9839a(z);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: f */
    public String mo9767f() {
        return "kcmutil";
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: g */
    public String mo9766g() {
        return new C1118h("kcmutil").m9838a();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: h */
    public String mo9765h() {
        return new C1118h("kcmutil").m9836b();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: i */
    public boolean mo9764i() {
        return C1121k.m9821a(ShellApplication.m6152a()).m9807d();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public void mo9775a(String str, String str2) {
        C1121k.m9821a(ShellApplication.m6152a()).m9817a(str, str2);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public String mo9777a(String str) {
        return C1121k.m9821a(ShellApplication.m6152a()).m9820a(str);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: j */
    public void mo9763j() {
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: k */
    public boolean mo9762k() {
        return false;
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: c */
    public void mo9770c(boolean z) {
        C1121k.m9821a(ShellApplication.m6152a()).m9810b(z);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: l */
    public boolean mo9761l() {
        return C1121k.m9821a(ShellApplication.m6152a()).m9806e();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: m */
    public boolean mo9760m() {
        return false;
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: n */
    public double mo9759n() {
        return C1114d.m9847a();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: o */
    public String mo9758o() {
        return C1300b.m9052b(ShellApplication.m6152a());
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: p */
    public String mo9757p() {
        return C1300b.m9055a(ShellApplication.m6152a());
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public boolean mo9776a(String str, File file, boolean z) {
        return false;
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public int mo9783a(int i) {
        return C1114d.m9846a(i);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: a */
    public int mo9782a(int i, int i2) {
        return C1114d.m9845a(i, i2);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: q */
    public boolean mo9756q() {
        return C1303d.m9047a().m9045b();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: r */
    public String mo9755r() {
        return C1300b.m9056a();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: s */
    public int mo9754s() {
        return C1114d.m9844b();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: t */
    public int mo9753t() {
        return C1115e.m9843a();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: u */
    public int mo9752u() {
        return C1115e.m9842b();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: v */
    public boolean mo9751v() {
        return false;
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: w */
    public String mo9750w() {
        return C1300b.m9051c();
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: x */
    public String mo9749x() {
        return String.valueOf(C1293g.m9093a() / 1024);
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: y */
    public int mo9748y() {
        return C1283b.m9122a(ShellApplication.m6152a());
    }

    @Override // com.p060cm.kinfoc.p062a.AbstractC1130b
    /* renamed from: z */
    public int mo9747z() {
        return C1121k.m9821a(ShellApplication.m6152a()).m9805f();
    }
}
