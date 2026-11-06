package com.cyo.comicrack.p019a.p021b;

import com.cyo.comicrack.storage.ComicDocuments;
import android.database.sqlite.SQLiteDatabase;
import com.cyo.comicrack.p019a.C0477a;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.C0998bi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.b.e */
/* loaded from: classes.dex */
public final class C0603e implements InterfaceC0602d {

    /* renamed from: a */
    public List f1805a = new ArrayList();

    public C0603e(String... strArr) {
        boolean z;
        if (strArr != null) {
            for (String str : strArr) {
                if (!C0998bi.m2081a(str) && (ComicDocuments.isDocument(str) || new File(str).exists())) {
                    for (Object entry : this.f1805a) {
                        String str2 = (String) entry;
                        if (str2.startsWith(str) || str.startsWith(str2)) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                        this.f1805a.add(str);
                    }
                }
            }
        }
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0602d
    /* renamed from: a */
    public final List mo1292a(InterfaceC0624z interfaceC0624z) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        m1293a(hashSet);
        int size = hashSet.size();
        int iM1099a = C0628f.m1352a().m1099a(new C0604f(this, hashSet, arrayList, interfaceC0624z, size));
        if (hashSet.size() != 0) {
            C0477a c0477aM1352a = C0628f.m1352a();
            C0605g c0605g = new C0605g(this, arrayList, hashSet, interfaceC0624z, size);
            synchronized (c0477aM1352a.f1534d) {
                SQLiteDatabase writableDatabase = c0477aM1352a.f1533c.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    c0605g.mo1296a();
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        }
        if (!this.f1805a.isEmpty() && arrayList.size() != iM1099a && this.f1805a.stream().noneMatch(source -> ComicDocuments.isDocument((String) source))) {
            C0628f.m1352a().m1105a(arrayList);
        }
        return arrayList;
    }

    @Override // com.cyo.comicrack.p019a.p021b.InterfaceC0602d
    /* renamed from: a */
    public final List mo1291a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1805a.iterator();
        while (it.hasNext()) {
            try {
                File file = new File((String) it.next(), "sync_information.xml");
                if (file.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        arrayList.addAll(C0591ae.m1285a(fileInputStream).f1789c);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                } else {
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m1293a(Collection collection) {
        Iterator it = this.f1805a.iterator();
        while (it.hasNext()) {
            try {
                String source = (String) it.next();
                if (ComicDocuments.isDocument(source)) {
                    ComicDocuments.collectComics(source, collection);
                } else {
                    m1294a(collection, new File(source), 1);
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m1294a(Collection collection, File file, int i) {
        File[] fileArrListFiles;
        if (file.exists() && i < 10 && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                String absolutePath = file2.getAbsolutePath();
                if (C0628f.m1371d(absolutePath)) {
                    collection.add(absolutePath);
                } else if (file2.isDirectory() && !file2.isHidden()) {
                    m1294a(collection, file2.getAbsoluteFile(), i + 1);
                }
            }
        }
    }
}
