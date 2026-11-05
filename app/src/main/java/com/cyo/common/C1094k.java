package com.cyo.common;

import java.io.File;
import java.util.Comparator;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.k */
/* loaded from: classes.dex */
public final class C1094k implements Comparator {

    /* renamed from: a */
    public boolean f3473a = true;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        return this.f3473a ? file.getAbsolutePath().compareToIgnoreCase(file2.getAbsolutePath()) : file.getAbsolutePath().compareTo(file2.getAbsolutePath());
    }
}
