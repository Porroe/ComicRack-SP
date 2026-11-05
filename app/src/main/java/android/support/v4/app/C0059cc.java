package android.support.v4.app;

import android.os.Bundle;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.cc */
/* loaded from: classes.dex */
final class C0059cc {
    /* renamed from: a */
    static Bundle[] m163a(AbstractC0057ca[] abstractC0057caArr) {
        if (abstractC0057caArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[abstractC0057caArr.length];
        for (int i = 0; i < abstractC0057caArr.length; i++) {
            AbstractC0057ca abstractC0057ca = abstractC0057caArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", abstractC0057ca.mo157a());
            bundle.putCharSequence("label", abstractC0057ca.mo158b());
            bundle.putCharSequenceArray("choices", abstractC0057ca.mo159c());
            bundle.putBoolean("allowFreeFormInput", abstractC0057ca.mo160d());
            bundle.putBundle("extras", abstractC0057ca.mo161e());
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
