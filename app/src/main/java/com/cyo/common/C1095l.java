package com.cyo.common;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.l */
/* loaded from: classes.dex */
public final class C1095l {
    /* renamed from: a */
    private static String m2368a(InputStream inputStream) {
        StringBuilder text = new StringBuilder(65536);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream), 65536);
        try {
            char[] buffer = new char[32768];
            int count;
            while ((count = reader.read(buffer)) != -1) {
                text.append(buffer, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text.toString();
    }

    /* renamed from: a */
    public static int m2365a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[65536];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 != -1) {
                i += i2;
                outputStream.write(bArr, 0, i2);
            } else {
                return i;
            }
        }
    }

    /* renamed from: a */
    public static String m2366a(Resources resources, int i) {
        return m2368a(resources.openRawResource(i));
    }

    /* renamed from: a */
    public static String m2369a(String str, String str2, int i, boolean z) {
        String strM2369a;
        if (i < 0) {
            return null;
        }
        File file = new File(String.valueOf(str) + "/" + str2);
        if (!file.exists() || (z && !file.canWrite())) {
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file2 : fileArrListFiles) {
                if (!file2.isHidden() && file2.isDirectory() && (strM2369a = m2369a(file2.getPath(), str2, i - 1, z)) != null) {
                    return strM2369a;
                }
            }
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static void m2371a(DataOutputStream dataOutputStream, String str) throws IOException {
        if (str == null) {
            dataOutputStream.writeInt(-1);
        } else {
            dataOutputStream.writeInt(str.length());
            dataOutputStream.writeChars(str);
        }
    }

    /* renamed from: a */
    public static String m2367a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(i);
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                sb.append(dataInputStream.readChar());
                i = i2;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    public static String m2370a(String... strArr) {
        String str = "";
        if (strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        String[][] strArr2 = new String[strArr.length][];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i].split("/");
        }
        for (int i2 = 0; i2 < strArr2[0].length; i2++) {
            String str2 = strArr2[0][i2];
            int i3 = 1;
            boolean zEquals = true;
            while (true) {
                if (i3 >= strArr2.length || !zEquals) {
                    break;
                }
                if (strArr2[i3].length <= i2) {
                    zEquals = false;
                    break;
                }
                zEquals &= strArr2[i3][i2].equals(str2);
                i3++;
            }
            if (zEquals) {
                str = String.valueOf(str) + str2 + "/";
            } else {
                return str;
            }
        }
        return str;
    }
}
