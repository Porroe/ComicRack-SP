package com.p004a.p005a;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: DontLook */
/* renamed from: com.a.a.an */
/* loaded from: classes.dex */
public final class C0261an {
    /* renamed from: a */
    public static byte[] m615a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, C0262ao, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length != 16) {
            throw new C0262ao();
        }
        try {
            byte[] bArrM618a = C0264aq.m618a(str);
            if (bArrM618a.length <= 16) {
                throw new C0262ao();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrM618a.length);
            byteBufferAllocate.put(bArrM618a);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrM618a.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr3);
        } catch (InvalidAlgorithmParameterException e) {
            throw new C0262ao(e);
        } catch (InvalidKeyException e2) {
            throw new C0262ao(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new C0262ao(e3);
        } catch (BadPaddingException e4) {
            throw new C0262ao(e4);
        } catch (IllegalBlockSizeException e5) {
            throw new C0262ao(e5);
        } catch (NoSuchPaddingException e6) {
            throw new C0262ao(e6);
        }
    }
}
