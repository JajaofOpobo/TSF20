package com.flurry.android;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import java.util.Collections;

/* loaded from: classes.dex */
public final class FlurryFullscreenTakeoverActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    private static final String a = FlurryFullscreenTakeoverActivity.class.getSimpleName();
    private bz b;
    private FrameLayout c;
    private cy d;
    private ProgressDialog e;
    private VideoView f;
    private boolean g;
    private MediaController h;
    private boolean i;
    private Intent j;
    private String k;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte b = 0;
        setTheme(R.style.Theme.NoTitleBar.Fullscreen);
        super.onCreate(bundle);
        ei.a(getWindow());
        Intent intent = getIntent();
        this.j = (Intent) intent.getParcelableExtra("targetIntent");
        this.k = intent.getStringExtra("adSpaceName");
        if (this.j != null) {
            try {
                startActivity(this.j);
            } catch (ActivityNotFoundException e) {
                Cdo.b(a, "Cannot launch Activity", e);
                this.j = null;
                finish();
            }
        } else {
            String stringExtra = intent.getStringExtra("url");
            if (stringExtra == null) {
                int i = bundle != null ? bundle.getInt("frameIndex", -1) : -1;
                if (i < 0) {
                    i = intent.getIntExtra("frameIndex", 0);
                }
                s a2 = s.a();
                if (a2.m() != null) {
                    this.b = new bz(this, a2, a2.l(), a2.m(), i);
                    this.b.a(this);
                    if (i == 0) {
                        this.b.a("rendered", Collections.emptyMap());
                    }
                    setContentView(this.b);
                }
            } else {
                this.c = new FrameLayout(this);
                setContentView(this.c);
                if (b(stringExtra)) {
                    this.f = new cr(this);
                    c(stringExtra);
                } else {
                    this.d = new cy(this, stringExtra);
                    this.d.a(new dr(this, b));
                    this.d.a(new ej(this, b));
                    this.d.a(new bt(this, b));
                    this.c.addView(this.d);
                }
            }
        }
        if (this.k != null) {
            s a3 = s.a();
            String str = this.k;
            a3.a(this.j != null);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        if (t.f() != null) {
            t.a(this, t.f());
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        t.a(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.b != null) {
            bundle.putInt("frameIndex", this.b.d);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.i = true;
        if (this.h != null) {
            this.h.show(0);
        }
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.i = false;
        if (this.f != null && this.f.isPlaying()) {
            this.f.pause();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        a();
        if (this.d != null) {
            this.d.c();
        }
        if (this.b != null) {
            this.b.b();
        }
        if (isFinishing() && this.k != null) {
            s a2 = s.a();
            String str = this.k;
            a2.d();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        String str = "onWindowFocusChanged hasFocus = " + z;
        if (this.i && z && this.j != null) {
            finish();
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.b != null) {
                this.b.a("adWillClose", Collections.emptyMap(), this.b.c, this.b.b, this.b.d, 0);
                return true;
            }
            if (this.f != null) {
                if (this.d != null) {
                    if (this.g) {
                        if (this.d.a()) {
                            this.d.b();
                            a();
                            return true;
                        }
                    } else {
                        a();
                        return true;
                    }
                }
            } else if (this.d != null && this.d.a()) {
                this.d.b();
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Cdo.b(a, "error occurs during video playback");
        if (this.d != null) {
            if (this.g) {
                if (this.d.a()) {
                    this.d.b();
                    a();
                    return true;
                }
                finish();
                return true;
            }
            a();
            return true;
        }
        finish();
        return true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (this.e != null && this.e.isShowing()) {
            this.e.dismiss();
        }
        if (this.f != null && this.i) {
            this.f.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        String mimeTypeFromExtension;
        return (TextUtils.isEmpty(str) || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str))) == null || !mimeTypeFromExtension.startsWith("video/")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (!TextUtils.isEmpty(str) && this.f != null && this.c != null) {
            this.h = new MediaController(this);
            this.f.setOnPreparedListener(this);
            this.f.setOnCompletionListener(this);
            this.f.setOnErrorListener(this);
            this.f.setMediaController(this.h);
            this.f.setVideoURI(Uri.parse(str));
            this.c.addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
            this.e = new ProgressDialog(this);
            this.e.setProgressStyle(0);
            this.e.setMessage("Loading...");
            this.e.setCancelable(true);
            this.e.show();
            if (this.d != null) {
                this.d.setVisibility(8);
            }
        }
    }

    private void a() {
        if (this.e != null) {
            if (this.e.isShowing()) {
                this.e.dismiss();
            }
            this.e = null;
        }
        if (this.d != null) {
            this.d.setVisibility(0);
        }
        if (this.f != null) {
            if (this.f.isPlaying()) {
                this.f.stopPlayback();
            }
            if (this.c != null) {
                this.c.removeView(this.f);
            }
            this.f = null;
        }
        this.g = false;
        this.h = null;
    }
}
