package homework.task4cyclicaldep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class TestConfig implements CommandLineRunner {
    /**
     * Create 3 beans in a class named UtilConfiguration:
     * <p>
     * -> a bean named dummyLogger which is an implementation of the DummyLogger class
     * -> a bean named listUtility implementing the ListUtil class.
     * Use the method name to establish the correct bean name.
     * -> bean named stringUtility which is an implementation of the StringUtil class.
     * The method creating this bean should be named stringUtil.
     */
    @Bean
    public DummyLogger4 dummyLogger4(){
        return new DummyLogger4();
    }
    @Bean
    public ListUtil listUtil(){
        return new ListUtil();
    }
    @Bean(name = "testStringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }

    @Autowired
    private DummyLogger4 dummyLogger4;
    @Autowired
    private ListUtil listUtil;
    @Autowired
    @Qualifier(value = "testStringUtility")
    private StringUtil stringUtil;

    @Override
    public void run(String... args) throws Exception {
        dummyLogger4.sayHi();
        System.out.println(listUtil.sumElements(Arrays.asList(1,2,3)));
        System.out.println(stringUtil.formSentence(List.of("a", "b", "c")));
    }
}
