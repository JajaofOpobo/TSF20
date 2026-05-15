package com.censivn.C3DEngine.api.core;

import com.tsf.shell.b.a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VObjectManager {
    private int appWidgetId;
    private int count;
    private ArrayList<VObject3d> mObjectList;

    public VObjectManager() {
        this.count = 0;
    }

    public VObjectManager(int i) {
        this.count = 0;
        this.appWidgetId = i;
        this.mObjectList = new ArrayList<>();
    }

    public void addObject(VObject3d vObject3d) {
        if (!this.mObjectList.contains(vObject3d)) {
            this.count++;
            a.a("VObjectManager", "widget:" + this.appWidgetId + " create object ,total object:" + this.count);
            this.mObjectList.add(vObject3d);
            return;
        }
        a.a("VObjectManager", "widget:" + this.appWidgetId + " create object error,this object already exists");
    }

    public void removeObject(VObject3d vObject3d) {
        if (this.mObjectList.contains(vObject3d)) {
            this.count--;
            a.a("VObjectManager", "widget:" + this.appWidgetId + " remove object ,total object:" + this.count);
            this.mObjectList.remove(vObject3d);
            return;
        }
        a.a("VObjectManager", "widget:" + this.appWidgetId + " remove object error,this object is not exists");
    }

    public void destroy() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.api.core.VObjectManager.1
            @Override // java.lang.Runnable
            public void run() {
                a.a("VObjectManager", "widget:" + VObjectManager.this.appWidgetId + " destroy all object,total object:" + VObjectManager.this.count);
                Iterator it = VObjectManager.this.mObjectList.iterator();
                while (it.hasNext()) {
                    ((VObject3d) it.next()).destroy();
                }
                VObjectManager.this.mObjectList.clear();
            }
        });
    }
}
