package com.flurry.android;

/**
 * Stub replacement for Flurry analytics SDK.
 * All methods are no-ops. TSF Shell's Home.java calls these in onStart/onStop.
 */
public final class FlurryAgent {
    public static void setReportLocation(boolean report) {}
    public static void setCaptureUncaughtExceptions(boolean capture) {}
    public static void onStartSession(android.content.Context context, String apiKey) {}
    public static void onEndSession(android.content.Context context) {}
    public static void logEvent(String eventId) {}
    public static void logEvent(String eventId, boolean timed) {}
    public static void endTimedEvent(String eventId) {}
    
    private FlurryAgent() {}
}
