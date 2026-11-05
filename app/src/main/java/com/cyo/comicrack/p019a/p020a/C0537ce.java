package com.cyo.comicrack.p019a.p020a;

import com.cyo.common.C0998bi;
import com.cyo.common.C1086cd;
import com.cyo.common.C1095l;
import com.cyo.common.p022a.EnumC0938i;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.a.a.ce */
/* loaded from: classes.dex */
public class C0537ce implements Comparable {

    /* renamed from: a */
    public static int f1663a = 128;

    /* renamed from: b */
    public String f1664b;

    /* renamed from: c */
    public String f1665c;

    /* renamed from: d */
    public int f1666d;

    /* renamed from: e */
    public String f1667e;

    /* renamed from: g */
    public int f1669g;

    /* renamed from: h */
    public int f1670h;

    /* renamed from: f */
    public long f1668f = 0;

    /* renamed from: i */
    public EnumC0938i f1671i = EnumC0938i.None;

    /* renamed from: j */
    public EnumC0538cf f1672j = EnumC0538cf.Default;

    /* renamed from: k */
    private EnumC0539cg f1673k = EnumC0539cg.Story;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        return this.f1664b.compareToIgnoreCase(((C0537ce) obj).f1664b);
    }

    /* renamed from: a */
    public final boolean m1188a() {
        return this.f1665c != null;
    }

    /* renamed from: b */
    public final boolean m1189b() {
        return mo1193f() == EnumC0539cg.FrontCover || mo1193f() == EnumC0539cg.InnerCover;
    }

    /* renamed from: c */
    public final boolean m1190c() {
        return mo1193f() == EnumC0539cg.BackCover;
    }

    /* renamed from: d */
    public final boolean m1191d() {
        return this.f1669g > this.f1670h;
    }

    /* renamed from: e */
    public final boolean m1192e() {
        return !C0998bi.m2081a(this.f1667e);
    }

    /* renamed from: a */
    public final int m1183a(int i) {
        int i2 = this.f1670h;
        int i3 = 1;
        while ((i << 1) < i2) {
            i2 >>= 1;
            i3 <<= 1;
        }
        return i3;
    }

    /* renamed from: f */
    public EnumC0539cg mo1193f() {
        return this.f1673k;
    }

    /* renamed from: a */
    public void mo1184a(EnumC0539cg enumC0539cg) {
        this.f1673k = enumC0539cg;
    }

    /* renamed from: a */
    public static C0537ce m1182a(String str, String str2) {
        C0537ce c0537ce = new C0537ce();
        c0537ce.f1664b = str;
        c0537ce.f1665c = str2;
        return c0537ce;
    }

    /* renamed from: a */
    public final void m1185a(DataInputStream dataInputStream) throws java.io.IOException {
        this.f1664b = C1095l.m2367a(dataInputStream);
        this.f1665c = C1095l.m2367a(dataInputStream);
        mo1184a(EnumC0539cg.m1197a(dataInputStream.readByte()));
        this.f1666d = dataInputStream.readInt();
        this.f1667e = C1095l.m2367a(dataInputStream);
        this.f1668f = dataInputStream.readLong();
        this.f1669g = dataInputStream.readInt();
        this.f1670h = dataInputStream.readInt();
        this.f1671i = EnumC0938i.m1968a(dataInputStream.readByte());
        this.f1672j = EnumC0538cf.m1194a(dataInputStream.readByte());
    }

    /* renamed from: a */
    public final void m1186a(DataOutputStream dataOutputStream) throws IOException {
        C1095l.m2371a(dataOutputStream, this.f1664b);
        C1095l.m2371a(dataOutputStream, this.f1665c);
        dataOutputStream.writeByte(mo1193f().m1199a());
        dataOutputStream.writeInt(this.f1666d);
        C1095l.m2371a(dataOutputStream, this.f1667e);
        dataOutputStream.writeLong(this.f1668f);
        dataOutputStream.writeInt(this.f1669g);
        dataOutputStream.writeInt(this.f1670h);
        dataOutputStream.writeByte(this.f1671i.m1970a());
        dataOutputStream.writeByte(this.f1672j.m1196a());
    }

    /* renamed from: a */
    public final void m1187a(XmlSerializer xmlSerializer) throws java.io.IOException {
        xmlSerializer.startTag(null, "Page");
        C1086cd.m2356b(xmlSerializer, "Name", this.f1664b, null);
        C1086cd.m2356b(xmlSerializer, "Key", this.f1665c, null);
        C1086cd.m2356b(xmlSerializer, "Type", mo1193f(), EnumC0539cg.Story);
        C1086cd.m2356b(xmlSerializer, "Image", Integer.valueOf(this.f1666d), -1);
        C1086cd.m2356b(xmlSerializer, "Bookmark", this.f1667e, null);
        C1086cd.m2356b(xmlSerializer, "ImageSize", Long.valueOf(this.f1668f), 0);
        C1086cd.m2356b(xmlSerializer, "ImageWidth", Integer.valueOf(this.f1669g), 0);
        C1086cd.m2356b(xmlSerializer, "ImageHeight", Integer.valueOf(this.f1670h), 0);
        C1086cd.m2356b(xmlSerializer, "Rotation", this.f1671i, EnumC0938i.None);
        C1086cd.m2356b(xmlSerializer, "PagePosition", this.f1672j, EnumC0538cf.Default);
        xmlSerializer.endTag(null, "Page");
    }
}
