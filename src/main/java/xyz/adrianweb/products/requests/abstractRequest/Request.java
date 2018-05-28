package xyz.adrianweb.products.requests.abstractRequest;

import xyz.adrianweb.products.utils.FileUtils.FileUtils;
import xyz.adrianweb.products.utils.Helpers.SignedRequestsHelper;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

public abstract class Request {

  private Properties properties = FileUtils.loadProperties();
  private String service = properties.getProperty("service");
  private String associateTag = properties.getProperty("associate.tag");
  private String version = properties.getProperty("version");
  private String domain = properties.getProperty("domain");
  private String accessKey = properties.getProperty("access.key");
  private String secretKey = properties.getProperty("secret.key");
  private String idType = properties.getProperty("idType");
  private String itemIds = "";
  private String responseGroup = "";
  private String operation = "";
  private SignedRequestsHelper requestsHelper;

  protected Request() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    requestsHelper = SignedRequestsHelper.getInstance(getDomain(), getAccessKey(), getSecretKey());

  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
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

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public String getItemIds() {
    return itemIds;
  }

  public void setItemIds(String itemIds) {
    this.itemIds = itemIds;
  }

  public String getResponseGroup() {
    return responseGroup;
  }

  public void setResponseGroup(String responseGroup) {
    this.responseGroup = responseGroup;
  }

  public SignedRequestsHelper getRequestsHelper() {
    return requestsHelper;
  }

  public void setRequestsHelper(SignedRequestsHelper requestsHelper) {
    this.requestsHelper = requestsHelper;
  }

  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }
}
