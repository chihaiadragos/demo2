package homework.task3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrimaryCLR implements CommandLineRunner {
    private final DummyLogger3 dummyLogger3;

    public PrimaryCLR(final DummyLogger3 dummyLogger3) {
        this.dummyLogger3 = dummyLogger3;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n[@Primary]");
        dummyLogger3.sayHello();
    }
}
