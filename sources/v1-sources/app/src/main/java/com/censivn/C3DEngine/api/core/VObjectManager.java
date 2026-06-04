package com.censivn.C3DEngine.api.core;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class VObjectManager {
    private int appWidgetId;
    private int count;
    private ArrayList mObjectList;

    public VObjectManager() {
        this.count = 0;
    }

    public VObjectManager(int i) {
        this.count = 0;
        this.appWidgetId = i;
        this.mObjectList = new ArrayList();
    }

    public void addObject(VObject3d vObject3d) {
        if (!this.mObjectList.contains(vObject3d)) {
            this.count++;
            String str = "widget:" + this.appWidgetId + " create object ,total object:" + this.count;
            this.mObjectList.add(vObject3d);
            return;
        }
        String str2 = "widget:" + this.appWidgetId + " create object error,this object already exists";
    }

    public void removeObject(VObject3d vObject3d) {
        if (this.mObjectList.contains(vObject3d)) {
            this.count--;
            String str = "widget:" + this.appWidgetId + " remove object ,total object:" + this.count;
            this.mObjectList.remove(vObject3d);
            return;
        }
        String str2 = "widget:" + this.appWidgetId + " remove object error,this object is not exists";
    }

    public void destroy() {
        com.censivn.C3DEngine.a.a().c(new b(this));
    }
}
