package com.tsf.shell.widget.alarm.d;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements Serializable {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] a() {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(this);
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable th) {
                th = th;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
            if (objectOutputStream != null) {
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable th;
        Object obj = null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    obj = objectInputStream.readObject();
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e) {
                        }
                    }
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    return obj;
                }
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e6) {
                    }
                }
                if (objectInputStream == null) {
                    try {
                        objectInputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            objectInputStream = null;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
            if (byteArrayInputStream != null) {
            }
            if (objectInputStream == null) {
            }
        }
        return obj;
    }
}
