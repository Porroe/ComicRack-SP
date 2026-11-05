package com.p004a.p012b.p016b.p017a;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.h */
/* loaded from: classes.dex */
final class C0463h implements InterfaceC0461f {

    /* renamed from: a */
    private IBinder f1489a;

    C0463h(IBinder iBinder) {
        this.f1489a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1489a;
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0461f
    /* renamed from: a */
    public final void mo1060a(long j, String str, InterfaceC0458c interfaceC0458c) throws android.os.RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongBinder(interfaceC0458c != null ? interfaceC0458c.asBinder() : null);
            this.f1489a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
