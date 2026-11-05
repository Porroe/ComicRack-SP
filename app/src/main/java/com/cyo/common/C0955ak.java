package com.cyo.common;

import android.annotation.TargetApi;
import android.content.Context;
import twitter4j.TwitterResponse;

/* compiled from: DontLook */
@TargetApi(9)
/* renamed from: com.cyo.common.ak */
/* loaded from: classes.dex */
class C0955ak extends C0953ai {

    /* renamed from: a */
    private static /* synthetic */ int[] f2847a;

    private C0955ak() {
        super((byte) 0);
    }

    /* synthetic */ C0955ak(byte b) {
        this();
    }

    /* synthetic */ C0955ak(char c) {
        this();
    }

    /* renamed from: b */
    private static /* synthetic */ int[] m2042b() {
        int[] iArr = f2847a;
        if (iArr == null) {
            iArr = new int[EnumC0993bd.valuesCustom().length];
            try {
                iArr[EnumC0993bd.Large.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0993bd.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0993bd.Small.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0993bd.XLarge.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f2847a = iArr;
        }
        return iArr;
    }

    @Override // com.cyo.common.C0953ai, com.cyo.common.InterfaceC0994be
    /* renamed from: a */
    public final boolean mo2033a(Context context, EnumC0993bd enumC0993bd) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        switch (m2042b()[enumC0993bd.ordinal()]) {
            case TwitterResponse.READ /* 1 */:
                break;
            case TwitterResponse.READ_WRITE /* 2 */:
                if (i < 2) {
                    break;
                }
                break;
            case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                if (i < 3) {
                    break;
                }
                break;
            default:
                if (i < 4) {
                    break;
                }
                break;
        }
        return true;
    }
}
