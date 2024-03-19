package homework.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Task4 implements CommandLineRunner {
    @Autowired
    private DummyLogger4 dummyLogger4;
    @Autowired
    private ListUtil listUtil;
    @Autowired
    @Qualifier(value = "stringUtility")
    private StringUtil stringUtil;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n[DummyLogger4 - sayHi()]");
        dummyLogger4.sayHi();
        System.out.println("\n[ListUtil - sumElements()]");
        System.out.println(listUtil.sumElements(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        System.out.println("\n[StringUtil - sumElements()]");
        System.out.println(stringUtil.formSentence(List.of("Mihai", "Dorin", "Alex", "Andreea", "Bogdan", "Mihaela")));
    }
}
