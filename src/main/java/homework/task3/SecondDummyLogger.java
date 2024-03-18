package homework.task3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SecondDummyLogger implements DummyLogger3{
    @Override
    public void sayHello() {
        System.out.println("We are in SecondDummyLogger - I'm the primary BEAN :)\n<TASK3>");
    }
}
