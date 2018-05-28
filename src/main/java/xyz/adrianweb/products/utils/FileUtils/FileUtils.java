package xyz.adrianweb.products.utils.FileUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class FileUtils {

    private static Logger logger = Logger.getLogger(FileUtils.class.getName());

    public static Properties loadProperties() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        InputStream configFile = loader.getResourceAsStream("secret.properties");
        try {
            properties.load(configFile);
        } catch (IOException e) {
            logger.warning(e.getMessage());
        }
        return properties;
    }
}
