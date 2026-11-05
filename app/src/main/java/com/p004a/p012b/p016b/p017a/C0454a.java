package com.p004a.p012b.p016b.p017a;

import com.p004a.p012b.p016b.p017a.p018a.C0455a;
import com.p004a.p012b.p016b.p017a.p018a.C0456b;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: DontLook */
/* renamed from: com.a.b.b.a.a */
/* loaded from: classes.dex */
public final class C0454a implements InterfaceC0471p {

    /* renamed from: a */
    private static final byte[] f1480a = {16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* renamed from: b */
    private Cipher f1481b;

    /* renamed from: c */
    private Cipher f1482c;

    public C0454a(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((String.valueOf(str) + str2).toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            this.f1481b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f1481b.init(1, secretKeySpec, new IvParameterSpec(f1480a));
            this.f1482c = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f1482c.init(2, secretKeySpec, new IvParameterSpec(f1480a));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Invalid environment", e);
        }
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0471p
    /* renamed from: a */
    public final String mo1054a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return C0455a.m1057a(this.f1481b.doFinal(("com.android.vending.licensing.AESObfuscator-1|" + str2 + str).getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Invalid environment", e);
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("Invalid environment", e2);
        }
    }

    @Override // com.p004a.p012b.p016b.p017a.InterfaceC0471p
    /* renamed from: b */
    public final String mo1055b(String str, String str2) throws C0476u {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f1482c.doFinal(C0455a.m1058a(str)), "UTF-8");
            if (str3.indexOf("com.android.vending.licensing.AESObfuscator-1|" + str2) != 0) {
                throw new C0476u("Header not found (invalid data or key):" + str);
            }
            return str3.substring(str2.length() + 46, str3.length());
        } catch (C0456b e) {
            throw new C0476u(String.valueOf(e.getMessage()) + ":" + str);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Invalid environment", e2);
        } catch (BadPaddingException e3) {
            throw new C0476u(String.valueOf(e3.getMessage()) + ":" + str);
        } catch (IllegalBlockSizeException e4) {
            throw new C0476u(String.valueOf(e4.getMessage()) + ":" + str);
        }
    }
}
