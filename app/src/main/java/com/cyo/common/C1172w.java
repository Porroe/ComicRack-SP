package com.cyo.common;

import java.io.File;
import java.io.IOException;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.w */
/* loaded from: classes.dex */
public final class C1172w {
    /* renamed from: a */
    public static boolean m2504a(File file) {
        try {
            if (file.isFile() || !file.exists() || !file.canWrite()) {
                return false;
            }
            File fileCreateTempFile = File.createTempFile("testrw", ".tmp", file);
            if (!fileCreateTempFile.exists()) {
                return false;
            }
            fileCreateTempFile.delete();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
