package typeinfo;
import java.util.*;

public class SnowRemovalRobot implements Robot {
    private String name;
    public SnowRemovalRobot(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "SnowBot Series 11";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(new Operation() {
            @Override
            public String description() {
                return name + " can shove1 snow";
            }

            @Override
            public void command() {
                System.out.println(name + " shovelling snow");
            }
        }, new Operation() {
            @Override
            public String description() {
                return name + " can chip ice";
            }

            @Override
            public void command() {
                System.out.println(name + " chipping ice");
            }
        }, new Operation() {
            @Override
            public String description() {
                return name + " can clear the roof";
            }

            @Override
            public void command() {
                System.out.println(name + " clearing the roof");
            }
        });
    }

    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
