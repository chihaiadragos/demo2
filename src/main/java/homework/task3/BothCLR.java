package homework.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BothCLR implements CommandLineRunner {
    @Autowired
    //imi aduce toate bean-urile
    private List<DummyLogger3> list;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("[           LIST            ]");
        int index = 0;
        for (DummyLogger3 message : list) {
            System.out.println(index + ": ");
            message.sayHello();
            index++;
        }
    }
}
