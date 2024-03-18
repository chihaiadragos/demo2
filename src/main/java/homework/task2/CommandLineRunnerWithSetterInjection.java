package homework.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {
    private DummyLogger2 dummyLogger2;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n[we are in CLR with setter injection]");
        dummyLogger2.printHello();
    }
    @Autowired
    public void setDummyLogger2(DummyLogger2 dummyLogger2) {
        this.dummyLogger2 = dummyLogger2;
    }
}
