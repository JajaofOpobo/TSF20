package org.acra.util;

import android.net.SSLCertificateSocketFactory;
import android.text.TextUtils;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.acra.ACRA;
import org.acra.collector.Compatibility;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.params.HttpParams;
/* loaded from: classes.dex */
public class TlsSniSocketFactory implements LayeredSocketFactory {
    private final SSLCertificateSocketFactory sslSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
    private static final String TAG = TlsSniSocketFactory.class.getSimpleName();
    private static final HostnameVerifier hostnameVerifier = new BrowserCompatHostnameVerifier();
    private static final List<String> ALLOWED_CIPHERS = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        return null;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return null;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public boolean isSecure(Socket socket) {
        return (socket instanceof SSLSocket) && socket.isConnected();
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        if (z) {
            socket.close();
        }
        SSLSocket sSLSocket = (SSLSocket) this.sslSocketFactory.createSocket(InetAddress.getByName(str), i);
        establishAndVerify(sSLSocket, str);
        return sSLSocket;
    }

    private void establishAndVerify(SSLSocket sSLSocket, String str) {
        setTlsParameters(sSLSocket);
        setSniHostname(sSLSocket, str);
        sSLSocket.startHandshake();
        SSLSession session = sSLSocket.getSession();
        if (!hostnameVerifier.verify(str, session)) {
            throw new SSLPeerUnverifiedException(str);
        }
        ACRA.log.i(TAG, "Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
    }

    private void setTlsParameters(SSLSocket sSLSocket) {
        String[] supportedProtocols;
        LinkedList linkedList = new LinkedList();
        for (String str : sSLSocket.getSupportedProtocols()) {
            if (!str.toUpperCase().contains("SSL")) {
                linkedList.add(str);
            }
        }
        ACRA.log.v(TAG, "Setting allowed TLS protocols: " + TextUtils.join(", ", linkedList));
        sSLSocket.setEnabledProtocols((String[]) linkedList.toArray(new String[linkedList.size()]));
        if (Compatibility.getAPILevel() < 21) {
            List asList = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            HashSet hashSet = new HashSet(ALLOWED_CIPHERS);
            hashSet.retainAll(asList);
            hashSet.addAll(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            ACRA.log.v(TAG, "Setting allowed TLS ciphers: " + TextUtils.join(", ", hashSet));
            sSLSocket.setEnabledCipherSuites((String[]) hashSet.toArray(new String[hashSet.size()]));
        }
    }

    private void setSniHostname(SSLSocket sSLSocket, String str) {
        if (Compatibility.getAPILevel() >= 17) {
            ACRA.log.d(TAG, "Using documented SNI with host name " + str);
            this.sslSocketFactory.setHostname(sSLSocket, str);
            return;
        }
        ACRA.log.d(TAG, "No documented SNI support on Android <4.2, trying reflection method with host name " + str);
        try {
            sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str);
        } catch (Exception e) {
            ACRA.log.w(TAG, "SNI not usable", e);
        }
    }
}
