package base;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class RestAPI {

    protected String apiKey;
    protected Properties properties;
    protected InputStream inputStream;
    protected String baseUrl;


    public RestAPI() {
        this.baseUrl = "https://app.timecamp.com/third_party/api";
        this.properties = new Properties();

        try {

            this.inputStream = new FileInputStream("src/test/java/secret.properties");
            this.properties.load(this.inputStream);
            this.apiKey = this.properties.getProperty("apiKey");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not load Properly");
        } finally {
            try {
                this.inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


}
