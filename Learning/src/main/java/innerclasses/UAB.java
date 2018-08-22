package innerclasses;

interface U {
    int Ufirst();
    boolean Usecond();
    String Uthird();
}

class A1 {
    public U u() {
        return new U() {
            @Override
            public int Ufirst() {
                return 0;
            }

            @Override
            public boolean Usecond() {
                return false;
            }

            @Override
            public String Uthird() {
                return null;
            }
        };
    }
}

class B1 {
    int i = 0;
    U[] um = new U[3];

    void ugetter(U ur) {
        um[i] = ur;
        i++;
    }

    void nuller(int it) {
        um[it] = null;
    }

    void shower() {
        for (int j = 0; j < 3; j++) {
            System.out.println(um[j]);
            System.out.println(um[j]);
            System.out.println(um[j]);
        }
    }
}

public class UAB {
    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new A1();
        A1 a3 = new A1();

        B1 b = new B1();
        b.ugetter(a1.u());
        b.ugetter(a2.u());
        b.ugetter(a3.u());

        b.nuller(1);

        b.shower();
    }
}
