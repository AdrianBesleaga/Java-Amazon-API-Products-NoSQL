package xyz.adrianweb.products.utils.EncodeUtils;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EncodeUtils {

    public static String sign(String key, String data) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        Mac sha256HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256HMAC.init(secretKey);
        byte[] encrypted = sha256HMAC.doFinal(data.getBytes("UTF-8"));
        return Base64.encodeBase64String(encrypted);
    }
}
