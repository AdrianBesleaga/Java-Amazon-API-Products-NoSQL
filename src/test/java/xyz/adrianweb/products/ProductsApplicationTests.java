package xyz.adrianweb.products;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.adrianweb.products.main.ProductsApplication;

// @RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = "classpath:application.properties")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ProductsApplication.class)
public class ProductsApplicationTests {

  @Test
  public void contextLoads() {
  }

}
