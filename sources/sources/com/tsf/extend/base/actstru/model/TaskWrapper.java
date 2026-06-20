package com.tsf.extend.base.actstru.model;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TaskWrapper<T> extends Task {
    protected T a;
    protected TaskHandler<T> b;

    public TaskWrapper(T t, TaskHandler<T> gVar) {
        this.a = null;
        this.b = null;
        this.a = t;
        this.b = gVar;
    }

    @Override // com.tsf.extend.base.actstru.model.Task
    public EventData a() {
        return this.b.a(this.a);
    }
}
