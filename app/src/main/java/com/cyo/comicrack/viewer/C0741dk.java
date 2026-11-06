package com.cyo.comicrack.viewer;

import java.util.HashMap;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.dk */
/* loaded from: classes.dex */
final class C0741dk extends HashMap {
    C0741dk() {
        put(EnumC0743dm.Off, new C0742dl(0, 500, 1.0f));
        put(EnumC0743dm.Slow, new C0742dl(30000, 30000, 0.25f));
        put(EnumC0743dm.Medium, new C0742dl(30000, 20000, 0.25f));
        put(EnumC0743dm.Fast, new C0742dl(10000, 10000, 0.25f));
        put(EnumC0743dm.Random, new C0742dl(10000, 30000, 0.25f));
    }
}
