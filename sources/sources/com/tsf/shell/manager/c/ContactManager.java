package com.tsf.shell.manager.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ContactManager {
    private ContactDatabaseHelper a;

    public ContactManager() {
        System.currentTimeMillis();
        this.a = new ContactDatabaseHelper(com.censivn.C3DEngine.A.d());
    }

    public void a() {
        com.tsf.shell.manager.app.ServiceFactory.a().w();
    }

    public ContactDatabaseHelper b() {
        return this.a;
    }
}
