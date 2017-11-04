import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by radoslaw.lalowicz on 2017-11-04.
 */
@EnableAutoConfiguration
@ComponentScan("pl.lalowicz")
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
