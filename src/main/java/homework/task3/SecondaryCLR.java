package homework.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondaryCLR implements CommandLineRunner {
    @Autowired
    @Qualifier("monkey")
    private DummyLogger3 dummyLogger3;

//    public SecondaryCLR(@Qualifier("monkey") final DummyLogger3 dummyLogger3) {
//        this.dummyLogger3 = dummyLogger3;
//    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n[SecondaryCLR]");
        dummyLogger3.sayHello();
    }
}
