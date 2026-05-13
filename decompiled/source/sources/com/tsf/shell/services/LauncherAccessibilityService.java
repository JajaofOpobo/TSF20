package com.tsf.shell.services;

import android.accessibilityservice.AccessibilityService;
import android.speech.tts.TextToSpeech;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public class LauncherAccessibilityService extends AccessibilityService implements TextToSpeech.OnInitListener {
    private static LauncherAccessibilityService a;

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
        a = this;
    }

    public static LauncherAccessibilityService a() {
        return a;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        a = null;
    }
}
