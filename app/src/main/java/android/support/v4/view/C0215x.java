package android.support.v4.view;

import android.view.KeyEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.x */
/* loaded from: classes.dex */
class C0215x implements InterfaceC0140aa {
    C0215x() {
    }

    /* renamed from: a */
    private static int m496a(int i, int i2, int i3, int i4) {
        boolean z = (i2 & 1) != 0;
        int i5 = i3 | i4;
        boolean z2 = (i5 & 1) != 0;
        if (z) {
            if (z2) {
                throw new IllegalArgumentException("bad arguments");
            }
            return i & (i5 ^ (-1));
        }
        if (z2) {
            return i & (i2 ^ (-1));
        }
        return i;
    }

    /* renamed from: a */
    public int mo497a(int i) {
        int i2 = (i & 192) != 0 ? i | 1 : i;
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    @Override // android.support.v4.view.InterfaceC0140aa
    /* renamed from: b */
    public boolean mo389b(int i) {
        return m496a(m496a(mo497a(i) & 247, 1, 64, 128), 2, 16, 32) == 1;
    }

    @Override // android.support.v4.view.InterfaceC0140aa
    /* renamed from: c */
    public boolean mo390c(int i) {
        return (mo497a(i) & 247) == 0;
    }

    @Override // android.support.v4.view.InterfaceC0140aa
    /* renamed from: a */
    public void mo388a(KeyEvent keyEvent) {
    }
}
