package android.support.v4.p002c;

import java.util.Map;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.l */
/* loaded from: classes.dex */
public class C0106l {

    /* renamed from: b */
    static Object[] f358b;

    /* renamed from: c */
    static int f359c;

    /* renamed from: d */
    static Object[] f360d;

    /* renamed from: e */
    static int f361e;

    /* renamed from: f */
    int[] f362f = C0097c.f338a;

    /* renamed from: g */
    Object[] f363g = C0097c.f340c;

    /* renamed from: h */
    int f364h = 0;

    /* renamed from: a */
    private int m279a(Object obj, int i) {
        int i2 = this.f364h;
        if (i2 == 0) {
            return -1;
        }
        int iM270a = C0097c.m270a(this.f362f, i2, i);
        if (iM270a >= 0 && !obj.equals(this.f363g[iM270a << 1])) {
            int i3 = iM270a + 1;
            while (i3 < i2 && this.f362f[i3] == i) {
                if (obj.equals(this.f363g[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM270a - 1; i4 >= 0 && this.f362f[i4] == i; i4--) {
                if (obj.equals(this.f363g[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return iM270a;
    }

    /* renamed from: a */
    private int m278a() {
        int i = this.f364h;
        if (i == 0) {
            return -1;
        }
        int iM270a = C0097c.m270a(this.f362f, i, 0);
        if (iM270a >= 0 && this.f363g[iM270a << 1] != null) {
            int i2 = iM270a + 1;
            while (i2 < i && this.f362f[i2] == 0) {
                if (this.f363g[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM270a - 1; i3 >= 0 && this.f362f[i3] == 0; i3--) {
                if (this.f363g[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return iM270a;
    }

    /* renamed from: a */
    final void m283a(int i) {
        if (i == 8) {
            synchronized (C0095a.class) {
                if (f360d != null) {
                    Object[] objArr = f360d;
                    this.f363g = objArr;
                    f360d = (Object[]) objArr[0];
                    this.f362f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f361e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0095a.class) {
                if (f358b != null) {
                    Object[] objArr2 = f358b;
                    this.f363g = objArr2;
                    f358b = (Object[]) objArr2[0];
                    this.f362f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f359c--;
                    return;
                }
            }
        }
        this.f362f = new int[i];
        this.f363g = new Object[i << 1];
    }

    /* renamed from: a */
    static void m280a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0095a.class) {
                if (f361e < 10) {
                    objArr[0] = f360d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f360d = objArr;
                    f361e++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0095a.class) {
                if (f359c < 10) {
                    objArr[0] = f358b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f358b = objArr;
                    f359c++;
                }
            }
        }
    }

    public void clear() {
        if (this.f364h != 0) {
            m280a(this.f362f, this.f363g, this.f364h);
            this.f362f = C0097c.f338a;
            this.f363g = C0097c.f340c;
            this.f364h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return m281a(obj) >= 0;
    }

    /* renamed from: a */
    public final int m281a(Object obj) {
        return obj == null ? m278a() : m279a(obj, obj.hashCode());
    }

    /* renamed from: b */
    final int m284b(Object obj) {
        int i = 1;
        int i2 = this.f364h * 2;
        Object[] objArr = this.f363g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] != null) {
                    i += 2;
                } else {
                    return i >> 1;
                }
            }
        } else {
            while (i < i2) {
                if (!obj.equals(objArr[i])) {
                    i += 2;
                } else {
                    return i >> 1;
                }
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return m284b(obj) >= 0;
    }

    public Object get(Object obj) {
        int iM281a = m281a(obj);
        if (iM281a >= 0) {
            return this.f363g[(iM281a << 1) + 1];
        }
        return null;
    }

    /* renamed from: b */
    public final Object m285b(int i) {
        return this.f363g[i << 1];
    }

    /* renamed from: c */
    public final Object m286c(int i) {
        return this.f363g[(i << 1) + 1];
    }

    /* renamed from: a */
    public final Object m282a(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object obj2 = this.f363g[i2];
        this.f363g[i2] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f364h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int iHashCode;
        int iM279a;
        int i = 8;
        if (obj == null) {
            iM279a = m278a();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM279a = m279a(obj, iHashCode);
        }
        if (iM279a >= 0) {
            int i2 = (iM279a << 1) + 1;
            Object obj3 = this.f363g[i2];
            this.f363g[i2] = obj2;
            return obj3;
        }
        int i3 = iM279a ^ (-1);
        if (this.f364h >= this.f362f.length) {
            if (this.f364h >= 8) {
                i = this.f364h + (this.f364h >> 1);
            } else if (this.f364h < 4) {
                i = 4;
            }
            int[] iArr = this.f362f;
            Object[] objArr = this.f363g;
            m283a(i);
            if (this.f362f.length > 0) {
                System.arraycopy(iArr, 0, this.f362f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f363g, 0, objArr.length);
            }
            m280a(iArr, objArr, this.f364h);
        }
        if (i3 < this.f364h) {
            System.arraycopy(this.f362f, i3, this.f362f, i3 + 1, this.f364h - i3);
            System.arraycopy(this.f363g, i3 << 1, this.f363g, (i3 + 1) << 1, (this.f364h - i3) << 1);
        }
        this.f362f[i3] = iHashCode;
        this.f363g[i3 << 1] = obj;
        this.f363g[(i3 << 1) + 1] = obj2;
        this.f364h++;
        return null;
    }

    public Object remove(Object obj) {
        int iM281a = m281a(obj);
        if (iM281a >= 0) {
            return m287d(iM281a);
        }
        return null;
    }

    /* renamed from: d */
    public final Object m287d(int i) {
        Object obj = this.f363g[(i << 1) + 1];
        if (this.f364h <= 1) {
            m280a(this.f362f, this.f363g, this.f364h);
            this.f362f = C0097c.f338a;
            this.f363g = C0097c.f340c;
            this.f364h = 0;
        } else if (this.f362f.length > 8 && this.f364h < this.f362f.length / 3) {
            int i2 = this.f364h > 8 ? this.f364h + (this.f364h >> 1) : 8;
            int[] iArr = this.f362f;
            Object[] objArr = this.f363g;
            m283a(i2);
            this.f364h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f362f, 0, i);
                System.arraycopy(objArr, 0, this.f363g, 0, i << 1);
            }
            if (i < this.f364h) {
                System.arraycopy(iArr, i + 1, this.f362f, i, this.f364h - i);
                System.arraycopy(objArr, (i + 1) << 1, this.f363g, i << 1, (this.f364h - i) << 1);
            }
        } else {
            this.f364h--;
            if (i < this.f364h) {
                System.arraycopy(this.f362f, i + 1, this.f362f, i, this.f364h - i);
                System.arraycopy(this.f363g, (i + 1) << 1, this.f363g, i << 1, (this.f364h - i) << 1);
            }
            this.f363g[this.f364h << 1] = null;
            this.f363g[(this.f364h << 1) + 1] = null;
        }
        return obj;
    }

    public int size() {
        return this.f364h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i = 0; i < this.f364h; i++) {
            try {
                Object objM285b = m285b(i);
                Object objM286c = m286c(i);
                Object obj2 = map.get(objM285b);
                if (objM286c == null) {
                    if (obj2 != null || !map.containsKey(objM285b)) {
                        return false;
                    }
                } else if (!objM286c.equals(obj2)) {
                    return false;
                }
            } catch (ClassCastException e) {
                return false;
            } catch (NullPointerException e2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f362f;
        Object[] objArr = this.f363g;
        int i = this.f364h;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f364h * 28);
        sb.append('{');
        for (int i = 0; i < this.f364h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM285b = m285b(i);
            if (objM285b != this) {
                sb.append(objM285b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM286c = m286c(i);
            if (objM286c != this) {
                sb.append(objM286c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
