package com.p004a.p005a;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* compiled from: DontLook */
/* renamed from: com.a.a.ai */
/* loaded from: classes.dex */
public abstract class AbstractC0256ai implements InterfaceC0255ah {

    /* renamed from: b */
    protected DisplayMetrics f658b;

    /* renamed from: c */
    private C0270aw f659c = null;

    /* renamed from: d */
    private ByteArrayOutputStream f660d = null;

    /* renamed from: a */
    protected MotionEvent f657a = null;

    /* renamed from: a */
    protected abstract void mo600a(Context context);

    /* renamed from: b */
    protected abstract void mo602b(Context context);

    protected AbstractC0256ai(Context context) {
        this.f658b = null;
        try {
            this.f658b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f658b = new DisplayMetrics();
            this.f658b.density = 1.0f;
        }
    }

    @Override // com.p004a.p005a.InterfaceC0255ah
    /* renamed from: a */
    public final String mo593a(Context context, String str) {
        return m596a(context, str, true);
    }

    /* renamed from: a */
    public final void m601a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f657a != null) {
                this.f657a.recycle();
            }
            this.f657a = MotionEvent.obtain(motionEvent);
        }
    }

    /* renamed from: a */
    public final void m597a(int i, int i2, int i3) {
        if (this.f657a != null) {
            this.f657a.recycle();
        }
        this.f657a = MotionEvent.obtain(0L, i3, 1, i * this.f658b.density, i2 * this.f658b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    /* renamed from: a */
    public final String m596a(Context context, String str, boolean z) {
        byte[] bArrArray;
        try {
            m594a();
            if (z) {
                mo602b(context);
            } else {
                mo600a(context);
            }
            byte[] bArrM595b = m595b();
            if (bArrM595b.length == 0) {
                return Integer.toString(5);
            }
            if (bArrM595b.length > 239) {
                m594a();
                m598a(20, 1L);
                bArrM595b = m595b();
            }
            if (bArrM595b.length < 239) {
                byte[] bArr = new byte[239 - bArrM595b.length];
                new SecureRandom().nextBytes(bArr);
                bArrArray = ByteBuffer.allocate(240).put((byte) bArrM595b.length).put(bArrM595b).put(bArr).array();
            } else {
                bArrArray = ByteBuffer.allocate(240).put((byte) bArrM595b.length).put(bArrM595b).array();
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArrArray);
            byte[] bArrArray2 = ByteBuffer.allocate(256).put(messageDigest.digest()).put(bArrArray).array();
            byte[] bArr2 = new byte[256];
            new C0403s().m939a(bArrArray2, bArr2);
            if (str != null && str.length() > 0) {
                if (str.length() > 32) {
                    str = str.substring(0, 32);
                }
                new C0265ar(str.getBytes("UTF-8")).m619a(bArr2);
            }
            return C0264aq.m617a(bArr2);
        } catch (UnsupportedEncodingException e) {
            return Integer.toString(7);
        } catch (IOException e2) {
            return Integer.toString(3);
        } catch (NoSuchAlgorithmException e3) {
            return Integer.toString(7);
        }
    }

    /* renamed from: a */
    protected final void m598a(int i, long j) throws IOException {
        C0270aw c0270aw = this.f659c;
        c0270aw.m624a(i, 0);
        while (((-128) & j) != 0) {
            c0270aw.m623a((((int) j) & 127) | 128);
            j >>>= 7;
        }
        c0270aw.m623a((int) j);
    }

    /* renamed from: a */
    protected final void m599a(int i, String str) throws IOException {
        C0270aw c0270aw = this.f659c;
        c0270aw.m624a(i, 2);
        byte[] bytes = str.getBytes("UTF-8");
        c0270aw.m625b(bytes.length);
        int length = bytes.length;
        if (c0270aw.f688b - c0270aw.f689c >= length) {
            System.arraycopy(bytes, 0, c0270aw.f687a, c0270aw.f689c, length);
            c0270aw.f689c += length;
        } else {
            int i2 = c0270aw.f688b - c0270aw.f689c;
            System.arraycopy(bytes, 0, c0270aw.f687a, c0270aw.f689c, i2);
            int i3 = i2 + 0;
            length -= i2;
            c0270aw.f689c = c0270aw.f688b;
            c0270aw.f690d = i2 + c0270aw.f690d;
            c0270aw.m622a();
            if (length <= c0270aw.f688b) {
                System.arraycopy(bytes, i3, c0270aw.f687a, 0, length);
                c0270aw.f689c = length;
            } else {
                c0270aw.f691e.write(bytes, i3, length);
            }
        }
        c0270aw.f690d = length + c0270aw.f690d;
    }

    /* renamed from: a */
    private void m594a() {
        this.f660d = new ByteArrayOutputStream();
        this.f659c = new C0270aw(this.f660d, new byte[4096]);
    }

    /* renamed from: b */
    private byte[] m595b() throws IOException {
        C0270aw c0270aw = this.f659c;
        if (c0270aw.f691e != null) {
            c0270aw.m622a();
        }
        return this.f660d.toByteArray();
    }
}
