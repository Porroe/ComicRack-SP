package com.cyo.common.view;

import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.cyo.comicrack.viewer.C0803fs;
import com.cyo.comicrack.viewer.C0804ft;
import com.cyo.common.C0951ag;
import com.cyo.common.C1094k;
import com.cyo.common.C1172w;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.an */
/* loaded from: classes.dex */
public final class C1120an {

    /* renamed from: a */
    public View f3572a;

    /* renamed from: b */
    ListView f3573b;

    /* renamed from: c */
    String f3574c;

    /* renamed from: d */
    String f3575d;

    /* renamed from: e */
    public File f3576e;

    /* renamed from: f */
    private InterfaceC1132az f3577f;

    /* renamed from: g */
    private TextView f3578g;

    /* renamed from: h */
    private Button f3579h;

    /* renamed from: i */
    private Button f3580i;

    /* renamed from: j */
    private Button f3581j;

    /* renamed from: k */
    private Button f3582k;

    /* renamed from: l */
    private boolean f3583l;

    /* renamed from: m */
    private File f3584m;

    /* renamed from: n */
    private List f3585n;

    public C1120an(View view, String str, String str2, InterfaceC1132az interfaceC1132az, boolean z) {
        this.f3584m = new File("/");
        this.f3572a = view;
        this.f3577f = interfaceC1132az;
        this.f3574c = str;
        this.f3575d = str2;
        this.f3583l = z;
        this.f3573b = (ListView) view.findViewById(C0803fs.folderList);
        this.f3578g = (TextView) view.findViewById(C0803fs.folderText);
        this.f3580i = (Button) view.findViewById(C0803fs.folderUp);
        this.f3582k = (Button) view.findViewById(C0803fs.folderCreate);
        this.f3581j = (Button) view.findViewById(C0803fs.folderDelete);
        this.f3579h = (Button) view.findViewById(C0803fs.folderHome);
        if (C0951ag.m2004d()) {
            this.f3579h.setOnClickListener(new ViewOnClickListenerC1129aw(this, this.f3579h));
        } else {
            this.f3579h.setVisibility(8);
        }
        this.f3580i.setOnClickListener(new ViewOnClickListenerC1121ao(this));
        this.f3582k.setOnClickListener(new ViewOnClickListenerC1122ap(this));
        this.f3581j.setOnClickListener(new ViewOnClickListenerC1124ar(this));
        this.f3573b.setOnItemClickListener(new C1127au(this));
        view.post(new RunnableC1128av(this, m2405a(this.f3584m, new File(str)) ? str : this.f3584m.getAbsolutePath()));
    }

    public C1120an(View view, String str, String str2, InterfaceC1132az interfaceC1132az) {
        this(view, str, str2, interfaceC1132az, false);
    }

    /* renamed from: a */
    final void m2407a(String str) {
        File file;
        boolean zEquals;
        while (true) {
            file = new File(str);
            zEquals = this.f3584m.equals(file);
            if (m2405a(this.f3584m, file) || zEquals) {
                break;
            } else {
                str = this.f3584m.getAbsolutePath();
            }
        }
        this.f3576e = file;
        this.f3578g.setText(file.getAbsolutePath());
        this.f3585n = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isHidden() && ((!file2.isDirectory() || file2.canRead()) && !file2.isFile())) {
                    this.f3585n.add(file2);
                }
            }
        }
        Collections.sort(this.f3585n, new C1094k());
        this.f3580i.setEnabled(!zEquals);
        this.f3581j.setEnabled(!zEquals && m2406b(file));
        this.f3582k.setEnabled(m2406b(file));
        this.f3573b.setAdapter((ListAdapter) new C1131ay(this, this.f3572a.getContext(), C0804ft.folder_browser_entry, this.f3585n));
        if (this.f3577f != null) {
            this.f3577f.mo2378a(m2406b(file));
        }
    }

    /* renamed from: b */
    private boolean m2406b(File file) {
        return this.f3583l || C1172w.m2504a(file);
    }

    /* renamed from: a */
    private static boolean m2405a(File file, File file2) {
        if (!file2.exists()) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = String.valueOf(absolutePath) + "/";
        }
        return file2.getAbsolutePath().startsWith(absolutePath);
    }

    /* renamed from: a */
    static boolean m2404a(File file) {
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory() && (!m2404a(file2) || !file2.delete())) {
                    return false;
                }
            }
        }
        return file.delete();
    }
}
