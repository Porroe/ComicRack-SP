package com.cyo.comicrack.viewer;

import java.io.File;
import java.util.Comparator;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cz */
/* loaded from: classes.dex */
final class C0729cz implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
    }

    C0729cz() {
    }
}
