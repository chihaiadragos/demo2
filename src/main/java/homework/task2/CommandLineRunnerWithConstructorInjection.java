package homework.task2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private final DummyLogger2 dummyLogger2;

    public CommandLineRunnerWithConstructorInjection(final DummyLogger2 dummyLogger) {
        this.dummyLogger2 = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n[we are in CLR with constructor injection]");
        dummyLogger2.printHello();
    }
}
