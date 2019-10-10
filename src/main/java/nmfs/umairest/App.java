package nmfs.umairest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDateTime;
@SpringBootApplication
//@EnableSwagger2
@ComponentScan("nmfs.umairest")
public class App {
    static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(App.class, args);
        logger.info("UMAI Rest Service started " + LocalDateTime.now());
        Thread.sleep(50000);
    }
}
