package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.SlidingPaneLayout;

/* compiled from: DontLook */
/* renamed from: android.support.v4.widget.r */
/* loaded from: classes.dex */
final class C0235r implements Parcelable.Creator {
    C0235r() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SlidingPaneLayout.SavedState(parcel, (byte) 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SlidingPaneLayout.SavedState[i];
    }
}
