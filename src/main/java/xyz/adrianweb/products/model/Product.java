package xyz.adrianweb.products.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
  @Id
  protected String asin;

  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }
}
