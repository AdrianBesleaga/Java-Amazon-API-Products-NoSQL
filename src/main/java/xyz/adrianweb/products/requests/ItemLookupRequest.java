package xyz.adrianweb.products.requests;

import com.amazon.webservices.awsecommerceservice.ItemLookupResponse;
import xyz.adrianweb.products.requests.abstractRequest.Request;
import xyz.adrianweb.products.utils.HttpUtils.HttpUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemLookupRequest extends Request {

  private String operation = "ItemLookup";
  private String responseGroup = "ItemAttributes,Large,Reviews,VariationImages";


  public ItemLookupRequest() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
  }

  public ItemLookupResponse getResponse(List<String> itemIds) throws JAXBException, IOException {
    Map<String, String> parameters = buildParameters(itemIds);
    String link = getRequestsHelper().sign(parameters);
    HttpURLConnection response = HttpUtils.get(link);
    JAXBContext jaxbContext = JAXBContext.newInstance(ItemLookupResponse.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    ItemLookupResponse itemLookupResponse = (ItemLookupResponse) unmarshaller.unmarshal(response.getInputStream());
    response.disconnect();
    return itemLookupResponse;
  }

  private Map<String, String> buildParameters(List<String> itemIds) {
    Map<String, String> parameters = new HashMap<>();
    String itemIdsCommaSeparated = itemIds.stream().collect(Collectors.joining(","));
    parameters.put("Service", getService());
    parameters.put("AssociateTag", getAssociateTag());
    parameters.put("ItemId", itemIdsCommaSeparated);
    parameters.put("IdType", getIdType());
    parameters.put("Operation", operation);
    parameters.put("ResponseGroup", responseGroup);
    parameters.put("Version", getVersion());
    return parameters;
  }
}
