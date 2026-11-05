package com.cyo.comicrack.p019a;

import android.text.format.Time;
import com.cyo.comicrack.p019a.p020a.C0505b;
import java.util.Locale;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.j */
/* loaded from: classes.dex */
public final class C0632j implements InterfaceC0630h {

    /* renamed from: a */
    private Time f1905a = C0628f.m1373f();

    /* renamed from: b */
    private int f1906b;

    /* renamed from: c */
    private String[] f1907c;

    public C0632j(int i, String str) {
        this.f1906b = i;
        if (str != null) {
            this.f1907c = str.toLowerCase(Locale.getDefault()).split("\\s+");
        }
    }

    @Override // com.cyo.comicrack.p019a.InterfaceC0630h
    /* renamed from: a */
    public final int mo1374a(C0505b c0505b) {
        if (this.f1906b != 0) {
            if ((this.f1906b & 4) != 0 && c0505b.f1576h < 4.0f) {
                return 0;
            }
            if ((this.f1906b & 1) != 0 && !c0505b.m1145k().after(this.f1905a)) {
                return 0;
            }
            if ((this.f1906b & 2) != 0 && c0505b.m1143i()) {
                return 0;
            }
            if ((this.f1906b & 8) != 0 && !c0505b.m1144j()) {
                return 0;
            }
        }
        if (this.f1907c == null) {
            return 1;
        }
        String lowerCase = c0505b.m1150p().toLowerCase(Locale.getDefault());
        for (String str : this.f1907c) {
            if (lowerCase.contains(str)) {
                return 1;
            }
        }
        return 0;
    }
}
