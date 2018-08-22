package innerclasses;

public class InsiderClass {
    class InTheClass {
        InTheClass() {
            System.out.println("It's inside the InTheClass");
        }

        public void meth() {
            System.out.println("meth");
        }

        class InTheInClass {
            InTheInClass() {
                System.out.println("InTheInClass");
            }
        }
    }
    public static void main(String[] args) {
        InsiderClass is = new InsiderClass();
        InTheClass i = is.new InTheClass();
        InTheClass.InTheInClass ii = i.new InTheInClass();
        i.meth();
    }
}
