package android.support.v4.view;

import android.view.KeyEvent;

/* compiled from: DontLook */
/* renamed from: android.support.v4.view.z */
/* loaded from: classes.dex */
final class C0217z extends C0216y {
    C0217z() {
    }

    @Override // android.support.v4.view.C0215x
    /* renamed from: a */
    public final int mo497a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    @Override // android.support.v4.view.C0215x, android.support.v4.view.InterfaceC0140aa
    /* renamed from: b */
    public final boolean mo389b(int i) {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    @Override // android.support.v4.view.C0215x, android.support.v4.view.InterfaceC0140aa
    /* renamed from: c */
    public final boolean mo390c(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
