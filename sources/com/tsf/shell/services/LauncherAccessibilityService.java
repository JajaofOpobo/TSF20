package com.tsf.shell.services;

import android.accessibilityservice.AccessibilityService;
import android.speech.tts.TextToSpeech;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public class LauncherAccessibilityService extends AccessibilityService implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    private static LauncherAccessibilityService f13346a;

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
        f13346a = this;
    }

    /* renamed from: a */
    public static LauncherAccessibilityService m777a() {
        return f13346a;
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
        f13346a = null;
    }
}
