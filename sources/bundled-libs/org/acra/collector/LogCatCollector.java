package org.acra.collector;

import android.os.Process;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.util.BoundedLinkedList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class LogCatCollector {
    private static final int DEFAULT_TAIL_COUNT = 100;

    LogCatCollector() {
    }

    public static String collectLogCat(String str) throws Throwable {
        int i;
        BufferedReader bufferedReader;
        final Process processExec;
        BufferedReader bufferedReader2 = null;
        int iMyPid = Process.myPid();
        String str2 = (!ACRA.getConfig().logcatFilterByPid() || iMyPid <= 0) ? null : String.valueOf(Integer.toString(iMyPid)) + "):";
        ArrayList arrayList = new ArrayList();
        arrayList.add("logcat");
        if (str != null) {
            arrayList.add("-b");
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(ACRA.getConfig().logcatArguments()));
        int iIndexOf = arrayList2.indexOf("-t");
        if (iIndexOf <= -1 || iIndexOf >= arrayList2.size()) {
            i = -1;
        } else {
            i = Integer.parseInt((String) arrayList2.get(iIndexOf + 1));
            if (Compatibility.getAPILevel() < 8) {
                arrayList2.remove(iIndexOf + 1);
                arrayList2.remove(iIndexOf);
                arrayList2.add("-d");
            }
        }
        if (i <= 0) {
            i = 100;
        }
        BoundedLinkedList boundedLinkedList = new BoundedLinkedList(i);
        arrayList.addAll(arrayList2);
        try {
            processExec = Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[arrayList.size()]));
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
        } catch (IOException e) {
            e = e;
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            ACRA.log.d(ACRA.LOG_TAG, "Retrieving logcat output...");
            new Thread(new Runnable() { // from class: org.acra.collector.LogCatCollector.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        do {
                        } while (processExec.getErrorStream().read(new byte[ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES]) >= 0);
                    } catch (IOException e2) {
                    }
                }
            }).start();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (str2 == null || line.contains(str2)) {
                    boundedLinkedList.add(String.valueOf(line) + "\n");
                }
            }
            CollectorUtil.safeClose(bufferedReader);
        } catch (IOException e2) {
            e = e2;
            bufferedReader2 = bufferedReader;
            try {
                ACRA.log.e(ACRA.LOG_TAG, "LogCatCollector.collectLogCat could not retrieve data.", e);
                CollectorUtil.safeClose(bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                CollectorUtil.safeClose(bufferedReader);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CollectorUtil.safeClose(bufferedReader);
            throw th;
        }
        return boundedLinkedList.toString();
    }
}
