package twitter4j;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class HttpParameter implements Serializable, Comparable {
    private static final String GIF = "image/gif";
    private static final String JPEG = "image/jpeg";
    private static final String OCTET = "application/octet-stream";
    private static final String PNG = "image/png";
    private static final long serialVersionUID = 4046908449190454692L;
    private File file;
    private InputStream fileBody;
    private String name;
    private String value;

    public HttpParameter(String str, String str2) {
        this.name = null;
        this.value = null;
        this.file = null;
        this.fileBody = null;
        this.name = str;
        this.value = str2;
    }

    public HttpParameter(String str, File file) {
        this.name = null;
        this.value = null;
        this.file = null;
        this.fileBody = null;
        this.name = str;
        this.file = file;
    }

    public HttpParameter(String str, String str2, InputStream inputStream) {
        this.name = null;
        this.value = null;
        this.file = null;
        this.fileBody = null;
        this.name = str;
        this.file = new File(str2);
        this.fileBody = inputStream;
    }

    public HttpParameter(String str, int i) {
        this.name = null;
        this.value = null;
        this.file = null;
        this.fileBody = null;
        this.name = str;
        this.value = String.valueOf(i);
    }

    public HttpParameter(String str, long j) {
        this.name = null;
        this.value = null;
        this.file = null;
        this.fileBody = null;
        this.name = str;
        this.value = String.valueOf(j);
    }

    public HttpParameter(String str, double d) {
        this.name = null;
        this.value = null;
        this.file = null;
        this.fileBody = null;
        this.name = str;
        this.value = String.valueOf(d);
    }

    public HttpParameter(String str, boolean z) {
        this.name = null;
        this.value = null;
        this.file = null;
        this.fileBody = null;
        this.name = str;
        this.value = String.valueOf(z);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final File getFile() {
        return this.file;
    }

    public final InputStream getFileBody() {
        return this.fileBody;
    }

    public final boolean isFile() {
        return this.file != null;
    }

    public final boolean hasFileBody() {
        return this.fileBody != null;
    }

    public final String getContentType() {
        if (!isFile()) {
            throw new IllegalStateException("not a file");
        }
        String name = this.file.getName();
        if (-1 != name.lastIndexOf(".")) {
            String lowerCase = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
            if (lowerCase.length() == 3) {
                if ("gif".equals(lowerCase)) {
                    return GIF;
                }
                if ("png".equals(lowerCase)) {
                    return PNG;
                }
                if ("jpg".equals(lowerCase)) {
                    return JPEG;
                }
                return OCTET;
            }
            if (lowerCase.length() == 4 && "jpeg".equals(lowerCase)) {
                return JPEG;
            }
            return OCTET;
        }
        return OCTET;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpParameter)) {
            return false;
        }
        HttpParameter httpParameter = (HttpParameter) obj;
        if (this.file == null ? httpParameter.file != null : !this.file.equals(httpParameter.file)) {
            return false;
        }
        if (this.fileBody == null ? httpParameter.fileBody != null : !this.fileBody.equals(httpParameter.fileBody)) {
            return false;
        }
        if (!this.name.equals(httpParameter.name)) {
            return false;
        }
        if (this.value != null) {
            if (this.value.equals(httpParameter.value)) {
                return true;
            }
        } else if (httpParameter.value == null) {
            return true;
        }
        return false;
    }

    public static boolean containsFile(HttpParameter[] httpParameterArr) {
        if (httpParameterArr == null) {
            return false;
        }
        for (HttpParameter httpParameter : httpParameterArr) {
            if (httpParameter.isFile()) {
                return true;
            }
        }
        return false;
    }

    static boolean containsFile(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((HttpParameter) it.next()).isFile()) {
                return true;
            }
        }
        return false;
    }

    public static HttpParameter[] getParameterArray(String str, String str2) {
        return new HttpParameter[]{new HttpParameter(str, str2)};
    }

    public static HttpParameter[] getParameterArray(String str, int i) {
        return getParameterArray(str, String.valueOf(i));
    }

    public static HttpParameter[] getParameterArray(String str, String str2, String str3, String str4) {
        return new HttpParameter[]{new HttpParameter(str, str2), new HttpParameter(str3, str4)};
    }

    public static HttpParameter[] getParameterArray(String str, int i, String str2, int i2) {
        return getParameterArray(str, String.valueOf(i), str2, String.valueOf(i2));
    }

    public final int hashCode() {
        return (((this.file != null ? this.file.hashCode() : 0) + (((this.value != null ? this.value.hashCode() : 0) + (this.name.hashCode() * 31)) * 31)) * 31) + (this.fileBody != null ? this.fileBody.hashCode() : 0);
    }

    public final String toString() {
        return "PostParameter{name='" + this.name + "', value='" + this.value + "', file=" + this.file + ", fileBody=" + this.fileBody + '}';
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        HttpParameter httpParameter = (HttpParameter) obj;
        int iCompareTo = this.name.compareTo(httpParameter.name);
        if (iCompareTo == 0) {
            return this.value.compareTo(httpParameter.value);
        }
        return iCompareTo;
    }

    public static String encodeParameters(HttpParameter[] httpParameterArr) {
        if (httpParameterArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < httpParameterArr.length; i++) {
            if (httpParameterArr[i].isFile()) {
                throw new IllegalArgumentException("parameter [" + httpParameterArr[i].name + "]should be text");
            }
            if (i != 0) {
                sb.append("&");
            }
            sb.append(encode(httpParameterArr[i].name)).append("=").append(encode(httpParameterArr[i].value));
        }
        return sb.toString();
    }

    public static String encode(String str) throws UnsupportedEncodingException {
        String strEncode = null;
        try {
            strEncode = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
        StringBuilder sb = new StringBuilder(strEncode.length());
        int i = 0;
        while (i < strEncode.length()) {
            char cCharAt = strEncode.charAt(i);
            if (cCharAt == '*') {
                sb.append("%2A");
            } else if (cCharAt == '+') {
                sb.append("%20");
            } else if (cCharAt == '%' && i + 1 < strEncode.length() && strEncode.charAt(i + 1) == '7' && strEncode.charAt(i + 2) == 'E') {
                sb.append('~');
                i += 2;
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }
}
