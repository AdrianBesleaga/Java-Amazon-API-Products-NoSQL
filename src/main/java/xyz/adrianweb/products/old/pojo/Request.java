package xyz.adrianweb.products.old.pojo;

import xyz.adrianweb.products.utils.FileUtils.FileUtils;
import xyz.adrianweb.products.utils.TimeUtils.TimeUtils;

import java.util.Properties;

public class Request {

    private String endpoint = "GET\n" + "webservices.amazon.com\n" + "/onca/xml\n";
    private String service = "Service=AWSECommerceService";
    private String associateTag = "AssociateTag=gloutique-20";
    private String accessKeyId = "AWSAccessKeyId=AKIAIES6UQXOUY7GQ2JA";
    private String operation = "Operation=ItemLookupRequest";
    private String itemId = "ItemId=0679722769";
    private String responseGroup = "ResponseGroup=ItemAttributes";
    private String version = "Version=2013-08-01";
    private String timestamp = "Timestamp=" + TimeUtils.getTimestamp();
    private String signature = "";
    private String secret = FileUtils.loadProperties().getProperty("secret.key");
    private Properties properties = FileUtils.loadProperties();

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAssociateTag() {
        return associateTag;
    }

    public void setAssociateTag(String associateTag) {
        this.associateTag = associateTag;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getResponseGroup() {
        return responseGroup;
    }

    public void setResponseGroup(String responseGroup) {
        this.responseGroup = responseGroup;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
