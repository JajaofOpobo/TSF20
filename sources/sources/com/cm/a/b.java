package com.cm.a;

import android.app.Application;
import com.tsf.shell.ShellApplication;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.cm.kinfoc.a.b {
    @Override // com.cm.kinfoc.a.b
    public boolean a() {
        return true;
    }

    @Override // com.cm.kinfoc.a.b
    public Application b() {
        return (Application) ShellApplication.a();
    }

    @Override // com.cm.kinfoc.a.b
    public boolean c() {
        return k.a(ShellApplication.a()).b();
    }

    @Override // com.cm.kinfoc.a.b
    public void a(boolean z) {
        k.a(ShellApplication.a()).a(z);
    }

    @Override // com.cm.kinfoc.a.b
    public long d() {
        return k.a(ShellApplication.a()).c();
    }

    @Override // com.cm.kinfoc.a.b
    public void a(long j) {
        k.a(ShellApplication.a()).a(j);
    }

    @Override // com.cm.kinfoc.a.b
    public File e() {
        return f.a(ShellApplication.a());
    }

    @Override // com.cm.kinfoc.a.b
    public String a(File file) {
        return com.ksmobile.a.b.e.a(file);
    }

    @Override // com.cm.kinfoc.a.b
    public String a(InputStream inputStream) {
        return com.ksmobile.a.b.e.a(inputStream);
    }

    @Override // com.cm.kinfoc.a.b
    public boolean b(boolean z) {
        return g.a(z);
    }

    @Override // com.cm.kinfoc.a.b
    public String f() {
        return "kcmutil";
    }

    @Override // com.cm.kinfoc.a.b
    public String g() {
        return new h("kcmutil").a();
    }

    @Override // com.cm.kinfoc.a.b
    public String h() {
        return new h("kcmutil").b();
    }

    @Override // com.cm.kinfoc.a.b
    public boolean i() {
        return k.a(ShellApplication.a()).d();
    }

    @Override // com.cm.kinfoc.a.b
    public void a(String str, String str2) {
        k.a(ShellApplication.a()).a(str, str2);
    }

    @Override // com.cm.kinfoc.a.b
    public String a(String str) {
        return k.a(ShellApplication.a()).a(str);
    }

    @Override // com.cm.kinfoc.a.b
    public void j() {
    }

    @Override // com.cm.kinfoc.a.b
    public boolean k() {
        return false;
    }

    @Override // com.cm.kinfoc.a.b
    public void c(boolean z) {
        k.a(ShellApplication.a()).b(z);
    }

    @Override // com.cm.kinfoc.a.b
    public boolean l() {
        return k.a(ShellApplication.a()).e();
    }

    @Override // com.cm.kinfoc.a.b
    public boolean m() {
        return false;
    }

    @Override // com.cm.kinfoc.a.b
    public double n() {
        return d.a();
    }

    @Override // com.cm.kinfoc.a.b
    public String o() {
        return com.ksmobile.launcher.cmbase.utils.b.b(ShellApplication.a());
    }

    @Override // com.cm.kinfoc.a.b
    public String p() {
        return com.ksmobile.launcher.cmbase.utils.b.a(ShellApplication.a());
    }

    @Override // com.cm.kinfoc.a.b
    public boolean a(String str, File file, boolean z) {
        return false;
    }

    @Override // com.cm.kinfoc.a.b
    public int a(int i) {
        return d.a(i);
    }

    @Override // com.cm.kinfoc.a.b
    public int a(int i, int i2) {
        return d.a(i, i2);
    }

    @Override // com.cm.kinfoc.a.b
    public boolean q() {
        return com.ksmobile.launcher.cmbase.utils.d.a().b();
    }

    @Override // com.cm.kinfoc.a.b
    public String r() {
        return com.ksmobile.launcher.cmbase.utils.b.a();
    }

    @Override // com.cm.kinfoc.a.b
    public int s() {
        return d.b();
    }

    @Override // com.cm.kinfoc.a.b
    public int t() {
        return e.a();
    }

    @Override // com.cm.kinfoc.a.b
    public int u() {
        return e.b();
    }

    @Override // com.cm.kinfoc.a.b
    public boolean v() {
        return false;
    }

    @Override // com.cm.kinfoc.a.b
    public String w() {
        return com.ksmobile.launcher.cmbase.utils.b.c();
    }

    @Override // com.cm.kinfoc.a.b
    public String x() {
        return String.valueOf(com.ksmobile.a.b.g.a() / 1024);
    }

    @Override // com.cm.kinfoc.a.b
    public int y() {
        return com.ksmobile.a.b.b.a(ShellApplication.a());
    }

    @Override // com.cm.kinfoc.a.b
    public int z() {
        return k.a(ShellApplication.a()).f();
    }
}
