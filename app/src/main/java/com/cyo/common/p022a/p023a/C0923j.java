package com.cyo.common.p022a.p023a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLUtils;
import com.cyo.common.p022a.AbstractC0934e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL11;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.a.a.j */
/* loaded from: classes.dex */
public final class C0923j extends AbstractC0934e {

    /* renamed from: a */
    private int f2773a;

    /* renamed from: b */
    private int f2774b;

    /* renamed from: c */
    private GL11 f2775c;

    /* renamed from: d */
    private boolean f2776d;

    /* renamed from: e */
    private FloatBuffer f2777e;

    /* renamed from: f */
    private FloatBuffer f2778f;

    /* renamed from: g */
    private Stack f2779g = new Stack();

    /* renamed from: h */
    private LinkedList f2780h = new LinkedList();

    public C0923j(GL gl, int i, int i2) {
        this.f2775c = (GL11) gl;
        this.f2773a = i;
        this.f2774b = i2;
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1926a() {
        if (!this.f2776d) {
            this.f2775c.glDisable(2929);
            this.f2775c.glDisable(2884);
            this.f2775c.glDisable(3024);
            this.f2775c.glShadeModel(7424);
            this.f2775c.glEnable(3042);
            this.f2775c.glBlendFunc(770, 771);
            this.f2775c.glViewport(0, 0, this.f2773a, this.f2774b);
            this.f2775c.glMatrixMode(5889);
            this.f2775c.glLoadIdentity();
            this.f2775c.glOrthof(0.0f, this.f2773a, this.f2774b, 0.0f, 0.0f, 1.0f);
            this.f2775c.glMatrixMode(5888);
            this.f2775c.glLoadIdentity();
            Stack stack = this.f2779g;
            float[] fArr = new float[16];
            fArr[15] = 1.0f;
            fArr[10] = 1.0f;
            fArr[5] = 1.0f;
            fArr[0] = 1.0f;
            stack.push(fArr);
            this.f2776d = true;
        }
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: b */
    public final void mo1932b() {
        this.f2775c.glFinish();
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: f */
    public final int mo1937f() {
        return this.f2773a;
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: g */
    public final int mo1938g() {
        return this.f2774b;
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: h */
    public final boolean mo1939h() {
        return true;
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1930a(Rect rect) {
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: c */
    public final void mo1934c() {
        this.f2775c.glPushMatrix();
        this.f2779g.push((float[]) this.f2779g.peek());
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: d */
    public final void mo1935d() {
        this.f2775c.glPopMatrix();
        this.f2779g.pop();
    }

    /* renamed from: j */
    private Matrix m1925j() {
        float[] fArr = (float[]) this.f2779g.peek();
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* renamed from: b */
    private void m1924b(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = {fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 0.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
        this.f2775c.glLoadMatrixf(fArr2, 0);
        this.f2779g.set(this.f2779g.size() - 1, fArr2);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1927a(float f, float f2) {
        Matrix matrixM1925j = m1925j();
        matrixM1925j.preTranslate(f, f2);
        m1924b(matrixM1925j);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: b */
    public final void mo1933b(float f, float f2) {
        Matrix matrixM1925j = m1925j();
        matrixM1925j.preScale(f, f2);
        m1924b(matrixM1925j);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1929a(Matrix matrix) {
        Matrix matrixM1925j = m1925j();
        matrixM1925j.preConcat(matrix);
        m1924b(matrixM1925j);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: e */
    public final void mo1936e() {
        this.f2775c.glClearColor(Color.red(-16777216) / 255.0f, Color.green(-16777216) / 255.0f, Color.blue(-16777216) / 255.0f, Color.alpha(-16777216) / 255.0f);
        this.f2775c.glClear(16384);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1931a(Rect rect, Paint paint) {
        int color = paint.getColor();
        if (Color.alpha(color) >= 5) {
            float[] fArr = {rect.left, rect.top, rect.left, rect.bottom, rect.right, rect.top, rect.right, rect.bottom};
            if (this.f2777e == null) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                this.f2777e = byteBufferAllocateDirect.asFloatBuffer();
            }
            for (int i = 0; i < fArr.length; i++) {
                this.f2777e.put(i, fArr[i]);
            }
            this.f2775c.glColor4f(Color.red(color) / 255.0f, Color.green(color) / 255.0f, Color.blue(color) / 255.0f, Color.alpha(color) / 255.0f);
            this.f2775c.glEnableClientState(32884);
            this.f2775c.glVertexPointer(2, 5126, 0, this.f2777e);
            this.f2775c.glDrawArrays(5, 0, 4);
            this.f2775c.glDisableClientState(32884);
        }
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: a */
    public final void mo1928a(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        int i;
        float[] fArr = {rect.left / bitmap.getWidth(), rect.top / bitmap.getHeight(), rect.left / bitmap.getWidth(), rect.bottom / bitmap.getHeight(), rect.right / bitmap.getWidth(), rect.top / bitmap.getHeight(), rect.right / bitmap.getWidth(), rect.bottom / bitmap.getHeight()};
        if (this.f2778f == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            this.f2778f = byteBufferAllocateDirect.asFloatBuffer();
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            this.f2778f.put(i2, fArr[i2]);
        }
        this.f2775c.glEnable(3553);
        this.f2775c.glEnableClientState(32888);
        this.f2775c.glTexCoordPointer(2, 5126, 0, this.f2778f);
        GL11 gl11 = this.f2775c;
        ListIterator listIterator = this.f2780h.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                C0924k c0924k = (C0924k) listIterator.next();
                Bitmap bitmap2 = (Bitmap) c0924k.f2782b.get();
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    if (bitmap2 == bitmap) {
                        listIterator.remove();
                        this.f2780h.add(c0924k);
                        i = c0924k.f2781a;
                        break;
                    }
                } else {
                    listIterator.remove();
                    this.f2775c.glDeleteTextures(1, new int[]{c0924k.f2781a}, 0);
                }
            } else {
                int[] iArr = new int[1];
                this.f2775c.glGenTextures(1, iArr, 0);
                int i3 = iArr[0];
                Bitmap bitmapCreateScaledBitmap = (bitmap.getWidth() == 256 && bitmap.getHeight() == 256) ? bitmap : Bitmap.createScaledBitmap(bitmap, 256, 256, true);
                this.f2775c.glBindTexture(3553, i3);
                this.f2775c.glTexParameterf(3553, 10241, 9729.0f);
                this.f2775c.glTexParameterf(3553, 10240, 9729.0f);
                this.f2775c.glTexParameterf(3553, 10242, 33071.0f);
                this.f2775c.glTexParameterf(3553, 10243, 33071.0f);
                GLUtils.texImage2D(3553, 0, bitmapCreateScaledBitmap, 0);
                if (bitmapCreateScaledBitmap != bitmap) {
                    bitmapCreateScaledBitmap.recycle();
                }
                this.f2780h.add(new C0924k(i3, bitmap));
                ListIterator listIterator2 = this.f2780h.listIterator();
                while (listIterator2.hasNext()) {
                    C0924k c0924k2 = (C0924k) listIterator2.next();
                    Bitmap bitmap3 = (Bitmap) c0924k2.f2782b.get();
                    if (bitmap3 == null || bitmap3.isRecycled()) {
                        listIterator2.remove();
                        this.f2775c.glDeleteTextures(1, new int[]{c0924k2.f2781a}, 0);
                    }
                }
                m1923a(96);
                i = i3;
            }
        }
        gl11.glBindTexture(3553, i);
        int alpha = paint.getAlpha();
        paint.setColor(-1);
        paint.setAlpha(alpha);
        mo1931a(rect2, paint);
        this.f2775c.glDisable(3553);
        this.f2775c.glDisableClientState(32888);
    }

    @Override // com.cyo.common.p022a.AbstractC0934e
    /* renamed from: i */
    public final void mo1940i() {
        m1923a(0);
        super.mo1940i();
    }

    /* renamed from: a */
    private void m1923a(int i) {
        while (this.f2780h.size() > i) {
            C0924k c0924k = (C0924k) this.f2780h.getFirst();
            this.f2780h.removeFirst();
            this.f2775c.glDeleteTextures(1, new int[]{c0924k.f2781a}, 0);
        }
    }
}
