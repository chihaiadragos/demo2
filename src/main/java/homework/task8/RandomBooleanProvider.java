package homework.task8;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;
@Component
@RequestScope
public class RandomBooleanProvider {
    private final int value = new Random().nextInt(0,10);

    public int getValue() {
        return value;
    }
}