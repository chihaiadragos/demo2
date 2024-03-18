package homework.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithFieldInjection implements CommandLineRunner {
    @Autowired
    private DummyLogger2 dummyLogger2;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n[we are in CLR with field injection]");
        dummyLogger2.printHello();
    }
}
