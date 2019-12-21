package generics.decorator;
import java.util.*;
import generics.coffee.*;

class BasicCoffee {
    private String value;
    public void set(String val) {
        value = val;
    }
    public String get() {
        return value;
    }
}

class DecoratorCoffee extends BasicCoffee {
    protected BasicCoffee basicCoffee;
    public DecoratorCoffee(BasicCoffee basicC) {
        this.basicCoffee = basicC;
    }
    public void set(String val) {
        basicCoffee.set(val);
    }

    @Override
    public String get() {
        return basicCoffee.get();
    }
}

class CappucinoDecorator extends DecoratorCoffee {
    public CappucinoDecorator(BasicCoffee basicC) {
        super(basicC);
    }
    @Override
    public String get() {
        return super.get();
    }

    @Override
    public void set(String val) {
        super.set(val);
    }
}

public class CoffeeDecorator {
    public static void main(String[] args) {
        CappucinoDecorator cd = new CappucinoDecorator(new BasicCoffee());
        cd.set("Cappuccino");
        System.out.println(cd.get());
    }
}
