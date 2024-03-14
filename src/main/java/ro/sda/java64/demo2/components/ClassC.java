package ro.sda.java64.demo2.components;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

public class ClassC implements CommandLineRunner {
    private ClassD classD;
    @PostConstruct
    public void setClassD(){
        this.classD = classD;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Initializing postconstruct" + classD);
    }
}
