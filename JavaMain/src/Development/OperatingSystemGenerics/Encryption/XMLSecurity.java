package Development.OperatingSystemGenerics.Encryption;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class XMLSecurity {
    private static final char[] FIELD_PASSWORD = "h&@5Au70MaT1On".toCharArray();
    private static final byte[] FIELD_SALT = new byte[]{-34, -83, -66, -17, -66, -17, -34, -83};

    public XMLSecurity() {
    }

    protected String encryptField(String parField) {
        String retVal = "";

        try {
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
            SecretKey key = keyFactory.generateSecret(new PBEKeySpec(FIELD_PASSWORD));
            Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
            pbeCipher.init(1, key, new PBEParameterSpec(FIELD_SALT, 20));
            retVal = (new BASE64Encoder()).encode(pbeCipher.doFinal(parField.getBytes("US-ASCII")));
        } catch (UnsupportedEncodingException | GeneralSecurityException var6) {
            var6.printStackTrace();
        }

        return retVal;
    }

    protected String decryptField(String parField) {
        String retVal = "";

        try {
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
            SecretKey key = keyFactory.generateSecret(new PBEKeySpec(FIELD_PASSWORD));
            Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
            pbeCipher.init(2, key, new PBEParameterSpec(FIELD_SALT, 20));
            retVal = new String(pbeCipher.doFinal((new BASE64Decoder()).decodeBuffer(parField)), "US-ASCII");
        } catch (IOException | GeneralSecurityException var6) {
            var6.printStackTrace();
        }

        return retVal;
    }
}
