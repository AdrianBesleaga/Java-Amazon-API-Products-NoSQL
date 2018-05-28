package xyz.adrianweb.products.controller;

import com.amazon.webservices.awsecommerceservice.Item;
import com.amazon.webservices.awsecommerceservice.ItemLookupResponse;
import com.amazon.webservices.awsecommerceservice.Items;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import xyz.adrianweb.products.repository.ProductRepository;
import xyz.adrianweb.products.requests.ItemLookupRequest;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class itemLookupController {

  @Autowired
  private ProductRepository productRepository;

  private ObjectMapper jacksonMapper = new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true);

  @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(HttpStatus.OK)
  @CrossOrigin(origins = "http://localhost:4200")
  public String getProduct(@RequestParam(name = "id") String id) throws IOException {
    Optional<Item> product = productRepository.findById(id);
    if (product.isPresent()) {
      return jacksonMapper.writeValueAsString(product.get());
    }
    return "not found";
  }

  //TODO ID validation for Security
  @RequestMapping(value = "/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(HttpStatus.OK)
  public String insert(@RequestParam(name = "id") String id) throws IOException, InvalidKeyException, NoSuchAlgorithmException, JAXBException {
    Optional<Item> productFromDB;
    List<String> itemIds = new ArrayList<>();
    itemIds.add(id);
    ItemLookupRequest itemLookupRequest = new ItemLookupRequest();
    ItemLookupResponse itemLookupResponse = itemLookupRequest.getResponse(itemIds);
    Items items = itemLookupResponse.getItems().get(0);
    Item product = items.getItem().get(0);
    productFromDB = productRepository.findById(id);
    if (!productFromDB.isPresent()) {
      productRepository.save(product);
    }
    productFromDB = productRepository.findById(id);
    if (productFromDB.isPresent()) {
      return jacksonMapper.writeValueAsString(productFromDB.get());
    }
    return "not found";
  }
}
