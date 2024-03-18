package homework.task1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class DummyLogger1 implements InitializingBean, ApplicationListener<ApplicationReadyEvent>, ApplicationRunner {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("\nHello from exercise 1 - afterPropertiesSet()");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("\nHello from exercise 1 - postConstruct()");

    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("\nHello monkey");
        System.out.println("[we are in task1 - ApplicationReadyEvent]");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("we are using ApplicationRunner here :)");
    }
}
