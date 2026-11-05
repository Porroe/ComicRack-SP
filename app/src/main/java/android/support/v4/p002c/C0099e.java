package android.support.v4.p002c;

import android.util.Log;
import java.io.Writer;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.e */
/* loaded from: classes.dex */
public final class C0099e extends Writer {

    /* renamed from: a */
    private final String f341a;

    /* renamed from: b */
    private StringBuilder f342b = new StringBuilder(128);

    public C0099e(String str) {
        this.f341a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m273a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m273a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m273a();
            } else {
                this.f342b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m273a() {
        if (this.f342b.length() > 0) {
            Log.d(this.f341a, this.f342b.toString());
            this.f342b.delete(0, this.f342b.length());
        }
    }
}
