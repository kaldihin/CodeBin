package InterfaceUsers;
import Interfaces.*;

public class User{

    public static void main(String[] args) {

        RealUser r = new RealUser();
        r.first();
        System.out.println(r.second());
        System.out.println(r.third());

    }

}

class RealUser implements HeCan {

    @Override
    public void first() {
        System.out.println(1);
    }

    @Override
    public int second() {
        return 2;
    }

    @Override
    public String third() {
        return "3";
    }
}
