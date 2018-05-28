package xyz.adrianweb.products.main;

import com.amazon.webservices.awsecommerceservice.ItemLookupResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import xyz.adrianweb.products.repository.ProductRepository;
import xyz.adrianweb.products.requests.ItemLookupRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Working {

  private static Logger logger = Logger.getLogger(Working.class.getName());

  public static void main(String[] args) throws Exception {
    List<String> itemdIds = new ArrayList<>();
    itemdIds.add("B074T3S4CW");
    itemdIds.add("B00AD5KY6W");
    ItemLookupRequest itemLookupRequest = new ItemLookupRequest();
    ItemLookupResponse itemLookupResponse = itemLookupRequest.getResponse(itemdIds);
    logger.info(new ObjectMapper().writeValueAsString(itemLookupResponse.getItems()));


  }
}