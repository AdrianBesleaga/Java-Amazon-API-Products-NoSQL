package xyz.adrianweb.products.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "xyz.adrianweb.products.repository")
@ComponentScan(basePackages = "xyz.adrianweb.products.controller")
public class ProductsApplication {

  public static void main(String[] args) {

    SpringApplication.run(ProductsApplication.class, args);

  }
}
