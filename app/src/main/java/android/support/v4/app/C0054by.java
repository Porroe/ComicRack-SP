package android.support.v4.app;

import android.app.RemoteInput;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.by */
/* loaded from: classes.dex */
final class C0054by {
    /* renamed from: a */
    static RemoteInput[] m162a(AbstractC0057ca[] abstractC0057caArr) {
        if (abstractC0057caArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[abstractC0057caArr.length];
        for (int i = 0; i < abstractC0057caArr.length; i++) {
            AbstractC0057ca abstractC0057ca = abstractC0057caArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(abstractC0057ca.mo157a()).setLabel(abstractC0057ca.mo158b()).setChoices(abstractC0057ca.mo159c()).setAllowFreeFormInput(abstractC0057ca.mo160d()).addExtras(abstractC0057ca.mo161e()).build();
        }
        return remoteInputArr;
    }
}
