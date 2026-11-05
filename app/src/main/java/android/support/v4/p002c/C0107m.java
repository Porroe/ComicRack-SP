package android.support.v4.p002c;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.m */
/* loaded from: classes.dex */
public final class C0107m implements Cloneable {

    /* renamed from: a */
    private static final Object f365a = new Object();

    /* renamed from: b */
    private boolean f366b;

    /* renamed from: c */
    private int[] f367c;

    /* renamed from: d */
    private Object[] f368d;

    /* renamed from: e */
    private int f369e;

    public final /* synthetic */ Object clone() {
        return m288c();
    }

    public C0107m() {
        this((byte) 0);
    }

    private C0107m(byte b) {
        this.f366b = false;
        C0097c.m269a();
        this.f367c = new int[13];
        this.f368d = new Object[13];
        this.f369e = 0;
    }

    /* renamed from: c */
    private C0107m m288c() {
        try {
            C0107m c0107m = (C0107m) super.clone();
            c0107m.f367c = this.f367c.clone();
            c0107m.f368d = this.f368d.clone();
            return c0107m;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: d */
    private void m289d() {
        int i = this.f369e;
        int[] iArr = this.f367c;
        Object[] objArr = this.f368d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f365a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f366b = false;
        this.f369e = i2;
    }

    /* renamed from: a */
    public final int m290a() {
        if (this.f366b) {
            m289d();
        }
        return this.f369e;
    }

    /* renamed from: a */
    public final int m291a(int i) {
        if (this.f366b) {
            m289d();
        }
        return this.f367c[i];
    }

    /* renamed from: b */
    public final Object m292b(int i) {
        if (this.f366b) {
            m289d();
        }
        return this.f368d[i];
    }

    /* renamed from: b */
    public final void m293b() {
        int i = this.f369e;
        Object[] objArr = this.f368d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f369e = 0;
        this.f366b = false;
    }

    public final String toString() {
        if (m290a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f369e * 28);
        sb.append('{');
        for (int i = 0; i < this.f369e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m291a(i));
            sb.append('=');
            Object objM292b = m292b(i);
            if (objM292b != this) {
                sb.append(objM292b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
