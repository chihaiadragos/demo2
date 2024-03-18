package homework.task3;

import org.springframework.stereotype.Component;

@Component(value = "monkey")
public class FirstDummyLogger implements DummyLogger3{
    @Override
    public void sayHello() {
        System.out.println("we are in FirstDummyLogger - monkey\n<TASK3>");
    }
}
