package xyz.adrianweb.products.old.builders;

import xyz.adrianweb.products.old.pojo.Request;
import xyz.adrianweb.products.utils.EncodeUtils.EncodeUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class RequestBuilder {

    public static String buildSigned(Request request) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String unsigned = buildUnsigned(request);
        String signed = EncodeUtils.sign(request.getSecret(), unsigned);
        String signedEncoded = URLEncoder.encode(signed, "UTF-8");
        request.setSignature("Signature=" + signedEncoded);
        return buildURL(request);
    }

    private static String buildUnsigned(Request request) {
        return request.getEndpoint() +
                request.getAccessKeyId() + "&" +
                request.getAssociateTag() + "&" +
                request.getItemId() + "&" +
                request.getOperation() + "&" +
                request.getResponseGroup() + "&" +
                request.getService() + "&" +
                request.getTimestamp() + "&" +
                request.getVersion();
    }

    private static String buildURL(Request request) {
        return "http://webservices.amazon.com/onca/xml?" +
                request.getAccessKeyId() + "&" +
                request.getAssociateTag() + "&" +
                request.getItemId() + "&" +
                request.getOperation() + "&" +
                request.getResponseGroup() + "&" +
                request.getService() + "&" +
                request.getTimestamp() + "&" +
                request.getVersion() + "&" +
                request.getSignature();
    }
}
