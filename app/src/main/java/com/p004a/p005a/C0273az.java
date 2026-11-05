package com.p004a.p005a;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* compiled from: DontLook */
/* renamed from: com.a.a.az */
/* loaded from: classes.dex */
public final class C0273az {

    /* renamed from: c */
    private static C0273az f696c = null;

    /* renamed from: b */
    private BigInteger f698b = BigInteger.ONE;

    /* renamed from: a */
    private final BigInteger f697a = m628d();

    /* renamed from: a */
    public static synchronized C0273az m627a() {
        if (f696c == null) {
            f696c = new C0273az();
        }
        return f696c;
    }

    /* renamed from: b */
    public final synchronized BigInteger m629b() {
        return this.f697a;
    }

    /* renamed from: c */
    public final synchronized BigInteger m630c() {
        BigInteger bigInteger;
        bigInteger = this.f698b;
        this.f698b = this.f698b.add(BigInteger.ONE);
        return bigInteger;
    }

    private C0273az() {
    }

    /* renamed from: d */
    private static BigInteger m628d() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            UUID uuidRandomUUID = UUID.randomUUID();
            messageDigest.update(BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray());
            messageDigest.update(BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray());
            byte[] bArr = new byte[9];
            bArr[0] = 0;
            System.arraycopy(messageDigest.digest(), 0, bArr, 1, 8);
            return new BigInteger(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Cannot find MD5 message digest algorithm.");
        }
    }
}
