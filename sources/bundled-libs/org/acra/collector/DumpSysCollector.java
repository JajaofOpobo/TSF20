package org.acra.collector;

import android.os.Process;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.acra.ACRA;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
final class DumpSysCollector {
    DumpSysCollector() {
    }

    public static String collectMemInfo() {
        BufferedReader bufferedReader;
        IOException e;
        StringBuilder sb = new StringBuilder();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("dumpsys");
            arrayList.add("meminfo");
            arrayList.add(Integer.toString(Process.myPid()));
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[arrayList.size()])).getInputStream()), ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                } catch (IOException e2) {
                    e = e2;
                    ACRA.log.e(ACRA.LOG_TAG, "DumpSysCollector.meminfo could not retrieve data", e);
                }
            }
        } catch (IOException e3) {
            bufferedReader = null;
            e = e3;
        }
        CollectorUtil.safeClose(bufferedReader);
        return sb.toString();
    }
}
