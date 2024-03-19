package homework.task4;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
//@Configuration???????
public class UtilConfiguration  {

    /**
     * Create 3 beans in a class named UtilConfiguration:
     * <p>
     * -> a bean named dummyLogger which is an implementation of the DummyLogger class
     * -> a bean named listUtility implementing the ListUtil class. Use the method name to establish the correct bean name.
     * -> bean named stringUtility which is an implementation of the StringUtil class. The method creating this bean should be named stringUtil.
     */
    @Bean
    public DummyLogger4 dummyLogger4() {
        return new DummyLogger4();
    }

    @Bean
    public ListUtil listUtility() {
        return new ListUtil();
    }

    @Bean(name = "stringUtility")
    public StringUtil stringUtil() {
        return new StringUtil();
    }
//DEPENDENTA CIRCULARA :((( -> mutat in clasa Task4
    //beanurile nu pot fi injectate in clasele unde sunt definite

}
