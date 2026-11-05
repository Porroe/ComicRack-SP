package com.p004a.p005a.p007b;

import android.app.Activity;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import com.p004a.p005a.p011e.C0372i;
import java.lang.ref.WeakReference;

/* compiled from: DontLook */
/* renamed from: com.a.a.b.c */
/* loaded from: classes.dex */
public final class C0288c extends FrameLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: b */
    private static final C0293h f766b = (C0293h) C0293h.f782a.mo727a();

    /* renamed from: a */
    public MediaController f767a;

    /* renamed from: c */
    private final WeakReference f768c;

    /* renamed from: d */
    private final C0290e f769d;

    /* renamed from: e */
    private long f770e;

    /* renamed from: f */
    private final VideoView f771f;

    /* renamed from: g */
    private String f772g;

    public C0288c(Activity activity, C0290e c0290e) {
        super(activity);
        this.f768c = new WeakReference(activity);
        this.f769d = c0290e;
        this.f771f = new VideoView(activity);
        addView(this.f771f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f767a = null;
        this.f772g = null;
        this.f770e = 0L;
        new RunnableC0289d(this).m709a();
        this.f771f.setOnCompletionListener(this);
        this.f771f.setOnPreparedListener(this);
        this.f771f.setOnErrorListener(this);
    }

    /* renamed from: a */
    public final void m702a() {
        if (!TextUtils.isEmpty(this.f772g)) {
            this.f771f.setVideoPath(this.f772g);
        } else {
            C0293h c0293h = f766b;
            C0293h.m720a(this.f769d, "onVideoEvent", "{'event': 'error', 'what': 'no_src'}");
        }
    }

    public final void setMediaControllerEnabled(boolean z) {
        Activity activity = (Activity) this.f768c.get();
        if (activity == null) {
            C0372i.m920e("adActivity was null while trying to enable controls on a video.");
            return;
        }
        if (z) {
            if (this.f767a == null) {
                this.f767a = new MediaController(activity);
            }
            this.f771f.setMediaController(this.f767a);
        } else {
            if (this.f767a != null) {
                this.f767a.hide();
            }
            this.f771f.setMediaController(null);
        }
    }

    public final void setSrc(String str) {
        this.f772g = str;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        C0293h c0293h = f766b;
        C0293h.m720a(this.f769d, "onVideoEvent", "{'event': 'ended'}");
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C0372i.m920e("Video threw error! <what:" + i + ", extra:" + i2 + ">");
        C0293h c0293h = f766b;
        C0293h.m720a(this.f769d, "onVideoEvent", "{'event': 'error', 'what': '" + i + "', 'extra': '" + i2 + "'}");
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C0293h c0293h = f766b;
        C0293h.m720a(this.f769d, "onVideoEvent", "{'event': 'canplaythrough', 'duration': '" + (this.f771f.getDuration() / 1000.0f) + "'}");
    }

    /* renamed from: b */
    public final void m705b() {
        this.f771f.pause();
    }

    /* renamed from: c */
    public final void m706c() {
        this.f771f.start();
    }

    /* renamed from: a */
    public final void m703a(int i) {
        this.f771f.seekTo(i);
    }

    /* renamed from: a */
    public final void m704a(MotionEvent motionEvent) {
        this.f771f.onTouchEvent(motionEvent);
    }

    /* renamed from: d */
    public final void m707d() {
        this.f771f.stopPlayback();
    }

    /* renamed from: e */
    final void m708e() {
        long currentPosition = this.f771f.getCurrentPosition();
        if (this.f770e != currentPosition) {
            C0293h c0293h = f766b;
            C0293h.m720a(this.f769d, "onVideoEvent", "{'event': 'timeupdate', 'time': " + (currentPosition / 1000.0f) + "}");
            this.f770e = currentPosition;
        }
    }
}
