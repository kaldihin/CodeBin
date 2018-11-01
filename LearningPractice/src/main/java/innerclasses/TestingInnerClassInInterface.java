package innerclasses;

public interface TestingInnerClassInInterface {
    void showInt(int n);
    void showString(String s);

    class InInterface implements TestingInnerClassInInterface{
        InInterface() {
            System.out.println("InInterface constructor");
        }

        @Override
        public void showInt(int n) {
            System.out.println("N = " + n);
        }

        @Override
        public void showString(String s) {
            System.out.println("S = " + s);
        }

        public static void meth(TestingInnerClassInInterface t) {
            t.showInt(4);
            t.showString("Plotter");
        }

        public static void main(String[] args) {
            InInterface i = new InInterface();
            i.meth(i);
        }
    }


}
