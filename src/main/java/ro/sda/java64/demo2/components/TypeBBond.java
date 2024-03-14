package ro.sda.java64.demo2.components;

import org.springframework.stereotype.Component;

@Component
public class TypeBBond implements BondInterface{

    public TypeBBond() {
        System.out.println("Constructing " + this.getClass().getName());
    }

    @Override
    public String getName() {
        return null;
    }
}
