package android.support.v4.p002c;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.a */
/* loaded from: classes.dex */
public class C0095a extends C0106l implements Map {

    /* renamed from: a */
    AbstractC0100f f336a;

    /* renamed from: a */
    private AbstractC0100f m258a() {
        if (this.f336a == null) {
            this.f336a = new C0096b(this);
        }
        return this.f336a;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        int size = this.f364h + map.size();
        if (this.f362f.length < size) {
            int[] iArr = this.f362f;
            Object[] objArr = this.f363g;
            super.m283a(size);
            if (this.f364h > 0) {
                System.arraycopy(iArr, 0, this.f362f, 0, this.f364h);
                System.arraycopy(objArr, 0, this.f363g, 0, this.f364h << 1);
            }
            C0106l.m280a(iArr, objArr, this.f364h);
        }
        for (Object valueForentry : map.entrySet()) {
            Map.Entry entry = (Map.Entry) valueForentry;
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final boolean m259a(Collection collection) {
        return AbstractC0100f.m274a((Map) this, collection);
    }

    @Override // java.util.Map
    public Set entrySet() {
        AbstractC0100f abstractC0100fM258a = m258a();
        if (abstractC0100fM258a.f343b == null) {
            abstractC0100fM258a.f343b = new C0102h(abstractC0100fM258a);
        }
        return abstractC0100fM258a.f343b;
    }

    @Override // java.util.Map
    public Set keySet() {
        AbstractC0100f abstractC0100fM258a = m258a();
        if (abstractC0100fM258a.f344c == null) {
            abstractC0100fM258a.f344c = new C0103i(abstractC0100fM258a);
        }
        return abstractC0100fM258a.f344c;
    }

    @Override // java.util.Map
    public Collection values() {
        AbstractC0100f abstractC0100fM258a = m258a();
        if (abstractC0100fM258a.f345d == null) {
            abstractC0100fM258a.f345d = new C0105k(abstractC0100fM258a);
        }
        return abstractC0100fM258a.f345d;
    }
}
