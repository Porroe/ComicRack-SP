package com.cyo.comicrack.viewer;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0951ag;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ComicRackFilesProvider extends ContentProvider {

    /* renamed from: a */
    private static final Map<String, String> f1967a;

    /* renamed from: b */
    private static File f1968b;

    static {
        HashMap<String, String> map = new HashMap<>();
        map.put(".png", "image/png");
        map.put(".jpg", "image/jpeg");
        f1967a = Collections.unmodifiableMap(map);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (f1968b == null) {
            File file = new File(C0951ag.m1995a().mo2017a(getContext()) + "/ProviderFilesCache");
            f1968b = file;
            if (!file.exists()) {
                f1968b.mkdirs();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return m1450a(uri.toString());
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"NewApi"})
    public ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, Object obj, ContentProvider.PipeDataWriter pipeDataWriter) {
        return null;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        File file = new File(f1968b, uri.getPath());
        if (!file.exists()) {
            throw new FileNotFoundException(uri.getPath());
        }
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (strArr == null) {
            strArr = new String[]{"_id", "_data", "_size", "mime_type", "_display_name"};
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        File file = new File(f1968b, uri.getPath());
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            String name = file.getName();
            for (String str3 : strArr) {
                if (str3.equals("_id")) {
                    arrayList.add(name);
                } else if (str3.equals("_data")) {
                    arrayList.add(file.getAbsolutePath());
                } else if (str3.equals("orientation")) {
                    arrayList.add(0);
                } else if (str3.equals("datetaken")) {
                    arrayList.add(Long.valueOf(file.lastModified()));
                } else if (str3.equals("mime_type")) {
                    arrayList.add(m1450a(name));
                } else if (str3.equals("_size")) {
                    arrayList.add(Long.valueOf(file.length()));
                } else if (str3.equals("_display_name")) {
                    arrayList.add(name);
                } else {
                    arrayList.add("");
                }
            }
            matrixCursor.addRow(arrayList);
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new RuntimeException("Operation not supported");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new RuntimeException("Operation not supported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new RuntimeException("Operation not supported");
    }

    /* renamed from: a */
    public static File m1448a(String str, String str2) {
        ArrayList arrayList = new ArrayList(Arrays.asList(f1968b.listFiles()));
        Collections.sort(arrayList, new C0729cz());
        int size = arrayList.size() - 5;
        for (int i = 0; i < size; i++) {
            ((File) arrayList.get(0)).delete();
            arrayList.remove(0);
        }
        try {
            return File.createTempFile(str, str2, f1968b);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m1450a(String str) {
        for (String str2 : f1967a.keySet()) {
            if (str.endsWith(str2)) {
                return f1967a.get(str2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m1449a(File file) {
        return m1450a(file.getAbsolutePath());
    }

    /* renamed from: b */
    public static Uri m1451b(File file) {
        return Uri.parse("content://" + (String.valueOf(C0628f.m1370d()) + "." + ComicRackFilesProvider.class.getSimpleName()) + "/" + file.getName());
    }
}
