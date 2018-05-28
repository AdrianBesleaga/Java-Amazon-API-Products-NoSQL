package xyz.adrianweb.products.repository;

import com.amazon.webservices.awsecommerceservice.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Item, String> {
  public Optional<Item> findById(String id);
  public List<Item> findByItemAttributes_Category(String category);
}
