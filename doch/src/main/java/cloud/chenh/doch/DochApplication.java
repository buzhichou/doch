package cloud.chenh.doch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DochApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DochApplication.class, args);
    }
    
}
